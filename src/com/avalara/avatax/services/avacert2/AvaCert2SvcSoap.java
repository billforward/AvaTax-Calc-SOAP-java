package com.avalara.avatax.services.avacert2;
/**
 * AvaCert2SvcSoap.java
 *
 * Proxy interface for the Avalara AvaCert2 Web Service. Requires a
 * Web Service Deployment Descriptor (WSDD) configuration file at creation time named
 * (for example the sample file avatax4j.wsdd) in the same directory as the
 * project is running. The values in the file will be loaded as the default
 * configuration information.
 * <pre>
 * <b>Example:</b>
 * [Java]
 *    Properties properties = new java.util.Properties();
 *         File file = new File("avatax4j.properties");
 *          try
 *          {
 *            properties.load(new FileInputStream(file));
 *            String url = properties.getProperty("avatax4j.url");
 *            AvaCert2Svc avaCertSvc = new AvaCert2SvcLocator();
 *       <b>     AvaCert2SvcSoap port = avaCertSvc.getAvaCert2SvcSoap(new URL(url)); </b>
 *
 *          } catch (IOException e)
 *          {
 *              System.out.println("Unable to load avatax4j.properties");
 *              e.printStackTrace();
 *          } catch (ServiceException e) {
 *              e.printStackTrace();
 *          }
 * </pre>
 * @author  Nitin
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */
public interface AvaCert2SvcSoap extends com.avalara.avatax.services.base.BaseSvcSoap {

    /**
     * This method adds an exempt customer record to AvaCert.  This can also be done
     * within the initiateExemptCert method.  It should be used when you only wish to
     * add the customer and are not yet ready to request a certificate.  Use initiateExemptCert
     * if you wish to both add a customer and request an exempt certificate.
     * <pre>
     * Customer customer = new Customer();
     *       customer.setCustomerCode ("avatax4jCust");
     *       customer.setCountry ("US");
     *       customer.setCity ("Bainbridge Island");
     *       customer.setPostalCode ("98110");
     *       customer.setEmail("devadmin@avalara.com");
     *       customer.setCustomerType("Bill_To");
     *       customer.setState("WA");
     *       customer.setBusinessName("Avalara , Inc");
     *       customer.setAddress1("435 Ericksen Ave");
     *       CustomerSaveRequest customersaverequest = new CustomerSaveRequest();
     *       customersaverequest.setCustomer(customer);
     *       try {
     *           CustomerSaveResult customersaveresult= port.customerSave(customersaverequest);
     *       } catch (RemoteException e) {
     *           e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
     *       }
     * </pre>
     * @param customerSaveRequest
     * @return  a {@link CustomerSaveResult} object
     * @throws java.rmi.RemoteException
     */
    public CustomerSaveResult customerSave(CustomerSaveRequest customerSaveRequest) throws java.rmi.RemoteException;
    /**
        * This method initiates a request from AvaCert2 to the customer for an exemption certificate.
        * The request will be sent using the designated method (email, fax, post).
        * It creates or updates the included customer record in the process.
        *
        * <pre>
        *   Customer customer = getCustomer();
        *    String customerCodeValue="avatax4j"+new Date().getTime() ;
        *    customer.setCustomerCode(customerCodeValue);
        *    CustomerSaveRequest addcustReq = new CustomerSaveRequest();
        *    CustomerSaveResult addcustRes = new CustomerSaveResult();
        *    addcustReq.setCompanyCode("Default");
        *    addcustReq.setCustomer(customer);
        *    addcustRes = port.customerSave(addcustReq);
        *   CertificateRequestInitiateRequest initiateExemptCertRequest=new CertificateRequestInitiateRequest();
        *   initiateExemptCertRequest.setCompanyCode("Default");
        *   initiateExemptCertRequest.setCommunicationMode(CommunicationMode.Email);
        *   initiateExemptCertRequest.setCustomMessage("Testing");
        *  initiateExemptCertRequest.setCustomerCode(customerCodeValue);
        *  CertificateRequestInitiateResult initiateExemptCertResult= port.certificateRequestInitiate(initiateExemptCertRequest);
        * </pre>
        * @param certificateRequestInitiateRequest
        * @return CertificateRequestInitiateResult
        * @throws java.rmi.RemoteException
        */

    public CertificateRequestInitiateResult certificateRequestInitiate(CertificateRequestInitiateRequest certificateRequestInitiateRequest) throws java.rmi.RemoteException;

    /**
     * This method retrieves all certificates from AvaCert for a particular customer.
     * @param certificateGetRequest
     * @return CertificateGetResult
     * @throws java.rmi.RemoteException
     */

    public CertificateGetResult certificateGet(CertificateGetRequest certificateGetRequest) throws java.rmi.RemoteException;


     /**
     * This method retrieves all certificate requests from AvaCert for a particular customer.
     * @param certificateRequestGetRequest
     * @return CertificateRequestGetResult
     * @throws java.rmi.RemoteException
     */
    public CertificateRequestGetResult certificateRequestGet(CertificateRequestGetRequest certificateRequestGetRequest) throws java.rmi.RemoteException;


   /**
     * This method retrieves all certificate Image from AvaCert for a particular customer.
     * @param certificateImageGetRequest
     * @return CertificateImageGetResult
     * @throws java.rmi.RemoteException
     */
    public CertificateImageGetResult certificateImageGet(CertificateImageGetRequest certificateImageGetRequest) throws java.rmi.RemoteException;




    /** This method verifies connectivity to the web service and returns version information about the service.
     *  @param message For future use
     *  @return  a {@link PingResult} object
     *  @throws java.rmi.RemoteException
     */
    public PingResult ping(java.lang.String message) throws java.rmi.RemoteException;


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
    public IsAuthorizedResult isAuthorized(java.lang.String operations) throws java.rmi.RemoteException;
}
