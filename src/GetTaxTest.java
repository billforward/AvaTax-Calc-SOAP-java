
import com.avalara.avatax.services.tax.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.URL;
import java.util.Date;
import java.math.BigDecimal;
import java.io.IOException;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class GetTaxTest {

  public static void main(String args[]) {
    try {
      TaxSvcLocator taxSvc = new TaxSvcLocator();
      String url = "https://development.avalara.net";
      TaxSvcSoap soapSvc = taxSvc.getTaxSvcSoap(new URL(url));
      Profile profile = new Profile();
      profile.setClient("AvaTaxSample");
      soapSvc.setProfile(profile);
      Security security = new Security();
      security.setAccount("1234567890");
      security.setLicense("A1B2C3D4E5F6G7H8");
      soapSvc.setSecurity(security);
//
      GetTaxRequest request = new GetTaxRequest();
      Format formatter = new SimpleDateFormat("yyyy-MM-dd");
//
/*Document Level Elements Required*/
      request.setCompanyCode("APITrialCompany");
      request.setDocType(DocumentType.SalesInvoice);
      request.setDocCode("INV001");
      Date docDate = (Date) formatter.parseObject("2014-01-01");
      request.setDocDate(docDate);
      request.setCustomerCode("ABC4335");
      request.setDetailLevel(DetailLevel.Tax);
      request.setOriginCode("01");
      request.setDestinationCode("02");
//
/*Situational Request Document Parameters*/
//    request.setSalespersonCode("Bill Sales");
//    request.setCustomerUsageType("G");
//    request.setDiscount(new BigDecimal(50.00));
//    request.setPurchaseOrderNo("PO123456");
//    request.setExemptionNo("12345");
//    request.setReferenceCode("ref123456");
//    request.setLocationCode("01");
//    request.setCommit(true);
//    request.setCurrencyCode("USD");
//    request.setServiceMode(ServiceMode.Automatic);
//    request.setExchangeRate(new BigDecimal(9.00));
//    Date ExchangeRateEffDate = (Date) formatter.parseObject("2013-01-01");
//    request.setExchangeRateEffDate(ExchangeRateEffDate);
//    request.setPosLaneCode("09");
//    request.setBusinessIdentificationNo("234243");
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
//    request.setTaxOverride(taxOverride);
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
      request.setAddresses(addresses);
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
//    request.setTaxOverride(taxOverride);
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
      request.setLines(lines);
//
/*Document Level Results*/
      GetTaxResult result = soapSvc.getTax(request);
      System.out.println("GetTax Result: " + result.getResultCode().toString());
      if (result.getResultCode() == SeverityLevel.Success) {
        System.out.println("DocCode: " + request.getDocCode());
        System.out.println("Total Amount: " + result.getTotalAmount().toString());
        System.out.println("Total Tax Calculated Amount: " + result.getTotalTaxCalculated().toString());
        System.out.println("TotalTax: " + result.getTotalTax().toString());
        for (int i = 0; i < result.getTaxLines().getTaxLine().length; i++) {
//
/*Line Level Results*/
          TaxLine currentTaxLine = result.getTaxLines().getTaxLine(i);
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
        ArrayOfMessage messages = result.getMessages();
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
