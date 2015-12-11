package com.roslin.mwicks.spring.variation.model.snpchromosome;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

import java.util.Date;

import com.roslin.mwicks.utility.ObjectConverter;

/**
 * An entity class which contains the information of a single SNPChromosome3 Table Row.
 * @author Mike Wicks
 */
@Entity
@Table(name = "VSC_SNP_CHROMOSOME_3")
@Transactional

public class SNPChromosome3 {
    
    // Constants ----------------------------------------------------------------------------------
	protected static final String STRING_NA = "N/A";
	protected static final String STRING_FIXED = "Fixed";
	protected static final String STRING_NOT_FIXED = "Not Fixed";
	protected static final String STRING_REFERENCE = "Ref.";

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
    private long strain7AlleleRatio;
    
    @Column(name = "VSS_STRAIN_P_ALTERNATIVE_ALLELE", nullable = false)
    private String strainPAllele;
    
    @Column(name = "VSS_STRAIN_P_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private String strainPAlleleFixed;
    
    @Column(name = "VSS_STRAIN_P_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private long strainPAlleleRatio;
    
    @Column(name = "VSS_STRAIN_W_ALTERNATIVE_ALLELE", nullable = false)
    private String strainWAllele;
    
    @Column(name = "VSS_STRAIN_W_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private String strainWAlleleFixed;
    
    @Column(name = "VSS_STRAIN_W_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private long strainWAlleleRatio;
    
    @Column(name = "VSS_STRAIN_N_ALTERNATIVE_ALLELE", nullable = false)
    private String strainNAllele;
    
    @Column(name = "VSS_STRAIN_N_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private String strainNAlleleFixed;
    
    @Column(name = "VSS_STRAIN_N_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private long strainNAlleleRatio;
    
    @Column(name = "VSS_STRAIN_15I_ALTERNATIVE_ALLELE", nullable = false)
    private String strain15IAllele;
    
    @Column(name = "VSS_STRAIN_15I_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private String strain15IAlleleFixed;
    
    @Column(name = "VSS_STRAIN_15I_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private long strain15IAlleleRatio;
    
    @Column(name = "VSS_STRAIN_ZERO_ALTERNATIVE_ALLELE", nullable = false)
    private String strainZeroAllele;
    
    @Column(name = "VSS_STRAIN_ZERO_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private String strainZeroAlleleFixed;
    
    @Column(name = "VSS_STRAIN_ZERO_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private long strainZeroAlleleRatio;
    
    @Column(name = "VSS_STRAIN_6_ALTERNATIVE_ALLELE", nullable = false)
    private String strain6Allele;
    
    @Column(name = "VSS_STRAIN_6_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private String strain6AlleleFixed;
    
    @Column(name = "VSS_STRAIN_6_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private long strain6AlleleRatio;
    
    @Column(name = "VSS_STRAIN_C_ALTERNATIVE_ALLELE", nullable = false)
    private String strainCAllele;
    
    @Column(name = "VSS_STRAIN_C_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private String strainCAlleleFixed;
    
    @Column(name = "VSS_STRAIN_C_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private long strainCAlleleRatio;
    
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
    public String getEnsemblTranscriptMultiLines() {
    	return this.ensemblTranscript.replaceAll(",", ",\n").replaceAll(".", ".\n").replaceAll(":", ":\n").replaceAll(";", ";\n");
    }
    public String getEnsemblAnnotationMultiLines() {
    	return this.ensemblAnnotation.replaceAll(",", ",\n").replaceAll(".", ".\n").replaceAll(":", ":\n").replaceAll(";", ";\n");
    }
    public String getStrain7Allele() {
    	return this.strain7Allele;
    }
    public String getStrain7AlleleFixed() {
    	return this.strain7AlleleFixed;
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
    public long getStrain7AlleleRatio() {
    	return this.strain7AlleleRatio;
    }
    public String getStrainPAllele() {
    	return this.strainPAllele;
    }
    public String getStrainPAlleleFixed() {
    	return this.strainPAlleleFixed;
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
    public long getStrainPAlleleRatio() {
    	return this.strainPAlleleRatio;
    }
    public String getStrainWAllele() {
    	return this.strainWAllele;
    }
    public String getStrainWAlleleFixed() {
    	return this.strainWAlleleFixed;
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
    public long getStrainWAlleleRatio() {
    	return this.strainWAlleleRatio;
    }
    public String getStrainNAllele() {
    	return this.strainNAllele;
    }
    public String getStrainNAlleleFixed() {
    	return this.strainNAlleleFixed;
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
    public long getStrainNAlleleRatio() {
    	return this.strainNAlleleRatio;
    }
    public String getStrain15IAllele() {
    	return this.strain15IAllele;
    }
    public String getStrain15IAlleleFixed() {
    	return this.strain15IAlleleFixed;
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
    public long getStrain15IAlleleRatio() {
    	return this.strain15IAlleleRatio;
    }
    public String getStrainZeroAllele() {
    	return this.strainZeroAllele;
    }
    public String getStrainZeroAlleleFixed() {  
    	return this.strainZeroAlleleFixed;
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
    public long getStrainZeroAlleleRatio() {
    	return this.strainZeroAlleleRatio;
    }
    public String getStrain6Allele() {
    	return this.strain6Allele;
    }
    public String getStrain6AlleleFixed() {
    	return this.strain6AlleleFixed;
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
    public long getStrain6AlleleRatio() {
    	return this.strain6AlleleRatio;
    }
    public String getStrainCAllele() {
    	return this.strainCAllele;
    }
    public String getStrainCAlleleFixed() {
    	return this.strainCAlleleFixed;
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
    public long getStrainCAlleleRatio() {
    	return this.strainCAlleleRatio;
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
    	return ObjectConverter.convert(oid, String.class);
    }
    public String getPositionAsString() {
    	return ObjectConverter.convert(position, String.class);
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
    public String getCreationTimeAsString() {
    	return ObjectConverter.convert(creationTime, String.class);
    }
    public String getModificationTimeAsString() {
    	return ObjectConverter.convert(modificationTime, String.class);
    }
    public String getVersionAsString() {
    	return ObjectConverter.convert(version, String.class);
    }

    // Getters As Strings Enclosed in Quotes ------------------------------------------------------
    public String getOidAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(oid, String.class) + '\"';
    }
    public String getPositionAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(position, String.class) + '\"';
    }
    public String getStrain7AlleleFixedQuoted() {
    	return '\"' + strain7AlleleFixed + '\"';
    }
    public String getStrain7AlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strain7AlleleRatio, String.class) + '\"';
    }
    public String getStrainPAlleleFixedQuoted() {
    	return '\"' + strainPAlleleFixed + '\"';
    }
    public String getStrainPAlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strainPAlleleRatio, String.class) + '\"';
    }
    public String getStrainWAlleleFixedQuoted() {
    	return '\"' + strainWAlleleFixed + '\"';
    }
    public String getStrainWAlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strainWAlleleRatio, String.class) + '\"';
    }
    public String getStrainNAlleleFixedQuoted() {
    	return '\"' + strainNAlleleFixed + '\"';
    }
    public String getStrainNAlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strainNAlleleRatio, String.class) + '\"';
    }
    public String getStrain15IAlleleFixedQuoted() {
    	return '\"' + strain15IAlleleFixed + '\"';
    }
    public String getStrain15IAlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strain15IAlleleRatio, String.class) + '\"';
    }
    public String getStrainZeroAlleleFixedQuoted() {  
    	return '\"' + strainZeroAlleleFixed + '\"';
    }
    public String getStrainZeroAlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strainZeroAlleleRatio, String.class) + '\"';
    }
    public String getStrain6AlleleFixedQuoted() {
    	return '\"' + strain6AlleleFixed + '\"';
    }
    public String getStrain6AlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strain6AlleleRatio, String.class) + '\"';
    }
    public String getStrainCAlleleFixedQuoted() {
    	return '\"' + strainCAlleleFixed + '\"';
    }
    public String getStrainCAlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strainCAlleleRatio, String.class) + '\"';
    }
    public String getCreationTimeAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(creationTime, String.class) + '\"';
    }
    public String getModificationTimeAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(modificationTime, String.class) + '\"';
    }
    public String getVersionAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(version, String.class) + '\"';
    }
    public String getSnpIdQuoted() {
    	return '\"' + snpId + '\"';
    }
    public String getChromosomeIdQuoted() {
    	return '\"' + chromosomeId + '\"';
    }
    public String getReferenceQuoted() {
    	return '\"' + reference + '\"';    
    }
    public String getAlternativeQuoted() {
    	return '\"' + alternative + '\"';
    }
    public String getRegionQuoted() {
    	return '\"' + region + '\"';
    }
    public String getEnsemblGeneQuoted() {
    	return '\"' + ensemblGene + '\"';
    }
    public String getEnsemblTranscriptQuoted() {
    	return '\"' + ensemblTranscript + '\"';
    }
    public String getEnsemblAnnotationQuoted() {
    	return '\"' + ensemblAnnotation + '\"';
    }
    public String getStrain7AlleleQuoted() {
    	return '\"' + strain7Allele + '\"';
    }
    public String getStrainPAlleleQuoted() {
    	return '\"' + strainPAllele + '\"';
    }
    public String getStrainWAlleleQuoted() {
    	return '\"' + strainWAllele + '\"';
    }
    public String getStrainNAlleleQuoted() {
    	return '\"' + strainNAllele + '\"';
    }
    public String getStrain15IAlleleQuoted() {
    	return '\"' + strain15IAllele + '\"';
    }
    public String getStrainZeroAlleleQuoted() {
    	return '\"' + strainZeroAllele + '\"';
    }
    public String getStrain6AlleleQuoted() {
    	return '\"' + strain6Allele + '\"';
    }
    public String getStrainCAlleleQuoted() {
    	return '\"' + strainCAllele + '\"';
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
    public void setStrain7AlleleRatio(long strain7AlleleRatio) {
    	this.strain7AlleleRatio = strain7AlleleRatio;
    }
    public void setStrainPAllele(String strainPAllele) {
    	this.strainPAllele = strainPAllele;
    }
    public void setStrainPAlleleFixed(String strainPAlleleFixed) {
    	this.strainPAlleleFixed = strainPAlleleFixed;
    }
    public void setStrainPAlleleRatio(long strainPAlleleRatio) {
    	this.strainPAlleleRatio = strainPAlleleRatio;
    }
    public void setStrainWAllele(String strainWAllele) {
    	this.strainWAllele = strainWAllele;
    }
    public void setStrainWAlleleFixed(String strainWAlleleFixed) {
    	this.strainWAlleleFixed = strainWAlleleFixed;
    }
    public void setStrainWAlleleRatio(long strainWAlleleRatio) {
    	this.strainWAlleleRatio = strainWAlleleRatio;
    }
    public void setStrainNAllele(String strainNAllele) {
    	this.strainNAllele = strainNAllele;
    }
    public void setStrainNAlleleFixed(String strainNAlleleFixed) {
    	this.strainNAlleleFixed = strainNAlleleFixed;
    }
    public void setStrainNAlleleRatio(long strainNAlleleRatio) {
    	this.strainNAlleleRatio = strainNAlleleRatio;
    }
    public void setStrain15IAllele(String strain15IAllele) {
    	this.strain15IAllele = strain15IAllele;
    }
    public void setStrain15IAlleleFixed(String strain15IAlleleFixed) {
    	this.strain15IAlleleFixed = strain15IAlleleFixed;
    }
    public void setStrain15IAlleleRatio(long strain15IAlleleRatio) {
    	this.strain15IAlleleRatio = strain15IAlleleRatio;
    }
    public void setstrainZeroAllele(String strainZeroAllele) {
    	this.strainZeroAllele = strainZeroAllele;
    }
    public void setstrainZeroAlleleFixed(String strainZeroAlleleFixed) {  
    	this.strainZeroAlleleFixed = strainZeroAlleleFixed;
    }
    public void setstrainZeroAlleleRatio(long strainZeroAlleleRatio) {
    	this.strainZeroAlleleRatio = strainZeroAlleleRatio;
    }
    public void setStrain6Allele(String strain6Allele) {
    	this.strain6Allele = strain6Allele;
    }
    public void setStrain6AlleleFixed(String strain6AlleleFixed) {
    	this.strain6AlleleFixed = strain6AlleleFixed;
    }
    public void setStrain6AlleleRatio(long strain6AlleleRatio) {
    	this.strain6AlleleRatio = strain6AlleleRatio;
    }
    public void setStrainCAllele(String strainCAllele) {
    	this.strainCAllele = strainCAllele;
    }
    public void setStrainCAlleleFixed(String strainCAlleleFixed) {
    	this.strainCAlleleFixed = strainCAlleleFixed;
    }
    public void setStrainCAlleleRatio(long strainCAlleleRatio) {
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

    // Helpers ------------------------------------------------------------------------------------
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
        snpchromosome.setStrainPAllele(this.getStrainPAllele());
        snpchromosome.setStrainPAlleleFixed(this.getStrainPAlleleFixed());
        snpchromosome.setStrainPAlleleRatio(this.getStrainPAlleleRatio());
        snpchromosome.setStrainWAllele(this.getStrainWAllele());
        snpchromosome.setStrainWAlleleFixed(this.getStrainWAlleleFixed());
        snpchromosome.setStrainWAlleleRatio(this.getStrainWAlleleRatio());
        snpchromosome.setStrainNAllele(this.getStrainNAllele());
        snpchromosome.setStrainNAlleleFixed(this.getStrainNAlleleFixed());
        snpchromosome.setStrainNAlleleRatio(this.getStrainNAlleleRatio());
        snpchromosome.setStrain15IAllele(this.getStrain15IAllele());
        snpchromosome.setStrain15IAlleleFixed(this.getStrain15IAlleleFixed());
        snpchromosome.setStrain15IAlleleRatio(this.getStrain15IAlleleRatio());
        snpchromosome.setstrainZeroAllele(this.getStrainZeroAllele());
        snpchromosome.setstrainZeroAlleleFixed(this.getStrainZeroAlleleFixed());  
        snpchromosome.setstrainZeroAlleleRatio(this.getStrainZeroAlleleRatio());
        snpchromosome.setStrain6Allele(this.getStrain6Allele());
        snpchromosome.setStrain6AlleleFixed(this.getStrain6AlleleFixed());
        snpchromosome.setStrain6AlleleRatio(this.getStrain6AlleleRatio());
        snpchromosome.setStrainCAllele(this.getStrainCAllele());
        snpchromosome.setStrainCAlleleFixed(this.getStrainCAlleleFixed());
        snpchromosome.setStrainCAlleleRatio(this.getStrainCAlleleRatio());

    	return snpchromosome;
    }
    
    
    /*
     * Is this Component the same as the Supplied Component?
     */
    public boolean isSameAs(SNPChromosome3 snpchromosome){

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
        	    this.getStrainPAllele().equals(snpchromosome.getStrainPAllele()) && 
        	    this.getStrainPAlleleFixed() == snpchromosome.getStrainPAlleleFixed() && 
        	    this.getStrainPAlleleRatio() == snpchromosome.getStrainPAlleleRatio() && 
        	    this.getStrainWAllele().equals(snpchromosome.getStrainWAllele()) && 
        	    this.getStrainWAlleleFixed() == snpchromosome.getStrainWAlleleFixed() && 
        	    this.getStrainWAlleleRatio() == snpchromosome.getStrainWAlleleRatio() && 
        	    this.getStrainNAllele().equals(snpchromosome.getStrainNAllele()) && 
        	    this.getStrainNAlleleFixed() == snpchromosome.getStrainNAlleleFixed() && 
        	    this.getStrainNAlleleRatio() == snpchromosome.getStrainNAlleleRatio() && 
        	    this.getStrain15IAllele().equals(snpchromosome.getStrain15IAllele()) && 
        	    this.getStrain15IAlleleFixed() == snpchromosome.getStrain15IAlleleFixed()  && 
        	    this.getStrain15IAlleleRatio() == snpchromosome.getStrain15IAlleleRatio() && 
        	    this.getStrainZeroAllele().equals(snpchromosome.getStrainZeroAllele()) && 
        	    this.getStrainZeroAlleleFixed() == snpchromosome.getStrainZeroAlleleFixed() &&  
        	    this.getStrainZeroAlleleRatio() == snpchromosome.getStrainZeroAlleleRatio() && 
        	    this.getStrain6Allele().equals(snpchromosome.getStrain6Allele()) && 
        	    this.getStrain6AlleleFixed() == snpchromosome.getStrain6AlleleFixed() && 
        	    this.getStrain6AlleleRatio() == snpchromosome.getStrain6AlleleRatio() && 
        	    this.getStrainCAllele().equals(snpchromosome.getStrainCAllele()) && 
        	    this.getStrainCAlleleFixed() == snpchromosome.getStrainCAlleleFixed() && 
        	    this.getStrainCAlleleRatio() == snpchromosome.getStrainCAlleleRatio() 
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
    	
        return (other instanceof SNPChromosome3) && (oid != null) 
        		? oid.equals(((SNPChromosome3) other).oid) 
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
    		long strain7AlleleRatio,
    		String strainPAllele,
    		String strainPAlleleFixed,
    		long strainPAlleleRatio,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		long strainWAlleleRatio,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		long strainNAlleleRatio,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		long strain15IAlleleRatio,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		long strainZeroAlleleRatio,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		long strain6AlleleRatio,
    		String strainCAllele,
    		String strainCAlleleFixed,
    		long strainCAlleleRatio ) {

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
    	this.strainPAllele = strainPAllele;
    	this.strainPAlleleFixed = strainPAlleleFixed;
    	this.strainPAlleleRatio = strainPAlleleRatio;
    	this.strainWAllele = strainWAllele;
    	this.strainWAlleleFixed = strainWAlleleFixed;
    	this.strainWAlleleRatio = strainWAlleleRatio;
    	this.strainNAllele = strainNAllele;
    	this.strainNAlleleFixed = strainNAlleleFixed;
    	this.strainNAlleleRatio = strainNAlleleRatio;
    	this.strain15IAllele = strain15IAllele;
    	this.strain15IAlleleFixed = strain15IAlleleFixed;
    	this.strain15IAlleleRatio = strain15IAlleleRatio;
    	this.strainZeroAllele = strainZeroAllele;
    	this.strainZeroAlleleFixed = strainZeroAlleleFixed;
    	this.strainZeroAlleleRatio = strainZeroAlleleRatio;
    	this.strain6Allele = strain6Allele;
    	this.strain6AlleleFixed = strain6AlleleFixed;
    	this.strain6AlleleRatio = strain6AlleleRatio;
    	this.strainCAllele = strainCAllele;
    	this.strainCAlleleFixed = strainCAlleleFixed;
    	this.strainCAlleleRatio = strainCAlleleRatio;
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

    // SNPChromosome3 Builder ---------------------------------------------------------------------
    /**
     * Gets a builder which is used to create SNPChromosome3 objects.
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
     * @param strainZeroAllele For Strain ZERO the Alternative Allele
     * @param strainZeroAlleleFixed For Strain ZERO is this fixed or not
     * @param strainZeroAlleleRatio For Strain ZERO for not fixed alleles what is the ratio that this occurs else 1 for fixed
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
    		long strain7AlleleRatio,
    		String strainPAllele,
    		String strainPAlleleFixed,
    		long strainPAlleleRatio,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		long strainWAlleleRatio,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		long strainNAlleleRatio,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		long strain15IAlleleRatio,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		long strainZeroAlleleRatio,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		long strain6AlleleRatio,
    		String strainCAllele,
    		String strainCAlleleFixed,
    		long strainCAlleleRatio ) {
    	
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
        		strainPAllele,
        		strainPAlleleFixed,
        		strainPAlleleRatio,
        		strainWAllele,
        		strainWAlleleFixed,
        		strainWAlleleRatio,
        		strainNAllele,
        		strainNAlleleFixed,
        		strainNAlleleRatio,
        		strain15IAllele,
        		strain15IAlleleFixed,
        		strain15IAlleleRatio,
        		strainZeroAllele,
        		strainZeroAlleleFixed,
        		strainZeroAlleleRatio,
        		strain6Allele,
        		strain6AlleleFixed,
        		strain6AlleleRatio,
        		strainCAllele,
        		strainCAlleleFixed,
        		strainCAlleleRatio );
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
        		snpchromosome.getStrainPAllele(),
        		snpchromosome.getStrainPAlleleFixed(),
        		snpchromosome.getStrainPAlleleRatio(),
        		snpchromosome.getStrainWAllele(),
        		snpchromosome.getStrainWAlleleFixed(),
        		snpchromosome.getStrainWAlleleRatio(),
        		snpchromosome.getStrainNAllele(),
        		snpchromosome.getStrainNAlleleFixed(),
        		snpchromosome.getStrainNAlleleRatio(),
        		snpchromosome.getStrain15IAllele(),
        		snpchromosome.getStrain15IAlleleFixed(),
        		snpchromosome.getStrain15IAlleleRatio(),
        		snpchromosome.getStrainZeroAllele(),
        		snpchromosome.getStrainZeroAlleleFixed(),
        		snpchromosome.getStrainZeroAlleleRatio(),
        		snpchromosome.getStrain6Allele(),
        		snpchromosome.getStrain6AlleleFixed(),
        		snpchromosome.getStrain6AlleleRatio(),
        		snpchromosome.getStrainCAllele(),
        		snpchromosome.getStrainCAlleleFixed(),
        		snpchromosome.getStrainCAlleleRatio()
        		);
    }
    

    /**
     * A Builder class used to create new SNPChromosome3 objects.
     */
    public static class Builder {
    	
        SNPChromosome3 built;

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
        		long strain7AlleleRatio,
        		String strainPAllele,
        		String strainPAlleleFixed,
        		long strainPAlleleRatio,
        		String strainWAllele,
        		String strainWAlleleFixed,
        		long strainWAlleleRatio,
        		String strainNAllele,
        		String strainNAlleleFixed,
        		long strainNAlleleRatio,
        		String strain15IAllele,
        		String strain15IAlleleFixed,
        		long strain15IAlleleRatio,
        		String strainZeroAllele,
        		String strainZeroAlleleFixed,
        		long strainZeroAlleleRatio,
        		String strain6Allele,
        		String strain6AlleleFixed,
        		long strain6AlleleRatio,
        		String strainCAllele,
        		String strainCAlleleFixed,
        		long strainCAlleleRatio ) {
        	
            built = new SNPChromosome3();
            
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
        	built.strainPAllele = strainPAllele;
        	built.strainPAlleleFixed = strainPAlleleFixed;
        	built.strainPAlleleRatio = strainPAlleleRatio;
        	built.strainWAllele = strainWAllele;
        	built.strainWAlleleFixed = strainWAlleleFixed;
        	built.strainWAlleleRatio = strainWAlleleRatio;
        	built.strainNAllele = strainNAllele;
        	built.strainNAlleleFixed = strainNAlleleFixed;
        	built.strainNAlleleRatio = strainNAlleleRatio;
        	built.strain15IAllele = strain15IAllele;
        	built.strain15IAlleleFixed = strain15IAlleleFixed;
        	built.strain15IAlleleRatio = strain15IAlleleRatio;
        	built.strainZeroAllele = strainZeroAllele;
        	built.strainZeroAlleleFixed = strainZeroAlleleFixed;
        	built.strainZeroAlleleRatio = strainZeroAlleleRatio;
        	built.strain6Allele = strain6Allele;
        	built.strain6AlleleFixed = strain6AlleleFixed;
        	built.strain6AlleleRatio = strain6AlleleRatio;
        	built.strainCAllele = strainCAllele;
        	built.strainCAlleleFixed = strainCAlleleFixed;
        	built.strainCAlleleRatio = strainCAlleleRatio;
        }

        /**
         * Builds the new SNPChromosome3 object.
         * 
         * @return this. The created SNPChromosome3 object.
         */
        public SNPChromosome3 build() {
        	
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
