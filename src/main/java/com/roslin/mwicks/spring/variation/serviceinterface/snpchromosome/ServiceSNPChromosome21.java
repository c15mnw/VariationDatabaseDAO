package com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome;

import java.util.Collection;
import java.util.List;

import com.roslin.mwicks.spring.variation.dto.offline.DTOSNPChromosome;
import com.roslin.mwicks.spring.variation.dto.web.DTODownload;
import com.roslin.mwicks.spring.variation.dto.web.DTOSearch;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeNotFound;

import com.roslin.mwicks.spring.variation.model.other.PageSNPChromosome;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome21;

/**
 * Declares methods used to obtain and modify SNPChromosome21 information.
 * @author Mike Wicks
 */
public interface ServiceSNPChromosome21 {
	
    /**
     * Finds SNPChromosome21 by SNPId.
     * @param SnpId    The SNPId of the wanted SNPChromosome21.
     * @return  The found SNPChromosome21. If no SNPChromosome21 is found, this method returns null.
     */
    public List<SNPChromosome21> findBySnpId(String SnpId);


    /**
     * Saves a List of SNPChromosome1
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
	public <T extends SNPChromosome21> Collection<T> bulkSave(int intBatchSize, Collection<T> entities);
	
    /**
     * Creates a new snpchromosome.
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
    public SNPChromosome21 create(DTOSNPChromosome created);

    /**
     * Deletes a snpchromosome.
     * @param snpchromosomeId  The id of the deleted snpchromosome.
     * @return  The deleted snpchromosome.
     * @throws SNPChromosome21NotFoundException  if no snpchromosome is found with the given id.
     */
    public SNPChromosome21 delete(Long snpchromosomeId) throws ExceptionSNPChromosomeNotFound;


    /**
     * Updates the information of a snpchromosome.
     * @param updated   The information of the updated snpchromosome.
     * @return  The updated snpchromosome.
     * @throws SNPChromosome21NotFoundException  if no snpchromosome is found with given id.
     */
    public SNPChromosome21 update(SNPChromosome21 updated) throws ExceptionSNPChromosomeNotFound;

    /**
     * Searches SNPChromosome21s by using the search criteria given as a parameter.
     * @param searchCriteria
     * @param pageIndex
     * @return  A Page of SNPChromosome21s matching with the search criteria. 
     *          If no SNPChromosome21s is found, this method returns an empty list.
     */
    public PageSNPChromosome search(DTOSearch searchCriteria, Integer pageNumber) ;

    
    /**
     * Searches SNPChromosome21s by using the search criteria given as a parameter.
     * @param searchCriteria
     * @return  A list of SNPChromosome21s matching with the search criteria. 
     *          If no SNPChromosome21s is found, this method returns an empty list.
     */
    public List<SNPChromosome> download(DTODownload dtoDownload);

    
    /**
     * Finds ensemblgene by id.
     * @param oid    The oid of the wanted ensemblgene.
     * @return  The found ensemblgene. If no ensemblgene is found, this method returns null.
     */
    public SNPChromosome21 findByOid(Long oid);


    /**
     * Finds all snpchromosome.
     * @return  A list of snpchromosome.
     */
	public PageSNPChromosome findAll(Integer pageNumber);
}
