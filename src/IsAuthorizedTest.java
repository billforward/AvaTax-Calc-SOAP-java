
import com.avalara.avatax.services.tax.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.URL;
import java.net.MalformedURLException;
import java.rmi.RemoteException;

public class IsAuthorizedTest {

  public static void main(String args[]) {
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
      IsAuthorizedResult result = soapSvc.isAuthorized("Ping, IsAuthorized, GetTax, PostTax, CommitTax, CancelTax, ReconcileTaxHistory");
      if (result.getResultCode() == SeverityLevel.Success) {
        System.out.println("Operations:  " + result.getOperations().toString());
        System.out.println("Transaction ID:  " + result.getTransactionId().toString());

      } else {
        ArrayOfMessage messages = new ArrayOfMessage();
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
