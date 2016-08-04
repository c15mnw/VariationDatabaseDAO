package com.roslin.mwicks.spring.variation.model.snpchromosome;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

import java.util.Comparator;
import java.util.Date;

import com.roslin.mwicks.spring.variation.format.CustomDateToStringStyle;
import com.roslin.mwicks.utility.ObjectConverter;

/**
 * An entity class which contains the information of a single SNPChromosome Table Row.
 * @author Mike Wicks
 * @Entity
 * @Transactional
 */

@Entity
@Table(name = "VSC_SNP_CHROMOSOME")
@Transactional
public class SNPChromosome implements Comparable<SNPChromosome>{
    
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

	@EmbeddedId
	private SNPChromosomePrimaryKey snpChromosomePrimaryKey;
	
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
    public SNPChromosomePrimaryKey getSnpChromosomePrimaryKey() {
    	return this.snpChromosomePrimaryKey;
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
    	return ObjectConverter.convert(this.snpChromosomePrimaryKey.getPartitionId(), String.class) + ", " + ObjectConverter.convert(this.snpChromosomePrimaryKey.getOid(), String.class);
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
    	return '\"' + ObjectConverter.convert(this.snpChromosomePrimaryKey.getPartitionId(), String.class) + ", " + ObjectConverter.convert(this.snpChromosomePrimaryKey.getOid(), String.class) + '\"';

    }
    public String getPositionAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(this.position, String.class) + '\"';
    }

    public String getStrain7AlleleFixedQuoted() {
    	return '\"' + this.strain7AlleleFixed + '\"';
    }
    public String getStrain7AlleleRatioQuoted() {
    	return '\"' + ObjectConverter.convert(this.strain7AlleleRatio, String.class) + '\"';
    }
    public String getStrain7AlleleReferenceCountQuoted() {
    	return '\"' + ObjectConverter.convert(this.strain7AlleleReferenceCount, String.class) + '\"';
    }
    public String getStrain7AlleleAlternativeCountQuoted() {
    	return '\"' + ObjectConverter.convert(this.strain7AlleleAlternativeCount, String.class) + '\"';
    }

    public String getStrainPAlleleFixedQuoted() {
    	return '\"' + this.strainPAlleleFixed + '\"';
    }
    public String getStrainPAlleleRatioQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainPAlleleRatio, String.class) + '\"';
    }
    public String getStrainPAlleleReferenceCountQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainPAlleleReferenceCount, String.class) + '\"';
    }
    public String getStrainPAlleleAlternativeCountQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainPAlleleAlternativeCount, String.class) + '\"';
    }
    
    public String getStrainWAlleleFixedQuoted() {
    	return '\"' + this.strainWAlleleFixed + '\"';
    }
    public String getStrainWAlleleRatioQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainWAlleleRatio, String.class) + '\"';
    }
    public String getStrainWAlleleReferenceCountQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainWAlleleReferenceCount, String.class) + '\"';
    }
    public String getStrainWAlleleAlternativeCountQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainWAlleleAlternativeCount, String.class) + '\"';
    }

    public String getStrainNAlleleFixedQuoted() {
    	return '\"' + this.strainNAlleleFixed + '\"';
    }
    public String getStrainNAlleleRatioQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainNAlleleRatio, String.class) + '\"';
    }
    public String getStrainNAlleleReferenceCountQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainNAlleleReferenceCount, String.class) + '\"';
    }
    public String getStrainNAlleleAlternativeCountQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainNAlleleAlternativeCount, String.class) + '\"';
    }

    public String getStrain15IAlleleFixedQuoted() {
    	return '\"' + this.strain15IAlleleFixed + '\"';
    }
    public String getStrain15IAlleleRatioQuoted() {
    	return '\"' + ObjectConverter.convert(this.strain15IAlleleRatio, String.class) + '\"';
    }
    public String getStrain15IAlleleReferenceCountQuoted() {
    	return '\"' + ObjectConverter.convert(this.strain15IAlleleReferenceCount, String.class) + '\"';
    }
    public String getStrain15IAlleleAlternativeCountQuoted() {
    	return '\"' + ObjectConverter.convert(this.strain15IAlleleAlternativeCount, String.class) + '\"';
    }
    
    public String getStrainZeroAlleleFixedQuoted() {  
    	return '\"' + this.strainZeroAlleleFixed + '\"';
    }
    public String getStrainZeroAlleleRatioQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainZeroAlleleRatio, String.class) + '\"';
    }
    public String getStrainZeroAlleleReferenceCountQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainZeroAlleleReferenceCount, String.class) + '\"';
    }
    public String getStrainZeroAlleleAlternativeCountQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainZeroAlleleAlternativeCount, String.class) + '\"';
    }
    
    public String getStrain6AlleleFixedQuoted() {
    	return '\"' + this.strain6AlleleFixed + '\"';
    }
    public String getStrain6AlleleRatioQuoted() {
    	return '\"' + ObjectConverter.convert(this.strain6AlleleRatio, String.class) + '\"';
    }
    public String getStrain6AlleleReferenceCountQuoted() {
    	return '\"' + ObjectConverter.convert(this.strain6AlleleReferenceCount, String.class) + '\"';
    }
    public String getStrain6AlleleAlternativeCountQuoted() {
    	return '\"' + ObjectConverter.convert(this.strain6AlleleAlternativeCount, String.class) + '\"';
    }
    
    public String getStrainCAlleleFixedQuoted() {
    	return '\"' + this.strainCAlleleFixed + '\"';
    }
    public String getStrainCAlleleRatioQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainCAlleleRatio, String.class) + '\"';
    }
    public String getStrainCAlleleReferenceCountQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainCAlleleReferenceCount, String.class) + '\"';
    }
    public String getStrainCAlleleAlternativeCountQuoted() {
    	return '\"' + ObjectConverter.convert(this.strainCAlleleAlternativeCount, String.class) + '\"';
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
    public void setSnpChromosomePrimaryKey(SNPChromosomePrimaryKey snpChromosomePrimaryKey) {
    	this.snpChromosomePrimaryKey = snpChromosomePrimaryKey;
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

        if (this.getSnpChromosomePrimaryKey() == snpchromosome.getSnpChromosomePrimaryKey() && 
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
    	
        return (other instanceof SNPChromosome) && (this.getSnpChromosomePrimaryKey() != null) 
        		? this.getSnpChromosomePrimaryKey().equals(((SNPChromosome) other).getSnpChromosomePrimaryKey()) 
        		: (other == this);
    }
    

    public void update(
    		long oid,
    		long partitionId,

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

    	this.snpChromosomePrimaryKey.setOid(oid);
    	this.snpChromosomePrimaryKey.setPartitionId(partitionId);

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


    public int compareTo(SNPChromosome o) {
        return this.snpChromosomePrimaryKey.getOid() > o.snpChromosomePrimaryKey.getOid() ? 1 : (this.snpChromosomePrimaryKey.getOid() < o.snpChromosomePrimaryKey.getOid() ? -1 : 0);
    }


    public static class OrderByPositionAsc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.position > snpchromosome_o2.position ? 1 : (snpchromosome_o1.position < snpchromosome_o2.position ? -1 : 0);
        }
    }

    public static class OrderByReferenceAsc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.reference.compareTo(snpchromosome_o2.reference);
        }
    }

    public static class OrderByAlternativeAsc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.alternative.compareTo(snpchromosome_o2.alternative);
        }
    }

    public static class OrderByRegionAsc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.region.compareTo(snpchromosome_o2.region);
        }
    }

    public static class OrderByEnsemblGeneAsc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.ensemblGene.compareTo(snpchromosome_o2.ensemblGene);
        }
    }

    public static class OrderByEnsemblTranscriptAsc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.ensemblTranscript.compareTo(snpchromosome_o2.ensemblTranscript);
        }
    }

    public static class OrderByEnsemblAnnotationAsc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.ensemblAnnotation.compareTo(snpchromosome_o2.ensemblAnnotation);
        }
    }

    public static class OrderByAminoAcidSubsAsc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.aminoAcidSubs.compareTo(snpchromosome_o2.aminoAcidSubs);
        }
    }

    public static class OrderByPredictionCategoryAsc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.predictionCategory.compareTo(snpchromosome_o2.predictionCategory);
        }
    }

    public static class OrderByScoreSiftAsc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.scoreSift > snpchromosome_o2.scoreSift ? 1 : (snpchromosome_o1.scoreSift < snpchromosome_o2.scoreSift ? -1 : 0);
        }
    }

    public static class OrderByScoreConservationAsc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.scoreConservation > snpchromosome_o2.scoreConservation ? 1 : (snpchromosome_o1.scoreConservation < snpchromosome_o2.scoreConservation ? -1 : 0);
        }
    }

    public static class OrderByProteinAlignNumberAsc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.proteinAlignNumber > snpchromosome_o2.proteinAlignNumber ? 1 : (snpchromosome_o1.proteinAlignNumber < snpchromosome_o2.proteinAlignNumber ? -1 : 0);
        }
    }

    public static class OrderByTotalAlignSequenceNumberAsc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.totalAlignSequenceNumber > snpchromosome_o2.totalAlignSequenceNumber ? 1 : (snpchromosome_o1.totalAlignSequenceNumber < snpchromosome_o2.totalAlignSequenceNumber ? -1 : 0);
        }
    }

    public static class OrderByScoreProveanAsc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.scoreProvean > snpchromosome_o2.scoreProvean ? 1 : (snpchromosome_o1.scoreProvean < snpchromosome_o2.scoreProvean ? -1 : 0);
        }
    }

    public static class OrderByPositionDesc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.position > snpchromosome_o2.position ? -1 : (snpchromosome_o1.position < snpchromosome_o2.position ? 1 : 0);
        }
    }

    public static class OrderByReferenceDesc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o2.reference.compareTo(snpchromosome_o1.reference);
        }
    }

    public static class OrderByAlternativeDesc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o2.alternative.compareTo(snpchromosome_o1.alternative);
        }
    }

    public static class OrderByRegionDesc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o2.region.compareTo(snpchromosome_o1.region);
        }
    }

    public static class OrderByEnsemblGeneDesc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o2.ensemblGene.compareTo(snpchromosome_o1.ensemblGene);
        }
    }

    public static class OrderByEnsemblTranscriptDesc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o2.ensemblTranscript.compareTo(snpchromosome_o1.ensemblTranscript);
        }
    }

    public static class OrderByEnsemblAnnotationDesc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o2.ensemblAnnotation.compareTo(snpchromosome_o1.ensemblAnnotation);
        }
    }

    public static class OrderByAminoAcidSubsDesc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o2.aminoAcidSubs.compareTo(snpchromosome_o1.aminoAcidSubs);
        }
    }

    public static class OrderByPredictionCategoryDesc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o2.predictionCategory.compareTo(snpchromosome_o1.predictionCategory);
        }
    }

    public static class OrderByScoreSiftDesc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.scoreSift > snpchromosome_o2.scoreSift ? 1 : (snpchromosome_o1.scoreSift < snpchromosome_o2.scoreSift ? -1 : 0);
        }
    }

    public static class OrderByScoreConservationDesc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.scoreConservation > snpchromosome_o2.scoreConservation ? 1 : (snpchromosome_o1.scoreConservation < snpchromosome_o2.scoreConservation ? -1 : 0);
        }
    }

    public static class OrderByProteinAlignNumberDesc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.proteinAlignNumber > snpchromosome_o2.proteinAlignNumber ? 1 : (snpchromosome_o1.proteinAlignNumber < snpchromosome_o2.proteinAlignNumber ? -1 : 0);
        }
    }

    public static class OrderByTotalAlignSequenceNumberDesc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.totalAlignSequenceNumber > snpchromosome_o2.totalAlignSequenceNumber ? 1 : (snpchromosome_o1.totalAlignSequenceNumber < snpchromosome_o2.totalAlignSequenceNumber ? -1 : 0);
        }
    }

    public static class OrderByScoreProveanDesc implements Comparator<SNPChromosome> {

        public int compare(SNPChromosome snpchromosome_o1, SNPChromosome snpchromosome_o2) {

        	return snpchromosome_o1.scoreProvean > snpchromosome_o2.scoreProvean ? 1 : (snpchromosome_o1.scoreProvean < snpchromosome_o2.scoreProvean ? -1 : 0);
        }
    }


	
}
