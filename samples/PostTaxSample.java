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
import java.util.Date;
import java.math.BigDecimal;

import junit.framework.Assert;
//import org.apache.axis.EngineConfiguration;
//import org.apache.axis.configuration.FileProvider;

/**
 * This is a sample PostTax using the AvaTax TaxSvc.
 *
 * @author Tim Longley, Sr. SDK Support Engineer
 * Copyright (c) 2012, Avalara.  All rights reserved.
 */
public class PostTaxSample
{
    public static void main(String args[])
    {
        try
        {
            TaxSvcSoap port = getTaxSvc();


            PostTaxRequest postTaxRequest = new PostTaxRequest();
            postTaxRequest.setDocCode("MyDocCode12345");                 // R: Invoice or document tracking number - Must be unique
            postTaxRequest.setCompanyCode("DEFAULT");                   // R: Company Code from the accounts Admin Console
            postTaxRequest.setDocType(DocumentType.SalesInvoice);      // R: Typically SalesInvoice, ReturnInvoice
            Date docDate = new Date();
            postTaxRequest.setDocDate(docDate);                       // R:  sets DocDate to current date / time.
            postTaxRequest.setTotalAmount(new BigDecimal("10.00"));  // O:  TotalAmount shown on the document you are Posting
            postTaxRequest.setTotalTax(new BigDecimal("0.86"));     // O:  TotalTax shown on the document you are Posting
            
            // NOTE: A document can be committed from a GetTax Request or a PostTax request. 
            //       It is not necessary to call PostTax and CommitTax unless you business needs require it.
            //       To Commit the document during the PostTax call, Set Commit = true
            
            postTaxRequest.setCommit(false);                   // O: Default is "false" - Set to "true" to commit the Document
            
            
            
            PostTaxResult postTaxResult = port.postTax(postTaxRequest);
            System.out.println("PostTax Result: " + postTaxResult.getResultCode().toString());
            if (postTaxResult.getResultCode() != SeverityLevel.Success)
            {
                printMessages(postTaxResult.getMessages());
//                return;
            }
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
