package com.avalara.avatax.services.avacert;
/**
 * GetExemptionCertificatesResult.java
 * Contains the get exemption certificates operation result returned by GetExemptionCertificates.
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 * Calendar fromdate = Calendar.getInstance();
 * Date dd = new Date();
 * fromdate.set(2010,11,24);
 * System.out.println("FromDate:"+fromdate.getTime() );
 * GetExemptionCertificatesRequest getExemptionCertificatesRequest = new GetExemptionCertificatesRequest();
 * getExemptionCertificatesRequest.setCompanyCode("Default") ;
 * getExemptionCertificatesRequest.setFromDate(fromdate);
 * getExemptionCertificatesRequest.setToDate(java.util.Calendar.getInstance());
 * <b>GetExemptionCertificatesResult getExemptionCertificatesResult = port.getExemptionCertificates(getExemptionCertificatesRequest);</b>
 * ArrayOfExemptionCertificate arroe = getExemptionCertificatesResult.getExemptionCertificates();
 * for (int i = 0; arroe != null && i < arroe.getExemptionCertificate().length; i++)
 * {
 *   ExemptionCertificate eCert=arroe.getExemptionCertificate(i);
 *   System.out.println(eCert.getAvaCertId());// Prints Associated AvaCert ID
 * }
 * </pre>
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */
public class GetExemptionCertificatesResult  extends BaseResult  implements java.io.Serializable {

    /**
     * It is Array of ExemptionCertificate Objects
     */
    private ArrayOfExemptionCertificate exemptionCertificates;

     /**
     * It gives count of exemption certificates in array
     */
    private java.lang.Integer recordCount;


   /* Constructor :
    * Initializes a new instance of the GetExemptionCertificatesResult class.
    */
    public GetExemptionCertificatesResult() {
    }

   /* Constructor :
    * Initializes a new instance of the GetExemptionCertificatesResult class.
    */
    public GetExemptionCertificatesResult(
           ArrayOfExemptionCertificate exemptionCertificates,
           java.lang.Integer recordCount) {
           this.exemptionCertificates = exemptionCertificates;
           this.recordCount = recordCount;
    }


    /**
     * Gets the exemptionCertificates value for this GetExemptionCertificatesResult.
     * 
     * @return exemptionCertificates
     */
    public ArrayOfExemptionCertificate getExemptionCertificates() {
        return exemptionCertificates;
    }


    /**
     * Sets the exemptionCertificates value for this GetExemptionCertificatesResult.
     *
     * @param exemptionCertificates
     */
    public void setExemptionCertificates(ArrayOfExemptionCertificate exemptionCertificates) {
        this.exemptionCertificates = exemptionCertificates;
    }


    /**
     * Gets the recordCount value for this GetExemptionCertificatesResult.
     * 
     * @return recordCount
     */
    public java.lang.Integer getRecordCount() {
        return recordCount;
    }


    /**
     * Sets the recordCount value for this GetExemptionCertificatesResult.
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
        if (!(obj instanceof GetExemptionCertificatesResult)) return false;
        GetExemptionCertificatesResult other = (GetExemptionCertificatesResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.exemptionCertificates==null && other.getExemptionCertificates()==null) || 
             (this.exemptionCertificates!=null &&
              this.exemptionCertificates.equals(other.getExemptionCertificates()))) &&
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
     * @return  hash code for this GetExemptionCertificatesResult object
     * @see java.lang.Object#hashCode
     */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getExemptionCertificates() != null) {
            _hashCode += getExemptionCertificates().hashCode();
        }
        if (getRecordCount() != null) {
            _hashCode += getRecordCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExemptionCertificatesResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "GetExemptionCertificatesResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptionCertificates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptionCertificates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfExemptionCertificate"));
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
