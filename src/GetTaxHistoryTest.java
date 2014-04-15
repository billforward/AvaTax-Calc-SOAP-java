
import com.avalara.avatax.services.tax.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;

public class GetTaxHistoryTest {

  protected static TaxSvcSoap getTaxSvc() throws ServiceException, SOAPException, MalformedURLException, IOException {
    TaxSvc taxSvc;
    TaxSvcSoap soapSvc;
    taxSvc = new TaxSvcLocator();
    soapSvc = taxSvc.getTaxSvcSoap(new URL("https://development.avalara.net"));
    Security security = new Security();
    security.setAccount("1234567890");
    security.setLicense("A1B2C3D4E5F6G7H8");
    Profile profile = new Profile();
    profile.setClient("AvaTaxSample");
    soapSvc.setProfile(profile);
    soapSvc.setSecurity(security);
    return soapSvc;
  }
  public static void main(String args[]) {

    try {
      TaxSvcSoap taxSvc = getTaxSvc();
      GetTaxHistoryRequest getTaxHistoryRequest = new GetTaxHistoryRequest();
//
/*Set the tax document properties*/
      getTaxHistoryRequest.setDocCode("INV001");
      getTaxHistoryRequest.setCompanyCode("APITrialCompany");
      getTaxHistoryRequest.setDocType(DocumentType.SalesInvoice);
      getTaxHistoryRequest.setDetailLevel(DetailLevel.Tax);
//
/*Results*/
      GetTaxHistoryResult getTaxHistoryResults = taxSvc.getTaxHistory(getTaxHistoryRequest);
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
/* Message Handling*/
  protected static void printMessages(ArrayOfMessage messages) {
    for (int ii = 0; ii < messages.size(); ii++) {
      Message message = messages.getMessage(ii);
      System.out.println(message.getSeverity().toString() + " " + ii + ": " + message.getSummary());
    }

  }
}
