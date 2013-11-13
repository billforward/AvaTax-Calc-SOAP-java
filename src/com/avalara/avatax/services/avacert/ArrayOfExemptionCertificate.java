package com.avalara.avatax.services.avacert;
/**
 * ArrayOfExemptionCertificate.java
 * A wrapper object used by Axis to encapsulate  an array of zero or more {@link ExemptionCertificate} objects
 * for SOAP transmission via the Web returned as part of a method call's result object.
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
 * GetExemptionCertificatesResult getExemptionCertificatesResult = port.getExemptionCertificates(getExemptionCertificatesRequest);
 *<b> ArrayOfExemptionCertificate exemptioncertificates = getExemptionCertificatesResult.getExemptionCertificates();</b>
 * for (int i = 0; exemptioncertificates != null && i < exemptioncertificates.getExemptionCertificate().length; i++)
 * {
 *   ExemptionCertificate eCert=exemptioncertificates.getExemptionCertificate(i);
 *   System.out.println(eCert.getAvaCertId());// Prints Associated AvaCert Id
 * }
 * </pre>
 *
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */

public class ArrayOfExemptionCertificate  implements java.io.Serializable {

    /**
     *  An array of zero or more {@link ExemptionCertificate} objects
     */
    private ExemptionCertificate[] exemptionCertificate;


     /**
     * Initializes a new instance of the class with an empty array
     * of {@link ExemptionCertificate} objects.
     */

    public ArrayOfExemptionCertificate() {
    }

    /**
     *  Initializes a new instance of the class and its internal array
     * of {@link ExemptionCertificate} objects.
     * @param exemptionCertificate
     */
    public ArrayOfExemptionCertificate(
           ExemptionCertificate[] exemptionCertificate) {
           this.exemptionCertificate = exemptionCertificate;
    }


   /**
     * Retrieves the raw array of {@link ExemptionCertificate} objects encapsulated in
     * this object.
     *
     * @return ExemptionCertificate[]  warning this may be null, depending on how the object
     * was initialized.
     */
    public ExemptionCertificate[] getExemptionCertificate() {
        return exemptionCertificate;
    }


     /**
     * Allows one to programatically set the raw array of {@link ExemptionCertificate} objects
     * encapsulated by this object.
     *
     * @param exemptionCertificate
     */
    public void setExemptionCertificate(ExemptionCertificate[] exemptionCertificate) {
        this.exemptionCertificate = exemptionCertificate;
    }

     /**
     * Retrieves the ith {@link ExemptionCertificate} object (counting from 0) from the array
     * of ExemptionCertificates encapsulated in this object. Should only be used if its known
     * that {@link #getExemptionCertificate} returns a non-null value and that i < number of ExemptionCertificate
     * actually in that array.
     *
     * @param i integer from 0 to (number of ExemptionCertificate -1)
     * @return ExemptionCertificate
     */
    public ExemptionCertificate getExemptionCertificate(int i) {
        return this.exemptionCertificate[i];
    }


     /**
     * Allows one to replace the ith {@link ExemptionCertificate} object (counting from 0) within the array
     * of ExemptionCertificates encapsulated in this object. Should only be used if its known
     * that {@link #getExemptionCertificate} returns a non-null value and that i < number of ExemptionCertificate
     * actually in that array.
     *
     * @param i integer from 0 to (number of ExemptionCertificate -1)
     * @param  _value ExemptionCertificate object to place in the indicated position of the
     * ExemptionCertificate array
     */
    public void setExemptionCertificate(int i, ExemptionCertificate _value) {
        this.exemptionCertificate[i] = _value;
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
        if (!(obj instanceof ArrayOfExemptionCertificate)) return false;
        ArrayOfExemptionCertificate other = (ArrayOfExemptionCertificate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exemptionCertificate==null && other.getExemptionCertificate()==null) || 
             (this.exemptionCertificate!=null &&
              java.util.Arrays.equals(this.exemptionCertificate, other.getExemptionCertificate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

     /**
     * Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this ArrayOfExemptionCertificate object
     * @see java.lang.Object#hashCode
     */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getExemptionCertificate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExemptionCertificate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExemptionCertificate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfExemptionCertificate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfExemptionCertificate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptionCertificate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptionCertificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptionCertificate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
