
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
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GetTaxHistoryTest {

  public static void main(String args[]) throws IOException, ParseException, SOAPException {
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
      GetTaxHistoryRequest getTaxHistoryRequest = new GetTaxHistoryRequest();
      /*Document Level Elements Required*/
      getTaxHistoryRequest.setDocCode("INV001");
      getTaxHistoryRequest.setCompanyCode("APITrialCompany");
      getTaxHistoryRequest.setDocType(DocumentType.SalesInvoice);
      getTaxHistoryRequest.setDetailLevel(DetailLevel.Tax);
      /*Document Level Results*/
      GetTaxHistoryResult getTaxHistoryResult = taxSvc.getTaxHistory(getTaxHistoryRequest);
      System.out.println("GetTaxHisotry Result: " + getTaxHistoryResult.getResultCode().toString());
      if (getTaxHistoryResult.getResultCode() == SeverityLevel.Success) {
        GetTaxRequest getTaxRequest = getTaxHistoryResult.getGetTaxRequest();
        GetTaxResult getTaxResults = getTaxHistoryResult.getGetTaxResult();
        ArrayOfBaseAddress addr_list = getTaxRequest.getAddresses();
        BaseAddress origin = addr_list.getBaseAddress(getTaxRequest.getOriginCode());
        BaseAddress dest = addr_list.getBaseAddress(getTaxRequest.getDestinationCode());
        System.out.println("Document Status for Invoice "
            + getTaxResults.getDocCode()
            + ": " + getTaxResults.getDocStatus().toString());
        System.out.println();
        System.out.println("Origin Address:");
        System.out.println(origin.getLine1());
        if (origin.getLine2().length() > 0) {
          System.out.println(origin.getLine2());
        }
        if (origin.getLine3().length() > 0) {
          System.out.println(origin.getLine3());
        }
        System.out.println(origin.getCity() + ", " + origin.getRegion() + " " + origin.getPostalCode());
        System.out.println();
        System.out.println("Destination Address:");
        System.out.println(dest.getLine1());
        if (dest.getLine2().length() > 0) {
          System.out.println(dest.getLine2());
        }
        if (dest.getLine3().length() > 0) {
          System.out.println(dest.getLine3());
        }
        System.out.println(dest.getCity() + ", " + dest.getRegion() + " " + dest.getPostalCode());
        System.out.println();
        System.out.println("Total Invoice  Amount: " + getTaxResults.getTotalAmount().toString());
        System.out.println("Total SalesTax Amount: " + getTaxResults.getTotalTax().toString());
        System.out.println("Document Type: " + getTaxResults.getDocType().toString());
        /*Line Level Results*/
        System.out.println(" *** Line Info Follows: ***");
        for (int l = 0; l < getTaxRequest.getLines().getLine().length; l++) {
          Line line = getTaxRequest.getLines().getLine(l);
          System.out.println("Line: " + line.getNo()
              + " Item Code: " + line.getItemCode()
              + " Description: " + line.getDescription()
              + " Amount: " + line.getAmount()
              + " Qty: " + line.getQty());

          System.out.print("\n");
        }
      } else {
        ArrayOfMessage messages = getTaxHistoryResult.getMessages();
        for (int ii = 0; ii < messages.size(); ii++) {
          Message message = messages.getMessage(ii);
          System.out.println(message.getSeverity().toString() + " " + ii + ": " + message.getSummary());
        }
      }
    } catch (ServiceException ex) {
      Logger.getLogger(GetTaxHistoryTest.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
