package com.avalara.avatax.services.avacert2;
/**
 * CertificateRequestGetResult.java
 * <br><b>Example:</b>
  * <pre>
  * [Java]
  *  Calendar fromdate = Calendar.getInstance();
  *       fromdate.set(2010,12,01);
  *        AvaCert2SvcSoap svc=null;
  *       Calendar todate = Calendar.getInstance();
  *           try {
  *               svc = new AvaCert2SvcSoapStub();
  *           } catch (AxisFault axisFault) {
  *               axisFault.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
  *           }
  *
  *       CertificateRequestGetRequest request = new CertificateRequestGetRequest();
  *                 request.setCompanyCode("Default");
  *                 request.setCustomerCode("CustomerCode");
  *                 request.setFromDate(fromdate);
  *                 request.setToDate(todate);
  *     <b>  CertificateRequestGetResult result = null;   </b>
  *           try {
  *      <b>         result = svc.certificateRequestGet(request);  </b>
  *           } catch (RemoteException e) {
  *               e.printStackTrace();
  *           }
  *       System.out.println(result.getResultCode());
  * </pre>
  * @author Nitin Shirsat
  * Copyright (c) 2011, Avalara.  All rights reserved.
  */




public class CertificateRequestGetResult  extends BaseResult  implements java.io.Serializable {

    /**
     * Array Contain Objects of CertificateRequest
     */
    private ArrayOfCertificateRequest certificateRequests;

    /**
     * Method to initialize the Object of CertificateRequestGetResult Class with default values
     */
    public CertificateRequestGetResult() {
    }

    /**
     * Method to initialize the Object of CertificateRequestGetResult Class with parametrised values
     * @param certificateRequests
     */
    public CertificateRequestGetResult(
           ArrayOfCertificateRequest certificateRequests) {
           this.certificateRequests = certificateRequests;
    }


    /**
     * Gets the certificateRequests value for this CertificateRequestGetResult.
     * 
     * @return certificateRequests
     */
    public ArrayOfCertificateRequest getCertificateRequests() {
        return certificateRequests;
    }


    /**
     * Sets the certificateRequests value for this CertificateRequestGetResult.
     *
     * @param certificateRequests
     */
    public void setCertificateRequests(ArrayOfCertificateRequest certificateRequests) {
        this.certificateRequests = certificateRequests;
    }

    private java.lang.Object __equalsCalc = null;
     /**
     * Determines whether the specified Object is equal to the current Object.
     * Note: In current implementation all Java Strings members of the two
     * objects must be exactly alike, including in case, for equal to return true.
     * @param obj
     * @return true or false, indicating if the two objects are equal.
     */
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificateRequestGetResult)) return false;
        CertificateRequestGetResult other = (CertificateRequestGetResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.certificateRequests==null && other.getCertificateRequests()==null) || 
             (this.certificateRequests!=null &&
              this.certificateRequests.equals(other.getCertificateRequests())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

      /**
        *  Serves as a hash function for a particular type,
        * suitable for use in hashing algorithms and data
        * structures like a hash table.
        * @return  hash code for this CertificateRequestGetResult object
        * @see java.lang.Object#hashCode
        */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCertificateRequests() != null) {
            _hashCode += getCertificateRequests().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificateRequestGetResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequestGetResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfCertificateRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
