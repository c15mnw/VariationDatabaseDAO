package com.roslin.mwicks.spring.variation.model.ensemblgene;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

import java.util.Date;

/**
 * An entity class which contains the information of a single SNPChromosome Table Row.
 * @author Mike Wicks
 */
@Entity

@Table(name = "VSC_ENSEMBL_GENE")
@Transactional

public class EnsemblGene {
    
    // Constants ----------------------------------------------------------------------------------
	protected static final String STRAND_POSITIVE = "+";
	protected static final String STRAND_NEGATIVE = "-";


    // Properties  --------------------------------------------------------------------------------
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "VSE_OID", nullable = false)
    private Long oid;
    
    @Column(name = "VSE_ENSEMBL_GENE_ID", nullable = false)
    private String ensemblId;
    
    @Column(name = "VSE_REGION_TYPE", nullable = false)
    private String region;
    
    @Column(name = "VSE_CHROMOSOME_ID", nullable = false)
    private String chromosomeId;
    
    @Column(name = "VSE_START_POSITION", nullable = false)
    private Long start;    
    
    @Column(name = "VSE_END_POSITION", nullable = false)
    private Long end;
    
    @Column(name = "VSE_STRAND", nullable = false)
    private String strand;
    
    @Column(name = "VSE_CREATION_TIME", nullable = false)
    private Date creationTime;
    
    @Column(name = "VSE_MODIFICATION_TIME", nullable = true)
    private Date modificationTime;
    
    @Version
    @Column(name = "VSE_VERSION", nullable = false)
    private long version;
    

    // Getters ------------------------------------------------------------------------------------
    public Long getOid() {
    	return this.oid;
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
    public Long getStart() {
    	return this.start;
    }
    public Long getEnd() {
    	return this.end;
    }
    public String getStrand() {
    	return this.strand;
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
    /**
     * This setter method should only be used by unit tests.
     * @param oid
     */
    public void setOid(Long oid) {
    	this.oid = oid;
    }
    // Setters ------------------------------------------------------------------------------------
    public void setEnsemblId(String ensemblId) {
    	this.ensemblId = ensemblId;
    }
    public void setRegion(String region) {
    	this.region = region;
    }
    public void setChromosomeId(String chromosomeId) {
    	this.chromosomeId = chromosomeId;
    }
    public void setStart(Long start) {
    	this.start = start;
    }
    public void setEnd(Long end) {
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
    
    
    // Helpers ------------------------------------------------------------------------------------
    public boolean isStrandPositive() {
    	if ( this.strand.equals(STRAND_POSITIVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrandNegative() {
    	if ( this.strand.equals(STRAND_NEGATIVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    
    /*
     * Is this Component the same as the Supplied Component?
     */
    public boolean isSameAs(EnsemblGene ensemblgene){

        if (this.getOid() == ensemblgene.getOid() && 
        		this.getEnsemblId().equals(ensemblgene.getEnsemblId()) && 
        		this.getRegion().equals(ensemblgene.getRegion()) && 
        		this.getChromosomeId().equals(ensemblgene.getChromosomeId()) &&
        	    this.getStart() == ensemblgene.getStart() && 
        	    this.getEnd() == ensemblgene.getEnd() && 
        	    this.getStrand().equals(ensemblgene.getStrand()) 
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
    	
        return (other instanceof EnsemblGene) && (oid != null) 
        		? oid.equals(((EnsemblGene) other).oid) 
        		: (other == this);
    }
    

    public void update(
    		String ensemblId,
    		String region,
    		String chromosomeId,    
    		Long start,
    		Long end,
    		String strand
    		) {

    	this.ensemblId = ensemblId;
    	this.region = region;
    	this.chromosomeId = chromosomeId;
    	this.start = start;
    	this.end = end;
    	this.strand = strand;
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

    // EnsemblGene Builder ---------------------------------------------------------------------
    /**
     * Gets a builder which is used to create SNPChromosome objects.
     * 
     * @param snpId The SNP ID
     * @param chromosomeId The Chromosome ID
     * @param position The SNP Position or coordinate
     * @param reference The Reference or Expected Nucleobase
     * @param alternative The Alternative Nucleobase as found
     * @param region The Region
     * 
     * @return  A new Builder instance.
     */
    public static Builder getBuilder(
    		String ensemblId,
    		String region,
    		String chromosomeId,    
    		Long start,
    		Long end,
    		String strand
    		) {
    	
        return new Builder(
        		ensemblId,
        		region,
        		chromosomeId,    
        		start,
        		end,
        		strand
        		);
    }
    
    /**
     * A Builder class used to create new SNPChromosome objects.
     */
    public static class Builder {
    	
    	EnsemblGene built;

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
        		String ensemblId,
        		String region,
        		String chromosomeId,    
        		Long start,
        		Long end,
        		String strand
        		) {
        	
            built = new EnsemblGene();
            
        	built.ensemblId = ensemblId;
        	built.region = region;
        	built.chromosomeId = chromosomeId;
        	built.start = start;
        	built.end = end;
        	built.strand = strand;
        }

        /**
         * Builds the new SNPChromosome object.
         * 
         * @return  The created SNPChromosome object.
         */
        public EnsemblGene build() {
        	
            return built;
        }
    }

}
