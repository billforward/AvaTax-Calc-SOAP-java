

package com.avalara.avatax.services.avacert;
import javax.xml.namespace.*;

/**
 * ReviewStatus.java
 * ReviewStatus indicates the review status for the Certificate record.
 */
public class ReviewStatus implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

   /* Constructor :
    * Initializes a new instance of the ReviewStatus .
    */
    protected ReviewStatus(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    /**
     * The certificate has not yet been reviewed.
     */
    public static final String _PENDING = "PENDING";

     /**
     * The certificate was accepted during review. 
     */
    public static final String _ACCEPTED = "ACCEPTED";

     /**
     *   The certificate was rejected during review. 
     */
    public static final String _REJECTED = "REJECTED";
    public static final ReviewStatus PENDING = new ReviewStatus(_PENDING);
    public static final ReviewStatus ACCEPTED = new ReviewStatus(_ACCEPTED);
    public static final ReviewStatus REJECTED = new ReviewStatus(_REJECTED);
    public String getValue() { return _value_;}
    public static ReviewStatus fromValue(String value)
          throws IllegalArgumentException {
        ReviewStatus enumeration = (ReviewStatus)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }


    public static ReviewStatus fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
     /**
     * Determines whether the specified Object is equal to the current Object.
     * Note: In current implementation all Java Strings members of the two
     * objects must be exactly alike, including in case, for equal to return true.
     * @param obj
     * @return true or false, indicating if the two objects are equal.
     */
    public boolean equals(Object obj) {return (obj == this);}

   /**
     *  Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this ReviewStatus object
     * @see java.lang.Object#hashCode
     */
    public int hashCode() { return toString().hashCode();}

    /**
     * Returns a string representation of the object.
     * @return _value_
     */
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}

    /**
     * Get Axis Custom Serializer; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType, 
           Class _javaType,  
           QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
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
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReviewStatus.class);

    static {
        typeDesc.setXmlType(new QName("http://avatax.avalara.com/services", "ReviewStatus"));
    }
     /**
     * Return Axis type metadata object; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
