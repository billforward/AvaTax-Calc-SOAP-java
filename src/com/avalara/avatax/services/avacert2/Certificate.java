package com.avalara.avatax.services.avacert2;

/**
 * Certificate.java
 *
 * Contains  certificate data. Is part of the CertificateGetResult  came
 * from the getCertificates.
 * <br><b>Example:</b>
 * <pre>
 * [Java]
 * Calendar fromdate = Calendar.getInstance();
 *                  fromdate.set(2010,01,01);
 *                  System.out.println("FromDate:"+fromdate.getTime() );
 *
 *                  CertificateGetRequest getExemptionCertificatesRequest = new CertificateGetRequest();
 *                  getExemptionCertificatesRequest.setCompanyCode("DEFAULT") ;
 *                  getExemptionCertificatesRequest.setModFromDate(fromdate);
 *                  getExemptionCertificatesRequest.setModToDate(java.util.Calendar.getInstance());
 *
 *                  CertificateGetResult getExemptionCertificatesResult = port.certificateGet(getExemptionCertificatesRequest);
 *                  ArrayOfCertificate arroe = getExemptionCertificatesResult.getCertificates();
 *                  if(arroe != null && arroe.getCertificate().length>0)
 *                  {
 *                      int count =0;
 *                   <b>   Certificate eCert=arroe.getCertificate(count); </b>
 *                      ArrayOfString arros = eCert.getCustomerCodes();
 *
 *                      for (int i = 0; arros != null && i < arros.getString().length; i++)
 *                      {
 *                        String str=arros.getString(i);
 *                        System.out.println(str);// Prints retrived CustomerCode
 *                      }
 *                  }
 * </pre>
 * @author Nitin Shirsat
 * Copyright (c) 2011, Avalara.  All rights reserved.
 */




public class Certificate  implements java.io.Serializable {
    /**
     * Unique identifier for the Certificate record.
     */

    private java.lang.String avaCertId;
     /**
     *Jurisdictions contains the details of Jurisdiction.
     */

    private ArrayOfCertificateJurisdiction certificateJurisdictions;
     /**
     * Customer identification codes for the customer associated with the Certificate record
     */
    private ArrayOfString customerCodes;
       /**
     *Type code for the customer associated with the Certificate record
     */

     private java.lang.String sourceLocationName;
    /**
     * Source location code for the Certificate record (the client location responsible for tracking the certificate).
     */
    private java.lang.String sourceLocationCode;
     /**
     *
      * Status for the Certificate record.
     */
    private CertificateStatus certificateStatus;
     /**
     * /Review status for the Certificate record.
     */
    private ReviewStatus reviewStatus;

    /**
     * Reason Code gives result
     */

    private java.lang.String rejectionReasonCode;
    /**
      * reason Detail Code for certificate record
      */

    private java.lang.String rejectionReasonDetailCode;
    
    /**
      * Reason Custom text for certificate record
      */
    private java.lang.String rejectionReasonCustomText;
     /**
     *  Creation date of the Certificate record.
     */
    private java.util.Calendar createdDate;
     /**
     * Last modification date of the Certificate record.
     */
    private java.util.Calendar lastModifyDate;
       /**
     * Date of the most recently received image content for the Certificate record (usually via fax).
     */
    private java.util.Calendar docReceivedDate;
     /**
     *  Exempt customer business name for the Certificate record.
     */
    private java.lang.String businessName;
      /**
     *  Exempt customer address1 field for the Certificate record.
     */
    private java.lang.String address1;
     /**
     *  Exempt customer address2 field for the Certificate record.
     */
    private java.lang.String address2;
     /**
     * Exempt customer city address field for the Certificate record.
     */
    private java.lang.String city;
     /**
     *  Exempt customer state address field for the Certificate record.
     */
    private java.lang.String state;
     /**
     *   Exempt customer country address field for the Certificate record.
     */
    private java.lang.String country;
     /**
     *  Exempt customer US zip or zip+4 code (or CA postal code) address field for the Certificate record.
     */
    private java.lang.String zip;
     /**
     *  Exempt customer phone number field for the Certificate record
     */
    private java.lang.String phone;
     /**
     *    Exempt customer email address field for the Certificate record.
     */
    private java.lang.String email;
   /**
     *   Exempt customer signer name field for the Certificate record.
     */
    private java.lang.String signerName;
     /**
     *   Exempt customer signer title field for the Certificate record.
     */
    private java.lang.String signerTitle;
    /**
     *  Effective date (or the actual signature date) of the Certificate record.
     */
    private java.util.Calendar signedDate;
     /**
     * Exempt customer business description field for the Certificate record.
     */
    private java.lang.String businessDescription;
     /**
     *  Seller property description the exempt customer selected for the Certificate record.
     */
    private java.lang.String sellerPropertyDescription;
      /**
     *  Usage type for the Certificate record.
     */
    private CertificateUsage certificateUsage;
    /**
     *  Whether the Certificate record is considered "partially exempt".
     */
    private java.lang.Boolean isPartialExemption;
     /**
     *  Client-specified exemption reason code for the Certificate record.
     */
    private java.lang.String exemptReasonCode;
     /**
     * Name of the state-issued form for the Certificate record; either a system-defined code name or a client-specified custom name.
     */
    private java.lang.String exemptFormName;
     /**
     * (Optional) Client-specified value for custom Certificate field 1, if enabled
     */
    private java.lang.String custom1;
     /**
     * (Optional) Client-specified value for custom Certificate field 2, if enabled.
     */
    private java.lang.String custom2;
       /**
     * (Optional) Client-specified value for custom Certificate field 3, if enabled.
     */
    private java.lang.String custom3;
     /**
     * Page Count of the Certificate
     */
    private java.lang.Integer pageCount;

    /**
     * Initializes a new instance of the class with default
     */
    public Certificate() {
    }

    /**
     * Initializes a new instance of the class with parameter values
     * @param avaCertId
     * @param certificateJurisdictions
     * @param customerCodes
         * @param sourceLocationName
     * @param sourceLocationCode
     * @param certificateStatus
     * @param reviewStatus
     * @param rejectionReasonCode
     * @param rejectionReasonDetailCode
     * @param rejectionReasonCustomText
     * @param createdDate
     * @param lastModifyDate
     * @param docReceivedDate
     * @param businessName
     * @param address1
     * @param address2
     * @param city
     * @param state
     * @param country
     * @param zip
     * @param phone
     * @param email
     * @param signerName
     * @param signerTitle
     * @param signedDate
     * @param businessDescription
     * @param sellerPropertyDescription
     * @param certificateUsage
     * @param isPartialExemption
     * @param exemptReasonCode
     * @param exemptFormName
     * @param custom1
     * @param custom2
     * @param custom3
     * @param pageCount
     */
    public Certificate(
           java.lang.String avaCertId,
           ArrayOfCertificateJurisdiction certificateJurisdictions,
           ArrayOfString customerCodes,
           java.lang.String sourceLocationName,
           java.lang.String sourceLocationCode,
           CertificateStatus certificateStatus,
           ReviewStatus reviewStatus,
           java.lang.String rejectionReasonCode,
           java.lang.String rejectionReasonDetailCode,
           java.lang.String rejectionReasonCustomText,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifyDate,
           java.util.Calendar docReceivedDate,
           java.lang.String businessName,
           java.lang.String address1,
           java.lang.String address2,
           java.lang.String city,
           java.lang.String state,
           java.lang.String country,
           java.lang.String zip,
           java.lang.String phone,
           java.lang.String email,
           java.lang.String signerName,
           java.lang.String signerTitle,
           java.util.Calendar signedDate,
           java.lang.String businessDescription,
           java.lang.String sellerPropertyDescription,
           CertificateUsage certificateUsage,
           java.lang.Boolean isPartialExemption,
           java.lang.String exemptReasonCode,
           java.lang.String exemptFormName,
           java.lang.String custom1,
           java.lang.String custom2,
           java.lang.String custom3,
           java.lang.Integer pageCount) {
           this.avaCertId = avaCertId;
           this.certificateJurisdictions = certificateJurisdictions;
           this.customerCodes = customerCodes;
           this.sourceLocationName = sourceLocationName;
           this.sourceLocationCode = sourceLocationCode;
           this.certificateStatus = certificateStatus;
           this.reviewStatus = reviewStatus;
           this.rejectionReasonCode = rejectionReasonCode;
           this.rejectionReasonDetailCode = rejectionReasonDetailCode;
           this.rejectionReasonCustomText = rejectionReasonCustomText;
           this.createdDate = createdDate;
           this.lastModifyDate = lastModifyDate;
           this.docReceivedDate = docReceivedDate;
           this.businessName = businessName;
           this.address1 = address1;
           this.address2 = address2;
           this.city = city;
           this.state = state;
           this.country = country;
           this.zip = zip;
           this.phone = phone;
           this.email = email;
           this.signerName = signerName;
           this.signerTitle = signerTitle;
           this.signedDate = signedDate;
           this.businessDescription = businessDescription;
           this.sellerPropertyDescription = sellerPropertyDescription;
           this.certificateUsage = certificateUsage;
           this.isPartialExemption = isPartialExemption;
           this.exemptReasonCode = exemptReasonCode;
           this.exemptFormName = exemptFormName;
           this.custom1 = custom1;
           this.custom2 = custom2;
           this.custom3 = custom3;
           this.pageCount = pageCount;
    }


    /**
     * Gets the avaCertId value for this Certificate.
     * 
     * @return avaCertId
     */
    public java.lang.String getAvaCertId() {
        return avaCertId;
    }


    /**
     * Sets the avaCertId value for this Certificate.
     * 
     * @param avaCertId
     */
    public void setAvaCertId(java.lang.String avaCertId) {
        this.avaCertId = avaCertId;
    }


    /**
     * Gets the certificateJurisdictions value for this Certificate.
     * 
     * @return certificateJurisdictions
     */
    public ArrayOfCertificateJurisdiction getCertificateJurisdictions() {
        return certificateJurisdictions;
    }


    /**
     * Sets the certificateJurisdictions value for this Certificate.
     * 
     * @param certificateJurisdictions
     */
    public void setCertificateJurisdictions(ArrayOfCertificateJurisdiction certificateJurisdictions) {
        this.certificateJurisdictions = certificateJurisdictions;
    }


    /**
     * Gets the customerCodes value for this Certificate.
     * 
     * @return customerCodes
     */
    public ArrayOfString getCustomerCodes() {
        return customerCodes;
    }


    /**
     * Sets the customerCodes value for this Certificate.
     * 
     * @param customerCodes
     */
    public void setCustomerCodes(ArrayOfString customerCodes) {
        this.customerCodes = customerCodes;
    }

    /**
     * Gets the sourceLocationName value for this Certificate.
     * 
     * @return sourceLocationName
     */
    public java.lang.String getSourceLocationName() {
        return sourceLocationName;
    }


    /**
     * Sets the sourceLocationName value for this Certificate.
     * 
     * @param sourceLocationName
     */
    public void setSourceLocationName(java.lang.String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
    }


    /**
     * Gets the sourceLocationCode value for this Certificate.
     * 
     * @return sourceLocationCode
     */
    public java.lang.String getSourceLocationCode() {
        return sourceLocationCode;
    }


    /**
     * Sets the sourceLocationCode value for this Certificate.
     * 
     * @param sourceLocationCode
     */
    public void setSourceLocationCode(java.lang.String sourceLocationCode) {
        this.sourceLocationCode = sourceLocationCode;
    }


    /**
     * Gets the certificateStatus value for this Certificate.
     * 
     * @return certificateStatus
     */
    public CertificateStatus getCertificateStatus() {
        return certificateStatus;
    }


    /**
     * Sets the certificateStatus value for this Certificate.
     * 
     * @param certificateStatus
     */
    public void setCertificateStatus(CertificateStatus certificateStatus) {
        this.certificateStatus = certificateStatus;
    }


    /**
     * Gets the reviewStatus value for this Certificate.
     * 
     * @return reviewStatus
     */
    public ReviewStatus getReviewStatus() {
        return reviewStatus;
    }


    /**
     * Sets the reviewStatus value for this Certificate.
     * 
     * @param reviewStatus
     */
    public void setReviewStatus(ReviewStatus reviewStatus) {
        this.reviewStatus = reviewStatus;
    }


    /**
     * Gets the rejectionReasonCode value for this Certificate.
     * 
     * @return rejectionReasonCode
     */
    public java.lang.String getRejectionReasonCode() {
        return rejectionReasonCode;
    }


    /**
     * Sets the rejectionReasonCode value for this Certificate.
     * 
     * @param rejectionReasonCode
     */
    public void setRejectionReasonCode(java.lang.String rejectionReasonCode) {
        this.rejectionReasonCode = rejectionReasonCode;
    }


    /**
     * Gets the rejectionReasonDetailCode value for this Certificate.
     * 
     * @return rejectionReasonDetailCode
     */
    public java.lang.String getRejectionReasonDetailCode() {
        return rejectionReasonDetailCode;
    }


    /**
     * Sets the rejectionReasonDetailCode value for this Certificate.
     * 
     * @param rejectionReasonDetailCode
     */
    public void setRejectionReasonDetailCode(java.lang.String rejectionReasonDetailCode) {
        this.rejectionReasonDetailCode = rejectionReasonDetailCode;
    }


    /**
     * Gets the rejectionReasonCustomText value for this Certificate.
     * 
     * @return rejectionReasonCustomText
     */
    public java.lang.String getRejectionReasonCustomText() {
        return rejectionReasonCustomText;
    }


    /**
     * Sets the rejectionReasonCustomText value for this Certificate.
     * 
     * @param rejectionReasonCustomText
     */
    public void setRejectionReasonCustomText(java.lang.String rejectionReasonCustomText) {
        this.rejectionReasonCustomText = rejectionReasonCustomText;
    }


    /**
     * Gets the createdDate value for this Certificate.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Certificate.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifyDate value for this Certificate.
     * 
     * @return lastModifyDate
     */
    public java.util.Calendar getLastModifyDate() {
        return lastModifyDate;
    }


    /**
     * Sets the lastModifyDate value for this Certificate.
     * 
     * @param lastModifyDate
     */
    public void setLastModifyDate(java.util.Calendar lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }


    /**
     * Gets the docReceivedDate value for this Certificate.
     * 
     * @return docReceivedDate
     */
    public java.util.Calendar getDocReceivedDate() {
        return docReceivedDate;
    }


    /**
     * Sets the docReceivedDate value for this Certificate.
     * 
     * @param docReceivedDate
     */
    public void setDocReceivedDate(java.util.Calendar docReceivedDate) {
        this.docReceivedDate = docReceivedDate;
    }


    /**
     * Gets the businessName value for this Certificate.
     * 
     * @return businessName
     */
    public java.lang.String getBusinessName() {
        return businessName;
    }


    /**
     * Sets the businessName value for this Certificate.
     * 
     * @param businessName
     */
    public void setBusinessName(java.lang.String businessName) {
        this.businessName = businessName;
    }


    /**
     * Gets the address1 value for this Certificate.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this Certificate.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this Certificate.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this Certificate.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the city value for this Certificate.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Certificate.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this Certificate.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Certificate.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the country value for this Certificate.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Certificate.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the zip value for this Certificate.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this Certificate.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }


    /**
     * Gets the phone value for this Certificate.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Certificate.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the email value for this Certificate.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Certificate.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the signerName value for this Certificate.
     * 
     * @return signerName
     */
    public java.lang.String getSignerName() {
        return signerName;
    }


    /**
     * Sets the signerName value for this Certificate.
     * 
     * @param signerName
     */
    public void setSignerName(java.lang.String signerName) {
        this.signerName = signerName;
    }


    /**
     * Gets the signerTitle value for this Certificate.
     * 
     * @return signerTitle
     */
    public java.lang.String getSignerTitle() {
        return signerTitle;
    }


    /**
     * Sets the signerTitle value for this Certificate.
     * 
     * @param signerTitle
     */
    public void setSignerTitle(java.lang.String signerTitle) {
        this.signerTitle = signerTitle;
    }


    /**
     * Gets the signedDate value for this Certificate.
     * 
     * @return signedDate
     */
    public java.util.Calendar getSignedDate() {
        return signedDate;
    }


    /**
     * Sets the signedDate value for this Certificate.
     * 
     * @param signedDate
     */
    public void setSignedDate(java.util.Calendar signedDate) {
        this.signedDate = signedDate;
    }


    /**
     * Gets the businessDescription value for this Certificate.
     * 
     * @return businessDescription
     */
    public java.lang.String getBusinessDescription() {
        return businessDescription;
    }


    /**
     * Sets the businessDescription value for this Certificate.
     * 
     * @param businessDescription
     */
    public void setBusinessDescription(java.lang.String businessDescription) {
        this.businessDescription = businessDescription;
    }


    /**
     * Gets the sellerPropertyDescription value for this Certificate.
     * 
     * @return sellerPropertyDescription
     */
    public java.lang.String getSellerPropertyDescription() {
        return sellerPropertyDescription;
    }


    /**
     * Sets the sellerPropertyDescription value for this Certificate.
     * 
     * @param sellerPropertyDescription
     */
    public void setSellerPropertyDescription(java.lang.String sellerPropertyDescription) {
        this.sellerPropertyDescription = sellerPropertyDescription;
    }


    /**
     * Gets the certificateUsage value for this Certificate.
     * 
     * @return certificateUsage
     */
    public CertificateUsage getCertificateUsage() {
        return certificateUsage;
    }


    /**
     * Sets the certificateUsage value for this Certificate.
     * 
     * @param certificateUsage
     */
    public void setCertificateUsage(CertificateUsage certificateUsage) {
        this.certificateUsage = certificateUsage;
    }


    /**
     * Gets the isPartialExemption value for this Certificate.
     * 
     * @return isPartialExemption
     */
    public java.lang.Boolean getIsPartialExemption() {
        return isPartialExemption;
    }


    /**
     * Sets the isPartialExemption value for this Certificate.
     * 
     * @param isPartialExemption
     */
    public void setIsPartialExemption(java.lang.Boolean isPartialExemption) {
        this.isPartialExemption = isPartialExemption;
    }


    /**
     * Gets the exemptReasonCode value for this Certificate.
     * 
     * @return exemptReasonCode
     */
    public java.lang.String getExemptReasonCode() {
        return exemptReasonCode;
    }


    /**
     * Sets the exemptReasonCode value for this Certificate.
     * 
     * @param exemptReasonCode
     */
    public void setExemptReasonCode(java.lang.String exemptReasonCode) {
        this.exemptReasonCode = exemptReasonCode;
    }


    /**
     * Gets the exemptFormName value for this Certificate.
     * 
     * @return exemptFormName
     */
    public java.lang.String getExemptFormName() {
        return exemptFormName;
    }


    /**
     * Sets the exemptFormName value for this Certificate.
     * 
     * @param exemptFormName
     */
    public void setExemptFormName(java.lang.String exemptFormName) {
        this.exemptFormName = exemptFormName;
    }


    /**
     * Gets the custom1 value for this Certificate.
     * 
     * @return custom1
     */
    public java.lang.String getCustom1() {
        return custom1;
    }


    /**
     * Sets the custom1 value for this Certificate.
     * 
     * @param custom1
     */
    public void setCustom1(java.lang.String custom1) {
        this.custom1 = custom1;
    }


    /**
     * Gets the custom2 value for this Certificate.
     * 
     * @return custom2
     */
    public java.lang.String getCustom2() {
        return custom2;
    }


    /**
     * Sets the custom2 value for this Certificate.
     * 
     * @param custom2
     */
    public void setCustom2(java.lang.String custom2) {
        this.custom2 = custom2;
    }


    /**
     * Gets the custom3 value for this Certificate.
     * 
     * @return custom3
     */
    public java.lang.String getCustom3() {
        return custom3;
    }


    /**
     * Sets the custom3 value for this Certificate.
     * 
     * @param custom3
     */
    public void setCustom3(java.lang.String custom3) {
        this.custom3 = custom3;
    }


    /**
     * Gets the pageCount value for this Certificate.
     * 
     * @return pageCount
     */
    public java.lang.Integer getPageCount() {
        return pageCount;
    }


    /**
     * Sets the pageCount value for this Certificate.
     * 
     * @param pageCount
     */
    public void setPageCount(java.lang.Integer pageCount) {
        this.pageCount = pageCount;
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
        if (!(obj instanceof Certificate)) return false;
        Certificate other = (Certificate) obj;
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
            ((this.certificateJurisdictions==null && other.getCertificateJurisdictions()==null) || 
             (this.certificateJurisdictions!=null &&
              this.certificateJurisdictions.equals(other.getCertificateJurisdictions()))) &&
            ((this.customerCodes==null && other.getCustomerCodes()==null) || 
             (this.customerCodes!=null &&
              this.customerCodes.equals(other.getCustomerCodes()))) &&
             ((this.sourceLocationName==null && other.getSourceLocationName()==null) || 
             (this.sourceLocationName!=null &&
              this.sourceLocationName.equals(other.getSourceLocationName()))) &&
            ((this.sourceLocationCode==null && other.getSourceLocationCode()==null) || 
             (this.sourceLocationCode!=null &&
              this.sourceLocationCode.equals(other.getSourceLocationCode()))) &&
            ((this.certificateStatus==null && other.getCertificateStatus()==null) || 
             (this.certificateStatus!=null &&
              this.certificateStatus.equals(other.getCertificateStatus()))) &&
            ((this.reviewStatus==null && other.getReviewStatus()==null) ||
             (this.reviewStatus!=null &&
              this.reviewStatus.equals(other.getReviewStatus()))) &&
            ((this.rejectionReasonCode==null && other.getRejectionReasonCode()==null) ||
             (this.rejectionReasonCode!=null &&
              this.rejectionReasonCode.equals(other.getRejectionReasonCode()))) &&
            ((this.rejectionReasonDetailCode==null && other.getRejectionReasonDetailCode()==null) ||
             (this.rejectionReasonDetailCode!=null &&
              this.rejectionReasonDetailCode.equals(other.getRejectionReasonDetailCode()))) &&
            ((this.rejectionReasonCustomText==null && other.getRejectionReasonCustomText()==null) ||
             (this.rejectionReasonCustomText!=null &&
              this.rejectionReasonCustomText.equals(other.getRejectionReasonCustomText()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifyDate==null && other.getLastModifyDate()==null) ||
             (this.lastModifyDate!=null &&
              this.lastModifyDate.equals(other.getLastModifyDate()))) &&
            ((this.docReceivedDate==null && other.getDocReceivedDate()==null) ||
             (this.docReceivedDate!=null &&
              this.docReceivedDate.equals(other.getDocReceivedDate()))) &&
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
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.zip==null && other.getZip()==null) ||
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.signerName==null && other.getSignerName()==null) || 
             (this.signerName!=null &&
              this.signerName.equals(other.getSignerName()))) &&
            ((this.signerTitle==null && other.getSignerTitle()==null) || 
             (this.signerTitle!=null &&
              this.signerTitle.equals(other.getSignerTitle()))) &&
            ((this.signedDate==null && other.getSignedDate()==null) || 
             (this.signedDate!=null &&
              this.signedDate.equals(other.getSignedDate()))) &&
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
              this.custom3.equals(other.getCustom3()))) &&
            ((this.pageCount==null && other.getPageCount()==null) || 
             (this.pageCount!=null &&
              this.pageCount.equals(other.getPageCount())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

   /**
     *  Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this Certificate object
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
        if (getCertificateJurisdictions() != null) {
            _hashCode += getCertificateJurisdictions().hashCode();
        }
        if (getCustomerCodes() != null) {
            _hashCode += getCustomerCodes().hashCode();
        }
        if (getSourceLocationName() != null) {
            _hashCode += getSourceLocationName().hashCode();
        }
        if (getSourceLocationCode() != null) {
            _hashCode += getSourceLocationCode().hashCode();
        }
        if (getCertificateStatus() != null) {
            _hashCode += getCertificateStatus().hashCode();
        }
        if (getReviewStatus() != null) {
            _hashCode += getReviewStatus().hashCode();
        }
        if (getRejectionReasonCode() != null) {
            _hashCode += getRejectionReasonCode().hashCode();
        }
        if (getRejectionReasonDetailCode() != null) {
            _hashCode += getRejectionReasonDetailCode().hashCode();
        }
        if (getRejectionReasonCustomText() != null) {
            _hashCode += getRejectionReasonCustomText().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastModifyDate() != null) {
            _hashCode += getLastModifyDate().hashCode();
        }
        if (getDocReceivedDate() != null) {
            _hashCode += getDocReceivedDate().hashCode();
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getSignerName() != null) {
            _hashCode += getSignerName().hashCode();
        }
        if (getSignerTitle() != null) {
            _hashCode += getSignerTitle().hashCode();
        }
        if (getSignedDate() != null) {
            _hashCode += getSignedDate().hashCode();
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
        if (getPageCount() != null) {
            _hashCode += getPageCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Certificate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Certificate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avaCertId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AvaCertId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateJurisdictions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateJurisdictions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfCertificateJurisdiction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomerCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceLocationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SourceLocationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceLocationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SourceLocationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ReviewStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ReviewStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectionReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RejectionReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectionReasonDetailCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RejectionReasonDetailCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectionReasonCustomText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RejectionReasonCustomText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LastModifyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docReceivedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocReceivedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BusinessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SignerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signerTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SignerTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SignedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BusinessDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerPropertyDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SellerPropertyDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CertificateUsage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPartialExemption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsPartialExemption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptFormName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptFormName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Custom1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Custom2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Custom3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
