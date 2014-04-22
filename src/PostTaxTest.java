
import com.avalara.avatax.services.tax.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.URL;
import java.util.Date;
import java.math.BigDecimal;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.net.MalformedURLException;
import java.rmi.RemoteException;

public class PostTaxTest {

  public static void main(String args[]) throws ParseException {
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

      PostTaxRequest postTaxRequest = new PostTaxRequest();
      Format formatter = new SimpleDateFormat("yyyy-MM-dd");
/*Required Request Parameters*/
      postTaxRequest.setDocCode("INV001");
      postTaxRequest.setCompanyCode("APITrialCompany");
      postTaxRequest.setDocType(DocumentType.SalesInvoice);
      Date docDate = (Date) formatter.parseObject("2014-01-01");
      postTaxRequest.setDocDate(docDate);
      postTaxRequest.setTotalAmount(new BigDecimal("175.00"));
      postTaxRequest.setTotalTax(new BigDecimal("14.27"));
      postTaxRequest.setCommit(false);
//
      PostTaxResult postTaxResult =  taxSvc.postTax(postTaxRequest);
      if (postTaxResult.getResultCode() == SeverityLevel.Success) {
        System.out.println("PostTax postTaxResult: " + postTaxResult.getResultCode().toString());

      } else {
        ArrayOfMessage messages = postTaxResult.getMessages();
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
