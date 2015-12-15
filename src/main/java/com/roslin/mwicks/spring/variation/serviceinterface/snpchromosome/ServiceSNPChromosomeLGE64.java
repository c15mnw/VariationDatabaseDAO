package com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome;

import java.util.Collection;
import java.util.List;

import com.roslin.mwicks.spring.variation.dto.DTOSearch;
import com.roslin.mwicks.spring.variation.dto.DTODownload;
import com.roslin.mwicks.spring.variation.dto.DTOSNPChromosome;

import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeNotFound;

import com.roslin.mwicks.spring.variation.model.other.PageSNPChromosome;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosomeLGE64;

/**
 * Declares methods used to obtain and modify SNPChromosomeLGE64 information.
 * @author Mike Wicks
 */
public interface ServiceSNPChromosomeLGE64 {
	
    /**
     * Finds SNPChromosomeLGE64 by SNPId.
     * @param SnpId    The SNPId of the wanted SNPChromosomeLGE64.
     * @return  The found SNPChromosomeLGE64. If no SNPChromosomeLGE64 is found, this method returns null.
     */
    public List<SNPChromosomeLGE64> findBySnpId(String SnpId);


    /**
     * Saves a List of SNPChromosome1
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
	public <T extends SNPChromosomeLGE64> Collection<T> bulkSave(int intBatchSize, Collection<T> entities);
	
    /**
     * Creates a new snpchromosome.
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
    public SNPChromosomeLGE64 create(DTOSNPChromosome created);

    /**
     * Deletes a snpchromosome.
     * @param snpchromosomeId  The id of the deleted snpchromosome.
     * @return  The deleted snpchromosome.
     * @throws SNPChromosomeLGE64NotFoundException  if no snpchromosome is found with the given id.
     */
    public SNPChromosomeLGE64 delete(Long snpchromosomeId) throws ExceptionSNPChromosomeNotFound;


    /**
     * Updates the information of a snpchromosome.
     * @param updated   The information of the updated snpchromosome.
     * @return  The updated snpchromosome.
     * @throws SNPChromosomeLGE64NotFoundException  if no snpchromosome is found with given id.
     */
    public SNPChromosomeLGE64 update(SNPChromosomeLGE64 updated) throws ExceptionSNPChromosomeNotFound;

    /**
     * Searches SNPChromosomeLGE64s by using the search criteria given as a parameter.
     * @param searchCriteria
     * @param pageIndex
     * @return  A Page of SNPChromosomeLGE64s matching with the search criteria. 
     *          If no SNPChromosomeLGE64s is found, this method returns an empty list.
     */
    public PageSNPChromosome search(DTOSearch searchCriteria, Integer pageNumber) ;

    
    /**
     * Searches SNPChromosomeLGE64s by using the search criteria given as a parameter.
     * @param searchCriteria
     * @return  A list of SNPChromosomeLGE64s matching with the search criteria. 
     *          If no SNPChromosomeLGE64s is found, this method returns an empty list.
     */
    public List<SNPChromosome> download(DTODownload dtoDownload);

    
    /**
     * Finds ensemblgene by id.
     * @param oid    The oid of the wanted ensemblgene.
     * @return  The found ensemblgene. If no ensemblgene is found, this method returns null.
     */
    public SNPChromosomeLGE64 findByOid(Long oid);


    /**
     * Finds all snpchromosome.
     * @return  A list of snpchromosome.
     */
	public PageSNPChromosome findAll(Integer pageNumber);
}
