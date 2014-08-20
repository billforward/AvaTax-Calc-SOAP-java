
import com.avalara.avatax.services.address.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import java.util.Properties;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.URL;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ValidateTest {

  public static void main(String args[]) throws IOException {
    Properties properties = new Properties();
    File file = new File("avatax4j.properties");
    try {
      properties.load(new FileInputStream(file));
    } catch (IOException e) {
      System.out.println("Unable to locate avatax4j.properties");
      throw e;
    }
    try {
//      TaxSvcLocator taxSvcLocator = new TaxSvcLocator();
      AddressSvcLocator AddressSvc = new AddressSvcLocator();
      String url = properties.getProperty("avatax4j.url");
      AddressSvcSoap addressSvc = AddressSvc.getAddressSvcSoap(new URL(url));
      Profile profile = new Profile();
      String proFile = properties.getProperty("avatax4j.account");
      profile.setClient(proFile);
      addressSvc.setProfile(profile);
      Security security = new Security();
      String account = properties.getProperty("avatax4j.account");
      security.setAccount(account);
      String license = properties.getProperty("avatax4j.license");
      security.setLicense(license);
      addressSvc.setSecurity(security);
      /*Request*/

      ValidateRequest validateRequest = new ValidateRequest();
      Address address = new Address();
      address.setLine3("ATTN Accounts Payable");
      address.setLine1("118 N Clark St");
      address.setLine2("Suite 100");
      address.setCity("Chicago");
      address.setRegion("IL");
      address.setPostalCode("");
      validateRequest.setAddress(address);
      validateRequest.setTextCase(TextCase.Default);
      validateRequest.setCoordinates(true);
//
      ValidateResult validateResult = addressSvc.validate(validateRequest);
      if (validateResult.getResultCode() == SeverityLevel.Success) {
        System.out.println("Validate Result: " + validateResult.getResultCode().toString());
        ValidAddress validAddress = validateResult.getValidAddresses().getValidAddress(0);
        System.out.println("Line1: " + validAddress.getLine1());
        System.out.println("Line2: " + validAddress.getLine2());
        System.out.println("Line3: " + validAddress.getLine3());
        System.out.println("City: " + validAddress.getCity());
        System.out.println("County: " + validAddress.getCounty());
        System.out.println("State: " + validAddress.getRegion());
        System.out.println("PostalCode: " + validAddress.getPostalCode());
        System.out.println("LAT: " + validAddress.getLatitude());
        System.out.println("LON: " + validAddress.getLongitude());
      } else {
        ArrayOfMessage messages = validateResult.getMessages();
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
