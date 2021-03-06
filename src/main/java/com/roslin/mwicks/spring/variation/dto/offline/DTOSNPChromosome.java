package com.roslin.mwicks.spring.variation.dto.offline;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.hibernate.validator.constraints.NotEmpty;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosomePrimaryKey;
import com.roslin.mwicks.spring.variation.format.CustomDateToStringStyle;

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
    private String strain7AlleleRatio;
    
    @NotEmpty
    private String strain7AlleleAlternativeCount;
    
    @NotEmpty
    private String strain7AlleleReferenceCount;
    
    @NotEmpty
    private String strainPAllele;
    
    @NotEmpty
    private String strainPAlleleFixed;
    
    @NotEmpty
    private String strainPAlleleRatio;
    
    @NotEmpty
    private String strainPAlleleAlternativeCount;
    
    @NotEmpty
    private String strainPAlleleReferenceCount;
    
    @NotEmpty
    private String strainWAllele;
    
    @NotEmpty
    private String strainWAlleleFixed;
    
    @NotEmpty
    private String strainWAlleleRatio;
    
    @NotEmpty
    private String strainWAlleleAlternativeCount;
    
    @NotEmpty
    private String strainWAlleleReferenceCount;
    
    @NotEmpty
    private String strainNAllele;
    
    @NotEmpty
    private String strainNAlleleFixed;
    
    @NotEmpty
    private String strainNAlleleRatio;
    
    @NotEmpty
    private String strainNAlleleAlternativeCount;
    
    @NotEmpty
    private String strainNAlleleReferenceCount;
    
    @NotEmpty
    private String strain15IAllele;
    
    @NotEmpty
    private String strain15IAlleleFixed;
    
    @NotEmpty
    private String strain15IAlleleRatio;
    
    @NotEmpty
    private String strain15IAlleleAlternativeCount;
    
    @NotEmpty
    private String strain15IAlleleReferenceCount;
    
    @NotEmpty
    private String strainZeroAllele;
    
    @NotEmpty
    private String strainZeroAlleleFixed;
    
    @NotEmpty
    private String strainZeroAlleleRatio;
    
    @NotEmpty
    private String strainZeroAlleleAlternativeCount;
    
    @NotEmpty
    private String strainZeroAlleleReferenceCount;
    
    @NotEmpty
    private String strain6Allele;
    
    @NotEmpty
    private String strain6AlleleFixed;
    
    @NotEmpty
    private String strain6AlleleRatio;
    
    @NotEmpty
    private String strain6AlleleAlternativeCount;
    
    @NotEmpty
    private String strain6AlleleReferenceCount;
    
    @NotEmpty
    private String strainCAllele;
    
    @NotEmpty
    private String strainCAlleleFixed;
    
    @NotEmpty
    private String strainCAlleleRatio;
    
    @NotEmpty
    private String strainCAlleleAlternativeCount;
    
    @NotEmpty
    private String strainCAlleleReferenceCount;
    
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
    private Date creationTime;
    
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
    	return this.strain7Allele;
    }
    public String getStrain7AlleleFixed() {
    	return this.strain7AlleleFixed;
    }
    public String getStrain7AlleleRatio() {
    	return this.strain7AlleleRatio;
    }
    public String getStrain7AlleleAlternativeCount() {
    	return this.strain7AlleleAlternativeCount;
    }
    public String getStrain7AlleleReferenceCount() {
    	return this.strain7AlleleReferenceCount;
    }
    public String getStrainPAllele() {
    	return this.strainPAllele;
    }
    public String getStrainPAlleleFixed() {
    	return this.strainPAlleleFixed;
    }
    public String getStrainPAlleleRatio() {
    	return this.strainPAlleleRatio;
    }
    public String getStrainPAlleleAlternativeCount() {
    	return this.strainPAlleleAlternativeCount;
    }
    public String getStrainPAlleleReferenceCount() {
    	return this.strainPAlleleReferenceCount;
    }
    public String getStrainWAllele() {
    	return this.strainWAllele;
    }
    public String getStrainWAlleleFixed() {
    	return this.strainWAlleleFixed;
    }
    public String getStrainWAlleleRatio() {
    	return this.strainWAlleleRatio;
    }
    public String getStrainWAlleleAlternativeCount() {
    	return this.strainWAlleleAlternativeCount	;
    }
    public String getStrainWAlleleReferenceCount() {
    	return this.strainWAlleleReferenceCount;
    }
    public String getStrainNAllele() {
    	return this.strainNAllele;
    }
    public String getStrainNAlleleFixed() {
    	return this.strainNAlleleFixed;
    }
    public String getStrainNAlleleRatio() {
    	return this.strainNAlleleRatio;
    }
    public String getStrainNAlleleAlternativeCount() {
    	return this.strainNAlleleAlternativeCount;
    }
    public String getStrainNAlleleReferenceCount() {
    	return this.strainNAlleleReferenceCount;
    }
    public String getStrain15IAllele() {
    	return this.strain15IAllele;
    }
    public String getStrain15IAlleleFixed() {
    	return this.strain15IAlleleFixed;
    }
    public String getStrain15IAlleleRatio() {
    	return this.strain15IAlleleRatio;
    }
    public String getStrain15IAlleleAlternativeCount() {
    	return this.strain15IAlleleAlternativeCount;
    }
    public String getStrain15IAlleleReferenceCount() {
    	return this.strain15IAlleleReferenceCount;
    }
    public String getStrainZeroAllele() {
    	return this.strainZeroAllele;
    }
    public String getStrainZeroAlleleFixed() {  
    	return this.strainZeroAlleleFixed;
    }
    public String getStrainZeroAlleleRatio() {
    	return this.strainZeroAlleleRatio;
    }
    public String getStrainZeroAlleleAlternativeCount() {
    	return this.strainZeroAlleleAlternativeCount;
    }
    public String getStrainZeroAlleleReferenceCount() {
    	return this.strainZeroAlleleReferenceCount;
    }
    public String getStrain6Allele() {
    	return this.strain6Allele;
    }
    public String getStrain6AlleleFixed() {
    	return this.strain6AlleleFixed;
    }
    public String getStrain6AlleleRatio() {
    	return this.strain6AlleleRatio;
    }
    public String getStrain6AlleleAlternativeCount() {
    	return this.strain6AlleleAlternativeCount;
    }
    public String getStrain6AlleleReferenceCount() {
    	return this.strain6AlleleReferenceCount;
    }
    public String getStrainCAllele() {
    	return this.strainCAllele;
    }
    public String getStrainCAlleleFixed() {
    	return this.strainCAlleleFixed;
    }
    public String getStrainCAlleleRatio() {
    	return this.strainCAlleleRatio;
    }
    public String getStrainCAlleleAlternativeCount() {
    	return this.strainCAlleleAlternativeCount;
    }
    public String getStrainCAlleleReferenceCount() {
    	return this.strainCAlleleReferenceCount;
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
    
    public Double getStrain7AlleleRatioAsDouble() {
        return ObjectConverter.convert(this.strain7AlleleRatio, Double.class);
    }
    public Long getStrain7AlleleAlternativeCountAsLong() {
        return ObjectConverter.convert(this.strain7AlleleAlternativeCount, Long.class);
    }
    public Long getStrain7AlleleReferenceCountAsLong() {
        return ObjectConverter.convert(this.strain7AlleleReferenceCount, Long.class);
    }
    public Double getStrainPAlleleRatioAsDouble() {
        return ObjectConverter.convert(this.strainPAlleleRatio, Double.class);
    }
    public Long getStrainPAlleleAlternativeCountAsLong() {
        return ObjectConverter.convert(this.strainPAlleleAlternativeCount, Long.class);
    }
    public Long getStrainPAlleleReferenceCountAsLong() {
        return ObjectConverter.convert(this.strainPAlleleReferenceCount, Long.class);
    }
    public Double getStrainWAlleleRatioAsDouble() {
        return ObjectConverter.convert(this.strainWAlleleRatio, Double.class);
    }
    public Long getStrainWAlleleAlternativeCountAsLong() {
        return ObjectConverter.convert(this.strainWAlleleAlternativeCount, Long.class);
    }
    public Long getStrainWAlleleReferenceCountAsLong() {
        return ObjectConverter.convert(this.strainWAlleleReferenceCount, Long.class);
    }
    public Double getStrainNAlleleRatioAsDouble() {
        return ObjectConverter.convert(this.strainNAlleleRatio, Double.class);
    }
    public Long getStrainNAlleleAlternativeCountAsLong() {
        return ObjectConverter.convert(this.strainNAlleleAlternativeCount, Long.class);
    }
    public Long getStrainNAlleleReferenceCountAsLong() {
        return ObjectConverter.convert(this.strainNAlleleReferenceCount, Long.class);
    }
    public Double getStrain15IAlleleRatioAsDouble() {
        return ObjectConverter.convert(this.strain15IAlleleRatio, Double.class);
    }
    public Long getStrain15IAlleleAlternativeCountAsLong() {
        return ObjectConverter.convert(this.strain15IAlleleAlternativeCount, Long.class);
    }
    public Long getStrain15IAlleleReferenceCountAsLong() {
        return ObjectConverter.convert(this.strain15IAlleleReferenceCount, Long.class);
    }
    public Double getStrainZeroAlleleRatioAsDouble() {
        return ObjectConverter.convert(this.strainZeroAlleleRatio, Double.class);
    }
    public Long getStrainZeroAlleleAlternativeCountAsLong() {
        return ObjectConverter.convert(this.strainZeroAlleleAlternativeCount, Long.class);
    }
    public Long getStrainZeroAlleleReferenceCountAsLong() {
        return ObjectConverter.convert(this.strainZeroAlleleReferenceCount, Long.class);
    }
    public Double getStrain6AlleleRatioAsDouble() {
        return ObjectConverter.convert(this.strain6AlleleRatio, Double.class);
    }
    public Long getStrain6AlleleAlternativeCountAsLong() {
        return ObjectConverter.convert(this.strain6AlleleAlternativeCount, Long.class);
    }
    public Long getStrain6AlleleReferenceCountAsLong() {
        return ObjectConverter.convert(this.strain6AlleleReferenceCount, Long.class);
    }
    public Double getStrainCAlleleRatioAsDouble() {
        return ObjectConverter.convert(this.strainCAlleleRatio, Double.class);
    }
    public Long getStrainCAlleleAlternativeCountAsLong() {
        return ObjectConverter.convert(this.strainCAlleleAlternativeCount, Long.class);
    }
    public Long getStrainCAlleleReferenceCountAsLong() {
        return ObjectConverter.convert(this.strainCAlleleReferenceCount, Long.class);
    }

    public int getPositionAsInteger() {
    	return ObjectConverter.convert(this.position, Integer.class);
    }
    public double getScoreSiftAsDouble() {
    	return ObjectConverter.convert(this.scoreSift, Double.class);
    }
    public double getScoreConservationAsDouble() {
    	return ObjectConverter.convert(this.scoreConservation, Double.class);
    }
    public Long getProteinAlignNumberAsLong() {
    	return ObjectConverter.convert(this.proteinAlignNumber, Long.class);
    }
    public Long getTotalAlignSequenceNumberAsLong() {
    	return ObjectConverter.convert(this.totalAlignSequenceNumber, Long.class);
    }
    public double getScoreProveanAsDouble() {
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
    public void setStrain7AlleleRatio(String strain7AlleleRatio) {
    	this.strain7AlleleRatio = strain7AlleleRatio;
    }
    public void setStrain7AlleleAlternativeCount(String strain7AlleleAlternativeCount) {
    	this.strain7AlleleAlternativeCount = strain7AlleleAlternativeCount;
    }
    public void setStrain7AlleleReferenceCount(String strain7AlleleReferenceCount) {
    	this.strain7AlleleReferenceCount = strain7AlleleReferenceCount;
    }
    public void setStrainPAllele(String strainPAllele) {
    	this.strainPAllele = strainPAllele;
    }
    public void setStrainPAlleleFixed(String strainPAlleleFixed) {
    	this.strainPAlleleFixed = strainPAlleleFixed;
    }
    public void setStrainPAlleleRatio(String strainPAlleleRatio) {
    	this.strainPAlleleRatio = strainPAlleleRatio;
    }
    public void setStrainPAlleleAlternativeCount(String strainPAlleleAlternativeCount) {
    	this.strainPAlleleAlternativeCount = strainPAlleleAlternativeCount;
    }
    public void setStrainPAlleleReferenceCount(String strainPAlleleReferenceCount) {
    	this.strainPAlleleReferenceCount = strainPAlleleReferenceCount;
    }
    public void setStrainWAllele(String strainWAllele) {
    	this.strainWAllele = strainWAllele;
    }
    public void setStrainWAlleleFixed(String strainWAlleleFixed) {
    	this.strainWAlleleFixed = strainWAlleleFixed;
    }
    public void setStrainWAlleleRatio(String strainWAlleleRatio) {
    	this.strainWAlleleRatio = strainWAlleleRatio;
    }
    public void setStrainWAlleleAlternativeCount(String strainWAlleleAlternativeCount) {
    	this.strainWAlleleAlternativeCount	= strainWAlleleAlternativeCount;
    }
    public void setStrainWAlleleReferenceCount(String strainWAlleleReferenceCount) {
    	this.strainWAlleleReferenceCount = strainWAlleleReferenceCount;
    }
    public void setStrainNAllele(String strainNAllele) {
    	this.strainNAllele = strainNAllele;
    }
    public void setStrainNAlleleFixed(String strainNAlleleFixed) {
    	this.strainNAlleleFixed = strainNAlleleFixed;
    }
    public void setStrainNAlleleRatio(String strainNAlleleRatio) {
    	this.strainNAlleleRatio = strainNAlleleRatio;
    }
    public void setStrainNAlleleAlternativeCount(String strainNAlleleAlternativeCount) {
    	this.strainNAlleleAlternativeCount = strainNAlleleAlternativeCount;
    }
    public void setStrainNAlleleReferenceCount(String strainNAlleleReferenceCount) {
    	this.strainNAlleleReferenceCount = strainNAlleleReferenceCount;
    }
    public void setStrain15IAllele(String strain15IAllele) {
    	this.strain15IAllele = strain15IAllele;
    }
    public void setStrain15IAlleleFixed(String strain15IAlleleFixed) {
    	this.strain15IAlleleFixed = strain15IAlleleFixed;
    }
    public void setStrain15IAlleleRatio(String strain15IAlleleRatio) {
    	this.strain15IAlleleRatio = strain15IAlleleRatio;
    }
    public void setStrain15IAlleleAlternativeCount(String strain15IAlleleAlternativeCount) {
    	this.strain15IAlleleAlternativeCount = strain15IAlleleAlternativeCount;
    }
    public void setStrain15IAlleleReferenceCount(String strain15IAlleleReferenceCount) {
    	this.strain15IAlleleReferenceCount = strain15IAlleleReferenceCount;
    }
    public void setStrainZeroAllele(String strainZeroAllele) {
    	this.strainZeroAllele = strainZeroAllele;
    }
    public void setStrainZeroAlleleFixed(String strainZeroAlleleFixed) {  
    	this.strainZeroAlleleFixed = strainZeroAlleleFixed;
    }
    public void setStrainZeroAlleleRatio(String strainZeroAlleleRatio) {
    	this.strainZeroAlleleRatio = strainZeroAlleleRatio;
    }
    public void setStrainZeroAlleleAlternativeCount(String strainZeroAlleleAlternativeCount) {
    	this.strainZeroAlleleAlternativeCount = strainZeroAlleleAlternativeCount;
    }
    public void setStrainZeroAlleleReferenceCount(String strainZeroAlleleReferenceCount) {
    	this.strainZeroAlleleReferenceCount = strainZeroAlleleReferenceCount;
    }
    public void setStrain6Allele(String strain6Allele) {
    	this.strain6Allele = strain6Allele;
    }
    public void setStrain6AlleleFixed(String strain6AlleleFixed) {
    	this.strain6AlleleFixed = strain6AlleleFixed;
    }
    public void setStrain6AlleleRatio(String strain6AlleleRatio) {
    	this.strain6AlleleRatio = strain6AlleleRatio;
    }
    public void setStrain6AlleleAlternativeCount(String strain6AlleleAlternativeCount) {
    	this.strain6AlleleAlternativeCount = strain6AlleleAlternativeCount;
    }
    public void setStrain6AlleleReferenceCount(String strain6AlleleReferenceCount) {
    	this.strain6AlleleReferenceCount = strain6AlleleReferenceCount;
    }
    public void setStrainCAllele(String strainCAllele) {
    	this.strainCAllele = strainCAllele;
    }
    public void setStrainCAlleleFixed(String strainCAlleleFixed) {
    	this.strainCAlleleFixed = strainCAlleleFixed;
    }
    public void setStrainCAlleleRatio(String strainCAlleleRatio) {
    	this.strainCAlleleRatio = strainCAlleleRatio;
    }
    public void setStrainCAlleleAlternativeCount(String strainCAlleleAlternativeCount) {
    	this.strainCAlleleAlternativeCount = strainCAlleleAlternativeCount;
    }
    public void setStrainCAlleleReferenceCount(String strainCAlleleReferenceCount) {
    	this.strainCAlleleReferenceCount = strainCAlleleReferenceCount;
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
    
    // Setters From Strings -----------------------------------------------------------------------
    public void setCreationTimeFromString(String creationTime) {
    	this.creationTime = ObjectConverter.convert(creationTime, Date.class);
    }
    public void setModificationTimeFromString(String modificationTime) {
    	this.modificationTime = ObjectConverter.convert(modificationTime, Date.class);
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

    public boolean isStrain7AlleleRatioANumber() {
        if ( StringUtility.isItNumericWithLeadingSignAndDecimalPoint(this.strain7AlleleRatio) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain7AlleleAlternativeCountANumber() {
        if ( StringUtility.isItNumeric(this.strain7AlleleAlternativeCount) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain7AlleleReferenceCountANumber() {
        if ( StringUtility.isItNumeric(this.strain7AlleleReferenceCount) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainPAlleleRatioANumber() {
        if ( StringUtility.isItNumericWithLeadingSignAndDecimalPoint(this.strainPAlleleRatio) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainPAlleleAlternativeCountANumber() {
        if ( StringUtility.isItNumeric(this.strainPAlleleAlternativeCount) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainPAlleleReferenceCountANumber() {
        if ( StringUtility.isItNumeric(this.strainPAlleleReferenceCount) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainWAlleleRatioANumber() {
        if ( StringUtility.isItNumericWithLeadingSignAndDecimalPoint(this.strainWAlleleRatio) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainWAlleleAlternativeCountANumber() {
        if ( StringUtility.isItNumeric(this.strainWAlleleAlternativeCount) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainWAlleleReferenceCountANumber() {
        if ( StringUtility.isItNumeric(this.strainWAlleleReferenceCount) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainNAlleleRatioANumber() {
        if ( StringUtility.isItNumericWithLeadingSignAndDecimalPoint(this.strainNAlleleRatio) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainNAlleleAlternativeCountANumber() {
        if ( StringUtility.isItNumeric(this.strainNAlleleAlternativeCount) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainNAlleleReferenceCountANumber() {
        if ( StringUtility.isItNumeric(this.strainNAlleleReferenceCount) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain15IAlleleRatioANumber() {
        if ( StringUtility.isItNumericWithLeadingSignAndDecimalPoint(this.strain15IAlleleRatio) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain15IAlleleAlternativeCountANumber() {
        if ( StringUtility.isItNumeric(this.strain15IAlleleAlternativeCount) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain15IAlleleReferenceCountANumber() {
        if ( StringUtility.isItNumeric(this.strain15IAlleleReferenceCount) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainZeroAlleleRatioANumber() {
        if ( StringUtility.isItNumericWithLeadingSignAndDecimalPoint(this.strainZeroAlleleRatio) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainZeroAlleleAlternativeCountANumber() {
        if ( StringUtility.isItNumeric(this.strainZeroAlleleAlternativeCount) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainZeroAlleleReferenceCountANumber() {
        if ( StringUtility.isItNumeric(this.strainZeroAlleleReferenceCount) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain6AlleleRatioANumber() {
        if ( StringUtility.isItNumericWithLeadingSignAndDecimalPoint(this.strain6AlleleRatio) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain6AlleleAlternativeCountANumber() {
        if ( StringUtility.isItNumeric(this.strain6AlleleAlternativeCount) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain6AlleleReferenceCountANumber() {
        if ( StringUtility.isItNumeric(this.strain6AlleleReferenceCount) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainCAlleleRatioANumber() {
        if ( StringUtility.isItNumericWithLeadingSignAndDecimalPoint(this.strainCAlleleRatio) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainCAlleleAlternativeCountANumber() {
        if ( StringUtility.isItNumeric(this.strainCAlleleAlternativeCount) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainCAlleleReferenceCountANumber() {
        if ( StringUtility.isItNumeric(this.strainCAlleleReferenceCount) ) {
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
    
    public boolean isDTOChromosomeNone() {
    	if ( this.chromosomeId.equals(ONLY_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome1() {
    	if ( this.chromosomeId.equals(ONLY_1)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome2() {
    	if ( this.chromosomeId.equals(ONLY_2)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome3() {
    	if ( this.chromosomeId.equals(ONLY_3)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome4() {
    	if ( this.chromosomeId.equals(ONLY_4)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome5() {
    	if ( this.chromosomeId.equals(ONLY_5)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome6() {
    	if ( this.chromosomeId.equals(ONLY_6)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome7() {
    	if ( this.chromosomeId.equals(ONLY_7)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome8() {
    	if ( this.chromosomeId.equals(ONLY_8)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome9() {
    	if ( this.chromosomeId.equals(ONLY_9)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome10() {
    	if ( this.chromosomeId.equals(ONLY_10)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome11() {
    	if ( this.chromosomeId.equals(ONLY_11)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome12() {
    	if ( this.chromosomeId.equals(ONLY_12)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome13() {
    	if ( this.chromosomeId.equals(ONLY_13)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome14() {
    	if ( this.chromosomeId.equals(ONLY_14)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome15() {
    	if ( this.chromosomeId.equals(ONLY_15)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome16() {
    	if ( this.chromosomeId.equals(ONLY_16)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome17() {
    	if ( this.chromosomeId.equals(ONLY_17)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome18() {
    	if ( this.chromosomeId.equals(ONLY_18)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome19() {
    	if ( this.chromosomeId.equals(ONLY_19)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome20() {
    	if ( this.chromosomeId.equals(ONLY_20)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome21() {
    	if ( this.chromosomeId.equals(ONLY_21)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome22() {
    	if ( this.chromosomeId.equals(ONLY_22)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome23() {
    	if ( this.chromosomeId.equals(ONLY_23)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome24() {
    	if ( this.chromosomeId.equals(ONLY_24)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome25() {
    	if ( this.chromosomeId.equals(ONLY_25)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome26() {
    	if ( this.chromosomeId.equals(ONLY_26)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome27() {
    	if ( this.chromosomeId.equals(ONLY_27)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome28() {
    	if ( this.chromosomeId.equals(ONLY_28)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome32() {
    	if ( this.chromosomeId.equals(ONLY_32)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosomeLGE22C19W28_E50C23() {
    	if ( this.chromosomeId.equals(ONLY_LGE22C19W28_E50C23)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosomeLGE64() {
    	if ( this.chromosomeId.equals(ONLY_LGE64)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosomeW() {
    	if ( this.chromosomeId.equals(ONLY_W)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosomeZ() {
    	if ( this.chromosomeId.equals(ONLY_Z)) {
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

    	/*
 		System.out.println("isThisAValidSNPChromosome");

 		System.out.println("1 : " + this.isPositionAnInteger() );
	    System.out.println("2 : " + this.isStrain7AlleleFixedAValidValue() );
	    System.out.println("3 : " + this.isStrainPAlleleFixedAValidValue() );
	    System.out.println("4 : " + this.isStrainWAlleleFixedAValidValue() );
	    System.out.println("5 : " + this.isStrainNAlleleFixedAValidValue() );
	    System.out.println("6 : " + this.isStrain15IAlleleFixedAValidValue() );
	    System.out.println("7 : " + this.isStrainZeroAlleleFixedAValidValue() );
	    System.out.println("8 : " + this.isStrain6AlleleFixedAValidValue() );
	    System.out.println("9 : " + this.isStrainCAlleleFixedAValidValue() );
	    System.out.println("10 : " + this.isStrain7AlleleRatioANumber() );
	    System.out.println("11 : " + this.isStrain7AlleleAlternativeCountANumber() );
	    System.out.println("12 : " + this.isStrain7AlleleReferenceCountANumber() );
	    System.out.println("13 : " + this.isStrainPAlleleRatioANumber() );
	    System.out.println("14 : " + this.isStrainPAlleleAlternativeCountANumber() );
	    System.out.println("15 : " + this.isStrainPAlleleReferenceCountANumber() );
	    System.out.println("16 : " + this.isStrainWAlleleRatioANumber() );
	    System.out.println("17 : " + this.isStrainWAlleleAlternativeCountANumber() );
	    System.out.println("18 : " + this.isStrainWAlleleReferenceCountANumber() );
	    System.out.println("19 : " + this.isStrainNAlleleRatioANumber() );
	    System.out.println("20 : " + this.isStrainNAlleleAlternativeCountANumber() );
	    System.out.println("21 : " + this.isStrainNAlleleReferenceCountANumber() );
	    System.out.println("22 : " + this.isStrain15IAlleleRatioANumber() );
	    System.out.println("23 : " + this.isStrain15IAlleleAlternativeCountANumber() );
	    System.out.println("24 : " + this.isStrain15IAlleleReferenceCountANumber() );
	    System.out.println("25 : " + this.isStrainZeroAlleleRatioANumber() );
	    System.out.println("26 : " + this.isStrainZeroAlleleAlternativeCountANumber() );
	    System.out.println("27 : " + this.isStrainZeroAlleleReferenceCountANumber() );
	    System.out.println("28 : " + this.isStrain6AlleleRatioANumber() );
	    System.out.println("29 : " + this.isStrain6AlleleAlternativeCountANumber() );
	    System.out.println("30 : " + this.isStrain6AlleleReferenceCountANumber() );
	    System.out.println("31 : " + this.isStrainCAlleleRatioANumber() );
	    System.out.println("32 : " + this.isStrainCAlleleAlternativeCountANumber() );
	    System.out.println("33 : " + this.isStrainCAlleleReferenceCountANumber() );
	    System.out.println("34 : " + this.isPredictionCategoryAValidValue() );
	    System.out.println("35 : " + this.isScoreSiftANumber() );
	    System.out.println("36 : " + this.isScoreConservationANumber() );
	    System.out.println("37 : " + this.isProteinAlignNumbertANumber() );
	    System.out.println("38 : " + this.isTotalAlignSequenceNumberANumber() );
	    System.out.println("39 : " + this.isScoreProveanANumber() );
    	 */

        if (this.isPositionAnInteger() && 
        	    this.isStrain7AlleleFixedAValidValue() && 
        	    this.isStrainPAlleleFixedAValidValue() &&
        	    this.isStrainWAlleleFixedAValidValue() && 
        	    this.isStrainNAlleleFixedAValidValue() && 
        	    this.isStrain15IAlleleFixedAValidValue() && 
        	    this.isStrainZeroAlleleFixedAValidValue() && 
        	    this.isStrain6AlleleFixedAValidValue() && 
        	    this.isStrainCAlleleFixedAValidValue() && 
        	    
        	    this.isStrain7AlleleRatioANumber() && 
        	    this.isStrain7AlleleAlternativeCountANumber() && 
        	    this.isStrain7AlleleReferenceCountANumber() && 

        	    this.isStrainPAlleleRatioANumber() && 
        	    this.isStrainPAlleleAlternativeCountANumber() && 
        	    this.isStrainPAlleleReferenceCountANumber() && 
        	    
        	    this.isStrainWAlleleRatioANumber() && 
        	    this.isStrainWAlleleAlternativeCountANumber() && 
        	    this.isStrainWAlleleReferenceCountANumber() && 
        	    
        	    this.isStrainNAlleleRatioANumber() && 
        	    this.isStrainNAlleleAlternativeCountANumber() && 
        	    this.isStrainNAlleleReferenceCountANumber() && 
        	    
        	    this.isStrain15IAlleleRatioANumber() && 
        	    this.isStrain15IAlleleAlternativeCountANumber() && 
        	    this.isStrain15IAlleleReferenceCountANumber() && 
        	    
        	    this.isStrainZeroAlleleRatioANumber() && 
        	    this.isStrainZeroAlleleAlternativeCountANumber() && 
        	    this.isStrainZeroAlleleReferenceCountANumber() && 
        	    
        	    this.isStrain6AlleleRatioANumber() && 
        	    this.isStrain6AlleleAlternativeCountANumber() && 
        	    this.isStrain6AlleleReferenceCountANumber() && 
        	    
        	    this.isStrainCAlleleRatioANumber() && 
        	    this.isStrainCAlleleAlternativeCountANumber() && 
        	    this.isStrainCAlleleReferenceCountANumber() && 

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

    	SNPChromosomePrimaryKey snpChromosomePrimaryKey = new SNPChromosomePrimaryKey();
    	
 		if ( this.isDTOChromosome1() ){
 			snpChromosomePrimaryKey.setPartitionId(1);
 		}
 		if ( this.isDTOChromosome2() ){
 			snpChromosomePrimaryKey.setPartitionId(2);
 		}
 		if ( this.isDTOChromosome3() ){
 			snpChromosomePrimaryKey.setPartitionId(3);
 		}
 		if ( this.isDTOChromosome4() ){
 			snpChromosomePrimaryKey.setPartitionId(4);
 		}
 		if ( this.isDTOChromosome5() ){
 			snpChromosomePrimaryKey.setPartitionId(5);
 		}
 		if ( this.isDTOChromosome6() ){
 			snpChromosomePrimaryKey.setPartitionId(6);
 		}
 		if ( this.isDTOChromosome7() ){
 			snpChromosomePrimaryKey.setPartitionId(7);
 		}
 		if ( this.isDTOChromosome8() ){
 			snpChromosomePrimaryKey.setPartitionId(8);
 		}
 		if ( this.isDTOChromosome9() ){
 			snpChromosomePrimaryKey.setPartitionId(9);
 		}
 		if ( this.isDTOChromosome10() ){
 			snpChromosomePrimaryKey.setPartitionId(10);
 		}
 		if ( this.isDTOChromosome11() ){
 			snpChromosomePrimaryKey.setPartitionId(11);
 		}
 		if ( this.isDTOChromosome12() ){
 			snpChromosomePrimaryKey.setPartitionId(12);
 		}
 		if ( this.isDTOChromosome13() ){
 			snpChromosomePrimaryKey.setPartitionId(13);
 		}
 		if ( this.isDTOChromosome14() ){
 			snpChromosomePrimaryKey.setPartitionId(14);
 		}
 		if ( this.isDTOChromosome15() ){
 			snpChromosomePrimaryKey.setPartitionId(15);
 		}
 		if ( this.isDTOChromosome16() ){
 			snpChromosomePrimaryKey.setPartitionId(16);
 		}
 		if ( this.isDTOChromosome17() ){
 			snpChromosomePrimaryKey.setPartitionId(17);
 		}
 		if ( this.isDTOChromosome18() ){
 			snpChromosomePrimaryKey.setPartitionId(18);
 		}
 		if ( this.isDTOChromosome19() ){
 			snpChromosomePrimaryKey.setPartitionId(19);
 		}
 		if ( this.isDTOChromosome20() ){
 			snpChromosomePrimaryKey.setPartitionId(20);
 		}
 		if ( this.isDTOChromosome21() ){
 			snpChromosomePrimaryKey.setPartitionId(21);
 		}
 		if ( this.isDTOChromosome22() ){
 			snpChromosomePrimaryKey.setPartitionId(22);
 		}
 		if ( this.isDTOChromosome23() ){
 			snpChromosomePrimaryKey.setPartitionId(23);
 		}
 		if ( this.isDTOChromosome24() ){
 			snpChromosomePrimaryKey.setPartitionId(24);
 		}
 		if ( this.isDTOChromosome25() ){
 			snpChromosomePrimaryKey.setPartitionId(25);
 		}
 		if ( this.isDTOChromosome26() ){
 			snpChromosomePrimaryKey.setPartitionId(26);
 		}
 		if ( this.isDTOChromosome27() ){
 			snpChromosomePrimaryKey.setPartitionId(27);
 		}
 		if ( this.isDTOChromosome28() ){
 			snpChromosomePrimaryKey.setPartitionId(28);
 		}
 		if ( this.isDTOChromosomeLGE22C19W28_E50C23() ){
 			snpChromosomePrimaryKey.setPartitionId(29);
 		}
 		if ( this.isDTOChromosomeLGE64() ){
 			snpChromosomePrimaryKey.setPartitionId(30);
 		}
 		if ( this.isDTOChromosomeW() ){
 			snpChromosomePrimaryKey.setPartitionId(31);
 		}
 		if ( this.isDTOChromosome32() ){
 			snpChromosomePrimaryKey.setPartitionId(32);
 		}
 		if ( this.isDTOChromosomeZ() ){
 			snpChromosomePrimaryKey.setPartitionId(33);
 		}
 		
 		snpChromosomePrimaryKey.setOid(this.getOid());

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
       		    this.getStrain7AlleleRatioAsDouble(),
    		    this.getStrain7AlleleAlternativeCountAsLong(),
    		    this.getStrain7AlleleReferenceCountAsLong(),

       		    this.getStrainPAllele(),
       		    this.getStrainPAlleleFixed(),
       		    this.getStrainPAlleleRatioAsDouble(),
    		    this.getStrainPAlleleAlternativeCountAsLong(),
    		    this.getStrainPAlleleReferenceCountAsLong(),

       		    this.getStrainWAllele(),
       		    this.getStrainWAlleleFixed(),
       		    this.getStrainWAlleleRatioAsDouble(),
    		    this.getStrainWAlleleAlternativeCountAsLong(),
    		    this.getStrainWAlleleReferenceCountAsLong(),

       		    this.getStrainNAllele(),
       		    this.getStrainNAlleleFixed(),
       		    this.getStrainNAlleleRatioAsDouble(),
    		    this.getStrainNAlleleAlternativeCountAsLong(),
    		    this.getStrainNAlleleReferenceCountAsLong(),

       		    this.getStrain15IAllele(),
       		    this.getStrain15IAlleleFixed(),
       		    this.getStrain15IAlleleRatioAsDouble(),
    		    this.getStrain15IAlleleAlternativeCountAsLong(),
    		    this.getStrain15IAlleleReferenceCountAsLong(),

       		    this.getStrainZeroAllele(),
       		    this.getStrainZeroAlleleFixed(),
       		    this.getStrainZeroAlleleRatioAsDouble(),
    		    this.getStrainZeroAlleleAlternativeCountAsLong(),
    		    this.getStrainZeroAlleleReferenceCountAsLong(),

       		    this.getStrain6Allele(),
       		    this.getStrain6AlleleFixed(),
       		    this.getStrain6AlleleRatioAsDouble(),
    		    this.getStrain6AlleleAlternativeCountAsLong(),
    		    this.getStrain6AlleleReferenceCountAsLong(),

       		    this.getStrainCAllele(),
       		    this.getStrainCAlleleFixed(),
       		    this.getStrainCAlleleRatioAsDouble(),
    		    this.getStrainCAlleleAlternativeCountAsLong(),
    		    this.getStrainCAlleleReferenceCountAsLong(),

                this.getAminoAcidSubs(),
                this.getPredictionCategory(),
                this.getScoreSiftAsDouble(),
                this.getScoreConservationAsDouble(),
                this.getProteinAlignNumberAsLong(),
                this.getTotalAlignSequenceNumberAsLong(),
                this.getScoreProveanAsDouble()
        		).build();
        
    	snpchromosome.setSnpChromosomePrimaryKey( snpChromosomePrimaryKey );
    	
        return snpchromosome;
    }

    
    public String toString() {
        return ToStringBuilder.reflectionToString(this, new CustomDateToStringStyle());
    }
}
