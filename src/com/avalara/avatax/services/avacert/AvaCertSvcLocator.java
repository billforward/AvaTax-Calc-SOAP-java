
package com.avalara.avatax.services.avacert;

import java.net.MalformedURLException;
import java.net.URL;
/**
 * AvaCertSvcLocator.java
 * Class that implements the {@link com.avalara.avatax.services.avacert.AvaCertSvc} interface and is used to create a local proxy
 * ({@link AvaCertSvcSoap interface}) to interact with Avalara's  Web Service.
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
 * @author greggr
 * Copyright (c) 2005, Avalara.  All rights reserved.
 */




public class AvaCertSvcLocator extends org.apache.axis.client.Service implements AvaCertSvc {
    /**
     * Initializes a new instance of the class;
     */
    public AvaCertSvcLocator() {
    }

    /**
     * Initializes a new instance of the class;
     * @param config - EngineConfiguration
     */
    public AvaCertSvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    /**
     * Initializes a new instance of the class;
     * @param wsdlLoc
     * @param sName
     * @throws javax.xml.rpc.ServiceException
     */
    public AvaCertSvcLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    /**
     *   Use to get a proxy class for AvaCertSvcSoap
     */
    private String AvaCertSvcSoap_address = "https://development.avalara.net/AvaCert/AvaCertSvc.asmx";

    /**
     * Method Retrieves AvaCertSvcSoap_address
     * @return AvaCertSvcSoap_address
     */
    public String getAvaCertSvcSoapAddress() {
        return AvaCertSvcSoap_address;
    }

    /**
     *  The WSDD service name defaults to the port name.
     */
    private String AvaCertSvcSoapWSDDServiceName = "AvaCertSvcSoap";

    /**
     * This method retrieves AvaCertSvcSoapWSDDServiceName
     * @return AvaCertSvcSoapWSDDServiceName
     */
    public String getAvaCertSvcSoapWSDDServiceName() {
        return AvaCertSvcSoapWSDDServiceName;
    }

    /**
     * This method sets passed string value to AvaCertSvcSoapWSDDServiceName
     * @param name
     */
    public void setAvaCertSvcSoapWSDDServiceName(String name) {
        AvaCertSvcSoapWSDDServiceName = name;
    }

    /**
     * This method retrieves AvaCertSvcSoap object
     * @return AvaCertSvcSoap
     * @throws javax.xml.rpc.ServiceException
     */
    public com.avalara.avatax.services.avacert.AvaCertSvcSoap getAvaCertSvcSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AvaCertSvcSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAvaCertSvcSoap(endpoint);
    }

    /**
     * This method retrieves AvaCertSvcSoap object for parametrized portAddress
     * @return AvaCertSvcSoap object
     * @throws javax.xml.rpc.ServiceException
     */
    public com.avalara.avatax.services.avacert.AvaCertSvcSoap getAvaCertSvcSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {

            // BEGIN CUSTOM
            String path = portAddress.toString();
            if (!path.endsWith(".asmx"))
            {
                if (!path.endsWith("/"))
                {
                    path += "/";
                }
                path += "avacert/avacertsvc.asmx";
                portAddress = new URL(path);
            }
            // END CUSTOM

            com.avalara.avatax.services.avacert.AvaCertSvcSoapStub _stub = new com.avalara.avatax.services.avacert.AvaCertSvcSoapStub(portAddress, this);
            _stub.setPortName(getAvaCertSvcSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
        // BEGIN CUSTOM
        catch (MalformedURLException e)
        {
            return null;
        }
        // END CUSTOM
    }

    /**
     * This method sets AvaCertSvcSoap address value.
     * @param address
     */
    public void setAvaCertSvcSoapEndpointAddress(String address) {
        AvaCertSvcSoap_address = address;
    }


    /**
     *  Use to get a proxy class for AvaCertSvcSoap12
     */
    private String AvaCertSvcSoap12_address = "http://localhost/avatax.branches.5.8.0/Account/AvaCertSvc.asmx";

    /**
     * This method retrieves AvaCertSvcSoap12 address value.
     * @return  AvaCertSvcSoap12 address value
     */
    public String getAvaCertSvcSoap12Address() {
        return AvaCertSvcSoap12_address;
    }

    /**
     * The WSDD service name defaults to the port name.
     */
    private String AvaCertSvcSoap12WSDDServiceName = "AvaCertSvcSoap12";

    /**
     * This method retrieves AvaCertSvcSoap12WSDDServiceName
     * @return AvaCertSvcSoap12WSDDServiceName
     */
    public String getAvaCertSvcSoap12WSDDServiceName() {
        return AvaCertSvcSoap12WSDDServiceName;
    }

    /**
     * This method retrieves AvaCertSvcSoap12WSDDServiceName
     * @param name
     */
    public void setAvaCertSvcSoap12WSDDServiceName(String name) {
        AvaCertSvcSoap12WSDDServiceName = name;
    }

    /**
     * This method sets parametrized address to AvaCertSvcSoap12 address
     * @param address
     */
    public void setAvaCertSvcSoap12EndpointAddress(String address) {
        AvaCertSvcSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */


    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("AvaCertSvcSoap".equals(inputPortName)) {
            return getAvaCertSvcSoap();
        }
        
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    /**
     * This method retrieves ServiceName
     * @return javax.xml.namespace.QName
     */
    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaCertSvc");
    }

    private java.util.HashSet ports = null;

    /**
     * This method retrieves ports
     * @return Iterator
     */
    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaCertSvcSoap"));
            ports.add(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaCertSvcSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("AvaCertSvcSoap".equals(portName)) {
            setAvaCertSvcSoapEndpointAddress(address);
        }
        else 
if ("AvaCertSvcSoap12".equals(portName)) {
            setAvaCertSvcSoap12EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
