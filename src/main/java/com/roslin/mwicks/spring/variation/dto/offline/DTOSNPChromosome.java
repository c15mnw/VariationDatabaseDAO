package com.roslin.mwicks.spring.variation.dto.offline;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.hibernate.validator.constraints.NotEmpty;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;
import com.roslin.mwicks.utility.ObjectConverter;
import com.roslin.mwicks.utility.StringUtility;


/**
 * A DTO object which is used as a form object
 * in create person and edit person forms.
 * @author Mike Wicks
 */
public class DTOSNPChromosome {
    
    // Constants ----------------------------------------------------------------------------------
	protected static final String STRING_NA = "N/A";
	protected static final String STRING_FIXED = "Fixed";
	protected static final String STRING_NOT_FIXED = "Not Fixed";
	protected static final String STRING_REFERENCE = "Ref.";
	
	protected static final String STRING_TOLERATED = "TOLERATED";
	protected static final String STRING_DELETERIOUS = "DELETERIOUS";
	protected static final String STRING_BLANK = "";
	
    // Properties ---------------------------------------------------------------------------------
	private Long oid;
    
    @NotEmpty
    private String snpId;
    
    @NotEmpty
    private String chromosomeId;
    
    @NotEmpty
    private String position;
    
    @NotEmpty
    private String reference;    
    
    @NotEmpty
    private String alternative;
    
    @NotEmpty
    private String region;
    
    @NotEmpty
    private String ensemblGene;
    
    @NotEmpty
    private String ensemblTranscript;
    
    @NotEmpty
    private String ensemblAnnotation;
    
    @NotEmpty
    private String strain7Allele;
    
    @NotEmpty
    private String strain7AlleleFixed;
    
    @NotEmpty
    private String strainPAllele;
    
    @NotEmpty
    private String strainPAlleleFixed;
    
    @NotEmpty
    private String strainWAllele;
    
    @NotEmpty
    private String strainWAlleleFixed;
    
    @NotEmpty
    private String strainNAllele;
    
    @NotEmpty
    private String strainNAlleleFixed;
    
    @NotEmpty
    private String strain15IAllele;
    
    @NotEmpty
    private String strain15IAlleleFixed;
    
    @NotEmpty
    private String strainZeroAllele;
    
    @NotEmpty
    private String strainZeroAlleleFixed;
    
    @NotEmpty
    private String strain6Allele;
    
    @NotEmpty
    private String strain6AlleleFixed;
    
    @NotEmpty
    private String strainCAllele;
    
    @NotEmpty
    private String strainCAlleleFixed;
    
    @NotEmpty
    private Date creationTime;
    
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
    private String scoreProvean;
    
    @NotEmpty
    private Date modificationTime;
    
    @NotEmpty
    private long version;


    public DTOSNPChromosome() {

    }

    // Getters ------------------------------------------------------------------------------------
    public Long getOid() {
    	return oid;
    }
    public String getSnpId() {
    	return snpId;
    }
    public String getChromosomeId() {
    	return chromosomeId;
    }
    public String getPosition() {
    	return position;
    }
    public String getReference() {
    	return reference;    
    }
    public String getAlternative() {
    	return alternative;
    }
    public String getRegion() {
    	return region;
    }
    public String getEnsemblGene() {
    	return ensemblGene;
    }
    public String getEnsemblTranscript() {
    	return ensemblTranscript;
    }
    public String getEnsemblAnnotation() {
    	return ensemblAnnotation;
    }
    public String getStrain7Allele() {
    	return strain7Allele;
    }
    public String getStrain7AlleleFixed() {
    	return strain7AlleleFixed;
    }
    public String getStrainPAllele() {
    	return strainPAllele;
    }
    public String getStrainPAlleleFixed() {
    	return strainPAlleleFixed;
    }
    public String getStrainWAllele() {
    	return strainWAllele;
    }
    public String getStrainWAlleleFixed() {
    	return strainWAlleleFixed;
    }
    public String getStrainNAllele() {
    	return strainNAllele;
    }
    public String getStrainNAlleleFixed() {
    	return strainNAlleleFixed;
    }
    public String getStrain15IAllele() {
    	return strain15IAllele;
    }
    public String getStrain15IAlleleFixed() {
    	return strain15IAlleleFixed;
    }
    public String getStrainZeroAllele() {
    	return strainZeroAllele;
    }
    public String getStrainZeroAlleleFixed() {  
    	return strainZeroAlleleFixed;
    }
    public String getStrain6Allele() {
    	return strain6Allele;
    }
    public String getStrain6AlleleFixed() {
    	return strain6AlleleFixed;
    }
    public String getStrainCAllele() {
    	return strainCAllele;
    }
    public String getStrainCAlleleFixed() {
    	return strainCAlleleFixed;
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
    public String getScoreProvean() {
    	return this.scoreProvean;
    }
    public Date getCreationTime() {
    	return creationTime;
    }
    public Date getModificationTime() {
    	return modificationTime;
    }
    public long getVersion() {
        return version;
    }
    
    // Getters As Required DataTypes --------------------------------------------------------------
    public long getOidAsString() {
    	return ObjectConverter.convert(this.oid, Long.class);
    }
    public int getPositionAsInteger() {
    	return ObjectConverter.convert(this.position, Integer.class);
    }
    public double getScoreSiftAsLong() {
    	return ObjectConverter.convert(this.scoreSift, Double.class);
    }
    public double getScoreConservationAsLong() {
    	return ObjectConverter.convert(this.scoreConservation, Double.class);
    }
    public Long getProteinAlignNumberAsLong() {
    	return ObjectConverter.convert(this.proteinAlignNumber, Long.class);
    }
    public Long getTotalAlignSequenceNumberAsLong() {
    	return ObjectConverter.convert(this.totalAlignSequenceNumber, Long.class);
    }
    public double getScoreProveanAsLong() {
    	return ObjectConverter.convert(this.scoreProvean, Double.class);
    }

    public String getCreationTimeAsString() {
    	return ObjectConverter.convert(this.creationTime, String.class);
    }
    public String getModificationTimeAsString() {
    	return ObjectConverter.convert(this.modificationTime, String.class);
    }
    public String getVersionAsString() {
    	return ObjectConverter.convert(this.version, String.class);
    }

    // Setters ------------------------------------------------------------------------------------
    public void setOid(Long oid) {
    	this.oid = oid;
    }
    public void setSnpId(String snpId) {
    	this.snpId = snpId;
    }
    public void setChromosomeId(String chromosomeId) {
    	this.chromosomeId = chromosomeId;
    }
    public void setPosition(String position) {
    	this.position = position;
    }
    public void setReference(String reference) {
    	this.reference = reference;    
    }
    public void setAlternative(String alternative) {
    	this.alternative = alternative;
    }
    public void setRegion(String region) {
    	this.region = region;
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
    public void setStrain7Allele(String strain7Allele) {
    	this.strain7Allele = strain7Allele;
    }
    public void setStrain7AlleleFixed(String strain7AlleleFixed) {
    	this.strain7AlleleFixed = strain7AlleleFixed;
    }
    public void setStrainPAllele(String strainPAllele) {
    	this.strainPAllele = strainPAllele;
    }
    public void setStrainPAlleleFixed(String strainPAlleleFixed) {
    	this.strainPAlleleFixed = strainPAlleleFixed;
    }
    public void setStrainWAllele(String strainWAllele) {
    	this.strainWAllele = strainWAllele;
    }
    public void setStrainWAlleleFixed(String strainWAlleleFixed) {
    	this.strainWAlleleFixed = strainWAlleleFixed;
    }
    public void setStrainNAllele(String strainNAllele) {
    	this.strainNAllele = strainNAllele;
    }
    public void setStrainNAlleleFixed(String strainNAlleleFixed) {
    	this.strainNAlleleFixed = strainNAlleleFixed;
    }
    public void setStrain15IAllele(String strain15IAllele) {
    	this.strain15IAllele = strain15IAllele;
    }
    public void setStrain15IAlleleFixed(String strain15IAlleleFixed) {
    	this.strain15IAlleleFixed = strain15IAlleleFixed;
    }
    public void setStrainZeroAllele(String strainZeroAllele) {
    	this.strainZeroAllele = strainZeroAllele;
    }
    public void setStrainZeroAlleleFixed(String strainZeroAlleleFixed) {  
    	this.strainZeroAlleleFixed = strainZeroAlleleFixed;
    }
    public void setStrain6Allele(String strain6Allele) {
    	this.strain6Allele = strain6Allele;
    }
    public void setStrain6AlleleFixed(String strain6AlleleFixed) {
    	this.strain6AlleleFixed = strain6AlleleFixed;
    }
    public void setStrainCAllele(String strainCAllele) {
    	this.strainCAllele = strainCAllele;
    }
    public void setStrainCAlleleFixed(String strainCAlleleFixed) {
    	this.strainCAlleleFixed = strainCAlleleFixed;
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
    public void setScoreProvean(String scoreProvean) {
    	this.scoreProvean = scoreProvean;
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
    public boolean isPositionAnInteger() {
         
    	if ( StringUtility.isItNumeric(this.position) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isStrain7AlleleFixedAValidValue() {

    	if ( this.strain7AlleleFixed.equals(STRING_FIXED) || 
    			this.strain7AlleleFixed.equals(STRING_NOT_FIXED) || 
    			this.strain7AlleleFixed.equals(STRING_NA) || 
    			this.strain7AlleleFixed.equals(STRING_REFERENCE) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainPAlleleFixedAValidValue() {

    	if ( this.strainPAlleleFixed.equals(STRING_FIXED) || 
    			this.strainPAlleleFixed.equals(STRING_NOT_FIXED) || 
    			this.strainPAlleleFixed.equals(STRING_NA) || 
     			this.strainPAlleleFixed.equals(STRING_REFERENCE) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainWAlleleFixedAValidValue() {

    	if ( this.strainWAlleleFixed.equals(STRING_FIXED) || 
    			this.strainWAlleleFixed.equals(STRING_NOT_FIXED) || 
    			this.strainWAlleleFixed.equals(STRING_NA) || 
    			this.strainWAlleleFixed.equals(STRING_REFERENCE) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainNAlleleFixedAValidValue() {

    	if ( this.strainNAlleleFixed.equals(STRING_FIXED) || 
    			this.strainNAlleleFixed.equals(STRING_NOT_FIXED) || 
    			this.strainNAlleleFixed.equals(STRING_NA) || 
    			this.strainNAlleleFixed.equals(STRING_REFERENCE) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain15IAlleleFixedAValidValue() {

    	if ( this.strain15IAlleleFixed.equals(STRING_FIXED) || 
    			this.strain15IAlleleFixed.equals(STRING_NOT_FIXED) || 
    			this.strain15IAlleleFixed.equals(STRING_NA) || 
    			this.strain15IAlleleFixed.equals(STRING_REFERENCE) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainZeroAlleleFixedAValidValue() {  

    	if ( this.strainZeroAlleleFixed.equals(STRING_FIXED) || 
    			this.strainZeroAlleleFixed.equals(STRING_NOT_FIXED) || 
    			this.strainZeroAlleleFixed.equals(STRING_NA) || 
    			this.strainZeroAlleleFixed.equals(STRING_REFERENCE) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain6AlleleFixedAValidValue() {

    	if ( this.strain6AlleleFixed.equals(STRING_FIXED) || 
    			this.strain6AlleleFixed.equals(STRING_NOT_FIXED) || 
    			this.strain6AlleleFixed.equals(STRING_NA) || 
    			this.strain6AlleleFixed.equals(STRING_REFERENCE) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainCAlleleFixedAValidValue() {

    	if ( this.strainCAlleleFixed.equals(STRING_FIXED) || 
    			this.strainCAlleleFixed.equals(STRING_NOT_FIXED) || 
    			this.strainCAlleleFixed.equals(STRING_NA) || 
    			this.strainCAlleleFixed.equals(STRING_REFERENCE) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isPredictionCategoryAValidValue() {

    	if ( this.predictionCategory.equals(STRING_TOLERATED) || 
    			this.predictionCategory.equals(STRING_DELETERIOUS) || 
    			this.predictionCategory.equals(STRING_BLANK)
    			) {
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
    public boolean isProteinAlignNumbertANumber() {
        
    	if ( StringUtility.isItNumeric(this.proteinAlignNumber) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isTotalAlignSequenceNumberANumber() {
        
    	if ( StringUtility.isItNumeric(this.totalAlignSequenceNumber) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isScoreProveanANumber() {
        
    	if ( StringUtility.isItNumeric(this.scoreProvean) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    


    // Helpers ------------------------------------------------------------------------------------    
    /*
     * Is this SNPChromosome VALID?
     */
    public boolean isThisAValidSNPChromosome(){

        if (this.isPositionAnInteger() && 
        	    this.isStrain7AlleleFixedAValidValue() && 
        	    this.isStrainPAlleleFixedAValidValue() &&
        	    this.isStrainWAlleleFixedAValidValue() && 
        	    this.isStrainNAlleleFixedAValidValue() && 
        	    this.isStrain15IAlleleFixedAValidValue() && 
        	    this.isStrainZeroAlleleFixedAValidValue() && 
        	    this.isStrain6AlleleFixedAValidValue() && 
        	    this.isStrainCAlleleFixedAValidValue() && 
        	    this.isPredictionCategoryAValidValue() && 
        	    this.isScoreSiftANumber() && 
        	    this.isScoreConservationANumber() && 
        	    this.isProteinAlignNumbertANumber() && 
        	    this.isTotalAlignSequenceNumberANumber() && 
        	    this.isScoreProveanANumber()  
        	    ) {

        	return true;
        }
        else {

        	return false;
        }
    }


    /*
     * Convert a DTOSNPChromosome Object to an SNPChromosome Object
     */
    public SNPChromosome convertToSNPChromosome(){

    	SNPChromosome snpchromosome = SNPChromosome.getBuilder(
        		this.getSnpId(),
        		this.getChromosomeId(),
        		this.getPositionAsInteger(),
        		this.getReference(),    
        		this.getAlternative(),
        		this.getRegion(),
        		this.getEnsemblGene(),
        		this.getEnsemblTranscript(),
        		this.getEnsemblAnnotation(),
        		this.getStrain7Allele(),
        		this.getStrain7AlleleFixed(),
        		this.getStrainPAllele(),
        		this.getStrainPAlleleFixed(),
        		this.getStrainWAllele(),
        		this.getStrainWAlleleFixed(),
        		this.getStrainNAllele(),
        		this.getStrainNAlleleFixed(),
        		this.getStrain15IAllele(),
        		this.getStrain15IAlleleFixed(),
        		this.getStrainZeroAllele(),
        		this.getStrainZeroAlleleFixed(),
        		this.getStrain6Allele(),
        		this.getStrain6AlleleFixed(),
        		this.getStrainCAllele(),
        		this.getStrainCAlleleFixed(),
                this.getAminoAcidSubs(),
                this.getPredictionCategory(),
                this.getScoreSiftAsLong(),
                this.getScoreConservationAsLong(),
                this.getProteinAlignNumberAsLong(),
                this.getTotalAlignSequenceNumberAsLong(),
                this.getScoreProveanAsLong()
        		).build();
        
        return snpchromosome;
    }

    
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
