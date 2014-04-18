
import com.avalara.avatax.services.tax.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.URL;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetTaxHistoryTest {

  public static void main(String args[]) throws MalformedURLException, SOAPException, RemoteException {
    try {
      TaxSvcLocator taxSvc = new TaxSvcLocator();
      String url = "https://development.avalara.net";
      TaxSvcSoap soapSvc = taxSvc.getTaxSvcSoap(new URL(url));
      Profile profile = new Profile();
      profile.setClient("AvaTaxSample");
      soapSvc.setProfile(profile);
      Security security = new Security();
      security.setAccount("1234567890");
      security.setLicense("A1B2C3D4E5F6G7H8");
      soapSvc.setSecurity(security);
//     
      GetTaxHistoryRequest request = new GetTaxHistoryRequest();
/*Document Level Elements Required*/
      request.setDocCode("INV001");
      request.setCompanyCode("APITrialCompany");
      request.setDocType(DocumentType.SalesInvoice);
      request.setDetailLevel(DetailLevel.Tax);
/*Document Level Results*/
      GetTaxHistoryResult result = soapSvc.getTaxHistory(request);
      System.out.println("GetTaxHisotry Result: " + result.getResultCode().toString());
      if (result.getResultCode() == SeverityLevel.Success) {
        GetTaxRequest getTaxRequest = result.getGetTaxRequest();
        GetTaxResult getTaxResults = result.getGetTaxResult();
        ArrayOfBaseAddress addr_list = getTaxRequest.getAddresses();
        BaseAddress origin = addr_list.getBaseAddress(getTaxRequest.getOriginCode());
        BaseAddress dest = addr_list.getBaseAddress(getTaxRequest.getDestinationCode());
        System.out.println("Document Status for Invoice "
            + getTaxResults.getDocCode()
            + ": " + getTaxResults.getDocStatus().toString());
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
/*Line Level Results*/
        System.out.println(" *** Line Info Follows: ***");
        for (int l = 0; l < getTaxRequest.getLines().getLine().length; l++) {
          Line line = getTaxRequest.getLines().getLine(l);
          System.out.println("Line: " + line.getNo()
              + " Item Code: " + line.getItemCode()
              + " Description: " + line.getDescription()
              + " Amount: " + line.getAmount()
              + " Qty: " + line.getQty());

          System.out.print("\n");
        }
      } else {
        ArrayOfMessage messages = result.getMessages();
        for (int ii = 0; ii < messages.size(); ii++) {
          Message message = messages.getMessage(ii);
          System.out.println(message.getSeverity().toString() + " " + ii + ": " + message.getSummary());
        }
      }
    } catch (ServiceException ex) {
      Logger.getLogger(GetTaxHistoryTest.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
