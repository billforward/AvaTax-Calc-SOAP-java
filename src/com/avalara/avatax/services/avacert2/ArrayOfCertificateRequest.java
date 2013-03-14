
package com.avalara.avatax.services.avacert2;
/**
 * ArrayOfCertificateRequest.java
 * A wrapper object used by Axis to encapsulate  an array of zero or more {@link CertificateRequest} objects
 * for SOAP transmission via the Web returned as part of a method call's result object.
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 *                 CertificateRequestGetRequest certificaterequestgetrequest = new CertificateRequestGetRequest();
 *                 try {
 *                    certificaterequestgetresult = port.certificateRequestGet(certificaterequestgetrequest);
 *                      }
 *                 catch (RemoteException e) {
 *                         e.printStackTrace();
 *                      }
 *            <b>  ArrayOfCertificateRequest arrocr = certificaterequestgetresult.getCertificateRequests(); </b>
 *                 if(arrocr != null && arrocr.getCertificateRequest().length>0)
 *                  {
 *                      int count =0;
 *                      CertificateRequest eCert=arrocr.getCertificateRequest(count);
 *                      //fetch the properties of CertificateRequest
 *                  }
 * </pre>
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */
public class ArrayOfCertificateRequest  implements java.io.Serializable {

   /**
     *  an array of zero or more {@link CertificateRequest} objects
     */
    private CertificateRequest[] certificateRequest;

    /**
      * Initializes a new instance of the class with an empty array
      * of {@link CertificateRequest} objects.
      */
    public ArrayOfCertificateRequest() {

      certificateRequest= new   CertificateRequest[0];
    }

     /**
     * Initializes a new instance of the class and its internal array
     * of {@link CertificateRequest} objects.
     * @param certificateRequest
     */
    public ArrayOfCertificateRequest(
           CertificateRequest[] certificateRequest) {
           this.certificateRequest = certificateRequest;
    }


   /**
     * Retrieves the raw array of {@link CertificateRequest} objects encapsulated in
     * this object.
     * @return CertificateRequest
     */
    public CertificateRequest[] getCertificateRequest() {
        return certificateRequest;
    }


   /**
     * Allows one to programatically set the raw array of {@link CertificateRequest} objects
     * encapsulated by this object.
     * @param certificateRequest
     */
    public void setCertificateRequest(CertificateRequest[] certificateRequest) {
        this.certificateRequest = certificateRequest;
    }

     /**
     * Retrieves the ith {@link CertificateRequest} object (counting from 0) from the array
     * of CertificateRequest encapsulated in this object. Should only be used if its known
     * that {@link #getCertificateRequest} returns a non-null value and that i < number of CertificateRequests
     * actually in that array.
     * @param i integer from 0 to (number of CertificateRequests -1)
     * @return CertificateRequest
     */
    public CertificateRequest getCertificateRequest(int i) {
        return this.certificateRequest[i];
    }

    /**
     * Allows one to replace the ith {@link CertificateRequest} object (counting from 0) within the array
     * of CertificateRequest encapsulated in this object. Should only be used if its known
     * that {@link #getCertificateRequest} returns a non-null value and that i < number of CertificateRequest
     * actually in that array.
     * @param i integer from 0 to (number of CertificateRequests -1)
     * @param  _value CertificateRequest object to place in the indicated position of the
     * CertificateRequest array
     */
    public void setCertificateRequest(int i, CertificateRequest _value) {
        this.certificateRequest[i] = _value;
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
        if (!(obj instanceof ArrayOfCertificateRequest)) return false;
        ArrayOfCertificateRequest other = (ArrayOfCertificateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certificateRequest==null && other.getCertificateRequest()==null) || 
             (this.certificateRequest!=null &&
              java.util.Arrays.equals(this.certificateRequest, other.getCertificateRequest())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    /**
        *  Serves as a hash function for a particular type,
        * suitable for use in hashing algorithms and data
        * structures like a hash table.
        * @return  hash code for this ArrayOfCertificateRequest object
        * @see java.lang.Object#hashCode
        */

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCertificateRequest() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertificateRequest());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertificateRequest(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCertificateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfCertificateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateRequest"));
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
