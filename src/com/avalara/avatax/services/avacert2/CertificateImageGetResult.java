package com.avalara.avatax.services.avacert2;
/**
 * CertificateImageGetResult.java
 * Contains the get exemption certificates image operation result returned by certificateImageGet
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 *  CertificateImageGetRequest certificateImageGetRequest = new CertificateImageGetRequest();
 *
 *                  certificateImageGetRequest.setAvaCertId ("CBT3");
 *                  certificateImageGetRequest.setCompanyCode ("Default");
 *                  certificateImageGetRequest.setFormat(FormatType.PNG);
 *                  certificateImageGetRequest.setPageNumber(1);
 *                  CertificateImageGetResult certificateImageGetResult = null;
 *                try {
 *             <b>            certificateImageGetResult = port.certificateImageGet(certificateImageGetRequest);</b>
 *                    }       catch (RemoteException e) {
 *                            e.printStackTrace();
 *                    }
 * </pre>
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */


public class CertificateImageGetResult  extends BaseResult  implements java.io.Serializable {

    /**
     * Field contains avaCertId
     */
    private java.lang.String avaCertId;

    /**
     * Field contains image data in byte array
     */
    private byte[] image;


    /**
     * Initializes object of CertificateImageGetResult class with default values.
     */
    public CertificateImageGetResult() {
    }


    /**
     * Initializes object of CertificateImageGetResult class with parametrised values
     * @param avaCertId
     * @param image
     */
    public CertificateImageGetResult(
           java.lang.String avaCertId,
           byte[] image) {
           this.avaCertId = avaCertId;
           this.image = image;
    }


    /**
     * Gets the avaCertId value for this CertificateImageGetResult.
     * 
     * @return avaCertId
     */
    public java.lang.String getAvaCertId() {
        return avaCertId;
    }


    /**
     * Sets the avaCertId value for this CertificateImageGetResult.
     *
     * @param avaCertId
     */
    public void setAvaCertId(java.lang.String avaCertId) {
        this.avaCertId = avaCertId;
    }


    /**
     * Gets the image value for this CertificateImageGetResult.
     * 
     * @return image
     */
    public byte[] getImage() {
        return image;
    }


    /**
     * Sets the image value for this CertificateImageGetResult.
     *
     * @param image
     */
    public void setImage(byte[] image) {
        this.image = image;
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
        if (!(obj instanceof CertificateImageGetResult)) return false;
        CertificateImageGetResult other = (CertificateImageGetResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.avaCertId==null && other.getAvaCertId()==null) || 
             (this.avaCertId!=null &&
              this.avaCertId.equals(other.getAvaCertId()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              java.util.Arrays.equals(this.image, other.getImage())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    /**
         *  Serves as a hash function for a particular type,
         * suitable for use in hashing algorithms and data
         * structures like a hash table.
         * @return  hash code for this CertificateImageGetResult object
         * @see java.lang.Object#hashCode
         */

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAvaCertId() != null) {
            _hashCode += getAvaCertId().hashCode();
        }
        if (getImage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImage(), i);
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
        new org.apache.axis.description.TypeDesc(CertificateImageGetResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateImageGetResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avaCertId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaCertId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
