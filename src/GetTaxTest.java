
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
import java.util.Date;
import java.math.BigDecimal;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class GetTaxTest {

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
      GetTaxRequest getTaxRequest = new GetTaxRequest();
      Format formatter = new SimpleDateFormat("yyyy-MM-dd");
//
/*Document Level Elements Required*/
      getTaxRequest.setCompanyCode("APITrialCompany");
      getTaxRequest.setDocType(DocumentType.SalesInvoice);
      getTaxRequest.setDocCode("INV001");
      Date docDate = (Date) formatter.parseObject("2014-01-01");
      getTaxRequest.setDocDate(docDate);
      getTaxRequest.setCustomerCode("ABC4335");
      getTaxRequest.setDetailLevel(DetailLevel.Tax);
      getTaxRequest.setOriginCode("01");
      getTaxRequest.setDestinationCode("02");
//
/*Situational Request Document Parameters*/
//    getTaxRequest.setSalespersonCode("Bill Sales");
//    getTaxRequest.setCustomerUsageType("G");
//    getTaxRequest.setDiscount(new BigDecimal(50.00));
//    getTaxRequest.setPurchaseOrderNo("PO123456");
//    getTaxRequest.setExemptionNo("12345");
//    getTaxRequest.setReferenceCode("ref123456");
//    getTaxRequest.setLocationCode("01");
//    getTaxRequest.setCommit(true);
//    getTaxRequest.setCurrencyCode("USD");
//    getTaxRequest.setServiceMode(ServiceMode.Automatic);
//    getTaxRequest.setExchangeRate(new BigDecimal(9.00));
//    Date ExchangeRateEffDate = (Date) formatter.parseObject("2013-01-01");
//    getTaxRequest.setExchangeRateEffDate(ExchangeRateEffDate);
//    getTaxRequest.setPosLaneCode("09");
//    getTaxRequest.setBusinessIdentificationNo("234243");
//
/* TaxOverride at the Document Level
       Note: TaxOverride can exist at the 
       Document Level OR Line Level
       Never both at the same time.*/
//    
//    TaxOverride taxOverride = new TaxOverride();
//    taxOverride.setReason("Adjustment for return");
//    taxOverride.setTaxOverrideType(TaxOverrideType.TaxDate);
//    taxOverride.setTaxAmount(new BigDecimal(0.00));
//    Date taxOverrideDate = (Date) formatter.parseObject("2013-07-01");
//    taxOverride.setTaxDate(taxOverrideDate);
//    getTaxRequest.setTaxOverride(taxOverride);
/*END TaxOverride at the Document Level*/
//
/*Address Data*/
      ArrayOfBaseAddress addresses = new ArrayOfBaseAddress(3);
      /*Address 01*/
      BaseAddress address1 = new BaseAddress();
      address1.setAddressCode("01");
      address1.setLine1("45 Fremont Street");
      address1.setLine2("");
      address1.setLine3("");
      address1.setCity("San Francisco");
      address1.setRegion("CA");
      address1.setPostalCode("94105");
      address1.setCountry("US");
      addresses.add(address1);
      /*Address 02*/
      BaseAddress address2 = new BaseAddress();
      address2.setAddressCode("02");
      address2.setLine3("ATTN Accounts Payable");
      address2.setLine1("118 N Clark St");
      address2.setLine2("Suite 100");
      address2.setCity("Chicago");
      address2.setRegion("IL");
      address2.setPostalCode("60602");
      address2.setCountry("US");
      addresses.add(address2);
      /*Address 03*/
      BaseAddress address3 = new BaseAddress();
      address3.setAddressCode("03");
      address3.setLatitude("47.627935");
      address3.setLongitude("-122.51702");
      addresses.add(address3);
//Add addresses to addresses array
      getTaxRequest.setAddresses(addresses);
//
/*Add invoice lines*/
//
      ArrayOfLine lines = new ArrayOfLine(3);
      Line line;
      /*Line 01*/
      line = new Line();
      line.setNo("01");
      line.setItemCode("N543");
      line.setDescription("Red Size 7 Widget");
      line.setTaxCode("PC030147");
      line.setQty(new BigDecimal(1.00));
      line.setAmount(new BigDecimal(10.00));
      line.setTaxCode("NT");
//
/*Situational Request Document Parameters*/
//      line.setCustomerUsageType("L");
//      line.setExemptionNo("12345");
//      line.setDiscounted(true);
//      line.setTaxIncluded(true);
//      line.setRef1("123");
//      line.setRef2("456");
//
/*TaxOverride at the Document Level*/
      /*     Note: TaxOverride can exist at the */
      /*     Document Level OR Line Level*/
      /*     Never both at the same time.*/
//    
//    TaxOverride taxOverride = new TaxOverride();
//    taxOverride.setReason("Adjustment for return");
//    taxOverride.setTaxOverrideType(TaxOverrideType.TaxDate);
//    taxOverride.setTaxAmount(new BigDecimal(0.00));
//    Date taxOverrideDate = (Date) formatter.parseObject("2013-07-01");
//    taxOverride.setTaxDate(taxOverrideDate);
//    getTaxRequest.setTaxOverride(taxOverride);
/*END TaxOverride at the Document Level*/
//
      lines.add(line);
      /*Line 02*/
      line = new Line();
      line.setNo("02");
      line.setOriginCode("01");
      line.setDestinationCode("03");
      line.setItemCode("T345");
      line.setDescription("Size 10 Green Running Shoe");
      line.setQty(new BigDecimal(3.00));
      line.setAmount(new BigDecimal(150.00));
      line.setTaxCode("PC030147");
      lines.add(line);
      /*Line 03*/
      line = new Line();
      line.setOriginCode("01");
      line.setDestinationCode("03");
      line.setNo("03");
      line.setItemCode("FREIGHT");
      line.setDescription("Shipping Charge");
      line.setQty(new BigDecimal(1.00));
      line.setAmount(new BigDecimal(15.00));
      line.setTaxCode("FR");
      lines.add(line);
//
      getTaxRequest.setLines(lines);
//
/*Document Level Results*/
      GetTaxResult getTaxResult = taxSvc.getTax(getTaxRequest);
      System.out.println("GetTax Result: " + getTaxResult.getResultCode().toString());
      if (getTaxResult.getResultCode() == SeverityLevel.Success) {
        System.out.println("DocCode: " + getTaxRequest.getDocCode());
        System.out.println("Total Amount: " + getTaxResult.getTotalAmount().toString());
        System.out.println("Total Tax Calculated Amount: " + getTaxResult.getTotalTaxCalculated().toString());
        System.out.println("TotalTax: " + getTaxResult.getTotalTax().toString());
        for (int i = 0; i < getTaxResult.getTaxLines().getTaxLine().length; i++) {
//
/*Line Level Results*/
          TaxLine currentTaxLine = getTaxResult.getTaxLines().getTaxLine(i);
          System.out.println("         Line: " + currentTaxLine.getNo()
              + " Tax: " + currentTaxLine.getTax()
              + " TaxCode: " + currentTaxLine.getTaxCode());
//
/*Line Level Detail Results*/
          for (int j = 0; j < currentTaxLine.getTaxDetails().getTaxDetail().length; j++) {
            TaxDetail currentTaxDetail = currentTaxLine.getTaxDetails().getTaxDetail(j);

            System.out.println("          JurisType: " + currentTaxDetail.getJurisType()
                + " | Region: " + currentTaxDetail.getRegion()
                + " | Rate: " + currentTaxDetail.getRate()
                + " | Taxable: " + currentTaxDetail.getTaxable()
                + " | Amount: " + currentTaxDetail.getTax()
                + " | JuriName: " + currentTaxDetail.getJurisName()
                + " | JurisCode: " + currentTaxDetail.getJurisCode()
                + " | TaxName: " + currentTaxDetail.getTaxName());
          }
          System.out.print("\n");
        }
      } else {
        ArrayOfMessage messages = getTaxResult.getMessages();
        for (int ii = 0; ii < messages.size(); ii++) {
          Message message = messages.getMessage(ii);
          System.out.println(message.getSeverity().toString() + " " + ii + ": " + message.getSummary());
        }
      }
    } catch (ServiceException | SOAPException | IOException | ParseException ex) {
      System.out.println("Exception: " + ex.getMessage());
    }
  }
}
