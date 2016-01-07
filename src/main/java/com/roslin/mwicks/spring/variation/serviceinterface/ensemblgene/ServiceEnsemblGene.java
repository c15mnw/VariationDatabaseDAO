package com.roslin.mwicks.spring.variation.serviceinterface.ensemblgene;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.roslin.mwicks.spring.variation.dto.offline.DTOEnsemblGene;
import com.roslin.mwicks.spring.variation.exception.ExceptionEnsemblGeneNotFound;

import com.roslin.mwicks.spring.variation.model.ensemblgene.EnsemblGene;

/**
 * Declares methods used to obtain and modify SNPChromosome information.
 * @author Mike Wicks
 */
public interface ServiceEnsemblGene {

	
    /**
     * Saves a List of EnsemblGene
     * @param created   The information of the created ensemblgene.
     * @return  The created ensemblgene.
     */
	public <T extends EnsemblGene> Collection<T> bulkSave(int intBatchSize, Collection<T> entities);
	
	
    /**
     * Creates a new ensemblgene.
     * @param created   The information of the created ensemblgene.
     * @return  The created ensemblgene.
     */
    public EnsemblGene create(DTOEnsemblGene created);

    
    /**
     * Deletes a ensemblgene.
     * @param ensemblgeneId  The id of the deleted ensemblgene.
     * @return  The deleted ensemblgene.
     * @throws SNPChromosomeNotFoundException  if no ensemblgene is found with the given id.
     */
    public EnsemblGene delete(Long ensemblgeneId) throws ExceptionEnsemblGeneNotFound;


    /**
     * Updates the information of a ensemblgene.
     * @param updated   The information of the updated ensemblgene.
     * @return  The updated ensemblgene.
     */
    public EnsemblGene update(DTOEnsemblGene updated) throws ExceptionEnsemblGeneNotFound;

    
    /**
     * Finds ensemblgene by id.
     * @param oid    The oid of the wanted ensemblgene.
     * @return  The found ensemblgene. If no ensemblgene is found, this method returns null.
     */
    public EnsemblGene findByOid(Long oid);


    /**
     * Finds all ensemblgenes.
     * @return  A list of ensemblgenes.
     */
    public List<EnsemblGene> findAll();

    
    /**
     * Finds all ensemblgene.
     * @return  A list of ensemblgene.
     */
	public List<EnsemblGene> findByGeneName(String strGeneName);

	
	/**
     * Finds all ensemblgene.
     * @return  A list of ensemblgene.
     */
	public Page<EnsemblGene> findByEnsemblIdLike(String strGeneName, Pageable pageable);
}
