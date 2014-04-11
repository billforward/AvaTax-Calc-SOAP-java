
import com.avalara.avatax.services.tax.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.math.BigDecimal;
import java.io.IOException;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class GetTaxTest {

  private static final String account = ("1234567890");
  private static final String url = "https://development.avalara.net";
  private static final String license = ("A1B2C3D4E5F6G7H8");
  private static final String profileName = ("AvaTaxSample");

  public static void main(String args[]) {
    try {
      TaxSvcSoap taxSvc = getTaxSvc();
      GetTaxRequest getTaxRequest = new GetTaxRequest();
      Format formatter = new SimpleDateFormat("yyyy-MM-dd");
//
//Document Level Elements Required
      getTaxRequest.setCompanyCode("APITrialCompany");
      getTaxRequest.setDocType(DocumentType.SalesOrder);
      getTaxRequest.setDocCode("INV001");
      Date docDate = (Date) formatter.parseObject("2014-01-01");
      getTaxRequest.setDocDate(docDate);
      getTaxRequest.setCustomerCode("ABC4335");
      getTaxRequest.setDetailLevel(DetailLevel.Tax);
      getTaxRequest.setOriginCode("01");
      getTaxRequest.setDestinationCode("02");
////
////*Situational Request Document Parameters
////
//    getTaxRequest.setSalespersonCode("Bill Sales");
//    getTaxRequest.setCustomerUsageType("G");
//    getTaxRequest.setDiscount(new BigDecimal(50.00));
//    getTaxRequest.setPurchaseOrderNo("PO123456");
//    getTaxRequest.setExemptionNo("12345");
//    getTaxRequest.setReferenceCode("ref123456");
//    getTaxRequest.setLocationCode("01");
//    getTaxRequest.setCommit(false);
//    getTaxRequest.setCurrencyCode("USD");
//    getTaxRequest.setServiceMode(ServiceMode.Automatic);
//    getTaxRequest.setExchangeRate(new BigDecimal(9.00));
//    Date ExchangeRateEffDate = (Date) formatter.parseObject("2013-01-01");
//    getTaxRequest.setExchangeRateEffDate(ExchangeRateEffDate);
//    getTaxRequest.setPosLaneCode("09");
//    getTaxRequest.setBusinessIdentificationNo("234243");
//
////*TaxOverride at the Document Level
////*     Note: TaxOverride can exist at the 
////*     Document Level OR Line Level
////*     Never both at the same time.
//    
//    TaxOverride taxOverride = new TaxOverride();
//    taxOverride.setReason("Adjustment for return");
//    taxOverride.setTaxOverrideType(TaxOverrideType.TaxDate);
//    taxOverride.setTaxAmount(new BigDecimal(0.00));
//    Date taxOverrideDate = (Date) formatter.parseObject("2013-07-01");
//    taxOverride.setTaxDate(taxOverrideDate);
//    getTaxRequest.setTaxOverride(taxOverride);
////*END TaxOverride at the Document Level
// Address Data
      ArrayOfBaseAddress addresses = new ArrayOfBaseAddress(3);
//Address 01
      BaseAddress origin = new BaseAddress();
      origin.setAddressCode("01");
      origin.setLine1("45 Fremont Street");
      origin.setLine2("");
      origin.setLine3("");
      origin.setCity("San Francisco");
      origin.setRegion("CA");
      origin.setPostalCode("94105");
      origin.setCountry("US");
      addresses.add(origin);
//Address 02
      BaseAddress destination = new BaseAddress();
      destination.setAddressCode("02");
      destination.setLine3("ATTN Accounts Payable");
      destination.setLine1("118 N Clark St");
      destination.setLine2("Suite 100");
      destination.setCity("Chicago");
      destination.setRegion("IL");
      destination.setPostalCode("60602");
      destination.setCountry("US");
      addresses.add(destination);
//Address 03
      BaseAddress third = new BaseAddress();
      third.setAddressCode("03");
      third.setLatitude("47.627935");
      third.setLongitude("-122.51702");
      addresses.add(third);
      getTaxRequest.setAddresses(addresses);
//
// Add invoice lines
//
      ArrayOfLine lines = new ArrayOfLine(3);
      Line line;
//Line 01    
      line = new Line();
      line.setNo("01");
      line.setItemCode("N543");
      line.setDescription("Red Size 7 Widget");
      line.setTaxCode("PC030147");
      line.setQty(new BigDecimal(1.00));
      line.setAmount(new BigDecimal(10.00));
      line.setTaxCode("NT");
//
//*Situational Request Document Parameters
//      line.setCustomerUsageType("L");
//      line.setExemptionNo("12345");
//      line.setDiscounted(true);
//      line.setTaxIncluded(true);
//      line.setRef1("123");
//      line.setRef2("456");
//
//*TaxOverride at the LINE Level
//*       Note: TaxOverride can exist at the 
//*     Document Level OR Line Level
//*     Never both at the same time.
//    
//    TaxOverride taxOverride = new TaxOverride();
//    taxOverride.setReason("Adjustment for return");
//    taxOverride.setTaxOverrideType(TaxOverrideType.TaxDate);
//    //TaxOverrided Date
//    Date taxOverrideDate = (Date) formatter.parseObject("2013-07-01");
//    taxOverride.setTaxDate(taxOverrideDate);
//    //END TaxOverrided Date
//    taxOverride.setTaxAmount(new BigDecimal(0.00));
//    getTaxRequest.setTaxOverride(taxOverride);
//
      lines.add(line);
//Line 02
      line = new Line();
      line.setNo("02");
      line.setOriginCode("01");
      line.setDestinationCode("03");
      line.setItemCode("T345");
      line.setDescription("Size 10 Green Running Shoe");
      line.setQty(new BigDecimal(3.00));
      line.setAmount(new BigDecimal(150.00));
      line.setTaxCode("PC030147");
      lines.add(line);
//Line 03
      line = new Line();
      line.setOriginCode("01");
      line.setDestinationCode("03");
      line.setNo("03");
      line.setItemCode("FREIGHT");
      line.setDescription("Shipping Charge");
      line.setQty(new BigDecimal(1.00));
      line.setAmount(new BigDecimal(15.00));
      line.setTaxCode("FR");
      lines.add(line);
//
      getTaxRequest.setLines(lines);
//
//Document Level Results
      GetTaxResult getTaxResult = taxSvc.getTax(getTaxRequest);
      System.out.println("GetTax Result: " + getTaxResult.getResultCode().toString());
      if (getTaxResult.getResultCode() == SeverityLevel.Success) {
        System.out.println("DocCode: " + getTaxRequest.getDocCode());
        System.out.println("Total Amount: " + getTaxResult.getTotalAmount().toString());
        System.out.println("Total Tax Calculated Amount: " + getTaxResult.getTotalTaxCalculated().toString());
        System.out.println("TotalTax: " + getTaxResult.getTotalTax().toString());
        for (int i = 0; i < getTaxResult.getTaxLines().getTaxLine().length; i++) {
//
//Line Level Results
          TaxLine currentTaxLine = getTaxResult.getTaxLines().getTaxLine(i);
          System.out.println("         Line: " + currentTaxLine.getNo()
              + " Tax: " + currentTaxLine.getTax()
              + " TaxCode: " + currentTaxLine.getTaxCode());
//
//Line Level Detail Results
          for (int j = 0; j < currentTaxLine.getTaxDetails().getTaxDetail().length; j++) {
            TaxDetail currentTaxDetail = currentTaxLine.getTaxDetails().getTaxDetail(j);

            System.out.println("          Juris Type: " + currentTaxDetail.getJurisType()
                + " | Juris Name: " + currentTaxDetail.getJurisName()
                + " | Juris Code: " + currentTaxDetail.getJurisCode()
                + " | Rate Type: " + currentTaxDetail.getRateType()
                + " | Region: " + currentTaxDetail.getRegion()
                + " | State Assigned #: " + currentTaxDetail.getStateAssignedNo()
                + " | Tax Group: " + currentTaxDetail.getTaxGroup()
                + " | TaxName: " + currentTaxDetail.getTaxName()
                + " | Line Rate: " + currentTaxDetail.getRate()
                + " | Line Amount: " + currentTaxDetail.getTax());
          }
          System.out.print("\n");
        }
      } else {
        printMessages(getTaxResult.getMessages());
      }
    } catch (ServiceException | SOAPException | IOException | ParseException ex) {
      System.out.println("Exception: " + ex.getMessage());
    }
  }

  //Message Handling
  protected static TaxSvcSoap getTaxSvc() throws ServiceException, SOAPException, MalformedURLException, IOException {
    TaxSvc taxSvc;
    TaxSvcSoap taxSvc;
    taxSvc = new TaxSvcLocator();
    taxSvc = taxSvc.getTaxSvcSoap(new URL(url));
// Set Client Profile
    Profile profile = new Profile();
    profile.setClient(profileName);
    taxSvc.setProfile(profile);
// Set security
    Security security = new Security();
    security.setAccount(account);
    security.setLicense(license);
    taxSvc.setSecurity(security);
    return taxSvc;
  }

  protected static void printMessages(ArrayOfMessage messages) {
    for (int ii = 0; ii < messages.size(); ii++) {
      Message message = messages.getMessage(ii);
      System.out.println(message.getSeverity().toString() + " " + ii + ": " + message.getSummary());
    }

  }
}
