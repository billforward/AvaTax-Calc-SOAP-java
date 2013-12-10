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
import java.io.IOException;
import junit.framework.Assert;

/**
 * Sample GetTaxHistory request.
 *
 * @author Timothy Longley, Sr. Developer Engineer Copyright (c) 2013, Avalara.
 * All rights reserved.
 */
public class GetTaxHistorySample {

  public static void main(String args[]) {

    try {
      TaxSvcSoap port = getTaxSvc();
      GetTaxHistoryRequest gtHReq = new GetTaxHistoryRequest();

// Set the tax document properties
      gtHReq.setDocCode("DOC0001");
      gtHReq.setCompanyCode("");
      gtHReq.setDocType(DocumentType.SalesInvoice);
      gtHReq.setDetailLevel(DetailLevel.Tax);

// Results
      GetTaxHistoryResult gtHRes = port.getTaxHistory(gtHReq);
      System.out.println("GetTaxHisotry Result: " + gtHRes.getResultCode().toString());
      if (gtHRes.getResultCode() == SeverityLevel.Success) {
        GetTaxRequest gtReq = gtHRes.getGetTaxRequest();
        GetTaxResult gtRes = gtHRes.getGetTaxResult();
        ArrayOfBaseAddress addr_list = gtReq.getAddresses();
        BaseAddress origin = addr_list.getBaseAddress(gtReq.getOriginCode());
        BaseAddress dest = addr_list.getBaseAddress(gtReq.getDestinationCode());
        System.out.println("Current Invoice Status For Invoice Number " + gtRes.getDocCode() + ": " + gtRes.getDocStatus().toString());
        System.out.println();
        System.out.println("Origin Address:");
        System.out.println(origin.getLine1());
        if (origin.getLine2().length() > 0) {
          System.out.println(origin.getLine2());
        }
        if (origin.getLine3().length() > 0) {
          System.out.println(origin.getLine3());
        }
        System.out.println(origin.getCity() + ", " + origin.getRegion() + " " + origin.getPostalCode());
        System.out.println();
        System.out.println("Destination Address:");
        System.out.println(dest.getLine1());
        if (dest.getLine2().length() > 0) {
          System.out.println(dest.getLine2());
        }
        if (dest.getLine3().length() > 0) {
          System.out.println(dest.getLine3());
        }
        System.out.println(dest.getCity() + ", " + dest.getRegion() + " " + dest.getPostalCode());
        System.out.println();
        System.out.println("Total Invoice  Amount: " + gtRes.getTotalAmount().toString());
        System.out.println("Total SalesTax Amount: " + gtRes.getTotalTax().toString());
        System.out.println("Reconciled: " + gtRes.isReconciled());
        System.out.println("Document Type: " + gtRes.getDocType().toString());
        System.out.println(" *** Line Info Follows: ***");
        for (int l = 0; l < gtReq.getLines().getLine().length; l++) {
          Line ln = gtReq.getLines().getLine(l);
          System.out.println("Line: " + ln.getNo()
                  + " Item Code: " + ln.getItemCode()
                  + " Description: " + ln.getDescription()
                  + " Amount: " + ln.getAmount()
                  + " Qty: " + ln.getQty());
        }
      } else {
        printMessages(gtHRes.getMessages());
      }
    } catch (ServiceException | SOAPException | IOException ex) {
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

    Assert.assertFalse("avatax4j.license property is not configured in security/avatax4j.properties", license == null || license.length() == 0);

    taxSvc = new TaxSvcLocator();

    port = taxSvc.getTaxSvcSoap(new URL(url));

// Set Client Profile
    Profile profile = new Profile();
    profile.setClient("SAMPLEGetTaxHistory,1.0.0.0");
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
