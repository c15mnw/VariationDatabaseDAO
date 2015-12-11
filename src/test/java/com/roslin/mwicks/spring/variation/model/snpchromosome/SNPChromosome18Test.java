package com.roslin.mwicks.spring.variation.model.snpchromosome;

import org.junit.Test;

import java.util.Date;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Petri Kainulainen
 */
public class SNPChromosome18Test {

    private static final String SNP_ID = "Foo_AA";
    private static final String CHROMOSOME_ID = "Foo_AB";
    private static final int POSITION = 1;
    private static final String REFERENCE = "Foo_AC";    
    private static final String ALTERNATIVE = "Foo_AD";
    private static final String REGION = "Foo_AE";
    private static final String ENSEMBL_GENE = "Foo_AF";
    private static final String ENSEMBL_TRANSCRIPT = "Foo_AG";
    private static final String ENSEMBL_ANNOTATION = "Foo_AH";
    private static final String STRAIN_7_ALLELE = "Foo_AI";
    private static final String STRAIN_7_ALLELE_FIXED = "True";
    private static final long STRAIN_7_ALLELE_RATIO = 0;
    private static final String STRAIN_P_ALLELE = "Foo_AJ";
    private static final String STRAIN_P_ALLELE_FIXED = "False";
    private static final long STRAIN_P_ALLELE_RATIO = 1;
    private static final String STRAIN_W_ALLELE = "Foo_AK";
    private static final String STRAIN_W_ALLELE_FIXED = "True";
    private static final long STRAIN_W_ALLELE_RATIO = 0;
    private static final String STRAIN_N_ALLELE = "Foo_AL";
    private static final String STRAIN_N_ALLELE_FIXED = "False";
    private static final long STRAIN_N_ALLELE_RATIO = 1;
    private static final String STRAIN_15I_ALLELE = "Foo_AM";
    private static final String STRAIN_15I_ALLELE_FIXED = "True";
    private static final long STRAIN_15I_ALLELE_RATIO = 0;
    private static final String STRAIN_ZERO_ALLELE = "Foo_AN";
    private static final String STRAIN_ZERO_ALLELE_FIXED = "False";
    private static final long STRAIN_ZERO_ALLELE_RATIO = 1;
    private static final String STRAIN_6_ALLELE = "Foo_AO";
    private static final String STRAIN_6_ALLELE_FIXED = "True";
    private static final long STRAIN_6_ALLELE_RATIO = 0;
    private static final String STRAIN_C_ALLELE = "Foo_AP";
    private static final String STRAIN_C_ALLELE_FIXED = "False";
    private static final long STRAIN_C_ALLELE_RATIO = 1;

    private static final String SNP_ID_UPDATED = "Bar_AA";
    private static final String CHROMOSOME_ID_UPDATED = "Bar_AB";
    private static final int POSITION_UPDATED = 0;
    private static final String REFERENCE_UPDATED = "Bar_AC";    
    private static final String ALTERNATIVE_UPDATED = "Bar_AD";
    private static final String REGION_UPDATED = "Bar_AE";
    private static final String ENSEMBL_GENE_UPDATED = "Bar_AF";
    private static final String ENSEMBL_TRANSCRIPT_UPDATED = "Bar_AG";
    private static final String ENSEMBL_ANNOTATION_UPDATED = "Bar_AH";
    private static final String STRAIN_7_ALLELE_UPDATED = "Bar_AI";
    private static final String STRAIN_7_ALLELE_FIXED_UPDATED = "False";
    private static final long STRAIN_7_ALLELE_RATIO_UPDATED = 1;
    private static final String STRAIN_P_ALLELE_UPDATED = "Bar_AJ";
    private static final String STRAIN_P_ALLELE_FIXED_UPDATED = "True";
    private static final long STRAIN_P_ALLELE_RATIO_UPDATED = 0;
    private static final String STRAIN_W_ALLELE_UPDATED = "Bar_AK";
    private static final String STRAIN_W_ALLELE_FIXED_UPDATED = "False";
    private static final long STRAIN_W_ALLELE_RATIO_UPDATED = 1;
    private static final String STRAIN_N_ALLELE_UPDATED = "Bar_AL";
    private static final String STRAIN_N_ALLELE_FIXED_UPDATED = "True";
    private static final long STRAIN_N_ALLELE_RATIO_UPDATED = 0;
    private static final String STRAIN_15I_ALLELE_UPDATED = "Bar_AM";
    private static final String STRAIN_15I_ALLELE_FIXED_UPDATED = "False";
    private static final long STRAIN_15I_ALLELE_RATIO_UPDATED = 1;
    private static final String STRAIN_ZERO_ALLELE_UPDATED = "Bar_AN";
    private static final String STRAIN_ZERO_ALLELE_FIXED_UPDATED = "True";
    private static final long STRAIN_ZERO_ALLELE_RATIO_UPDATED = 0;
    private static final String STRAIN_6_ALLELE_UPDATED = "Bar_AO";
    private static final String STRAIN_6_ALLELE_FIXED_UPDATED = "False";
    private static final long STRAIN_6_ALLELE_RATIO_UPDATED = 1;
    private static final String STRAIN_C_ALLELE_UPDATED = "Bar_AP";
    private static final String STRAIN_C_ALLELE_FIXED_UPDATED = "True";
    private static final long STRAIN_C_ALLELE_RATIO_UPDATED = 0;


    @Test
    public void build() {
    
        SNPChromosome18 built = SNPChromosome18.getBuilder(
            SNP_ID,
            CHROMOSOME_ID,
            POSITION,
            REFERENCE,
            ALTERNATIVE,
            REGION,
            ENSEMBL_GENE,
            ENSEMBL_TRANSCRIPT,
            ENSEMBL_ANNOTATION,
            STRAIN_7_ALLELE,
            STRAIN_7_ALLELE_FIXED,
            STRAIN_7_ALLELE_RATIO,
            STRAIN_P_ALLELE,
            STRAIN_P_ALLELE_FIXED,
            STRAIN_P_ALLELE_RATIO,
            STRAIN_W_ALLELE,
            STRAIN_W_ALLELE_FIXED,
            STRAIN_W_ALLELE_RATIO,
            STRAIN_N_ALLELE,
            STRAIN_N_ALLELE_FIXED,
            STRAIN_N_ALLELE_RATIO,
            STRAIN_15I_ALLELE,
            STRAIN_15I_ALLELE_FIXED,
            STRAIN_15I_ALLELE_RATIO,
            STRAIN_ZERO_ALLELE,
            STRAIN_ZERO_ALLELE_FIXED,
            STRAIN_ZERO_ALLELE_RATIO,
            STRAIN_6_ALLELE,
            STRAIN_6_ALLELE_FIXED,
            STRAIN_6_ALLELE_RATIO,
            STRAIN_C_ALLELE,
            STRAIN_C_ALLELE_FIXED,
            STRAIN_C_ALLELE_RATIO
            ).build();
        
        assertEquals(SNP_ID, built.getSnpId());
        assertEquals(CHROMOSOME_ID, built.getChromosomeId());
        assertEquals(POSITION, built.getPosition());
        assertEquals(REFERENCE, built.getReference());
        assertEquals(ALTERNATIVE, built.getAlternative());
        assertEquals(REGION, built.getRegion());
        assertEquals(ENSEMBL_GENE, built.getEnsemblGene());
        assertEquals(ENSEMBL_TRANSCRIPT, built.getEnsemblTranscript());
        assertEquals(ENSEMBL_ANNOTATION, built.getEnsemblAnnotation());
        assertEquals(STRAIN_7_ALLELE, built.getStrain7Allele());
        assertEquals(STRAIN_7_ALLELE_FIXED, built.getStrain7AlleleFixed());
        assertEquals(STRAIN_7_ALLELE_RATIO, built.getStrain7AlleleRatio());
        assertEquals(STRAIN_P_ALLELE, built.getStrainPAllele());
        assertEquals(STRAIN_P_ALLELE_FIXED, built.getStrainPAlleleFixed());
        assertEquals(STRAIN_P_ALLELE_RATIO, built.getStrainPAlleleRatio());
        assertEquals(STRAIN_W_ALLELE, built.getStrainWAllele());
        assertEquals(STRAIN_W_ALLELE_FIXED, built.getStrainWAlleleFixed());
        assertEquals(STRAIN_W_ALLELE_RATIO, built.getStrainWAlleleRatio());
        assertEquals(STRAIN_N_ALLELE, built.getStrainNAllele());
        assertEquals(STRAIN_N_ALLELE_FIXED, built.getStrainNAlleleFixed());
        assertEquals(STRAIN_N_ALLELE_RATIO, built.getStrainNAlleleRatio());
        assertEquals(STRAIN_15I_ALLELE, built.getStrain15IAllele());
        assertEquals(STRAIN_15I_ALLELE_FIXED, built.getStrain15IAlleleFixed());
        assertEquals(STRAIN_15I_ALLELE_RATIO, built.getStrain15IAlleleRatio());
        assertEquals(STRAIN_ZERO_ALLELE, built.getStrainZeroAllele());
        assertEquals(STRAIN_ZERO_ALLELE_FIXED, built.getStrainZeroAlleleFixed());
        assertEquals(STRAIN_ZERO_ALLELE_RATIO, built.getStrainZeroAlleleRatio());
        assertEquals(STRAIN_6_ALLELE, built.getStrain6Allele());
        assertEquals(STRAIN_6_ALLELE_FIXED, built.getStrain6AlleleFixed());
        assertEquals(STRAIN_6_ALLELE_RATIO, built.getStrain6AlleleRatio());
        assertEquals(STRAIN_C_ALLELE, built.getStrainCAllele());
        assertEquals(STRAIN_C_ALLELE_FIXED, built.getStrainCAlleleFixed());
        assertEquals(STRAIN_C_ALLELE_RATIO, built.getStrainCAlleleRatio());
        
        assertEquals(0, built.getVersion());

        assertNull(built.getCreationTime());
        assertNull(built.getModificationTime());
        
        assertNull(built.getOid());
    }
    

    @Test
    public void prePersist() {
    
        SNPChromosome18 built = SNPChromosome18.getBuilder(
            SNP_ID,
            CHROMOSOME_ID,
            POSITION,
            REFERENCE,
            ALTERNATIVE,
            REGION,
            ENSEMBL_GENE,
            ENSEMBL_TRANSCRIPT,
            ENSEMBL_ANNOTATION,
            STRAIN_7_ALLELE,
            STRAIN_7_ALLELE_FIXED,
            STRAIN_7_ALLELE_RATIO,
            STRAIN_P_ALLELE,
            STRAIN_P_ALLELE_FIXED,
            STRAIN_P_ALLELE_RATIO,
            STRAIN_W_ALLELE,
            STRAIN_W_ALLELE_FIXED,
            STRAIN_W_ALLELE_RATIO,
            STRAIN_N_ALLELE,
            STRAIN_N_ALLELE_FIXED,
            STRAIN_N_ALLELE_RATIO,
            STRAIN_15I_ALLELE,
            STRAIN_15I_ALLELE_FIXED,
            STRAIN_15I_ALLELE_RATIO,
            STRAIN_ZERO_ALLELE,
            STRAIN_ZERO_ALLELE_FIXED,
            STRAIN_ZERO_ALLELE_RATIO,
            STRAIN_6_ALLELE,
            STRAIN_6_ALLELE_FIXED,
            STRAIN_6_ALLELE_RATIO,
            STRAIN_C_ALLELE,
            STRAIN_C_ALLELE_FIXED,
            STRAIN_C_ALLELE_RATIO
            ).build();

        built.prePersist();
        
        Date creationTime = built.getCreationTime();
        Date modificationTime = built.getModificationTime();
        
        assertNotNull(creationTime);
        assertNotNull(modificationTime);
        assertEquals(creationTime, modificationTime);
    }
    
    
    @Test
    public void preUpdate() {
    
        SNPChromosome18 built = SNPChromosome18.getBuilder(
            SNP_ID,
            CHROMOSOME_ID,
            POSITION,
            REFERENCE,
            ALTERNATIVE,
            REGION,
            ENSEMBL_GENE,
            ENSEMBL_TRANSCRIPT,
            ENSEMBL_ANNOTATION,
            STRAIN_7_ALLELE,
            STRAIN_7_ALLELE_FIXED,
            STRAIN_7_ALLELE_RATIO,
            STRAIN_P_ALLELE,
            STRAIN_P_ALLELE_FIXED,
            STRAIN_P_ALLELE_RATIO,
            STRAIN_W_ALLELE,
            STRAIN_W_ALLELE_FIXED,
            STRAIN_W_ALLELE_RATIO,
            STRAIN_N_ALLELE,
            STRAIN_N_ALLELE_FIXED,
            STRAIN_N_ALLELE_RATIO,
            STRAIN_15I_ALLELE,
            STRAIN_15I_ALLELE_FIXED,
            STRAIN_15I_ALLELE_RATIO,
            STRAIN_ZERO_ALLELE,
            STRAIN_ZERO_ALLELE_FIXED,
            STRAIN_ZERO_ALLELE_RATIO,
            STRAIN_6_ALLELE,
            STRAIN_6_ALLELE_FIXED,
            STRAIN_6_ALLELE_RATIO,
            STRAIN_C_ALLELE,
            STRAIN_C_ALLELE_FIXED,
            STRAIN_C_ALLELE_RATIO
            ).build();

        built.prePersist();
        
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            //Back to work
        }

        built.preUpdate();
        
        Date creationTime = built.getCreationTime();
        Date modificationTime = built.getModificationTime();
        
        assertNotNull(creationTime);
        assertNotNull(modificationTime);
        assertTrue(modificationTime.after(creationTime));
    }
    

    @Test
    public void update() {
    
        SNPChromosome18 built = SNPChromosome18.getBuilder(
            SNP_ID,
            CHROMOSOME_ID,
            POSITION,
            REFERENCE,
            ALTERNATIVE,
            REGION,
            ENSEMBL_GENE,
            ENSEMBL_TRANSCRIPT,
            ENSEMBL_ANNOTATION,
            STRAIN_7_ALLELE,
            STRAIN_7_ALLELE_FIXED,
            STRAIN_7_ALLELE_RATIO,
            STRAIN_P_ALLELE,
            STRAIN_P_ALLELE_FIXED,
            STRAIN_P_ALLELE_RATIO,
            STRAIN_W_ALLELE,
            STRAIN_W_ALLELE_FIXED,
            STRAIN_W_ALLELE_RATIO,
            STRAIN_N_ALLELE,
            STRAIN_N_ALLELE_FIXED,
            STRAIN_N_ALLELE_RATIO,
            STRAIN_15I_ALLELE,
            STRAIN_15I_ALLELE_FIXED,
            STRAIN_15I_ALLELE_RATIO,
            STRAIN_ZERO_ALLELE,
            STRAIN_ZERO_ALLELE_FIXED,
            STRAIN_ZERO_ALLELE_RATIO,
            STRAIN_6_ALLELE,
            STRAIN_6_ALLELE_FIXED,
            STRAIN_6_ALLELE_RATIO,
            STRAIN_C_ALLELE,
            STRAIN_C_ALLELE_FIXED,
            STRAIN_C_ALLELE_RATIO
            ).build();

        built.prePersist();
        
        built.update(
            SNP_ID_UPDATED,
            CHROMOSOME_ID_UPDATED,
            POSITION_UPDATED,
            REFERENCE_UPDATED,
            ALTERNATIVE_UPDATED,
            REGION_UPDATED,
            ENSEMBL_GENE_UPDATED,
            ENSEMBL_TRANSCRIPT_UPDATED,
            ENSEMBL_ANNOTATION_UPDATED,
            STRAIN_7_ALLELE_UPDATED,
            STRAIN_7_ALLELE_FIXED_UPDATED,
            STRAIN_7_ALLELE_RATIO_UPDATED,
            STRAIN_P_ALLELE_UPDATED,
            STRAIN_P_ALLELE_FIXED_UPDATED,
            STRAIN_P_ALLELE_RATIO_UPDATED,
            STRAIN_W_ALLELE_UPDATED,
            STRAIN_W_ALLELE_FIXED_UPDATED,
            STRAIN_W_ALLELE_RATIO_UPDATED,
            STRAIN_N_ALLELE_UPDATED,
            STRAIN_N_ALLELE_FIXED_UPDATED,
            STRAIN_N_ALLELE_RATIO_UPDATED,
            STRAIN_15I_ALLELE_UPDATED,
            STRAIN_15I_ALLELE_FIXED_UPDATED,
            STRAIN_15I_ALLELE_RATIO_UPDATED,
            STRAIN_ZERO_ALLELE_UPDATED,
            STRAIN_ZERO_ALLELE_FIXED_UPDATED,
            STRAIN_ZERO_ALLELE_RATIO_UPDATED,
            STRAIN_6_ALLELE_UPDATED,
            STRAIN_6_ALLELE_FIXED_UPDATED,
            STRAIN_6_ALLELE_RATIO_UPDATED,
            STRAIN_C_ALLELE_UPDATED,
            STRAIN_C_ALLELE_FIXED_UPDATED,
            STRAIN_C_ALLELE_RATIO_UPDATED
        );
        
        assertEquals(SNP_ID_UPDATED, built.getSnpId());
        assertEquals(CHROMOSOME_ID_UPDATED, built.getChromosomeId());
        assertEquals(POSITION_UPDATED, built.getPosition());
        assertEquals(REFERENCE_UPDATED, built.getReference());
        assertEquals(ALTERNATIVE_UPDATED, built.getAlternative());
        assertEquals(REGION_UPDATED, built.getRegion());
        assertEquals(ENSEMBL_GENE_UPDATED, built.getEnsemblGene());
        assertEquals(ENSEMBL_TRANSCRIPT_UPDATED, built.getEnsemblTranscript());
        assertEquals(ENSEMBL_ANNOTATION_UPDATED, built.getEnsemblAnnotation());
        assertEquals(STRAIN_7_ALLELE_UPDATED, built.getStrain7Allele());
        assertEquals(STRAIN_7_ALLELE_FIXED_UPDATED, built.getStrain7AlleleFixed());
        assertEquals(STRAIN_7_ALLELE_RATIO_UPDATED, built.getStrain7AlleleRatio());
        assertEquals(STRAIN_P_ALLELE_UPDATED, built.getStrainPAllele());
        assertEquals(STRAIN_P_ALLELE_FIXED_UPDATED, built.getStrainPAlleleFixed());
        assertEquals(STRAIN_P_ALLELE_RATIO_UPDATED, built.getStrainPAlleleRatio());
        assertEquals(STRAIN_W_ALLELE_UPDATED, built.getStrainWAllele());
        assertEquals(STRAIN_W_ALLELE_FIXED_UPDATED, built.getStrainWAlleleFixed());
        assertEquals(STRAIN_W_ALLELE_RATIO_UPDATED, built.getStrainWAlleleRatio());
        assertEquals(STRAIN_N_ALLELE_UPDATED, built.getStrainNAllele());
        assertEquals(STRAIN_N_ALLELE_FIXED_UPDATED, built.getStrainNAlleleFixed());
        assertEquals(STRAIN_N_ALLELE_RATIO_UPDATED, built.getStrainNAlleleRatio());
        assertEquals(STRAIN_15I_ALLELE_UPDATED, built.getStrain15IAllele());
        assertEquals(STRAIN_15I_ALLELE_FIXED_UPDATED, built.getStrain15IAlleleFixed());
        assertEquals(STRAIN_15I_ALLELE_RATIO_UPDATED, built.getStrain15IAlleleRatio());
        assertEquals(STRAIN_ZERO_ALLELE_UPDATED, built.getStrainZeroAllele());
        assertEquals(STRAIN_ZERO_ALLELE_FIXED_UPDATED, built.getStrainZeroAlleleFixed());
        assertEquals(STRAIN_ZERO_ALLELE_RATIO_UPDATED, built.getStrainZeroAlleleRatio());
        assertEquals(STRAIN_6_ALLELE_UPDATED, built.getStrain6Allele());
        assertEquals(STRAIN_6_ALLELE_FIXED_UPDATED, built.getStrain6AlleleFixed());
        assertEquals(STRAIN_6_ALLELE_RATIO_UPDATED, built.getStrain6AlleleRatio());
        assertEquals(STRAIN_C_ALLELE_UPDATED, built.getStrainCAllele());
        assertEquals(STRAIN_C_ALLELE_FIXED_UPDATED, built.getStrainCAlleleFixed());
        assertEquals(STRAIN_C_ALLELE_RATIO_UPDATED, built.getStrainCAlleleRatio());
    }
    
}
