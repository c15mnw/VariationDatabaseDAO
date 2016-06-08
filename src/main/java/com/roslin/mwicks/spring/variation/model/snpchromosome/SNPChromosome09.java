package com.roslin.mwicks.spring.variation.model.snpchromosome;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

import java.util.Date;

import com.roslin.mwicks.spring.variation.format.CustomDateToStringStyle;
import com.roslin.mwicks.utility.ObjectConverter;

/**
 * An entity class which contains the information of a single SNPChromosome09 Table Row.
 * @author Mike Wicks
 */
@Entity
@Table(name = "VSC_SNP_CHROMOSOME_09")
@Transactional

public class SNPChromosome09 {
    
    // Constants ----------------------------------------------------------------------------------
	protected static final String STRING_NA = "N/A";
	protected static final String STRING_FIXED = "Fixed";
	protected static final String STRING_NOT_FIXED = "Not Fixed";
	protected static final String STRING_REFERENCE = "Ref.";

	protected static final String STRING_TOLERATED = "TOLERATED";
	protected static final String STRING_DELETERIOUS = "DELETERIOUS";
	

	// Properties ---------------------------------------------------------------------------------
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "VSS_OID", nullable = false)
    private Long oid;
    
    @Column(name = "VSS_SNP_ID", nullable = false)
    private String snpId;
    
    @Column(name = "VSS_CHROMOSOME_ID", nullable = false)
    private String chromosomeId;
    
    @Column(name = "VSS_POSITION", nullable = false)
    private int position;
    
    @Column(name = "VSS_REFERENCE", nullable = false)
    private String reference;    
    
    @Column(name = "VSS_ALTERNATIVE", nullable = false)
    private String alternative;
    
    @Column(name = "VSS_REGION", nullable = false)
    private String region;
    
    @Column(name = "VSS_ENSEMBL_GENE", nullable = false)
    private String ensemblGene;
    
    @Column(name = "VSS_ENSEMBL_TRANSCRIPT", nullable = false)
    private String ensemblTranscript;
    
    @Column(name = "VSS_ENSEMBL_ANNOTATION", nullable = false)
    private String ensemblAnnotation;
    
    @Column(name = "VSS_STRAIN_7_ALTERNATIVE_ALLELE", nullable = false)
    private String strain7Allele;
    
    @Column(name = "VSS_STRAIN_7_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private String strain7AlleleFixed;
    
    @Column(name = "VSS_STRAIN_7_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private double strain7AlleleRatio;
    
    @Column(name = "VSS_STRAIN_7_ALTERNATIVE_ALLELE_ALTERNATIVE_COUNT", nullable = false)
    private long strain7AlleleAlternativeCount;
    
    @Column(name = "VSS_STRAIN_7_ALTERNATIVE_ALLELE_REFERENCE_COUNT", nullable = false)
    private long strain7AlleleReferenceCount;
    
    @Column(name = "VSS_STRAIN_P_ALTERNATIVE_ALLELE", nullable = false)
    private String strainPAllele;
    
    @Column(name = "VSS_STRAIN_P_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private String strainPAlleleFixed;
    
    @Column(name = "VSS_STRAIN_P_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private double strainPAlleleRatio;
    
    @Column(name = "VSS_STRAIN_P_ALTERNATIVE_ALLELE_ALTERNATIVE_COUNT", nullable = false)
    private long strainPAlleleAlternativeCount;
    
    @Column(name = "VSS_STRAIN_P_ALTERNATIVE_ALLELE_REFERENCE_COUNT", nullable = false)
    private long strainPAlleleReferenceCount;
    
    @Column(name = "VSS_STRAIN_W_ALTERNATIVE_ALLELE", nullable = false)
    private String strainWAllele;
    
    @Column(name = "VSS_STRAIN_W_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private String strainWAlleleFixed;
    
    @Column(name = "VSS_STRAIN_W_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private double strainWAlleleRatio;
    
    @Column(name = "VSS_STRAIN_W_ALTERNATIVE_ALLELE_ALTERNATIVE_COUNT", nullable = false)
    private long strainWAlleleAlternativeCount;
    
    @Column(name = "VSS_STRAIN_W_ALTERNATIVE_ALLELE_REFERENCE_COUNT", nullable = false)
    private long strainWAlleleReferenceCount;
    
    @Column(name = "VSS_STRAIN_N_ALTERNATIVE_ALLELE", nullable = false)
    private String strainNAllele;
    
    @Column(name = "VSS_STRAIN_N_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private String strainNAlleleFixed;
    
    @Column(name = "VSS_STRAIN_N_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private double strainNAlleleRatio;
    
    @Column(name = "VSS_STRAIN_N_ALTERNATIVE_ALLELE_ALTERNATIVE_COUNT", nullable = false)
    private long strainNAlleleAlternativeCount;
    
    @Column(name = "VSS_STRAIN_N_ALTERNATIVE_ALLELE_REFERENCE_COUNT", nullable = false)
    private long strainNAlleleReferenceCount;
    
    @Column(name = "VSS_STRAIN_15I_ALTERNATIVE_ALLELE", nullable = false)
    private String strain15IAllele;
    
    @Column(name = "VSS_STRAIN_15I_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private String strain15IAlleleFixed;
    
    @Column(name = "VSS_STRAIN_15I_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private double strain15IAlleleRatio;
    
    @Column(name = "VSS_STRAIN_15I_ALTERNATIVE_ALLELE_ALTERNATIVE_COUNT", nullable = false)
    private long strain15IAlleleAlternativeCount;
    
    @Column(name = "VSS_STRAIN_15I_ALTERNATIVE_ALLELE_REFERENCE_COUNT", nullable = false)
    private long strain15IAlleleReferenceCount;
    
    @Column(name = "VSS_STRAIN_ZERO_ALTERNATIVE_ALLELE", nullable = false)
    private String strainZeroAllele;
    
    @Column(name = "VSS_STRAIN_ZERO_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private String strainZeroAlleleFixed;
    
    @Column(name = "VSS_STRAIN_ZERO_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private double strainZeroAlleleRatio;
    
    @Column(name = "VSS_STRAIN_ZERO_ALTERNATIVE_ALLELE_ALTERNATIVE_COUNT", nullable = false)
    private long strainZeroAlleleAlternativeCount;
    
    @Column(name = "VSS_STRAIN_ZERO_ALTERNATIVE_ALLELE_REFERENCE_COUNT", nullable = false)
    private long strainZeroAlleleReferenceCount;
    
    @Column(name = "VSS_STRAIN_6_ALTERNATIVE_ALLELE", nullable = false)
    private String strain6Allele;
    
    @Column(name = "VSS_STRAIN_6_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private String strain6AlleleFixed;
    
    @Column(name = "VSS_STRAIN_6_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private double strain6AlleleRatio;
    
    @Column(name = "VSS_STRAIN_6_ALTERNATIVE_ALLELE_ALTERNATIVE_COUNT", nullable = false)
    private long strain6AlleleAlternativeCount;
    
    @Column(name = "VSS_STRAIN_6_ALTERNATIVE_ALLELE_REFERENCE_COUNT", nullable = false)
    private long strain6AlleleReferenceCount;
    
    @Column(name = "VSS_STRAIN_C_ALTERNATIVE_ALLELE", nullable = false)
    private String strainCAllele;
    
    @Column(name = "VSS_STRAIN_C_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private String strainCAlleleFixed;
    
    @Column(name = "VSS_STRAIN_C_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private double strainCAlleleRatio;
    
    @Column(name = "VSS_STRAIN_C_ALTERNATIVE_ALLELE_ALTERNATIVE_COUNT", nullable = false)
    private long strainCAlleleAlternativeCount;
    
    @Column(name = "VSS_STRAIN_C_ALTERNATIVE_ALLELE_REFERENCE_COUNT", nullable = false)
    private long strainCAlleleReferenceCount;
    
    @Column(name = "VSS_AMINO_ACID_SUBSITUTION", nullable = false)
    private String aminoAcidSubs;

    @Column(name = "VSS_PREDICTION_CATEGORY", nullable = false)
    private String predictionCategory;
    
    @Column(name = "VSS_SIFT_SCORE", nullable = false)
    private double scoreSift;
    
    @Column(name = "VSS_SIFT_SCORE_CONSERVATION", nullable = false)
    private double scoreConservation;
    
    @Column(name = "VSS_PROTEIN_ALIGNMENT_NUMBER", nullable = false)
    private long proteinAlignNumber;
    
    @Column(name = "VSS_TOTAL_SEQUENCE_ALIGNMENT_NUMBER", nullable = false)
    private long totalAlignSequenceNumber;

    @Column(name = "VSS_PROVEAN_SCORE", nullable = false)
    private double scoreProvean;

    @Column(name = "VSS_CREATION_TIME", nullable = false)
    private Date creationTime;
    
    @Column(name = "VSS_MODIFICATION_TIME", nullable = true)
    private Date modificationTime;
    
    @Version
    @Column(name = "VSS_VERSION", nullable = false)
    private long version;
    

    // Getters ------------------------------------------------------------------------------------
    public Long getOid() {
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
    	return this.strainWAlleleAlternativeCount	;
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
    	this.strainWAlleleAlternativeCount	= strainWAlleleAlternativeCount;
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

    
    // Getters As Strings -------------------------------------------------------------------------
    public String getOidAsString() {
    	return ObjectConverter.convert(this.oid, String.class);
    }
    public String getPositionAsString() {
    	return ObjectConverter.convert(this.position, String.class);
    }
    public String getScoreSiftAsString() {
    	return ObjectConverter.convert(this.scoreSift, String.class);
    }
    public String getScoreConservationAsString() {
    	return ObjectConverter.convert(this.scoreConservation, String.class);
    }
    public String getProteinAlignNumberAsString() {
    	return ObjectConverter.convert(this.proteinAlignNumber, String.class);
    }
    public String getTotalAlignSequenceNumberAsString() {
    	return ObjectConverter.convert(this.totalAlignSequenceNumber, String.class);
    }
    public String getScoreProveanAsString() {
    	return ObjectConverter.convert(this.scoreProvean, String.class);
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
    	return ObjectConverter.convert(strain7AlleleRatio, String.class);
    }
    public String getStrainPAlleleRatioAsString() {
    	return ObjectConverter.convert(strainPAlleleRatio, String.class);
    }
    public String getStrainWAlleleRatioAsString() {
    	return ObjectConverter.convert(strainWAlleleRatio, String.class);
    }
    public String getStrainNAlleleRatioAsString() {
    	return ObjectConverter.convert(strainNAlleleRatio, String.class);
    }
    public String getStrain15IAlleleRatioAsString() {
    	return ObjectConverter.convert(strain15IAlleleRatio, String.class);
    }
    public String getStrainZeroAlleleRatioAsString() {
    	return ObjectConverter.convert(strainZeroAlleleRatio, String.class);
    }
    public String getStrain6AlleleRatioAsString() {
    	return ObjectConverter.convert(strain6AlleleRatio, String.class);
    }
    public String getStrainCAlleleRatioAsString() {
    	return ObjectConverter.convert(strainCAlleleRatio, String.class);
    }
    public String getStrain7AlleleAlternativeCountAsString() {
    	return ObjectConverter.convert(strain7AlleleAlternativeCount, String.class);
    }
    public String getStrainPAlleleAlternativeCountAsString() {
    	return ObjectConverter.convert(strainPAlleleAlternativeCount, String.class);
    }
    public String getStrainWAlleleAlternativeCountAsString() {
    	return ObjectConverter.convert(strainWAlleleAlternativeCount, String.class);
    }
    public String getStrainNAlleleAlternativeCountAsString() {
    	return ObjectConverter.convert(strainNAlleleAlternativeCount, String.class);
    }
    public String getStrain15IAlleleAlternativeCountAsString() {
    	return ObjectConverter.convert(strain15IAlleleAlternativeCount, String.class);
    }
    public String getStrainZeroAlleleAlternativeCountAsString() {
    	return ObjectConverter.convert(strainZeroAlleleAlternativeCount, String.class);
    }
    public String getStrain6AlleleAlternativeCountAsString() {
    	return ObjectConverter.convert(strain6AlleleAlternativeCount, String.class);
    }
    public String getStrainCAlleleAlternativeCountAsString() {
    	return ObjectConverter.convert(strainCAlleleAlternativeCount, String.class);
    }
    public String getStrain7AlleleReferenceCountAsString() {
    	return ObjectConverter.convert(strain7AlleleReferenceCount, String.class);
    }
    public String getStrainPAlleleReferenceCountAsString() {
    	return ObjectConverter.convert(strainPAlleleReferenceCount, String.class);
    }
    public String getStrainWAlleleReferenceCountAsString() {
    	return ObjectConverter.convert(strainWAlleleReferenceCount, String.class);
    }
    public String getStrainNAlleleReferenceCountAsString() {
    	return ObjectConverter.convert(strainNAlleleReferenceCount, String.class);
    }
    public String getStrain15IAlleleReferenceCountAsString() {
    	return ObjectConverter.convert(strain15IAlleleReferenceCount, String.class);
    }
    public String getStrainZeroAlleleReferenceCountAsString() {
    	return ObjectConverter.convert(strainZeroAlleleReferenceCount, String.class);
    }
    public String getStrain6AlleleReferenceCountAsString() {
    	return ObjectConverter.convert(strain6AlleleReferenceCount, String.class);
    }
    public String getStrainCAlleleReferenceCountAsString() {
    	return ObjectConverter.convert(strainCAlleleReferenceCount, String.class);
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
    	return '\"' + ObjectConverter.convert(this.scoreSift, String.class) + '\"';
    }
    public String getScoreConservationAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.scoreConservation, String.class) + '\"';
    }
    public String getProteinAlignNumberAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.proteinAlignNumber, String.class) + '\"';
    }
    public String getTotalAlignSequenceNumberAsStringQuoted() {
    	return '\"' +  ObjectConverter.convert(this.totalAlignSequenceNumber, String.class) + '\"';
    }
    public String getScoreProveanAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.scoreProvean, String.class) + '\"';
    }

    

    // Setters From Strings -----------------------------------------------------------------------
    public void setCreationTimeFromString(String creationTime) {
    	this.creationTime = ObjectConverter.convert(creationTime, Date.class);
    }
    public void setModificationTimeFromString(String modificationTime) {
    	this.modificationTime = ObjectConverter.convert(modificationTime, Date.class);
    }

    
    // Helpers ------------------------------------------------------------------------------------
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

    public String getEnsemblTranscriptMultiLines() {
    	return this.ensemblTranscript.replaceAll(",", ",\n").replaceAll(".", ".\n").replaceAll(":", ":\n").replaceAll(";", ";\n");
    }
    public String getEnsemblAnnotationMultiLines() {
    	return this.ensemblAnnotation.replaceAll(",", ",\n").replaceAll(".", ".\n").replaceAll(":", ":\n").replaceAll(";", ";\n");
    }

    public boolean isStrainZeroAlleleFixed() {
    	if ( this.strainZeroAlleleFixed.equals(STRING_FIXED) ) {
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
    public boolean isStrainZeroAlleleRef() {
    	if ( this.strainZeroAlleleFixed.equals(STRING_REFERENCE) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainZeroAlleleNA() {
    	if ( this.strainZeroAlleleFixed.equals(STRING_NA) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isStrain6AlleleFixed() {
    	if ( this.strain6AlleleFixed.equals(STRING_FIXED) ) {
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
    public boolean isStrain6AlleleRef() {
    	if ( this.strain6AlleleFixed.equals(STRING_REFERENCE) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain6AlleleNA() {
    	if ( this.strain6AlleleFixed.equals(STRING_NA) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isStrainCAlleleFixed() {
    	if ( this.strainCAlleleFixed.equals(STRING_FIXED) ) {
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
    public boolean isStrainCAlleleRef() {
    	if ( this.strainCAlleleFixed.equals(STRING_REFERENCE) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainCAlleleNA() {
    	if ( this.strainCAlleleFixed.equals(STRING_NA) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isStrain7AlleleFixed() {
    	if ( this.strain7AlleleFixed.equals(STRING_FIXED) ) {
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
    public boolean isStrain7AlleleRef() {
    	if ( this.strain7AlleleFixed.equals(STRING_REFERENCE) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain7AlleleNA() {
    	if ( this.strain7AlleleFixed.equals(STRING_NA) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isStrainPAlleleFixed() {
    	if ( this.strainPAlleleFixed.equals(STRING_FIXED) ) {
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
    public boolean isStrainPAlleleRef() {
    	if ( this.strainPAlleleFixed.equals(STRING_REFERENCE) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainPAlleleNA() {
    	if ( this.strainPAlleleFixed.equals(STRING_NA) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isStrainWAlleleFixed() {
    	if ( this.strainWAlleleFixed.equals(STRING_FIXED) ) {
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
    public boolean isStrainWAlleleRef() {
    	if ( this.strainWAlleleFixed.equals(STRING_REFERENCE) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainWAlleleNA() {
    	if ( this.strainWAlleleFixed.equals(STRING_NA) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isStrain15IAlleleFixed() {
    	if ( this.strain15IAlleleFixed.equals(STRING_FIXED) ) {
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
    public boolean isStrain15IAlleleRef() {
    	if ( this.strain15IAlleleFixed.equals(STRING_REFERENCE) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain15IAlleleNA() {
    	if ( this.strain15IAlleleFixed.equals(STRING_NA) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isStrainNAlleleFixed() {
    	if ( this.strainNAlleleFixed.equals(STRING_FIXED) ) {
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
    public boolean isStrainNAlleleRef() {
    	if ( this.strainNAlleleFixed.equals(STRING_REFERENCE) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainNAlleleNA() {
    	if ( this.strainNAlleleFixed.equals(STRING_NA) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    
    public SNPChromosome convert() {
    	
    	SNPChromosome snpchromosome = new SNPChromosome();
    	
        snpchromosome.setSnpId(this.getSnpId());
        snpchromosome.setChromosomeId(this.getChromosomeId());
        snpchromosome.setPosition(this.getPosition());
        snpchromosome.setReference(this.getReference());
        snpchromosome.setAlternative(this.getAlternative());
        snpchromosome.setRegion(this.getRegion());
        snpchromosome.setEnsemblGene(this.getEnsemblGene());
        snpchromosome.setEnsemblTranscript(this.getEnsemblTranscript());
        snpchromosome.setEnsemblAnnotation(this.getEnsemblAnnotation());
        
        snpchromosome.setStrain7Allele(this.getStrain7Allele());
        snpchromosome.setStrain7AlleleFixed(this.getStrain7AlleleFixed());
        snpchromosome.setStrain7AlleleRatio(this.getStrain7AlleleRatio());
        snpchromosome.setStrain7AlleleAlternativeCount(this.getStrain7AlleleAlternativeCount());
        snpchromosome.setStrain7AlleleReferenceCount(this.getStrain7AlleleReferenceCount());

        snpchromosome.setStrainPAllele(this.getStrainPAllele());
        snpchromosome.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome.setStrainPAlleleAlternativeCount(this.getStrainPAlleleAlternativeCount());
        snpchromosome.setStrainPAlleleReferenceCount(this.getStrainPAlleleReferenceCount());

        snpchromosome.setStrainWAllele(this.getStrainWAllele());
        snpchromosome.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome.setStrainWAlleleAlternativeCount(this.getStrainWAlleleAlternativeCount());
        snpchromosome.setStrainWAlleleReferenceCount(this.getStrainWAlleleReferenceCount());

        snpchromosome.setStrainNAllele(this.getStrainNAllele());
        snpchromosome.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome.setStrainNAlleleAlternativeCount(this.getStrainNAlleleAlternativeCount());
        snpchromosome.setStrainNAlleleReferenceCount(this.getStrainNAlleleReferenceCount());

        snpchromosome.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome.setStrain15IAlleleAlternativeCount(this.getStrain15IAlleleAlternativeCount());
        snpchromosome.setStrain15IAlleleReferenceCount(this.getStrain15IAlleleReferenceCount());

        snpchromosome.setStrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome.setStrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome.setStrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome.setStrainZeroAlleleAlternativeCount(this.getStrainZeroAlleleAlternativeCount());
        snpchromosome.setStrainZeroAlleleReferenceCount(this.getStrainZeroAlleleReferenceCount());

        snpchromosome.setStrain6Allele(this.getStrain6Allele());
        snpchromosome.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome.setStrain6AlleleAlternativeCount(this.getStrain6AlleleAlternativeCount());
        snpchromosome.setStrain6AlleleReferenceCount(this.getStrain6AlleleReferenceCount());

        snpchromosome.setStrainCAllele(this.getStrainCAllele());
        snpchromosome.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome.setStrainCAlleleRatio(this.getStrainCAlleleRatio());
        snpchromosome.setStrainCAlleleAlternativeCount(this.getStrainCAlleleAlternativeCount());
        snpchromosome.setStrainCAlleleReferenceCount(this.getStrainCAlleleReferenceCount());

        snpchromosome.setAminoAcidSubs(this.getAminoAcidSubs());
        snpchromosome.setPredictionCategory(this.getPredictionCategory());
        snpchromosome.setScoreSift(this.getScoreSift());
        snpchromosome.setScoreConservation(this.getScoreConservation());
        snpchromosome.setProteinAlignNumber(this.getProteinAlignNumber());
        snpchromosome.setTotalAlignSequenceNumber(this.getTotalAlignSequenceNumber());
        snpchromosome.setScoreProvean(this.getScoreProvean());

    	return snpchromosome;
    }
    
    
    /*
     * Is this Component the same as the Supplied Component?
     */
    public boolean isSameAs(SNPChromosome09 snpchromosome){

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
    	
        return (other instanceof SNPChromosome09) && (oid != null) 
        		? oid.equals(((SNPChromosome09) other).oid) 
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

    // SNPChromosome09 Builder ---------------------------------------------------------------------
    /**
     * Gets a builder which is used to create SNPChromosome09 objects.
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
     * @param strainWAllele For Strain W the Alternative Allele
     * @param strainWAlleleFixed For Strain W is this fixed or not
     * @param strainNAllele For Strain N the Alternative Allele
     * @param strainNAlleleFixed For Strain N is this fixed or not
     * @param strain15IAllele For Strain 15I the Alternative Allele
     * @param strain15IAlleleFixed For Strain 15I is this fixed or not
     * @param strainZeroAllele For Strain ZERO the Alternative Allele
     * @param strainZeroAlleleFixed For Strain ZERO is this fixed or not
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
    
    
    public static Builder getBuilder(SNPChromosome snpchromosome
    		) {
    	
        return new Builder(
        		snpchromosome.getSnpId(),
        		snpchromosome.getChromosomeId(),
        		snpchromosome.getPosition(),
        		snpchromosome.getReference(),    
        		snpchromosome.getAlternative(),
        		snpchromosome.getRegion(),
        		snpchromosome.getEnsemblGene(),
        		snpchromosome.getEnsemblTranscript(),
        		snpchromosome.getEnsemblAnnotation(),
        		
      		    snpchromosome.getStrain7Allele(),
       		    snpchromosome.getStrain7AlleleFixed(),
       		    snpchromosome.getStrain7AlleleRatio(),
    		    snpchromosome.getStrain7AlleleAlternativeCount(),
    		    snpchromosome.getStrain7AlleleReferenceCount(),

       		    snpchromosome.getStrainPAllele(),
       		    snpchromosome.getStrainPAlleleFixed(),
       		    snpchromosome.getStrainPAlleleRatio(),
    		    snpchromosome.getStrainPAlleleAlternativeCount(),
    		    snpchromosome.getStrainPAlleleReferenceCount(),

       		    snpchromosome.getStrainWAllele(),
       		    snpchromosome.getStrainWAlleleFixed(),
       		    snpchromosome.getStrainWAlleleRatio(),
    		    snpchromosome.getStrainWAlleleAlternativeCount(),
    		    snpchromosome.getStrainWAlleleReferenceCount(),

       		    snpchromosome.getStrainNAllele(),
       		    snpchromosome.getStrainNAlleleFixed(),
       		    snpchromosome.getStrainNAlleleRatio(),
    		    snpchromosome.getStrainNAlleleAlternativeCount(),
    		    snpchromosome.getStrainNAlleleReferenceCount(),

       		    snpchromosome.getStrain15IAllele(),
       		    snpchromosome.getStrain15IAlleleFixed(),
       		    snpchromosome.getStrain15IAlleleRatio(),
    		    snpchromosome.getStrain15IAlleleAlternativeCount(),
    		    snpchromosome.getStrain15IAlleleReferenceCount(),

       		    snpchromosome.getStrainZeroAllele(),
       		    snpchromosome.getStrainZeroAlleleFixed(),
       		    snpchromosome.getStrainZeroAlleleRatio(),
    		    snpchromosome.getStrainZeroAlleleAlternativeCount(),
    		    snpchromosome.getStrainZeroAlleleReferenceCount(),

       		    snpchromosome.getStrain6Allele(),
       		    snpchromosome.getStrain6AlleleFixed(),
       		    snpchromosome.getStrain6AlleleRatio(),
    		    snpchromosome.getStrain6AlleleAlternativeCount(),
    		    snpchromosome.getStrain6AlleleReferenceCount(),

       		    snpchromosome.getStrainCAllele(),
       		    snpchromosome.getStrainCAlleleFixed(),
       		    snpchromosome.getStrainCAlleleRatio(),
    		    snpchromosome.getStrainCAlleleAlternativeCount(),
    		    snpchromosome.getStrainCAlleleReferenceCount(),

    		    snpchromosome.getAminoAcidSubs(),
                snpchromosome.getPredictionCategory(),
                snpchromosome.getScoreSift(),
                snpchromosome.getScoreConservation(),
                snpchromosome.getProteinAlignNumber(),
                snpchromosome.getTotalAlignSequenceNumber(),
                snpchromosome.getScoreProvean()
        		);
    }
    

    /**
     * A Builder class used to create new SNPChromosome09 objects.
     */
    public static class Builder {
    	
        SNPChromosome09 built;

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
         * @param strainZeroAllele For Strain ZERO the Alternative Allele
         * @param strainZeroAlleleFixed For Strain ZERO is this fixed or not
         * @param strainZeroAlleleRatio For Strain ZERO for not fixed alleles what is the ratio that this occurs else 1 for fixed
         * @param strain6Allele For Strain 6 the Alternative Allele
         * @param strain6AlleleFixed For Strain 6 is this fixed or not
         * @param strain6AlleleRatio For Strain 6 for not fixed alleles what is the ratio that this occurs else 1 for fixed
         * @param strainCAllele For Strain C the Alternative Allele
         * @param strainCAlleleFixed For Strain C is this fixed or not
         * @param strainCAlleleRatio For Strain C for not fixed alleles what is the ratio that this occurs else 1 for fixed
         * @param scoreProvean 
         * @param totalAlignSequenceNumber 
         * @param proteinAlignNumber 
         * @param scoreConservation 
         * @param scoreSift 
         * @param predictionCategory 
         * @param aminoAcidSubs 
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
        	
            built = new SNPChromosome09();
            
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
         * Builds the new SNPChromosome09 object.
         * 
         * @return this. The created SNPChromosome09 object.
         */
        public SNPChromosome09 build() {
        	
            return built;
        }
    }

    /**
     * This setter method should only be used by unit tests.
     * @param oid
     */
    protected void setId(Long oid) {
        this.oid = oid;
    }
}
