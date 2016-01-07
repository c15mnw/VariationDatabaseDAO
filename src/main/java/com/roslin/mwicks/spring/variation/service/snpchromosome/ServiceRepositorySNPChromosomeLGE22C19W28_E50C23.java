package com.roslin.mwicks.spring.variation.service.snpchromosome;

import com.roslin.mwicks.spring.variation.dto.offline.DTOSNPChromosome;
import com.roslin.mwicks.spring.variation.dto.web.DTODownload;
import com.roslin.mwicks.spring.variation.dto.web.DTOSearch;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeNotFound;

import com.roslin.mwicks.spring.variation.model.other.PageSNPChromosome;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosomeLGE22C19W28_E50C23;
import com.roslin.mwicks.spring.variation.repository.snpchromosome.RepositorySNPChromosomeLGE22C19W28_E50C23;

import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosomeLGE22C19W28_E50C23;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


/**
 * This implementation of the SNPChromosomeService interface communicates with
 * the database by using a Spring Data JPA repository.
 * @author Mike Wicks
 */
@Service
public class ServiceRepositorySNPChromosomeLGE22C19W28_E50C23 implements ServiceSNPChromosomeLGE22C19W28_E50C23 {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceRepositorySNPChromosomeLGE22C19W28_E50C23.class);
    
    private static final int NUMBER_OF_SNPCHROMOSOMES_PER_PAGE = 30;

    @Resource
    private RepositorySNPChromosomeLGE22C19W28_E50C23 repositorysnpchromosome;
    
    @PersistenceContext
    private EntityManager entityManager;
     
    
    @Transactional(readOnly = true)
    public List<SNPChromosomeLGE22C19W28_E50C23> findBySnpId(String SnpId) {
    	
        LOGGER.debug("Find a snpchromosome with SNP Id: " + SnpId);
        
        List<SNPChromosomeLGE22C19W28_E50C23> snpchromosomeList = repositorysnpchromosome.findBySnpId(SnpId);
        
        return snpchromosomeList;
    }


    @Transactional(readOnly = true)
    public SNPChromosomeLGE22C19W28_E50C23 findByOid(Long oid) {
    	
        LOGGER.debug("Finding SNPChromosome by oid: " + oid);
        
        return repositorysnpchromosome.findOne(oid);
    }

    
    @Transactional
    public <T extends SNPChromosomeLGE22C19W28_E50C23> Collection<T> bulkSave(int intBatchSize, Collection<T> entities) {
    	
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
    	 
    /*
    private <T extends SNPChromosomeLGE22C19W28_E50C23> T persistOrMerge(T t) {
    
    	if (t.getOid() == 0) {
    	
    		entityManager.persist(t);
    		return t;
    	} 
    	else {
    	
    		return entityManager.merge(t);
    	}
    }*/
    
    
    @Transactional(readOnly = true)
    public List<SNPChromosome> download(DTODownload dtoDownload) {
        
    	LOGGER.debug("Downloading snpchromosomes with download criteria: " + dtoDownload);
    	
    	List<SNPChromosomeLGE22C19W28_E50C23> snpchromosomeLGE22C19W28_E50C23s = null;
    	
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain7NEStrainP");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain7NEStrainP(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain7NEStrainW");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain7NEStrainW(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain7NEStrainN");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain7NEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain7NEStrain15I");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain7NEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain7NEstrainZero");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain7NEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain7NEStrain6");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain7NEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain7NEStrainC");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain7NEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainPNEStrain&");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain7NEStrainP(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainPNEStrainW");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainPNEStrainW(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainPNEStrainN");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainPNEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainPNEStrain15I");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainPNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainPNEstrainZero");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainPNEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainPNEStrain6");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainPNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainPNEStrainC");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainPNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainWNEStrainW");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain7NEStrainW(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainWNEStrainW");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainPNEStrainW(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainWNEStrainN");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainWNEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainWNEStrain15I");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainWNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainWNEstrainZero");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainWNEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainWNEStrain6");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainWNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainWNEStrainC");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainWNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrain7NEStrainN");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain7NEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainPNEStrainN");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainPNEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainWNEStrainN");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainWNEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainNNEStrain15I");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainNNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainNNEstrainZero");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainNNEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainNNEStrain6");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainNNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainNNEStrainC");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainNNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrain7NEStrain15I");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain7NEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainPNEStrain15I");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainPNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainNNEStrain15I");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainNNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainWNEStrain15I");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainWNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain15INEstrainZero");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain15INEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain15INEStrain6");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain15INEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain15INEStrainC");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain15INEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrain7NEstrainZero");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain7NEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainPNEstrainZero");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainPNEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainNNEstrainZero");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainNNEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainWNEstrainZero");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainWNEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrain15INEstrainZero");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain15INEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDstrainZeroNEStrain6");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDstrainZeroNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDstrainZeroNEStrainC");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDstrainZeroNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrain7NEStrain6");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain7NEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainPNEStrain6");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainPNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainNNEStrain6");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainNNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainWNEStrain6");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainWNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrain15INEStrain6");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain15INEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDstrainZeroNEStrain6");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDstrainZeroNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDstrainZeroNEStrainC");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDstrainZeroNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrain7NEStrainC");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain7NEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainPNEStrainC");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainPNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainNNEStrainC");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainNNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainWNEStrainC");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrainWNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrain15INEStrainC");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain15INEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using findByRangeANDstrainZeroNEStrainC");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDstrainZeroNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrain6NEStrainC");
            snpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.listByRangeANDStrain6NEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

    	List<SNPChromosome> snpchromosomes = new ArrayList<SNPChromosome>();
    	
        Iterator<SNPChromosomeLGE22C19W28_E50C23> iteratorSNPChromosomeLGE22C19W28_E50C23 = snpchromosomeLGE22C19W28_E50C23s.iterator();
        
     	while (iteratorSNPChromosomeLGE22C19W28_E50C23.hasNext()) {
    		
     		SNPChromosomeLGE22C19W28_E50C23 snpchromosomeLGE22C19W28_E50C23 = iteratorSNPChromosomeLGE22C19W28_E50C23.next();
     		
     		SNPChromosome snpchromosome = snpchromosomeLGE22C19W28_E50C23.convert();
     		
     		snpchromosomes.add(snpchromosome);
     	}
     	
        return snpchromosomes;
    }

    
    @Transactional(readOnly = true)
    public PageSNPChromosome search(DTOSearch dtoSearch, Integer pageNumber) {
        
    	LOGGER.debug("Searching snpchromosomes with search criteria: " + dtoSearch);

    	Page<SNPChromosomeLGE22C19W28_E50C23> pagesnpchromosomeLGE22C19W28_E50C23s = null;

    	PageRequest pageRequest = new PageRequest(pageNumber - 1, NUMBER_OF_SNPCHROMOSOMES_PER_PAGE, Sort.Direction.ASC, "snpId");

        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain7NEStrainP");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain7NEStrainP(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain7NEStrainW");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain7NEStrainW(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain7NEStrainN");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain7NEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain7NEStrain15I");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain7NEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain7NEstrainZero");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain7NEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain7NEStrain6");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain7NEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain7NEStrainC");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain7NEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainPNEStrain&");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain7NEStrainP(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainPNEStrainW");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainPNEStrainW(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainPNEStrainN");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainPNEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainPNEStrain15I");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainPNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainPNEstrainZero");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainPNEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainPNEStrain6");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainPNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainPNEStrainC");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainPNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainWNEStrainW");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain7NEStrainW(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainWNEStrainW");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainPNEStrainW(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainWNEStrainN");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainWNEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainWNEStrain15I");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainWNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainWNEstrainZero");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainWNEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainWNEStrain6");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainWNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainWNEStrainC");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainWNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrain7NEStrainN");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain7NEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainPNEStrainN");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainPNEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainWNEStrainN");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainWNEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainNNEStrain15I");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainNNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainNNEstrainZero");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainNNEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainNNEStrain6");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainNNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrainNNEStrainC");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainNNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrain7NEStrain15I");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain7NEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainPNEStrain15I");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainPNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainNNEStrain15I");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainNNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainWNEStrain15I");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainWNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain15INEstrainZero");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain15INEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain15INEStrain6");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain15INEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDStrain15INEStrainC");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain15INEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrain7NEstrainZero");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain7NEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainPNEstrainZero");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainPNEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainNNEstrainZero");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainNNEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainWNEstrainZero");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainWNEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrain15INEstrainZero");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain15INEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDstrainZeroNEStrain6");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDstrainZeroNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDstrainZeroNEStrainC");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDstrainZeroNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrain7NEStrain6");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain7NEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainPNEStrain6");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainPNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainNNEStrain6");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainNNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainWNEStrain6");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainWNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrain15INEStrain6");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain15INEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDstrainZeroNEStrain6");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDstrainZeroNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDstrainZeroNEStrainC");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDstrainZeroNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrain7NEStrainC");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain7NEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainPNEStrainC");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainPNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainNNEStrainC");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainNNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrainWNEStrainC");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrainWNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrain15INEStrainC");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain15INEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using findByRangeANDstrainZeroNEStrainC");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDstrainZeroNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosomeLGE22C19W28_E50C23s by using listByRangeANDStrain6NEStrainC");
            pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findByRangeANDStrain6NEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        
    	List<SNPChromosomeLGE22C19W28_E50C23> snpchromosomeLGE22C19W28_E50C23s = pagesnpchromosomeLGE22C19W28_E50C23s.getContent();
    	List<SNPChromosome> snpchromosomes = new ArrayList<SNPChromosome>();
    	
        Iterator<SNPChromosomeLGE22C19W28_E50C23> iteratorSNPChromosomeLGE22C19W28_E50C23 = snpchromosomeLGE22C19W28_E50C23s.iterator();
        
     	while (iteratorSNPChromosomeLGE22C19W28_E50C23.hasNext()) {
    		
     		SNPChromosomeLGE22C19W28_E50C23 snpchromosomeLGE22C19W28_E50C23 = iteratorSNPChromosomeLGE22C19W28_E50C23.next();
     		
     		SNPChromosome snpchromosome = snpchromosomeLGE22C19W28_E50C23.convert();
     		
     		snpchromosomes.add(snpchromosome);
     	}
     	
    	PageSNPChromosome pagesnpchromosome = new PageSNPChromosome(pagesnpchromosomeLGE22C19W28_E50C23s.getNumber(), pagesnpchromosomeLGE22C19W28_E50C23s.getTotalPages(), pagesnpchromosomeLGE22C19W28_E50C23s.getTotalElements(), snpchromosomes);

        return pagesnpchromosome;
    }
    
    
    @Transactional(readOnly = true)
    public PageSNPChromosome findAll(Integer pageNumber) {
    	
        LOGGER.debug("Finding all snpchromosomes");

        PageRequest pageRequest = new PageRequest(pageNumber - 1, NUMBER_OF_SNPCHROMOSOMES_PER_PAGE, Sort.Direction.ASC, "snpId");
        
        Page<SNPChromosomeLGE22C19W28_E50C23> pagesnpchromosomeLGE22C19W28_E50C23s = repositorysnpchromosome.findAll(pageRequest);
        
    	List<SNPChromosomeLGE22C19W28_E50C23> snpchromosomeLGE22C19W28_E50C23s = pagesnpchromosomeLGE22C19W28_E50C23s.getContent();
    	
    	List<SNPChromosome> snpchromosomes = new ArrayList<SNPChromosome>();
    	
        Iterator<SNPChromosomeLGE22C19W28_E50C23> iteratorSNPChromosomeLGE22C19W28_E50C23 = snpchromosomeLGE22C19W28_E50C23s.iterator();
        
     	while (iteratorSNPChromosomeLGE22C19W28_E50C23.hasNext()) {
    		
     		SNPChromosomeLGE22C19W28_E50C23 snpchromosomeLGE22C19W28_E50C23 = iteratorSNPChromosomeLGE22C19W28_E50C23.next();
     		
     		SNPChromosome snpchromosome = snpchromosomeLGE22C19W28_E50C23.convert();
     		
     		snpchromosomes.add(snpchromosome);
     	}
     	
    	PageSNPChromosome pagesnpchromosome = new PageSNPChromosome(pagesnpchromosomeLGE22C19W28_E50C23s.getNumber(), pagesnpchromosomeLGE22C19W28_E50C23s.getTotalPages(), pagesnpchromosomeLGE22C19W28_E50C23s.getTotalElements(), snpchromosomes);

        return pagesnpchromosome;
    }
    

    @Transactional
    public SNPChromosomeLGE22C19W28_E50C23 create(DTOSNPChromosome created) {
    	
        LOGGER.debug("Creating a new snpchromosome with information: " + created);
        
        SNPChromosomeLGE22C19W28_E50C23 snpchromosome = SNPChromosomeLGE22C19W28_E50C23.getBuilder(
        		created.getSnpId(),
        		created.getChromosomeId(),
        		created.getPositionAsInteger(),
        		created.getReference(),    
        		created.getAlternative(),
        		created.getRegion(),
        		created.getEnsemblGene(),
        		created.getEnsemblTranscript(),
        		created.getEnsemblAnnotation(),
        		created.getStrain7Allele(),
        		created.getStrain7AlleleFixed(),
        		created.getStrainPAllele(),
        		created.getStrainPAlleleFixed(),
        		created.getStrainWAllele(),
        		created.getStrainWAlleleFixed(),
        		created.getStrainNAllele(),
        		created.getStrainNAlleleFixed(),
        		created.getStrain15IAllele(),
        		created.getStrain15IAlleleFixed(),
        		created.getStrainZeroAllele(),
        		created.getStrainZeroAlleleFixed(),
        		created.getStrain6Allele(),
        		created.getStrain6AlleleFixed(),
        		created.getStrainCAllele(),
        		created.getStrainCAlleleFixed(),
                created.getAminoAcidSubs(),
                created.getPredictionCategory(),
                created.getScoreSiftAsLong(),
                created.getScoreConservationAsLong(),
                created.getProteinAlignNumberAsLong(),
                created.getTotalAlignSequenceNumberAsLong(),
                created.getScoreProveanAsLong()
        		).build();
        
        return repositorysnpchromosome.save(snpchromosome);
    }
    

    @Transactional(rollbackFor = ExceptionSNPChromosomeNotFound.class)
    public SNPChromosomeLGE22C19W28_E50C23 delete(Long snpchromosomeId) throws ExceptionSNPChromosomeNotFound {
    	
        LOGGER.debug("Deleting snpchromosome with id: " + snpchromosomeId);
        
        SNPChromosomeLGE22C19W28_E50C23 deleted = repositorysnpchromosome.findOne(snpchromosomeId);
        
        if (deleted == null) {
        	
            LOGGER.debug("No snpchromosome found with id: " + snpchromosomeId);
            
            throw new ExceptionSNPChromosomeNotFound("No snpchromosome found with id: " + snpchromosomeId);
        }
        
        repositorysnpchromosome.delete(deleted);
        return deleted;
    }

    
    @Transactional(rollbackFor = ExceptionSNPChromosomeNotFound.class)
    public SNPChromosomeLGE22C19W28_E50C23 update(SNPChromosomeLGE22C19W28_E50C23 updated) throws ExceptionSNPChromosomeNotFound {
    	
        LOGGER.debug("Updating snpchromosome with information: " + updated);
        
        SNPChromosomeLGE22C19W28_E50C23 snpchromosome = repositorysnpchromosome.findOne(updated.getOid());
        
        if (snpchromosome == null) {
        	
            LOGGER.debug("No snpchromosome found with id: " + updated.getOid());
            
            throw new ExceptionSNPChromosomeNotFound("No snpchromosome found with id: " + updated.getOid());
        }
        
        snpchromosome.update(
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
        		updated.getStrainPAllele(),
        		updated.getStrainPAlleleFixed(),
        		updated.getStrainWAllele(),
        		updated.getStrainWAlleleFixed(),
        		updated.getStrainNAllele(),
        		updated.getStrainNAlleleFixed(),
        		updated.getStrain15IAllele(),
        		updated.getStrain15IAlleleFixed(),
        		updated.getStrainZeroAllele(),
        		updated.getStrainZeroAlleleFixed(),
        		updated.getStrain6Allele(),
        		updated.getStrain6AlleleFixed(),
        		updated.getStrainCAllele(),
        		updated.getStrainCAlleleFixed(),
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
    protected void setRepositorySNPChromosome(RepositorySNPChromosomeLGE22C19W28_E50C23 repositorysnpchromosome) {
    	
        this.repositorysnpchromosome = repositorysnpchromosome;
    }

}
