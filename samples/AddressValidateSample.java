import com.avalara.avatax.services.address.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;
import junit.framework.Assert;

/**
 * This is a sample address validation using the AvaTax AddressSvc.
 * Latitude and Longitude is returned with this sample.
 * 
 * @author Timothy Longley, Sr. Developer Engineer
 * Copyright (c) 2013, Avalara.  All rights reserved.
 */
public class AddressValidateSample
{
    public static void main(String args[])
    {
        try
        {
            AddressSvcSoap port = getAddressSvc();

            ValidateRequest request = new ValidateRequest();
            Address address = new Address();
            
//Address Section
// Returns Success with Normalized Address or
// Error or Exception with ArrayOfMessages
// See http://developer.avalara.com/api-docs/best-practices/address-validation for more information
            
            address.setLine1("900 Winslow Way");         //R: Street Address 
            address.setLine2("Suite 130");              //O: Additional Address data
            address.setLine3("");                      //O: Additional Address data 
            address.setCity("Bainbridge Is");         //R: City 
            address.setRegion("WA");                 //R: State or Region 
            address.setPostalCode("98110");    //R: Postal Code
            request.setAddress(address);
            request.setTextCase(TextCase.Default); //O: Street Address 
            request.setCoordinates(true);         //O: Set to true if Latitude & Longitude is a desired result

            ValidateResult result;
            result = port.validate(request);

            System.out.println("Validate Result: " + result.getResultCode().toString());

            if (result.getResultCode() != SeverityLevel.Success)
            {
                printMessages(result.getMessages());
            }
            else
            {
                ValidAddress validAddress = result.getValidAddresses().getValidAddress(0);
                System.out.println("Line1: " + validAddress.getLine1());
                System.out.println("Line2: " + validAddress.getLine2());
                System.out.println("Line3: " + validAddress.getLine3());
                System.out.println("City: " + validAddress.getCity());
                System.out.println("County: " + validAddress.getCounty());
                System.out.println("State: " + validAddress.getRegion());
                System.out.println("PostalCode: " + validAddress.getPostalCode());
                System.out.println("Latitude:  " + validAddress.getLatitude());       // O: Returns Latitude 
                System.out.println("Longitude:  " + validAddress.getLongitude());    // O: Returns Longitude Coordinates
                                                                                    // Note: setCoordinates must be set to true
            }
        }
        catch (Exception ex)
        {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    protected static AddressSvcSoap getAddressSvc() throws ServiceException, SOAPException, MalformedURLException, IOException
    {
        AddressSvc addressSvc;
        AddressSvcSoap port;

        Properties properties = new Properties();
        File file = new File("security/avatax4j.properties");  // R: set path to authorization credentials - i.e. URL, Account, LicenseKey
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

        addressSvc = new AddressSvcLocator();

        port = addressSvc.getAddressSvcSoap(new URL(url));

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
