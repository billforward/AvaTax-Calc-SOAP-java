import com.avalara.avatax.services.tax.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
//import java.util.Date;
//import java.math.BigDecimal;
import junit.framework.Assert;

/**
 * This is a sample CancelTax using the AvaTax TaxSvc.
 *
 * @author Timothy Longley, Sr. Developer Engineer
 * Copyright (c) 2013, Avalara.  All rights reserved.
 */
public class CancelTaxSample
{
    public static void main(String args[])
    {
        try
        {
            TaxSvcSoap port = getTaxSvc();

                    CancelTaxRequest cancelTaxRequest = new CancelTaxRequest();

                    cancelTaxRequest.setCompanyCode("DEFAULT");                  // R: Company Code from the accounts Admin Console
                    cancelTaxRequest.setDocCode("MyDocCode12345");              // R: Invoice or document tracking number - Must be unique
                    cancelTaxRequest.setDocType(DocumentType.SalesInvoice);    // R: Typically SalesOrder,SalesInvoice, ReturnInvoice
                    cancelTaxRequest.setCancelCode(CancelCode.DocDeleted);    // R: Typically Unspecified, PostFailed, DocDeleted, 
                                                                             //      DocVoided or AdjustmentCancelled

                    CancelTaxResult cancelTaxResult = port.cancelTax(cancelTaxRequest);

                    System.out.println("CancelTax Result: " + cancelTaxResult.getResultCode().toString());
                }
  
        catch (ServiceException | SOAPException | IOException ex)
        {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    protected static TaxSvcSoap getTaxSvc() throws ServiceException, SOAPException, MalformedURLException, IOException
    {
        TaxSvc taxSvc;
        TaxSvcSoap port;

        Properties properties = new Properties();
        File file = new File("security/avatax4j.properties");
        try
        {
            properties.load(new FileInputStream(file));
        } catch (IOException e)
        {
            System.out.println("Unable to load avatax4j.properties");
            throw e;
        }

        String url = properties.getProperty("avatax4j.url");
        Assert.assertFalse("avatax4j.url property is not configured in avatax4j.properties", url == null || url.length() == 0);

        String account = properties.getProperty("avatax4j.account");
        Assert.assertFalse("avatax4j.account property is not configured in avatax4j.properties", account == null || account.length() == 0);

        String license = properties.getProperty("avatax4j.license");
        Assert.assertFalse("avatax4j.license property is not configured in avatax4j.properties", license == null || license.length() == 0);

        taxSvc = new TaxSvcLocator();

        port = taxSvc.getTaxSvcSoap(new URL(url));

        // Set the profile
        Profile profile = new Profile();
        profile.setClient("TaxSvcTest,4.0.0.0");
        port.setProfile(profile);

        // Set security
        Security security = new Security();
        security.setAccount(account);
        security.setLicense(license);
        port.setSecurity(security);

        return port;
    }

    protected static void printMessages(ArrayOfMessage messages)
    {
        for (int ii = 0; ii < messages.size(); ii++)
        {
            Message message = messages.getMessage(ii);
            System.out.println(message.getSeverity().toString() + " " + ii + ": " + message.getSummary());
        }

    }
}
