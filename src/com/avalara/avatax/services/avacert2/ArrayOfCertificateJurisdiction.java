
package com.avalara.avatax.services.avacert2;
/**
 * ArrayOfCertificateJurisdiction.java
 * A wrapper object used by Axis to encapsulate  an array of zero or more {@link CertificateJurisdiction} objects
 * for SOAP transmission via the Web returned as part of a method call's result object.
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 *              Calendar fromdate = Calendar.getInstance();
 *              fromdate.set(2010,01,01);
 *              System.out.println("FromDate:"+fromdate.getTime() );
 *
 *              CertificateGetRequest getExemptionCertificatesRequest = new CertificateGetRequest();
 *              getExemptionCertificatesRequest.setCompanyCode("DEFAULT") ;
 *              getExemptionCertificatesRequest.setCustomerCode("");
 *              getExemptionCertificatesRequest.setModFromDate(fromdate);
 *              getExemptionCertificatesRequest.setModToDate(java.util.Calendar.getInstance());
 *                CertificateGetResult getExemptionCertificatesResult = null;
 *                try {
 *                    getExemptionCertificatesResult = port.certificateGet(getExemptionCertificatesRequest);
 *                } catch (RemoteException e) {
 *                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
 *                }
 *
 *              ArrayOfCertificate arroe = getExemptionCertificatesResult.getCertificates();
 *              if(arroe != null && arroe.getCertificate().length>0)
 *               {
 *                   int count =0;
 *                   Certificate eCert=arroe.getCertificate(count);
 *               <b> ArrayOfCertificateJurisdiction jurisdictions = eCert.getCertificateJurisdictions(); </b>
 *
 *                   for (int i = 0; jurisdictions != null && i < jurisdictions.getCertificateJurisdiction().length; i++)
 *                  {
 *                    CertificateJurisdiction jurisdiction=jurisdictions.getCertificateJurisdiction(i);
 *                    System.out.println(jurisdiction.getJurisdiction());// Prints Associated Jurisdiction Code
 *                   }
 *               }
 * </pre>
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */
public class ArrayOfCertificateJurisdiction  implements java.io.Serializable {

   /**
     *  an array of zero or more {@link CertificateJurisdiction} objects
     */
    private CertificateJurisdiction[] certificateJurisdiction;

    /**
      * Initializes a new instance of the class with an empty array
      * of {@link CertificateJurisdiction} objects.
      */
    public ArrayOfCertificateJurisdiction() {
    }

   /**
     * Initializes a new instance of the class and its internal array
     * of {@link CertificateJurisdiction} objects.
     * @param certificateJurisdiction
     */
    public ArrayOfCertificateJurisdiction(
           CertificateJurisdiction[] certificateJurisdiction) {
           this.certificateJurisdiction = certificateJurisdiction;
    }


    /**
     * Retrieves the raw array of {@link CertificateJurisdiction} objects encapsulated in
     * this object.
     * 
     * @return certificateJurisdiction
     */
    public CertificateJurisdiction[] getCertificateJurisdiction() {
        return certificateJurisdiction;
    }


    /**
     * Allows one to programatically set the raw array of {@link CertificateJurisdiction} objects
     * encapsulated by this object.
     * 
     * @param certificateJurisdiction
     */
    public void setCertificateJurisdiction(CertificateJurisdiction[] certificateJurisdiction) {
        this.certificateJurisdiction = certificateJurisdiction;
    }


   /**
     * Retrieves the ith {@link CertificateJurisdiction} object (counting from 0) from the array
     * of Jurisdiction encapsulated in this object. Should only be used if its known
     * that {@link #getCertificateJurisdiction} returns a non-null value and that i < number of Jurisdiction
     * actually in that array.
     *
     * @param i integer from 0 to (number of CertificateJurisdiction -1)
     * @return CertificateJurisdiction
     */
    public CertificateJurisdiction getCertificateJurisdiction(int i) {
        return this.certificateJurisdiction[i];
    }

    /**
     * Allows one to replace the ith {@link CertificateJurisdiction} object (counting from 0) within the array
     * of Jurisdiction encapsulated in this object. Should only be used if its known
     * that {@link #getCertificateJurisdiction} returns a non-null value and that i < number of Jurisdiction
     * actually in that array.
     *
     * @param i integer from 0 to (number of Jurisdiction -1)
     * @param  _value Jurisdiction object to place in the indicated position of the
     * Jurisdiction array
     */

    public void setCertificateJurisdiction(int i, CertificateJurisdiction _value) {
        this.certificateJurisdiction[i] = _value;
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
        if (!(obj instanceof ArrayOfCertificateJurisdiction)) return false;
        ArrayOfCertificateJurisdiction other = (ArrayOfCertificateJurisdiction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certificateJurisdiction==null && other.getCertificateJurisdiction()==null) || 
             (this.certificateJurisdiction!=null &&
              java.util.Arrays.equals(this.certificateJurisdiction, other.getCertificateJurisdiction())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    /**
     *  Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this ArrayOfCertificateJurisdiction object
     * @see java.lang.Object#hashCode
     */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCertificateJurisdiction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertificateJurisdiction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertificateJurisdiction(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfCertificateJurisdiction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfCertificateJurisdiction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateJurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateJurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateJurisdiction"));
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
