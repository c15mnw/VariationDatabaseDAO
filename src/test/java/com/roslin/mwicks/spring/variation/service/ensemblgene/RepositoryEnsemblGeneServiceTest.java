package  com.roslin.mwicks.spring.variation.service.ensemblgene;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.roslin.mwicks.spring.variation.model.ensemblgene.EnsemblGene;
import com.roslin.mwicks.spring.variation.model.ensemblgene.EnsemblGeneTestUtil;

import com.roslin.mwicks.spring.variation.repository.ensemblgene.RepositoryEnsemblGene;
import com.roslin.mwicks.spring.variation.dto.offline.DTOEnsemblGene;
import com.roslin.mwicks.spring.variation.exception.ExceptionEnsemblGeneNotFound;

import org.junit.Before;
import org.junit.Test;

import org.mockito.ArgumentCaptor;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

import static org.mockito.Mockito.*;

/**
 * @author Petri Kainulainen
 */
public class RepositoryEnsemblGeneServiceTest {

    private static final int NUMBER_OF_ENSEMBL_GENES_PER_PAGE = 30;

    private static final Long ENSEMBL_GENE_OID = Long.valueOf(40431);
    private static final String ENSEMBL_ID = "ENSGALT00000012809";
    private static final String REGION = "transcript";
    private static final String CHROMOSOME_ID = "3";
    private static final String START = "855515";
    private static final String END = "901472";    
    private static final long START_LONG = 855515;
    private static final long END_LONG = 901472;    
    private static final String STRAND = "+";

    //private static final Long ENSEMBL_GENE_OID_UPDATED = Long.valueOf(40432);
    private static final String ENSEMBL_ID_UPDATED = "ENSGALG00000007879";
    private static final String REGION_UPDATED = "gene";
    private static final String CHROMOSOME_ID_UPDATED = "3";
    private static final String START_UPDATED = "900795";
    private static final String END_UPDATED = "929281";    
    private static final String STRAND_UPDATED = "-";
    
    private ServiceRepositoryEnsemblGene serviceEnsemblGene;

    private RepositoryEnsemblGene repositoryEnsemblGeneMock;

    @Before
    public void setUp() {

    	serviceEnsemblGene = new ServiceRepositoryEnsemblGene();

    	repositoryEnsemblGeneMock = mock(RepositoryEnsemblGene.class);

        serviceEnsemblGene.setRepositoryEnsemblGene(repositoryEnsemblGeneMock);
    }
    
    @Test
    public void create() {
        
    	DTOEnsemblGene createdDTOEnsemblGene = EnsemblGeneTestUtil.createDTO(null, 
    			ENSEMBL_ID,
                REGION,
                CHROMOSOME_ID,
                START,
                END,
                STRAND
                );
        
        EnsemblGene persistedEnsemblGene = EnsemblGeneTestUtil.createModelObject(
        		ENSEMBL_GENE_OID,
    			ENSEMBL_ID,
                REGION,
                CHROMOSOME_ID,
                START_LONG,
                END_LONG,
                STRAND
                );
        
        when(repositoryEnsemblGeneMock.save(any(EnsemblGene.class))).thenReturn(persistedEnsemblGene);
        
        EnsemblGene returnedEnsemblGene = serviceEnsemblGene.create(createdDTOEnsemblGene);

        ArgumentCaptor<EnsemblGene> ensemblgeneArgument = ArgumentCaptor.forClass(EnsemblGene.class);
        
        verify(repositoryEnsemblGeneMock, times(1)).save(ensemblgeneArgument.capture());
        verifyNoMoreInteractions(repositoryEnsemblGeneMock);

        assertEnsemblGene(createdDTOEnsemblGene, ensemblgeneArgument.getValue());
        
        assertEquals(persistedEnsemblGene, returnedEnsemblGene);
    }
    
    
    @Test
    public void delete() throws ExceptionEnsemblGeneNotFound {
    	
        EnsemblGene deleted = EnsemblGeneTestUtil.createModelObject(
        		ENSEMBL_GENE_OID,
    			ENSEMBL_ID,
                REGION,
                CHROMOSOME_ID,
                START_LONG,
                END_LONG,
                STRAND
        		);
        
        when(repositoryEnsemblGeneMock.findOne(ENSEMBL_GENE_OID)).thenReturn(deleted);
        
        EnsemblGene returnedEnsemblGene = serviceEnsemblGene.delete(ENSEMBL_GENE_OID);
        
        verify(repositoryEnsemblGeneMock, times(1)).findOne(ENSEMBL_GENE_OID);
        verify(repositoryEnsemblGeneMock, times(1)).delete(deleted);
        verifyNoMoreInteractions(repositoryEnsemblGeneMock);
        
        assertEquals(deleted, returnedEnsemblGene);
    }
    
    
    @Test(expected = ExceptionEnsemblGeneNotFound.class)
    public void deleteWhenEnsemblGeneIsNotFound() throws ExceptionEnsemblGeneNotFound {
    	
        when(repositoryEnsemblGeneMock.findOne(ENSEMBL_GENE_OID)).thenReturn(null);
        
        serviceEnsemblGene.delete(ENSEMBL_GENE_OID);
        
        verify(repositoryEnsemblGeneMock, times(1)).findOne(ENSEMBL_GENE_OID);
        verifyNoMoreInteractions(repositoryEnsemblGeneMock);
    }
    
    
    @Test
    public void findAll() {
    	
        List<EnsemblGene> ensemblgenes = new ArrayList<EnsemblGene>();
        
        when(repositoryEnsemblGeneMock.findAll()).thenReturn(ensemblgenes);
        
        List<EnsemblGene> returnedEnsemblGene = serviceEnsemblGene.findAll();
        
        verify(repositoryEnsemblGeneMock, times(1)).findAll();
        verifyNoMoreInteractions(repositoryEnsemblGeneMock);
        
        assertEquals(ensemblgenes, returnedEnsemblGene);
    }
    
    
    @Test
    public void findByOid() {
    	
        EnsemblGene ensemblgene = EnsemblGeneTestUtil.createModelObject(
        		ENSEMBL_GENE_OID,
    			ENSEMBL_ID,
                REGION,
                CHROMOSOME_ID,
                START_LONG,
                END_LONG,
                STRAND
        		);
        
        when(repositoryEnsemblGeneMock.findOne(ENSEMBL_GENE_OID)).thenReturn(ensemblgene);
        
        EnsemblGene returnedEnsemblGene = serviceEnsemblGene.findByOid(ENSEMBL_GENE_OID);
        
        verify(repositoryEnsemblGeneMock, times(1)).findOne(ENSEMBL_GENE_OID);
        verifyNoMoreInteractions(repositoryEnsemblGeneMock);
        
        assertEquals(ensemblgene, returnedEnsemblGene);
    }
    
    
    @Test
    public void findByGeneName() {
    	
        List<EnsemblGene> expectedDTOEnsemblGene = new ArrayList<EnsemblGene>();
        
        when(repositoryEnsemblGeneMock.findByGeneName(ENSEMBL_ID)).thenReturn(expectedDTOEnsemblGene);
        
        List<EnsemblGene> actualEnsemblGene = serviceEnsemblGene.findByGeneName(ENSEMBL_ID);
        
        verify(repositoryEnsemblGeneMock, times(1)).findByGeneName(ENSEMBL_ID);
        verifyNoMoreInteractions(repositoryEnsemblGeneMock);
        
        assertEquals(expectedDTOEnsemblGene, actualEnsemblGene);
    }
    
    
    @Test
    public void findByEnsemblIdLike() {
    	
    	Page<EnsemblGene> expectedDTOEnsemblGene = null;
    	
    	Integer pageNumber = 1;
    	
    	PageRequest pageRequest = new PageRequest(pageNumber - 1, NUMBER_OF_ENSEMBL_GENES_PER_PAGE, Sort.Direction.ASC, "ensemblId");
        
        when(repositoryEnsemblGeneMock.findByEnsemblIdLike(ENSEMBL_ID, pageRequest)).thenReturn(expectedDTOEnsemblGene);
        
        Page<EnsemblGene> actualEnsemblGene = serviceEnsemblGene.findByEnsemblIdLike(ENSEMBL_ID, pageRequest);
        
        verify(repositoryEnsemblGeneMock, times(1)).findByEnsemblIdLike(ENSEMBL_ID, pageRequest);
        verifyNoMoreInteractions(repositoryEnsemblGeneMock);
        
        assertEquals(expectedDTOEnsemblGene, actualEnsemblGene);
    }
    
    
    
    @Test
    public void update() throws ExceptionEnsemblGeneNotFound {
    	
    	/*
        DTOEnsemblGene updatedDTOEnsemblGene = EnsemblGeneTestUtil.createDTO(
        		ENSEMBL_GENE_OID_UPDATED,
    			ENSEMBL_ID_UPDATED,
                REGION_UPDATED,
                CHROMOSOME_ID_UPDATED,
                START_UPDATED,
                END_UPDATED,
                STRAND_UPDATED
        		);
    	 */
        DTOEnsemblGene updatedDTOEnsemblGene = EnsemblGeneTestUtil.createDTO(
        		ENSEMBL_GENE_OID,
    			ENSEMBL_ID,
                REGION,
                CHROMOSOME_ID,
                START,
                END,
                STRAND
        		);
        
        EnsemblGene ensemblgene = EnsemblGeneTestUtil.createModelObject(
        		ENSEMBL_GENE_OID,
    			ENSEMBL_ID,
                REGION,
                CHROMOSOME_ID,
                START_LONG,
                END_LONG,
                STRAND
        		);
        
        when(repositoryEnsemblGeneMock.findOne(updatedDTOEnsemblGene.getOid())).thenReturn(ensemblgene);
        
        EnsemblGene returnedEnsemblGene = serviceEnsemblGene.update(updatedDTOEnsemblGene);
        
        verify(repositoryEnsemblGeneMock, times(1)).findOne(updatedDTOEnsemblGene.getOid());
        verifyNoMoreInteractions(repositoryEnsemblGeneMock);
        
        assertEnsemblGene(updatedDTOEnsemblGene, returnedEnsemblGene);
    }
    
    
    @Test(expected = ExceptionEnsemblGeneNotFound.class)
    public void updateWhenEnsemblGeneIsNotFound() throws ExceptionEnsemblGeneNotFound {
    	
        DTOEnsemblGene updatedDTOEnsemblGene = EnsemblGeneTestUtil.createDTO(
        		ENSEMBL_GENE_OID,
    			ENSEMBL_ID_UPDATED,
                REGION_UPDATED,
                CHROMOSOME_ID_UPDATED,
                START_UPDATED,
                END_UPDATED,
                STRAND_UPDATED
        		);
        
        when(repositoryEnsemblGeneMock.findOne(updatedDTOEnsemblGene.getOid())).thenReturn(null);

        serviceEnsemblGene.update(updatedDTOEnsemblGene);

        verify(repositoryEnsemblGeneMock, times(1)).findOne(updatedDTOEnsemblGene.getOid());
        verifyNoMoreInteractions(repositoryEnsemblGeneMock);
    }

    
    private void assertEnsemblGene(DTOEnsemblGene expectedDTOEnsemblGene, EnsemblGene actualEnsemblGene) {
    	
        assertEquals(expectedDTOEnsemblGene.getOid(), actualEnsemblGene.getOid());
        
        assertEquals(expectedDTOEnsemblGene.getEnsemblId(), actualEnsemblGene.getEnsemblId());
        assertEquals(expectedDTOEnsemblGene.getRegion(), actualEnsemblGene.getRegion());
        assertEquals(expectedDTOEnsemblGene.getChromosomeId(), actualEnsemblGene.getChromosomeId());
        assertEquals(expectedDTOEnsemblGene.getStartAsLong(), actualEnsemblGene.getStart());
        assertEquals(expectedDTOEnsemblGene.getEndAsLong(), actualEnsemblGene.getEnd());
        assertEquals(expectedDTOEnsemblGene.getStrand(), actualEnsemblGene.getStrand());
    }

}
