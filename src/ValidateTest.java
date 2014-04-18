
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import com.avalara.avatax.services.address.*;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.URL;
import java.net.MalformedURLException;
import java.rmi.RemoteException;

public class ValidateTest {

  public static void main(String args[]) {

    try {
      AddressSvcLocator AddressSvc = new AddressSvcLocator();
      String url = "https://development.avalara.net";
      AddressSvcSoap soapSvc = AddressSvc.getAddressSvcSoap(new URL(url));
      Profile profile = new Profile();
      profile.setClient("AvaTaxSample");
      soapSvc.setProfile(profile);
      Security security = new Security();
      security.setAccount("1234567890");
      security.setLicense("A1B2C3D4E5F6G7H8");
      soapSvc.setSecurity(security);

      ValidateRequest request = new ValidateRequest();
      Address address = new Address();
      address.setLine3("ATTN Accounts Payable");
      address.setLine1("118 N Clark St");
      address.setLine2("Suite 100");
      address.setCity("Chicago");
      address.setRegion("IL");
      address.setPostalCode("");
      request.setAddress(address);
      request.setTextCase(TextCase.Default);
      request.setCoordinates(true);
//
      ValidateResult result = soapSvc.validate(request);
      if (result.getResultCode() == SeverityLevel.Success) {
        System.out.println("Validate Result: " + result.getResultCode().toString());
        ValidAddress validAddress = result.getValidAddresses().getValidAddress(0);
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
