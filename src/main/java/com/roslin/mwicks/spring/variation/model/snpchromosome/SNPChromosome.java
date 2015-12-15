package com.roslin.mwicks.spring.variation.model.snpchromosome;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.*;

import java.util.Date;

import com.roslin.mwicks.utility.ObjectConverter;

/**
 * An entity class which contains the information of a single SNPChromosome Table Row.
 * @author Mike Wicks
 * @Entity
 * @Transactional
 */

public class SNPChromosome {
    
    // Constants ----------------------------------------------------------------------------------
	protected static final String NUM_TRUE = "1";
	protected static final String NUM_FALSE = "0";
	
	protected static final String STRING_NA = "N/A";
	protected static final String STRING_FIXED = "Fixed";
	protected static final String STRING_NOT_FIXED = "Not Fixed";
	protected static final String STRING_REFERENCE = "Reference";

	protected static final String ONLY_NONE = "NONE";
	protected static final String ONLY_1 = "1";
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
	@Id
    private Long oid;

	private String snpId;
    private String chromosomeId;
    private int position;
    private String reference;    
    private String alternative;
    private String region;
    private String ensemblGene;
    private String ensemblTranscript;
    private String ensemblAnnotation;
    private String strain7Allele;
    private String strain7AlleleFixed;
    private String strainPAllele;
    private String strainPAlleleFixed;
    private String strainWAllele;
    private String strainWAlleleFixed;
    private String strainNAllele;
    private String strainNAlleleFixed;
    private String strain15IAllele;
    private String strain15IAlleleFixed;
    private String strainZeroAllele;
    private String strainZeroAlleleFixed;
    private String strain6Allele;
    private String strain6AlleleFixed;
    private String strainCAllele;
    private String strainCAlleleFixed;
    private String aminoAcidSubs;
    private String predictionCategory;
    private double scoreSift;
    private double scoreConservation;
    private long proteinAlignNumber;
    private long totalAlignSequenceNumber;
    private double scoreProvean;
    private Date creationTime;
    private Date modificationTime;
    private long version;
    

    // Getters ------------------------------------------------------------------------------------
    public long getOid() {
    	return this.oid;
    }
    public String getSnpId() {
    	return this.snpId;
    }
    public String getChromosomeId() {
    	return this.chromosomeId;
    }
    public int getPosition() {
    	return this.position;
    }
    public String getReference() {
    	return this.reference;    
    }
    public String getAlternative() {
    	return this.alternative;
    }
    public String getRegion() {
    	return this.region;
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
    public String getRegionMultiLines() {
    	String noCommas = this.region.replaceAll(",", ",\n");
    	return noCommas.replaceAll(";", ";\n");
    }
    public String getEnsemblGeneMultiLines() {
    	String noCommas = this.ensemblGene.replaceAll(",", ",\n");
    	return noCommas.replaceAll(";", ";\n");
    }
    public String getEnsemblTranscriptMultiLines() {
    	String noCommas = this.ensemblTranscript.replaceAll(",", ",\n");
    	return noCommas.replaceAll(";", ";\n");
    }
    public String getEnsemblAnnotationMultiLines() {
    	String noCommas = this.ensemblAnnotation.replaceAll(",", ",\n");
    	String noColons = noCommas.replaceAll(";", ";\n");
    	return noColons.replaceAll(":", ":\n");
    }
    public String getStrain7Allele() {
    	return this.strain7Allele;
    }
    public String getStrain7AlleleFixed() {
    	return this.strain7AlleleFixed;
    }
    public boolean isStrain7AlleleFixed() {
    	if ( this.strain7AlleleFixed.equals(STRING_FIXED)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain7AlleleNotFixed() {
    	if ( this.strain7AlleleFixed.equals(STRING_NOT_FIXED) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain7AlleleReference() {
    	if ( this.strain7AlleleFixed.equals(STRING_REFERENCE) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain7AlleleNotApplicable() {
    	if ( this.strain7AlleleFixed.equals(STRING_NA) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public String getStrainPAllele() {
    	return this.strainPAllele;
    }
    public String getStrainPAlleleFixed() {
    	return this.strainPAlleleFixed;
    }
    public boolean isStrainPAlleleFixed() {
    	if ( this.strainPAlleleFixed.equals(STRING_FIXED)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainPAlleleNotFixed() {
    	if ( this.strainPAlleleFixed.equals(STRING_NOT_FIXED) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainPAlleleReference() {
    	if ( this.strainPAlleleFixed.equals(STRING_REFERENCE) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainPAlleleNotApplicable() {
    	if ( this.strainPAlleleFixed.equals(STRING_NA) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public String getStrainWAllele() {
    	return this.strainWAllele;
    }
    public String getStrainWAlleleFixed() {
    	return this.strainWAlleleFixed;
    }
    public boolean isStrainWAlleleFixed() {
    	if ( this.strainWAlleleFixed.equals(STRING_FIXED)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainWAlleleNotFixed() {
    	if ( this.strainWAlleleFixed.equals(STRING_NOT_FIXED) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainWAlleleReference() {
    	if ( this.strainWAlleleFixed.equals(STRING_REFERENCE) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainWAlleleNotApplicable() {
    	if ( this.strainWAlleleFixed.equals(STRING_NA) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public String getStrainNAllele() {
    	return this.strainNAllele;
    }
    public String getStrainNAlleleFixed() {
    	return this.strainNAlleleFixed;
    }
    public boolean isStrainNAlleleFixed() {
    	if ( this.strainNAlleleFixed.equals(STRING_FIXED)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainNAlleleNotFixed() {
    	if ( this.strainNAlleleFixed.equals(STRING_NOT_FIXED) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainNAlleleReference() {
    	if ( this.strainNAlleleFixed.equals(STRING_REFERENCE) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainNAlleleNotApplicable() {
    	if ( this.strainNAlleleFixed.equals(STRING_NA) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public String getStrain15IAllele() {
    	return this.strain15IAllele;
    }
    public String getStrain15IAlleleFixed() {
    	return this.strain15IAlleleFixed;
    }
    public boolean isStrain15IAlleleFixed() {
    	if ( this.strain15IAlleleFixed.equals(STRING_FIXED)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain15IAlleleNotFixed() {
    	if ( this.strain15IAlleleFixed.equals(STRING_NOT_FIXED) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain15IAlleleReference() {
    	if ( this.strain15IAlleleFixed.equals(STRING_REFERENCE) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain15IAlleleNotApplicable() {
    	if ( this.strain15IAlleleFixed.equals(STRING_NA) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public String getStrainZeroAllele() {
    	return this.strainZeroAllele;
    }
    public String getStrainZeroAlleleFixed() {  
    	return this.strainZeroAlleleFixed;
    }
    public boolean isStrainZeroAlleleFixed() {
    	if ( this.strainZeroAlleleFixed.equals(STRING_FIXED)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainZeroAlleleNotFixed() {
    	if ( this.strainZeroAlleleFixed.equals(STRING_NOT_FIXED) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainZeroAlleleReference() {
    	if ( this.strainZeroAlleleFixed.equals(STRING_REFERENCE) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainZeroAlleleNotApplicable() {
    	if ( this.strainZeroAlleleFixed.equals(STRING_NA) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public String getStrain6Allele() {
    	return this.strain6Allele;
    }
    public String getStrain6AlleleFixed() {
    	return this.strain6AlleleFixed;
    }
    public boolean isStrain6AlleleFixed() {
    	if ( this.strain6AlleleFixed.equals(STRING_FIXED)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain6AlleleNotFixed() {
    	if ( this.strain6AlleleFixed.equals(STRING_NOT_FIXED) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain6AlleleReference() {
    	if ( this.strain6AlleleFixed.equals(STRING_REFERENCE) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain6AlleleNotApplicable() {
    	if ( this.strain6AlleleFixed.equals(STRING_NA) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public String getStrainCAllele() {
    	return this.strainCAllele;
    }
    public String getStrainCAlleleFixed() {
    	return this.strainCAlleleFixed;
    }
    public boolean isStrainCAlleleFixed() {
    	if ( this.strainCAlleleFixed.equals(STRING_FIXED)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainCAlleleNotFixed() {
    	if ( this.strainCAlleleFixed.equals(STRING_NOT_FIXED) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainCAlleleReference() {
    	if ( this.strainCAlleleFixed.equals(STRING_REFERENCE) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainCAlleleNotApplicable() {
    	if ( this.strainCAlleleFixed.equals(STRING_NA) ) { 
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public String getAminoAcidSubs() {
    	return this.aminoAcidSubs;
    }
    public String getPredictionCategory() {
    	return this.predictionCategory;
    }
    public double getScoreSift() {
    	return this.scoreSift;
    }
    public double getScoreConservation() {
    	return this.scoreConservation;
    }
    public long getProteinAlignNumber() {
    	return this.proteinAlignNumber;
    }
    public long getTotalAlignSequenceNumber() {
    	return this.totalAlignSequenceNumber;
    }
    public double getScoreProvean() {
    	return this.scoreProvean;
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

    
    // Getters As Strings -------------------------------------------------------------------------
    public String getOidAsString() {
    	return ObjectConverter.convert(this.oid, String.class);
    }
    public String getPositionAsString() {
    	return ObjectConverter.convert(this.position, String.class);
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

    // Getters As Strings Enclosed in Quotes ------------------------------------------------------
    public String getOidAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.oid, String.class) + '\"';
    }
    public String getPositionAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.position, String.class) + '\"';
    }
    public String getStrain7AlleleFixedQuoted() {
    	return '\"' + this.strain7AlleleFixed + '\"';
    }
    public String getStrainPAlleleFixedQuoted() {
    	return '\"' + this.strainPAlleleFixed + '\"';
    }
    public String getStrainWAlleleFixedQuoted() {
    	return '\"' + this.strainWAlleleFixed + '\"';
    }
    public String getStrainNAlleleFixedQuoted() {
    	return '\"' + this.strainNAlleleFixed + '\"';
    }
    public String getStrain15IAlleleFixedQuoted() {
    	return '\"' + this.strain15IAlleleFixed + '\"';
    }
    public String getStrainZeroAlleleFixedQuoted() {  
    	return '\"' + this.strainZeroAlleleFixed + '\"';
    }
    public String getStrain6AlleleFixedQuoted() {
    	return '\"' + this.strain6AlleleFixed + '\"';
    }
    public String getStrainCAlleleFixedQuoted() {
    	return '\"' + this.strainCAlleleFixed + '\"';
    }
    public String getCreationTimeAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.creationTime, String.class) + '\"';
    }
    public String getModificationTimeAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.modificationTime, String.class) + '\"';
    }
    public String getVersionAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.version, String.class) + '\"';
    }
    public String getSnpIdQuoted() {
    	return '\"' + this.snpId + '\"';
    }
    public String getChromosomeIdQuoted() {
    	return '\"' + this.chromosomeId + '\"';
    }
    public String getReferenceQuoted() {
    	return '\"' + this.reference + '\"';    
    }
    public String getAlternativeQuoted() {
    	return '\"' + this.alternative + '\"';
    }
    public String getRegionQuoted() {
    	return '\"' + this.region + '\"';
    }
    public String getEnsemblGeneQuoted() {
    	return '\"' + this.ensemblGene + '\"';
    }
    public String getEnsemblTranscriptQuoted() {
    	return '\"' + this.ensemblTranscript + '\"';
    }
    public String getEnsemblAnnotationQuoted() {
    	return '\"' + this.ensemblAnnotation + '\"';
    }
    public String getStrain7AlleleQuoted() {
    	return '\"' + this.strain7Allele + '\"';
    }
    public String getStrainPAlleleQuoted() {
    	return '\"' + this.strainPAllele + '\"';
    }
    public String getStrainWAlleleQuoted() {
    	return '\"' + this.strainWAllele + '\"';
    }
    public String getStrainNAlleleQuoted() {
    	return '\"' + this.strainNAllele + '\"';
    }
    public String getStrain15IAlleleQuoted() {
    	return '\"' + this.strain15IAllele + '\"';
    }
    public String getStrainZeroAlleleQuoted() {
    	return '\"' + this.strainZeroAllele + '\"';
    }
    public String getStrain6AlleleQuoted() {
    	return '\"' + this.strain6Allele + '\"';
    }
    public String getStrainCAlleleQuoted() {
    	return '\"' + this.strainCAllele + '\"';
    }

    // Setters ------------------------------------------------------------------------------------
    public void setOid(long oid) {
    	this.oid = oid;
    }
    public void setSnpId(String snpId) {
    	this.snpId = snpId;
    }
    public void setChromosomeId(String chromosomeId) {
    	this.chromosomeId = chromosomeId;
    }
    public void setPosition(int position) {
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
    public void setstrainZeroAllele(String strainZeroAllele) {
    	this.strainZeroAllele = strainZeroAllele;
    }
    public void setstrainZeroAlleleFixed(String strainZeroAlleleFixed) {  
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
    public void setScoreSift(double scoreSift) {
    	this.scoreSift = scoreSift;
    }
    public void setScoreConservation(double scoreConservation) {
    	this.scoreConservation = scoreConservation;
    }
    public void setProteinAlignNumber(long proteinAlignNumber) {
    	this.proteinAlignNumber = proteinAlignNumber;
    }
    public void setTotalAlignSequenceNumber(long totalAlignSequenceNumber) {
    	this.totalAlignSequenceNumber = totalAlignSequenceNumber;
    }
    public void setScoreProvean(double scoreProvean) {
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

    
    // Helpers ------------------------------------------------------------------------------------    
    public boolean isSearchChromosomeNone() {
    	if ( this.chromosomeId.equals(ONLY_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome1() {
    	if ( this.chromosomeId.equals(ONLY_1)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome3() {
    	if ( this.chromosomeId.equals(ONLY_3)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome4() {
    	if ( this.chromosomeId.equals(ONLY_4)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome5() {
    	if ( this.chromosomeId.equals(ONLY_5)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome6() {
    	if ( this.chromosomeId.equals(ONLY_6)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome7() {
    	if ( this.chromosomeId.equals(ONLY_7)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome8() {
    	if ( this.chromosomeId.equals(ONLY_8)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome9() {
    	if ( this.chromosomeId.equals(ONLY_9)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome10() {
    	if ( this.chromosomeId.equals(ONLY_10)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome11() {
    	if ( this.chromosomeId.equals(ONLY_11)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome12() {
    	if ( this.chromosomeId.equals(ONLY_12)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome13() {
    	if ( this.chromosomeId.equals(ONLY_13)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome14() {
    	if ( this.chromosomeId.equals(ONLY_14)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome15() {
    	if ( this.chromosomeId.equals(ONLY_15)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome16() {
    	if ( this.chromosomeId.equals(ONLY_16)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome17() {
    	if ( this.chromosomeId.equals(ONLY_17)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome18() {
    	if ( this.chromosomeId.equals(ONLY_18)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome19() {
    	if ( this.chromosomeId.equals(ONLY_19)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome20() {
    	if ( this.chromosomeId.equals(ONLY_20)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome21() {
    	if ( this.chromosomeId.equals(ONLY_21)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome22() {
    	if ( this.chromosomeId.equals(ONLY_22)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome23() {
    	if ( this.chromosomeId.equals(ONLY_23)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome24() {
    	if ( this.chromosomeId.equals(ONLY_24)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome25() {
    	if ( this.chromosomeId.equals(ONLY_25)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome26() {
    	if ( this.chromosomeId.equals(ONLY_26)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome27() {
    	if ( this.chromosomeId.equals(ONLY_27)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome28() {
    	if ( this.chromosomeId.equals(ONLY_28)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosome32() {
    	if ( this.chromosomeId.equals(ONLY_32)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosomeLGE22C19W28_E50C23() {
    	if ( this.chromosomeId.equals(ONLY_LGE22C19W28_E50C23)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosomeLGE64() {
    	if ( this.chromosomeId.equals(ONLY_LGE64)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosomeW() {
    	if ( this.chromosomeId.equals(ONLY_W)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchChromosomeZ() {
    	if ( this.chromosomeId.equals(ONLY_Z)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    /*
     * Is this Component the same as the Supplied Component?
     */
    public boolean isSameAs(SNPChromosome snpchromosome){

        if (this.getOid() == snpchromosome.getOid() && 
        		this.getSnpId().equals(snpchromosome.getSnpId()) && 
        		this.getChromosomeId().equals(snpchromosome.getChromosomeId()) && 
        		this.getPosition() == snpchromosome.getPosition() &&
        	    this.getReference().equals(snpchromosome.getReference()) && 
        	    this.getAlternative().equals(snpchromosome.getAlternative()) && 
        	    this.getRegion().equals(snpchromosome.getRegion()) && 
        	    this.getEnsemblGene().equals(snpchromosome.getEnsemblGene()) && 
        	    this.getEnsemblTranscript().equals(snpchromosome.getEnsemblTranscript()) && 
        	    this.getEnsemblAnnotation().equals(snpchromosome.getEnsemblAnnotation()) && 
        	    this.getStrain7Allele().equals(snpchromosome.getStrain7Allele()) && 
        	    this.getStrain7AlleleFixed() == snpchromosome.getStrain7AlleleFixed() && 
        	    this.getStrainPAllele().equals(snpchromosome.getStrainPAllele()) && 
        	    this.getStrainPAlleleFixed() == snpchromosome.getStrainPAlleleFixed() && 
        	    this.getStrainWAllele().equals(snpchromosome.getStrainWAllele()) && 
        	    this.getStrainWAlleleFixed() == snpchromosome.getStrainWAlleleFixed() && 
        	    this.getStrainNAllele().equals(snpchromosome.getStrainNAllele()) && 
        	    this.getStrainNAlleleFixed() == snpchromosome.getStrainNAlleleFixed() && 
        	    this.getStrain15IAllele().equals(snpchromosome.getStrain15IAllele()) && 
        	    this.getStrain15IAlleleFixed() == snpchromosome.getStrain15IAlleleFixed()  && 
        	    this.getStrainZeroAllele().equals(snpchromosome.getStrainZeroAllele()) && 
        	    this.getStrainZeroAlleleFixed() == snpchromosome.getStrainZeroAlleleFixed() &&  
        	    this.getStrain6Allele().equals(snpchromosome.getStrain6Allele()) && 
        	    this.getStrain6AlleleFixed() == snpchromosome.getStrain6AlleleFixed() && 
        	    this.getStrainCAllele().equals(snpchromosome.getStrainCAllele()) && 
        	    this.getStrainCAlleleFixed() == snpchromosome.getStrainCAlleleFixed() && 
        	    this.getAminoAcidSubs().equals(snpchromosome.getAminoAcidSubs()) && 
        	    this.getPredictionCategory().equals(snpchromosome.getPredictionCategory()) && 
        	    this.getScoreSift() == snpchromosome.getScoreSift() &&  
        	    this.getScoreConservation() == snpchromosome.getScoreConservation() && 
        	    this.getProteinAlignNumber() == snpchromosome.getProteinAlignNumber() && 
        	    this.getTotalAlignSequenceNumber() == snpchromosome.getTotalAlignSequenceNumber() && 
        	    this.getScoreProvean() == snpchromosome.getScoreProvean()

        	    ) {

        	return true;
        }
        else {

        	return false;
        }
    }

    /*
     * The OID is unique for each Component.
     *  So this should compare Component by OID only.
     */
    public boolean equals(Object other) {
    	
        return (other instanceof SNPChromosome) && (oid != null) 
        		? oid.equals(((SNPChromosome) other).oid) 
        		: (other == this);
    }
    

    public void update(
    		String snpId,
    		String chromosomeId,
    		int position,
    		String reference,    
    		String alternative,
    		String region,
    		String ensemblGene,
    		String ensemblTranscript,
    		String ensemblAnnotation,
    		String strain7Allele,
    		String strain7AlleleFixed,
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed,
        	String aminoAcidSubs,
        	String predictionCategory,
        	double scoreSift,
        	double scoreConservation,
        	long proteinAlignNumber,
        	long totalAlignSequenceNumber,
        	double scoreProvean
    		) {

    	this.snpId = snpId;
    	this.chromosomeId = chromosomeId;
    	this.position = position;
    	this.reference = reference;    
    	this.alternative = alternative;
    	this.region = region;
    	this.ensemblGene = ensemblGene;
    	this.ensemblTranscript = ensemblTranscript;
    	this.ensemblAnnotation = ensemblAnnotation;
    	this.strain7Allele = strain7Allele;
    	this.strain7AlleleFixed = strain7AlleleFixed;
    	this.strainPAllele = strainPAllele;
    	this.strainPAlleleFixed = strainPAlleleFixed;
    	this.strainWAllele = strainWAllele;
    	this.strainWAlleleFixed = strainWAlleleFixed;
    	this.strainNAllele = strainNAllele;
    	this.strainNAlleleFixed = strainNAlleleFixed;
    	this.strain15IAllele = strain15IAllele;
    	this.strain15IAlleleFixed = strain15IAlleleFixed;
    	this.strainZeroAllele = strainZeroAllele;
    	this.strainZeroAlleleFixed = strainZeroAlleleFixed;
    	this.strain6Allele = strain6Allele;
    	this.strain6AlleleFixed = strain6AlleleFixed;
    	this.strainCAllele = strainCAllele;
    	this.strainCAlleleFixed = strainCAlleleFixed;
    	this.aminoAcidSubs = aminoAcidSubs;
    	this.predictionCategory = predictionCategory;
    	this.scoreSift = scoreSift;
    	this.scoreConservation = scoreConservation;
    	this.proteinAlignNumber = proteinAlignNumber;
    	this.totalAlignSequenceNumber = totalAlignSequenceNumber;
    	this.scoreProvean = scoreProvean;
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
    	
        return ToStringBuilder.reflectionToString(this);
    }

    // SNPChromosome Builder ---------------------------------------------------------------------
    /**
     * Gets a builder which is used to create SNPChromosome objects.
     * 
     * @param snpId The SNP ID
     * @param chromosomeId The Chromosome ID
     * @param position The SNP Position or coordinate
     * @param reference The Reference or Expected Nucleobase
     * @param alternative The Alternative Nucleobase as found
     * @param region The Region
     * @param ensemblGene The Ensembl Gene Name
     * @param ensemblTranscript The Ensembl Transcript
     * @param ensemblAnnotation Coding predictions based on Ensembl gene models
     * @param strain7Allele For Strain 7 the Alternative Allele
     * @param strain7AlleleFixed For Strain 7 is this fixed or not
     * @param strainPAllele For Strain P the Alternative Allele
     * @param strainPAlleleFixed For Strain P is this fixed or not
     * @param strainWAllele For Strain W the Alternative Allele
     * @param strainWAlleleFixed For Strain W is this fixed or not
     * @param strainNAllele For Strain N the Alternative Allele
     * @param strainNAlleleFixed For Strain N is this fixed or not
     * @param strain15IAllele For Strain 15I the Alternative Allele
     * @param strain15IAlleleFixed For Strain 15I is this fixed or not
     * @param strainZeroAllele For Strain STRING_FALSE the Alternative Allele
     * @param strainZeroAlleleFixed For Strain STRING_FALSE is this fixed or not
     * @param strain6Allele For Strain 6 the Alternative Allele
     * @param strain6AlleleFixed For Strain 6 is this fixed or not
     * @param strainCAllele For Strain C the Alternative Allele
     * @param strainCAlleleFixed For Strain C is this fixed or not
     * 
     * @return this. A new Builder instance.
     */
    public static Builder getBuilder(
    		String snpId,
    		String chromosomeId,
    		int position,
    		String reference,    
    		String alternative,
    		String region,
    		String ensemblGene,
    		String ensemblTranscript,
    		String ensemblAnnotation,
    		String strain7Allele,
    		String strain7AlleleFixed,
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed,
        	String aminoAcidSubs,
        	String predictionCategory,
        	double scoreSift,
        	double scoreConservation,
        	long proteinAlignNumber,
        	long totalAlignSequenceNumber,
        	double scoreProvean
    		) {
    	
        return new Builder(
        		snpId,
        		chromosomeId,
        		position,
        		reference,    
        		alternative,
        		region,
        		ensemblGene,
        		ensemblTranscript,
        		ensemblAnnotation,
        		strain7Allele,
        		strain7AlleleFixed,
        		strainPAllele,
        		strainPAlleleFixed,
        		strainWAllele,
        		strainWAlleleFixed,
        		strainNAllele,
        		strainNAlleleFixed,
        		strain15IAllele,
        		strain15IAlleleFixed,
        		strainZeroAllele,
        		strainZeroAlleleFixed,
        		strain6Allele,
        		strain6AlleleFixed,
        		strainCAllele,
        		strainCAlleleFixed,
        		aminoAcidSubs,
        		predictionCategory,
        		scoreSift,
        		scoreConservation,
        		proteinAlignNumber,
        		totalAlignSequenceNumber,
        		scoreProvean
        		);
    }
    
    /**
     * A Builder class used to create new SNPChromosome objects.
     */
    public static class Builder {
    	
        SNPChromosome built;

        /**
         * Creates a new Builder instance.
         * @param snpId The SNP ID
         * @param chromosomeId The Chromosome ID
         * @param position The SNP Position or coordinate
         * @param reference The Reference or Expected Nucleobase
         * @param alternative The Alternative Nucleobase as found
         * @param region The Region
         * @param ensemblGene The Ensembl Gene Name
         * @param ensemblTranscript The Ensembl Transcript
         * @param ensemblAnnotation Coding predictions based on Ensembl gene models
         * @param strain7Allele For Strain 7 the Alternative Allele
         * @param strain7AlleleFixed For Strain 7 is this fixed or not
         * @param strainPAllele For Strain P the Alternative Allele
         * @param strainPAlleleFixed For Strain P is this fixed or not
         * @param strainWAllele For Strain W the Alternative Allele
         * @param strainWAlleleFixed For Strain W is this fixed or not
         * @param strainNAllele For Strain N the Alternative Allele
         * @param strainNAlleleFixed For Strain N is this fixed or not
         * @param strain15IAllele For Strain 15I the Alternative Allele
         * @param strain15IAlleleFixed For Strain 15I is this fixed or not
         * @param strainZeroAllele For Strain STRING_FALSE the Alternative Allele
         * @param strainZeroAlleleFixed For Strain STRING_FALSE is this fixed or not
         * @param strain6Allele For Strain 6 the Alternative Allele
         * @param strain6AlleleFixed For Strain 6 is this fixed or not
         * @param strainCAllele For Strain C the Alternative Allele
         * @param strainCAlleleFixed For Strain C is this fixed or not
         */
        Builder(
        		String snpId,
        		String chromosomeId,
        		int position,
        		String reference,    
        		String alternative,
        		String region,
        		String ensemblGene,
        		String ensemblTranscript,
        		String ensemblAnnotation,
        		String strain7Allele,
        		String strain7AlleleFixed,
        		String strainPAllele,
        		String strainPAlleleFixed,
        		String strainWAllele,
        		String strainWAlleleFixed,
        		String strainNAllele,
        		String strainNAlleleFixed,
        		String strain15IAllele,
        		String strain15IAlleleFixed,
        		String strainZeroAllele,
        		String strainZeroAlleleFixed,
        		String strain6Allele,
        		String strain6AlleleFixed,
        		String strainCAllele,
        		String strainCAlleleFixed,
            	String aminoAcidSubs,
            	String predictionCategory,
            	double scoreSift,
            	double scoreConservation,
            	long proteinAlignNumber,
            	long totalAlignSequenceNumber,
            	double scoreProvean
        		) {
        	
            built = new SNPChromosome();
            
        	built.snpId = snpId;
        	built.chromosomeId = chromosomeId;
        	built.position = position;
        	built.reference = reference;    
        	built.region = region;
        	built.alternative = alternative;
        	built.ensemblGene = ensemblGene;
        	built.ensemblTranscript = ensemblTranscript;
        	built.ensemblAnnotation = ensemblAnnotation;
        	built.strain7Allele = strain7Allele;
        	built.strain7AlleleFixed = strain7AlleleFixed;
        	built.strainPAllele = strainPAllele;
        	built.strainPAlleleFixed = strainPAlleleFixed;
        	built.strainWAllele = strainWAllele;
        	built.strainWAlleleFixed = strainWAlleleFixed;
        	built.strainNAllele = strainNAllele;
        	built.strainNAlleleFixed = strainNAlleleFixed;
        	built.strain15IAllele = strain15IAllele;
        	built.strain15IAlleleFixed = strain15IAlleleFixed;
        	built.strainZeroAllele = strainZeroAllele;
        	built.strainZeroAlleleFixed = strainZeroAlleleFixed;
        	built.strain6Allele = strain6Allele;
        	built.strain6AlleleFixed = strain6AlleleFixed;
        	built.strainCAllele = strainCAllele;
        	built.strainCAlleleFixed = strainCAlleleFixed;
        	built.aminoAcidSubs = aminoAcidSubs;
        	built.predictionCategory = predictionCategory;
        	built.scoreSift = scoreSift;
        	built.scoreConservation = scoreConservation;
        	built.proteinAlignNumber = proteinAlignNumber;
        	built.totalAlignSequenceNumber = totalAlignSequenceNumber;
        	built.scoreProvean = scoreProvean;
        }

        /**
         * Builds the new SNPChromosome object.
         * 
         * @return this. The created SNPChromosome object.
         */
        public SNPChromosome build() {
        	
            return built;
        }
    }

    public SNPChromosomeZ convertToZ() {
    	
    	SNPChromosomeZ snpchromosomeZ = new SNPChromosomeZ();
    	
        snpchromosomeZ.setSnpId(this.getSnpId());
        snpchromosomeZ.setChromosomeId(this.getChromosomeId());
        snpchromosomeZ.setPosition(this.getPosition());
        snpchromosomeZ.setReference(this.getReference());
        snpchromosomeZ.setAlternative(this.getAlternative());
        snpchromosomeZ.setRegion(this.getRegion());
        snpchromosomeZ.setEnsemblGene(this.getEnsemblGene());
        snpchromosomeZ.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosomeZ.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosomeZ.setStrain7Allele(this.getStrain7Allele());
        snpchromosomeZ.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosomeZ.setStrainPAllele(this.getStrainPAllele());
        snpchromosomeZ.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosomeZ.setStrainWAllele(this.getStrainWAllele());
        snpchromosomeZ.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosomeZ.setStrainNAllele(this.getStrainNAllele());
        snpchromosomeZ.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosomeZ.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosomeZ.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosomeZ.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosomeZ.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosomeZ.setStrain6Allele(this.getStrain6Allele());
        snpchromosomeZ.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosomeZ.setStrainCAllele(this.getStrainCAllele());
        snpchromosomeZ.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosomeZ.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosomeZ.setPredictionCategory(this.getPredictionCategory());
        snpchromosomeZ.setScoreSift(this.getScoreSift());
        snpchromosomeZ.setScoreConservation(this.getScoreConservation());
        snpchromosomeZ.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosomeZ.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosomeZ.setScoreProvean(this.getScoreProvean());


    	return snpchromosomeZ;
    }
    
    public SNPChromosomeW convertToW() {
    	
    	SNPChromosomeW snpchromosomeW = new SNPChromosomeW();
    	
        snpchromosomeW.setSnpId(this.getSnpId());
        snpchromosomeW.setChromosomeId(this.getChromosomeId());
        snpchromosomeW.setPosition(this.getPosition());
        snpchromosomeW.setReference(this.getReference());
        snpchromosomeW.setAlternative(this.getAlternative());
        snpchromosomeW.setRegion(this.getRegion());
        snpchromosomeW.setEnsemblGene(this.getEnsemblGene());
        snpchromosomeW.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosomeW.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosomeW.setStrain7Allele(this.getStrain7Allele());
        snpchromosomeW.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosomeW.setStrainPAllele(this.getStrainPAllele());
        snpchromosomeW.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosomeW.setStrainWAllele(this.getStrainWAllele());
        snpchromosomeW.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosomeW.setStrainNAllele(this.getStrainNAllele());
        snpchromosomeW.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosomeW.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosomeW.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosomeW.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosomeW.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosomeW.setStrain6Allele(this.getStrain6Allele());
        snpchromosomeW.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosomeW.setStrainCAllele(this.getStrainCAllele());
        snpchromosomeW.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosomeW.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosomeW.setPredictionCategory(this.getPredictionCategory());
        snpchromosomeW.setScoreSift(this.getScoreSift());
        snpchromosomeW.setScoreConservation(this.getScoreConservation());
        snpchromosomeW.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosomeW.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosomeW.setScoreProvean(this.getScoreProvean());

    	return snpchromosomeW;
    }

    public SNPChromosomeLGE64 convertToLGE64() {
    	
    	SNPChromosomeLGE64 snpchromosomeLGE64 = new SNPChromosomeLGE64();
    	
        snpchromosomeLGE64.setSnpId(this.getSnpId());
        snpchromosomeLGE64.setChromosomeId(this.getChromosomeId());
        snpchromosomeLGE64.setPosition(this.getPosition());
        snpchromosomeLGE64.setReference(this.getReference());
        snpchromosomeLGE64.setAlternative(this.getAlternative());
        snpchromosomeLGE64.setRegion(this.getRegion());
        snpchromosomeLGE64.setEnsemblGene(this.getEnsemblGene());
        snpchromosomeLGE64.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosomeLGE64.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosomeLGE64.setStrain7Allele(this.getStrain7Allele());
        snpchromosomeLGE64.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosomeLGE64.setStrainPAllele(this.getStrainPAllele());
        snpchromosomeLGE64.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosomeLGE64.setStrainWAllele(this.getStrainWAllele());
        snpchromosomeLGE64.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosomeLGE64.setStrainNAllele(this.getStrainNAllele());
        snpchromosomeLGE64.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosomeLGE64.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosomeLGE64.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosomeLGE64.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosomeLGE64.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosomeLGE64.setStrain6Allele(this.getStrain6Allele());
        snpchromosomeLGE64.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosomeLGE64.setStrainCAllele(this.getStrainCAllele());
        snpchromosomeLGE64.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosomeLGE64.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosomeLGE64.setPredictionCategory(this.getPredictionCategory());
        snpchromosomeLGE64.setScoreSift(this.getScoreSift());
        snpchromosomeLGE64.setScoreConservation(this.getScoreConservation());
        snpchromosomeLGE64.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosomeLGE64.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosomeLGE64.setScoreProvean(this.getScoreProvean());

    	return snpchromosomeLGE64;
    }

    public SNPChromosomeLGE22C19W28_E50C23 convertToLGE22C19W28_E50C23() {
    	
    	SNPChromosomeLGE22C19W28_E50C23 snpchromosomeLGE22C19W28_E50C23 = new SNPChromosomeLGE22C19W28_E50C23();
    	
        snpchromosomeLGE22C19W28_E50C23.setSnpId(this.getSnpId());
        snpchromosomeLGE22C19W28_E50C23.setChromosomeId(this.getChromosomeId());
        snpchromosomeLGE22C19W28_E50C23.setPosition(this.getPosition());
        snpchromosomeLGE22C19W28_E50C23.setReference(this.getReference());
        snpchromosomeLGE22C19W28_E50C23.setAlternative(this.getAlternative());
        snpchromosomeLGE22C19W28_E50C23.setRegion(this.getRegion());
        snpchromosomeLGE22C19W28_E50C23.setEnsemblGene(this.getEnsemblGene());
        snpchromosomeLGE22C19W28_E50C23.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosomeLGE22C19W28_E50C23.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosomeLGE22C19W28_E50C23.setStrain7Allele(this.getStrain7Allele());
        snpchromosomeLGE22C19W28_E50C23.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosomeLGE22C19W28_E50C23.setStrainPAllele(this.getStrainPAllele());
        snpchromosomeLGE22C19W28_E50C23.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosomeLGE22C19W28_E50C23.setStrainWAllele(this.getStrainWAllele());
        snpchromosomeLGE22C19W28_E50C23.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosomeLGE22C19W28_E50C23.setStrainNAllele(this.getStrainNAllele());
        snpchromosomeLGE22C19W28_E50C23.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosomeLGE22C19W28_E50C23.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosomeLGE22C19W28_E50C23.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosomeLGE22C19W28_E50C23.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosomeLGE22C19W28_E50C23.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosomeLGE22C19W28_E50C23.setStrain6Allele(this.getStrain6Allele());
        snpchromosomeLGE22C19W28_E50C23.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosomeLGE22C19W28_E50C23.setStrainCAllele(this.getStrainCAllele());
        snpchromosomeLGE22C19W28_E50C23.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosomeLGE22C19W28_E50C23.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosomeLGE22C19W28_E50C23.setPredictionCategory(this.getPredictionCategory());
        snpchromosomeLGE22C19W28_E50C23.setScoreSift(this.getScoreSift());
        snpchromosomeLGE22C19W28_E50C23.setScoreConservation(this.getScoreConservation());
        snpchromosomeLGE22C19W28_E50C23.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosomeLGE22C19W28_E50C23.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosomeLGE22C19W28_E50C23.setScoreProvean(this.getScoreProvean());

    	return snpchromosomeLGE22C19W28_E50C23;
    }

    
    public SNPChromosome32 convertTo32() {
    	
    	SNPChromosome32 snpchromosome32 = new SNPChromosome32();
    	
        snpchromosome32.setSnpId(this.getSnpId());
        snpchromosome32.setChromosomeId(this.getChromosomeId());
        snpchromosome32.setPosition(this.getPosition());
        snpchromosome32.setReference(this.getReference());
        snpchromosome32.setAlternative(this.getAlternative());
        snpchromosome32.setRegion(this.getRegion());
        snpchromosome32.setEnsemblGene(this.getEnsemblGene());
        snpchromosome32.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome32.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome32.setStrain7Allele(this.getStrain7Allele());
        snpchromosome32.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome32.setStrainPAllele(this.getStrainPAllele());
        snpchromosome32.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome32.setStrainWAllele(this.getStrainWAllele());
        snpchromosome32.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome32.setStrainNAllele(this.getStrainNAllele());
        snpchromosome32.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome32.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome32.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome32.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome32.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome32.setStrain6Allele(this.getStrain6Allele());
        snpchromosome32.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome32.setStrainCAllele(this.getStrainCAllele());
        snpchromosome32.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome32.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome32.setPredictionCategory(this.getPredictionCategory());
        snpchromosome32.setScoreSift(this.getScoreSift());
        snpchromosome32.setScoreConservation(this.getScoreConservation());
        snpchromosome32.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome32.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome32.setScoreProvean(this.getScoreProvean());

    	return snpchromosome32;
    }

    public SNPChromosome28 convertTo28() {
    	
    	SNPChromosome28 snpchromosome28 = new SNPChromosome28();
    	
        snpchromosome28.setSnpId(this.getSnpId());
        snpchromosome28.setChromosomeId(this.getChromosomeId());
        snpchromosome28.setPosition(this.getPosition());
        snpchromosome28.setReference(this.getReference());
        snpchromosome28.setAlternative(this.getAlternative());
        snpchromosome28.setRegion(this.getRegion());
        snpchromosome28.setEnsemblGene(this.getEnsemblGene());
        snpchromosome28.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome28.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome28.setStrain7Allele(this.getStrain7Allele());
        snpchromosome28.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome28.setStrainPAllele(this.getStrainPAllele());
        snpchromosome28.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome28.setStrainWAllele(this.getStrainWAllele());
        snpchromosome28.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome28.setStrainNAllele(this.getStrainNAllele());
        snpchromosome28.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome28.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome28.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome28.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome28.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome28.setStrain6Allele(this.getStrain6Allele());
        snpchromosome28.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome28.setStrainCAllele(this.getStrainCAllele());
        snpchromosome28.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome28.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome28.setPredictionCategory(this.getPredictionCategory());
        snpchromosome28.setScoreSift(this.getScoreSift());
        snpchromosome28.setScoreConservation(this.getScoreConservation());
        snpchromosome28.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome28.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome28.setScoreProvean(this.getScoreProvean());

    	return snpchromosome28;
    }

    public SNPChromosome27 convertTo27() {
    	
    	SNPChromosome27 snpchromosome27 = new SNPChromosome27();
    	
        snpchromosome27.setSnpId(this.getSnpId());
        snpchromosome27.setChromosomeId(this.getChromosomeId());
        snpchromosome27.setPosition(this.getPosition());
        snpchromosome27.setReference(this.getReference());
        snpchromosome27.setAlternative(this.getAlternative());
        snpchromosome27.setRegion(this.getRegion());
        snpchromosome27.setEnsemblGene(this.getEnsemblGene());
        snpchromosome27.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome27.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome27.setStrain7Allele(this.getStrain7Allele());
        snpchromosome27.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome27.setStrainPAllele(this.getStrainPAllele());
        snpchromosome27.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome27.setStrainWAllele(this.getStrainWAllele());
        snpchromosome27.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome27.setStrainNAllele(this.getStrainNAllele());
        snpchromosome27.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome27.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome27.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome27.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome27.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome27.setStrain6Allele(this.getStrain6Allele());
        snpchromosome27.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome27.setStrainCAllele(this.getStrainCAllele());
        snpchromosome27.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome27.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome27.setPredictionCategory(this.getPredictionCategory());
        snpchromosome27.setScoreSift(this.getScoreSift());
        snpchromosome27.setScoreConservation(this.getScoreConservation());
        snpchromosome27.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome27.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome27.setScoreProvean(this.getScoreProvean());

    	return snpchromosome27;
    }

    public SNPChromosome26 convertTo26() {
    	
    	SNPChromosome26 snpchromosome26 = new SNPChromosome26();
    	
        snpchromosome26.setSnpId(this.getSnpId());
        snpchromosome26.setChromosomeId(this.getChromosomeId());
        snpchromosome26.setPosition(this.getPosition());
        snpchromosome26.setReference(this.getReference());
        snpchromosome26.setAlternative(this.getAlternative());
        snpchromosome26.setRegion(this.getRegion());
        snpchromosome26.setEnsemblGene(this.getEnsemblGene());
        snpchromosome26.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome26.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome26.setStrain7Allele(this.getStrain7Allele());
        snpchromosome26.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome26.setStrainPAllele(this.getStrainPAllele());
        snpchromosome26.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome26.setStrainWAllele(this.getStrainWAllele());
        snpchromosome26.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome26.setStrainNAllele(this.getStrainNAllele());
        snpchromosome26.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome26.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome26.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome26.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome26.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome26.setStrain6Allele(this.getStrain6Allele());
        snpchromosome26.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome26.setStrainCAllele(this.getStrainCAllele());
        snpchromosome26.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome26.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome26.setPredictionCategory(this.getPredictionCategory());
        snpchromosome26.setScoreSift(this.getScoreSift());
        snpchromosome26.setScoreConservation(this.getScoreConservation());
        snpchromosome26.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome26.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome26.setScoreProvean(this.getScoreProvean());

    	return snpchromosome26;
    }

    public SNPChromosome25 convertTo25() {
    	
    	SNPChromosome25 snpchromosome25 = new SNPChromosome25();
    	
        snpchromosome25.setSnpId(this.getSnpId());
        snpchromosome25.setChromosomeId(this.getChromosomeId());
        snpchromosome25.setPosition(this.getPosition());
        snpchromosome25.setReference(this.getReference());
        snpchromosome25.setAlternative(this.getAlternative());
        snpchromosome25.setRegion(this.getRegion());
        snpchromosome25.setEnsemblGene(this.getEnsemblGene());
        snpchromosome25.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome25.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome25.setStrain7Allele(this.getStrain7Allele());
        snpchromosome25.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome25.setStrainPAllele(this.getStrainPAllele());
        snpchromosome25.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome25.setStrainWAllele(this.getStrainWAllele());
        snpchromosome25.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome25.setStrainNAllele(this.getStrainNAllele());
        snpchromosome25.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome25.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome25.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome25.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome25.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome25.setStrain6Allele(this.getStrain6Allele());
        snpchromosome25.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome25.setStrainCAllele(this.getStrainCAllele());
        snpchromosome25.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome25.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome25.setPredictionCategory(this.getPredictionCategory());
        snpchromosome25.setScoreSift(this.getScoreSift());
        snpchromosome25.setScoreConservation(this.getScoreConservation());
        snpchromosome25.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome25.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome25.setScoreProvean(this.getScoreProvean());

    	return snpchromosome25;
    }

    public SNPChromosome24 convertTo24() {
    	
    	SNPChromosome24 snpchromosome24 = new SNPChromosome24();
    	
        snpchromosome24.setSnpId(this.getSnpId());
        snpchromosome24.setChromosomeId(this.getChromosomeId());
        snpchromosome24.setPosition(this.getPosition());
        snpchromosome24.setReference(this.getReference());
        snpchromosome24.setAlternative(this.getAlternative());
        snpchromosome24.setRegion(this.getRegion());
        snpchromosome24.setEnsemblGene(this.getEnsemblGene());
        snpchromosome24.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome24.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome24.setStrain7Allele(this.getStrain7Allele());
        snpchromosome24.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome24.setStrainPAllele(this.getStrainPAllele());
        snpchromosome24.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome24.setStrainWAllele(this.getStrainWAllele());
        snpchromosome24.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome24.setStrainNAllele(this.getStrainNAllele());
        snpchromosome24.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome24.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome24.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome24.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome24.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome24.setStrain6Allele(this.getStrain6Allele());
        snpchromosome24.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome24.setStrainCAllele(this.getStrainCAllele());
        snpchromosome24.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome24.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome24.setPredictionCategory(this.getPredictionCategory());
        snpchromosome24.setScoreSift(this.getScoreSift());
        snpchromosome24.setScoreConservation(this.getScoreConservation());
        snpchromosome24.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome24.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome24.setScoreProvean(this.getScoreProvean());

    	return snpchromosome24;
    }

    public SNPChromosome23 convertTo23() {
    	
    	SNPChromosome23 snpchromosome23 = new SNPChromosome23();
    	
        snpchromosome23.setSnpId(this.getSnpId());
        snpchromosome23.setChromosomeId(this.getChromosomeId());
        snpchromosome23.setPosition(this.getPosition());
        snpchromosome23.setReference(this.getReference());
        snpchromosome23.setAlternative(this.getAlternative());
        snpchromosome23.setRegion(this.getRegion());
        snpchromosome23.setEnsemblGene(this.getEnsemblGene());
        snpchromosome23.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome23.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome23.setStrain7Allele(this.getStrain7Allele());
        snpchromosome23.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome23.setStrainPAllele(this.getStrainPAllele());
        snpchromosome23.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome23.setStrainWAllele(this.getStrainWAllele());
        snpchromosome23.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome23.setStrainNAllele(this.getStrainNAllele());
        snpchromosome23.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome23.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome23.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome23.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome23.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome23.setStrain6Allele(this.getStrain6Allele());
        snpchromosome23.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome23.setStrainCAllele(this.getStrainCAllele());
        snpchromosome23.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome23.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome23.setPredictionCategory(this.getPredictionCategory());
        snpchromosome23.setScoreSift(this.getScoreSift());
        snpchromosome23.setScoreConservation(this.getScoreConservation());
        snpchromosome23.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome23.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome23.setScoreProvean(this.getScoreProvean());

    	return snpchromosome23;
    }
    
    public SNPChromosome22 convertTo22() {
    	
    	SNPChromosome22 snpchromosome22 = new SNPChromosome22();
    	
        snpchromosome22.setSnpId(this.getSnpId());
        snpchromosome22.setChromosomeId(this.getChromosomeId());
        snpchromosome22.setPosition(this.getPosition());
        snpchromosome22.setReference(this.getReference());
        snpchromosome22.setAlternative(this.getAlternative());
        snpchromosome22.setRegion(this.getRegion());
        snpchromosome22.setEnsemblGene(this.getEnsemblGene());
        snpchromosome22.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome22.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome22.setStrain7Allele(this.getStrain7Allele());
        snpchromosome22.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome22.setStrainPAllele(this.getStrainPAllele());
        snpchromosome22.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome22.setStrainWAllele(this.getStrainWAllele());
        snpchromosome22.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome22.setStrainNAllele(this.getStrainNAllele());
        snpchromosome22.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome22.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome22.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome22.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome22.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome22.setStrain6Allele(this.getStrain6Allele());
        snpchromosome22.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome22.setStrainCAllele(this.getStrainCAllele());
        snpchromosome22.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome22.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome22.setPredictionCategory(this.getPredictionCategory());
        snpchromosome22.setScoreSift(this.getScoreSift());
        snpchromosome22.setScoreConservation(this.getScoreConservation());
        snpchromosome22.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome22.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome22.setScoreProvean(this.getScoreProvean());

    	return snpchromosome22;
    }

    public SNPChromosome21 convertTo21() {
    	
    	SNPChromosome21 snpchromosome21 = new SNPChromosome21();
    	
        snpchromosome21.setSnpId(this.getSnpId());
        snpchromosome21.setChromosomeId(this.getChromosomeId());
        snpchromosome21.setPosition(this.getPosition());
        snpchromosome21.setReference(this.getReference());
        snpchromosome21.setAlternative(this.getAlternative());
        snpchromosome21.setRegion(this.getRegion());
        snpchromosome21.setEnsemblGene(this.getEnsemblGene());
        snpchromosome21.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome21.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome21.setStrain7Allele(this.getStrain7Allele());
        snpchromosome21.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome21.setStrainPAllele(this.getStrainPAllele());
        snpchromosome21.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome21.setStrainWAllele(this.getStrainWAllele());
        snpchromosome21.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome21.setStrainNAllele(this.getStrainNAllele());
        snpchromosome21.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome21.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome21.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome21.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome21.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome21.setStrain6Allele(this.getStrain6Allele());
        snpchromosome21.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome21.setStrainCAllele(this.getStrainCAllele());
        snpchromosome21.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome21.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome21.setPredictionCategory(this.getPredictionCategory());
        snpchromosome21.setScoreSift(this.getScoreSift());
        snpchromosome21.setScoreConservation(this.getScoreConservation());
        snpchromosome21.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome21.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome21.setScoreProvean(this.getScoreProvean());

    	return snpchromosome21;
    }

    public SNPChromosome20 convertTo20() {
    	
    	SNPChromosome20 snpchromosome20 = new SNPChromosome20();
    	
        snpchromosome20.setSnpId(this.getSnpId());
        snpchromosome20.setChromosomeId(this.getChromosomeId());
        snpchromosome20.setPosition(this.getPosition());
        snpchromosome20.setReference(this.getReference());
        snpchromosome20.setAlternative(this.getAlternative());
        snpchromosome20.setRegion(this.getRegion());
        snpchromosome20.setEnsemblGene(this.getEnsemblGene());
        snpchromosome20.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome20.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome20.setStrain7Allele(this.getStrain7Allele());
        snpchromosome20.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome20.setStrainPAllele(this.getStrainPAllele());
        snpchromosome20.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome20.setStrainWAllele(this.getStrainWAllele());
        snpchromosome20.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome20.setStrainNAllele(this.getStrainNAllele());
        snpchromosome20.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome20.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome20.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome20.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome20.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome20.setStrain6Allele(this.getStrain6Allele());
        snpchromosome20.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome20.setStrainCAllele(this.getStrainCAllele());
        snpchromosome20.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome20.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome20.setPredictionCategory(this.getPredictionCategory());
        snpchromosome20.setScoreSift(this.getScoreSift());
        snpchromosome20.setScoreConservation(this.getScoreConservation());
        snpchromosome20.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome20.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome20.setScoreProvean(this.getScoreProvean());

    	return snpchromosome20;
    }

    public SNPChromosome19 convertTo19() {
    	
    	SNPChromosome19 snpchromosome19 = new SNPChromosome19();
    	
        snpchromosome19.setSnpId(this.getSnpId());
        snpchromosome19.setChromosomeId(this.getChromosomeId());
        snpchromosome19.setPosition(this.getPosition());
        snpchromosome19.setReference(this.getReference());
        snpchromosome19.setAlternative(this.getAlternative());
        snpchromosome19.setRegion(this.getRegion());
        snpchromosome19.setEnsemblGene(this.getEnsemblGene());
        snpchromosome19.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome19.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome19.setStrain7Allele(this.getStrain7Allele());
        snpchromosome19.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome19.setStrainPAllele(this.getStrainPAllele());
        snpchromosome19.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome19.setStrainWAllele(this.getStrainWAllele());
        snpchromosome19.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome19.setStrainNAllele(this.getStrainNAllele());
        snpchromosome19.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome19.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome19.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome19.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome19.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome19.setStrain6Allele(this.getStrain6Allele());
        snpchromosome19.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome19.setStrainCAllele(this.getStrainCAllele());
        snpchromosome19.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome19.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome19.setPredictionCategory(this.getPredictionCategory());
        snpchromosome19.setScoreSift(this.getScoreSift());
        snpchromosome19.setScoreConservation(this.getScoreConservation());
        snpchromosome19.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome19.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome19.setScoreProvean(this.getScoreProvean());

    	return snpchromosome19;
    }

    public SNPChromosome18 convertTo18() {
    	
    	SNPChromosome18 snpchromosome18 = new SNPChromosome18();
    	
        snpchromosome18.setSnpId(this.getSnpId());
        snpchromosome18.setChromosomeId(this.getChromosomeId());
        snpchromosome18.setPosition(this.getPosition());
        snpchromosome18.setReference(this.getReference());
        snpchromosome18.setAlternative(this.getAlternative());
        snpchromosome18.setRegion(this.getRegion());
        snpchromosome18.setEnsemblGene(this.getEnsemblGene());
        snpchromosome18.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome18.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome18.setStrain7Allele(this.getStrain7Allele());
        snpchromosome18.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome18.setStrainPAllele(this.getStrainPAllele());
        snpchromosome18.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome18.setStrainWAllele(this.getStrainWAllele());
        snpchromosome18.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome18.setStrainNAllele(this.getStrainNAllele());
        snpchromosome18.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome18.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome18.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome18.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome18.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome18.setStrain6Allele(this.getStrain6Allele());
        snpchromosome18.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome18.setStrainCAllele(this.getStrainCAllele());
        snpchromosome18.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome18.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome18.setPredictionCategory(this.getPredictionCategory());
        snpchromosome18.setScoreSift(this.getScoreSift());
        snpchromosome18.setScoreConservation(this.getScoreConservation());
        snpchromosome18.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome18.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome18.setScoreProvean(this.getScoreProvean());

    	return snpchromosome18;
    }

    public SNPChromosome17 convertTo17() {
    	
    	SNPChromosome17 snpchromosome17 = new SNPChromosome17();
    	
        snpchromosome17.setSnpId(this.getSnpId());
        snpchromosome17.setChromosomeId(this.getChromosomeId());
        snpchromosome17.setPosition(this.getPosition());
        snpchromosome17.setReference(this.getReference());
        snpchromosome17.setAlternative(this.getAlternative());
        snpchromosome17.setRegion(this.getRegion());
        snpchromosome17.setEnsemblGene(this.getEnsemblGene());
        snpchromosome17.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome17.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome17.setStrain7Allele(this.getStrain7Allele());
        snpchromosome17.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome17.setStrainPAllele(this.getStrainPAllele());
        snpchromosome17.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome17.setStrainWAllele(this.getStrainWAllele());
        snpchromosome17.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome17.setStrainNAllele(this.getStrainNAllele());
        snpchromosome17.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome17.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome17.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome17.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome17.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome17.setStrain6Allele(this.getStrain6Allele());
        snpchromosome17.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome17.setStrainCAllele(this.getStrainCAllele());
        snpchromosome17.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome17.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome17.setPredictionCategory(this.getPredictionCategory());
        snpchromosome17.setScoreSift(this.getScoreSift());
        snpchromosome17.setScoreConservation(this.getScoreConservation());
        snpchromosome17.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome17.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome17.setScoreProvean(this.getScoreProvean());

    	return snpchromosome17;
    }

    public SNPChromosome16 convertTo16() {
    	
    	SNPChromosome16 snpchromosome16 = new SNPChromosome16();
    	
        snpchromosome16.setSnpId(this.getSnpId());
        snpchromosome16.setChromosomeId(this.getChromosomeId());
        snpchromosome16.setPosition(this.getPosition());
        snpchromosome16.setReference(this.getReference());
        snpchromosome16.setAlternative(this.getAlternative());
        snpchromosome16.setRegion(this.getRegion());
        snpchromosome16.setEnsemblGene(this.getEnsemblGene());
        snpchromosome16.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome16.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome16.setStrain7Allele(this.getStrain7Allele());
        snpchromosome16.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome16.setStrainPAllele(this.getStrainPAllele());
        snpchromosome16.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome16.setStrainWAllele(this.getStrainWAllele());
        snpchromosome16.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome16.setStrainNAllele(this.getStrainNAllele());
        snpchromosome16.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome16.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome16.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome16.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome16.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome16.setStrain6Allele(this.getStrain6Allele());
        snpchromosome16.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome16.setStrainCAllele(this.getStrainCAllele());
        snpchromosome16.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome16.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome16.setPredictionCategory(this.getPredictionCategory());
        snpchromosome16.setScoreSift(this.getScoreSift());
        snpchromosome16.setScoreConservation(this.getScoreConservation());
        snpchromosome16.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome16.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome16.setScoreProvean(this.getScoreProvean());

    	return snpchromosome16;
    }

    public SNPChromosome15 convertTo15() {
    	
    	SNPChromosome15 snpchromosome15 = new SNPChromosome15();
    	
        snpchromosome15.setSnpId(this.getSnpId());
        snpchromosome15.setChromosomeId(this.getChromosomeId());
        snpchromosome15.setPosition(this.getPosition());
        snpchromosome15.setReference(this.getReference());
        snpchromosome15.setAlternative(this.getAlternative());
        snpchromosome15.setRegion(this.getRegion());
        snpchromosome15.setEnsemblGene(this.getEnsemblGene());
        snpchromosome15.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome15.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome15.setStrain7Allele(this.getStrain7Allele());
        snpchromosome15.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome15.setStrainPAllele(this.getStrainPAllele());
        snpchromosome15.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome15.setStrainWAllele(this.getStrainWAllele());
        snpchromosome15.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome15.setStrainNAllele(this.getStrainNAllele());
        snpchromosome15.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome15.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome15.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome15.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome15.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome15.setStrain6Allele(this.getStrain6Allele());
        snpchromosome15.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome15.setStrainCAllele(this.getStrainCAllele());
        snpchromosome15.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome15.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome15.setPredictionCategory(this.getPredictionCategory());
        snpchromosome15.setScoreSift(this.getScoreSift());
        snpchromosome15.setScoreConservation(this.getScoreConservation());
        snpchromosome15.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome15.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome15.setScoreProvean(this.getScoreProvean());

    	return snpchromosome15;
    }

    public SNPChromosome14 convertTo14() {
    	
    	SNPChromosome14 snpchromosome14 = new SNPChromosome14();
    	
        snpchromosome14.setSnpId(this.getSnpId());
        snpchromosome14.setChromosomeId(this.getChromosomeId());
        snpchromosome14.setPosition(this.getPosition());
        snpchromosome14.setReference(this.getReference());
        snpchromosome14.setAlternative(this.getAlternative());
        snpchromosome14.setRegion(this.getRegion());
        snpchromosome14.setEnsemblGene(this.getEnsemblGene());
        snpchromosome14.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome14.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome14.setStrain7Allele(this.getStrain7Allele());
        snpchromosome14.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome14.setStrainPAllele(this.getStrainPAllele());
        snpchromosome14.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome14.setStrainWAllele(this.getStrainWAllele());
        snpchromosome14.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome14.setStrainNAllele(this.getStrainNAllele());
        snpchromosome14.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome14.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome14.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome14.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome14.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome14.setStrain6Allele(this.getStrain6Allele());
        snpchromosome14.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome14.setStrainCAllele(this.getStrainCAllele());
        snpchromosome14.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome14.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome14.setPredictionCategory(this.getPredictionCategory());
        snpchromosome14.setScoreSift(this.getScoreSift());
        snpchromosome14.setScoreConservation(this.getScoreConservation());
        snpchromosome14.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome14.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome14.setScoreProvean(this.getScoreProvean());

    	return snpchromosome14;
    }

    public SNPChromosome13 convertTo13() {
    	
    	SNPChromosome13 snpchromosome13 = new SNPChromosome13();
    	
        snpchromosome13.setSnpId(this.getSnpId());
        snpchromosome13.setChromosomeId(this.getChromosomeId());
        snpchromosome13.setPosition(this.getPosition());
        snpchromosome13.setReference(this.getReference());
        snpchromosome13.setAlternative(this.getAlternative());
        snpchromosome13.setRegion(this.getRegion());
        snpchromosome13.setEnsemblGene(this.getEnsemblGene());
        snpchromosome13.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome13.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome13.setStrain7Allele(this.getStrain7Allele());
        snpchromosome13.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome13.setStrainPAllele(this.getStrainPAllele());
        snpchromosome13.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome13.setStrainWAllele(this.getStrainWAllele());
        snpchromosome13.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome13.setStrainNAllele(this.getStrainNAllele());
        snpchromosome13.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome13.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome13.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome13.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome13.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome13.setStrain6Allele(this.getStrain6Allele());
        snpchromosome13.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome13.setStrainCAllele(this.getStrainCAllele());
        snpchromosome13.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome13.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome13.setPredictionCategory(this.getPredictionCategory());
        snpchromosome13.setScoreSift(this.getScoreSift());
        snpchromosome13.setScoreConservation(this.getScoreConservation());
        snpchromosome13.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome13.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome13.setScoreProvean(this.getScoreProvean());

    	return snpchromosome13;
    }
    
    public SNPChromosome12 convertTo12() {
    	
    	SNPChromosome12 snpchromosome12 = new SNPChromosome12();
    	
        snpchromosome12.setSnpId(this.getSnpId());
        snpchromosome12.setChromosomeId(this.getChromosomeId());
        snpchromosome12.setPosition(this.getPosition());
        snpchromosome12.setReference(this.getReference());
        snpchromosome12.setAlternative(this.getAlternative());
        snpchromosome12.setRegion(this.getRegion());
        snpchromosome12.setEnsemblGene(this.getEnsemblGene());
        snpchromosome12.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome12.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome12.setStrain7Allele(this.getStrain7Allele());
        snpchromosome12.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome12.setStrainPAllele(this.getStrainPAllele());
        snpchromosome12.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome12.setStrainWAllele(this.getStrainWAllele());
        snpchromosome12.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome12.setStrainNAllele(this.getStrainNAllele());
        snpchromosome12.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome12.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome12.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome12.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome12.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome12.setStrain6Allele(this.getStrain6Allele());
        snpchromosome12.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome12.setStrainCAllele(this.getStrainCAllele());
        snpchromosome12.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome12.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome12.setPredictionCategory(this.getPredictionCategory());
        snpchromosome12.setScoreSift(this.getScoreSift());
        snpchromosome12.setScoreConservation(this.getScoreConservation());
        snpchromosome12.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome12.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome12.setScoreProvean(this.getScoreProvean());

    	return snpchromosome12;
    }

    public SNPChromosome11 convertTo11() {
    	
    	SNPChromosome11 snpchromosome11 = new SNPChromosome11();
    	
        snpchromosome11.setSnpId(this.getSnpId());
        snpchromosome11.setChromosomeId(this.getChromosomeId());
        snpchromosome11.setPosition(this.getPosition());
        snpchromosome11.setReference(this.getReference());
        snpchromosome11.setAlternative(this.getAlternative());
        snpchromosome11.setRegion(this.getRegion());
        snpchromosome11.setEnsemblGene(this.getEnsemblGene());
        snpchromosome11.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome11.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome11.setStrain7Allele(this.getStrain7Allele());
        snpchromosome11.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome11.setStrainPAllele(this.getStrainPAllele());
        snpchromosome11.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome11.setStrainWAllele(this.getStrainWAllele());
        snpchromosome11.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome11.setStrainNAllele(this.getStrainNAllele());
        snpchromosome11.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome11.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome11.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome11.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome11.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome11.setStrain6Allele(this.getStrain6Allele());
        snpchromosome11.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome11.setStrainCAllele(this.getStrainCAllele());
        snpchromosome11.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome11.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome11.setPredictionCategory(this.getPredictionCategory());
        snpchromosome11.setScoreSift(this.getScoreSift());
        snpchromosome11.setScoreConservation(this.getScoreConservation());
        snpchromosome11.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome11.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome11.setScoreProvean(this.getScoreProvean());

    	return snpchromosome11;
    }

    public SNPChromosome10 convertTo10() {
    	
    	SNPChromosome10 snpchromosome10 = new SNPChromosome10();
    	
        snpchromosome10.setSnpId(this.getSnpId());
        snpchromosome10.setChromosomeId(this.getChromosomeId());
        snpchromosome10.setPosition(this.getPosition());
        snpchromosome10.setReference(this.getReference());
        snpchromosome10.setAlternative(this.getAlternative());
        snpchromosome10.setRegion(this.getRegion());
        snpchromosome10.setEnsemblGene(this.getEnsemblGene());
        snpchromosome10.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome10.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome10.setStrain7Allele(this.getStrain7Allele());
        snpchromosome10.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome10.setStrainPAllele(this.getStrainPAllele());
        snpchromosome10.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome10.setStrainWAllele(this.getStrainWAllele());
        snpchromosome10.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome10.setStrainNAllele(this.getStrainNAllele());
        snpchromosome10.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome10.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome10.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome10.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome10.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome10.setStrain6Allele(this.getStrain6Allele());
        snpchromosome10.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome10.setStrainCAllele(this.getStrainCAllele());
        snpchromosome10.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome10.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome10.setPredictionCategory(this.getPredictionCategory());
        snpchromosome10.setScoreSift(this.getScoreSift());
        snpchromosome10.setScoreConservation(this.getScoreConservation());
        snpchromosome10.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome10.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome10.setScoreProvean(this.getScoreProvean());

    	return snpchromosome10;
    }

    public SNPChromosome09 convertTo9() {
    	
    	SNPChromosome09 snpchromosome9 = new SNPChromosome09();
    	
        snpchromosome9.setSnpId(this.getSnpId());
        snpchromosome9.setChromosomeId(this.getChromosomeId());
        snpchromosome9.setPosition(this.getPosition());
        snpchromosome9.setReference(this.getReference());
        snpchromosome9.setAlternative(this.getAlternative());
        snpchromosome9.setRegion(this.getRegion());
        snpchromosome9.setEnsemblGene(this.getEnsemblGene());
        snpchromosome9.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome9.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome9.setStrain7Allele(this.getStrain7Allele());
        snpchromosome9.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome9.setStrainPAllele(this.getStrainPAllele());
        snpchromosome9.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome9.setStrainWAllele(this.getStrainWAllele());
        snpchromosome9.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome9.setStrainNAllele(this.getStrainNAllele());
        snpchromosome9.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome9.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome9.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome9.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome9.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome9.setStrain6Allele(this.getStrain6Allele());
        snpchromosome9.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome9.setStrainCAllele(this.getStrainCAllele());
        snpchromosome9.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome9.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome9.setPredictionCategory(this.getPredictionCategory());
        snpchromosome9.setScoreSift(this.getScoreSift());
        snpchromosome9.setScoreConservation(this.getScoreConservation());
        snpchromosome9.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome9.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome9.setScoreProvean(this.getScoreProvean());

    	return snpchromosome9;
    }

    public SNPChromosome08 convertTo8() {
    	
    	SNPChromosome08 snpchromosome8 = new SNPChromosome08();
    	
        snpchromosome8.setSnpId(this.getSnpId());
        snpchromosome8.setChromosomeId(this.getChromosomeId());
        snpchromosome8.setPosition(this.getPosition());
        snpchromosome8.setReference(this.getReference());
        snpchromosome8.setAlternative(this.getAlternative());
        snpchromosome8.setRegion(this.getRegion());
        snpchromosome8.setEnsemblGene(this.getEnsemblGene());
        snpchromosome8.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome8.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome8.setStrain7Allele(this.getStrain7Allele());
        snpchromosome8.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome8.setStrainPAllele(this.getStrainPAllele());
        snpchromosome8.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome8.setStrainWAllele(this.getStrainWAllele());
        snpchromosome8.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome8.setStrainNAllele(this.getStrainNAllele());
        snpchromosome8.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome8.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome8.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome8.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome8.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome8.setStrain6Allele(this.getStrain6Allele());
        snpchromosome8.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome8.setStrainCAllele(this.getStrainCAllele());
        snpchromosome8.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome8.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome8.setPredictionCategory(this.getPredictionCategory());
        snpchromosome8.setScoreSift(this.getScoreSift());
        snpchromosome8.setScoreConservation(this.getScoreConservation());
        snpchromosome8.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome8.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome8.setScoreProvean(this.getScoreProvean());

    	return snpchromosome8;
    }

    public SNPChromosome07 convertTo7() {
    	
    	SNPChromosome07 snpchromosome7 = new SNPChromosome07();
    	
        snpchromosome7.setSnpId(this.getSnpId());
        snpchromosome7.setChromosomeId(this.getChromosomeId());
        snpchromosome7.setPosition(this.getPosition());
        snpchromosome7.setReference(this.getReference());
        snpchromosome7.setAlternative(this.getAlternative());
        snpchromosome7.setRegion(this.getRegion());
        snpchromosome7.setEnsemblGene(this.getEnsemblGene());
        snpchromosome7.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome7.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome7.setStrain7Allele(this.getStrain7Allele());
        snpchromosome7.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome7.setStrainPAllele(this.getStrainPAllele());
        snpchromosome7.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome7.setStrainWAllele(this.getStrainWAllele());
        snpchromosome7.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome7.setStrainNAllele(this.getStrainNAllele());
        snpchromosome7.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome7.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome7.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome7.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome7.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome7.setStrain6Allele(this.getStrain6Allele());
        snpchromosome7.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome7.setStrainCAllele(this.getStrainCAllele());
        snpchromosome7.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome7.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome7.setPredictionCategory(this.getPredictionCategory());
        snpchromosome7.setScoreSift(this.getScoreSift());
        snpchromosome7.setScoreConservation(this.getScoreConservation());
        snpchromosome7.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome7.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome7.setScoreProvean(this.getScoreProvean());

    	return snpchromosome7;
    }

    public SNPChromosome06 convertTo6() {
    	
    	SNPChromosome06 snpchromosome6 = new SNPChromosome06();
    	
        snpchromosome6.setSnpId(this.getSnpId());
        snpchromosome6.setChromosomeId(this.getChromosomeId());
        snpchromosome6.setPosition(this.getPosition());
        snpchromosome6.setReference(this.getReference());
        snpchromosome6.setAlternative(this.getAlternative());
        snpchromosome6.setRegion(this.getRegion());
        snpchromosome6.setEnsemblGene(this.getEnsemblGene());
        snpchromosome6.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome6.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome6.setStrain7Allele(this.getStrain7Allele());
        snpchromosome6.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome6.setStrainPAllele(this.getStrainPAllele());
        snpchromosome6.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome6.setStrainWAllele(this.getStrainWAllele());
        snpchromosome6.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome6.setStrainNAllele(this.getStrainNAllele());
        snpchromosome6.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome6.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome6.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome6.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome6.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome6.setStrain6Allele(this.getStrain6Allele());
        snpchromosome6.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome6.setStrainCAllele(this.getStrainCAllele());
        snpchromosome6.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome6.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome6.setPredictionCategory(this.getPredictionCategory());
        snpchromosome6.setScoreSift(this.getScoreSift());
        snpchromosome6.setScoreConservation(this.getScoreConservation());
        snpchromosome6.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome6.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome6.setScoreProvean(this.getScoreProvean());

    	return snpchromosome6;
    }

    public SNPChromosome05 convertTo5() {
    	
    	SNPChromosome05 snpchromosome5 = new SNPChromosome05();
    	
        snpchromosome5.setSnpId(this.getSnpId());
        snpchromosome5.setChromosomeId(this.getChromosomeId());
        snpchromosome5.setPosition(this.getPosition());
        snpchromosome5.setReference(this.getReference());
        snpchromosome5.setAlternative(this.getAlternative());
        snpchromosome5.setRegion(this.getRegion());
        snpchromosome5.setEnsemblGene(this.getEnsemblGene());
        snpchromosome5.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome5.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome5.setStrain7Allele(this.getStrain7Allele());
        snpchromosome5.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome5.setStrainPAllele(this.getStrainPAllele());
        snpchromosome5.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome5.setStrainWAllele(this.getStrainWAllele());
        snpchromosome5.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome5.setStrainNAllele(this.getStrainNAllele());
        snpchromosome5.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome5.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome5.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome5.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome5.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome5.setStrain6Allele(this.getStrain6Allele());
        snpchromosome5.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome5.setStrainCAllele(this.getStrainCAllele());
        snpchromosome5.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome5.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome5.setPredictionCategory(this.getPredictionCategory());
        snpchromosome5.setScoreSift(this.getScoreSift());
        snpchromosome5.setScoreConservation(this.getScoreConservation());
        snpchromosome5.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome5.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome5.setScoreProvean(this.getScoreProvean());

    	return snpchromosome5;
    }

    public SNPChromosome04 convertTo4() {
    	
    	SNPChromosome04 snpchromosome4 = new SNPChromosome04();
    	
        snpchromosome4.setSnpId(this.getSnpId());
        snpchromosome4.setChromosomeId(this.getChromosomeId());
        snpchromosome4.setPosition(this.getPosition());
        snpchromosome4.setReference(this.getReference());
        snpchromosome4.setAlternative(this.getAlternative());
        snpchromosome4.setRegion(this.getRegion());
        snpchromosome4.setEnsemblGene(this.getEnsemblGene());
        snpchromosome4.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome4.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome4.setStrain7Allele(this.getStrain7Allele());
        snpchromosome4.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome4.setStrainPAllele(this.getStrainPAllele());
        snpchromosome4.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome4.setStrainWAllele(this.getStrainWAllele());
        snpchromosome4.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome4.setStrainNAllele(this.getStrainNAllele());
        snpchromosome4.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome4.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome4.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome4.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome4.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome4.setStrain6Allele(this.getStrain6Allele());
        snpchromosome4.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome4.setStrainCAllele(this.getStrainCAllele());
        snpchromosome4.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome4.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome4.setPredictionCategory(this.getPredictionCategory());
        snpchromosome4.setScoreSift(this.getScoreSift());
        snpchromosome4.setScoreConservation(this.getScoreConservation());
        snpchromosome4.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome4.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome4.setScoreProvean(this.getScoreProvean());

    	return snpchromosome4;
    }

    public SNPChromosome03 convertTo3() {
    	
    	SNPChromosome03 snpchromosome3 = new SNPChromosome03();
    	
        snpchromosome3.setSnpId(this.getSnpId());
        snpchromosome3.setChromosomeId(this.getChromosomeId());
        snpchromosome3.setPosition(this.getPosition());
        snpchromosome3.setReference(this.getReference());
        snpchromosome3.setAlternative(this.getAlternative());
        snpchromosome3.setRegion(this.getRegion());
        snpchromosome3.setEnsemblGene(this.getEnsemblGene());
        snpchromosome3.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome3.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome3.setStrain7Allele(this.getStrain7Allele());
        snpchromosome3.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome3.setStrainPAllele(this.getStrainPAllele());
        snpchromosome3.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome3.setStrainWAllele(this.getStrainWAllele());
        snpchromosome3.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome3.setStrainNAllele(this.getStrainNAllele());
        snpchromosome3.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome3.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome3.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome3.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome3.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome3.setStrain6Allele(this.getStrain6Allele());
        snpchromosome3.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome3.setStrainCAllele(this.getStrainCAllele());
        snpchromosome3.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome3.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome3.setPredictionCategory(this.getPredictionCategory());
        snpchromosome3.setScoreSift(this.getScoreSift());
        snpchromosome3.setScoreConservation(this.getScoreConservation());
        snpchromosome3.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome3.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome3.setScoreProvean(this.getScoreProvean());

    	return snpchromosome3;
    }

    public SNPChromosome01 convertTo1() {
    	
    	SNPChromosome01 snpchromosome1 = new SNPChromosome01();
    	
        snpchromosome1.setSnpId(this.getSnpId());
        snpchromosome1.setChromosomeId(this.getChromosomeId());
        snpchromosome1.setPosition(this.getPosition());
        snpchromosome1.setReference(this.getReference());
        snpchromosome1.setAlternative(this.getAlternative());
        snpchromosome1.setRegion(this.getRegion());
        snpchromosome1.setEnsemblGene(this.getEnsemblGene());
        snpchromosome1.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome1.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome1.setStrain7Allele(this.getStrain7Allele());
        snpchromosome1.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome1.setStrainPAllele(this.getStrainPAllele());
        snpchromosome1.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome1.setStrainWAllele(this.getStrainWAllele());
        snpchromosome1.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome1.setStrainNAllele(this.getStrainNAllele());
        snpchromosome1.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome1.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome1.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome1.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome1.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome1.setStrain6Allele(this.getStrain6Allele());
        snpchromosome1.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome1.setStrainCAllele(this.getStrainCAllele());
        snpchromosome1.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome1.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome1.setPredictionCategory(this.getPredictionCategory());
        snpchromosome1.setScoreSift(this.getScoreSift());
        snpchromosome1.setScoreConservation(this.getScoreConservation());
        snpchromosome1.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome1.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome1.setScoreProvean(this.getScoreProvean());

    	return snpchromosome1;
    }

    /**
     * This setter method should only be used by unit tests.
     * @param oid
     */
    protected void setId(long oid) {
        this.oid = oid;
    }
}
