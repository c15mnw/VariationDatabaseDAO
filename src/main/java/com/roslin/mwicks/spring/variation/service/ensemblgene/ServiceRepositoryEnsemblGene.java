package com.roslin.mwicks.spring.variation.service.ensemblgene;

import com.roslin.mwicks.spring.variation.dto.offline.DTOEnsemblGene;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneNotFound;
import com.roslin.mwicks.spring.variation.model.ensemblgene.EnsemblGene;

import com.roslin.mwicks.spring.variation.repository.ensemblgene.RepositoryEnsemblGene;

import com.roslin.mwicks.spring.variation.serviceinterface.ensemblgene.ServiceEnsemblGene;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * This implementation of the SNPChromosomeService interface communicates with
 * the database by using a Spring Data JPA repository.
 * @author Mike Wicks
 */
@Service
public class ServiceRepositoryEnsemblGene implements ServiceEnsemblGene {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceRepositoryEnsemblGene.class);
    
    @Resource
    private RepositoryEnsemblGene repositoryensemblgene;
    
    @PersistenceContext
    private EntityManager entityManager;
     
    
    @Transactional(readOnly = true)
    public List<EnsemblGene> findAll() {
    	
        LOGGER.debug("Finding all EnsemblGene");
        
        return repositoryensemblgene.findAll();
    }

    
    @Transactional(readOnly = true)
    public EnsemblGene findByOid(Long oid) {
    	
        LOGGER.debug("Finding ensemblgene by oid: " + oid);
        
        return repositoryensemblgene.findOne(oid);
    }

    
    @Transactional
    public <T extends EnsemblGene> Collection<T> bulkSave(int intBatchSize, Collection<T> entities) {
    	
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
    	 
    
    /*private <T extends EnsemblGene> T persistOrMerge(T t) {
    
    	if (t.getOid() == 0) {
    	
    		entityManager.persist(t);
    		return t;
    	} 
    	else {
    	
    		return entityManager.merge(t);
    	}
    }
   
    	if (t.getOid() == 0) {
    	
    		entityManager.persist(t);
    		return t;
    	} 
    	else {
    	
    		return entityManager.merge(t);
    	}
    }*/

    
    @Transactional(readOnly = true)
    public List<EnsemblGene> findByGeneName(String strGeneName) {
        
    	LOGGER.debug("Searching Ensembl Genes with search criteria: " + strGeneName);

    	List<EnsemblGene> ensemblgenes = repositoryensemblgene.findByGeneName(strGeneName);
        
    	return ensemblgenes;
    }
    

    @Transactional(readOnly = true)
    public Page<EnsemblGene> findByEnsemblIdLike(String strGeneName, Pageable pageable) {
        
    	LOGGER.debug("Searching Ensembl Genes with search criteria: " + strGeneName);

    	Page<EnsemblGene> ensemblgenes = repositoryensemblgene.findByEnsemblIdLike(strGeneName, pageable);
        
    	return ensemblgenes;
    }
    

    @Transactional
    public EnsemblGene create(DTOEnsemblGene created) {
    	
        LOGGER.debug("Creating a new snpchromosome with information: " + created);
        
        EnsemblGene ensemblgene = EnsemblGene.getBuilder(
        	    created.getEnsemblId(),
        	    created.getRegion(),
        	    created.getChromosomeId(),
        	    created.getStartAsLong(),
        	    created.getEndAsLong(),
        	    created.getStrand()
        		).build();
        
        return repositoryensemblgene.save(ensemblgene);
    }
    

    @Transactional(rollbackFor = ExceptionEnsemblGeneNotFound.class)
    public EnsemblGene delete(Long oid) throws ExceptionEnsemblGeneNotFound {
    	
        LOGGER.debug("Deleting snpchromosome with id: " + oid);
        
        EnsemblGene deleted = repositoryensemblgene.findOne(oid);
        
        if (deleted == null) {
        	
            LOGGER.debug("No snpchromosome found with id: " + oid);
            
            throw new ExceptionEnsemblGeneNotFound("No EnsemblGene found with id: " + oid);
        }
        
        repositoryensemblgene.delete(deleted);
        
        return deleted;
    }

    
    @Transactional(rollbackFor = ExceptionEnsemblGeneNotFound.class)
    public EnsemblGene update(DTOEnsemblGene updated) throws ExceptionEnsemblGeneNotFound {
    	
        LOGGER.debug("Updating snpchromosome with information: " + updated);
        
        EnsemblGene ensemblgene = repositoryensemblgene.findOne(updated.getOid());
        
        if (ensemblgene == null) {
        	
            LOGGER.debug("No snpchromosome found with id: " + updated.getOid());
            
            throw new ExceptionEnsemblGeneNotFound("No EnsemblGene found with id: " + updated.getOid());
        }
        
        ensemblgene.update(
        		ensemblgene.getEnsemblId(),
        		ensemblgene.getRegion(),
        		ensemblgene.getChromosomeId(),
        		ensemblgene.getStart(),
        		ensemblgene.getEnd(),
        		ensemblgene.getStrand()
        		);

        return ensemblgene;
    }

    
    /**
     * This setter method should be used only by unit tests.
     * @param repositorySNPChromosome
     */
    protected void setRepositoryEnsemblGene(RepositoryEnsemblGene repositoryensemblgene) {
    	
        this.repositoryensemblgene = repositoryensemblgene;
    }

}
