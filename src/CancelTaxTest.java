
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

public class CancelTaxTest {

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
      String client = properties.getProperty("avatax4j.client");
      profile.setClient(client);
      taxSvc.setProfile(profile);
      Security security = new Security();
      String account = properties.getProperty("avatax4j.account");
      security.setAccount(account);
      String license = properties.getProperty("avatax4j.license");
      security.setLicense(license);
      taxSvc.setSecurity(security);
/*Request*/
      CancelTaxRequest cancelTaxRequest = new CancelTaxRequest();
      /*Required Request Parameters*/
      cancelTaxRequest.setDocCode("INV001");
      cancelTaxRequest.setCompanyCode("APITrialCompany");
      cancelTaxRequest.setDocType(DocumentType.SalesInvoice);
      cancelTaxRequest.setCancelCode(CancelCode.DocVoided);
      /*Optional Request Parameters*/
//      cancelTaxRequest.setDocId("INV001-1");     
//
      CancelTaxResult cancelTaxResult = taxSvc.cancelTax(cancelTaxRequest);
      if (cancelTaxResult.getResultCode() == SeverityLevel.Success) {
        System.out.println("CancelTax cancelTaxResult: " + cancelTaxResult.getResultCode().toString());
        System.out.println("Document ID:  " + cancelTaxResult.getDocId().toString());

      } else {
        ArrayOfMessage messages = cancelTaxResult.getMessages();
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
