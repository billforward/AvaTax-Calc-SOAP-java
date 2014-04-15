
import com.avalara.avatax.services.tax.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;

public class PingTest {

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
      PingResult result = taxSvc.ping("");
      System.out.println("Ping result: " + result.getResultCode().toString());
      System.out.println("Ping version: " + result.getVersion());
    } catch (ServiceException | SOAPException | IOException ex) {
      System.out.println("Exception: " + ex.getMessage());
     }
    }
 /*Message Handling*/
  protected static void printMessages(ArrayOfMessage messages) {
    for (int ii = 0; ii < messages.size(); ii++) {
      Message message = messages.getMessage(ii);
      System.out.println(message.getSeverity().toString() + " " + ii + ": " + message.getSummary());
    }
  }
}
