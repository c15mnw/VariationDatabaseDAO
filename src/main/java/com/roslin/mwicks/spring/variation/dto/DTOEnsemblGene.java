package com.roslin.mwicks.spring.variation.dto;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.hibernate.validator.constraints.NotEmpty;

import com.roslin.mwicks.spring.variation.model.ensemblgene.EnsemblGene;
import com.roslin.mwicks.utility.ObjectConverter;
import com.roslin.mwicks.utility.StringUtility;


/**
 * A DTO object which is used as a form object
 * in create person and edit person forms.
 * @author Mike Wicks
 */
public class DTOEnsemblGene {
    
    private Long oid;
    
    @NotEmpty
    private String ensemblId;
    
    @NotEmpty
    private String region;
    
    @NotEmpty
    private String chromosomeId;
    
    @NotEmpty
    private String start;    
    
    @NotEmpty
    private String end;
    
    @NotEmpty
    private String strand;
    
    @NotEmpty
    private Date creationTime;
    
    @NotEmpty
    private Date modificationTime;
    
    @NotEmpty
    private long version;


    public DTOEnsemblGene() {

    }

    // Getters ------------------------------------------------------------------------------------
    public Long getOid() {
    	return oid;
    }
    public String getEnsemblId() {
    	return this.ensemblId;
    }
    public String getRegion() {
    	return this.region;
    }
    public String getChromosomeId() {
    	return chromosomeId;
    }
    public String getStart() {
    	return this.start;
    }
    public String getEnd() {
    	return this.end;
    }
    public String getStrand() {
    	return this.strand;
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
    public Long getStartAsLong() {
    	return ObjectConverter.convert(this.start, Long.class);
    }
    public Long getEndAsLong() {
    	return ObjectConverter.convert(this.end, Long.class);
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
    public void setEnsemblId(String ensemblId) {
    	this.ensemblId = ensemblId;
    }
    public void setRegion(String region) {
    	this.region = region;
    }
    public void setChromosomeId(String chromosomeId) {
    	this.chromosomeId = chromosomeId;
    }
    public void setStart(String start) {
    	this.start = start;
    }
    public void setEnd(String end) {
    	this.end = end;
    }
    public void setStrand(String strand) {
    	this.strand = strand;
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
    public boolean isStartALong() {
         
    	if ( StringUtility.isItNumeric(this.start) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isEndALong() {
        
    	if ( StringUtility.isItNumeric(this.end) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    

    // Helpers ------------------------------------------------------------------------------------    
    /*
     * Is this DTOEnsemblGene VALID?
     */
    public boolean isThisAValidEnsemblGene(){

        if (this.isStartALong() && 
        	    this.isEndALong() 
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
    public EnsemblGene convertToEnsemblGene(){

    	EnsemblGene ensemblgene = EnsemblGene.getBuilder(
    			this.getEnsemblId(),
    		    this.getRegion(),
    		    this.getChromosomeId(),
    		    this.getStartAsLong(),
    		    this.getEndAsLong(),
    		    this.getStrand()
        		).build();
        
        return ensemblgene;
    }

    
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
