
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
      TaxSvcLocator taxSvcLocator = new TaxSvcLocator();
      String url = "https://development.avalara.net";
      TaxSvcSoap taxSvc = taxSvcLocator.getTaxSvcSoap(new URL(url));
      Profile profile = new Profile();
      profile.setClient("AvaTaxSample");
      taxSvc.setProfile(profile);
      Security security = new Security();
      security.setAccount("1234567890");
      security.setLicense("A1B2C3D4E5F6G7H8");
      taxSvc.setSecurity(security);
//
      CommitTaxRequest request = new CommitTaxRequest();
      /*Required Request Parameters*/
      request.setDocCode("INV001");
      request.setDocType(DocumentType.SalesInvoice);
      request.setCompanyCode("APITrialCompany");
      /*Optional*/
//      commitTaxRequest.setNewDocCode("INV001-1");
//
      CommitTaxResult commitTaxResult = taxSvc.commitTax(request);
      if (commitTaxResult.getResultCode() == SeverityLevel.Success) {
        System.out.println("CommitTax commitTaxResult: " + commitTaxResult.getResultCode().toString());
        System.out.println("DocID: " + commitTaxResult.getDocId().toString());

      } else {
        ArrayOfMessage messages = commitTaxResult.getMessages();
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
