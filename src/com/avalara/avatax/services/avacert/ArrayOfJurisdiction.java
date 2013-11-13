package com.avalara.avatax.services.avacert;
import java.util.Arrays;
import javax.xml.namespace.*;

/**
 * ArrayOfJurisdiction.java
 * A wrapper object used by Axis to encapsulate  an array of zero or more {@link Jurisdiction} objects
 * for SOAP transmission via the Web returned as part of a method call's result object.
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 *     Calendar fromdate = Calendar.getInstance();
 *     Date dd = new Date();
 *     fromdate.set(2010,11,24);
 *     System.out.println("FromDate:"+fromdate.getTime() );
 *     GetExemptionCertificatesRequest getExemptionCertificatesRequest = new GetExemptionCertificatesRequest();
 *     getExemptionCertificatesRequest.setCompanyCode("Default") ;
 *     getExemptionCertificatesRequest.setFromDate(fromdate);
 *     getExemptionCertificatesRequest.setToDate(java.util.Calendar.getInstance());
 *     GetExemptionCertificatesResult getExemptionCertificatesResult = port.getExemptionCertificates(getExemptionCertificatesRequest);
 *     ArrayOfExemptionCertificate exemptioncertificates = getExemptionCertificatesResult.getExemptionCertificates();
 *         if(exemptioncertificates != null && exemptioncertificates.getExemptionCertificate().length>0)
 *         {
 *                      int count =0;
 *                      ExemptionCertificate eCert=exemptioncertificates.getExemptionCertificate(count);
 *  <b>                    ArrayOfJurisdiction jurisdictions = eCert.getJurisdictions(); </b>
 *
 *                      for (int i = 0; jurisdictions != null && i < jurisdictions.getJurisdiction().length; i++)
 *                       {
 *                        Jurisdiction jurisdiction=jurisdictions.getJurisdiction(i);
 *                        System.out.println(jurisdiction.getJurisdictionCode());// Prints Associated Jurisdiction Code
 *                      }
 *         }
 * </pre>
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */


public class ArrayOfJurisdiction  implements java.io.Serializable {         

    /**
     *  an array of zero or more {@link Jurisdiction} objects
     */
    private Jurisdiction[] jurisdiction;

    /**
      * Initializes a new instance of the class with an empty array
      * of {@link Jurisdiction} objects.
      */

    public ArrayOfJurisdiction() {
    }

      /**
     * Initializes a new instance of the class and its internal array
     * of {@link Jurisdiction} objects.
     * @param jurisdiction
     */
    public ArrayOfJurisdiction(
           Jurisdiction[] jurisdiction) {
           this.jurisdiction = jurisdiction;
    }


      /**
     * Retrieves the raw array of {@link Jurisdiction} objects encapsulated in
     * this object.
     *
     * @return Jurisdiction[]
     */
    public Jurisdiction[] getJurisdiction() {
        return jurisdiction;
    }


    /**
     * Allows one to programatically set the raw array of {@link Jurisdiction} objects
     * encapsulated by this object.
     *
     * @param jurisdiction
     */
    public void setJurisdiction(Jurisdiction[] jurisdiction) {
        this.jurisdiction = jurisdiction;
    }


     /**
     * Retrieves the ith {@link Jurisdiction} object (counting from 0) from the array
     * of Jurisdiction encapsulated in this object. Should only be used if its known
     * that {@link #getJurisdiction} returns a non-null value and that i < number of Jurisdiction
     * actually in that array.
     *
     * @param i integer from 0 to (number of Jurisdiction -1)
     * @return Jurisdiction
     */
    public Jurisdiction getJurisdiction(int i) {
        return this.jurisdiction[i];
    }

     /**
     * Allows one to replace the ith {@link Jurisdiction} object (counting from 0) within the array
     * of Jurisdiction encapsulated in this object. Should only be used if its known
     * that {@link #getJurisdiction} returns a non-null value and that i < number of Jurisdiction
     * actually in that array.
     *
     * @param i integer from 0 to (number of Jurisdiction -1)
     * @param  _value Jurisdiction object to place in the indicated position of the
     * Jurisdiction array
     */
    public void setJurisdiction(int i, Jurisdiction _value) {
        this.jurisdiction[i] = _value;
    }

    private Object __equalsCalc = null;

    /**
     * Determines whether the specified Object is equal to the current Object.
     * Note: In current implementation all Java Strings members of the two
     * objects must be exactly alike, including in case, for equal to return true.
     * @param obj
     * @return true or false, indicating if the two objects are equal.
     */
    public synchronized boolean equals( Object obj) {
        if (!(obj instanceof ArrayOfJurisdiction)) return false;
        ArrayOfJurisdiction other = (ArrayOfJurisdiction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jurisdiction==null && other.getJurisdiction()==null) || 
             (this.jurisdiction!=null &&
              Arrays.equals(this.jurisdiction, other.getJurisdiction())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    /**
     *  Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this ArrayOfJurisdiction object
     * @see java.lang.Object#hashCode
     */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getJurisdiction() != null) {
            for (int i=0;
                 i< java.lang.reflect.Array.getLength(getJurisdiction());
                 i++) {
                 Object obj = java.lang.reflect.Array.get(getJurisdiction(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfJurisdiction.class, true);

    static {
        typeDesc.setXmlType(new QName("http://avatax.avalara.com/services", "ArrayOfJurisdiction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jurisdiction");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "Jurisdiction"));
        elemField.setXmlType(new QName("http://avatax.avalara.com/services", "Jurisdiction"));
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
            String mechType,
            Class _javaType,
            QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

     /**
     * Get Axis Custom Deserializer; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
