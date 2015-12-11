package com.roslin.mwicks.spring.variation.dto;

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
    private String strainPAllele;
    
    @NotEmpty
    private String strainPAlleleFixed;
    
    @NotEmpty
    private String strainPAlleleRatio;
    
    @NotEmpty
    private String strainWAllele;
    
    @NotEmpty
    private String strainWAlleleFixed;
    
    @NotEmpty
    private String strainWAlleleRatio;
    
    @NotEmpty
    private String strainNAllele;
    
    @NotEmpty
    private String strainNAlleleFixed;
    
    @NotEmpty
    private String strainNAlleleRatio;
    
    @NotEmpty
    private String strain15IAllele;
    
    @NotEmpty
    private String strain15IAlleleFixed;
    
    @NotEmpty
    private String strain15IAlleleRatio;
    
    @NotEmpty
    private String strainZeroAllele;
    
    @NotEmpty
    private String strainZeroAlleleFixed;
    
    @NotEmpty
    private String strainZeroAlleleRatio;
    
    @NotEmpty
    private String strain6Allele;
    
    @NotEmpty
    private String strain6AlleleFixed;
    
    @NotEmpty
    private String strain6AlleleRatio;
    
    @NotEmpty
    private String strainCAllele;
    
    @NotEmpty
    private String strainCAlleleFixed;
    
    @NotEmpty
    private String strainCAlleleRatio;
    
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
    	return strain7Allele;
    }
    public String getStrain7AlleleFixed() {
    	return strain7AlleleFixed;
    }
    public String getStrain7AlleleRatio() {
    	return strain7AlleleRatio;
    }
    public String getStrainPAllele() {
    	return strainPAllele;
    }
    public String getStrainPAlleleFixed() {
    	return strainPAlleleFixed;
    }
    public String getStrainPAlleleRatio() {
    	return strainPAlleleRatio;
    }
    public String getStrainWAllele() {
    	return strainWAllele;
    }
    public String getStrainWAlleleFixed() {
    	return strainWAlleleFixed;
    }
    public String getStrainWAlleleRatio() {
    	return strainWAlleleRatio;
    }
    public String getStrainNAllele() {
    	return strainNAllele;
    }
    public String getStrainNAlleleFixed() {
    	return strainNAlleleFixed;
    }
    public String getStrainNAlleleRatio() {
    	return strainNAlleleRatio;
    }
    public String getStrain15IAllele() {
    	return strain15IAllele;
    }
    public String getStrain15IAlleleFixed() {
    	return strain15IAlleleFixed;
    }
    public String getStrain15IAlleleRatio() {
    	return strain15IAlleleRatio;
    }
    public String getStrainZeroAllele() {
    	return strainZeroAllele;
    }
    public String getStrainZeroAlleleFixed() {  
    	return strainZeroAlleleFixed;
    }
    public String getStrainZeroAlleleRatio() {
    	return strainZeroAlleleRatio;
    }
    public String getStrain6Allele() {
    	return strain6Allele;
    }
    public String getStrain6AlleleFixed() {
    	return strain6AlleleFixed;
    }
    public String getStrain6AlleleRatio() {
    	return strain6AlleleRatio;
    }
    public String getStrainCAllele() {
    	return strainCAllele;
    }
    public String getStrainCAlleleFixed() {
    	return strainCAlleleFixed;
    }
    public String getStrainCAlleleRatio() {
    	return strainCAlleleRatio;
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
    	return ObjectConverter.convert(oid, Long.class);
    }
    public int getPositionAsInteger() {
    	return ObjectConverter.convert(position, Integer.class);
    }
    public long getStrain7AlleleRatioAsLong() {
    	return ObjectConverter.convert(strain7AlleleRatio, Long.class);
    }
    public long getStrainPAlleleRatioAsLong() {
    	return ObjectConverter.convert(strainPAlleleRatio, Long.class);
    }
    public long getStrainWAlleleRatioAsLong() {
    	return ObjectConverter.convert(strainWAlleleRatio, Long.class);
    }
    public long getStrainNAlleleRatioAsLong() {
    	return ObjectConverter.convert(strainNAlleleRatio, Long.class);
    }
    public long getStrain15IAlleleRatioAsLong() {
    	return ObjectConverter.convert(strain15IAlleleRatio, Long.class);
    }
    public long getStrainZeroAlleleRatioAsLong() {
    	return ObjectConverter.convert(strainZeroAlleleRatio, Long.class);
    }
    public long getStrain6AlleleRatioAsLong() {
    	return ObjectConverter.convert(strain6AlleleRatio, Long.class);
    }
    public long getStrainCAlleleRatioAsLong() {
    	return ObjectConverter.convert(strainCAlleleRatio, Long.class);
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
    public void setStrainPAllele(String strainPAllele) {
    	this.strainPAllele = strainPAllele;
    }
    public void setStrainPAlleleFixed(String strainPAlleleFixed) {
    	this.strainPAlleleFixed = strainPAlleleFixed;
    }
    public void setStrainPAlleleRatio(String strainPAlleleRatio) {
    	this.strainPAlleleRatio = strainPAlleleRatio;
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
    public void setStrainNAllele(String strainNAllele) {
    	this.strainNAllele = strainNAllele;
    }
    public void setStrainNAlleleFixed(String strainNAlleleFixed) {
    	this.strainNAlleleFixed = strainNAlleleFixed;
    }
    public void setStrainNAlleleRatio(String strainNAlleleRatio) {
    	this.strainNAlleleRatio = strainNAlleleRatio;
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
    public void setStrainZeroAllele(String strainZeroAllele) {
    	this.strainZeroAllele = strainZeroAllele;
    }
    public void setStrainZeroAlleleFixed(String strainZeroAlleleFixed) {  
    	this.strainZeroAlleleFixed = strainZeroAlleleFixed;
    }
    public void setStrainZeroAlleleRatio(String strainZeroAlleleRatio) {
    	this.strainZeroAlleleRatio = strainZeroAlleleRatio;
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
    public void setStrainCAllele(String strainCAllele) {
    	this.strainCAllele = strainCAllele;
    }
    public void setStrainCAlleleFixed(String strainCAlleleFixed) {
    	this.strainCAlleleFixed = strainCAlleleFixed;
    }
    public void setStrainCAlleleRatio(String strainCAlleleRatio) {
    	this.strainCAlleleRatio = strainCAlleleRatio;
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
    public boolean isStrain7AlleleRatioALong() {

    	if ( StringUtility.isItNumeric(this.strain7AlleleRatio) ) {
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
    public boolean isStrainPAlleleRatioALong() {

    	if ( StringUtility.isItNumeric(this.strainPAlleleRatio) ) {
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
    public boolean isStrainWAlleleRatioALong() {

    	if ( StringUtility.isItNumeric(this.strainWAlleleRatio) ) {
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
    public boolean isStrainNAlleleRatioALong() {

    	if ( StringUtility.isItNumeric(this.strainNAlleleRatio) ) {
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
    public boolean isStrain15IAlleleRatioALong() {

    	if ( StringUtility.isItNumeric(this.strain15IAlleleRatio) ) {
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
    public boolean isStrainZeroAlleleRatioALong() {

    	if ( StringUtility.isItNumeric(this.strainZeroAlleleRatio) ) {
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
    public boolean isStrain6AlleleRatioALong() {

    	if ( StringUtility.isItNumeric(this.strain6AlleleRatio) ) {
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
    public boolean isStrainCAlleleRatioALong() {

    	if ( StringUtility.isItNumeric(this.strainCAlleleRatio) ) {
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
        	    this.isStrainCAlleleFixedAValidValue()  
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
        		this.getStrain7AlleleRatioAsLong(),
        		this.getStrainPAllele(),
        		this.getStrainPAlleleFixed(),
        		this.getStrainPAlleleRatioAsLong(),
        		this.getStrainWAllele(),
        		this.getStrainWAlleleFixed(),
        		this.getStrainWAlleleRatioAsLong(),
        		this.getStrainNAllele(),
        		this.getStrainNAlleleFixed(),
        		this.getStrainNAlleleRatioAsLong(),
        		this.getStrain15IAllele(),
        		this.getStrain15IAlleleFixed(),
        		this.getStrain15IAlleleRatioAsLong(),
        		this.getStrainZeroAllele(),
        		this.getStrainZeroAlleleFixed(),
        		this.getStrainZeroAlleleRatioAsLong(),
        		this.getStrain6Allele(),
        		this.getStrain6AlleleFixed(),
        		this.getStrain6AlleleRatioAsLong(),
        		this.getStrainCAllele(),
        		this.getStrainCAlleleFixed(),
        		this.getStrainCAlleleRatioAsLong()
        		).build();
        
        return snpchromosome;
    }

    
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
