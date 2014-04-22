
import com.avalara.avatax.services.tax.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

public class PingTest {

  public static void main(String args[]) {

    try {
      TaxSvcLocator  taxSvcLocator  = new TaxSvcLocator();
      String url = "https://development.avalara.net";
      TaxSvcSoap  taxSvc =  taxSvcLocator .getTaxSvcSoap(new URL(url));
      Profile profile = new Profile();
      profile.setClient("AvaTaxSample");
       taxSvc.setProfile(profile);
      Security security = new Security();
      security.setAccount("1234567890");
      security.setLicense("A1B2C3D4E5F6G7H8");
       taxSvc.setSecurity(security);

       PingResult pingResult = taxSvc.ping("");
      if (pingResult.getResultCode() == SeverityLevel.Success) {
        System.out.println("Ping result: " + pingResult.getResultCode().toString());
        System.out.println("Ping version: " + pingResult.getVersion());
      
         } else {
        ArrayOfMessage messages = pingResult.getMessages();
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