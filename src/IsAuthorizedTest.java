
import com.avalara.avatax.services.tax.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;

public class IsAuthorizedTest {
  private static final String account = ("1234567890");
  private static final String url = "https://development.avalara.net";
  private static final String license = ("A1B2C3D4E5F6G7H8");
  private static final String profileName = ("AvaTaxSample");
    public static void main(String args[]) {
        try {
            TaxSvcSoap port = getTaxSvc();
            IsAuthorizedResult result;
            result = port.isAuthorized("Ping,IsAuthorized,GetTax,PostTax,CommitTax,CancelTax,ReconcileTaxHistory");
            System.out.println("IsAuthorized Operations:  " + result.getOperations().toString());
            System.out.println("Transaction ID:  " + result.getTransactionId().toString()); 
            
        } catch (ServiceException | SOAPException | IOException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
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
