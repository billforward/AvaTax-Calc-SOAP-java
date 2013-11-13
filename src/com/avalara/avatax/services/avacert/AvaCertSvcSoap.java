/**
 * AvaCertSvcSoap.java
 * Proxy interface for the Avalara AvaCert Web Service. Requires a
 * Web Service Deployment Descriptor (WSDD) configuration file at creation time named
 * (for example the sample file avatax4j.wsdd) in the same directory as the
 * project is running. The values in the file will be loaded as the default
 * configuration information.
 * <pre>
 * <b>Example:</b>
 * [Java]
 *  Properties properties = new java.util.Properties();
 *          File file = new File("avatax4j.properties");
 *          try
 *          {
 *              properties.load(new FileInputStream(file));
 *          } catch (IOException e)
 *          {
 *              System.out.println("Unable to load avatax4j.properties");
 *              throw e;
 *          }
 *          String url = properties.getProperty("avatax4j.url");
 *          Assert.assertFalse("avatax4j.url property is not configured in avatax4j.properties", url == null || url.length() == 0);
 *          String account = properties.getProperty("avatax4j.account");
 *          Assert.assertFalse("avatax4j.account property is not configured in avatax4j.properties", account == null || account.length() == 0);
 *          String license = properties.getProperty("avatax4j.license");
 *          Assert.assertFalse("avatax4j.license property is not configured in avatax4j.properties", license == null || license.length() == 0);
 *        <b>  AvaCertSvc avaCertSvc = new AvaCertSvcLocator();</b>
 *          AvaCertSvcSoap port = avaCertSvc.getAvaCertSvcSoap(new URL(url));
 * </pre>
 * @author  Nitin
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */

package com.avalara.avatax.services.avacert;
public interface AvaCertSvcSoap extends com.avalara.avatax.services.base.BaseSvcSoap  {

/**
 * Web Service Deployment Descriptor (WSDD) configuration file at creation time named
 * (for example the sample file avatax4j.wsdd) in the same directory as the
 * project is running. The values in the file will be loaded as the default
 * configuration information.<br>
 * <p><b>Note: This web service is only available to accounts that have enrolled in the AvaCert service.</b></p>
 * <p>
 * <pre>
 * <b>Example:</b>
 *
 * AvaCertSvc avaCertSvc = new AvaCertSvcLocator();
 * AvaCertSvcSoap port = avaCertSvc.getAvaCertSvcSoap(new URL(url));
 *
 * // Set the profile
 * Profile profile = new Profile();
 * profile.setClient("AvaCertSvcTest,5.8.0.0"); // Your application name,version
 * port.setProfile(profile);
 *
 * // Set security
 * Security security = new Security();
 * security.setAccount(account);
 * security.setLicense(license);
 * port.setSecurity(security);
 * </pre>
 * @author greggr
 * Copyright (c) 2005, Avalara.  All rights reserved.
 *

 */
 public AddCustomerResult addCustomer(AddCustomerRequest addCustomerRequest) throws java.rmi.RemoteException;
//public interface AvaCertSvcSoap extends com.avalara.avatax.services.base.BaseSvcSoap {
    /**
     * This method adds an exempt customer record to AvaCert.  This can also be done
     * within the initiateExemptCert method.  It should be used when you only wish to
     * add the customer and are not yet ready to request a certificate.  Use initiateExemptCert
     * if you wish to both add a customer and request an exempt certificate.
     *
     * <pre>
     * Customer customer = new Customer();
     * customer.setCompanyCode ("DEFAULT");
     * customer.setCustomerCode ("AVALARA");
     * customer.setCustomerName ("Avalara, Inc.");
     * customer.setAddress1("435 Ericksen Ave NE");
     * customer.setCity ("Bainbridge Island");
     * customer.setRegion ("WA");
     * customer.setPostalCode ("98110");
     * customer.setCountry ("US");
     * customer.setEmail("info@avalara.com");
     * customer.setPhone("206-826-4900");
     * customer.setFax("206-780-5011");
     * customer.setCustomerType("Bill_To");
     *
     * AddCustomerRequest addCustomerRequest = new AddCustomerRequest();
     * addCustomerRequest.setCustomer(customer);
     * 
     * AddCustomerResult addCustomerResult= port.addCustomer(addCustomerRequest);
     * </pre>
     *
     * @param addCustomerRequest Add customer request
     * @return  a {@link AddCustomerResult} object
     * @throws java.rmi.RemoteException
     */
   // public AddCustomerResult addCustomer(AddCustomerRequest addCustomerRequest) throws java.rmi.RemoteException;

    /**
     * This method initiates a request from AvaCert to the customer for an exemption certificate.
     * The request will be sent using the designated method (email, fax, post).
     * It creates or updates the included customer record in the process.
     *
     * <pre>
     * Customer customer = new Customer();
     * customer.setCompanyCode ("DEFAULT");
     * customer.setCustomerCode ("AVALARA");
     * customer.setCustomerName ("Avalara, Inc.");
     * customer.setAddress1("435 Ericksen Ave NE");
     * customer.setCity ("Bainbridge Island");
     * customer.setRegion ("WA");
     * customer.setPostalCode ("98110");
     * customer.setCountry ("US");
     * customer.setEmail("info@avalara.com");
     * customer.setPhone("206-826-4900");
     * customer.setFax("206-780-5011");
     * customer.setCustomerType("Bill_To");
     *
     * InitiateExemptCertRequest initiateExemptCertRequest=new InitiateExemptCertRequest();
     * initiateExemptCertRequest.setCustomer(customer);
     * initiateExemptCertRequest.setCommunicationMode(CommunicationMode.Email);
     * initiateExemptCertRequest.setCustomMessage("Thank you!");
     *
     * InitiateExemptCertResult initiateExemptCertResult= port.initiateExemptCert(initiateExemptCertRequest);
     * </pre>
     *
     * @param initiateExemptCertRequest Initiate exemption certificate request
     * @return getExemptionCertificates
     * @throws java.rmi.RemoteException
     */
    public com.avalara.avatax.services.avacert.InitiateExemptCertResult initiateExemptCert(com.avalara.avatax.services.avacert.InitiateExemptCertRequest initiateExemptCertRequest) throws java.rmi.RemoteException;

    /**
     * This method retrieves all certificates from vCert for a particular customer.
     * @param getExemptionCertificatesRequest
     * @return getExemptionCertificatesResult
     * @throws java.rmi.RemoteException
     */
    public GetExemptionCertificatesResult getExemptionCertificates(GetExemptionCertificatesRequest getExemptionCertificatesRequest) throws java.rmi.RemoteException;

   /* @param message For future use
     * @return  a {@link PingResult} object
     * @throws java.rmi.RemoteException
     */
    public com.avalara.avatax.services.avacert.PingResult ping(String message) throws java.rmi.RemoteException;

    /**
     * Checks authentication of and authorization to one or more operations on the service.
     * <p>
     * This operation allows pre-authorization checking of any or all operations.
     * It will return a comma delimited set of operation names which will be all or a subset
     * of the requested operation names.  For security, it will never return operation names
     * other than those requested, i.e. protects against phishing.
     * </p>
     * <p>
     * <b>Example:</b> <code>isAuthorized("GetTax,PostTax")</code>
     * </p>
     *
     * @param operations a comma-delimited list of operation names.
     * @return a {@link IsAuthorizedResult} object
     * @throws java.rmi.RemoteException
     */
    public com.avalara.avatax.services.avacert.IsAuthorizedResult isAuthorized(String operations) throws java.rmi.RemoteException;
}
