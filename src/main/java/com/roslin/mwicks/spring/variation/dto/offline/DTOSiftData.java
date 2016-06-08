package com.roslin.mwicks.spring.variation.dto.offline;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.hibernate.validator.constraints.NotEmpty;

import com.roslin.mwicks.spring.variation.format.CustomDateToStringStyle;
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
	protected static final String STRING_NOT_SCORED = "NOT SCORED";
	protected static final String STRING_NAN = "nan";
	
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
    	return ObjectConverter.convert(this.scoreSift, Double.class);
    }
    public Double getScoreConservationAsDouble() {
    	return ObjectConverter.convert(this.scoreConservation, Double.class);
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
    
    // Setters From Strings -----------------------------------------------------------------------
    public void setCreationTimeFromString(String creationTime) {
    	this.creationTime = ObjectConverter.convert(creationTime, Date.class);
    }
    public void setModificationTimeFromString(String modificationTime) {
    	this.modificationTime = ObjectConverter.convert(modificationTime, Date.class);
    }

    // Check for Required DataTypes ---------------------------------------------------------------
    public boolean isPredictionCategoryAValidValue() {

    	if ( this.predictionCategory.equals(STRING_TOLERATED) || 
    			this.predictionCategory.equals(STRING_DELETERIOUS) || 
    			this.predictionCategory.equals(STRING_NOT_SCORED)  || 
    			this.predictionCategory.equals(STRING_NAN) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isPredictionCategoryTolerated() {

    	if ( this.predictionCategory.equals(STRING_TOLERATED) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isPredictionCategoryDeleterious() {

    	if ( this.predictionCategory.equals(STRING_DELETERIOUS) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isPredictionCategoryNotScored() {

    	if ( this.predictionCategory.equals(STRING_NOT_SCORED) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isPredictionCategoryNAN() {

    	if ( this.predictionCategory.equals(STRING_NAN) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public void setPredictionCategoryTolerated() {

    	this.setPredictionCategory(STRING_TOLERATED);
    }
    public void setPredictionCategoryDeleterious() {

    	this.setPredictionCategory(STRING_DELETERIOUS);
    }
    public void setPredictionCategoryNotScored() {

    	this.setPredictionCategory(STRING_NOT_SCORED);
    }
    public void setPredictionCategoryNAN() {

    	this.setPredictionCategory(STRING_NAN);
    }
    public boolean isScoreSiftANumber() {

    	if ( StringUtility.isItNumericWithLeadingSignAndDecimalPoint(this.scoreSift) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isScoreConservationANumber() {

    	if ( StringUtility.isItNumericWithLeadingSignAndDecimalPoint(this.scoreConservation) ) {
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
    public boolean isScoreSiftNAN() {

    	if ( "nan".equals(this.scoreSift.toLowerCase()) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isScoreConservationNAN() {

    	if ( "nan".equals(this.scoreConservation.toLowerCase()) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isProteinAlignNAN() {

    	if ( "nan".equals(this.proteinAlignNumber.toLowerCase()) ) {
    		return true;
    	}
    	else {
    		
    		return false;
    	}
    }
    public boolean isTotalAlignSequenceNAN() {

    	if ( "nan".equals(this.totalAlignSequenceNumber.toLowerCase()) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isScoreSiftEmpty() {

    	if ( "".equals(this.scoreSift.toLowerCase()) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isScoreConservationEmpty() {

    	if ( "".equals(this.scoreConservation.toLowerCase()) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isProteinAlignEmpty() {

    	if ( "".equals(this.proteinAlignNumber.toLowerCase()) ) {
    		return true;
    	}
    	else {
    		
    		return false;
    	}
    }
    public boolean isTotalAlignSequenceEmpty() {

    	if ( "".equals(this.totalAlignSequenceNumber.toLowerCase()) ) {
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

            if ( this.isScoreSiftANumber() && 
            		this.isScoreConservationANumber() && 
            		this.isProteinAlignANumber() && 
            		this.isTotalAlignSequenceANumber() ) {

            	return true;
            }
            else {

                if ( this.isScoreSiftNAN() && 
                		this.isScoreConservationNAN() && 
                		this.isProteinAlignNAN() && 
                		this.isTotalAlignSequenceNAN() ) {

                	return true;
                }
                else {
                	
                    if ( this.isScoreSiftEmpty() && 
                    		this.isScoreConservationEmpty() && 
                    		this.isProteinAlignEmpty() && 
                    		this.isTotalAlignSequenceEmpty() ) {

                    	return true;
                    }
                    else {

                    	return false;
                    }
                }
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

    	if ( this.isPredictionCategoryNotScored() || 
    			this.isPredictionCategoryNAN() ) {

	    	this.setPredictionCategoryNotScored();
	    	this.setScoreSift("0");
	    	this.setScoreConservation("0");
	    	this.setProteinAlignNumber("0");
	    	this.setTotalAlignSequenceNumber("0");
        }
    	
        if ( this.isScoreSiftNAN() && 
        		this.isScoreConservationNAN() && 
        		this.isProteinAlignNAN() && 
        		this.isTotalAlignSequenceNAN() ) {

	    	this.setPredictionCategoryNotScored();
	    	this.setScoreSift("0");
	    	this.setScoreConservation("0");
	    	this.setProteinAlignNumber("0");
	    	this.setTotalAlignSequenceNumber("0");
        }
    	
        if ( this.isScoreSiftEmpty() && 
        		this.isScoreConservationEmpty() && 
        		this.isProteinAlignEmpty() && 
        		this.isTotalAlignSequenceEmpty() ) {

	    	this.setPredictionCategoryNotScored();
	    	this.setScoreSift("0");
	    	this.setScoreConservation("0");
	    	this.setProteinAlignNumber("0");
	    	this.setTotalAlignSequenceNumber("0");
        }
    	
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
        return ToStringBuilder.reflectionToString(this, new CustomDateToStringStyle());
    }
}
