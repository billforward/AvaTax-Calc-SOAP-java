package com.avalara.avatax.services.avacert2;
/**
 * CertificateGetResult.java
  * Contains the get exemption certificates operation result returned by certificateGet
  * <br><b>Example:</b>
  * <pre>
  * [Java]
  * Calendar fromdate = Calendar.getInstance();
  * fromdate.set(2010,01,01);
  * System.out.println("FromDate:"+fromdate.getTime() );
  * CertificateGetRequest getExemptionCertificatesRequest = new CertificateGetRequest();
  * getExemptionCertificatesRequest.setCompanyCode("DEFAULT") ;
  * getExemptionCertificatesRequest.setCustomerCode("");
  * getExemptionCertificatesRequest.setModFromDate(fromdate);
  * getExemptionCertificatesRequest.setModToDate(java.util.Calendar.getInstance());
  * <b>CertificateGetResult getExemptionCertificatesResult = port.certificateGet(getExemptionCertificatesRequest);</b>
  * </pre>
  * @author Nitin Shirsat
  * Copyright (c) 2011, Avalara.  All rights reserved.
  */



public class CertificateGetResult  extends BaseResult  implements java.io.Serializable {

    /**
     * Array of  Certificate Objects
     */
    private ArrayOfCertificate certificates;
    /**
     * Field Contains Count of Records
     */
    private java.lang.Integer recordCount;


    /**
     * Initializes the  object of CertificateGetResult class with default values
     */
    public CertificateGetResult() {
    }

    /**
     *Initializes the  object of CertificateGetResult class with parametrised values
     * @param certificates
     * @param recordCount
     */
    public CertificateGetResult(
           ArrayOfCertificate certificates,
           java.lang.Integer recordCount) {
           this.certificates = certificates;
           this.recordCount = recordCount;
    }


    /**
     * Gets the certificates value for this CertificateGetResult.
     * 
     * @return certificates
     */
    public ArrayOfCertificate getCertificates() {
        return certificates;
    }


    /**
     * Sets the certificates value for this CertificateGetResult.
     *
     * @param certificates
     */
    public void setCertificates(ArrayOfCertificate certificates) {
        this.certificates = certificates;
    }


    /**
     * Gets the recordCount value for this CertificateGetResult.
     * 
     * @return recordCount
     */
    public java.lang.Integer getRecordCount() {
        return recordCount;
    }


    /**
     * Sets the recordCount value for this CertificateGetResult.
     *
     * @param recordCount
     */
    public void setRecordCount(java.lang.Integer recordCount) {
        this.recordCount = recordCount;
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
        if (!(obj instanceof CertificateGetResult)) return false;
        CertificateGetResult other = (CertificateGetResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.certificates==null && other.getCertificates()==null) || 
             (this.certificates!=null &&
              this.certificates.equals(other.getCertificates()))) &&
            ((this.recordCount==null && other.getRecordCount()==null) || 
             (this.recordCount!=null &&
              this.recordCount.equals(other.getRecordCount())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    /**
       *  Serves as a hash function for a particular type,
       * suitable for use in hashing algorithms and data
       * structures like a hash table.
       * @return  hash code for this CertificateGetResult object
       * @see java.lang.Object#hashCode
       */
    
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCertificates() != null) {
            _hashCode += getCertificates().hashCode();
        }
        if (getRecordCount() != null) {
            _hashCode += getRecordCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificateGetResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateGetResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Certificates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfCertificate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RecordCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }
    /**
    * Return Axis type metadata object; this method is used internally by the adapter
    * and not intended to be used by external implementation code.
    */

    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
           * Get Axis Custom Serializer; this method is used internally by the adapter
           * and not intended to be used by external implementation code.
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
      * Get Axis Custom Deserializer; this method is used internally by the adapter
      * and not intended to be used by external implementation code.
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
