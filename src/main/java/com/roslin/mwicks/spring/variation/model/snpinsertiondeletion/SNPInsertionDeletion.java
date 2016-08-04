package com.roslin.mwicks.spring.variation.model.snpinsertiondeletion;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.springframework.transaction.annotation.Transactional;

import com.roslin.mwicks.spring.variation.format.CustomDateToStringStyle;

import com.roslin.mwicks.utility.ObjectConverter;

import javax.persistence.*;

import java.util.Comparator;

import java.util.Date;

/**
 * An entity class which contains the information of a single SNPChromosome Table Row.
 * @author Mike Wicks
 */

@Entity
@Table(name = "VSC_SNP_INSERTION_DELETION")
@Transactional
public class SNPInsertionDeletion implements Comparable<SNPInsertionDeletion> {
    
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

	protected static final String STRING_TOLERATED = "TOLERATED";
	protected static final String STRING_DELETERIOUS = "DELETERIOUS";
	protected static final String STRING_BLANK = "";
	
    // Properties  --------------------------------------------------------------------------------

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "VSI_OID", nullable = false)
    private Long oid;

    @Column(name = "VSI_CHROMOSOME_ID", nullable = false)
    private String chromosomeId;

    @Column(name = "VSI_POSITION", nullable = false)
    private int position;

    @Column(name = "VSI_INSERTION_DELETION_ID", nullable = false)
	private String insertionDeletionId;

    @Column(name = "VSI_REFERENCE", nullable = false)
    private String reference;    

    @Column(name = "VSI_ALTERNATIVE", nullable = false)
    private String alternative;

    @Column(name = "VSI_QUALITY", nullable = false)
    private String quality;    

    @Column(name = "VSI_FILTER", nullable = false)
    private String filter;    

    @Column(name = "VSI_INFORMATION", nullable = false)
    private String information;
    
    @Column(name = "VSI_STRAIN_I_ALTERNATIVE_ALLELES", nullable = false)
    private String breedAllelesI;
    
    @Column(name = "VSI_STRAIN_J_ALTERNATIVE_ALLELES", nullable = false)
    private String breedAllelesJ;

    @Column(name = "VSI_STRAIN_L_ALTERNATIVE_ALLELES", nullable = false)
    private String breedAllelesL;

    @Column(name = "VSI_STRAIN_N_ALTERNATIVE_ALLELES", nullable = false)
    private String breedAllelesN;

    @Column(name = "VSI_STRAIN_W_ALTERNATIVE_ALLELES", nullable = false)
    private String breedAllelesW;

    @Column(name = "VSI_STRAIN_Z_ALTERNATIVE_ALLELES", nullable = false)
    private String breedAllelesZ;

    @Column(name = "VSI_AMINO_ACID_SUBSITUTION", nullable = false)
    private String aminoAcidSubs;

    @Column(name = "VSI_PREDICTION_CATEGORY", nullable = false)
    private String predictionCategory;
    
    @Column(name = "VSI_SIFT_SCORE", nullable = false)
    private double scoreSift;
    
    @Column(name = "VSI_SIFT_SCORE_CONSERVATION", nullable = false)
    private double scoreConservation;
    
    @Column(name = "VSI_PROTEIN_ALIGNMENT_NUMBER", nullable = false)
    private long proteinAlignNumber;
    
    @Column(name = "VSI_TOTAL_SEQUENCE_ALIGNMENT_NUMBER", nullable = false)
    private long totalAlignSequenceNumber;

    @Column(name = "VSI_PROVEAN_SCORE", nullable = false)
    private double scoreProvean;

    @Column(name = "VSI_CREATION_TIME", nullable = false)
    private Date creationTime;
    
    @Column(name = "VSI_MODIFICATION_TIME", nullable = true)
    private Date modificationTime;
    
    @Version
    @Column(name = "VSI_VERSION", nullable = false)
    private long version;
    

    // Getters ------------------------------------------------------------------------------------
    public long getOid() {
    	return this.oid;
    }
    public String getChromosomeId() {
    	return this.chromosomeId;
    }
    public String getInsertionDeletionId() {
    	return this.insertionDeletionId;
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
    public String getQuality() {
    	return this.quality;
    }
    public String getFilter() {
    	return this.filter;
    }
    public String getInformation() {
    	return this.information;
    }
    public String getBreedAllelesI() {
    	return this.breedAllelesI;
    }
    public String getBreedAllelesJ() {
    	return this.breedAllelesJ;
    }
    public String getBreedAllelesL() {
    	return this.breedAllelesL;
    }
    public String getBreedAllelesN() {
    	return this.breedAllelesN;
    }
    public String getBreedAllelesW() {
    	return this.breedAllelesW;
    }
    public String getBreedAllelesZ() {
    	return this.breedAllelesZ;
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
    public void setOid(long oid) {
    	this.oid = oid;
    }
    public void setChromosomeId(String chromosomeId) {
    	this.chromosomeId = chromosomeId;
    }
    public void setInsertionDeletionId(String insertionDeletionId) {
    	this.insertionDeletionId = insertionDeletionId;
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
    public void setQuality(String quality) {
    	this.quality = quality;
    }
    public void setFilter(String filter) {
    	this.filter = filter;
    }
    public void setInformation(String information) {
    	this.information = information;
    }
    public void setBreedAllelesI(String breedAllelesI) {
    	this.breedAllelesI = breedAllelesI;
    }
    public void setBreedAllelesJ(String breedAllelesJ) {
    	this.breedAllelesJ = breedAllelesJ;
    }
    public void setBreedAllelesL(String breedAllelesL) {
    	this.breedAllelesL = breedAllelesL;
    }
    public void setBreedAllelesN(String breedAllelesN) {
    	this.breedAllelesN = breedAllelesN;
    }
    public void setBreedAllelesW(String breedAllelesW) {
    	this.breedAllelesW = breedAllelesW;
    }
    public void setBreedAllelesZ(String breedAllelesZ) {
    	this.breedAllelesZ = breedAllelesZ;
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

    public boolean isFilterTolerated() {

    	if ( this.filter.equals(STRING_TOLERATED) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isFilterDeleterious() {

    	if ( this.filter.equals(STRING_DELETERIOUS) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isFilterBlank() {

    	if ( this.filter.equals(STRING_BLANK) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    
    /*
     * Is this SiftData VALID?
     */
    public boolean isThisAValidSNPInsertionDeletion(){

        if ( ( this.isChromosome1() || 
        		this.isChromosome2() || 
        		this.isChromosome3() || 
        		this.isChromosome4() || 
        		this.isChromosome5() || 
        		this.isChromosome6() || 
        		this.isChromosome7() || 
        		this.isChromosome8() || 
        		this.isChromosome9() || 
        		this.isChromosome10() || 
        		this.isChromosome11() || 
        		this.isChromosome12() || 
        		this.isChromosome13() || 
        		this.isChromosome14() || 
        		this.isChromosome15() || 
        		this.isChromosome16() || 
        		this.isChromosome17() || 
        		this.isChromosome18() || 
        		this.isChromosome19() || 
        		this.isChromosome20() || 
        		this.isChromosome21() || 
        		this.isChromosome22() || 
        		this.isChromosome23() || 
        		this.isChromosome24() || 
        		this.isChromosome25() || 
        		this.isChromosome26() || 
        		this.isChromosome27() || 
        		this.isChromosome28() || 
        		this.isChromosome32() || 
        		this.isChromosomeLGE22C19W28_E50C23() || 
        		this.isChromosomeLGE64() || 
        		this.isChromosomeW() || 
        		this.isChromosomeZ() ) ) {

        	return true;
        }
        else {
        	
        	return false;
        }
    }

    
    /*
     * Is this Component the same as the Supplied Component?
     */
    public boolean isSameAs(SNPInsertionDeletion snpinsertiondeletion){

        if (
        	    this.getChromosomeId().equals(snpinsertiondeletion.getChromosomeId()) && 
        	    this.getPosition() == snpinsertiondeletion.getPosition() && 
        	    this.getInsertionDeletionId().equals(snpinsertiondeletion.getInsertionDeletionId()) && 
        	    this.getReference().equals(snpinsertiondeletion.getReference()) && 
        	    this.getAlternative().equals(snpinsertiondeletion.getAlternative()) && 
        	    this.getQuality().equals(snpinsertiondeletion.getQuality()) && 
        	    this.getFilter().equals(snpinsertiondeletion.getFilter()) && 
        	    this.getInformation().equals(snpinsertiondeletion.getInformation()) && 
        	    this.getAminoAcidSubs().equals(snpinsertiondeletion.getAminoAcidSubs()) && 
        	    this.getPredictionCategory().equals(snpinsertiondeletion.getPredictionCategory()) && 
        	    this.getScoreSift() == snpinsertiondeletion.getScoreSift() &&  
        	    this.getScoreConservation() == snpinsertiondeletion.getScoreConservation() && 
        	    this.getProteinAlignNumber() == snpinsertiondeletion.getProteinAlignNumber() && 
        	    this.getTotalAlignSequenceNumber() == snpinsertiondeletion.getTotalAlignSequenceNumber() && 
        	    this.getScoreProvean() == snpinsertiondeletion.getScoreProvean()
        	    ) {

        	return true;
        }
        else {

        	return false;
        }
    }
    

    public void update(
    		String chromosomeId,
    		int position,
    		String insertionDeletionId,
    		String reference,
    		String alternative,
    		String quality,
    		String filter,
    		String information,
    		String breedAllelesI,
    		String breedAllelesJ,
     		String breedAllelesL,
    		String breedAllelesN,
    		String breedAllelesW,
    		String breedAllelesZ,
    		String aminoAcidSubs,
        	String predictionCategory,
        	double scoreSift,
        	double scoreConservation,
        	long proteinAlignNumber,
        	long totalAlignSequenceNumber,
        	double scoreProvean
    		) {

    	this.chromosomeId = chromosomeId;
    	this.position = position;
    	this.insertionDeletionId = insertionDeletionId;
    	this.reference = reference;
    	this.alternative = alternative;
    	this.quality = quality;
    	this.filter = filter;
    	this.information = information;
    	this.breedAllelesI = breedAllelesI;
    	this.breedAllelesJ = breedAllelesJ;
    	this.breedAllelesL = breedAllelesL;
    	this.breedAllelesN = breedAllelesN;
    	this.breedAllelesW = breedAllelesW;
    	this.breedAllelesZ = breedAllelesZ;
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

    // SiftData Builder ---------------------------------------------------------------------
    /**
     * Gets a builder which is used to create SiftData objects.
     * @return  A new Builder instance.
     */
    public static Builder getBuilder(
    		String chromosomeId,
    		int position,
    		String insertionDeletionId,
    		String reference,
    		String alternative,
    		String quality,
    		String filter,
    		String information,
    		String breedAllelesI,
    		String breedAllelesJ,
     		String breedAllelesL,
    		String breedAllelesN,
    		String breedAllelesW,
    		String breedAllelesZ,
        	String aminoAcidSubs,
        	String predictionCategory,
        	double scoreSift,
        	double scoreConservation,
        	long proteinAlignNumber,
        	long totalAlignSequenceNumber,
        	double scoreProvean
    		) {
    	
        return new Builder(
        		chromosomeId,
        		position,
        		insertionDeletionId,
        		reference,
        		alternative,
        		quality,
        		filter,
        		information,
        		breedAllelesI,
        		breedAllelesJ,
        		breedAllelesL,
        		breedAllelesN,
        		breedAllelesW,
        		breedAllelesZ,
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
    	
    	SNPInsertionDeletion built;

        /**
         * Creates a new Builder instance.
         * @param inDelId The SNP ID
         * @param chromosomeId The Chromosome ID
         * @param position The SNP Position or coordinate
         * @param reference The Reference or Expected Nucleobase
         * @param alternative The Alternative Nucleobase as found
         * @param region The Region
         */
        Builder(
        		String chromosomeId,
        		int position,
        		String insertionDeletionId,
        		String reference,
        		String alternative,
        		String quality,
        		String filter,
        		String information,
        		String breedAllelesI,
        		String breedAllelesJ,
         		String breedAllelesL,
        		String breedAllelesN,
        		String breedAllelesW,
        		String breedAllelesZ,
        		String aminoAcidSubs,
            	String predictionCategory,
            	double scoreSift,
            	double scoreConservation,
            	long proteinAlignNumber,
            	long totalAlignSequenceNumber,
            	double scoreProvean
        		) {
        	
            built = new SNPInsertionDeletion();
            
        	built.chromosomeId = chromosomeId;
        	built.position = position;
        	built.insertionDeletionId = insertionDeletionId;
        	built.reference = reference;
        	built.alternative = alternative;
        	built.quality = quality;
        	built.filter = filter;
        	built.information = information;
        	built.breedAllelesI = breedAllelesI;
        	built.breedAllelesJ = breedAllelesJ;
        	built.breedAllelesL = breedAllelesL;
        	built.breedAllelesN = breedAllelesN;
        	built.breedAllelesW = breedAllelesW;
        	built.breedAllelesZ = breedAllelesZ;
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
         * @return  The created SNPChromosome object.
         */
        public SNPInsertionDeletion build() {
        	
            return built;
        }
    }

    public int compareTo(SNPInsertionDeletion o) {
        return this.getOid() > o.getOid() ? 1 : (this.getOid() < o.getOid() ? -1 : 0);
    }


    public static class OrderByPositionAsc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.position > snpinsertiondeletion_o2.position ? 1 : (snpinsertiondeletion_o1.position < snpinsertiondeletion_o2.position ? -1 : 0);
        }
    }

    public static class OrderByReferenceAsc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.reference.compareTo(snpinsertiondeletion_o2.reference);
        }
    }

    public static class OrderByAlternativeAsc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.alternative.compareTo(snpinsertiondeletion_o2.alternative);
        }
    }

    /*
    public static class OrderByRegionAsc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.region.compareTo(snpinsertiondeletion_o2.region);
        }
    }

    public static class OrderByEnsemblGeneAsc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.ensemblGene.compareTo(snpinsertiondeletion_o2.ensemblGene);
        }
    }

    public static class OrderByEnsemblTranscriptAsc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.ensemblTranscript.compareTo(snpinsertiondeletion_o2.ensemblTranscript);
        }
    }

    public static class OrderByEnsemblAnnotationAsc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.ensemblAnnotation.compareTo(snpinsertiondeletion_o2.ensemblAnnotation);
        }
    }
    */

    public static class OrderByAminoAcidSubsAsc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.aminoAcidSubs.compareTo(snpinsertiondeletion_o2.aminoAcidSubs);
        }
    }

    public static class OrderByPredictionCategoryAsc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.predictionCategory.compareTo(snpinsertiondeletion_o2.predictionCategory);
        }
    }

    public static class OrderByScoreSiftAsc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.scoreSift > snpinsertiondeletion_o2.scoreSift ? 1 : (snpinsertiondeletion_o1.scoreSift < snpinsertiondeletion_o2.scoreSift ? -1 : 0);
        }
    }

    public static class OrderByScoreConservationAsc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.scoreConservation > snpinsertiondeletion_o2.scoreConservation ? 1 : (snpinsertiondeletion_o1.scoreConservation < snpinsertiondeletion_o2.scoreConservation ? -1 : 0);
        }
    }

    public static class OrderByProteinAlignNumberAsc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.proteinAlignNumber > snpinsertiondeletion_o2.proteinAlignNumber ? 1 : (snpinsertiondeletion_o1.proteinAlignNumber < snpinsertiondeletion_o2.proteinAlignNumber ? -1 : 0);
        }
    }

    public static class OrderByTotalAlignSequenceNumberAsc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.totalAlignSequenceNumber > snpinsertiondeletion_o2.totalAlignSequenceNumber ? 1 : (snpinsertiondeletion_o1.totalAlignSequenceNumber < snpinsertiondeletion_o2.totalAlignSequenceNumber ? -1 : 0);
        }
    }

    public static class OrderByScoreProveanAsc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.scoreProvean > snpinsertiondeletion_o2.scoreProvean ? 1 : (snpinsertiondeletion_o1.scoreProvean < snpinsertiondeletion_o2.scoreProvean ? -1 : 0);
        }
    }

    public static class OrderByPositionDesc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.position > snpinsertiondeletion_o2.position ? -1 : (snpinsertiondeletion_o1.position < snpinsertiondeletion_o2.position ? 1 : 0);
        }
    }

    public static class OrderByReferenceDesc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o2.reference.compareTo(snpinsertiondeletion_o1.reference);
        }
    }

    public static class OrderByAlternativeDesc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o2.alternative.compareTo(snpinsertiondeletion_o1.alternative);
        }
    }

    /*
    public static class OrderByRegionDesc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o2.region.compareTo(snpinsertiondeletion_o1.region);
        }
    }

    public static class OrderByEnsemblGeneDesc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o2.ensemblGene.compareTo(snpinsertiondeletion_o1.ensemblGene);
        }
    }

    public static class OrderByEnsemblTranscriptDesc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o2.ensemblTranscript.compareTo(snpinsertiondeletion_o1.ensemblTranscript);
        }
    }

    public static class OrderByEnsemblAnnotationDesc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o2.ensemblAnnotation.compareTo(snpinsertiondeletion_o1.ensemblAnnotation);
        }
    }
    */

    public static class OrderByAminoAcidSubsDesc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o2.aminoAcidSubs.compareTo(snpinsertiondeletion_o1.aminoAcidSubs);
        }
    }

    public static class OrderByPredictionCategoryDesc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o2.predictionCategory.compareTo(snpinsertiondeletion_o1.predictionCategory);
        }
    }

    public static class OrderByScoreSiftDesc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.scoreSift > snpinsertiondeletion_o2.scoreSift ? 1 : (snpinsertiondeletion_o1.scoreSift < snpinsertiondeletion_o2.scoreSift ? -1 : 0);
        }
    }

    public static class OrderByScoreConservationDesc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.scoreConservation > snpinsertiondeletion_o2.scoreConservation ? 1 : (snpinsertiondeletion_o1.scoreConservation < snpinsertiondeletion_o2.scoreConservation ? -1 : 0);
        }
    }

    public static class OrderByProteinAlignNumberDesc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.proteinAlignNumber > snpinsertiondeletion_o2.proteinAlignNumber ? 1 : (snpinsertiondeletion_o1.proteinAlignNumber < snpinsertiondeletion_o2.proteinAlignNumber ? -1 : 0);
        }
    }

    public static class OrderByTotalAlignSequenceNumberDesc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.totalAlignSequenceNumber > snpinsertiondeletion_o2.totalAlignSequenceNumber ? 1 : (snpinsertiondeletion_o1.totalAlignSequenceNumber < snpinsertiondeletion_o2.totalAlignSequenceNumber ? -1 : 0);
        }
    }

    public static class OrderByScoreProveanDesc implements Comparator<SNPInsertionDeletion> {

        public int compare(SNPInsertionDeletion snpinsertiondeletion_o1, SNPInsertionDeletion snpinsertiondeletion_o2) {

        	return snpinsertiondeletion_o1.scoreProvean > snpinsertiondeletion_o2.scoreProvean ? 1 : (snpinsertiondeletion_o1.scoreProvean < snpinsertiondeletion_o2.scoreProvean ? -1 : 0);
        }
    }


}
