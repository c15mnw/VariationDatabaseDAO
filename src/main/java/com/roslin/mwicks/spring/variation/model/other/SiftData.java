
package com.roslin.mwicks.spring.variation.model.other;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

import java.util.Date;

/**
 * An entity class which contains the information of a single SNPChromosome Table Row.
 * @author Mike Wicks
 */

public class SiftData {
    
    // Constants ----------------------------------------------------------------------------------
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

	protected static final String STRING_TOLERATED = "TOLERATED";
	protected static final String STRING_DELETERIOUS = "DELETERIOUS";
	protected static final String STRING_BLANK = "";
	
    // Properties  --------------------------------------------------------------------------------
    private String chromosomeId;

	private String snpId;
    private String ensemblGene;
    private String ensemblTranscript;
    private String ensemblAnnotation;
    private String aminoAcidSubs;
    private String predictionCategory;
    private Double scoreSift;
    private Double scoreConservation;
    private Long proteinAlignNumber;
    private Long totalAlignSequenceNumber;
    private Date creationTime;
    private Date modificationTime;
    private long version;
    

    // Getters ------------------------------------------------------------------------------------
    public String getChromosomeId() {
    	return this.chromosomeId;
    }

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
    public Double getScoreSift() {
    	return this.scoreSift;
    }
    public Double getScoreConservation() {
    	return this.scoreConservation;
    }
    public Long getProteinAlignNumber() {
    	return this.proteinAlignNumber;
    }
    public Long getTotalAlignSequenceNumber() {
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
    

    // Setters ------------------------------------------------------------------------------------
    public void setChromosomeId(String chromosomeId) {
    	this.chromosomeId = chromosomeId;
    }

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
    public void setScoreSift(Double scoreSift) {
    	this.scoreSift = scoreSift;
    }
    public void setScoreConservation(Double scoreConservation) {
    	this.scoreConservation = scoreConservation;
    }
    public void setProteinAlignNumber(Long proteinAlignNumber) {
    	this.proteinAlignNumber = proteinAlignNumber;
    }
    public void setTotalAlignSequenceNumber(Long totalAlignSequenceNumber) {
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
    
    // Helpers ------------------------------------------------------------------------------------
    public void deriveChromosomeId() {
    	
    	String string = this.snpId;
    	String[] parts = string.split("_");
    	
    	this.chromosomeId = parts[0].substring(3);
    }

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
    public boolean isPredictionCategoryBlank() {

    	if ( this.predictionCategory.equals(STRING_BLANK) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    /*
     * Is this Component the same as the Supplied Component?
     */
    public boolean isSameAs(SiftData siftdata){

        if (
        	    this.getSnpId().equals(this.getSnpId()) && 
        	    this.getEnsemblGene().equals(this.getEnsemblGene()) && 
        	    this.getEnsemblTranscript().equals(this.getEnsemblTranscript()) && 
        	    this.getEnsemblAnnotation().equals(this.getEnsemblAnnotation()) && 
        	    this.getAminoAcidSubs().equals(this.getAminoAcidSubs()) && 
        	    this.getPredictionCategory().equals(this.getPredictionCategory()) && 
        	    this.getScoreSift() == this.getScoreSift() && 
        	    this.getScoreConservation() == this.getScoreConservation() && 
        	    this.getProteinAlignNumber() == this.getProteinAlignNumber() && 
        	    this.getTotalAlignSequenceNumber() == this.getTotalAlignSequenceNumber() 
        	    ) {

        	return true;
        }
        else {

        	return false;
        }
    }


    public void update(
    		String snpId,
    		String ensemblGene,
    		String ensemblTranscript,
    		String ensemblAnnotation,
    		String aminoAcidSubs,
    		String predictionCategory,
    		Double scoreSift,
    		Double scoreConservation,
    		Long proteinAlignNumber,
    		Long totalAlignSequenceNumber
    		) {

    	this.snpId = snpId;
    	this.ensemblGene = ensemblGene;
    	this.ensemblTranscript = ensemblTranscript;
    	this.ensemblAnnotation = ensemblAnnotation;
    	this.aminoAcidSubs = aminoAcidSubs;
    	this.predictionCategory = predictionCategory;
    	this.scoreSift = scoreSift;
    	this.scoreConservation = scoreConservation;
    	this.proteinAlignNumber = proteinAlignNumber;
    	this.totalAlignSequenceNumber = totalAlignSequenceNumber;
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

    // SiftData Builder ---------------------------------------------------------------------
    /**
     * Gets a builder which is used to create SiftData objects.
     * @return  A new Builder instance.
     */
    public static Builder getBuilder(
    		String snpId,
    		String ensemblGene,
    		String ensemblTranscript,
    		String ensemblAnnotation,
    		String aminoAcidSubs,
    		String predictionCategory,
    		Double scoreSift,
    		Double scoreConservation,
    		Long proteinAlignNumber,
    		Long totalAlignSequenceNumber
    		) {
    	
        return new Builder(
        		snpId,
        		ensemblGene,
        		ensemblTranscript,
        		ensemblAnnotation,
        		aminoAcidSubs,
        		predictionCategory,
        		scoreSift,
        		scoreConservation,
        		proteinAlignNumber,
        		totalAlignSequenceNumber
        		);
    }
    
    /**
     * A Builder class used to create new SNPChromosome objects.
     */
    public static class Builder {
    	
    	SiftData built;

        /**
         * Creates a new Builder instance.
         * @param snpId The SNP ID
         * @param chromosomeId The Chromosome ID
         * @param position The SNP Position or coordinate
         * @param reference The Reference or Expected Nucleobase
         * @param alternative The Alternative Nucleobase as found
         * @param region The Region
         */
        Builder(
        		String snpId,
        		String ensemblGene,
        		String ensemblTranscript,
        		String ensemblAnnotation,
        		String aminoAcidSubs,
        		String predictionCategory,
        		Double scoreSift,
        		Double scoreConservation,
        		Long proteinAlignNumber,
        		Long totalAlignSequenceNumber
        		) {
        	
            built = new SiftData();
            
        	built.snpId = snpId;
        	built.ensemblGene = ensemblGene;
        	built.ensemblTranscript = ensemblTranscript;
        	built.ensemblAnnotation = ensemblAnnotation;
        	built.aminoAcidSubs = aminoAcidSubs;
        	built.predictionCategory = predictionCategory;
        	built.scoreSift = scoreSift;
        	built.scoreConservation = scoreConservation;
        	built.proteinAlignNumber = proteinAlignNumber;
        	built.totalAlignSequenceNumber = totalAlignSequenceNumber;
        }

        /**
         * Builds the new SNPChromosome object.
         * 
         * @return  The created SNPChromosome object.
         */
        public SiftData build() {
        	
            return built;
        }
    }

}
