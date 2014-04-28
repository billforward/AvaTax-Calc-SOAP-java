
import com.avalara.avatax.services.tax.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.URL;
import java.text.ParseException;
import java.net.MalformedURLException;
import java.rmi.RemoteException;

public class CancelTaxTest {

  public static void main(String args[]) throws ParseException {
    try {
      TaxSvcLocator taxSvcLocator = new TaxSvcLocator();
      String url = "https://development.avalara.net";
      TaxSvcSoap taxSvc = taxSvcLocator.getTaxSvcSoap(new URL(url));
      Profile profile = new Profile();
      profile.setClient("AvaTaxSample");
      taxSvc.setProfile(profile);
      Security security = new Security();
      security.setAccount("1234567890");
      security.setLicense("A1B2C3D4E5F6G7H8");
      taxSvc.setSecurity(security);

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
