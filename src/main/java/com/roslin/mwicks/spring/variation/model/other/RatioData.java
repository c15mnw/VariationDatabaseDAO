
package com.roslin.mwicks.spring.variation.model.other;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.roslin.mwicks.spring.variation.format.CustomDateToStringStyle;

import com.roslin.mwicks.utility.ObjectConverter;

import javax.persistence.*;

import java.util.Date;

/**
 * An entity class which contains the information of a single SNPChromosome Table Row.
 * @author Mike Wicks
 */

public class RatioData {
    
    // Constants ----------------------------------------------------------------------------------
	protected static final String ONLY_NONE = "NONE";
	protected static final String ONLY_1 = "1";
	protected static final String ONLY_2 = "2";
	protected static final String ONLY_3 = "3";
	protected static final String ONLY_4 = "4";
	protected static final String ONLY_5 = "5";
	protected static final String ONLY_6 = "6";
	protected static final String ONLY_7 = "7";
	protected static final String ONLY_8 = "8";
	protected static final String ONLY_9 = "9";
	protected static final String ONLY_10 = "10";
	protected static final String ONLY_11 = "11";
	protected static final String ONLY_12 = "12";
	protected static final String ONLY_13 = "13";
	protected static final String ONLY_14 = "14";
	protected static final String ONLY_15 = "15";
	protected static final String ONLY_16 = "16";
	protected static final String ONLY_17 = "17";
	protected static final String ONLY_18 = "18";
	protected static final String ONLY_19 = "19";
	protected static final String ONLY_20 = "20";
	protected static final String ONLY_21 = "21";
	protected static final String ONLY_22 = "22";
	protected static final String ONLY_23 = "23";
	protected static final String ONLY_24 = "24";
	protected static final String ONLY_25 = "25";
	protected static final String ONLY_26 = "26";
	protected static final String ONLY_27 = "27";
	protected static final String ONLY_28 = "28";
	protected static final String ONLY_32 = "32";
	protected static final String ONLY_LGE22C19W28_E50C23 = "LGE22C19W28_E50C23";
	protected static final String ONLY_LGE64 = "LGE64";
	protected static final String ONLY_W = "W";
	protected static final String ONLY_Z = "Z";

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
			

    // Properties  --------------------------------------------------------------------------------
    private String chromosomeId;

	private String snpId;
    private String strain;
    private Double strainAlleleRatio;
    private Long strainAlleleAlternativeCount;
    private Long strainAlleleReferenceCount;
    private Date creationTime;
    private Date modificationTime;
    private long version;
    

    // Getters ------------------------------------------------------------------------------------
    public String getChromosomeId() {
    	return this.chromosomeId;
    }

    public String getSnpId() {
    	return this.snpId;
    }
    public String getStrain() {
    	return this.strain;
    }
    public Double getStrainAlleleRatio() {
    	return this.strainAlleleRatio;
    }
    public Long getStrainAlleleAlternativeCount() {
    	return this.strainAlleleAlternativeCount;
    }
    public Long getStrainAlleleReferenceCount() {
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
    

    // Setters ------------------------------------------------------------------------------------
    public void setChromosomeId(String chromosomeId) {
    	this.chromosomeId = chromosomeId;
    }

    public void setSnpId(String snpId) {
    	this.snpId = snpId;
    }
    public void setStrain(String strain) {
    	this.strain = strain;
    }
    public void setStrainAlleleRatio(Double strainAlleleRatio) {
    	this.strainAlleleRatio = strainAlleleRatio;
    }
    public void setStrainAlleleAlternativeCount(Long strainAlleleAlternativeCount) {
    	this.strainAlleleAlternativeCount = strainAlleleAlternativeCount;
    }
    public void setStrainAlleleReferenceCount(Long strainAlleleReferenceCount) {
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

    // Helpers ------------------------------------------------------------------------------------
    public void deriveChromosomeId() {
    	
    	String string = this.snpId;
    	String[] parts = string.split("_");
    	
    	this.chromosomeId = parts[0].substring(3);
    	
    	if ( parts[0].toLowerCase().equals("chr38") ) {
    		this.chromosomeId = ONLY_W;
    	}
    	if ( parts[0].toLowerCase().equals("chr40") ) {
    		this.chromosomeId = ONLY_LGE22C19W28_E50C23;
    	}
    	if ( parts[0].toLowerCase().equals("chr41") ) {
    		this.chromosomeId = ONLY_LGE64;
    	}
    }

    public boolean isChromosomeNone() {
    	if ( this.chromosomeId.equals(ONLY_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome1() {
    	if ( this.chromosomeId.equals(ONLY_1)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome2() {
    	if ( this.chromosomeId.equals(ONLY_2)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome3() {
    	if ( this.chromosomeId.equals(ONLY_3)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome4() {
    	if ( this.chromosomeId.equals(ONLY_4)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome5() {
    	if ( this.chromosomeId.equals(ONLY_5)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome6() {
    	if ( this.chromosomeId.equals(ONLY_6)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome7() {
    	if ( this.chromosomeId.equals(ONLY_7)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome8() {
    	if ( this.chromosomeId.equals(ONLY_8)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome9() {
    	if ( this.chromosomeId.equals(ONLY_9)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome10() {
    	if ( this.chromosomeId.equals(ONLY_10)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome11() {
    	if ( this.chromosomeId.equals(ONLY_11)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome12() {
    	if ( this.chromosomeId.equals(ONLY_12)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome13() {
    	if ( this.chromosomeId.equals(ONLY_13)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome14() {
    	if ( this.chromosomeId.equals(ONLY_14)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome15() {
    	if ( this.chromosomeId.equals(ONLY_15)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome16() {
    	if ( this.chromosomeId.equals(ONLY_16)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome17() {
    	if ( this.chromosomeId.equals(ONLY_17)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome18() {
    	if ( this.chromosomeId.equals(ONLY_18)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome19() {
    	if ( this.chromosomeId.equals(ONLY_19)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome20() {
    	if ( this.chromosomeId.equals(ONLY_20)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome21() {
    	if ( this.chromosomeId.equals(ONLY_21)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome22() {
    	if ( this.chromosomeId.equals(ONLY_22)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome23() {
    	if ( this.chromosomeId.equals(ONLY_23)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome24() {
    	if ( this.chromosomeId.equals(ONLY_24)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome25() {
    	if ( this.chromosomeId.equals(ONLY_25)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome26() {
    	if ( this.chromosomeId.equals(ONLY_26)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome27() {
    	if ( this.chromosomeId.equals(ONLY_27)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome28() {
    	if ( this.chromosomeId.equals(ONLY_28)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosome32() {
    	if ( this.chromosomeId.equals(ONLY_32)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosomeLGE22C19W28_E50C23() {
    	if ( this.chromosomeId.equals(ONLY_LGE22C19W28_E50C23)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosomeLGE64() {
    	if ( this.chromosomeId.equals(ONLY_LGE64)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosomeW() {
    	if ( this.chromosomeId.equals(ONLY_W)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isChromosomeZ() {
    	if ( this.chromosomeId.equals(ONLY_Z)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isStrainNone() {
    	if ( this.strain.equals(STRAIN_NONE) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain7() {
    	if ( this.strain.equals(STRAIN_7) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainP() {
    	if ( this.strain.equals(STRAIN_P) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainW() {
    	if ( this.strain.equals(STRAIN_W) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainN() {
    	if ( this.strain.equals(STRAIN_N) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain15I() {
    	if ( this.strain.equals(STRAIN_15I) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainZero() {
    	if ( this.strain.equals(STRAIN_ZERO) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain6() {
    	if ( this.strain.equals(STRAIN_6) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainC() {
    	if ( this.strain.equals(STRAIN_C) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    /*
     * Is this Component the same as the Supplied Component?
     */
    public boolean isSameAs(RatioData ratiodata){

        if (this.getSnpId().equals(ratiodata.getSnpId()) && 
        		this.getStrain().equals(ratiodata.getStrain()) && 
        	    this.getStrainAlleleRatio() == ratiodata.getStrainAlleleRatio() && 
        	    this.getStrainAlleleAlternativeCount() == ratiodata.getStrainAlleleAlternativeCount() && 
        	    this.getStrainAlleleReferenceCount() == ratiodata.getStrainAlleleReferenceCount() ) {

        	return true;
        }
        else {

        	return false;
        }
    }

    /*
     * Is this SiftData VALID?
     */
    public boolean isThisAValidRatioData(){

        if ( this.isChromosome1() || this.isChromosome2() || this.isChromosome3() || this.isChromosome4() || this.isChromosome5() || this.isChromosome6() || this.isChromosome7() || this.isChromosome8() || this.isChromosome9() || this.isChromosome10() || this.isChromosome11() || this.isChromosome12() || this.isChromosome13() || this.isChromosome14() || this.isChromosome15() || this.isChromosome16() || this.isChromosome17() || this.isChromosome18() || this.isChromosome19() || this.isChromosome20() || this.isChromosome21() || this.isChromosome22() || this.isChromosome23() || this.isChromosome24() || this.isChromosome25() || this.isChromosome26() || this.isChromosome27() || this.isChromosome28() || this.isChromosome32() || this.isChromosomeLGE22C19W28_E50C23() || this.isChromosomeLGE64() || this.isChromosomeW() || this.isChromosomeZ() ) {

        	if ( this.isStrain7() || this.isStrainP() || this.isStrainW() || this.isStrainN() || this.isStrain15I() || this.isStrainZero() || this.isStrain6() || this.isStrainC()  ) {
        		
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


    public void update(
    		String snpId,
    		String strain,
    		Double strainAlleleRatio,
    		Long strainAlleleAlternativeCount,
    		Long strainAlleleReferenceCount
    		) {

    	this.snpId = snpId;
    	this.strain = strain;
    	this.strainAlleleRatio = strainAlleleRatio;
    	this.strainAlleleAlternativeCount = strainAlleleAlternativeCount;
    	this.strainAlleleReferenceCount = strainAlleleReferenceCount;
    }

    
    @PreUpdate
    public void preUpdate() {
    	
    	this.modificationTime = new Date();
    }
    
    
    @PrePersist
    public void prePersist() {
    	
        Date now = new Date();
        
        this.creationTime = now;
        this.modificationTime = now;
    }

    
    public String toString() {
    	
        return ToStringBuilder.reflectionToString(this, new CustomDateToStringStyle());
    }

    // RatioData Builder ---------------------------------------------------------------------
    /**
     * Gets a builder which is used to create RatioData objects.
     * @return  A new Builder instance.
     */
    public static Builder getBuilder(
    		String snpId,
    		String strain,
    		Double strainAlleleRatio,
    		Long strainAlleleAlternativeCount,
    		Long strainAlleleReferenceCount
    		) {
    	
        return new Builder(
        		snpId,
        		strain,
        		strainAlleleRatio,
        		strainAlleleAlternativeCount,
        		strainAlleleReferenceCount
        		);
    }
    
    /**
     * A Builder class used to create new SNPChromosome objects.
     */
    public static class Builder {
    	
    	RatioData built;

        /**
         * Creates a new Builder instance.
         * @param snpId The SNP ID
         * @param chromosomeId The Chromosome ID
         * @param position The SNP Position or coordinate
         * @param reference The Reference or Expected Nucleobase
         * @param alternative The Alternative Nucleobase as found
         * @param region The Region
         */
        Builder(
        		String snpId,
        		String strain,
        		Double strainAlleleRatio,
        		Long strainAlleleAlternativeCount,
        		Long strainAlleleReferenceCount
        		) {
        	
            built = new RatioData();
            
        	built.snpId = snpId;
        	built.strain = strain;
        	built.strainAlleleRatio = strainAlleleRatio;
        	built.strainAlleleAlternativeCount = strainAlleleAlternativeCount;
        	built.strainAlleleReferenceCount = strainAlleleReferenceCount;
        }

        /**
         * Builds the new SNPChromosome object.
         * 
         * @return  The created SNPChromosome object.
         */
        public RatioData build() {
        	
            return built;
        }
    }

}
