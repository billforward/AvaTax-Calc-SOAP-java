package com.avalara.avatax.services.avacert2;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * AvaCert2SvcLocator.java
 * Class that implements the {@link AvaCert2Svc} interface and is used to create a local proxy
 * ({@link AvaCert2SvcSoap interface}) to interact with Avalara's  Web Service.
 * <pre>
 * <b>Example:</b>
 * [Java]
 *  Properties properties = new java.util.Properties();
 *         File file = new File("avatax4j.properties");
 *          try
 *          {
 *            properties.load(new FileInputStream(file));
 *            String url = properties.getProperty("avatax4j.url");
 *          AvaCert2Svc avaCertSvc = new <b> AvaCert2SvcLocator(); </b> 
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
 * @see AvaCert2SvcSoap
 * @see AvaCert2SvcSoapStub
 * @author Nitin
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */
public class AvaCert2SvcLocator extends org.apache.axis.client.Service implements AvaCert2Svc {
    /**
     * Initializes a new instance of the class;
     */
    public AvaCert2SvcLocator() {
    }

    /**
     * Initializes a new instance of the class;
     * @param config - EngineConfiguration
     */
    public AvaCert2SvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    /**
     * Initializes a new instance of the class;
     * @param wsdlLoc
     * @param sName
     * @throws javax.xml.rpc.ServiceException
     */
    public AvaCert2SvcLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    /**
     *   Use to get a proxy class for AvaCertSvcSoap
     */
    private String AvaCert2SvcSoap_address ="http://localhost/11.2.services/AvaCert2/AvaCert2Svc.asmx";

    /**
     * Method Retrieves AvaCertSvcSoap_address
     * @return AvaCertSvcSoap_address
     */
    public String getAvaCert2SvcSoapAddress() {
        return AvaCert2SvcSoap_address;
    }

    /**
     *  The WSDD service name defaults to the port name.
     */
    private String AvaCert2SvcSoapWSDDServiceName = "AvaCert2SvcSoap";

    /**
     * This method retrieves AvaCertSvcSoapWSDDServiceName
     * @return AvaCertSvcSoapWSDDServiceName
     */
    public String getAvaCert2SvcSoapWSDDServiceName() {
        return AvaCert2SvcSoapWSDDServiceName;
    }

    /**
     * This method sets passed string value to AvaCertSvcSoapWSDDServiceName
     * @param name
     */
    public void setAvaCert2SvcSoapWSDDServiceName(String name) {
        AvaCert2SvcSoapWSDDServiceName = name;
    }

    /**
     * This method retrieves AvaCertSvcSoap object
     * @return AvaCertSvcSoap
     * @throws javax.xml.rpc.ServiceException
     */
    public AvaCert2SvcSoap getAvaCert2SvcSoap() throws javax.xml.rpc.ServiceException {
          java.net.URL endpoint;
           try {
               endpoint = new java.net.URL(AvaCert2SvcSoap_address);
           }
           catch (java.net.MalformedURLException e) {
               throw new javax.xml.rpc.ServiceException(e);
           }
           return getAvaCert2SvcSoap(endpoint);
       }

    /**
     * This method retrieves AvaCertSvcSoap object for parametrized portAddress
     * @return AvaCertSvcSoap object
     * @throws javax.xml.rpc.ServiceException
     */
       public AvaCert2SvcSoap getAvaCert2SvcSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
           try {

            // BEGIN CUSTOM
            String path = portAddress.toString();
            if (!path.endsWith(".asmx"))
            {
                if (!path.endsWith("/"))
                {
                    path += "/";
                }
                path += "avacert2/avacert2svc.asmx";
                portAddress = new URL(path);
            }
            // END CUSTOM

               AvaCert2SvcSoapStub _stub = new AvaCert2SvcSoapStub(portAddress, this);
               _stub.setPortName(getAvaCert2SvcSoapWSDDServiceName());
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
    public void setAvaCert2SvcSoapEndpointAddress(String address) {
           AvaCert2SvcSoap_address = address;
       }


    /**
     *  Use to get a proxy class for AvaCertSvcSoap12
     */
    private String AvaCert2SvcSoap12_address = "http://localhost/11.2.services/AvaCert2/AvaCert2Svc.asmx";

    /**
     * This method retrieves AvaCertSvcSoap12 address value.
     * @return  AvaCertSvcSoap12 address value
     */
    public String getAvaCert2SvcSoap12Address() {
        return AvaCert2SvcSoap12_address;
    }

    /**
     * The WSDD service name defaults to the port name.
     */
    private String AvaCert2SvcSoap12WSDDServiceName = "AvaCert2SvcSoap12";

    /**
     * This method retrieves AvaCertSvcSoap12WSDDServiceName
     * @return AvaCertSvcSoap12WSDDServiceName
     */
    public String getAvaCert2SvcSoap12WSDDServiceName() {
        return AvaCert2SvcSoap12WSDDServiceName;
    }

    /**
     * This method retrieves AvaCertSvcSoap12WSDDServiceName
     * @param name
     */
    public void setAvaCert2SvcSoap12WSDDServiceName(String name) {
        AvaCert2SvcSoap12WSDDServiceName = name;
    }

    public AvaCert2SvcSoap getAvaCert2SvcSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AvaCert2SvcSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAvaCert2SvcSoap12(endpoint);
    }

    public AvaCert2SvcSoap getAvaCert2SvcSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
           AvaCert2SvcSoapStub _stub = new AvaCert2SvcSoapStub(portAddress, this);
            _stub.setPortName(getAvaCert2SvcSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAvaCert2SvcSoap12EndpointAddress(java.lang.String address) {
        AvaCert2SvcSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (AvaCert2SvcSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                AvaCert2SvcSoap12Stub _stub = new AvaCert2SvcSoap12Stub(new java.net.URL(AvaCert2SvcSoap12_address), this);
                _stub.setPortName(getAvaCert2SvcSoap12WSDDServiceName());
                return _stub;
            }
            if (AvaCert2SvcSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                AvaCert2SvcSoapStub _stub = new AvaCert2SvcSoapStub(new java.net.URL(AvaCert2SvcSoap_address), this);
                _stub.setPortName(getAvaCert2SvcSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AvaCert2SvcSoap12".equals(inputPortName)) {
            return getAvaCert2SvcSoap12();
        }
        else if ("AvaCert2SvcSoap".equals(inputPortName)) {
            return getAvaCert2SvcSoap();
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
        return new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaCert2Svc");
    }

    private java.util.HashSet ports = null;

    /**
     * This method retrieves ports
     * @return Iterator
     */
    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaCert2SvcSoap12"));
            ports.add(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaCert2SvcSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AvaCert2SvcSoap12".equals(portName)) {
            setAvaCert2SvcSoap12EndpointAddress(address);
        }
        else 
if ("AvaCert2SvcSoap".equals(portName)) {
            setAvaCert2SvcSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
      * Set the endpoint address for the specified port name.
      */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
