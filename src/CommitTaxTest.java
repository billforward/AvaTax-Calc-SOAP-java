
import com.avalara.avatax.services.tax.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.ParseException;

public class CommitTaxTest {

  public static void main(String args[]) throws ParseException {
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
      CommitTaxRequest request = new CommitTaxRequest();
/*Required Request Parameters*/
      request.setDocCode("INV001");
      request.setDocType(DocumentType.SalesInvoice);
      request.setCompanyCode("APITrialCompany");
/*Optional*/
//      commitTaxRequest.setNewDocCode("INV001-1");
//
      CommitTaxResult result = soapSvc.commitTax(request);
      if (result.getResultCode() == SeverityLevel.Success) {
        System.out.println("CommitTax Result: " + result.getResultCode().toString());
        System.out.println("DocID: " + result.getDocId().toString());

      } else {
        ArrayOfMessage messages = result.getMessages();
        for (int ii = 0; ii < messages.size(); ii++) {
          Message message = messages.getMessage(ii);
          System.out.println(message.getSeverity().toString() + " " + ii + ": " + message.getSummary());
        }
      }
    } catch (MalformedURLException | ServiceException | SOAPException | RemoteException ex) {
      System.out.println("Exception: " + ex.getMessage());
    }
  }
}
