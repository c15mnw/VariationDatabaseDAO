package com.roslin.mwicks.spring.variation.model.ensemblgene;

import org.junit.Test;

import java.util.Date;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Petri Kainulainen
 */
public class EnsemblGeneTest {

    private static final String ENSEMBL_ID = "Foo_AA";
    private static final String REGION = "Foo_AE";
    private static final String CHROMOSOME_ID = "Foo_AB";
    private static final Long START_LONG = (long) 100;
    private static final Long END_LONG = (long) 200;    
    private static final String STRAND = "Foo_AD";

    private static final String ENSEMBL_ID_UPDATED = "Bar_AA";
    private static final String REGION_UPDATED = "Bar_AE";
    private static final String CHROMOSOME_ID_UPDATED = "Bar_AB";
    private static final Long START_LONG_UPDATED = (long) 101;
    private static final Long END_LONG_UPDATED = (long) 201;    
    private static final String STRAND_UPDATED = "Bar_AD";


    @Test
    public void build() {
    
        EnsemblGene built = EnsemblGene.getBuilder(
            ENSEMBL_ID,
            REGION,
            CHROMOSOME_ID,
            START_LONG,
            END_LONG,
            STRAND
            ).build();
        
        assertEquals(ENSEMBL_ID, built.getEnsemblId());
        assertEquals(REGION, built.getRegion());
        assertEquals(CHROMOSOME_ID, built.getChromosomeId());
        assertEquals(START_LONG, built.getStart());
        assertEquals(END_LONG, built.getEnd());
        assertEquals(STRAND, built.getStrand());
        
        assertEquals(0, built.getVersion());

        assertNull(built.getCreationTime());
        assertNull(built.getModificationTime());
        assertNull(built.getOid());
    }
    

    @Test
    public void prePersist() {
    
        EnsemblGene built = EnsemblGene.getBuilder(
            ENSEMBL_ID,
            REGION,
            CHROMOSOME_ID,
            START_LONG,
            END_LONG,
            STRAND
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
    
        EnsemblGene built = EnsemblGene.getBuilder(
            ENSEMBL_ID,
            REGION,
            CHROMOSOME_ID,
            START_LONG,
            END_LONG,
            STRAND
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
    
        EnsemblGene built = EnsemblGene.getBuilder(
            ENSEMBL_ID,
            REGION,
            CHROMOSOME_ID,
            START_LONG,
            END_LONG,
            STRAND
            ).build();

        built.prePersist();
        
        built.update(
            ENSEMBL_ID_UPDATED,
            REGION_UPDATED,
            CHROMOSOME_ID_UPDATED,
            START_LONG_UPDATED,
            END_LONG_UPDATED,
            STRAND_UPDATED
        );
        
        assertEquals(ENSEMBL_ID_UPDATED, built.getEnsemblId());
        assertEquals(REGION_UPDATED, built.getRegion());
        assertEquals(CHROMOSOME_ID_UPDATED, built.getChromosomeId());
        assertEquals(START_LONG_UPDATED, built.getStart());
        assertEquals(END_LONG_UPDATED, built.getEnd());
        assertEquals(STRAND_UPDATED, built.getStrand());
    }
    
}
