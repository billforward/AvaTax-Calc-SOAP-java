
import com.avalara.avatax.services.tax.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;
import java.util.Date;
import java.math.BigDecimal;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PostTaxTest {

  private static final String account = ("1234567890");
  private static final String url = "https://development.avalara.net";
  private static final String license = ("A1B2C3D4E5F6G7H8");
  private static final String profileName = ("AvaTaxSample");

  public static void main(String args[]) {
    try {
      TaxSvcSoap taxSvc = getTaxSvc();
      PostTaxRequest postTaxRequest = new PostTaxRequest();
      Format formatter = new SimpleDateFormat("yyyy-MM-dd");
//Required Request Parameters
      postTaxRequest.setDocCode("INV001");
      postTaxRequest.setCompanyCode("APITrialCompany");
      postTaxRequest.setDocType(DocumentType.SalesInvoice);
      Date docDate = (Date) formatter.parseObject("2014-01-01");
      postTaxRequest.setDocDate(docDate);
      postTaxRequest.setTotalAmount(new BigDecimal("175.00"));
      postTaxRequest.setTotalTax(new BigDecimal("14.27"));
      postTaxRequest.setCommit(false);
//
      PostTaxResult postTaxResult = taxSvc.postTax(postTaxRequest);
      System.out.println("PostTax Result: " + postTaxResult.getResultCode().toString());
      if (postTaxResult.getResultCode() != SeverityLevel.Success) {
        printMessages(postTaxResult.getMessages());
      }
    } catch (ServiceException | SOAPException | IOException ex) {
      System.out.println("Exception: " + ex.getMessage());
    } catch (ParseException ex) {
      Logger.getLogger(PostTaxTest.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

//Message Handling
  protected static TaxSvcSoap getTaxSvc() throws ServiceException, SOAPException, MalformedURLException, IOException {
    TaxSvc taxSvc;
    TaxSvcSoap taxSvc;
    taxSvc = new TaxSvcLocator();
    taxSvc = taxSvc.getTaxSvcSoap(new URL(url));
// Set Client Profile
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
