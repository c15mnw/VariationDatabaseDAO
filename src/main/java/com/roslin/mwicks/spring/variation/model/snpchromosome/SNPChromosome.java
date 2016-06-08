package com.roslin.mwicks.spring.variation.model.snpchromosome;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.*;

import java.util.Date;

import com.roslin.mwicks.spring.variation.format.CustomDateToStringStyle;
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
    private double strain7AlleleRatio;
    private long strain7AlleleAlternativeCount;
    private long strain7AlleleReferenceCount;
    
    private String strainPAllele;
    private String strainPAlleleFixed;
    private double strainPAlleleRatio;
    private long strainPAlleleAlternativeCount;
    private long strainPAlleleReferenceCount;
    
    private String strainWAllele;
    private String strainWAlleleFixed;
    private double strainWAlleleRatio;
    private long strainWAlleleAlternativeCount;
    private long strainWAlleleReferenceCount;
    
    private String strainNAllele;
    private String strainNAlleleFixed;
    private double strainNAlleleRatio;
    private long strainNAlleleAlternativeCount;
    private long strainNAlleleReferenceCount;
    
    private String strain15IAllele;
    private String strain15IAlleleFixed;
    private double strain15IAlleleRatio;
    private long strain15IAlleleAlternativeCount;
    private long strain15IAlleleReferenceCount;
    
    private String strainZeroAllele;
    private String strainZeroAlleleFixed;
    private double strainZeroAlleleRatio;
    private long strainZeroAlleleAlternativeCount;
    private long strainZeroAlleleReferenceCount;
    
    private String strain6Allele;
    private String strain6AlleleFixed;
    private double strain6AlleleRatio;
    private long strain6AlleleAlternativeCount;
    private long strain6AlleleReferenceCount;
    
    private String strainCAllele;
    private String strainCAlleleFixed;
    private double strainCAlleleRatio;
    private long strainCAlleleAlternativeCount;
    private long strainCAlleleReferenceCount;

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
    public double getStrain7AlleleRatio() {
    	return this.strain7AlleleRatio;
    }
    public long getStrain7AlleleAlternativeCount() {
    	return this.strain7AlleleAlternativeCount;
    }
    public long getStrain7AlleleReferenceCount() {
    	return this.strain7AlleleReferenceCount;
    }

    public String getStrainPAllele() {
    	return this.strainPAllele;
    }
    public String getStrainPAlleleFixed() {
    	return this.strainPAlleleFixed;
    }
    public double getStrainPAlleleRatio() {
    	return this.strainPAlleleRatio;
    }
    public long getStrainPAlleleAlternativeCount() {
    	return this.strainPAlleleAlternativeCount;
    }
    public long getStrainPAlleleReferenceCount() {
    	return this.strainPAlleleReferenceCount;
    }

    public String getStrainWAllele() {
    	return this.strainWAllele;
    }
    public String getStrainWAlleleFixed() {
    	return this.strainWAlleleFixed;
    }
    public double getStrainWAlleleRatio() {
    	return this.strainWAlleleRatio;
    }
    public long getStrainWAlleleAlternativeCount() {
    	return this.strainWAlleleAlternativeCount;
    }
    public long getStrainWAlleleReferenceCount() {
    	return this.strainWAlleleReferenceCount;
    }

    public String getStrainNAllele() {
    	return this.strainNAllele;
    }
    public String getStrainNAlleleFixed() {
    	return this.strainNAlleleFixed;
    }
    public double getStrainNAlleleRatio() {
    	return this.strainNAlleleRatio;
    }
    public long getStrainNAlleleAlternativeCount() {
    	return this.strainNAlleleAlternativeCount;
    }
    public long getStrainNAlleleReferenceCount() {
    	return this.strainNAlleleReferenceCount;
    }

    public String getStrain15IAllele() {
    	return this.strain15IAllele;
    }
    public String getStrain15IAlleleFixed() {
    	return this.strain15IAlleleFixed;
    }
    public double getStrain15IAlleleRatio() {
    	return this.strain15IAlleleRatio;
    }
    public long getStrain15IAlleleAlternativeCount() {
    	return this.strain15IAlleleAlternativeCount;
    }
    public long getStrain15IAlleleReferenceCount() {
    	return this.strain15IAlleleReferenceCount;
    }

    public String getStrainZeroAllele() {
    	return this.strainZeroAllele;
    }
    public String getStrainZeroAlleleFixed() {  
    	return this.strainZeroAlleleFixed;
    }
    public double getStrainZeroAlleleRatio() {
    	return this.strainZeroAlleleRatio;
    }
    public long getStrainZeroAlleleAlternativeCount() {
    	return this.strainZeroAlleleAlternativeCount;
    }
    public long getStrainZeroAlleleReferenceCount() {
    	return this.strainZeroAlleleReferenceCount;
    }

    public String getStrain6Allele() {
    	return this.strain6Allele;
    }
    public String getStrain6AlleleFixed() {
    	return this.strain6AlleleFixed;
    }
    public double getStrain6AlleleRatio() {
    	return this.strain6AlleleRatio;
    }
    public long getStrain6AlleleAlternativeCount() {
    	return this.strain6AlleleAlternativeCount;
    }
    public long getStrain6AlleleReferenceCount() {
    	return this.strain6AlleleReferenceCount;
    }

    public String getStrainCAllele() {
    	return this.strainCAllele;
    }
    public String getStrainCAlleleFixed() {
    	return this.strainCAlleleFixed;
    }
    public double getStrainCAlleleRatio() {
    	return this.strainCAlleleRatio;
    }
    public long getStrainCAlleleAlternativeCount() {
    	return this.strainCAlleleAlternativeCount;
    }
    public long getStrainCAlleleReferenceCount() {
    	return this.strainCAlleleReferenceCount;
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
    public String getScoreSiftAsString() {
    	return String.valueOf(this.scoreSift);
    }
    public String getScoreConservationAsString() {
    	return String.valueOf(this.scoreConservation);
    }
    public String getProteinAlignNumberAsString() {
    	return ObjectConverter.convert(this.proteinAlignNumber, String.class);
    }
    public String getTotalAlignSequenceNumberAsString() {
    	return ObjectConverter.convert(this.totalAlignSequenceNumber, String.class);
    }
    public String getScoreProveanAsString() {
    	return String.valueOf(this.scoreProvean);
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
    public String getStrain7AlleleRatioAsString() {
    	return ObjectConverter.convert(this.strain7AlleleRatio, String.class);
    }
    public String getStrainPAlleleRatioAsString() {
    	return ObjectConverter.convert(this.strainPAlleleRatio, String.class);
    }
    public String getStrainWAlleleRatioAsString() {
    	return ObjectConverter.convert(this.strainWAlleleRatio, String.class);
    }
    public String getStrainNAlleleRatioAsString() {
    	return ObjectConverter.convert(this.strainNAlleleRatio, String.class);
    }
    public String getStrain15IAlleleRatioAsString() {
    	return ObjectConverter.convert(this.strain15IAlleleRatio, String.class);
    }
    public String getStrainZeroAlleleRatioAsString() {
    	return ObjectConverter.convert(this.strainZeroAlleleRatio, String.class);
    }
    public String getStrain6AlleleRatioAsString() {
    	return ObjectConverter.convert(this.strain6AlleleRatio, String.class);
    }
    public String getStrainCAlleleRatioAsString() {
    	return ObjectConverter.convert(this.strainCAlleleRatio, String.class);
    }
    public String getStrain7AlleleAlternativeCountAsString() {
    	return ObjectConverter.convert(this.strain7AlleleAlternativeCount, String.class);
    }
    public String getStrain7AlleleReferenceCountAsString() {
    	return ObjectConverter.convert(this.strain7AlleleReferenceCount, String.class);
    }
    public String getStrainPAlleleAlternativeCountAsString() {
    	return ObjectConverter.convert(this.strainPAlleleAlternativeCount, String.class);
    }
    public String getStrainPAlleleReferenceCountAsString() {
    	return ObjectConverter.convert(this.strainPAlleleReferenceCount, String.class);
    }
    public String getStrainWAlleleAlternativeCountAsString() {
    	return ObjectConverter.convert(this.strainWAlleleAlternativeCount, String.class);
    }
    public String getStrainWAlleleReferenceCountAsString() {
    	return ObjectConverter.convert(this.strainWAlleleReferenceCount, String.class);
    }
    public String getStrainNAlleleAlternativeCountAsString() {
    	return ObjectConverter.convert(this.strainNAlleleAlternativeCount, String.class);
    }
    public String getStrainNAlleleReferenceCountAsString() {
    	return ObjectConverter.convert(this.strainNAlleleReferenceCount, String.class);
    }
    public String getStrain15IAlleleAlternativeCountAsString() {
    	return ObjectConverter.convert(this.strain15IAlleleAlternativeCount, String.class);
    }
    public String getStrain15IAlleleReferenceCountAsString() {
    	return ObjectConverter.convert(this.strain15IAlleleReferenceCount, String.class);
    }
    public String getStrainZeroAlleleAlternativeCountAsString() {
    	return ObjectConverter.convert(this.strainZeroAlleleAlternativeCount, String.class);
    }
    public String getStrainZeroAlleleReferenceCountAsString() {
    	return ObjectConverter.convert(this.strainZeroAlleleReferenceCount, String.class);
    }
    public String getStrain6AlleleAlternativeCountAsString() {
    	return ObjectConverter.convert(this.strain6AlleleAlternativeCount, String.class);
    }
    public String getStrain6AlleleReferenceCountAsString() {
    	return ObjectConverter.convert(this.strain6AlleleReferenceCount, String.class);
    }
    public String getStrainCAlleleAlternativeCountAsString() {
    	return ObjectConverter.convert(this.strainCAlleleAlternativeCount, String.class);
    }
    public String getStrainCAlleleReferenceCountAsString() {
    	return ObjectConverter.convert(this.strainCAlleleReferenceCount, String.class);
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
    public String getAminoAcidSubsQuoted() {
    	return '\"' + this.aminoAcidSubs + '\"';
    }
    public String getPredictionCategoryQuoted() {
    	return '\"' + this.predictionCategory + '\"';
    }
    public String getScoreSiftAsStringQuoted() {
    	return '\"' + String.valueOf(this.scoreSift) + '\"';
    }
    public String getScoreConservationAsStringQuoted() {
    	return '\"' + String.valueOf(this.scoreConservation) + '\"';
    }
    public String getProteinAlignNumberAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.proteinAlignNumber, String.class) + '\"';
    }
    public String getTotalAlignSequenceNumberAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.totalAlignSequenceNumber, String.class) + '\"';
    }
    public String getScoreProveanAsStringQuoted() {
    	return '\"' + String.valueOf(this.scoreProvean) + '\"';
    }
    public String getStrainPAlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainPAlleleRatio, String.class) + '\"';
    }
    public String getStrainWAlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainWAlleleRatio, String.class) + '\"';
    }
    public String getStrainNAlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainNAlleleRatio, String.class) + '\"';
    }
    public String getStrain15IAlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strain15IAlleleRatio, String.class) + '\"';
    }
    public String getStrainZeroAlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainZeroAlleleRatio, String.class) + '\"';
    }
    public String getStrain6AlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strain6AlleleRatio, String.class) + '\"';
    }
    public String getStrainCAlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainCAlleleRatio, String.class) + '\"';
    }
    public String getStrain7AlleleAlternativeCountAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strain7AlleleAlternativeCount, String.class) + '\"';
    }
    public String getStrain7AlleleReferenceCountAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strain7AlleleReferenceCount, String.class) + '\"';
    }
    public String getStrainPAlleleAlternativeCountAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainPAlleleAlternativeCount, String.class) + '\"';
    }
    public String getStrainPAlleleReferenceCountAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainPAlleleReferenceCount, String.class) + '\"';
    }
    public String getStrainWAlleleAlternativeCountAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainWAlleleAlternativeCount, String.class) + '\"';
    }
    public String getStrainWAlleleReferenceCountAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainWAlleleReferenceCount, String.class) + '\"';
    }
    public String getStrainNAlleleAlternativeCountAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainNAlleleAlternativeCount, String.class) + '\"';
    }
    public String getStrainNAlleleReferenceCountAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainNAlleleReferenceCount, String.class) + '\"';
    }
    public String getStrain15IAlleleAlternativeCountAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strain15IAlleleAlternativeCount, String.class) + '\"';
    }
    public String getStrain15IAlleleReferenceCountAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strain15IAlleleReferenceCount, String.class) + '\"';
    }
    public String getStrainZeroAlleleAlternativeCountAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainZeroAlleleAlternativeCount, String.class) + '\"';
    }
    public String getStrainZeroAlleleReferenceCountAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainZeroAlleleReferenceCount, String.class) + '\"';
    }
    public String getStrain6AlleleAlternativeCountAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strain6AlleleAlternativeCount, String.class) + '\"';
    }
    public String getStrain6AlleleReferenceCountAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strain6AlleleReferenceCount, String.class) + '\"';
    }
    public String getStrainCAlleleAlternativeCountAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainCAlleleAlternativeCount, String.class) + '\"';
    }
    public String getStrainCAlleleReferenceCountAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainCAlleleReferenceCount, String.class) + '\"';
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
    public void setStrain7AlleleRatio(double strain7AlleleRatio) {
    	this.strain7AlleleRatio = strain7AlleleRatio;
    }
    public void setStrain7AlleleAlternativeCount(long strain7AlleleAlternativeCount) {
    	this.strain7AlleleAlternativeCount = strain7AlleleAlternativeCount;
    }
    public void setStrain7AlleleReferenceCount(long strain7AlleleReferenceCount) {
    	this.strain7AlleleReferenceCount = strain7AlleleReferenceCount;
    }
    
    public void setStrainPAllele(String strainPAllele) {
    	this.strainPAllele = strainPAllele;
    }
    public void setStrainPAlleleFixed(String strainPAlleleFixed) {
    	this.strainPAlleleFixed = strainPAlleleFixed;
    }
    public void setStrainPAlleleRatio(double strainPAlleleRatio) {
    	this.strainPAlleleRatio = strainPAlleleRatio;
    }
    public void setStrainPAlleleAlternativeCount(long strainPAlleleAlternativeCount) {
    	this.strainPAlleleAlternativeCount = strainPAlleleAlternativeCount;
    }
    public void setStrainPAlleleReferenceCount(long strainPAlleleReferenceCount) {
    	this.strainPAlleleReferenceCount = strainPAlleleReferenceCount;
    }
    
    public void setStrainWAllele(String strainWAllele) {
    	this.strainWAllele = strainWAllele;
    }
    public void setStrainWAlleleFixed(String strainWAlleleFixed) {
    	this.strainWAlleleFixed = strainWAlleleFixed;
    }
    public void setStrainWAlleleRatio(double strainWAlleleRatio) {
    	this.strainWAlleleRatio = strainWAlleleRatio;
    }
    public void setStrainWAlleleAlternativeCount(long strainWAlleleAlternativeCount) {
    	this.strainWAlleleAlternativeCount = strainWAlleleAlternativeCount;
    }
    public void setStrainWAlleleReferenceCount(long strainWAlleleReferenceCount) {
    	this.strainWAlleleReferenceCount = strainWAlleleReferenceCount;
    }
    
    public void setStrainNAllele(String strainNAllele) {
    	this.strainNAllele = strainNAllele;
    }
    public void setStrainNAlleleFixed(String strainNAlleleFixed) {
    	this.strainNAlleleFixed = strainNAlleleFixed;
    }
    public void setStrainNAlleleRatio(double strainNAlleleRatio) {
    	this.strainNAlleleRatio = strainNAlleleRatio;
    }
    public void setStrainNAlleleAlternativeCount(long strainNAlleleAlternativeCount) {
    	this.strainNAlleleAlternativeCount = strainNAlleleAlternativeCount;
    }
    public void setStrainNAlleleReferenceCount(long strainNAlleleReferenceCount) {
    	this.strainNAlleleReferenceCount = strainNAlleleReferenceCount;
    }
    
    public void setStrain15IAllele(String strain15IAllele) {
    	this.strain15IAllele = strain15IAllele;
    }
    public void setStrain15IAlleleFixed(String strain15IAlleleFixed) {
    	this.strain15IAlleleFixed = strain15IAlleleFixed;
    }
    public void setStrain15IAlleleRatio(double strain15IAlleleRatio) {
    	this.strain15IAlleleRatio = strain15IAlleleRatio;
    }
    public void setStrain15IAlleleAlternativeCount(long strain15IAlleleAlternativeCount) {
    	this.strain15IAlleleAlternativeCount = strain15IAlleleAlternativeCount;
    }
    public void setStrain15IAlleleReferenceCount(long strain15IAlleleReferenceCount) {
    	this.strain15IAlleleReferenceCount = strain15IAlleleReferenceCount;
    }
    
    public void setStrainZeroAllele(String strainZeroAllele) {
    	this.strainZeroAllele = strainZeroAllele;
    }
    public void setStrainZeroAlleleFixed(String strainZeroAlleleFixed) {  
    	this.strainZeroAlleleFixed = strainZeroAlleleFixed;
    }
    public void setStrainZeroAlleleRatio(double strainZeroAlleleRatio) {
    	this.strainZeroAlleleRatio = strainZeroAlleleRatio;
    }
    public void setStrainZeroAlleleAlternativeCount(long strainZeroAlleleAlternativeCount) {
    	this.strainZeroAlleleAlternativeCount = strainZeroAlleleAlternativeCount;
    }
    public void setStrainZeroAlleleReferenceCount(long strainZeroAlleleReferenceCount) {
    	this.strainZeroAlleleReferenceCount = strainZeroAlleleReferenceCount;
    }
    
    public void setStrain6Allele(String strain6Allele) {
    	this.strain6Allele = strain6Allele;
    }
    public void setStrain6AlleleFixed(String strain6AlleleFixed) {
    	this.strain6AlleleFixed = strain6AlleleFixed;
    }
    public void setStrain6AlleleRatio(double strain6AlleleRatio) {
    	this.strain6AlleleRatio = strain6AlleleRatio;
    }
    public void setStrain6AlleleAlternativeCount(long strain6AlleleAlternativeCount) {
    	this.strain6AlleleAlternativeCount = strain6AlleleAlternativeCount;
    }
    public void setStrain6AlleleReferenceCount(long strain6AlleleReferenceCount) {
    	this.strain6AlleleReferenceCount = strain6AlleleReferenceCount;
    }
    
    public void setStrainCAllele(String strainCAllele) {
    	this.strainCAllele = strainCAllele;
    }
    public void setStrainCAlleleFixed(String strainCAlleleFixed) {
    	this.strainCAlleleFixed = strainCAlleleFixed;
    }
    public void setStrainCAlleleRatio(double strainCAlleleRatio) {
    	this.strainCAlleleRatio = strainCAlleleRatio;
    }
    public void setStrainCAlleleAlternativeCount(long strainCAlleleAlternativeCount) {
    	this.strainCAlleleAlternativeCount = strainCAlleleAlternativeCount;
    }
    public void setStrainCAlleleReferenceCount(long strainCAlleleReferenceCount) {
    	this.strainCAlleleReferenceCount = strainCAlleleReferenceCount;
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

    
    // Setters From Strings -----------------------------------------------------------------------
    public void setCreationTimeFromString(String creationTime) {
    	this.creationTime = ObjectConverter.convert(creationTime, Date.class);
    }
    public void setModificationTimeFromString(String modificationTime) {
    	this.modificationTime = ObjectConverter.convert(modificationTime, Date.class);
    }

    
    // Helpers ------------------------------------------------------------------------------------    
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
    public boolean isSearchChromosome2() {
    	if ( this.chromosomeId.equals(ONLY_2)) {
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
        	    this.getStrain7AlleleRatio() == snpchromosome.getStrain7AlleleRatio() && 
        	    this.getStrain7AlleleAlternativeCount() == snpchromosome.getStrain7AlleleAlternativeCount() && 
        	    this.getStrain7AlleleReferenceCount() == snpchromosome.getStrain7AlleleReferenceCount() && 
        	    
        	    this.getStrainPAllele().equals(snpchromosome.getStrainPAllele()) && 
        	    this.getStrainPAlleleFixed() == snpchromosome.getStrainPAlleleFixed() && 
        	    this.getStrainPAlleleRatio() == snpchromosome.getStrainPAlleleRatio() && 
        	    this.getStrainPAlleleAlternativeCount() == snpchromosome.getStrainPAlleleAlternativeCount() && 
        	    this.getStrainPAlleleReferenceCount() == snpchromosome.getStrainPAlleleReferenceCount() && 
        	    
        	    this.getStrainWAllele().equals(snpchromosome.getStrainWAllele()) && 
        	    this.getStrainWAlleleFixed() == snpchromosome.getStrainWAlleleFixed() && 
        	    this.getStrainWAlleleRatio() == snpchromosome.getStrainWAlleleRatio() && 
        	    this.getStrainWAlleleAlternativeCount() == snpchromosome.getStrainWAlleleAlternativeCount() && 
        	    this.getStrainWAlleleReferenceCount() == snpchromosome.getStrainWAlleleReferenceCount() && 
        	    
        	    this.getStrainNAllele().equals(snpchromosome.getStrainNAllele()) && 
        	    this.getStrainNAlleleFixed() == snpchromosome.getStrainNAlleleFixed() && 
        	    this.getStrainNAlleleRatio() == snpchromosome.getStrainNAlleleRatio() && 
        	    this.getStrainNAlleleAlternativeCount() == snpchromosome.getStrainNAlleleAlternativeCount() && 
        	    this.getStrainNAlleleReferenceCount() == snpchromosome.getStrainNAlleleReferenceCount() && 
        	    
        	    this.getStrain15IAllele().equals(snpchromosome.getStrain15IAllele()) && 
        	    this.getStrain15IAlleleFixed() == snpchromosome.getStrain15IAlleleFixed()  && 
        	    this.getStrain15IAlleleRatio() == snpchromosome.getStrain15IAlleleRatio() && 
        	    this.getStrain15IAlleleAlternativeCount() == snpchromosome.getStrain15IAlleleAlternativeCount() && 
        	    this.getStrain15IAlleleReferenceCount() == snpchromosome.getStrain15IAlleleReferenceCount() && 
        	    
        	    this.getStrainZeroAllele().equals(snpchromosome.getStrainZeroAllele()) && 
        	    this.getStrainZeroAlleleFixed() == snpchromosome.getStrainZeroAlleleFixed() &&  
        	    this.getStrainZeroAlleleRatio() == snpchromosome.getStrainZeroAlleleRatio() && 
        	    this.getStrainZeroAlleleAlternativeCount() == snpchromosome.getStrainZeroAlleleAlternativeCount() && 
        	    this.getStrainZeroAlleleReferenceCount() == snpchromosome.getStrainZeroAlleleReferenceCount() && 
        	    
        	    this.getStrain6Allele().equals(snpchromosome.getStrain6Allele()) && 
        	    this.getStrain6AlleleFixed() == snpchromosome.getStrain6AlleleFixed() && 
        	    this.getStrain6AlleleRatio() == snpchromosome.getStrain6AlleleRatio() && 
        	    this.getStrain6AlleleAlternativeCount() == snpchromosome.getStrain6AlleleAlternativeCount() && 
        	    this.getStrain6AlleleReferenceCount() == snpchromosome.getStrain6AlleleReferenceCount() && 
        	    
        	    this.getStrainCAllele().equals(snpchromosome.getStrainCAllele()) && 
        	    this.getStrainCAlleleFixed() == snpchromosome.getStrainCAlleleFixed() && 
        	    this.getStrainCAlleleRatio() == snpchromosome.getStrainCAlleleRatio() && 
        	    this.getStrainCAlleleAlternativeCount() == snpchromosome.getStrainCAlleleAlternativeCount() && 
        	    this.getStrainCAlleleReferenceCount() == snpchromosome.getStrainCAlleleReferenceCount() && 
        	    
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
    		double strain7AlleleRatio,
    		long strain7AlleleAlternativeCount,
    		long strain7AlleleReferenceCount,
    		
    		String strainPAllele,
    		String strainPAlleleFixed,
    		double strainPAlleleRatio,
    		long strainPAlleleAlternativeCount,
    		long strainPAlleleReferenceCount,
    		
    		String strainWAllele,
    		String strainWAlleleFixed,
    		double strainWAlleleRatio,
    		long strainWAlleleAlternativeCount,
    		long strainWAlleleReferenceCount,
    		
    		String strainNAllele,
    		String strainNAlleleFixed,
    		double strainNAlleleRatio,
    		long strainNAlleleAlternativeCount,
    		long strainNAlleleReferenceCount,
    		
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		double strain15IAlleleRatio,
    		long strain15IAlleleAlternativeCount,
    		long strain15IAlleleReferenceCount,
    		
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		double strainZeroAlleleRatio,
    		long strainZeroAlleleAlternativeCount,
    		long strainZeroAlleleReferenceCount,
    		
    		String strain6Allele,
    		String strain6AlleleFixed,
    		double strain6AlleleRatio,
    		long strain6AlleleAlternativeCount,
    		long strain6AlleleReferenceCount,
    		
    		String strainCAllele,
    		String strainCAlleleFixed,
    		double strainCAlleleRatio,
    		long strainCAlleleAlternativeCount,
    		long strainCAlleleReferenceCount,
        	
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
		this.strain7AlleleRatio = strain7AlleleRatio;
		this.strain7AlleleAlternativeCount = strain7AlleleAlternativeCount;
		this.strain7AlleleReferenceCount = strain7AlleleReferenceCount;
		this.strainPAllele = strainPAllele;
		this.strainPAlleleFixed = strainPAlleleFixed;
		this.strainPAlleleRatio = strainPAlleleRatio;
		this.strainPAlleleAlternativeCount = strainPAlleleAlternativeCount;
		this.strainPAlleleReferenceCount = strainPAlleleReferenceCount;
		this.strainWAllele = strainWAllele;
		this.strainWAlleleFixed = strainWAlleleFixed;
		this.strainWAlleleRatio = strainWAlleleRatio;
		this.strainWAlleleAlternativeCount = strainWAlleleAlternativeCount;
		this.strainWAlleleReferenceCount = strainWAlleleReferenceCount;
		this.strainNAllele = strainNAllele;
		this.strainNAlleleFixed = strainNAlleleFixed;
		this.strainNAlleleRatio = strainNAlleleRatio;
		this.strainNAlleleAlternativeCount = strainNAlleleAlternativeCount;
		this.strainNAlleleReferenceCount = strainNAlleleReferenceCount;
		this.strain15IAllele = strain15IAllele;
		this.strain15IAlleleFixed = strain15IAlleleFixed;
		this.strain15IAlleleRatio = strain15IAlleleRatio;
		this.strain15IAlleleAlternativeCount = strain15IAlleleAlternativeCount;
		this.strain15IAlleleReferenceCount = strain15IAlleleReferenceCount;
		this.strainZeroAllele = strainZeroAllele;
		this.strainZeroAlleleFixed = strainZeroAlleleFixed;
		this.strainZeroAlleleRatio = strainZeroAlleleRatio;
		this.strainZeroAlleleAlternativeCount = strainZeroAlleleAlternativeCount;
		this.strainZeroAlleleReferenceCount = strainZeroAlleleReferenceCount;
		this.strain6Allele = strain6Allele;
		this.strain6AlleleFixed = strain6AlleleFixed;
		this.strain6AlleleRatio = strain6AlleleRatio;
		this.strain6AlleleAlternativeCount = strain6AlleleAlternativeCount;
		this.strain6AlleleReferenceCount = strain6AlleleReferenceCount;
		this.strainCAllele = strainCAllele;
		this.strainCAlleleFixed = strainCAlleleFixed;
		this.strainCAlleleRatio = strainCAlleleRatio;
		this.strainCAlleleAlternativeCount = strainCAlleleAlternativeCount;
		this.strainCAlleleReferenceCount = strainCAlleleReferenceCount;
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
    	
        return ToStringBuilder.reflectionToString(this, new CustomDateToStringStyle());
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
     * @param strain7AlleleRatio For Strain 7 for not fixed alleles what is the ratio that this occurs else 1 for fixed
     * @param strainPAllele For Strain P the Alternative Allele
     * @param strainPAlleleFixed For Strain P is this fixed or not
     * @param strainPAlleleRatio For Strain P for not fixed alleles what is the ratio that this occurs else 1 for fixed
     * @param strainWAllele For Strain W the Alternative Allele
     * @param strainWAlleleFixed For Strain W is this fixed or not
     * @param strainWAlleleRatio For Strain W for not fixed alleles what is the ratio that this occurs else 1 for fixed
     * @param strainNAllele For Strain N the Alternative Allele
     * @param strainNAlleleFixed For Strain N is this fixed or not
     * @param strainNAlleleRatio For Strain N for not fixed alleles what is the ratio that this occurs else 1 for fixed
     * @param strain15IAllele For Strain 15I the Alternative Allele
     * @param strain15IAlleleFixed For Strain 15I is this fixed or not
     * @param strain15IAlleleRatio For Strain 15I for not fixed alleles what is the ratio that this occurs else 1 for fixed
     * @param strainZeroAllele For Strain STRING_FALSE the Alternative Allele
     * @param strainZeroAlleleFixed For Strain STRING_FALSE is this fixed or not
     * @param strainZeroAlleleRatio For Strain STRING_FALSE for not fixed alleles what is the ratio that this occurs else 1 for fixed
     * @param strain6Allele For Strain 6 the Alternative Allele
     * @param strain6AlleleFixed For Strain 6 is this fixed or not
     * @param strain6AlleleRatio For Strain 6 for not fixed alleles what is the ratio that this occurs else 1 for fixed
     * @param strainCAllele For Strain C the Alternative Allele
     * @param strainCAlleleFixed For Strain C is this fixed or not
     * @param strainCAlleleRatio For Strain C for not fixed alleles what is the ratio that this occurs else 1 for fixed
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
    		double strain7AlleleRatio,
    		long strain7AlleleAlternativeCount,
    		long strain7AlleleReferenceCount,
    		
    		String strainPAllele,
    		String strainPAlleleFixed,
    		double strainPAlleleRatio,
    		long strainPAlleleAlternativeCount,
    		long strainPAlleleReferenceCount,
    		
    		String strainWAllele,
    		String strainWAlleleFixed,
    		double strainWAlleleRatio,
    		long strainWAlleleAlternativeCount,
    		long strainWAlleleReferenceCount,
    		
    		String strainNAllele,
    		String strainNAlleleFixed,
    		double strainNAlleleRatio,
    		long strainNAlleleAlternativeCount,
    		long strainNAlleleReferenceCount,
    		
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		double strain15IAlleleRatio,
    		long strain15IAlleleAlternativeCount,
    		long strain15IAlleleReferenceCount,
    		
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		double strainZeroAlleleRatio,
    		long strainZeroAlleleAlternativeCount,
    		long strainZeroAlleleReferenceCount,
    		
    		String strain6Allele,
    		String strain6AlleleFixed,
    		double strain6AlleleRatio,
    		long strain6AlleleAlternativeCount,
    		long strain6AlleleReferenceCount,
    		
    		String strainCAllele,
    		String strainCAlleleFixed,
    		double strainCAlleleRatio,
    		long strainCAlleleAlternativeCount,
    		long strainCAlleleReferenceCount,
    		
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
        		strain7AlleleRatio,
        		strain7AlleleAlternativeCount,
        		strain7AlleleReferenceCount,
        		strainPAllele,
        		strainPAlleleFixed,
        		strainPAlleleRatio,
        		strainPAlleleAlternativeCount,
        		strainPAlleleReferenceCount,
        		strainWAllele,
        		strainWAlleleFixed,
        		strainWAlleleRatio,
        		strainWAlleleAlternativeCount,
        		strainWAlleleReferenceCount,
        		strainNAllele,
        		strainNAlleleFixed,
        		strainNAlleleRatio,
        		strainNAlleleAlternativeCount,
        		strainNAlleleReferenceCount,
        		strain15IAllele,
        		strain15IAlleleFixed,
        		strain15IAlleleRatio,
        		strain15IAlleleAlternativeCount,
        		strain15IAlleleReferenceCount,
        		strainZeroAllele,
        		strainZeroAlleleFixed,
        		strainZeroAlleleRatio,
        		strainZeroAlleleAlternativeCount,
        		strainZeroAlleleReferenceCount,
        		strain6Allele,
        		strain6AlleleFixed,
        		strain6AlleleRatio,
        		strain6AlleleAlternativeCount,
        		strain6AlleleReferenceCount,
        		strainCAllele,
        		strainCAlleleFixed,
        		strainCAlleleRatio,
        		strainCAlleleAlternativeCount,
        		strainCAlleleReferenceCount,
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
         * @param strain7AlleleRatio For Strain 7 for not fixed alleles what is the ratio that this occurs else 1 for fixed
         * @param strainPAllele For Strain P the Alternative Allele
         * @param strainPAlleleFixed For Strain P is this fixed or not
         * @param strainPAlleleRatio For Strain P for not fixed alleles what is the ratio that this occurs else 1 for fixed
         * @param strainWAllele For Strain W the Alternative Allele
         * @param strainWAlleleFixed For Strain W is this fixed or not
         * @param strainWAlleleRatio For Strain W for not fixed alleles what is the ratio that this occurs else 1 for fixed
         * @param strainNAllele For Strain N the Alternative Allele
         * @param strainNAlleleFixed For Strain N is this fixed or not
         * @param strainNAlleleRatio For Strain N for not fixed alleles what is the ratio that this occurs else 1 for fixed
         * @param strain15IAllele For Strain 15I the Alternative Allele
         * @param strain15IAlleleFixed For Strain 15I is this fixed or not
         * @param strain15IAlleleRatio For Strain 15I for not fixed alleles what is the ratio that this occurs else 1 for fixed
         * @param strainZeroAllele For Strain STRING_FALSE the Alternative Allele
         * @param strainZeroAlleleFixed For Strain STRING_FALSE is this fixed or not
         * @param strainZeroAlleleRatio For Strain STRING_FALSE for not fixed alleles what is the ratio that this occurs else 1 for fixed
         * @param strain6Allele For Strain 6 the Alternative Allele
         * @param strain6AlleleFixed For Strain 6 is this fixed or not
         * @param strain6AlleleRatio For Strain 6 for not fixed alleles what is the ratio that this occurs else 1 for fixed
         * @param strainCAllele For Strain C the Alternative Allele
         * @param strainCAlleleFixed For Strain C is this fixed or not
         * @param strainCAlleleRatio For Strain C for not fixed alleles what is the ratio that this occurs else 1 for fixed
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
        		double strain7AlleleRatio,
        		long strain7AlleleAlternativeCount,
        		long strain7AlleleReferenceCount,
        		
        		String strainPAllele,
        		String strainPAlleleFixed,
        		double strainPAlleleRatio,
        		long strainPAlleleAlternativeCount,
        		long strainPAlleleReferenceCount,
        		
        		String strainWAllele,
        		String strainWAlleleFixed,
        		double strainWAlleleRatio,
        		long strainWAlleleAlternativeCount,
        		long strainWAlleleReferenceCount,
        		
        		String strainNAllele,
        		String strainNAlleleFixed,
        		double strainNAlleleRatio,
        		long strainNAlleleAlternativeCount,
        		long strainNAlleleReferenceCount,
        		
        		String strain15IAllele,
        		String strain15IAlleleFixed,
        		double strain15IAlleleRatio,
        		long strain15IAlleleAlternativeCount,
        		long strain15IAlleleReferenceCount,
        		
        		String strainZeroAllele,
        		String strainZeroAlleleFixed,
        		double strainZeroAlleleRatio,
        		long strainZeroAlleleAlternativeCount,
        		long strainZeroAlleleReferenceCount,
        		
        		String strain6Allele,
        		String strain6AlleleFixed,
        		double strain6AlleleRatio,
        		long strain6AlleleAlternativeCount,
        		long strain6AlleleReferenceCount,
        		
        		String strainCAllele,
        		String strainCAlleleFixed,
        		double strainCAlleleRatio,
        		long strainCAlleleAlternativeCount,
        		long strainCAlleleReferenceCount,
            	
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
    		built.strain7AlleleRatio = strain7AlleleRatio;
    		built.strain7AlleleAlternativeCount = strain7AlleleAlternativeCount;
    		built.strain7AlleleReferenceCount = strain7AlleleReferenceCount;
    		built.strainPAllele = strainPAllele;
    		built.strainPAlleleFixed = strainPAlleleFixed;
    		built.strainPAlleleRatio = strainPAlleleRatio;
    		built.strainPAlleleAlternativeCount = strainPAlleleAlternativeCount;
    		built.strainPAlleleReferenceCount = strainPAlleleReferenceCount;
    		built.strainWAllele = strainWAllele;
    		built.strainWAlleleFixed = strainWAlleleFixed;
    		built.strainWAlleleRatio = strainWAlleleRatio;
    		built.strainWAlleleAlternativeCount = strainWAlleleAlternativeCount;
    		built.strainWAlleleReferenceCount = strainWAlleleReferenceCount;
    		built.strainNAllele = strainNAllele;
    		built.strainNAlleleFixed = strainNAlleleFixed;
    		built.strainNAlleleRatio = strainNAlleleRatio;
    		built.strainNAlleleAlternativeCount = strainNAlleleAlternativeCount;
    		built.strainNAlleleReferenceCount = strainNAlleleReferenceCount;
    		built.strain15IAllele = strain15IAllele;
    		built.strain15IAlleleFixed = strain15IAlleleFixed;
    		built.strain15IAlleleRatio = strain15IAlleleRatio;
    		built.strain15IAlleleAlternativeCount = strain15IAlleleAlternativeCount;
    		built.strain15IAlleleReferenceCount = strain15IAlleleReferenceCount;
    		built.strainZeroAllele = strainZeroAllele;
    		built.strainZeroAlleleFixed = strainZeroAlleleFixed;
    		built.strainZeroAlleleRatio = strainZeroAlleleRatio;
    		built.strainZeroAlleleAlternativeCount = strainZeroAlleleAlternativeCount;
    		built.strainZeroAlleleReferenceCount = strainZeroAlleleReferenceCount;
    		built.strain6Allele = strain6Allele;
    		built.strain6AlleleFixed = strain6AlleleFixed;
    		built.strain6AlleleRatio = strain6AlleleRatio;
    		built.strain6AlleleAlternativeCount = strain6AlleleAlternativeCount;
    		built.strain6AlleleReferenceCount = strain6AlleleReferenceCount;
    		built.strainCAllele = strainCAllele;
    		built.strainCAlleleFixed = strainCAlleleFixed;
    		built.strainCAlleleRatio = strainCAlleleRatio;
    		built.strainCAlleleAlternativeCount = strainCAlleleAlternativeCount;
    		built.strainCAlleleReferenceCount = strainCAlleleReferenceCount;
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
        snpchromosomeZ.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosomeZ.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosomeZ.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosomeZ.setStrainPAllele(this.getStrainPAllele());
        snpchromosomeZ.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosomeZ.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosomeZ.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosomeZ.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosomeZ.setStrainWAllele(this.getStrainWAllele());
        snpchromosomeZ.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosomeZ.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosomeZ.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosomeZ.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosomeZ.setStrainNAllele(this.getStrainNAllele());
        snpchromosomeZ.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosomeZ.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosomeZ.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosomeZ.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosomeZ.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosomeZ.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosomeZ.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosomeZ.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosomeZ.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosomeZ.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosomeZ.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosomeZ.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosomeZ.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosomeZ.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosomeZ.setStrain6Allele(this.getStrain6Allele());
        snpchromosomeZ.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosomeZ.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosomeZ.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosomeZ.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosomeZ.setStrainCAllele(this.getStrainCAllele());
        snpchromosomeZ.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosomeZ.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosomeZ.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosomeZ.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosomeW.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosomeW.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosomeW.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosomeW.setStrainPAllele(this.getStrainPAllele());
        snpchromosomeW.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosomeW.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosomeW.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosomeW.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosomeW.setStrainWAllele(this.getStrainWAllele());
        snpchromosomeW.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosomeW.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosomeW.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosomeW.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosomeW.setStrainNAllele(this.getStrainNAllele());
        snpchromosomeW.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosomeW.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosomeW.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosomeW.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosomeW.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosomeW.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosomeW.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosomeW.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosomeW.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosomeW.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosomeW.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosomeW.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosomeW.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosomeW.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosomeW.setStrain6Allele(this.getStrain6Allele());
        snpchromosomeW.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosomeW.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosomeW.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosomeW.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosomeW.setStrainCAllele(this.getStrainCAllele());
        snpchromosomeW.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosomeW.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosomeW.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosomeW.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosomeLGE64.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosomeLGE64.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosomeLGE64.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosomeLGE64.setStrainPAllele(this.getStrainPAllele());
        snpchromosomeLGE64.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosomeLGE64.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosomeLGE64.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosomeLGE64.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosomeLGE64.setStrainWAllele(this.getStrainWAllele());
        snpchromosomeLGE64.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosomeLGE64.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosomeLGE64.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosomeLGE64.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosomeLGE64.setStrainNAllele(this.getStrainNAllele());
        snpchromosomeLGE64.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosomeLGE64.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosomeLGE64.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosomeLGE64.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosomeLGE64.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosomeLGE64.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosomeLGE64.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosomeLGE64.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosomeLGE64.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosomeLGE64.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosomeLGE64.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosomeLGE64.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosomeLGE64.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosomeLGE64.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosomeLGE64.setStrain6Allele(this.getStrain6Allele());
        snpchromosomeLGE64.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosomeLGE64.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosomeLGE64.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosomeLGE64.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosomeLGE64.setStrainCAllele(this.getStrainCAllele());
        snpchromosomeLGE64.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosomeLGE64.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosomeLGE64.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosomeLGE64.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosomeLGE22C19W28_E50C23.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosomeLGE22C19W28_E50C23.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosomeLGE22C19W28_E50C23.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosomeLGE22C19W28_E50C23.setStrainPAllele(this.getStrainPAllele());
        snpchromosomeLGE22C19W28_E50C23.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosomeLGE22C19W28_E50C23.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosomeLGE22C19W28_E50C23.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosomeLGE22C19W28_E50C23.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosomeLGE22C19W28_E50C23.setStrainWAllele(this.getStrainWAllele());
        snpchromosomeLGE22C19W28_E50C23.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosomeLGE22C19W28_E50C23.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosomeLGE22C19W28_E50C23.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosomeLGE22C19W28_E50C23.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosomeLGE22C19W28_E50C23.setStrainNAllele(this.getStrainNAllele());
        snpchromosomeLGE22C19W28_E50C23.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosomeLGE22C19W28_E50C23.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosomeLGE22C19W28_E50C23.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosomeLGE22C19W28_E50C23.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosomeLGE22C19W28_E50C23.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosomeLGE22C19W28_E50C23.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosomeLGE22C19W28_E50C23.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosomeLGE22C19W28_E50C23.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosomeLGE22C19W28_E50C23.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosomeLGE22C19W28_E50C23.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosomeLGE22C19W28_E50C23.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosomeLGE22C19W28_E50C23.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosomeLGE22C19W28_E50C23.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosomeLGE22C19W28_E50C23.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosomeLGE22C19W28_E50C23.setStrain6Allele(this.getStrain6Allele());
        snpchromosomeLGE22C19W28_E50C23.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosomeLGE22C19W28_E50C23.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosomeLGE22C19W28_E50C23.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosomeLGE22C19W28_E50C23.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosomeLGE22C19W28_E50C23.setStrainCAllele(this.getStrainCAllele());
        snpchromosomeLGE22C19W28_E50C23.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosomeLGE22C19W28_E50C23.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosomeLGE22C19W28_E50C23.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosomeLGE22C19W28_E50C23.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome32.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome32.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome32.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome32.setStrainPAllele(this.getStrainPAllele());
        snpchromosome32.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome32.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome32.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome32.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome32.setStrainWAllele(this.getStrainWAllele());
        snpchromosome32.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome32.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome32.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome32.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome32.setStrainNAllele(this.getStrainNAllele());
        snpchromosome32.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome32.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome32.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome32.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome32.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome32.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome32.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome32.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome32.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome32.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome32.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome32.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome32.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome32.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome32.setStrain6Allele(this.getStrain6Allele());
        snpchromosome32.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome32.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome32.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome32.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome32.setStrainCAllele(this.getStrainCAllele());
        snpchromosome32.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome32.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome32.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome32.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome28.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome28.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome28.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome28.setStrainPAllele(this.getStrainPAllele());
        snpchromosome28.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome28.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome28.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome28.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome28.setStrainWAllele(this.getStrainWAllele());
        snpchromosome28.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome28.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome28.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome28.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome28.setStrainNAllele(this.getStrainNAllele());
        snpchromosome28.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome28.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome28.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome28.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome28.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome28.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome28.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome28.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome28.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome28.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome28.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome28.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome28.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome28.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome28.setStrain6Allele(this.getStrain6Allele());
        snpchromosome28.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome28.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome28.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome28.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome28.setStrainCAllele(this.getStrainCAllele());
        snpchromosome28.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome28.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome28.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome28.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome27.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome27.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome27.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome27.setStrainPAllele(this.getStrainPAllele());
        snpchromosome27.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome27.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome27.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome27.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome27.setStrainWAllele(this.getStrainWAllele());
        snpchromosome27.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome27.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome27.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome27.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome27.setStrainNAllele(this.getStrainNAllele());
        snpchromosome27.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome27.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome27.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome27.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome27.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome27.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome27.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome27.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome27.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome27.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome27.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome27.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome27.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome27.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome27.setStrain6Allele(this.getStrain6Allele());
        snpchromosome27.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome27.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome27.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome27.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome27.setStrainCAllele(this.getStrainCAllele());
        snpchromosome27.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome27.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome27.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome27.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome26.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome26.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome26.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome26.setStrainPAllele(this.getStrainPAllele());
        snpchromosome26.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome26.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome26.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome26.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome26.setStrainWAllele(this.getStrainWAllele());
        snpchromosome26.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome26.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome26.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome26.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome26.setStrainNAllele(this.getStrainNAllele());
        snpchromosome26.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome26.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome26.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome26.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome26.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome26.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome26.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome26.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome26.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome26.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome26.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome26.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome26.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome26.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome26.setStrain6Allele(this.getStrain6Allele());
        snpchromosome26.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome26.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome26.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome26.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome26.setStrainCAllele(this.getStrainCAllele());
        snpchromosome26.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome26.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome26.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome26.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome25.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome25.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome25.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome25.setStrainPAllele(this.getStrainPAllele());
        snpchromosome25.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome25.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome25.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome25.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome25.setStrainWAllele(this.getStrainWAllele());
        snpchromosome25.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome25.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome25.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome25.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome25.setStrainNAllele(this.getStrainNAllele());
        snpchromosome25.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome25.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome25.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome25.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome25.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome25.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome25.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome25.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome25.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome25.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome25.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome25.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome25.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome25.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome25.setStrain6Allele(this.getStrain6Allele());
        snpchromosome25.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome25.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome25.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome25.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome25.setStrainCAllele(this.getStrainCAllele());
        snpchromosome25.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome25.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome25.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome25.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome24.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome24.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome24.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome24.setStrainPAllele(this.getStrainPAllele());
        snpchromosome24.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome24.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome24.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome24.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome24.setStrainWAllele(this.getStrainWAllele());
        snpchromosome24.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome24.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome24.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome24.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome24.setStrainNAllele(this.getStrainNAllele());
        snpchromosome24.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome24.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome24.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome24.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome24.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome24.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome24.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome24.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome24.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome24.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome24.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome24.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome24.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome24.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome24.setStrain6Allele(this.getStrain6Allele());
        snpchromosome24.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome24.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome24.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome24.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome24.setStrainCAllele(this.getStrainCAllele());
        snpchromosome24.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome24.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome24.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome24.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome23.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome23.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome23.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome23.setStrainPAllele(this.getStrainPAllele());
        snpchromosome23.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome23.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome23.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome23.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome23.setStrainWAllele(this.getStrainWAllele());
        snpchromosome23.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome23.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome23.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome23.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome23.setStrainNAllele(this.getStrainNAllele());
        snpchromosome23.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome23.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome23.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome23.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome23.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome23.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome23.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome23.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome23.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome23.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome23.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome23.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome23.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome23.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome23.setStrain6Allele(this.getStrain6Allele());
        snpchromosome23.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome23.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome23.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome23.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome23.setStrainCAllele(this.getStrainCAllele());
        snpchromosome23.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome23.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome23.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome23.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome22.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome22.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome22.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome22.setStrainPAllele(this.getStrainPAllele());
        snpchromosome22.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome22.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome22.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome22.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome22.setStrainWAllele(this.getStrainWAllele());
        snpchromosome22.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome22.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome22.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome22.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome22.setStrainNAllele(this.getStrainNAllele());
        snpchromosome22.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome22.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome22.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome22.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome22.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome22.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome22.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome22.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome22.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome22.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome22.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome22.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome22.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome22.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome22.setStrain6Allele(this.getStrain6Allele());
        snpchromosome22.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome22.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome22.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome22.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome22.setStrainCAllele(this.getStrainCAllele());
        snpchromosome22.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome22.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome22.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome22.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome21.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome21.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome21.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome21.setStrainPAllele(this.getStrainPAllele());
        snpchromosome21.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome21.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome21.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome21.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome21.setStrainWAllele(this.getStrainWAllele());
        snpchromosome21.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome21.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome21.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome21.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome21.setStrainNAllele(this.getStrainNAllele());
        snpchromosome21.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome21.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome21.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome21.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome21.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome21.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome21.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome21.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome21.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome21.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome21.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome21.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome21.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome21.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome21.setStrain6Allele(this.getStrain6Allele());
        snpchromosome21.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome21.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome21.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome21.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome21.setStrainCAllele(this.getStrainCAllele());
        snpchromosome21.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome21.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome21.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome21.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome20.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome20.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome20.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome20.setStrainPAllele(this.getStrainPAllele());
        snpchromosome20.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome20.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome20.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome20.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome20.setStrainWAllele(this.getStrainWAllele());
        snpchromosome20.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome20.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome20.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome20.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome20.setStrainNAllele(this.getStrainNAllele());
        snpchromosome20.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome20.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome20.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome20.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome20.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome20.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome20.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome20.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome20.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome20.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome20.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome20.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome20.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome20.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome20.setStrain6Allele(this.getStrain6Allele());
        snpchromosome20.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome20.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome20.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome20.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome20.setStrainCAllele(this.getStrainCAllele());
        snpchromosome20.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome20.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome20.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome20.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome19.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome19.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome19.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome19.setStrainPAllele(this.getStrainPAllele());
        snpchromosome19.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome19.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome19.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome19.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome19.setStrainWAllele(this.getStrainWAllele());
        snpchromosome19.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome19.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome19.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome19.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome19.setStrainNAllele(this.getStrainNAllele());
        snpchromosome19.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome19.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome19.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome19.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome19.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome19.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome19.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome19.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome19.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome19.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome19.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome19.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome19.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome19.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome19.setStrain6Allele(this.getStrain6Allele());
        snpchromosome19.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome19.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome19.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome19.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome19.setStrainCAllele(this.getStrainCAllele());
        snpchromosome19.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome19.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome19.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome19.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome18.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome18.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome18.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome18.setStrainPAllele(this.getStrainPAllele());
        snpchromosome18.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome18.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome18.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome18.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome18.setStrainWAllele(this.getStrainWAllele());
        snpchromosome18.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome18.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome18.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome18.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome18.setStrainNAllele(this.getStrainNAllele());
        snpchromosome18.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome18.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome18.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome18.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome18.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome18.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome18.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome18.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome18.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome18.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome18.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome18.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome18.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome18.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome18.setStrain6Allele(this.getStrain6Allele());
        snpchromosome18.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome18.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome18.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome18.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome18.setStrainCAllele(this.getStrainCAllele());
        snpchromosome18.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome18.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome18.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome18.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome17.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome17.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome17.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome17.setStrainPAllele(this.getStrainPAllele());
        snpchromosome17.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome17.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome17.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome17.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome17.setStrainWAllele(this.getStrainWAllele());
        snpchromosome17.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome17.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome17.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome17.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome17.setStrainNAllele(this.getStrainNAllele());
        snpchromosome17.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome17.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome17.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome17.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome17.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome17.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome17.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome17.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome17.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome17.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome17.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome17.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome17.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome17.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome17.setStrain6Allele(this.getStrain6Allele());
        snpchromosome17.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome17.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome17.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome17.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome17.setStrainCAllele(this.getStrainCAllele());
        snpchromosome17.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome17.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome17.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome17.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome16.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome16.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome16.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome16.setStrainPAllele(this.getStrainPAllele());
        snpchromosome16.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome16.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome16.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome16.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome16.setStrainWAllele(this.getStrainWAllele());
        snpchromosome16.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome16.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome16.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome16.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome16.setStrainNAllele(this.getStrainNAllele());
        snpchromosome16.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome16.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome16.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome16.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome16.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome16.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome16.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome16.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome16.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome16.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome16.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome16.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome16.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome16.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome16.setStrain6Allele(this.getStrain6Allele());
        snpchromosome16.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome16.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome16.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome16.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome16.setStrainCAllele(this.getStrainCAllele());
        snpchromosome16.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome16.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome16.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome16.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome15.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome15.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome15.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome15.setStrainPAllele(this.getStrainPAllele());
        snpchromosome15.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome15.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome15.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome15.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome15.setStrainWAllele(this.getStrainWAllele());
        snpchromosome15.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome15.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome15.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome15.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome15.setStrainNAllele(this.getStrainNAllele());
        snpchromosome15.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome15.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome15.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome15.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome15.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome15.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome15.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome15.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome15.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome15.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome15.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome15.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome15.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome15.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome15.setStrain6Allele(this.getStrain6Allele());
        snpchromosome15.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome15.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome15.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome15.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome15.setStrainCAllele(this.getStrainCAllele());
        snpchromosome15.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome15.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome15.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome15.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome14.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome14.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome14.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome14.setStrainPAllele(this.getStrainPAllele());
        snpchromosome14.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome14.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome14.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome14.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome14.setStrainWAllele(this.getStrainWAllele());
        snpchromosome14.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome14.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome14.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome14.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome14.setStrainNAllele(this.getStrainNAllele());
        snpchromosome14.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome14.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome14.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome14.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome14.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome14.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome14.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome14.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome14.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome14.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome14.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome14.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome14.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome14.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome14.setStrain6Allele(this.getStrain6Allele());
        snpchromosome14.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome14.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome14.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome14.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome14.setStrainCAllele(this.getStrainCAllele());
        snpchromosome14.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome14.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome14.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome14.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome13.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome13.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome13.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome13.setStrainPAllele(this.getStrainPAllele());
        snpchromosome13.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome13.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome13.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome13.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome13.setStrainWAllele(this.getStrainWAllele());
        snpchromosome13.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome13.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome13.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome13.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome13.setStrainNAllele(this.getStrainNAllele());
        snpchromosome13.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome13.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome13.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome13.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome13.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome13.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome13.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome13.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome13.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome13.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome13.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome13.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome13.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome13.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome13.setStrain6Allele(this.getStrain6Allele());
        snpchromosome13.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome13.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome13.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome13.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome13.setStrainCAllele(this.getStrainCAllele());
        snpchromosome13.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome13.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome13.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome13.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome12.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome12.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome12.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome12.setStrainPAllele(this.getStrainPAllele());
        snpchromosome12.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome12.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome12.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome12.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome12.setStrainWAllele(this.getStrainWAllele());
        snpchromosome12.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome12.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome12.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome12.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome12.setStrainNAllele(this.getStrainNAllele());
        snpchromosome12.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome12.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome12.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome12.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome12.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome12.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome12.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome12.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome12.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome12.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome12.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome12.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome12.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome12.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome12.setStrain6Allele(this.getStrain6Allele());
        snpchromosome12.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome12.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome12.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome12.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome12.setStrainCAllele(this.getStrainCAllele());
        snpchromosome12.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome12.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome12.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome12.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome11.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome11.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome11.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome11.setStrainPAllele(this.getStrainPAllele());
        snpchromosome11.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome11.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome11.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome11.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome11.setStrainWAllele(this.getStrainWAllele());
        snpchromosome11.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome11.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome11.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome11.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome11.setStrainNAllele(this.getStrainNAllele());
        snpchromosome11.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome11.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome11.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome11.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome11.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome11.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome11.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome11.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome11.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome11.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome11.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome11.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome11.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome11.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome11.setStrain6Allele(this.getStrain6Allele());
        snpchromosome11.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome11.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome11.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome11.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome11.setStrainCAllele(this.getStrainCAllele());
        snpchromosome11.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome11.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome11.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome11.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome10.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome10.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome10.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome10.setStrainPAllele(this.getStrainPAllele());
        snpchromosome10.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome10.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome10.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome10.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome10.setStrainWAllele(this.getStrainWAllele());
        snpchromosome10.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome10.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome10.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome10.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome10.setStrainNAllele(this.getStrainNAllele());
        snpchromosome10.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome10.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome10.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome10.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome10.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome10.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome10.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome10.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome10.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome10.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome10.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome10.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome10.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome10.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome10.setStrain6Allele(this.getStrain6Allele());
        snpchromosome10.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome10.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome10.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome10.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome10.setStrainCAllele(this.getStrainCAllele());
        snpchromosome10.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome10.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome10.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome10.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome9.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome9.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome9.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome9.setStrainPAllele(this.getStrainPAllele());
        snpchromosome9.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome9.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome9.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome9.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome9.setStrainWAllele(this.getStrainWAllele());
        snpchromosome9.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome9.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome9.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome9.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome9.setStrainNAllele(this.getStrainNAllele());
        snpchromosome9.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome9.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome9.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome9.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome9.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome9.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome9.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome9.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome9.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome9.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome9.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome9.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome9.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome9.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome9.setStrain6Allele(this.getStrain6Allele());
        snpchromosome9.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome9.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome9.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome9.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome9.setStrainCAllele(this.getStrainCAllele());
        snpchromosome9.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome9.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome9.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome9.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome8.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome8.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome8.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome8.setStrainPAllele(this.getStrainPAllele());
        snpchromosome8.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome8.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome8.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome8.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome8.setStrainWAllele(this.getStrainWAllele());
        snpchromosome8.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome8.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome8.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome8.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome8.setStrainNAllele(this.getStrainNAllele());
        snpchromosome8.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome8.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome8.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome8.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome8.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome8.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome8.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome8.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome8.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome8.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome8.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome8.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome8.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome8.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome8.setStrain6Allele(this.getStrain6Allele());
        snpchromosome8.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome8.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome8.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome8.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome8.setStrainCAllele(this.getStrainCAllele());
        snpchromosome8.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome8.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome8.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome8.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome7.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome7.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome7.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome7.setStrainPAllele(this.getStrainPAllele());
        snpchromosome7.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome7.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome7.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome7.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome7.setStrainWAllele(this.getStrainWAllele());
        snpchromosome7.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome7.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome7.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome7.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome7.setStrainNAllele(this.getStrainNAllele());
        snpchromosome7.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome7.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome7.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome7.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome7.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome7.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome7.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome7.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome7.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome7.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome7.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome7.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome7.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome7.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome7.setStrain6Allele(this.getStrain6Allele());
        snpchromosome7.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome7.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome7.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome7.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome7.setStrainCAllele(this.getStrainCAllele());
        snpchromosome7.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome7.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome7.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome7.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome6.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome6.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome6.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome6.setStrainPAllele(this.getStrainPAllele());
        snpchromosome6.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome6.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome6.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome6.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome6.setStrainWAllele(this.getStrainWAllele());
        snpchromosome6.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome6.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome6.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome6.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome6.setStrainNAllele(this.getStrainNAllele());
        snpchromosome6.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome6.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome6.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome6.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome6.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome6.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome6.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome6.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome6.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome6.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome6.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome6.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome6.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome6.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome6.setStrain6Allele(this.getStrain6Allele());
        snpchromosome6.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome6.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome6.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome6.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome6.setStrainCAllele(this.getStrainCAllele());
        snpchromosome6.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome6.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome6.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome6.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome5.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome5.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome5.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome5.setStrainPAllele(this.getStrainPAllele());
        snpchromosome5.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome5.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome5.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome5.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome5.setStrainWAllele(this.getStrainWAllele());
        snpchromosome5.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome5.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome5.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome5.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome5.setStrainNAllele(this.getStrainNAllele());
        snpchromosome5.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome5.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome5.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome5.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome5.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome5.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome5.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome5.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome5.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome5.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome5.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome5.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome5.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome5.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome5.setStrain6Allele(this.getStrain6Allele());
        snpchromosome5.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome5.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome5.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome5.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome5.setStrainCAllele(this.getStrainCAllele());
        snpchromosome5.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome5.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome5.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome5.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome4.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome4.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome4.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome4.setStrainPAllele(this.getStrainPAllele());
        snpchromosome4.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome4.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome4.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome4.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome4.setStrainWAllele(this.getStrainWAllele());
        snpchromosome4.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome4.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome4.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome4.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome4.setStrainNAllele(this.getStrainNAllele());
        snpchromosome4.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome4.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome4.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome4.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome4.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome4.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome4.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome4.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome4.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome4.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome4.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome4.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome4.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome4.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome4.setStrain6Allele(this.getStrain6Allele());
        snpchromosome4.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome4.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome4.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome4.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome4.setStrainCAllele(this.getStrainCAllele());
        snpchromosome4.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome4.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome4.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome4.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
        snpchromosome3.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome3.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome3.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome3.setStrainPAllele(this.getStrainPAllele());
        snpchromosome3.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome3.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome3.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome3.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome3.setStrainWAllele(this.getStrainWAllele());
        snpchromosome3.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome3.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome3.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome3.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome3.setStrainNAllele(this.getStrainNAllele());
        snpchromosome3.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome3.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome3.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome3.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome3.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome3.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome3.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome3.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome3.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome3.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome3.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome3.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome3.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome3.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome3.setStrain6Allele(this.getStrain6Allele());
        snpchromosome3.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome3.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome3.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome3.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome3.setStrainCAllele(this.getStrainCAllele());
        snpchromosome3.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome3.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome3.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome3.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
        snpchromosome3.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome3.setPredictionCategory(this.getPredictionCategory());
        snpchromosome3.setScoreSift(this.getScoreSift());
        snpchromosome3.setScoreConservation(this.getScoreConservation());
        snpchromosome3.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome3.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome3.setScoreProvean(this.getScoreProvean());

    	return snpchromosome3;
    }

    public SNPChromosome02 convertTo2() {
    	
    	SNPChromosome02 snpchromosome2 = new SNPChromosome02();
    	
        snpchromosome2.setSnpId(this.getSnpId());
        snpchromosome2.setChromosomeId(this.getChromosomeId());
        snpchromosome2.setPosition(this.getPosition());
        snpchromosome2.setReference(this.getReference());
        snpchromosome2.setAlternative(this.getAlternative());
        snpchromosome2.setRegion(this.getRegion());
        snpchromosome2.setEnsemblGene(this.getEnsemblGene());
        snpchromosome2.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome2.setEnsemblAnnotation(this.getEnsemblAnnotation());
        snpchromosome2.setStrain7Allele(this.getStrain7Allele());
        snpchromosome2.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome2.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome2.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome2.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome2.setStrainPAllele(this.getStrainPAllele());
        snpchromosome2.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome2.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome2.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome2.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome2.setStrainWAllele(this.getStrainWAllele());
        snpchromosome2.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome2.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome2.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome2.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome2.setStrainNAllele(this.getStrainNAllele());
        snpchromosome2.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome2.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome2.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome2.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome2.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome2.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome2.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome2.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome2.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome2.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome2.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome2.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome2.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome2.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome2.setStrain6Allele(this.getStrain6Allele());
        snpchromosome2.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome2.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome2.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome2.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome2.setStrainCAllele(this.getStrainCAllele());
        snpchromosome2.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome2.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome2.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome2.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
        snpchromosome2.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome2.setPredictionCategory(this.getPredictionCategory());
        snpchromosome2.setScoreSift(this.getScoreSift());
        snpchromosome2.setScoreConservation(this.getScoreConservation());
        snpchromosome2.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome2.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome2.setScoreProvean(this.getScoreProvean());

    	return snpchromosome2;
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
        snpchromosome1.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome1.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome1.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());
        snpchromosome1.setStrainPAllele(this.getStrainPAllele());
        snpchromosome1.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome1.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome1.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome1.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());
        snpchromosome1.setStrainWAllele(this.getStrainWAllele());
        snpchromosome1.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome1.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome1.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome1.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());
        snpchromosome1.setStrainNAllele(this.getStrainNAllele());
        snpchromosome1.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome1.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome1.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome1.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());
        snpchromosome1.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome1.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome1.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome1.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome1.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());
        snpchromosome1.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome1.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome1.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome1.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome1.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());
        snpchromosome1.setStrain6Allele(this.getStrain6Allele());
        snpchromosome1.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome1.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome1.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome1.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());
        snpchromosome1.setStrainCAllele(this.getStrainCAllele());
        snpchromosome1.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome1.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome1.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome1.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());
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
