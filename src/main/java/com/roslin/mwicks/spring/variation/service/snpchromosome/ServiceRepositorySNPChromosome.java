package com.roslin.mwicks.spring.variation.service.snpchromosome;

import com.roslin.mwicks.spring.variation.dto.web.objects.snpchromosome.DTODownloadSNPChromosome;
import com.roslin.mwicks.spring.variation.dto.web.objects.snpchromosome.DTOSearchSNPChromosome;

import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeNotFound;

import com.roslin.mwicks.spring.variation.model.other.PageSNPChromosome;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;

import com.roslin.mwicks.spring.variation.repository.snpchromosome.RepositorySNPChromosome;

import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome;
import com.roslin.mwicks.utility.ObjectConverter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


/**
 * This implementation of the SNPChromosomeService interface communicates with
 * the database by using a Spring Data JPA repository.
 * @author Mike Wicks
 */
@Service
public class ServiceRepositorySNPChromosome implements ServiceSNPChromosome {
    
	protected static final String SORT_ASC = "asc";
	protected static final String SORT_DESC = "desc";

	protected static final String FIELD_POSITION = "position";
	protected static final String FIELD_REFERENCE = "reference";
	protected static final String FIELD_ALTERNATIVE = "alternative";
	protected static final String FIELD_REGION = "region";
	protected static final String FIELD_ENSEMBL_GENE = "ensemblGene";
	protected static final String FIELD_ENSEMBL_TRANSCRIPT = "ensemblTranscript";
	protected static final String FIELD_ENSEMBL_ANNOTATION = "ensemblAnnotation";
	protected static final String FIELD_AMINO_ACID_SUBSITUTION = "aminoAcidSubs";
	protected static final String FIELD_PREDICTION_CATEGORY = "predictionCategory";
	protected static final String FIELD_SIFT_SCORE = "scoreSift";
	protected static final String FIELD_SIFT_SCORE_CONSERVATION = "scoreConservation";
	protected static final String FIELD_PROTEIN_ALIGNMENT_NUMBER = "proteinAlignNumber";
	protected static final String FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER = "totalAlignSequenceNumber";
	protected static final String FIELD_PROVEAN_SCORE = "scoreProvean";

	
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceRepositorySNPChromosome.class);
    
    private static final int NUMBER_OF_SNPCHROMOSOMES_PER_PAGE = 30;
    
    @PersistenceContext
    private EntityManager entityManager;
     
    @Resource
    private RepositorySNPChromosome repositorysnpchromosome;

    
    @Transactional(readOnly = true)
    public SNPChromosome findByOid(Long oid) {
    	
        LOGGER.debug("Finding SNPChromosome by oid: " + oid);
        
        return repositorysnpchromosome.findOne(oid);
    }
    
    @Transactional
    public <T extends SNPChromosome> Collection<T> bulkSave(int intBatchSize, Collection<T> entities) {
    	
    	final List<T> savedEntities = new ArrayList<T>(entities.size());
    	int i = 0;

    	for (T t : entities) {
    	    
    		//savedEntities.add(persistOrMerge(t));
    		entityManager.persist(t);

    		i++;
    	    
    		if (i % intBatchSize == 0) {

    			// Flush a batch of inserts and release memory.
    			entityManager.flush();
    			entityManager.clear();
    		}
    	}
    	
    	return savedEntities;
    }
    	 
    
    @Transactional(readOnly = true)
    public List<SNPChromosome> download(DTODownloadSNPChromosome dtoDownload) {
        
    	LOGGER.debug("Downloading snpchromosomes with download criteria: " + dtoDownload);
    	
    	int longPartition = 0;

    	if ( dtoDownload.isDownloadChromosome1() ) {
    		longPartition = 1;
    	}
    	if ( dtoDownload.isDownloadChromosome2() ) {
    		longPartition = 2;
    	}
    	if ( dtoDownload.isDownloadChromosome3() ) {
    		longPartition = 3;
    	}
    	if ( dtoDownload.isDownloadChromosome4() ) {
    		longPartition = 4;
    	}
    	if ( dtoDownload.isDownloadChromosome5() ) {
    		longPartition = 5;
    	}
    	if ( dtoDownload.isDownloadChromosome6() ) {
    		longPartition = 6;
    	}
    	if ( dtoDownload.isDownloadChromosome7() ) {
    		longPartition = 7;
    	}
    	if ( dtoDownload.isDownloadChromosome8() ) {
    		longPartition = 8;
    	}
    	if ( dtoDownload.isDownloadChromosome9() ) {
    		longPartition = 9;
    	}
    	if ( dtoDownload.isDownloadChromosome10() ) {
    		longPartition = 10;
    	}
    	if ( dtoDownload.isDownloadChromosome11() ) {
    		longPartition = 11;
    	}
    	if ( dtoDownload.isDownloadChromosome12() ) {
    		longPartition = 12;
    	}
    	if ( dtoDownload.isDownloadChromosome13() ) {
    		longPartition = 13;
    	}
    	if ( dtoDownload.isDownloadChromosome14() ) {
    		longPartition = 14;
    	}
    	if ( dtoDownload.isDownloadChromosome15() ) {
    		longPartition = 15;
    	}
    	if ( dtoDownload.isDownloadChromosome16() ) {
    		longPartition = 16;
    	}
    	if ( dtoDownload.isDownloadChromosome17() ) {
    		longPartition = 17;
    	}
    	if ( dtoDownload.isDownloadChromosome18() ) {
    		longPartition = 18;
    	}
    	if ( dtoDownload.isDownloadChromosome19() ) {
    		longPartition = 19;
    	}
    	if ( dtoDownload.isDownloadChromosome20() ) {
    		longPartition = 20;
    	}
    	if ( dtoDownload.isDownloadChromosome21() ) {
    		longPartition = 21;
    	}
    	if ( dtoDownload.isDownloadChromosome22() ) {
    		longPartition = 22;
    	}
    	if ( dtoDownload.isDownloadChromosome23() ) {
    		longPartition = 23;
    	}
    	if ( dtoDownload.isDownloadChromosome24() ) {
    		longPartition = 24;
    	}
    	if ( dtoDownload.isDownloadChromosome25() ) {
    		longPartition = 25;
    	}
    	if ( dtoDownload.isDownloadChromosome26() ) {
    		longPartition = 26;
    	}
    	if ( dtoDownload.isDownloadChromosome27() ) {
    		longPartition = 27;
    	}
    	if ( dtoDownload.isDownloadChromosome28() ) {
    		longPartition = 28;
    	}
    	if ( dtoDownload.isDownloadChromosomeLGE22C19W28_E50C23() ) {
    		longPartition = 29;
    	}
    	if ( dtoDownload.isDownloadChromosomeLGE64() ) {
    		longPartition = 30;
    	}
    	if ( dtoDownload.isDownloadChromosomeW() ) {
    		longPartition = 31;
    	}
    	if ( dtoDownload.isDownloadChromosome32() ) {
    		longPartition = 32;
    	}
    	if ( dtoDownload.isDownloadChromosomeZ() ) {
    		longPartition = 33;
    	}

    	List<SNPChromosome> snpchromosomes = null;
    	
        if (dtoDownload.isDownloadReferenceReference() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDReferenceNEStrainP");
            snpchromosomes = repositorysnpchromosome.findByRangeANDReferenceNEStrainP(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceReference() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDReferenceNEStrainW");
            snpchromosomes = repositorysnpchromosome.findByRangeANDReferenceNEStrainW(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceReference() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDReferenceNEStrainN");
            snpchromosomes = repositorysnpchromosome.findByRangeANDReferenceNEStrainN(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceReference() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDReferenceNEStrain15I");
            snpchromosomes = repositorysnpchromosome.findByRangeANDReferenceNEStrain15I(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceReference() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDReferenceNEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDReferenceNEstrainZero(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceReference() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDReferenceNEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDReferenceNEStrain6(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceReference() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDReferenceNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDReferenceNEStrainC(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceReference() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrain&");
            snpchromosomes = repositorysnpchromosome.findByRangeANDReferenceNEStrainP(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrainP");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainP(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrainW");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainW(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrainN");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainN(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrain15I");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrain15I(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEstrainZero(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrain6(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainC(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrain&");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainP(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrainW");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrainW(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrainN");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrainN(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrain15I");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrain15I(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEstrainZero(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrain6(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrainC(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrainW");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainW(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrainW");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrainW(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrainN");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrainN(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrain15I");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrain15I(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEstrainZero(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrain6(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrainC(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrainN");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainN(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrainN");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrainN(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrainN");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrainN(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainNNEStrain15I");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainNNEStrain15I(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainNNEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainNNEstrainZero(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainNNEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainNNEStrain6(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainNNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainNNEStrainC(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrain15I");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrain15I(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrain15I");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrain15I(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainNNEStrain15I");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainNNEStrain15I(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrain15I");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrain15I(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain15INEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain15INEstrainZero(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain15INEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain15INEStrain6(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain15INEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain15INEStrainC(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEstrainZero(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEstrainZero(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainNNEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainNNEstrainZero(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEstrainZero(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain15INEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain15INEstrainZero(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainZeroNEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainZeroNEStrain6(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainZeroNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainZeroNEStrainC(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrain6(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrain6(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainNNEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainNNEStrain6(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrain6(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain15INEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain15INEStrain6(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainZeroNEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainZeroNEStrain6(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainZeroNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainZeroNEStrainC(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainC(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrainC(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainNNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainNNEStrainC(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrainC(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain15INEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain15INEStrainC(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainZeroNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainZeroNEStrainC(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain6NEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain6NEStrainC(longPartition, dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }

        return snpchromosomes;
    }

    
	@Transactional(readOnly = true)
    public PageSNPChromosome search(DTOSearchSNPChromosome dtoSearch, int pageNumber, String sortField, String sortDirection) {
        
    	LOGGER.debug("Searching snpchromosomes with search criteria: " + dtoSearch);

    	List<SNPChromosome> snpchromosomes = new ArrayList<SNPChromosome>();
    	List<SNPChromosome> snpchromosomesCutdown = new ArrayList<SNPChromosome>();
    	List<SNPChromosome> snpchromosomesFiltered = new ArrayList<SNPChromosome>();;

    	String strColumn = sortField;
    	String strDirection = sortDirection;
    	int intStart = 0;
    	int intStop = 0;
    	int intTotalPages = 0;
    	long longPartition = 0;
    	
    	if ( dtoSearch.isSearchChromosome1() ) {
    		longPartition = 1;
    	}
    	if ( dtoSearch.isSearchChromosome2() ) {
    		longPartition = 2;
    	}
    	if ( dtoSearch.isSearchChromosome3() ) {
    		longPartition = 3;
    	}
    	if ( dtoSearch.isSearchChromosome4() ) {
    		longPartition = 4;
    	}
    	if ( dtoSearch.isSearchChromosome5() ) {
    		longPartition = 5;
    	}
    	if ( dtoSearch.isSearchChromosome6() ) {
    		longPartition = 6;
    	}
    	if ( dtoSearch.isSearchChromosome7() ) {
    		longPartition = 7;
    	}
    	if ( dtoSearch.isSearchChromosome8() ) {
    		longPartition = 8;
    	}
    	if ( dtoSearch.isSearchChromosome9() ) {
    		longPartition = 9;
    	}
    	if ( dtoSearch.isSearchChromosome10() ) {
    		longPartition = 10;
    	}
    	if ( dtoSearch.isSearchChromosome11() ) {
    		longPartition = 11;
    	}
    	if ( dtoSearch.isSearchChromosome12() ) {
    		longPartition = 12;
    	}
    	if ( dtoSearch.isSearchChromosome13() ) {
    		longPartition = 13;
    	}
    	if ( dtoSearch.isSearchChromosome14() ) {
    		longPartition = 14;
    	}
    	if ( dtoSearch.isSearchChromosome15() ) {
    		longPartition = 15;
    	}
    	if ( dtoSearch.isSearchChromosome16() ) {
    		longPartition = 16;
    	}
    	if ( dtoSearch.isSearchChromosome17() ) {
    		longPartition = 17;
    	}
    	if ( dtoSearch.isSearchChromosome18() ) {
    		longPartition = 18;
    	}
    	if ( dtoSearch.isSearchChromosome19() ) {
    		longPartition = 19;
    	}
    	if ( dtoSearch.isSearchChromosome20() ) {
    		longPartition = 20;
    	}
    	if ( dtoSearch.isSearchChromosome21() ) {
    		longPartition = 21;
    	}
    	if ( dtoSearch.isSearchChromosome22() ) {
    		longPartition = 22;
    	}
    	if ( dtoSearch.isSearchChromosome23() ) {
    		longPartition = 23;
    	}
    	if ( dtoSearch.isSearchChromosome24() ) {
    		longPartition = 24;
    	}
    	if ( dtoSearch.isSearchChromosome25() ) {
    		longPartition = 25;
    	}
    	if ( dtoSearch.isSearchChromosome26() ) {
    		longPartition = 26;
    	}
    	if ( dtoSearch.isSearchChromosome27() ) {
    		longPartition = 27;
    	}
    	if ( dtoSearch.isSearchChromosome28() ) {
    		longPartition = 28;
    	}
    	if ( dtoSearch.isSearchChromosomeLGE22C19W28_E50C23() ) {
    		longPartition = 29;
    	}
    	if ( dtoSearch.isSearchChromosomeLGE64() ) {
    		longPartition = 30;
    	}
    	if ( dtoSearch.isSearchChromosomeW() ) {
    		longPartition = 31;
    	}
    	if ( dtoSearch.isSearchChromosome32() ) {
    		longPartition = 32;
    	}
    	if ( dtoSearch.isSearchChromosomeZ() ) {
    		longPartition = 33;
    	}
    	
        if (dtoSearch.isSearchReferenceReference() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDReferenceNEStrainP");
            snpchromosomes = repositorysnpchromosome.findByRangeANDReferenceNEStrainP(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceReference() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDReferenceNEStrainW");
            snpchromosomes = repositorysnpchromosome.findByRangeANDReferenceNEStrainW(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceReference() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDReferenceNEStrainN");
            snpchromosomes = repositorysnpchromosome.findByRangeANDReferenceNEStrainN(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceReference() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDReferenceNEStrain15I");
            snpchromosomes = repositorysnpchromosome.findByRangeANDReferenceNEStrain15I(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceReference() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDReferenceNEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDReferenceNEstrainZero(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceReference() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDReferenceNEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDReferenceNEStrain6(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceReference() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDReferenceNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDReferenceNEStrainC(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceReference() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDReferenceNEStrain7");
            snpchromosomes = repositorysnpchromosome.findByRangeANDReferenceNEStrainC(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrainP");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainP(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrainW");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainW(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrainN");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainN(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrain15I");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrain15I(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEstrainZero(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrain6(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainC(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrain&");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainP(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrainW");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrainW(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrainN");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrainN(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrain15I");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrain15I(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEstrainZero(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrain6(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrainC(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrainW");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainW(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrainW");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrainW(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrainN");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrainN(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrain15I");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrain15I(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEstrainZero(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrain6(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrainC(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrainN");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainN(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrainN");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrainN(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrainN");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrainN(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainNNEStrain15I");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainNNEStrain15I(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainNNEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainNNEstrainZero(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainNNEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainNNEStrain6(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainNNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainNNEStrainC(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }        
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrain15I");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrain15I(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrain15I");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrain15I(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainNNEStrain15I");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainNNEStrain15I(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrain15I");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrain15I(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain15INEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain15INEstrainZero(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain15INEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain15INEStrain6(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain15INEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain15INEStrainC(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEstrainZero(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEstrainZero(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainNNEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainNNEstrainZero(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEstrainZero(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain15INEstrainZero");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain15INEstrainZero(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDstrainZeroNEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainZeroNEStrain6(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDstrainZeroNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainZeroNEStrainC(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrain6(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrain6(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainNNEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainNNEStrain6(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrain6(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain15INEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain15INEStrain6(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDstrainZeroNEStrain6");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainZeroNEStrain6(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDstrainZeroNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainZeroNEStrainC(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain7NEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainC(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainPNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrainC(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainNNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainNNEStrainC(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrainWNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrainC(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain15INEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain15INEStrainC(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDstrainZeroNEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrainZeroNEStrainC(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching snpchromosomes by using findByRangeANDStrain6NEStrainC");
            snpchromosomes = repositorysnpchromosome.findByRangeANDStrain6NEStrainC(longPartition, dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        
        if ( snpchromosomes.size() != 0 ) {
        	
         	//System.out.println("snpchromosomes.size() : " + snpchromosomes.size() );

         	Iterator<SNPChromosome> iteratorSNPChromosomes = snpchromosomes.iterator();
            
         	while (iteratorSNPChromosomes.hasNext()) {
        		
         		SNPChromosome snpchromosome = iteratorSNPChromosomes.next();

         		boolean addRow = false;
         		
         		//System.out.println("dtoSearch.getSearchFilterSiftScoreValueAsDouble() : " + dtoSearch.getSearchFilterSiftScoreValueAsDouble() );
         		//System.out.println("dtoSearch.getSearchFilterSiftConservationScoreValueAsDouble() : " + dtoSearch.getSearchFilterSiftConservationScoreValueAsDouble() );
         		//System.out.println("dtoSearch.getSearchFilterProteinAlignNumberValueAsLong() : " + dtoSearch.getSearchFilterProteinAlignNumberValueAsLong() );
         		//System.out.println("dtoSearch.getSearchFilterTotalNumberSeqAlignedValueAsLong() : " + dtoSearch.getSearchFilterTotalNumberSeqAlignedValueAsLong() );
         		//System.out.println("dtoSearch.getSearchFilterProveanScoreValueAsDouble() : " + dtoSearch.getSearchFilterProveanScoreValueAsDouble() );

         		// Are there any Filters set?
         		if ( dtoSearch.getSearchFilterSiftScoreValueAsDouble() == 0 &&
         				dtoSearch.getSearchFilterSiftConservationScoreValueAsDouble() == 0 &&
         				dtoSearch.getSearchFilterProteinAlignNumberValueAsLong() == 0 &&
         				dtoSearch.getSearchFilterTotalNumberSeqAlignedValueAsLong() == 0 &&
         				dtoSearch.getSearchFilterProveanScoreValueAsDouble()  == 0 ) {

         			// No - All Zeroes, therefore cannot filter, pass through in list to out list
         			addRow = true;
        		}
         		// Yes - Filter values set
         		else {
             		//System.out.println("snpchromosome.getScoreSift() : " + snpchromosome.getScoreSift() );
             		//System.out.println("snpchromosome.getScoreConservation() : " + snpchromosome.getScoreConservation() );
             		//System.out.println("snpchromosome.getProteinAlignNumber() : " + snpchromosome.getProteinAlignNumber() );
             		//System.out.println("snpchromosome.getTotalAlignSequenceNumber() : " + snpchromosome.getTotalAlignSequenceNumber() );
             		//System.out.println("snpchromosome.getScoreProvean() : " + snpchromosome.getScoreProvean() );

             		// Does the input row have any Provean/Sift data
         			if ( snpchromosome.getScoreSift() == 0 &&
         					snpchromosome.getScoreConservation() == 0 &&
         					snpchromosome.getProteinAlignNumber() == 0 &&
         					snpchromosome.getTotalAlignSequenceNumber() == 0 && 
         					snpchromosome.getScoreProvean() == 0 ) {
         				
         				// No data on the row - Therefore IGNORE
         				addRow = false;
         			}
         			// Yes data in the row - check values
         			else {
         				// searchFilterProveanScoreValue;
        				if ( dtoSearch.isSearchFilterProveanScoreAbove() ) {
        					if ( !dtoSearch.isSearchFilterProveanScoreValueZero() ) {
        						if ( snpchromosome.getScoreProvean() > dtoSearch.getSearchFilterProveanScoreValueAsDouble() ) {
        							addRow = true;
        						}
        					}
        				}
        				else {
        					if ( !dtoSearch.isSearchFilterProveanScoreValueZero() ) {
        						if ( snpchromosome.getScoreProvean() < dtoSearch.getSearchFilterProveanScoreValueAsDouble() ) {
          							addRow = true;
        						}
        					}
         				}
         				// searchFilterSiftScoreValue;
         				if ( dtoSearch.isSearchFilterSiftScoreAbove()) {
         				    if ( !dtoSearch.isSearchFilterSiftScoreValueZero() ) {
         				        if ( snpchromosome.getScoreSift() > dtoSearch.getSearchFilterSiftScoreValueAsDouble() ) {
         				        	addRow = true;
         				        }
         				    }
         				}
         				else {
         					if ( !dtoSearch.isSearchFilterSiftScoreValueZero() ) {
         						if ( snpchromosome.getScoreSift() < dtoSearch.getSearchFilterSiftScoreValueAsDouble() ) {
         							addRow = true;
         						}
         					}
         				}
         				// searchFilterSiftConservationScoreValue
         				if ( dtoSearch.isSearchFilterSiftConservationScoreAbove() ) {
         					if ( !dtoSearch.isSearchFilterSiftConservationScoreValueZero() ) {
         						if ( snpchromosome.getScoreConservation() > dtoSearch.getSearchFilterSiftConservationScoreValueAsDouble() ) {
         							addRow = true;
         						}
         					}
         				}
         				else {
         					if ( !dtoSearch.isSearchFilterSiftConservationScoreValueZero() ) {
         						if ( snpchromosome.getScoreConservation() < dtoSearch.getSearchFilterSiftConservationScoreValueAsDouble() ) {
         							addRow = true;
         						}
         					}
         				}
         				// searchFilterProteinAlignNumberValue
         				if ( dtoSearch.isSearchFilterProteinAlignNumberAbove() ) {
         					if ( !dtoSearch.isSearchFilterProteinAlignNumberValueZero() ) {
         						if ( snpchromosome.getProteinAlignNumber() > dtoSearch.getSearchFilterProteinAlignNumberValueAsLong() ) {
         							addRow = true;
        						}
         					}
         				}
         				else {
         					if ( !dtoSearch.isSearchFilterProteinAlignNumberValueZero() ) {
         						if ( snpchromosome.getProteinAlignNumber() < dtoSearch.getSearchFilterProteinAlignNumberValueAsLong() ) {
         							addRow = true;
         						}
         					}
         				}
         				// searchFilterTotalNumberSeqAlignedValue
         				if ( dtoSearch.isSearchFilterTotalNumberSeqAlignedAbove() ) {
         					if ( !dtoSearch.isSearchFilterTotalNumberSeqAlignedValueZero() ) {
         						if ( snpchromosome.getTotalAlignSequenceNumber() > dtoSearch.getSearchFilterTotalNumberSeqAlignedValueAsLong() ) {
         							addRow = true;
         						}
         					}
         				}
         				else {
         					if ( !dtoSearch.isSearchFilterTotalNumberSeqAlignedValueZero() ) {
         						if ( snpchromosome.getTotalAlignSequenceNumber() < dtoSearch.getSearchFilterTotalNumberSeqAlignedValueAsLong() ) {
         							addRow = true;
         						}
         					}
         				}
         			}
         		}

         		// Have we found a row to add; that matches our filter criteria?
         		if ( addRow ) {
         			
         			snpchromosomesFiltered.add(snpchromosome);
         		}
         	}

        	if ( snpchromosomesFiltered.size() % NUMBER_OF_SNPCHROMOSOMES_PER_PAGE == 0  ) {
            	
        		intTotalPages = ( ObjectConverter.convert(snpchromosomesFiltered.size(), Integer.class) / NUMBER_OF_SNPCHROMOSOMES_PER_PAGE);
        	}
        	else {
        		
        	    intTotalPages = ( ObjectConverter.convert(snpchromosomesFiltered.size(), Integer.class) / NUMBER_OF_SNPCHROMOSOMES_PER_PAGE ) + 1;
        	}
        	
        	intStart = ( ( pageNumber - 1 ) * NUMBER_OF_SNPCHROMOSOMES_PER_PAGE ) + 1;
        			
        	if ( pageNumber < intTotalPages ) {
        		
        		intStop = pageNumber * NUMBER_OF_SNPCHROMOSOMES_PER_PAGE;
        	}
        	else {
        		
        		intStop = ObjectConverter.convert(snpchromosomesFiltered.size(), Integer.class);
        	}
        	
         	//System.out.println("snpchromosomesFiltered.size() : " + snpchromosomesFiltered.size());
            
         	//System.out.println("intStart : " + intStart);
            //System.out.println("intStop : " + intStop);
            //System.out.println("intTotalPages : " + intTotalPages);
        			
            snpchromosomesCutdown = snpchromosomesFiltered.subList(intStart - 1, intStop);
            
         	//System.out.println("snpchromosomesCutdown.size() : " + snpchromosomesCutdown.size());

            if ( strColumn.equals(FIELD_POSITION) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByPositionAsc());
            }
            if ( strColumn.equals(FIELD_POSITION) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByPositionDesc());
            }
            if ( strColumn.equals(FIELD_REFERENCE) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByReferenceAsc());
            }
            if ( strColumn.equals(FIELD_REFERENCE) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByReferenceDesc());
            }
            if ( strColumn.equals(FIELD_ALTERNATIVE) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByAlternativeAsc());
            }
            if ( strColumn.equals(FIELD_ALTERNATIVE) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByAlternativeDesc());
            }
            if ( strColumn.equals(FIELD_REGION) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByRegionAsc());
            }
            if ( strColumn.equals(FIELD_REGION) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByRegionDesc());
            }
            if ( strColumn.equals(FIELD_ENSEMBL_GENE) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByEnsemblGeneAsc());
            }
            if ( strColumn.equals(FIELD_ENSEMBL_GENE) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByEnsemblGeneDesc());
            }
            if ( strColumn.equals(FIELD_ENSEMBL_TRANSCRIPT) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByEnsemblTranscriptAsc());
            }
            if ( strColumn.equals(FIELD_ENSEMBL_TRANSCRIPT) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByEnsemblTranscriptDesc());
            }
            if ( strColumn.equals(FIELD_ENSEMBL_ANNOTATION) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByEnsemblAnnotationAsc());
            }
            if ( strColumn.equals(FIELD_ENSEMBL_ANNOTATION) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByEnsemblAnnotationDesc());
            }
            if ( strColumn.equals(FIELD_AMINO_ACID_SUBSITUTION) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByAminoAcidSubsAsc());
            }
            if ( strColumn.equals(FIELD_AMINO_ACID_SUBSITUTION) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByAminoAcidSubsDesc());
            }
            if ( strColumn.equals(FIELD_PREDICTION_CATEGORY) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByPredictionCategoryAsc());
            }
            if ( strColumn.equals(FIELD_PREDICTION_CATEGORY) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByPredictionCategoryDesc());
            }
            if ( strColumn.equals(FIELD_SIFT_SCORE) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByScoreSiftAsc());
            }
            if ( strColumn.equals(FIELD_SIFT_SCORE) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByScoreSiftDesc());
            }
            if ( strColumn.equals(FIELD_SIFT_SCORE_CONSERVATION) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByScoreConservationAsc());
            }
            if ( strColumn.equals(FIELD_SIFT_SCORE_CONSERVATION) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByScoreConservationDesc());
            }
            if ( strColumn.equals(FIELD_PROTEIN_ALIGNMENT_NUMBER) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByProteinAlignNumberAsc());
            }
            if ( strColumn.equals(FIELD_PROTEIN_ALIGNMENT_NUMBER) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByProteinAlignNumberDesc());
            }
            if ( strColumn.equals(FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByTotalAlignSequenceNumberAsc());
            }
            if ( strColumn.equals(FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByTotalAlignSequenceNumberDesc());
            }
            if ( strColumn.equals(FIELD_PROVEAN_SCORE) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByScoreProveanAsc());
            }
            if ( strColumn.equals(FIELD_PROVEAN_SCORE) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpchromosomesCutdown, new SNPChromosome.OrderByScoreProveanDesc());
            }
        }
        
        PageSNPChromosome pagesnpchromosome = new PageSNPChromosome(pageNumber, intTotalPages, snpchromosomes.size(), snpchromosomesCutdown);

        return pagesnpchromosome;
    }
    
    
    /*
    @Transactional(readOnly = true)
    public PageSNPChromosome findAll(Integer pageNumber) {
    	
        LOGGER.debug("Finding all snpchromosomes");

        PageRequest pageRequest = new PageRequest(pageNumber - 1, NUMBER_OF_SNPCHROMOSOMES_PER_PAGE, Sort.Direction.ASC, "position");
        
        Page<SNPChromosome> pagesnpchromosomes = repositorysnpchromosome.findAll(pageRequest);
        
    	List<SNPChromosome> snpchromosomes = pagesnpchromosomes.getContent();
    	
    	PageSNPChromosome pagesnpchromosome = new PageSNPChromosome(snpchromosomes.getNumber(), snpchromosomes.getTotalPages(), snpchromosomes.getTotalElements(), snpchromosomes);

        return pagesnpchromosome;
    }
     */
    
    @Transactional(readOnly = true)
    public List<SNPChromosome> findBySnpId(String SnpId) {
    	
        LOGGER.debug("Find a snpchromosome with SNP Id: " + SnpId);
        
        List<SNPChromosome> snpchromosomeList = repositorysnpchromosome.findBySnpId(SnpId);
        
        return snpchromosomeList;
    }

    
    @Transactional(readOnly = true)
    public SNPChromosome findByOidAndPartitionId( long oid, long partitionId ) {
    	
        LOGGER.debug("Find a snpchromosome with Oid : " + oid + " with partitionId : " + partitionId);
        
        SNPChromosome snpchromosome = repositorysnpchromosome.findByOidAndPartitionId( oid, partitionId );
        
        return snpchromosome;
    }

    
    @Transactional(rollbackFor = ExceptionSNPChromosomeNotFound.class)
    public SNPChromosome update(SNPChromosome updated) throws ExceptionSNPChromosomeNotFound {
    	
        LOGGER.debug("Updating snpchromosome with information: " + updated);
        
        SNPChromosome snpchromosome = repositorysnpchromosome.findByOidAndPartitionId( updated.getSnpChromosomePrimaryKey().getOid(), updated.getSnpChromosomePrimaryKey().getPartitionId() );
        
        if (snpchromosome == null) {
        	
            LOGGER.debug("No snpchromosome found with id: " + updated.getSnpChromosomePrimaryKey().getOid());
            
            throw new ExceptionSNPChromosomeNotFound("No snpchromosome found with id: " + updated.getSnpChromosomePrimaryKey().getOid());
        }
        
        snpchromosome.update(
        		updated.getSnpChromosomePrimaryKey().getOid(),
        		updated.getSnpChromosomePrimaryKey().getPartitionId(),
        		
        		updated.getSnpId(),
        		updated.getChromosomeId(),
        		updated.getPosition(),
        		updated.getReference(),    
        		updated.getAlternative(),
        		updated.getRegion(),
        		updated.getEnsemblGene(),
        		updated.getEnsemblTranscript(),
        		updated.getEnsemblAnnotation(),
        		
      		    updated.getStrain7Allele(),
       		    updated.getStrain7AlleleFixed(),
       		    updated.getStrain7AlleleRatio(),
    		    updated.getStrain7AlleleAlternativeCount(),
    		    updated.getStrain7AlleleReferenceCount(),

       		    updated.getStrainPAllele(),
       		    updated.getStrainPAlleleFixed(),
       		    updated.getStrainPAlleleRatio(),
    		    updated.getStrainPAlleleAlternativeCount(),
    		    updated.getStrainPAlleleReferenceCount(),

       		    updated.getStrainWAllele(),
       		    updated.getStrainWAlleleFixed(),
       		    updated.getStrainWAlleleRatio(),
    		    updated.getStrainWAlleleAlternativeCount(),
    		    updated.getStrainWAlleleReferenceCount(),

       		    updated.getStrainNAllele(),
       		    updated.getStrainNAlleleFixed(),
       		    updated.getStrainNAlleleRatio(),
    		    updated.getStrainNAlleleAlternativeCount(),
    		    updated.getStrainNAlleleReferenceCount(),

       		    updated.getStrain15IAllele(),
       		    updated.getStrain15IAlleleFixed(),
       		    updated.getStrain15IAlleleRatio(),
    		    updated.getStrain15IAlleleAlternativeCount(),
    		    updated.getStrain15IAlleleReferenceCount(),

       		    updated.getStrainZeroAllele(),
       		    updated.getStrainZeroAlleleFixed(),
       		    updated.getStrainZeroAlleleRatio(),
    		    updated.getStrainZeroAlleleAlternativeCount(),
    		    updated.getStrainZeroAlleleReferenceCount(),

       		    updated.getStrain6Allele(),
       		    updated.getStrain6AlleleFixed(),
       		    updated.getStrain6AlleleRatio(),
    		    updated.getStrain6AlleleAlternativeCount(),
    		    updated.getStrain6AlleleReferenceCount(),

       		    updated.getStrainCAllele(),
       		    updated.getStrainCAlleleFixed(),
       		    updated.getStrainCAlleleRatio(),
    		    updated.getStrainCAlleleAlternativeCount(),
    		    updated.getStrainCAlleleReferenceCount(),

                updated.getAminoAcidSubs(),
                updated.getPredictionCategory(),
                updated.getScoreSift(),
                updated.getScoreConservation(),
                updated.getProteinAlignNumber(),
                updated.getTotalAlignSequenceNumber(),
                updated.getScoreProvean()
        		);

        return snpchromosome;
    }

    /**
     * This setter method should be used only by unit tests.
     * @param repositorySNPChromosome
     */
    protected void setRepositorySNPChromosome(RepositorySNPChromosome repositorysnpchromosome) {
    	
        this.repositorysnpchromosome = repositorysnpchromosome;
    }

}
