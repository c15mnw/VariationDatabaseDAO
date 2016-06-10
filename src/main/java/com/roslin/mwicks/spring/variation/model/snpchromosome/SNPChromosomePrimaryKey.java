package com.roslin.mwicks.spring.variation.model.snpchromosome;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import java.io.Serializable;

import com.roslin.mwicks.spring.variation.format.CustomDateToStringStyle;

/**
 * An entity class which contains the information of a single SNPChromosome Table Row.
 * @author Mike Wicks
 * @Entity
 * @Transactional
 */

@Embeddable
public class SNPChromosomePrimaryKey implements Serializable {
    
    // Constants ----------------------------------------------------------------------------------

	
	// Properties ---------------------------------------------------------------------------------
	@Column(name = "VSS_OID", nullable = false)
    private Long oid;

	@Column(name = "VSS_PARTITION_ID", nullable = false)
    private Long partitionId;
    

    // Constructor --------------------------------------------------------------------------------
    public SNPChromosomePrimaryKey() {

    }

    
    // Getters ------------------------------------------------------------------------------------
    public long getOid() {
    	return this.oid;
    }
    public long getPartitionId() {
    	return this.partitionId;
    }
    
    
    // Setters ------------------------------------------------------------------------------------
    public void setOid(long oid) {
    	this.oid = oid;
    }
    public void setPartitionId(long partitionId) {
    	this.partitionId = partitionId;
    }
    
    
    // Helpers ------------------------------------------------------------------------------------    

    /*
     * The OID is unique for each Component.
     *  So this should compare Component by OID only.
     */
    @Override
    public boolean equals(Object object) {
    	
    	if ( object instanceof SNPChromosomePrimaryKey ) {
    		
    		SNPChromosomePrimaryKey snpChromosomePrimaryKey = (SNPChromosomePrimaryKey) object;
 
            if ( snpChromosomePrimaryKey.getOid() != this.oid ) {
            	
                return false;
            }
 
            if ( snpChromosomePrimaryKey.getPartitionId() != this.partitionId ){
            	
                return false;
            }
 
            return true;
        }

    	return false;
    }
    
    
    @Override
    public int hashCode() {
 
    	return this.oid.hashCode() + this.partitionId.hashCode();
    }
 
    
    public String toString() {
    	
        return ToStringBuilder.reflectionToString(this, new CustomDateToStringStyle());
    }

}
