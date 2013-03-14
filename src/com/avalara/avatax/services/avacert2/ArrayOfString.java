package com.avalara.avatax.services.avacert2;
/**
 * ArrayOfString.java
 * A wrapper object used by Axis to encapsulate  an array of zero or more {@link String} objects
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
 *                  try(
 *                  CertificateGetResult getExemptionCertificatesResult = port.certificateGet(getExemptionCertificatesRequest);}
 *                  catch(RemoteException e)
 *                  {
 *                   e.printStackTrace() }
 *                ArrayOfCertificate arroe = getExemptionCertificatesResult.getCertificates();
 *                  if(arroe != null && arroe.getCertificate().length>0)
 *                  {
 *                      int count =0;
 *                      Certificate eCert=arroe.getCertificate(count);
 *               <b>        ArrayOfString arros = eCert.getCustomerCodes();       </b>
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




public class ArrayOfString  implements java.io.Serializable {

    /**
     *  an array of zero or more {@link String} objects
     */
    private java.lang.String[] string;

     /**
      * Initializes a new instance of the class with an empty array
      * of {@link String} objects.
      */
    public ArrayOfString() {
    }

   /**
     * Initializes a new instance of the class and its internal array
     * of {@link String} objects.
     * @param string
     */
    public ArrayOfString(
           java.lang.String[] string) {
           this.string = string;
    }


    /**
     * Retrieves the raw array of {@link String} objects encapsulated in
     * this object.
     * @return String
     */
    public java.lang.String[] getString() {
        return string;
    }


      /**
     * Allows one to programatically set the raw array of {@link String} objects
     * encapsulated by this object.
     * @param string
     */
    public void setString(java.lang.String[] string) {
        this.string = string;
    }

    /**
     * Retrieves the ith {@link String} object (counting from 0) from the array
     * of String encapsulated in this object. Should only be used if its known
     * that {@link #getString} returns a non-null value and that i < number of Strings
     * actually in that array.
     * @param i integer from 0 to (number of String -1)
     * @return String
     */

    public java.lang.String getString(int i) {
        return this.string[i];
    }

    /**
     * Allows one to replace the ith {@link String} object (counting from 0) within the array
     * of String encapsulated in this object. Should only be used if its known
     * that {@link #getString} returns a non-null value and that i < number of String
     * actually in that array.
     * @param i integer from 0 to (number of String -1)
     * @param  _value String object to place in the indicated position of the
     * String array
     */

    public void setString(int i, java.lang.String _value) {
        this.string[i] = _value;
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
        if (!(obj instanceof ArrayOfString)) return false;
        ArrayOfString other = (ArrayOfString) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.string==null && other.getString()==null) || 
             (this.string!=null &&
              java.util.Arrays.equals(this.string, other.getString())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
     /**
        *  Serves as a hash function for a particular type,
        * suitable for use in hashing algorithms and data
        * structures like a hash table.
        * @return  hash code for this ArrayOfString object
        * @see java.lang.Object#hashCode
        */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getString() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getString());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getString(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfString.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfString"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("string");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "string"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
