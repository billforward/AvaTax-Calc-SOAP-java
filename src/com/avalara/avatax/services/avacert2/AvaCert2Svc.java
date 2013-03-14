

package com.avalara.avatax.services.avacert2;
/**
 * AvaCert2Svc.java
 * In the the Axis scheme, interface implemented by the object ({@link AvaCert2SvcLocator})
 * that wraps the actual functional Address Service proxy ({@link AvaCert2SvcSoapStub}).
 * <pre>
 * <b>Example:</b>
 * [Java]
 *  Properties properties = new java.util.Properties();
 *         File file = new File("avatax4j.properties");
 *          try
 *          {
 *            properties.load(new FileInputStream(file));
 *            String url = properties.getProperty("avatax4j.url");
 *        <b> AvaCert2Svc avaCertSvc = new AvaCert2SvcLocator(); </b>
 *            AvaCert2SvcSoap port = avaCertSvc.getAvaCert2SvcSoap(new URL(url));
 *
 *          } catch (IOException e)
 *          {
 *              System.out.println("Unable to load avatax4j.properties");
 *              e.printStackTrace();
 *          } catch (ServiceException e) {
 *              e.printStackTrace();
 *          }
 * </pre>
 * @see AvaCert2SvcLocator
 * @see AvaCert2SvcSoap
 * @see AvaCert2SvcSoapStub
 * @author Nitin
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */
public interface AvaCert2Svc extends javax.xml.rpc.Service {
    public java.lang.String getAvaCert2SvcSoap12Address();


    /**
      * Retrieve as a String the default URL set for the Address Service to use.
      * @return Address service URL as a string.
      */
    public java.lang.String getAvaCert2SvcSoapAddress();
    /**
     * This method returns AvaCert2SvcSoap object
     * @return AvaCert2SvcSoap object
     * @throws javax.xml.rpc.ServiceException
     */
    public AvaCert2SvcSoap getAvaCert2SvcSoap() throws javax.xml.rpc.ServiceException;
    /**
     * This method returns AvaCert2SvcSoap object
     * @param portAddress
     * @return AvaCert2SvcSoap object
     * @throws javax.xml.rpc.ServiceException
     */
    public AvaCert2SvcSoap getAvaCert2SvcSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;

    public AvaCert2SvcSoap getAvaCert2SvcSoap12() throws javax.xml.rpc.ServiceException;

    public AvaCert2SvcSoap getAvaCert2SvcSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    
}
