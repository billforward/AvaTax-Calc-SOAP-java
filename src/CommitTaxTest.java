
import com.avalara.avatax.services.tax.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import java.util.Properties;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.URL;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.text.ParseException;

public class CommitTaxTest {

  public static void main(String args[]) throws IOException, ParseException {
    Properties properties = new Properties();
    File file = new File("avatax4j.properties");
    try {
      properties.load(new FileInputStream(file));
    } catch (IOException e) {
      System.out.println("Unable to locate avatax4j.properties");
      throw e;
    }
    try {
      TaxSvcLocator taxSvcLocator = new TaxSvcLocator();
      String url = properties.getProperty("avatax4j.url");
      TaxSvcSoap taxSvc = taxSvcLocator.getTaxSvcSoap(new URL(url));
      Profile profile = new Profile();
      String proFile = properties.getProperty("avatax4j.account");
      profile.setClient(proFile);
      taxSvc.setProfile(profile);
      Security security = new Security();
      String account = properties.getProperty("avatax4j.account");
      security.setAccount(account);
      String license = properties.getProperty("avatax4j.license");
      security.setLicense(license);
      taxSvc.setSecurity(security);
/*Request*/
      CommitTaxRequest request = new CommitTaxRequest();
      /*Required Request Parameters*/
      request.setDocCode("INV001");
      request.setDocType(DocumentType.SalesInvoice);
      request.setCompanyCode("APITrialCompany");
      /*Optional*/
//      commitTaxRequest.setNewDocCode("INV001-1");
//
      CommitTaxResult commitTaxResult = taxSvc.commitTax(request);
      if (commitTaxResult.getResultCode() == SeverityLevel.Success) {
        System.out.println("CommitTax commitTaxResult: " + commitTaxResult.getResultCode().toString());
        System.out.println("DocID: " + commitTaxResult.getDocId().toString());

      } else {
        ArrayOfMessage messages = commitTaxResult.getMessages();
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
