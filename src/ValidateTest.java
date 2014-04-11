
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import com.avalara.avatax.services.address.*;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;

public class ValidateTest {

  private static final String account = ("1234567890");
  private static final String url = "https://development.avalara.net";
  private static final String license = ("A1B2C3D4E5F6G7H8");
  private static final String profileName = ("AvaTaxSample");

  public static void main(String args[]) {

    try {
      AddressSvcSoap taxSvc = getAddressSvc();
      ValidateRequest request = new ValidateRequest();
      Address address = new Address();
      address.setLine1("118 N Clark St");
      address.setLine2("Suite 100");
      address.setLine3("ATTN Accounts Payable");
      address.setCity("Chicago");
      address.setRegion("IL");
      address.setPostalCode("");
      request.setAddress(address);
      request.setTextCase(TextCase.Default);
      request.setCoordinates(true);
//
      ValidateResult result;
      result = taxSvc.validate(request);
//
      System.out.println("Validate Result: " + result.getResultCode().toString());
      if (result.getResultCode() != SeverityLevel.Success) {
        printMessages(result.getMessages());
      } else {
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
      }
    } catch (IOException | ServiceException | SOAPException ex) {
      System.out.println("Exception: " + ex.getMessage());
    }
  }

  protected static AddressSvcSoap getAddressSvc() throws ServiceException, SOAPException, MalformedURLException, IOException {
    AddressSvc addressSvc;
    AddressSvcSoap taxSvc;
    addressSvc = new AddressSvcLocator();
    taxSvc = addressSvc.getAddressSvcSoap(new URL(url));
    // Set the profile
    Profile profile = new Profile();
    profile.setClient(profileName);
    taxSvc.setProfile(profile);
    // Set security
    Security security = new Security();
    security.setAccount(account);
    security.setLicense(license);
    taxSvc.setSecurity(security);
    return taxSvc;
  }

  protected static void printMessages(ArrayOfMessage messages) {
    for (int ii = 0; ii < messages.size(); ii++) {
      Message message = messages.getMessage(ii);
      System.out.println(message.getSeverity().toString() + " " + ii + ": " + message.getSummary());
    }
  }
}
