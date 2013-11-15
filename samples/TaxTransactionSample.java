import com.avalara.avatax.services.tax.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Date;
import java.math.BigDecimal;
import java.io.IOException;
import junit.framework.Assert;
/**
 * Sample GetTax call with DetailLevel="Tax". Results will be line item detail
 * exposing Juris Type & Name as well as 'line level' tax rate and tax amount.
 *
 * @author Timothy Longley, Sr. Developer Engineer
 * Copyright (c) 2013, Avalara.  All rights reserved.
 */
public class TaxTransactionSample {

    public static void main(String args[]) {

        try {
            TaxSvcSoap port = getTaxSvc();

            GetTaxRequest getTaxRequest = new GetTaxRequest();


//Document Level Setup  
//     R: indicates Required Element
//     O: Indicates Optional Element
//

            // Set the tax document properties - Required unless noted as Optional
            getTaxRequest.setCompanyCode("DEFAULT");                             // R: Company Code from the accounts Admin Console
            Date docDate = new Date();                                          // O:  sets Date to current date / time.
            getTaxRequest.setDocCode("TaxTxSample-" + docDate.toString());     // R: Invoice or document tracking number - Must be unique
            getTaxRequest.setDocType(DocumentType.SalesOrder);                // R: Typically SalesOrder,SalesInvoice, ReturnInvoice
            getTaxRequest.setDocDate(docDate);                               // O:  sets DocDate to current date / time.
            getTaxRequest.setExemptionNo("");                               // O: String   if not using ECMS which keys on customer code
            getTaxRequest.setCustomerCode("TaxSvcTest");                   // R: String - Customer Tracking number or Exemption Customer Code
            getTaxRequest.setSalespersonCode("");                         // O: String - for reporting purposes
            getTaxRequest.setOriginCode("Origin");                       // R: Value representing the Origin Address
            getTaxRequest.setDestinationCode("Dest");                   // R: Value representing the Destination Address
            getTaxRequest.setDetailLevel(DetailLevel.Tax);             // R: Chose Summary, Document, Line or Tax - varying levels of results detail 
            getTaxRequest.setBusinessIdentificationNo("123456");      // O: Enter VAT or Business Identification Number 
            getTaxRequest.setCommit(false);                          // O: Default is "false" - Set to "true" to commit the Document
            getTaxRequest.setLocationCode("MyLocation");            // O: String - for reporting purposes
                                                                   //      Store Location, Outlet Id, or Outlet code
                                                                  //       A number assigned by the State which identifies a Store location

//          Begin Address Section
//          Add the origin and destination addresses referred to by the
//          "setOriginCode" and "setDestinationCode" properties above.

            ArrayOfBaseAddress addresses = new ArrayOfBaseAddress(2);
            BaseAddress origin = new BaseAddress();
            origin.setAddressCode("Origin");
            origin.setLine1("Avalara");
            origin.setLine2("100 Ravine Lane NE");
            origin.setLine3("Suite 220");
            origin.setCity("Bainbridge Island");
            origin.setRegion("WA");
            origin.setPostalCode("98110");
            origin.setCountry("USA");
            addresses.add(origin);

            BaseAddress destination = new BaseAddress();
            destination.setAddressCode("Dest");
            destination.setLine1("7462 Kearny Street");
            destination.setCity("Commerce City");
            destination.setRegion("CO");
            destination.setPostalCode("80022");
            destination.setCountry("USA");
            addresses.add(destination);
//
// Alternate:  Lattitude / Longitude addressing
//         
//            ArrayOfBaseAddress addresses = new ArrayOfBaseAddress(2);
//            BaseAddress origin = new BaseAddress();
//            origin.setAddressCode("Origin");
//            origin.setLatitude("47.6253");
//            origin.setLongitude("-122.515114");
//            addresses.add(origin);
//
//            BaseAddress destination = new BaseAddress();
//            destination.setAddressCode("Destination");
//            destination.setLatitude("39.833597");
//            destination.setLongitude("-104.917220");
//            addresses.add(destination);

//          End Address Section

            getTaxRequest.setAddresses(addresses);

            // Add invoice lines
            ArrayOfLine lines = new ArrayOfLine(2);            // array of lines set to 2 - Item and Shipping
            
            Line line;                                        // define namespace "line" as Line
            line = new Line();                               // New instance of a line                                
            line.setNo("101");                              // R: string - line Number of invoice - must be unique.
            line.setItemCode("Item001");                   // R: string - SKU or short name of Item
            line.setQty(new BigDecimal(1));               // R: decimal - The number of items -- Qty of product sold. Does not function as a mulitplier for Amount
                                                         //               see http://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html regarding
                                                        //                the use of BigDecimal. BigDecimal class provides operations for arithmetic, scale
                                                       //                 manipulation, rounding, comparison, hashing, and format conversion
            line.setAmount(new BigDecimal(1000.00));  // R: decimal - the "NET" amount -- Amount should be the 'extended' or 'net' amount
            line.setCustomerUsageType("");           // O: string - AKA Entity Use Code - Typically A - L (G = Reseller)
            line.setDescription("ITEM1");           // O: string - Description or category of item sold.
            line.setTaxCode("");                   // O: string - Pass standard, custom or Pro-Tax code
                                                  //              Can be NULL to default to tangible personal property (P0000000)
            lines.add(line);                     // R: sets line items to line array

            //Line 2 - Shipping/Freight line - See property descriptions above
            line = new Line();                                    // New instance of a line
            line.setNo("102");                                   // R: string - SKU or short name of Item
            line.setItemCode("Shipping");                       // R: string - SKU or short name of Item
            line.setDescription("Shipping- Freight Charges");  // O: string - Description or category of item sold.
            line.setQty(new BigDecimal(1));                   // R: decimal - The number of items -- Qty of product sold. Does not function as a mulitplier for Amount
                                                             //               see http://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html regarding
                                                            //                the use of BigDecimal. BigDecimal class provides operations for arithmetic, scale
                                                           //                 manipulation, rounding, comparison, hashing, and format conversion
            line.setAmount(new BigDecimal(10.00));        // R: decimal - the "NET" amount -- Amount should be the 'extended' or 'net' amount
            line.setTaxCode("FR");                       // O: string - Pass standard, custom or Pro-Tax code FR020100
            lines.add(line);                            // R: sets line items to line array

            getTaxRequest.setLines(lines);            // Sets array of lines

// GetTax Results - parsed into readible text output. 
            GetTaxResult getTaxResult = port.getTax(getTaxRequest);

// Outputs Success or itterates through error message class.
            System.out.println("GetTax Result: " + getTaxResult.getResultCode().toString());
            
// Outputs results to console in pipe "|" delimited format for readability

            if (getTaxResult.getResultCode() == SeverityLevel.Success) {
                System.out.println("DocCode: " + getTaxRequest.getDocCode());                     
                System.out.println("Total Amount: " + getTaxResult.getTotalAmount().toString()); 
                System.out.println("Total Tax Calculated Amount: " + getTaxResult.getTotalTaxCalculated().toString()); 
                System.out.println("TotalTax: " + getTaxResult.getTotalTax().toString()); 
                for (int i = 0; i < getTaxResult.getTaxLines().getTaxLine().length; i++) {

//  Output Individual Line elements with each line instance; tax total and tax code used
                    TaxLine ctl = getTaxResult.getTaxLines().getTaxLine(i);
                    System.out.println("         Line: " + ctl.getNo()
                            + " Tax: " + ctl.getTax()
                            + " TaxCode: " + ctl.getTaxCode());

//Outputs line level detail 
                    for (int j = 0; j < ctl.getTaxDetails().getTaxDetail().length; j++) {
                        TaxDetail ctd = ctl.getTaxDetails().getTaxDetail(j);

                        System.out.println("          Juris Type: " + ctd.getJurisType()
                                + " | Juris Name: " + ctd.getJurisName()
                                + " | Juris Code: " + ctd.getJurisCode()
                                + " | Rate Type: " + ctd.getRateType()
                                + " | Region: " + ctd.getRegion()
                                + " | State Assigned #: " + ctd.getStateAssignedNo()
                                + " | Tax Group: " + ctd.getTaxGroup()
                                + " | TaxName: " + ctd.getTaxName()
                                + " | Line Rate: " + ctd.getRate()
                                + " | Line Amt: " + ctd.getTax());
                    }
                    System.out.print("\n");
                }
            } else {
                printMessages(getTaxResult.getMessages());
//                return;
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

 //Message Handling
    
    protected static TaxSvcSoap getTaxSvc() throws ServiceException, SOAPException, MalformedURLException, IOException {
        TaxSvc taxSvc;
        TaxSvcSoap port;
// Manages web service credentials ( URL, Account, License Key ) from security/avatax4j.properties class
        Properties properties = new Properties();
        File file = new File("security/avatax4j.properties");
        
// Authentication and Error handling.
        try {
            properties.load(new FileInputStream(file));
        } catch (IOException e) {
            System.out.println("Unable to load security/avatax4j.properties");
            throw e;
        }

        String url = properties.getProperty("avatax4j.url");
        Assert.assertFalse("avatax4j.url property is not configured in security/avatax4j.properties", url == null || url.length() == 0);

        String account = properties.getProperty("avatax4j.account");
        Assert.assertFalse("avatax4j.account property is not configured in security/avatax4j.properties", account == null || account.length() == 0);

        String license = properties.getProperty("avatax4j.license");
        ;
        Assert.assertFalse("avatax4j.license property is not configured in security/avatax4j.properties", license == null || license.length() == 0);

        taxSvc = new TaxSvcLocator();

        port = taxSvc.getTaxSvcSoap(new URL(url));

// Set Client Profile
        Profile profile = new Profile();                  //Sets instance of a client profile
        profile.setClient("TaxSvcSampleCode,1.0.0.0");   // Modify this property to match your integration
        port.setProfile(profile);

// Set security
        Security security = new Security();
        security.setAccount(account);
        security.setLicense(license);
        port.setSecurity(security);

        return port;
    }

// Output Messages - Success or Warning, Error, and Exception messages.
// NOTE:  Itterate through the entire message class to return valuable troubleshooting data
    protected static void printMessages(ArrayOfMessage messages) {
        for (int ii = 0; ii < messages.size(); ii++) {
            Message message = messages.getMessage(ii);
            System.out.println(message.getSeverity().toString() + " " + ii + ": " + message.getSummary());
        }

    }
}
