package com.avalara.avatax.services.avacert2;
/**
 * ArrayOfCertificate.java
 * A wrapper object used by Axis to encapsulate  an array of zero or more {@link Certificate} objects
 * for SOAP transmission via the Web returned as part of a method call's result object.
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 *                  Calendar fromdate = Calendar.getInstance();
 *                  fromdate.set(2010,01,01);
 *                  System.out.println("FromDate:"+fromdate.getTime() );
 *
 *                  CertificateGetRequest getExemptionCertificatesRequest = new CertificateGetRequest();
 *                  getExemptionCertificatesRequest.setCompanyCode("DEFAULT") ;
 *                  getExemptionCertificatesRequest.setCustomerCode("");
 *                  getExemptionCertificatesRequest.setModFromDate(fromdate);
 *                  getExemptionCertificatesRequest.setModToDate(java.util.Calendar.getInstance());
 *                  CertificateGetResult getExemptionCertificatesResult = port.certificateGet(getExemptionCertificatesRequest);
 *
 *              <b>  ArrayOfCertificate arroe = getExemptionCertificatesResult.getCertificates(); </b>
 *                  if(arroe != null && arroe.getCertificate().length>0)
 *                  {
 *                      int count =0;
 *                      Certificate eCert=arroe.getCertificate(count);
 *                      ArrayOfString arros = eCert.getCustomerCodes();
 *
 *                      for (int i = 0; arros != null && i < arros.getString().length; i++)
 *                      {
 *                        String str=arros.getString(i);
 *                        System.out.println(str);// Prints retrived CustomerCode
 *                      }
 *                  }
 *
 *
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */
public class ArrayOfCertificate  implements java.io.Serializable {


    /**
     *  An array of zero or more {@link Certificate} objects
     */

    private Certificate[] certificate;


     /**
     * Initializes a new instance of the class with an empty array
     * of {@link Certificate} objects.
     */

    public ArrayOfCertificate() {
       
    }



    /**
     *  Initializes a new instance of the class and its internal array
     * of {@link Certificate} objects.
     * @param certificate
     */
    public ArrayOfCertificate(
           Certificate[] certificate) {
           this.certificate = certificate;
    }


    /**
     * Retrieves the raw array of {@link Certificate} objects encapsulated in
     * this object.
     * 
     * @return Certificate[]  warning this may be null, depending on how the object
     * was initialized.
     */
    public Certificate[] getCertificate() {
        return certificate;
    }


    /**
     * Allows one to programatically set the raw array of {@link Certificate} objects
     * encapsulated by this object.
     * 
     * @param certificate
     */
    public void setCertificate(Certificate[] certificate) {
        this.certificate = certificate;
    }

     /**
     * Retrieves the ith {@link Certificate} object (counting from 0) from the array
     * of ExemptionCertificates encapsulated in this object. Should only be used if its known
     * that {@link #getCertificate} returns a non-null value and that i < number of ExemptionCertificate
     * actually in that array.
     *
     * @param i integer from 0 to (number of ExemptionCertificate -1)
     * @return Certificate
     */

    public Certificate getCertificate(int i) {
        return this.certificate[i];
    }


     /**
     * Allows one to replace the ith {@link Certificate} object (counting from 0) within the array
     * of ExemptionCertificates encapsulated in this object. Should only be used if its known
     * that {@link #getCertificate} returns a non-null value and that i < number of ExemptionCertificate
     * actually in that array.
     *
     * @param i integer from 0 to (number of Certificate -1)
     * @param  _value Certificate object to place in the indicated position of the
     * Certificate array
     */
    public void setCertificate(int i, Certificate _value) {
        this.certificate[i] = _value;
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
        if (!(obj instanceof ArrayOfCertificate)) return false;
        ArrayOfCertificate other = (ArrayOfCertificate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certificate==null && other.getCertificate()==null) || 
             (this.certificate!=null &&
              java.util.Arrays.equals(this.certificate, other.getCertificate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

     /**
     * Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this ArrayOfCertificate object
     * @see java.lang.Object#hashCode
     */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCertificate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertificate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertificate(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCertificate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfCertificate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Certificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Certificate"));
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

    /**
       * Gets the size of the array.
       * @return size
       */


}
