package com.roslin.mwicks.spring.variation.dto.offline;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.hibernate.validator.constraints.NotEmpty;

import com.roslin.mwicks.spring.variation.format.CustomDateToStringStyle;
import com.roslin.mwicks.spring.variation.model.other.RatioData;

import com.roslin.mwicks.utility.ObjectConverter;
import com.roslin.mwicks.utility.StringUtility;


/**
 * A DTO object which is used as a form object
 * in create person and edit person forms.
 * @author Mike Wicks
 */
public class DTORatioData {
    
    // Constants ----------------------------------------------------------------------------------
	protected static final String STRAIN_NONE = "STRAIN_NONE";
	protected static final String STRAIN_7 = "STRAIN_7";
	protected static final String STRAIN_P = "STRAIN_P";
	protected static final String STRAIN_W = "STRAIN_W";
	protected static final String STRAIN_N = "STRAIN_N";
	protected static final String STRAIN_15I = "STRAIN_15I";
	protected static final String STRAIN_ZERO = "STRAIN_ZERO";
	protected static final String STRAIN_6 = "STRAIN_6";
	protected static final String STRAIN_C = "STRAIN_C";
			
	protected static final String ONLY_STRAIN_NONE = "NONE";
	protected static final String ONLY_STRAIN_7 = "7";
	protected static final String ONLY_STRAIN_P = "P";
	protected static final String ONLY_STRAIN_W = "W";
	protected static final String ONLY_STRAIN_N = "N";
	protected static final String ONLY_STRAIN_15I = "15I";
	protected static final String ONLY_STRAIN_ZERO = "ZERO";
	protected static final String ONLY_STRAIN_6 = "6";
	protected static final String ONLY_STRAIN_C = "C";
	
    // Properties ---------------------------------------------------------------------------------
    @NotEmpty
    private String snpId;
    
    @NotEmpty
    private String strain;
    
    @NotEmpty
    private String strainAlleleRatio;
    
    @NotEmpty
    private String strainAlleleAlternativeCount;
    
    @NotEmpty
    private String strainAlleleReferenceCount;
    
    @NotEmpty
    private Date creationTime;
    
    @NotEmpty
    private Date modificationTime;
    
    @NotEmpty
    private long version;


    public DTORatioData() {

    }

    // Getters ------------------------------------------------------------------------------------
    public String getSnpId() {
    	return this.snpId;
    }
    public String getStrain() {
    	return this.strain;
    }
    public String getStrainAlleleRatio() {
    	return this.strainAlleleRatio;
    }
    public String getStrainAlleleAlternativeCount() {
    	return this.strainAlleleAlternativeCount;
    }
    public String getStrainAlleleReferenceCount() {
    	return this.strainAlleleReferenceCount;
    }
    public Date getCreationTime() {
    	return this.creationTime;
    }
    public Date getModificationTime() {
    	return this.modificationTime;
    }
    public long getVersion() {
        return this.version;
    }
    
    // Getters As Required DataTypes --------------------------------------------------------------
    public Double getStrainAlleleRatioAsDouble() {
        return ObjectConverter.convert(this.strainAlleleRatio, Double.class);
    }
    public Long getStrainAlleleAlternativeCountAsLong() {
        return ObjectConverter.convert(this.strainAlleleAlternativeCount, Long.class);
    }
    public Long getStrainAlleleReferenceCountAsLong() {
        return ObjectConverter.convert(this.strainAlleleReferenceCount, Long.class);
    }
    public String getCreationTimeAsString() {
    	return ObjectConverter.convert(creationTime, String.class);
    }
    public String getModificationTimeAsString() {
    	return ObjectConverter.convert(modificationTime, String.class);
    }
    public String getVersionAsString() {
    	return ObjectConverter.convert(version, String.class);
    }

    // Setters ------------------------------------------------------------------------------------
    public void setSnpId(String snpId) {
    	this.snpId = snpId;
    }
    public void setStrain(String strain) {
    	this.strain = strain;
    }
    public void setStrainAlleleRatio(String strainAlleleRatio) {
    	this.strainAlleleRatio = strainAlleleRatio;
    }
    public void setStrainAlleleAlternativeCount(String strainAlleleAlternativeCount) {
    	this.strainAlleleAlternativeCount = strainAlleleAlternativeCount;
    }
    public void setStrainAlleleReferenceCount(String strainAlleleReferenceCount) {
    	this.strainAlleleReferenceCount = strainAlleleReferenceCount;
    }
    public void setCreationTime(Date creationTime) {
    	this.creationTime = creationTime;
    }
    public void setModificationTime(Date modificationTime) {
    	this.modificationTime = modificationTime;
    }
    public void setVersion(long version) {
    	this.version = version;
    }
    
    // Setters From Strings -----------------------------------------------------------------------
    public void setCreationTimeFromString(String creationTime) {
    	this.creationTime = ObjectConverter.convert(creationTime, Date.class);
    }
    public void setModificationTimeFromString(String modificationTime) {
    	this.modificationTime = ObjectConverter.convert(modificationTime, Date.class);
    }

    // Check for Required DataTypes ---------------------------------------------------------------
    public boolean isStrainAValidValue() {

    	if ( this.strain.equals(STRAIN_NONE) || 
    			this.strain.equals(STRAIN_7) || 
    			this.strain.equals(STRAIN_P) || 
    			this.strain.equals(STRAIN_W) || 
    			this.strain.equals(STRAIN_N) || 
    			this.strain.equals(STRAIN_15I) || 
    			this.strain.equals(STRAIN_ZERO) || 
    			this.strain.equals(STRAIN_6) || 
    			this.strain.equals(STRAIN_C) ) {
    		
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainAlleleRatioANumber() {
        if ( StringUtility.isItNumericWithLeadingSignAndDecimalPoint(this.strainAlleleRatio) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainAlleleRatioZero() {
        if ( this.getStrainAlleleRatioAsDouble() == 0 ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainAlleleAlternativeCountANumber() {
        if ( StringUtility.isItNumeric(this.strainAlleleAlternativeCount) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainAlleleAlternativeCountZero() {
        if ( this.getStrainAlleleAlternativeCountAsLong() == 0 ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainAlleleReferenceCountANumber() {
        if ( StringUtility.isItNumeric(this.strainAlleleReferenceCount) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainAlleleReferenceCountOne() {
        if ( this.getStrainAlleleReferenceCountAsLong() == 1 ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    // Helpers ------------------------------------------------------------------------------------    
    /*
     * Is this RatioData VALID?
     */
    public boolean isThisAValidRatioData(){

        if ( this.isStrainAValidValue() ) {
        	
            if ( this.isStrainAlleleRatioANumber() && 
            	    this.isStrainAlleleAlternativeCountANumber() && 
             	    this.isStrainAlleleReferenceCountANumber() ) {

            	return true;
            }
            else {

            	return false;
            }
        }
        else {
        	
        	return false;
        }

    }


    /*
     * Is this RatioData VALID?
     */
    public boolean isThisNewRatioData(){

        if ( this.isStrainAlleleRatioZero() && 
        	    this.isStrainAlleleAlternativeCountZero() && 
         	    this.isStrainAlleleReferenceCountOne() ) {

        	return false;
        }
        else {

        	return true;
        }
    }

    /*
     * Convert a DTORatioData Object to an RatioData Object
     */
    public RatioData convertToRatioData(){

    	RatioData ratiodata = RatioData.getBuilder(
    	    	this.getSnpId(),
    	        this.getStrain(),
    	        this.getStrainAlleleRatioAsDouble(),
    	        this.getStrainAlleleAlternativeCountAsLong(),
    	        this.getStrainAlleleReferenceCountAsLong()
        		).build();
        
    	ratiodata.deriveChromosomeId();

        return ratiodata;
    }

    
    public String toString() {
        return ToStringBuilder.reflectionToString(this, new CustomDateToStringStyle());
    }
}
