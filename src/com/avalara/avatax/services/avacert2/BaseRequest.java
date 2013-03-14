package com.avalara.avatax.services.avacert2;
/**
 * BaseRequest.java
 * All classes used to pass data into a web service method call must implement this base class.
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */
public class BaseRequest  implements java.io.Serializable {

    /**
      * Initializes a new instance of the class 
      */
    public BaseRequest() {
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
        if (!(obj instanceof BaseRequest)) return false;
        BaseRequest other = (BaseRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true;
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    /**
       *  Serves as a hash function for a particular type,
       * suitable for use in hashing algorithms and data
       * structures like a hash table.
       * @return  hash code for this BaseRequest object
       * @see java.lang.Object#hashCode
       */

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BaseRequest"));
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
