package com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome;

import java.util.Collection;
import java.util.List;

import com.roslin.mwicks.spring.variation.dto.offline.DTOSNPChromosome;
import com.roslin.mwicks.spring.variation.dto.web.DTODownload;
import com.roslin.mwicks.spring.variation.dto.web.DTOSearch;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeNotFound;

import com.roslin.mwicks.spring.variation.model.other.PageSNPChromosome;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome27;

/**
 * Declares methods used to obtain and modify SNPChromosome27 information.
 * @author Mike Wicks
 */
public interface ServiceSNPChromosome27 {
	
    /**
     * Finds SNPChromosome27 by SNPId.
     * @param SnpId    The SNPId of the wanted SNPChromosome27.
     * @return  The found SNPChromosome27. If no SNPChromosome27 is found, this method returns null.
     */
    public List<SNPChromosome27> findBySnpId(String SnpId);


    /**
     * Saves a List of SNPChromosome1
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
	public <T extends SNPChromosome27> Collection<T> bulkSave(int intBatchSize, Collection<T> entities);
	
    /**
     * Creates a new snpchromosome.
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
    public SNPChromosome27 create(DTOSNPChromosome created);

    /**
     * Deletes a snpchromosome.
     * @param snpchromosomeId  The id of the deleted snpchromosome.
     * @return  The deleted snpchromosome.
     * @throws SNPChromosome27NotFoundException  if no snpchromosome is found with the given id.
     */
    public SNPChromosome27 delete(Long snpchromosomeId) throws ExceptionSNPChromosomeNotFound;


    /**
     * Updates the information of a snpchromosome.
     * @param updated   The information of the updated snpchromosome.
     * @return  The updated snpchromosome.
     * @throws SNPChromosome27NotFoundException  if no snpchromosome is found with given id.
     */
    public SNPChromosome27 update(SNPChromosome27 updated) throws ExceptionSNPChromosomeNotFound;

    /**
     * Searches SNPChromosome27s by using the search criteria given as a parameter.
     * @param searchCriteria
     * @param pageIndex
     * @return  A Page of SNPChromosome27s matching with the search criteria. 
     *          If no SNPChromosome27s is found, this method returns an empty list.
     */
    public PageSNPChromosome search(DTOSearch searchCriteria, Integer pageNumber) ;

    
    /**
     * Searches SNPChromosome27s by using the search criteria given as a parameter.
     * @param searchCriteria
     * @return  A list of SNPChromosome27s matching with the search criteria. 
     *          If no SNPChromosome27s is found, this method returns an empty list.
     */
    public List<SNPChromosome> download(DTODownload dtoDownload);

    
    /**
     * Finds ensemblgene by id.
     * @param oid    The oid of the wanted ensemblgene.
     * @return  The found ensemblgene. If no ensemblgene is found, this method returns null.
     */
    public SNPChromosome27 findByOid(Long oid);


    /**
     * Finds all snpchromosome.
     * @return  A list of snpchromosome.
     */
	public PageSNPChromosome findAll(Integer pageNumber);
}
