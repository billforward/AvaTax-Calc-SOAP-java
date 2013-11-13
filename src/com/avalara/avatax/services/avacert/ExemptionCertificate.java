
package com.avalara.avatax.services.avacert;
import javax.xml.namespace.*;

/**
 * ExemptionCertificate.java
 * Contains exemption certificate data. Is part of the GetExemptionCertificatesResult result came
 * from the GetExemptionCertificates.
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
 * ArrayOfExemptionCertificate arroe = getExemptionCertificatesResult.getExemptionCertificates();
 * for (int i = 0; arroe != null && i < arroe.getExemptionCertificate().length; i++)
 * {
 * <b>  ExemptionCertificate eCert=arroe.getExemptionCertificate(i);</b>
 *   System.out.println(eCert.getAvaCertId());// Prints Associated AvaCert ID
 * }
 * </pre>
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */

public class ExemptionCertificate  implements java.io.Serializable {
    /**
     * Unique identifier for the Certificate record.
     */
    private String avaCertId;       //
     /**
     *Jurisdictions contains the details of Jurisdiction.
     */
    private ArrayOfJurisdiction jurisdictions;  //
     /**
     * Customer identification codes for the customer associated with the Certificate record
     */
    private ArrayOfString customerCodes; //
     /**
     *Type code for the customer associated with the Certificate record
     */
    private String customerType;  //
     /**
     * Source location display name for the Certificate record (the client location responsible for tracking the certificate).
     */
    private String locationName; //
     /**
     * Source location code for the Certificate record (the client location responsible for tracking the certificate).
     */
    private String locationCode; //
     /**
     *
      * Status for the Certificate record.
     */
    private CertificateStatus certificateStatus; //
     /**
     * /Review status for the Certificate record.
     */
    private ReviewStatus reviewStatus;
     /**
     *  Creation date of the Certificate record.
     */
    private java.util.Calendar createdDate; //
     /**
     * Last modification date of the Certificate record.
     */
    private java.util.Calendar modifiedDate;//
     /**
     * Date of the most recently received image content for the Certificate record (usually via fax).
     */
    private java.util.Calendar receivedDate; //
     /**
     *  Exempt customer business name for the Certificate record.
     */
    private String businessName; //
     /**
     *  Exempt customer address1 field for the Certificate record.
     */
    private String address1;   //
     /**
     *  Exempt customer address2 field for the Certificate record.
     */
    private String address2;   //
     /**
     * Exempt customer city address field for the Certificate record.
     */
    private String city;      //
     /**
     *  Exempt customer region address field for the Certificate record.
     */
    private String region;    //
     /**
     *   Exempt customer country address field for the Certificate record.
     */
    private String country;     //
     /**
     *  Exempt customer US zip or zip+4 code (or CA postal code) address field for the Certificate record.
     */
    private String postalCode; //
     /**
     *  Exempt customer phone number field for the Certificate record
     */
    private String phone;   //
     /**
     *    Exempt customer email address field for the Certificate record.
     */
    private String email;    //
     /**
     *  Effective date (or the actual signature date) of the Certificate record.
     */
    private java.util.Calendar signedDate; //
     /**
     *   Exempt customer signer name field for the Certificate record.
     */
    private String signerName;      //
     /**
     *   Exempt customer signer title field for the Certificate record.
     */
    private String signerTitle;   //
     /**
     * Exempt customer business description field for the Certificate record.
     */
    private String businessDescription;  //
     /**
     *  Seller property description the exempt customer selected for the Certificate record.
     */
    private String sellerPropertyDescription;   //
     /**
     *  Usage type for the Certificate record.
     */
    private CertificateUsage certificateUsage;  //
     /**
     *  Whether the Certificate record is considered "partially exempt".
     */
    private Boolean isPartialExemption;   //
     /**
     *  Client-specified exemption reason code for the Certificate record.
     */
    private String exemptReasonCode;     //

     /**
     * Name of the state-issued form for the Certificate record; either a system-defined code name or a client-specified custom name.
     */
     private String exemptFormName;  //
      /**
     *  (Optional) Client-specified value for custom Certificate field 1, if enabled.
     */
    private String custom1;   //
     /**
     * (Optional) Client-specified value for custom Certificate field 2, if enabled
     */
    private String custom2;   //  .
     /**
     * (Optional) Client-specified value for custom Certificate field 3, if enabled.
     */
    private String custom3;   //
   


   /**
     * Initializes a new instance of the class with default
     */
    public ExemptionCertificate() {
    }

    /**
     * Initializes a new instance of the class with parametrized values
     * @param avaCertId
     * @param jurisdictions
     * @param customerCodes
     * @param customerType
     * @param locationName
     * @param locationCode
     * @param certificateStatus
     * @param reviewStatus
     * @param createdDate
     * @param modifiedDate
     * @param receivedDate
     * @param businessName
     * @param address1
     * @param address2
     * @param city
     * @param region
     * @param country
     * @param postalCode
     * @param phone
     * @param email
     * @param signedDate
     * @param signerName
     * @param signerTitle
     * @param businessDescription
     * @param sellerPropertyDescription
     * @param certificateUsage
     * @param isPartialExemption
     * @param exemptReasonCode
     * @param exemptFormName
     * @param custom1
     * @param custom2
     * @param custom3
     */
    public ExemptionCertificate(
           String avaCertId,
           ArrayOfJurisdiction jurisdictions,
            ArrayOfString customerCodes,
           String customerType,
           String locationName,
           String locationCode,
           CertificateStatus certificateStatus,
          ReviewStatus reviewStatus,
           java.util.Calendar createdDate,
           java.util.Calendar modifiedDate,
           java.util.Calendar receivedDate,
           String businessName,
           String address1,
           String address2,
           String city,
           String region,
           String country,
           String postalCode,
           String phone,
           String email,
           java.util.Calendar signedDate,
           String signerName,
           String signerTitle,
           String businessDescription,
           String sellerPropertyDescription,
           CertificateUsage certificateUsage,
           Boolean isPartialExemption,
           String exemptReasonCode,
           String exemptFormName,
           String custom1,
           String custom2,
           String custom3) {
           this.avaCertId = avaCertId;
           this.jurisdictions = jurisdictions;
           this.customerCodes = customerCodes;
           this.customerType = customerType;
           this.locationName = locationName;
           this.locationCode = locationCode;
           this.certificateStatus = certificateStatus;
           this.reviewStatus = reviewStatus;
           this.createdDate = createdDate;
           this.modifiedDate = modifiedDate;
           this.receivedDate = receivedDate;
           this.businessName = businessName;
           this.address1 = address1;
           this.address2 = address2;
           this.city = city;
           this.region = region;
           this.country = country;
           this.postalCode = postalCode;
           this.phone = phone;
           this.email = email;
           this.signedDate = signedDate;
           this.signerName = signerName;
           this.signerTitle = signerTitle;
           this.businessDescription = businessDescription;
           this.sellerPropertyDescription = sellerPropertyDescription;
           this.certificateUsage = certificateUsage;
           this.isPartialExemption = isPartialExemption;
           this.exemptReasonCode = exemptReasonCode;
           this.exemptFormName = exemptFormName;
           this.custom1 = custom1;
           this.custom2 = custom2;
           this.custom3 = custom3;
    }


    /**
     * Gets the avaCertId value for this ExemptionCertificate.
     * 
     * @return avaCertId
     */
    public String getAvaCertId() {
        return avaCertId;
    }


    /**
     * Sets the avaCertId value for this ExemptionCertificate.
     * 
     * @param avaCertId
     */
    public void setAvaCertId(String avaCertId) {
        this.avaCertId = avaCertId;
    }


    /**
     * Gets the jurisdictions value for this ExemptionCertificate.
     * 
     * @return jurisdictions
     */
    public ArrayOfJurisdiction getJurisdictions() {
        return jurisdictions;
    }


    /**
     * Sets the jurisdictions value for this ExemptionCertificate.
     * 
     * @param jurisdictions
     */
    public void setJurisdictions(ArrayOfJurisdiction jurisdictions) {
        this.jurisdictions = jurisdictions;
    }


    /**
     * Gets the customerCodes value for this ExemptionCertificate.
     * 
     * @return customerCodes
     */
    public ArrayOfString getCustomerCodes() {
        return customerCodes;
    }


    /**
     * Sets the customerCodes value for this ExemptionCertificate.
     * 
     * @param customerCodes
     */
    public void setCustomerCodes(ArrayOfString customerCodes) {
        this.customerCodes = customerCodes;
    }


    /**
     * Gets the customerType value for this ExemptionCertificate.
     * 
     * @return customerType
     */
    public String getCustomerType() {
        return customerType;
    }


    /**
     * Sets the customerType value for this ExemptionCertificate.
     * 
     * @param customerType
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }


    /**
     * Gets the locationName value for this ExemptionCertificate.
     * 
     * @return locationName
     */
    public String getLocationName() {
        return locationName;
    }


    /**
     * Sets the locationName value for this ExemptionCertificate.
     * 
     * @param locationName
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }


    /**
     * Gets the locationCode value for this ExemptionCertificate.
     * 
     * @return locationCode
     */
    public String getLocationCode() {
        return locationCode;
    }


    /**
     * Sets the locationCode value for this ExemptionCertificate.
     * 
     * @param locationCode
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }


    /**
     * Gets the certificateStatus value for this ExemptionCertificate.
     * 
     * @return certificateStatus
     */
    public CertificateStatus getCertificateStatus() {
        return certificateStatus;
    }


    /**
     * Sets the certificateStatus value for this ExemptionCertificate.
     * 
     * @param certificateStatus
     */
    public void setCertificateStatus(CertificateStatus certificateStatus) {
        this.certificateStatus = certificateStatus;
    }


    /**
     * Gets the reviewStatus value for this ExemptionCertificate.
     * 
     * @return reviewStatus
     */
    public ReviewStatus getReviewStatus() {
        return reviewStatus;
    }


    /**
     * Sets the reviewStatus value for this ExemptionCertificate.
     * 
     * @param reviewStatus
     */
    public void setReviewStatus(ReviewStatus reviewStatus) {
        this.reviewStatus = reviewStatus;
    }


    /**
     * Gets the createdDate value for this ExemptionCertificate.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ExemptionCertificate.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the modifiedDate value for this ExemptionCertificate.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this ExemptionCertificate.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the receivedDate value for this ExemptionCertificate.
     * 
     * @return receivedDate
     */
    public java.util.Calendar getReceivedDate() {
        return receivedDate;
    }


    /**
     * Sets the receivedDate value for this ExemptionCertificate.
     * 
     * @param receivedDate
     */
    public void setReceivedDate(java.util.Calendar receivedDate) {
        this.receivedDate = receivedDate;
    }


    /**
     * Gets the businessName value for this ExemptionCertificate.
     * 
     * @return businessName
     */
    public String getBusinessName() {
        return businessName;
    }


    /**
     * Sets the businessName value for this ExemptionCertificate.
     * 
     * @param businessName
     */
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }


    /**
     * Gets the address1 value for this ExemptionCertificate.
     * 
     * @return address1
     */
    public String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this ExemptionCertificate.
     * 
     * @param address1
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this ExemptionCertificate.
     * 
     * @return address2
     */
    public String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this ExemptionCertificate.
     * 
     * @param address2
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the city value for this ExemptionCertificate.
     * 
     * @return city
     */
    public String getCity() {
        return city;
    }


    /**
     * Sets the city value for this ExemptionCertificate.
     * 
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }


    /**
     * Gets the region value for this ExemptionCertificate.
     * 
     * @return region
     */
    public String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this ExemptionCertificate.
     * 
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }


    /**
     * Gets the country value for this ExemptionCertificate.
     * 
     * @return country
     */
    public String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this ExemptionCertificate.
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * Gets the postalCode value for this ExemptionCertificate.
     * 
     * @return postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this ExemptionCertificate.
     * 
     * @param postalCode
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the phone value for this ExemptionCertificate.
     * 
     * @return phone
     */
    public String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this ExemptionCertificate.
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * Gets the email value for this ExemptionCertificate.
     * 
     * @return email
     */
    public String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ExemptionCertificate.
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Gets the signedDate value for this ExemptionCertificate.
     * 
     * @return signedDate
     */
    public java.util.Calendar getSignedDate() {
        return signedDate;
    }


    /**
     * Sets the signedDate value for this ExemptionCertificate.
     * 
     * @param signedDate
     */
    public void setSignedDate(java.util.Calendar signedDate) {
        this.signedDate = signedDate;
    }


    /**
     * Gets the signerName value for this ExemptionCertificate.
     * 
     * @return signerName
     */
    public String getSignerName() {
        return signerName;
    }


    /**
     * Sets the signerName value for this ExemptionCertificate.
     * 
     * @param signerName
     */
    public void setSignerName(String signerName) {
        this.signerName = signerName;
    }


    /**
     * Gets the signerTitle value for this ExemptionCertificate.
     * 
     * @return signerTitle
     */
    public String getSignerTitle() {
        return signerTitle;
    }


    /**
     * Sets the signerTitle value for this ExemptionCertificate.
     * 
     * @param signerTitle
     */
    public void setSignerTitle(String signerTitle) {
        this.signerTitle = signerTitle;
    }


    /**
     * Gets the businessDescription value for this ExemptionCertificate.
     * 
     * @return businessDescription
     */
    public String getBusinessDescription() {
        return businessDescription;
    }


    /**
     * Sets the businessDescription value for this ExemptionCertificate.
     * 
     * @param businessDescription
     */
    public void setBusinessDescription(String businessDescription) {
        this.businessDescription = businessDescription;
    }


    /**
     * Gets the sellerPropertyDescription value for this ExemptionCertificate.
     * 
     * @return sellerPropertyDescription
     */
    public String getSellerPropertyDescription() {
        return sellerPropertyDescription;
    }


    /**
     * Sets the sellerPropertyDescription value for this ExemptionCertificate.
     * 
     * @param sellerPropertyDescription
     */
    public void setSellerPropertyDescription(String sellerPropertyDescription) {
        this.sellerPropertyDescription = sellerPropertyDescription;
    }


    /**
     * Gets the certificateUsage value for this ExemptionCertificate.
     * 
     * @return certificateUsage
     */
    public CertificateUsage getCertificateUsage() {
        return certificateUsage;
    }


    /**
     * Sets the certificateUsage value for this ExemptionCertificate.
     * 
     * @param certificateUsage
     */
    public void setCertificateUsage(CertificateUsage certificateUsage) {
        this.certificateUsage = certificateUsage;
    }


    /**
     * Gets the isPartialExemption value for this ExemptionCertificate.
     * 
     * @return isPartialExemption
     */
    public Boolean getIsPartialExemption() {
        return isPartialExemption;
    }


    /**
     * Sets the isPartialExemption value for this ExemptionCertificate.
     * 
     * @param isPartialExemption
     */
    public void setIsPartialExemption(Boolean isPartialExemption) {
        this.isPartialExemption = isPartialExemption;
    }


    /**
     * Gets the exemptReasonCode value for this ExemptionCertificate.
     * 
     * @return exemptReasonCode
     */
    public String getExemptReasonCode() {
        return exemptReasonCode;
    }


    /**
     * Sets the exemptReasonCode value for this ExemptionCertificate.
     * 
     * @param exemptReasonCode
     */
    public void setExemptReasonCode(String exemptReasonCode) {
        this.exemptReasonCode = exemptReasonCode;
    }


    /**
     * Gets the exemptFormName value for this ExemptionCertificate.
     * 
     * @return exemptFormName
     */
    public String getExemptFormName() {
        return exemptFormName;
    }


    /**
     * Sets the exemptFormName value for this ExemptionCertificate.
     * 
     * @param exemptFormName
     */
    public void setExemptFormName(String exemptFormName) {
        this.exemptFormName = exemptFormName;
    }


    /**
     * Gets the custom1 value for this ExemptionCertificate.
     * 
     * @return custom1
     */
    public String getCustom1() {
        return custom1;
    }


    /**
     * Sets the custom1 value for this ExemptionCertificate.
     * 
     * @param custom1
     */
    public void setCustom1(String custom1) {
        this.custom1 = custom1;
    }


    /**
     * Gets the custom2 value for this ExemptionCertificate.
     * 
     * @return custom2
     */
    public String getCustom2() {
        return custom2;
    }


    /**
     * Sets the custom2 value for this ExemptionCertificate.
     * 
     * @param custom2
     */
    public void setCustom2(String custom2) {
        this.custom2 = custom2;
    }


    /**
     * Gets the custom3 value for this ExemptionCertificate.
     * 
     * @return custom3
     */
    public String getCustom3() {
        return custom3;
    }


    /**
     * Sets the custom3 value for this ExemptionCertificate.
     * 
     * @param custom3
     */
    public void setCustom3(String custom3) {
        this.custom3 = custom3;
    }

    private Object __equalsCalc = null;

    /**
     * Determines whether the specified Object is equal to the current Object.
     * Note: In current implementation all Java Strings members of the two
     * objects must be exactly alike, including in case, for equal to return true.
     * @param obj
     * @return true or false, indicating if the two objects are equal.
     */
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ExemptionCertificate)) return false;
        ExemptionCertificate other = (ExemptionCertificate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.avaCertId==null && other.getAvaCertId()==null) || 
             (this.avaCertId!=null &&
              this.avaCertId.equals(other.getAvaCertId()))) &&
            ((this.jurisdictions==null && other.getJurisdictions()==null) || 
             (this.jurisdictions!=null &&
              this.jurisdictions.equals(other.getJurisdictions()))) &&
            ((this.customerCodes==null && other.getCustomerCodes()==null) || 
             (this.customerCodes!=null &&
              this.customerCodes.equals(other.getCustomerCodes()))) &&
            ((this.customerType==null && other.getCustomerType()==null) || 
             (this.customerType!=null &&
              this.customerType.equals(other.getCustomerType()))) &&
            ((this.locationName==null && other.getLocationName()==null) || 
             (this.locationName!=null &&
              this.locationName.equals(other.getLocationName()))) &&
            ((this.locationCode==null && other.getLocationCode()==null) || 
             (this.locationCode!=null &&
              this.locationCode.equals(other.getLocationCode()))) &&
            ((this.certificateStatus==null && other.getCertificateStatus()==null) || 
             (this.certificateStatus!=null &&
              this.certificateStatus.equals(other.getCertificateStatus()))) &&
            ((this.reviewStatus==null && other.getReviewStatus()==null) || 
             (this.reviewStatus!=null &&
              this.reviewStatus.equals(other.getReviewStatus()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.receivedDate==null && other.getReceivedDate()==null) || 
             (this.receivedDate!=null &&
              this.receivedDate.equals(other.getReceivedDate()))) &&
            ((this.businessName==null && other.getBusinessName()==null) || 
             (this.businessName!=null &&
              this.businessName.equals(other.getBusinessName()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.signedDate==null && other.getSignedDate()==null) || 
             (this.signedDate!=null &&
              this.signedDate.equals(other.getSignedDate()))) &&
            ((this.signerName==null && other.getSignerName()==null) || 
             (this.signerName!=null &&
              this.signerName.equals(other.getSignerName()))) &&
            ((this.signerTitle==null && other.getSignerTitle()==null) || 
             (this.signerTitle!=null &&
              this.signerTitle.equals(other.getSignerTitle()))) &&
            ((this.businessDescription==null && other.getBusinessDescription()==null) || 
             (this.businessDescription!=null &&
              this.businessDescription.equals(other.getBusinessDescription()))) &&
            ((this.sellerPropertyDescription==null && other.getSellerPropertyDescription()==null) || 
             (this.sellerPropertyDescription!=null &&
              this.sellerPropertyDescription.equals(other.getSellerPropertyDescription()))) &&
            ((this.certificateUsage==null && other.getCertificateUsage()==null) || 
             (this.certificateUsage!=null &&
              this.certificateUsage.equals(other.getCertificateUsage()))) &&
            ((this.isPartialExemption==null && other.getIsPartialExemption()==null) || 
             (this.isPartialExemption!=null &&
              this.isPartialExemption.equals(other.getIsPartialExemption()))) &&
            ((this.exemptReasonCode==null && other.getExemptReasonCode()==null) || 
             (this.exemptReasonCode!=null &&
              this.exemptReasonCode.equals(other.getExemptReasonCode()))) &&
            ((this.exemptFormName==null && other.getExemptFormName()==null) || 
             (this.exemptFormName!=null &&
              this.exemptFormName.equals(other.getExemptFormName()))) &&
            ((this.custom1==null && other.getCustom1()==null) || 
             (this.custom1!=null &&
              this.custom1.equals(other.getCustom1()))) &&
            ((this.custom2==null && other.getCustom2()==null) || 
             (this.custom2!=null &&
              this.custom2.equals(other.getCustom2()))) &&
            ((this.custom3==null && other.getCustom3()==null) || 
             (this.custom3!=null &&
              this.custom3.equals(other.getCustom3())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

   /**
     *  Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this CertificateUsage object
     * @see java.lang.Object#hashCode
     */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAvaCertId() != null) {
            _hashCode += getAvaCertId().hashCode();
        }
        if (getJurisdictions() != null) {
            _hashCode += getJurisdictions().hashCode();
        }
        if (getCustomerCodes() != null) {
            _hashCode += getCustomerCodes().hashCode();
        }
        if (getCustomerType() != null) {
            _hashCode += getCustomerType().hashCode();
        }
        if (getLocationName() != null) {
            _hashCode += getLocationName().hashCode();
        }
        if (getLocationCode() != null) {
            _hashCode += getLocationCode().hashCode();
        }
        if (getCertificateStatus() != null) {
            _hashCode += getCertificateStatus().hashCode();
        }
        if (getReviewStatus() != null) {
            _hashCode += getReviewStatus().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getReceivedDate() != null) {
            _hashCode += getReceivedDate().hashCode();
        }
        if (getBusinessName() != null) {
            _hashCode += getBusinessName().hashCode();
        }
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getSignedDate() != null) {
            _hashCode += getSignedDate().hashCode();
        }
        if (getSignerName() != null) {
            _hashCode += getSignerName().hashCode();
        }
        if (getSignerTitle() != null) {
            _hashCode += getSignerTitle().hashCode();
        }
        if (getBusinessDescription() != null) {
            _hashCode += getBusinessDescription().hashCode();
        }
        if (getSellerPropertyDescription() != null) {
            _hashCode += getSellerPropertyDescription().hashCode();
        }
        if (getCertificateUsage() != null) {
            _hashCode += getCertificateUsage().hashCode();
        }
        if (getIsPartialExemption() != null) {
            _hashCode += getIsPartialExemption().hashCode();
        }
        if (getExemptReasonCode() != null) {
            _hashCode += getExemptReasonCode().hashCode();
        }
        if (getExemptFormName() != null) {
            _hashCode += getExemptFormName().hashCode();
        }
        if (getCustom1() != null) {
            _hashCode += getCustom1().hashCode();
        }
        if (getCustom2() != null) {
            _hashCode += getCustom2().hashCode();
        }
        if (getCustom3() != null) {
            _hashCode += getCustom3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExemptionCertificate.class, true);

    static {
        typeDesc.setXmlType(new QName("http://avatax.avalara.com/services", "ExemptionCertificate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avaCertId");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "AvaCertId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jurisdictions");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "Jurisdictions"));
        elemField.setXmlType(new QName("http://avatax.avalara.com/services", "ArrayOfJurisdiction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCodes");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "CustomerCodes"));
        elemField.setXmlType(new QName("http://avatax.avalara.com/services", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerType");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "CustomerType"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationName");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "LocationName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCode");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "LocationCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateStatus");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "CertificateStatus"));
        elemField.setXmlType(new QName("http://avatax.avalara.com/services", "CertificateStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewStatus");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "CertificateReviewStatus"));
        elemField.setXmlType(new QName("http://avatax.avalara.com/services", "ReviewStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "CreatedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "ModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivedDate");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "ReceivedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessName");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "BusinessName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "Address1"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "Address2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "City"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "Region"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "Country"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "PostalCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "Phone"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "Email"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signedDate");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "SignedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signerName");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "SignerName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signerTitle");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "SignerTitle"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessDescription");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "BusinessDescription"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerPropertyDescription");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "SellerPropertyDescription"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateUsage");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "CertificateUsage"));
        elemField.setXmlType(new QName("http://avatax.avalara.com/services", "CertificateUsage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPartialExemption");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "IsPartialExemption"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptReasonCode");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "ExemptReasonCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptFormName");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "ExemptFormName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom1");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "Custom1"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom2");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "Custom2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom3");
        elemField.setXmlName(new QName("http://avatax.avalara.com/services", "Custom3"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
