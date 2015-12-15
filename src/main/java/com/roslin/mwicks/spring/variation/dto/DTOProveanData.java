package com.roslin.mwicks.spring.variation.dto;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.hibernate.validator.constraints.NotEmpty;

import com.roslin.mwicks.spring.variation.model.other.ProveanData;

import com.roslin.mwicks.utility.ObjectConverter;
import com.roslin.mwicks.utility.StringUtility;


/**
 * A DTO object which is used as a form object
 * in create person and edit person forms.
 * @author Mike Wicks
 */
public class DTOProveanData {
    
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
    private String scoreProvean;
    
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


    public DTOProveanData() {

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
    public String getScoreProvean() {
    	return this.scoreProvean;
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
    public Double getScoreProveanAsDouble() {
    	return Double.parseDouble(this.scoreProvean);
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
    public void setScoreProvean(String scoreProvean) {
    	this.scoreProvean = scoreProvean;
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
    public boolean isScoreProveanANumber() {

    	if ( StringUtility.isItNumeric(this.scoreProvean) ) {
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
     * Is this ProveanData VALID?
     */
    public boolean isThisAValidProveanData(){

        if (this.isScoreProveanANumber() && 
        	    this.isProteinAlignANumber() && 
        	    this.isTotalAlignSequenceANumber()  
        	    ) {

        	return true;
        }
        else {

        	return false;
        }
    }


    /*
     * Convert a DTOProveanData Object to an ProveanData Object
     */
    public ProveanData convertToProveanData(){

    	ProveanData proveandata = ProveanData.getBuilder(
    	    	this.getSnpId(),
    	    	this.getEnsemblGene(),
    	    	this.getEnsemblTranscript(),
    	    	this.getEnsemblAnnotation(),
    	    	this.getAminoAcidSubs(),
    	    	this.getScoreProveanAsDouble(),
    	    	this.getProteinAlignNumberAsLong(),
    	    	this.getTotalAlignSequenceNumberAsLong()
        		).build();
    	
    	proveandata.deriveChromosomeId();
    	
        return proveandata;
    }

    
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
