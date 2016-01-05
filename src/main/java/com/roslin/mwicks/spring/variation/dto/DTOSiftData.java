package com.roslin.mwicks.spring.variation.dto;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.hibernate.validator.constraints.NotEmpty;

import com.roslin.mwicks.spring.variation.model.other.SiftData;

import com.roslin.mwicks.utility.ObjectConverter;
import com.roslin.mwicks.utility.StringUtility;


/**
 * A DTO object which is used as a form object
 * in create person and edit person forms.
 * @author Mike Wicks
 */
public class DTOSiftData {
    
    // Constants ----------------------------------------------------------------------------------
	protected static final String STRING_TOLERATED = "TOLERATED";
	protected static final String STRING_DELETERIOUS = "DELETERIOUS";
	
    // Properties ---------------------------------------------------------------------------------
    @NotEmpty
    private String snpId;
    
    @NotEmpty
    private String ensemblGene;
    
    @NotEmpty
    private String ensemblTranscript;
    
    @NotEmpty
    private String ensemblAnnotation;
    
    @NotEmpty
    private String aminoAcidSubs;
    
    @NotEmpty
    private String predictionCategory;
    
    @NotEmpty
    private String scoreSift;
    
    @NotEmpty
    private String scoreConservation;
    
    @NotEmpty
    private String proteinAlignNumber;
    
    @NotEmpty
    private String totalAlignSequenceNumber;
    
    @NotEmpty
    private Date creationTime;
    
    @NotEmpty
    private Date modificationTime;
    
    @NotEmpty
    private long version;


    public DTOSiftData() {

    }

    // Getters ------------------------------------------------------------------------------------
    public String getSnpId() {
    	return this.snpId;
    }
    public String getEnsemblGene() {
    	return this.ensemblGene;
    }
    public String getEnsemblTranscript() {
    	return this.ensemblTranscript;
    }
    public String getEnsemblAnnotation() {
    	return this.ensemblAnnotation;
    }
    public String getAminoAcidSubs() {
    	return this.aminoAcidSubs;
    }
    public String getPredictionCategory() {
    	return this.predictionCategory;
    }
    public String getScoreSift() {
    	return this.scoreSift;
    }
    public String getScoreConservation() {
    	return this.scoreConservation;
    }
    public String getProteinAlignNumber() {
    	return this.proteinAlignNumber;
    }
    public String getTotalAlignSequenceNumber() {
    	return this.totalAlignSequenceNumber;
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
    public Double getScoreSiftAsDouble() {
    	return Double.parseDouble(this.scoreSift);
    }
    public Double getScoreConservationAsDouble() {
    	return Double.parseDouble(this.scoreConservation);
    }
    public Long getProteinAlignNumberAsLong() {
    	return ObjectConverter.convert(this.proteinAlignNumber, Long.class);
    }
    public Long getTotalAlignSequenceNumberAsLong() {
    	return ObjectConverter.convert(this.totalAlignSequenceNumber, Long.class);
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
    public void setEnsemblGene(String ensemblGene) {
    	this.ensemblGene = ensemblGene;
    }
    public void setEnsemblTranscript(String ensemblTranscript) {
    	this.ensemblTranscript = ensemblTranscript;
    }
    public void setEnsemblAnnotation(String ensemblAnnotation) {
    	this.ensemblAnnotation = ensemblAnnotation;
    }
    public void setAminoAcidSubs(String aminoAcidSubs) {
    	this.aminoAcidSubs = aminoAcidSubs;
    }
    public void setPredictionCategory(String predictionCategory) {
    	this.predictionCategory = predictionCategory;
    }
    public void setScoreSift(String scoreSift) {
    	this.scoreSift = scoreSift;
    }
    public void setScoreConservation(String scoreConservation) {
    	this.scoreConservation = scoreConservation;
    }
    public void setProteinAlignNumber(String proteinAlignNumber) {
    	this.proteinAlignNumber = proteinAlignNumber;
    }
    public void setTotalAlignSequenceNumber(String totalAlignSequenceNumber) {
    	this.totalAlignSequenceNumber = totalAlignSequenceNumber;
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
    
    // Check for Required DataTypes ---------------------------------------------------------------
    public boolean isPredictionCategoryAValidValue() {

    	if ( this.predictionCategory.equals(STRING_TOLERATED) || 
    			this.predictionCategory.equals(STRING_DELETERIOUS) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isScoreSiftANumber() {

    	if ( StringUtility.isItNumeric(this.scoreSift) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isScoreConservationANumber() {

    	if ( StringUtility.isItNumeric(this.scoreConservation) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isProteinAlignANumber() {

    	if ( StringUtility.isItNumeric(this.proteinAlignNumber) ) {
    		return true;
    	}
    	else {
    		
    		return false;
    	}
    }
    public boolean isTotalAlignSequenceANumber() {

    	if ( StringUtility.isItNumeric(this.totalAlignSequenceNumber) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    // Helpers ------------------------------------------------------------------------------------    
    /*
     * Is this SiftData VALID?
     */
    public boolean isThisAValidSiftData(){

        if ( this.isPredictionCategoryAValidValue() ) {

            if (this.isProteinAlignANumber() && 
            	    this.isTotalAlignSequenceANumber()  
            	    ) {

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
     * Convert a DTOSiftData Object to an SiftData Object
     */
    public SiftData convertToSiftData(){

    	SiftData siftdata = SiftData.getBuilder(
    	    	this.getSnpId(),
    	    	this.getEnsemblGene(),
    	    	this.getEnsemblTranscript(),
    	    	this.getEnsemblAnnotation(),
    	    	this.getAminoAcidSubs(),
    	    	this.getPredictionCategory(),
    	    	this.getScoreSiftAsDouble(),
    	    	this.getScoreConservationAsDouble(),
    	    	this.getProteinAlignNumberAsLong(),
    	    	this.getTotalAlignSequenceNumberAsLong()
        		).build();
        
    	siftdata.deriveChromosomeId();
    	
        return siftdata;
    }

    
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
