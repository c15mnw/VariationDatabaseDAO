package com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome;

import java.util.Collection;
import java.util.List;

import com.roslin.mwicks.spring.variation.dto.offline.DTOSNPChromosome;
import com.roslin.mwicks.spring.variation.dto.web.DTODownload;
import com.roslin.mwicks.spring.variation.dto.web.DTOSearch;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeNotFound;

import com.roslin.mwicks.spring.variation.model.other.PageSNPChromosome;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome05;

/**
 * Declares methods used to obtain and modify SNPChromosome05 information.
 * @author Mike Wicks
 */
public interface ServiceSNPChromosome05 {
	
    /**
     * Finds SNPChromosome05 by SNPId.
     * @param SnpId    The SNPId of the wanted SNPChromosome05.
     * @return  The found SNPChromosome05. If no SNPChromosome05 is found, this method returns null.
     */
    public List<SNPChromosome05> findBySnpId(String SnpId);


    /**
     * Saves a List of SNPChromosome1
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
	public <T extends SNPChromosome05> Collection<T> bulkSave(int intBatchSize, Collection<T> entities);
	
    /**
     * Creates a new snpchromosome.
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
    public SNPChromosome05 create(DTOSNPChromosome created);

    /**
     * Deletes a snpchromosome.
     * @param snpchromosomeId  The id of the deleted snpchromosome.
     * @return  The deleted snpchromosome.
     * @throws SNPChromosome05NotFoundException  if no snpchromosome is found with the given id.
     */
    public SNPChromosome05 delete(Long snpchromosomeId) throws ExceptionSNPChromosomeNotFound;


    /**
     * Updates the information of a snpchromosome.
     * @param updated   The information of the updated snpchromosome.
     * @return  The updated snpchromosome.
     * @throws SNPChromosome05NotFoundException  if no snpchromosome is found with given id.
     */
    public SNPChromosome05 update(SNPChromosome05 updated) throws ExceptionSNPChromosomeNotFound;

    /**
     * Searches SNPChromosome05s by using the search criteria given as a parameter.
     * @param searchCriteria
     * @param pageIndex
     * @return  A Page of SNPChromosome05s matching with the search criteria. 
     *          If no SNPChromosome05s is found, this method returns an empty list.
     */
    public PageSNPChromosome search(DTOSearch searchCriteria, Integer pageNumber) ;

    
    /**
     * Searches SNPChromosome05s by using the search criteria given as a parameter.
     * @param searchCriteria
     * @return  A list of SNPChromosome05s matching with the search criteria. 
     *          If no SNPChromosome05s is found, this method returns an empty list.
     */
    public List<SNPChromosome> download(DTODownload dtoDownload);

    
    /**
     * Finds ensemblgene by id.
     * @param oid    The oid of the wanted ensemblgene.
     * @return  The found ensemblgene. If no ensemblgene is found, this method returns null.
     */
    public SNPChromosome05 findByOid(Long oid);


    /**
     * Finds all snpchromosome.
     * @return  A list of snpchromosome.
     */
	public PageSNPChromosome findAll(Integer pageNumber);
}
