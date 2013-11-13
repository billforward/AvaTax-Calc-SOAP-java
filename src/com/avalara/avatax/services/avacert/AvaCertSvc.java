/**
 * AvaCertSvc.java
 * @author Nitin
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */

package com.avalara.avatax.services.avacert;
/**
 * In the the Axis scheme, interface implemented by the object ({@link AvaCertSvcLocator})
 * that wraps the actual functional Address Service proxy ({@link AvaCertSvcSoapStub}).
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
 *       <b>   AvaCertSvc avaCertSvc = new AvaCertSvcLocator(); </b>
 *          AvaCertSvcSoap port = avaCertSvc.getAvaCertSvcSoap(new URL(url));
 * </pre>
 * @see AvaCertSvcLocator
 * @see AvaCertSvcSoap
 * @see AvaCertSvcSoapStub
 * @author Nitin
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */

public interface AvaCertSvc extends javax.xml.rpc.Service {

    /**
      * Retrieve as a String the default URL set for the Address Service to use.
      * @return Address service URL as a string.
      */

    public String getAvaCertSvcSoapAddress();


    /**
     * This method returns AvaCertSvcSoap object
     * @return AvaCertSvcSoap object
     * @throws javax.xml.rpc.ServiceException
     */
    public com.avalara.avatax.services.avacert.AvaCertSvcSoap getAvaCertSvcSoap() throws javax.xml.rpc.ServiceException;

    /**
     * This method returns AvaCertSvcSoap object
     * @param portAddress
     * @return AvaCertSvcSoap object
     * @throws javax.xml.rpc.ServiceException
     */
    public com.avalara.avatax.services.avacert.AvaCertSvcSoap getAvaCertSvcSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public String getAvaCertSvcSoap12Address();

}
