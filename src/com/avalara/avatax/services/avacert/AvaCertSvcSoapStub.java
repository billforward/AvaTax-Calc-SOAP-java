package com.avalara.avatax.services.avacert;
/**
 * AvaCertSvcSoapStub.java
 * Axis-generated class that implements the proxy interface {@link AvaCertSvcSoap}
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
 *          AvaCertSvc avaCertSvc = new AvaCertSvcLocator();
 *          AvaCertSvcSoap port = avaCertSvc.getAvaCertSvcSoap(new URL(url));
 *           // Set the profile
 *            Profile profile = new Profile();
 *            profile.setName("5.8.0");
 *            profile.setClient("AvaCertSvcTest,5.8.0.0");
 *            port.setProfile(profile);
 *
 *            // Set security
 *            Security security = new Security();
 *            security.setAccount(account);
 *            security.setLicense(license);
 *            port.setSecurity(security);
 * </pre>
 * @author Nitin
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */

public class AvaCertSvcSoapStub extends com.avalara.avatax.services.base.BaseSvcSoapStub implements AvaCertSvcSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[8];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddCustomer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddCustomerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddCustomerRequest"), AddCustomerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddCustomerResult"));
        oper.setReturnClass(AddCustomerResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddCustomerResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetExemptionCertificates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "GetExemptionCertificatesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://avatax.avalara.com/services", "GetExemptionCertificatesRequest"), GetExemptionCertificatesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "GetExemptionCertificatesResult"));
        oper.setReturnClass(GetExemptionCertificatesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "GetExemptionCertificatesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InitiateExemptCert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "InitiateExemptCertRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://avatax.avalara.com/services", "InitiateExemptCertRequest"), com.avalara.avatax.services.avacert.InitiateExemptCertRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "InitiateExemptCertResult"));
        oper.setReturnClass(com.avalara.avatax.services.avacert.InitiateExemptCertResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "InitiateExemptCertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;



        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Ping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PingResult"));
        oper.setReturnClass(com.avalara.avatax.services.avacert.PingResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PingResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IsAuthorized");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Operations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsAuthorizedResult"));
        oper.setReturnClass(com.avalara.avatax.services.avacert.IsAuthorizedResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsAuthorizedResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }
     /**
     * Initializes a new instance of the class; preferred usage
     * is to obtain an instance of it (as a {@link com.avalara.avatax.services.avacert.AvaCertSvcSoap} interface via the
     * {@link AvaCertSvcLocator#getAvaCertSvcSoap()} (java.net.URL)} method.
     *
     * @throws org.apache.axis.AxisFault
     */
    public AvaCertSvcSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }


     /**
     * Initializes a new instance of the class; preferred usage
     * is to obtain an instance of it (as a {@link com.avalara.avatax.services.avacert.AvaCertSvcSoap} interface via the
     * {@link AvaCertSvcLocator#getAvaCertSvcSoap()} (java.net.URL)} method.
     * @param endpointURL
     * @param service
     * @throws org.apache.axis.AxisFault
     */
    public AvaCertSvcSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }
   /**
     * Initializes a new instance of the class; preferred usage
     * is to obtain an instance of it (as a {@link com.avalara.avatax.services.avacert.AvaCertSvcSoap} interface via the
     * {@link AvaCertSvcLocator#getAvaCertSvcSoap()} (java.net.URL)} method.
     * @param service
     * @throws org.apache.axis.AxisFault
     */
    public AvaCertSvcSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddCustomerRequest");
            cachedSerQNames.add(qName);
            cls = AddCustomerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddCustomerResult");
            cachedSerQNames.add(qName);
            cls = AddCustomerResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);


            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfExemptionCertificate");
            cachedSerQNames.add(qName);
            cls = ArrayOfExemptionCertificate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfJurisdiction");
            cachedSerQNames.add(qName);
            cls = ArrayOfJurisdiction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfMessage");
            cachedSerQNames.add(qName);
            cls = ArrayOfMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = ArrayOfString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            
            

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaCertServiceStatus");
            cachedSerQNames.add(qName);
            cls = AvaCertServiceStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);
            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BaseRequest");
            cachedSerQNames.add(qName);
            cls = com.avalara.avatax.services.avacert.BaseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BaseResult");
            cachedSerQNames.add(qName);
            cls = com.avalara.avatax.services.avacert.BaseResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateStatus");
            cachedSerQNames.add(qName);
            cls = CertificateStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateUsage");
            cachedSerQNames.add(qName);
            cls = CertificateUsage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);
            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CommunicationMode");
            cachedSerQNames.add(qName);
            cls = com.avalara.avatax.services.avacert.CommunicationMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Customer");
            cachedSerQNames.add(qName);
            cls = com.avalara.avatax.services.avacert.Customer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptionCertificate");
            cachedSerQNames.add(qName);
            cls =ExemptionCertificate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);


            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "GetExemptionCertificatesRequest");
            cachedSerQNames.add(qName);
            cls = GetExemptionCertificatesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "GetExemptionCertificatesResult");
            cachedSerQNames.add(qName);
            cls = GetExemptionCertificatesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "InitiateExemptCertRequest");
            cachedSerQNames.add(qName);
            cls = InitiateExemptCertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "InitiateExemptCertResult");
            cachedSerQNames.add(qName);
            cls = InitiateExemptCertResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

			qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsAuthorizedResult");
            cachedSerQNames.add(qName);
            cls = com.avalara.avatax.services.avacert.IsAuthorizedResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            


            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Jurisdiction");
            cachedSerQNames.add(qName);
            
            cls = Jurisdiction.class;
            
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Message");
            cachedSerQNames.add(qName);
            cls = com.avalara.avatax.services.avacert.Message.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PingResult");
            cachedSerQNames.add(qName);
            cls = com.avalara.avatax.services.avacert.PingResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RequestType");
            cachedSerQNames.add(qName);
            cls = RequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SeverityLevel");
            cachedSerQNames.add(qName);
            cls = com.avalara.avatax.services.avacert.SeverityLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);
            
          
    }

    /**
     * This Method create service call
     * @return Call
     * @throws java.rmi.RemoteException
     */
    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    /**
     * Adds or updates an exempt customer record in AvaCert
     * and returns the result of operation in a AddCustomerResult object.
     * @param addCustomerRequest-object containing customer data to be added.
     * @return AddCustomerResult-object containing result of the customer add operation.
     * @throws java.rmi.RemoteException
     */
    public AddCustomerResult addCustomer(AddCustomerRequest addCustomerRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/AddCustomer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddCustomer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {addCustomerRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AddCustomerResult) _resp;
            } catch (Exception _exception) {
                return (AddCustomerResult) org.apache.axis.utils.JavaUtils.convert(_resp, AddCustomerResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    /**
     * This operation retrieves all certificates from vCert for a particular customer.
     * @param getExemptionCertificatesRequest-object containing customer code and date range to fetch certificates
     * @return GetExemptionCertificatesResult-object containing result of the get exemption certificates operation
     * @throws java.rmi.RemoteException
     */
   public GetExemptionCertificatesResult getExemptionCertificates(GetExemptionCertificatesRequest getExemptionCertificatesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/GetExemptionCertificates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "GetExemptionCertificates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getExemptionCertificatesRequest});

            if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetExemptionCertificatesResult)_resp;
            } catch (java.lang.Exception _exception) {
                return (GetExemptionCertificatesResult) org.apache.axis.utils.JavaUtils.convert(_resp, GetExemptionCertificatesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    /**
     * Initiates the request for an exemption certificate with AvaCert.
     * It can also add or update the exempt customer record. And returns the result of operation in a {@Link InitiateExemptCertResult} object.
     * @param initiateExemptCertRequest-
     * @return InitiateExemptCertResult-object containing customer and ExemptCert data to be initiated
     * @throws java.rmi.RemoteException-object containing result of the initiate ExemptCert operation
     */
    public com.avalara.avatax.services.avacert.InitiateExemptCertResult initiateExemptCert(com.avalara.avatax.services.avacert.InitiateExemptCertRequest initiateExemptCertRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/InitiateExemptCert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "InitiateExemptCert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {initiateExemptCertRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.avalara.avatax.services.avacert.InitiateExemptCertResult) _resp;
            } catch (Exception _exception) {
                return (com.avalara.avatax.services.avacert.InitiateExemptCertResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.avalara.avatax.services.avacert.InitiateExemptCertResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    /**
     * Verifies connectivity to the web service and returns version information about the service.
     * @param message-For future use
     * @return message-For future use
     * @throws java.rmi.RemoteException
     */
    public com.avalara.avatax.services.avacert.PingResult ping(String message) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/Ping");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Ping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.avalara.avatax.services.avacert.PingResult) _resp;
            } catch (Exception _exception) {
                return (com.avalara.avatax.services.avacert.PingResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.avalara.avatax.services.avacert.PingResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    /**
     * Checks authentication of and authorization to one or more operations on the service.
     * @param operations a comma-delimited list of operation names.
     * @return IsAuthorizedResult
     * @throws java.rmi.RemoteException
     */
    public com.avalara.avatax.services.avacert.IsAuthorizedResult isAuthorized(String operations) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/IsAuthorized");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsAuthorized"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {operations});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.avalara.avatax.services.avacert.IsAuthorizedResult) _resp;
            } catch (Exception _exception) {
                return (com.avalara.avatax.services.avacert.IsAuthorizedResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.avalara.avatax.services.avacert.IsAuthorizedResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
