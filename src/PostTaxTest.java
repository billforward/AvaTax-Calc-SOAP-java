
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

public class PostTaxTest {
  
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
  public static void main(String args[]) throws ParseException {

    try {
      TaxSvcSoap taxSvc = getTaxSvc();
      PostTaxRequest postTaxRequest = new PostTaxRequest();
      Format formatter = new SimpleDateFormat("yyyy-MM-dd");
/*Required Request Parameters*/
      postTaxRequest.setDocCode("INV001");
      postTaxRequest.setCompanyCode("");
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
