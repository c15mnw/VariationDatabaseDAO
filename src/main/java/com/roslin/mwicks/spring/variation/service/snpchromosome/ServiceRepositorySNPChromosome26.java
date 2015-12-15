package com.roslin.mwicks.spring.variation.service.snpchromosome;

import com.roslin.mwicks.spring.variation.dto.DTOSearch;
import com.roslin.mwicks.spring.variation.dto.DTODownload;
import com.roslin.mwicks.spring.variation.dto.DTOSNPChromosome;

import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeNotFound;

import com.roslin.mwicks.spring.variation.model.other.PageSNPChromosome;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome26;
import com.roslin.mwicks.spring.variation.repository.snpchromosome.RepositorySNPChromosome26;

import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome26;

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
public class ServiceRepositorySNPChromosome26 implements ServiceSNPChromosome26 {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceRepositorySNPChromosome26.class);
    
    private static final int NUMBER_OF_SNPCHROMOSOMES_PER_PAGE = 30;

    @PersistenceContext
    private EntityManager entityManager;
     
    @Resource
    private RepositorySNPChromosome26 repositorysnpchromosome;

    
    @Transactional(readOnly = true)
    public List<SNPChromosome26> findBySnpId(String SnpId) {
    	
        LOGGER.debug("Find a snpchromosome with SNP Id: " + SnpId);
        
        List<SNPChromosome26> snpchromosomeList = repositorysnpchromosome.findBySnpId(SnpId);
        
        return snpchromosomeList;
    }


    @Transactional(readOnly = true)
    public SNPChromosome26 findByOid(Long oid) {
    	
        LOGGER.debug("Finding SNPChromosome by oid: " + oid);
        
        return repositorysnpchromosome.findOne(oid);
    }

    
    @Transactional
    public <T extends SNPChromosome26> Collection<T> bulkSave(int intBatchSize, Collection<T> entities) {
    	
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
    private <T extends SNPChromosome26> T persistOrMerge(T t) {
    
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
    	
    	List<SNPChromosome26> snpchromosome26s = null;
    	
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrain7NEStrainP");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain7NEStrainP(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrain7NEStrainW");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain7NEStrainW(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrain7NEStrainN");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain7NEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrain7NEStrain15I");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain7NEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrain7NEstrainZero");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain7NEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrain7NEStrain6");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain7NEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrain7NEStrainC");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain7NEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrainPNEStrain&");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain7NEStrainP(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrainPNEStrainW");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainPNEStrainW(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrainPNEStrainN");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainPNEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrainPNEStrain15I");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainPNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrainPNEstrainZero");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainPNEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrainPNEStrain6");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainPNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrainPNEStrainC");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainPNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrainWNEStrainW");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain7NEStrainW(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrainWNEStrainW");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainPNEStrainW(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrainWNEStrainN");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainWNEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrainWNEStrain15I");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainWNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrainWNEstrainZero");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainWNEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrainWNEStrain6");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainWNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrainWNEStrainC");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainWNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrain7NEStrainN");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain7NEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrainPNEStrainN");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainPNEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrainWNEStrainN");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainWNEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrainNNEStrain15I");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainNNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrainNNEstrainZero");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainNNEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrainNNEStrain6");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainNNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrainNNEStrainC");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainNNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrain7NEStrain15I");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain7NEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrainPNEStrain15I");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainPNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrainNNEStrain15I");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainNNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrainWNEStrain15I");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainWNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrain15INEstrainZero");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain15INEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrain15INEStrain6");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain15INEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDStrain15INEStrainC");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain15INEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrain7NEstrainZero");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain7NEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrainPNEstrainZero");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainPNEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrainNNEstrainZero");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainNNEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrainWNEstrainZero");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainWNEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrain15INEstrainZero");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain15INEstrainZero(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDstrainZeroNEStrain6");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDstrainZeroNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDstrainZeroNEStrainC");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDstrainZeroNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrain7NEStrain6");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain7NEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrainPNEStrain6");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainPNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrainNNEStrain6");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainNNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrainWNEStrain6");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainWNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrain15INEStrain6");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain15INEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDstrainZeroNEStrain6");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDstrainZeroNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDstrainZeroNEStrainC");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDstrainZeroNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrain7NEStrainC");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain7NEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrainPNEStrainC");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainPNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrainNNEStrainC");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainNNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrainWNEStrainC");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrainWNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrain15INEStrainC");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain15INEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome26s by using findByRangeANDstrainZeroNEStrainC");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDstrainZeroNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome26s by using listByRangeANDStrain6NEStrainC");
            snpchromosome26s = repositorysnpchromosome.listByRangeANDStrain6NEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

    	List<SNPChromosome> snpchromosomes = new ArrayList<SNPChromosome>();
    	
        Iterator<SNPChromosome26> iteratorSNPChromosome26 = snpchromosome26s.iterator();
        
     	while (iteratorSNPChromosome26.hasNext()) {
    		
     		SNPChromosome26 snpchromosome26 = iteratorSNPChromosome26.next();
     		
     		SNPChromosome snpchromosome = snpchromosome26.convert();
     		
     		snpchromosomes.add(snpchromosome);
     	}
     	
        return snpchromosomes;
    }

    
    @Transactional(readOnly = true)
    public PageSNPChromosome search(DTOSearch dtoSearch, Integer pageNumber) {
        
    	LOGGER.debug("Searching snpchromosomes with search criteria: " + dtoSearch);

    	Page<SNPChromosome26> pagesnpchromosome26s = null;

    	PageRequest pageRequest = new PageRequest(pageNumber - 1, NUMBER_OF_SNPCHROMOSOMES_PER_PAGE, Sort.Direction.ASC, "snpId");

        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrain7NEStrainP");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain7NEStrainP(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrain7NEStrainW");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain7NEStrainW(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrain7NEStrainN");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain7NEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrain7NEStrain15I");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain7NEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrain7NEstrainZero");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain7NEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrain7NEStrain6");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain7NEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrain7NEStrainC");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain7NEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrainPNEStrain&");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain7NEStrainP(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrainPNEStrainW");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainPNEStrainW(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrainPNEStrainN");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainPNEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrainPNEStrain15I");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainPNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrainPNEstrainZero");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainPNEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrainPNEStrain6");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainPNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrainPNEStrainC");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainPNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrainWNEStrainW");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain7NEStrainW(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrainWNEStrainW");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainPNEStrainW(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrainWNEStrainN");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainWNEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrainWNEStrain15I");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainWNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrainWNEstrainZero");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainWNEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrainWNEStrain6");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainWNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrainWNEStrainC");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainWNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrain7NEStrainN");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain7NEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrainPNEStrainN");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainPNEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrainWNEStrainN");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainWNEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrainNNEStrain15I");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainNNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrainNNEstrainZero");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainNNEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrainNNEStrain6");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainNNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrainNNEStrainC");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainNNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrain7NEStrain15I");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain7NEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrainPNEStrain15I");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainPNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrainNNEStrain15I");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainNNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrainWNEStrain15I");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainWNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrain15INEstrainZero");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain15INEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrain15INEStrain6");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain15INEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDStrain15INEStrainC");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain15INEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrain7NEstrainZero");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain7NEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrainPNEstrainZero");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainPNEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrainNNEstrainZero");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainNNEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrainWNEstrainZero");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainWNEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrain15INEstrainZero");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain15INEstrainZero(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDstrainZeroNEStrain6");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDstrainZeroNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDstrainZeroNEStrainC");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDstrainZeroNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrain7NEStrain6");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain7NEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrainPNEStrain6");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainPNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrainNNEStrain6");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainNNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrainWNEStrain6");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainWNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrain15INEStrain6");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain15INEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDstrainZeroNEStrain6");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDstrainZeroNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDstrainZeroNEStrainC");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDstrainZeroNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrain7NEStrainC");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain7NEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrainPNEStrainC");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainPNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrainNNEStrainC");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainNNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrainWNEStrainC");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrainWNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrain15INEStrainC");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain15INEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using findByRangeANDstrainZeroNEStrainC");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDstrainZeroNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome26s by using listByRangeANDStrain6NEStrainC");
            pagesnpchromosome26s = repositorysnpchromosome.findByRangeANDStrain6NEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        
    	List<SNPChromosome26> snpchromosome26s = pagesnpchromosome26s.getContent();
    	List<SNPChromosome> snpchromosomes = new ArrayList<SNPChromosome>();
    	
        Iterator<SNPChromosome26> iteratorSNPChromosome26 = snpchromosome26s.iterator();
        
     	while (iteratorSNPChromosome26.hasNext()) {
    		
     		SNPChromosome26 snpchromosome26 = iteratorSNPChromosome26.next();
     		
     		SNPChromosome snpchromosome = snpchromosome26.convert();
     		
     		snpchromosomes.add(snpchromosome);
     	}
     	
    	PageSNPChromosome pagesnpchromosome = new PageSNPChromosome(pagesnpchromosome26s.getNumber(), pagesnpchromosome26s.getTotalPages(), pagesnpchromosome26s.getTotalElements(), snpchromosomes);

        return pagesnpchromosome;
    }
    
    
    @Transactional(readOnly = true)
    public PageSNPChromosome findAll(Integer pageNumber) {
    	
        LOGGER.debug("Finding all snpchromosomes");

        PageRequest pageRequest = new PageRequest(pageNumber - 1, NUMBER_OF_SNPCHROMOSOMES_PER_PAGE, Sort.Direction.ASC, "snpId");
        
        Page<SNPChromosome26> pagesnpchromosome26s = repositorysnpchromosome.findAll(pageRequest);
        
    	List<SNPChromosome26> snpchromosome26s = pagesnpchromosome26s.getContent();
    	
    	List<SNPChromosome> snpchromosomes = new ArrayList<SNPChromosome>();
    	
        Iterator<SNPChromosome26> iteratorSNPChromosome26 = snpchromosome26s.iterator();
        
     	while (iteratorSNPChromosome26.hasNext()) {
    		
     		SNPChromosome26 snpchromosome26 = iteratorSNPChromosome26.next();
     		
     		SNPChromosome snpchromosome = snpchromosome26.convert();
     		
     		snpchromosomes.add(snpchromosome);
     	}
     	
    	PageSNPChromosome pagesnpchromosome = new PageSNPChromosome(pagesnpchromosome26s.getNumber(), pagesnpchromosome26s.getTotalPages(), pagesnpchromosome26s.getTotalElements(), snpchromosomes);

        return pagesnpchromosome;
    }
    

    @Transactional
    public SNPChromosome26 create(DTOSNPChromosome created) {
    	
        LOGGER.debug("Creating a new snpchromosome with information: " + created);
        
        SNPChromosome26 snpchromosome = SNPChromosome26.getBuilder(
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
    public SNPChromosome26 delete(Long snpchromosomeId) throws ExceptionSNPChromosomeNotFound {
    	
        LOGGER.debug("Deleting snpchromosome with id: " + snpchromosomeId);
        
        SNPChromosome26 deleted = repositorysnpchromosome.findOne(snpchromosomeId);
        
        if (deleted == null) {
        	
            LOGGER.debug("No snpchromosome found with id: " + snpchromosomeId);
            
            throw new ExceptionSNPChromosomeNotFound("No snpchromosome found with id: " + snpchromosomeId);
        }
        
        repositorysnpchromosome.delete(deleted);
        return deleted;
    }

    
    @Transactional(rollbackFor = ExceptionSNPChromosomeNotFound.class)
    public SNPChromosome26 update(SNPChromosome26 updated) throws ExceptionSNPChromosomeNotFound {
    	
        LOGGER.debug("Updating snpchromosome with information: " + updated);
        
        SNPChromosome26 snpchromosome = repositorysnpchromosome.findOne(updated.getOid());
        
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
    protected void setRepositorySNPChromosome(RepositorySNPChromosome26 repositorysnpchromosome) {
    	
        this.repositorysnpchromosome = repositorysnpchromosome;
    }

}
