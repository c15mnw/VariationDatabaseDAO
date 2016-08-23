package com.roslin.mwicks.spring.variation.dto.offline;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Column;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.hibernate.validator.constraints.NotEmpty;

import com.roslin.mwicks.spring.variation.format.CustomDateToStringStyle;
import com.roslin.mwicks.spring.variation.model.snpinsertiondeletion.SNPInsertionDeletion;
import com.roslin.mwicks.utility.ObjectConverter;
import com.roslin.mwicks.utility.StringUtility;


/**
 * A DTO object which is used as a form object
 * in create person and edit person forms.
 * @author Mike Wicks
 */
public class DTOInsertionDeletion {
    
    // Constants ----------------------------------------------------------------------------------
	protected static final String STRING_NA = "N/A";
	protected static final String STRING_FIXED = "Fixed";
	protected static final String STRING_NOT_FIXED = "Not Fixed";
	protected static final String STRING_REFERENCE = "Ref.";
	
	protected static final String STRING_TOLERATED = "TOLERATED";
	protected static final String STRING_DELETERIOUS = "DELETERIOUS";
	protected static final String STRING_BLANK = "";
	
	protected static final String ONLY_BREED_NONE = "NONE";
	protected static final String ONLY_BREED_I = "I";
	protected static final String ONLY_BREED_J = "J";
	protected static final String ONLY_BREED_L = "L";
	protected static final String ONLY_BREED_N = "N";
	protected static final String ONLY_BREED_W = "W";
	protected static final String ONLY_BREED_Z = "Z";

	protected static final String ONLY_CHROMOSOME_NONE = "NONE";
	protected static final String ONLY_CHROMOSOME_1 = "1";
	protected static final String ONLY_CHROMOSOME_2 = "2";
	protected static final String ONLY_CHROMOSOME_3 = "3";
	protected static final String ONLY_CHROMOSOME_4 = "4";
	protected static final String ONLY_CHROMOSOME_5 = "5";
	protected static final String ONLY_CHROMOSOME_6 = "6";
	protected static final String ONLY_CHROMOSOME_7 = "7";
	protected static final String ONLY_CHROMOSOME_8 = "8";
	protected static final String ONLY_CHROMOSOME_9 = "9";
	protected static final String ONLY_CHROMOSOME_10 = "10";
	protected static final String ONLY_CHROMOSOME_11 = "11";
	protected static final String ONLY_CHROMOSOME_12 = "12";
	protected static final String ONLY_CHROMOSOME_13 = "13";
	protected static final String ONLY_CHROMOSOME_14 = "14";
	protected static final String ONLY_CHROMOSOME_15 = "15";
	protected static final String ONLY_CHROMOSOME_16 = "16";
	protected static final String ONLY_CHROMOSOME_17 = "17";
	protected static final String ONLY_CHROMOSOME_18 = "18";
	protected static final String ONLY_CHROMOSOME_19 = "19";
	protected static final String ONLY_CHROMOSOME_20 = "20";
	protected static final String ONLY_CHROMOSOME_21 = "21";
	protected static final String ONLY_CHROMOSOME_22 = "22";
	protected static final String ONLY_CHROMOSOME_23 = "23";
	protected static final String ONLY_CHROMOSOME_24 = "24";
	protected static final String ONLY_CHROMOSOME_25 = "25";
	protected static final String ONLY_CHROMOSOME_26 = "26";
	protected static final String ONLY_CHROMOSOME_27 = "27";
	protected static final String ONLY_CHROMOSOME_28 = "28";
	protected static final String ONLY_CHROMOSOME_32 = "32";
	protected static final String ONLY_CHROMOSOME_LGE22C19W28_E50C23 = "LGE22C19W28_E50C23";
	protected static final String ONLY_CHROMOSOME_LGE64 = "LGE64";
	protected static final String ONLY_CHROMOSOME_W = "W";
	protected static final String ONLY_CHROMOSOME_Z = "Z";

	
	// Properties ---------------------------------------------------------------------------------
	private Long oid;
    
    @NotEmpty
    private String chromosomeId;
    
    @NotEmpty
    private String positionStart;
    
    @NotEmpty
    private String positionEnd;
    
    @NotEmpty
	private String inDelId;
    
    @NotEmpty
    private String reference;    
    
    @NotEmpty
    private String alternative;
    
    @NotEmpty
    private String quality;    
    
    @NotEmpty
    private String filter;    
    
    @NotEmpty
    private String information;
    
    @NotEmpty
    private boolean breedI;
    
    @NotEmpty
    private boolean breedJ;

    @NotEmpty
    private boolean breedL;

    @NotEmpty
    private boolean breedN;

    @NotEmpty
    private boolean breedW;

    @NotEmpty
    private boolean breedZ;

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
    

    public DTOInsertionDeletion() {

    }


    // Getters ------------------------------------------------------------------------------------
    public long getOid() {
    	return this.oid;
    }
    public String getChromosomeId() {
    	return this.chromosomeId;
    }
    public String getInDelId() {
    	return this.inDelId;
    }
    public String getPositionStart() {
    	return this.positionStart;
    }
    public String getPositionEnd() {
    	return this.positionEnd;
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
    public boolean getBreedI() {
    	return this.breedI;
    }
    public boolean getBreedJ() {
    	return this.breedJ;
    }
    public boolean getBreedL() {
    	return this.breedL;
    }
    public boolean getBreedN() {
    	return this.breedN;
    }
    public boolean getBreedW() {
    	return this.breedW;
    }
    public boolean getBreedZ() {
    	return this.breedZ;
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
    	return this.creationTime;
    }
    public Date getModificationTime() {
    	return this.modificationTime;
    }
    public long getVersion() {
        return this.version;
    }
    

    // Getters As Required DataTypes --------------------------------------------------------------
    public int getPositionStartAsInteger() {
    	return ObjectConverter.convert(this.positionStart, Integer.class);
    }
    public int getPositionEndAsInteger() {
    	return ObjectConverter.convert(this.positionEnd, Integer.class);
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

    
    // Setters ------------------------------------------------------------------------------------
    public void setOid(long oid) {
    	this.oid = oid;
    }
    public void setChromosomeId(String chromosomeId) {
    	this.chromosomeId = chromosomeId;
    }
    public void setInDelId(String inDelId) {
    	this.inDelId = inDelId;
    }
    public void setPositionStart(String positionStart) {
    	this.positionStart = positionStart;
    }
    public void setPositionEnd(String positionEnd) {
    	this.positionEnd = positionEnd;
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
    public void setBreedI(boolean breedI) {
    	this.breedI = breedI;
    }
    public void setBreedJ(boolean breedJ) {
    	this.breedJ = breedJ;
    }
    public void setBreedL(boolean breedL) {
    	this.breedL = breedL;
    }
    public void setBreedN(boolean breedN) {
    	this.breedN = breedN;
    }
    public void setBreedW(boolean breedW) {
    	this.breedW = breedW;
    }
    public void setBreedZ(boolean breedZ) {
    	this.breedZ = breedZ;
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
    public boolean isPositionStartAnInteger() {
         
    	if ( StringUtility.isItNumeric(this.positionStart) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isPositionEndAnInteger() {
        
    	if ( StringUtility.isItNumeric(this.positionEnd) ) {
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
    
    public boolean isDTOChromosomeNone() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome1() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_1)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome2() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_2)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome3() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_3)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome4() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_4)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome5() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_5)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome6() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_6)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome7() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_7)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome8() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_8)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome9() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_9)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome10() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_10)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome11() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_11)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome12() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_12)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome13() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_13)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome14() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_14)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome15() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_15)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome16() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_16)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome17() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_17)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome18() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_18)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome19() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_19)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome20() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_20)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome21() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_21)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome22() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_22)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome23() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_23)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome24() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_24)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome25() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_25)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome26() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_26)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome27() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_27)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome28() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_28)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosome32() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_32)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosomeLGE22C19W28_E50C23() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_LGE22C19W28_E50C23)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosomeLGE64() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_LGE64)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosomeW() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_W)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTOChromosomeZ() {
    	if ( this.chromosomeId.equals(ONLY_CHROMOSOME_Z)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isDTObreedI() {
    	if ( this.breedI ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTObreedJ() {
    	if ( this.breedJ ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTObreedL() {
    	if ( this.breedL ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTObreedN() {
    	if ( this.breedN ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTObreedW() {
    	if ( this.breedW ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDTObreedZ() {
    	if ( this.breedZ ) {
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
    public void parseInformation(){

    	String[] items = this.information.split(";");
        
    	String[] items2 = items[1].split("=");

    	String[] items3 = items2[1].split(",");

        List<String> itemList = Arrays.asList(items3);

        Iterator<String> iteratorInformation = itemList.iterator();
        
		this.breedI = false;
		this.breedJ = false;
		this.breedL = false;
		this.breedN = false;
		this.breedW = false;
		this.breedZ = false;

        while (iteratorInformation.hasNext()) {
        	
        	String breed = iteratorInformation.next();
        	
        	if ( breed.equals(ONLY_BREED_I)) {
        		this.breedI = true;
        	}
        	if ( breed.equals(ONLY_BREED_J)) {
        		this.breedJ = true;
        	}
        	if ( breed.equals(ONLY_BREED_L)) {
        		this.breedL = true;
        	}
        	if ( breed.equals(ONLY_BREED_N)) {
        		this.breedN = true;
        	}
        	if ( breed.equals(ONLY_BREED_W)) {
        		this.breedW = true;
        	}
        	if ( breed.equals(ONLY_BREED_Z)) {
        		this.breedZ = true;
        	}
        }
        
    }


    /*
     * Is this SNPChromosome VALID?
     */
    public boolean isThisAValidInsertionDeletion(){

        if (this.isPositionStartAnInteger() && 
        		this.isPositionEndAnInteger() && 
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
     * Convert a DTOInDel Object to an SNPChromosome Object
     */
    public SNPInsertionDeletion convertToSNPInsertionDeletion(){

    	String breedAllelesI = "";
    	String breedAllelesJ = "";
    	String breedAllelesL = "";
    	String breedAllelesN = "";
    	String breedAllelesW = "";
    	String breedAllelesZ = "";
    	
    	if ( this.isDTObreedI() ) {
    		breedAllelesI = this.getAlternative();
    	}
    	if ( this.isDTObreedJ() ) {
    		breedAllelesJ = this.getAlternative();
    	}
    	if ( this.isDTObreedL() ) {
    		breedAllelesL = this.getAlternative();
    	}
    	if ( this.isDTObreedN() ) {
    		breedAllelesN = this.getAlternative();
    	}
    	if ( this.isDTObreedW() ) {
    		breedAllelesW = this.getAlternative();
    	}
    	if ( this.isDTObreedZ() ) {
    		breedAllelesZ = this.getAlternative();
    	}

    	SNPInsertionDeletion snpinsertiondeletion = SNPInsertionDeletion.getBuilder(
 				this.getChromosomeId(),
 				this.getPositionStartAsInteger(),
 				this.getPositionEndAsInteger(),
 				this.getInDelId(),
 				this.getReference(),
 				this.getAlternative(),
 				this.getQuality(),
 				this.getFilter(),
 				this.getInformation(),
 				breedAllelesI,
 				breedAllelesJ,
 				breedAllelesL,
 				breedAllelesN,
 				breedAllelesW,
 				breedAllelesZ,
        	    this.getAminoAcidSubs(),
        	    this.getPredictionCategory(),
        	    this.getScoreSiftAsDouble(),
        	    this.getScoreConservationAsDouble(),
        	    this.getProteinAlignNumberAsLong(),
        	    this.getTotalAlignSequenceNumberAsLong(),
        	    this.getScoreProveanAsDouble()  
        		).build();
        
 		return snpinsertiondeletion;
    }

    
    public String toString() {
        return ToStringBuilder.reflectionToString(this, new CustomDateToStringStyle());
    }
}
