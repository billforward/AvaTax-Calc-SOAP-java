
import com.avalara.avatax.services.tax.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;

public class GetTaxHistoryTest {

  private static final String account = ("1234567890");
  private static final String url = "https://development.avalara.net";
  private static final String license = ("A1B2C3D4E5F6G7H8");
  private static final String profileName = ("AvaTaxSample");

  public static void main(String args[]) {

    try {
      TaxSvcSoap port = getTaxSvc();
      GetTaxHistoryRequest gtHReq = new GetTaxHistoryRequest();
//
// Set the tax document properties
      gtHReq.setDocCode("INV001");
      gtHReq.setCompanyCode("APITrialCompany");
      gtHReq.setDocType(DocumentType.SalesInvoice);
      gtHReq.setDetailLevel(DetailLevel.Tax);
//
// Results
      GetTaxHistoryResult getTaxHistoryResults = port.getTaxHistory(gtHReq);
      System.out.println("GetTaxHisotry Result: " + getTaxHistoryResults.getResultCode().toString());
      if (getTaxHistoryResults.getResultCode() == SeverityLevel.Success) {
        GetTaxRequest gtReq = getTaxHistoryResults.getGetTaxRequest();
        GetTaxResult getTaxResults = getTaxHistoryResults.getGetTaxResult();
        ArrayOfBaseAddress addr_list = gtReq.getAddresses();
        BaseAddress origin = addr_list.getBaseAddress(gtReq.getOriginCode());
        BaseAddress dest = addr_list.getBaseAddress(gtReq.getDestinationCode());
        System.out.println("Current Invoice Status For Invoice Number " + getTaxResults.getDocCode() + ": " + getTaxResults.getDocStatus().toString());
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
        System.out.println("Total Invoice  Amount: " + getTaxResults.getTotalAmount().toString());
        System.out.println("Total SalesTax Amount: " + getTaxResults.getTotalTax().toString());
        System.out.println("Document Type: " + getTaxResults.getDocType().toString());
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
        printMessages(getTaxHistoryResults.getMessages());
      }
    } catch (ServiceException | SOAPException | IOException ex) {
      System.out.println("Exception: " + ex.getMessage());
    }
  }
//
//Message Handling
//

  protected static TaxSvcSoap getTaxSvc() throws ServiceException, SOAPException, MalformedURLException, IOException {
    TaxSvc taxSvc;
    TaxSvcSoap port;
    taxSvc = new TaxSvcLocator();
    port = taxSvc.getTaxSvcSoap(new URL(url));
// Set Client Profile
    Profile profile = new Profile();
    profile.setClient(profileName);
    port.setProfile(profile);
// Set security
    Security security = new Security();
    security.setAccount(account);
    security.setLicense(license);
    port.setSecurity(security);
    return port;
  }

  protected static void printMessages(ArrayOfMessage messages) {
    for (int ii = 0; ii < messages.size(); ii++) {
      Message message = messages.getMessage(ii);
      System.out.println(message.getSeverity().toString() + " " + ii + ": " + message.getSummary());
    }

  }
}
