
package com.avalara.avatax.services.avacert2;
/**
  * AvaCert2SvcSoapStub.java
  * Axis-generated class that implements the proxy interface {@link AvaCert2SvcSoap}
  * <pre>
  * <b>Example:</b>
  * [Java]
  *          Properties properties = new java.util.Properties();
  *          File file = new File("avatax4j.properties");
  *         try {
  *                  properties.load(new FileInputStream(file));
  *              } catch (FileNotFoundException e) {
  *                e.printStackTrace();
  *               } catch (IOException e) {
  *                e.printStackTrace();
  *                }
  *          String url = properties.getProperty("avatax4j.url");
  *          Assert.assertFalse("avatax4j.url property is not configured in avatax4j.properties", url == null || url.length() == 0);
  *          String account = properties.getProperty("avatax4j.account");
  *          Assert.assertFalse("avatax4j.account property is not configured in avatax4j.properties", account == null || account.length() == 0);
  *          String license = properties.getProperty("avatax4j.license");
  *          Assert.assertFalse("avatax4j.license property is not configured in avatax4j.properties", license == null || license.length() == 0);
  *          AvaCert2Svc avaCertSvc = new AvaCert2SvcLocator();
  *          AvaCert2SvcSoap port = null;
  *              try {
  *                  port = avaCertSvc.getAvaCert2SvcSoap(new URL(url));
  *              } catch (ServiceException e) {
  *                  e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
  *              } catch (MalformedURLException e) {
  *                  e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
  *              }
  *           // Set the profile
  *            Profile profile = new Profile();
  *            profile.setName("5.8.0");
  *            profile.setClient("AvaCertSvcTest,5.8.0.0");
  *              try {
  *                  port.setProfile(profile);
  *              } catch (SOAPException e) {
  *                  e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
  *              }
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
    public  class AvaCert2SvcSoapStub extends com.avalara.avatax.services.base.BaseSvcSoapStub implements AvaCert2SvcSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerSave");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomerSaveRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomerSaveRequest"), CustomerSaveRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomerSaveResult"));
        oper.setReturnClass(CustomerSaveResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomerSaveResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CertificateGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateGetRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateGetRequest"), CertificateGetRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateGetResult"));
        oper.setReturnClass(CertificateGetResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateGetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CertificateRequestInitiate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestInitiateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestInitiateRequest"), CertificateRequestInitiateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestInitiateResult"));
        oper.setReturnClass(CertificateRequestInitiateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestInitiateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CertificateRequestGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestGetRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestGetRequest"), CertificateRequestGetRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestGetResult"));
        oper.setReturnClass(CertificateRequestGetResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestGetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CertificateImageGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateImageGetRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateImageGetRequest"), CertificateImageGetRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateImageGetResult"));
        oper.setReturnClass(CertificateImageGetResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateImageGetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Ping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PingResult"));
        oper.setReturnClass(PingResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PingResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IsAuthorized");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Operations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsAuthorizedResult"));
        oper.setReturnClass(IsAuthorizedResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsAuthorizedResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }
     /**
     * Initializes a new instance of the class; preferred usage
     * is to obtain an instance of it (as a {@link AvaCert2SvcSoap} interface via the
     * {@link AvaCert2SvcLocator#getAvaCert2SvcSoap()} (java.net.URL)} method.
     *
     * @throws org.apache.axis.AxisFault
     */
    public AvaCert2SvcSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }
       /**
     * Initializes a new instance of the class; preferred usage
     * is to obtain an instance of it (as a {@link AvaCert2SvcSoap} interface via the
     * {@link AvaCert2SvcLocator#getAvaCert2SvcSoap()} (java.net.URL)} method.
     * @param endpointURL
     * @param service
     * @throws org.apache.axis.AxisFault
     */
    public AvaCert2SvcSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }
   /**
     * Initializes a new instance of the class; preferred usage
     * is to obtain an instance of it (as a {@link AvaCert2SvcSoap} interface via the
     * {@link AvaCert2SvcLocator#getAvaCert2SvcSoap()} (java.net.URL)} method.
     * @param service
     * @throws org.apache.axis.AxisFault
     */
    public AvaCert2SvcSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfCertificate");
            cachedSerQNames.add(qName);
            cls = ArrayOfCertificate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfCertificateJurisdiction");
            cachedSerQNames.add(qName);
            cls = ArrayOfCertificateJurisdiction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfCertificateRequest");
            cachedSerQNames.add(qName);
            cls = ArrayOfCertificateRequest.class;
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

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BaseRequest");
            cachedSerQNames.add(qName);
            cls = BaseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BaseResult");
            cachedSerQNames.add(qName);
            cls = BaseResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Certificate");
            cachedSerQNames.add(qName);
            cls = Certificate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateGetRequest");
            cachedSerQNames.add(qName);
            cls = CertificateGetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateGetResult");
            cachedSerQNames.add(qName);
            cls = CertificateGetResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateImageGetRequest");
            cachedSerQNames.add(qName);
            cls = CertificateImageGetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateImageGetResult");
            cachedSerQNames.add(qName);
            cls = CertificateImageGetResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateJurisdiction");
            cachedSerQNames.add(qName);
            cls = CertificateJurisdiction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequest");
            cachedSerQNames.add(qName);
            cls = CertificateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestGetRequest");
            cachedSerQNames.add(qName);
            cls = CertificateRequestGetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestGetResult");
            cachedSerQNames.add(qName);
            cls = CertificateRequestGetResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestInitiateRequest");
            cachedSerQNames.add(qName);
            cls = CertificateRequestInitiateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestInitiateResult");
            cachedSerQNames.add(qName);
            cls = CertificateRequestInitiateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestStage");
            cachedSerQNames.add(qName);
            cls = CertificateRequestStage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestStatus");
            cachedSerQNames.add(qName);
            cls = CertificateRequestStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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
            cls = CommunicationMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Customer");
            cachedSerQNames.add(qName);
            cls = Customer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomerSaveRequest");
            cachedSerQNames.add(qName);
            cls = CustomerSaveRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomerSaveResult");
            cachedSerQNames.add(qName);
            cls = CustomerSaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "FormatType");
            cachedSerQNames.add(qName);
            cls = FormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsAuthorizedResult");
            cachedSerQNames.add(qName);
            cls = IsAuthorizedResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Message");
            cachedSerQNames.add(qName);
            cls = Message.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PingResult");
            cachedSerQNames.add(qName);
            cls = PingResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RequestType");
            cachedSerQNames.add(qName);
            cls = RequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ReviewStatus");
            cachedSerQNames.add(qName);
            cls = ReviewStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SeverityLevel");
            cachedSerQNames.add(qName);
            cls = SeverityLevel.class;
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
                java.lang.String key = (java.lang.String) keys.nextElement();
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
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
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
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }


   /**
     * Adds or updates an exempt customer record in AvaCert
     * and returns the result of operation in a CustomerSaveResult object.
     * @param customerSaveRequest-object containing customer data to be added.
     * @return CustomerSaveResult-object containing result of the customer add operation.
     * @throws java.rmi.RemoteException
     */
    public CustomerSaveResult customerSave(CustomerSaveRequest customerSaveRequest) throws java.rmi.RemoteException {




        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/CustomerSave");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomerSave"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {customerSaveRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CustomerSaveResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (CustomerSaveResult) org.apache.axis.utils.JavaUtils.convert(_resp, CustomerSaveResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }
   /**
     * This operation retrieves all certificates from AvaCert for a particular customer.
     * @param certificateGetRequest-object containing customer code and date range to fetch certificates
     * @return CertificateGetResult-object containing result of the get exemption certificates operation
     * @throws java.rmi.RemoteException
     */
    public CertificateGetResult certificateGet(CertificateGetRequest certificateGetRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/CertificateGet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {certificateGetRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CertificateGetResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (CertificateGetResult) org.apache.axis.utils.JavaUtils.convert(_resp, CertificateGetResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }
   /**
     * Initiates the request for an exemption certificate with AvaCert.
     * It can also add or update the exempt customer record. And returns the result of operation in a {@Link CertificateRequestInitiateResult} object.
     * @param certificateRequestInitiateRequest-
     * @return CertificateRequestInitiateResult-object containing customer and Certificate data to be initiated
     * @throws java.rmi.RemoteException-object containing result of the initiate Certificate operation
     */
    public CertificateRequestInitiateResult certificateRequestInitiate(CertificateRequestInitiateRequest certificateRequestInitiateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/CertificateRequestInitiate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestInitiate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {certificateRequestInitiateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CertificateRequestInitiateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (CertificateRequestInitiateResult) org.apache.axis.utils.JavaUtils.convert(_resp, CertificateRequestInitiateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

     /**
     * This operation retrieves all certificate requests from AvaCert for a particular customer.
     * @param certificateRequestGetRequest
     * @return CertificateRequestGetResult
     * @throws java.rmi.RemoteException
     */
    public CertificateRequestGetResult certificateRequestGet(CertificateRequestGetRequest certificateRequestGetRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/CertificateRequestGet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {certificateRequestGetRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CertificateRequestGetResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (CertificateRequestGetResult) org.apache.axis.utils.JavaUtils.convert(_resp, CertificateRequestGetResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

   /**
     * This operation retrieves certificate Image from AvaCert for a particular customer.
     * @param certificateImageGetRequest
     * @return CertificateImageGetResult
     * @throws java.rmi.RemoteException
     */
    public CertificateImageGetResult certificateImageGet(CertificateImageGetRequest certificateImageGetRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/CertificateImageGet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateImageGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {certificateImageGetRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CertificateImageGetResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (CertificateImageGetResult) org.apache.axis.utils.JavaUtils.convert(_resp, CertificateImageGetResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }
   /**
     * Verifies connectivity to the web service and returns version information about the service.
     * @param message-For future use
     * @return PingResult
     * @throws java.rmi.RemoteException
     */

    public PingResult ping(java.lang.String message) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/Ping");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Ping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PingResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (PingResult) org.apache.axis.utils.JavaUtils.convert(_resp, PingResult.class);
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
      public IsAuthorizedResult isAuthorized(java.lang.String operations) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://avatax.avalara.com/services/IsAuthorized");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsAuthorized"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {operations});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (IsAuthorizedResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (IsAuthorizedResult) org.apache.axis.utils.JavaUtils.convert(_resp, IsAuthorizedResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
