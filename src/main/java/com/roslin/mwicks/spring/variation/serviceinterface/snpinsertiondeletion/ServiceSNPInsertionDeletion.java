package com.roslin.mwicks.spring.variation.serviceinterface.snpinsertiondeletion;

import java.util.Collection;
import java.util.List;

import com.roslin.mwicks.spring.variation.dto.web.objects.snpinsertiondeletion.DTODownloadSNPInsertionDeletion;
import com.roslin.mwicks.spring.variation.dto.web.objects.snpinsertiondeletion.DTOSearchSNPInsertionDeletion;

import com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion.ExceptionSNPInsertionDeletionNotFound;

import com.roslin.mwicks.spring.variation.model.snpinsertiondeletion.SNPInsertionDeletion;

import com.roslin.mwicks.spring.variation.model.other.PageSNPInsertionDeletion;


/**
 * Declares methods used to obtain and modify SNPInsertionDeletion information.
 * @author Mike Wicks
 */
public interface ServiceSNPInsertionDeletion {
	
    /**
     * Saves a List of SNPInsertionDeletion01
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
	public <T extends SNPInsertionDeletion> Collection<T> bulkSave(int intBatchSize, Collection<T> entities);

	
	/**
     * Searches SNPInsertionDeletions by using the search criteria given as a parameter.
     * @param searchCriteria
     * @param pageIndex
     * @return  A Page of SNPInsertionDeletions matching with the search criteria. 
     *          If no SNPInsertionDeletions is found, this method returns an empty list.
     */
    public PageSNPInsertionDeletion search(DTOSearchSNPInsertionDeletion searchCriteria, int pageNumber, String sortField, String sortDirection);

    
    /**
     * Searches SNPInsertionDeletions by using the search criteria given as a parameter.
     * @param searchCriteria
     * @return  A list of SNPInsertionDeletions matching with the search criteria. 
     *          If no SNPInsertionDeletions is found, this method returns an empty list.
     */
    public List<SNPInsertionDeletion> download(DTODownloadSNPInsertionDeletion dtoDownload);

    
    /**
     * Finds ensemblgene by id.
     * @param oid    The oid of the wanted ensemblgene.
     * @return  The found ensemblgene. If no ensemblgene is found, this method returns null.
     */
    public SNPInsertionDeletion findByOid(Long oid);


    /**
     * Finds SNPInsertionDeletion by SNPId.
     * @param SnpId    The SNPId of the wanted SNPInsertionDeletion.
     * @return  The found SNPInsertionDeletion. If no SNPInsertionDeletion is found, this method returns null.
     */
    public List<SNPInsertionDeletion> findByInsertionDeletionId(String SnpId);


    /**
     * Updates the information of a snpchromosome.
     * @param updated   The information of the updated snpchromosome.
     * @return  The updated snpchromosome.
     * @throws SNPInsertionDeletionZNotFoundException  if no snpchromosome is found with given id.
     */
    public SNPInsertionDeletion update(SNPInsertionDeletion updated) throws ExceptionSNPInsertionDeletionNotFound;

    /**
     * Finds all snpchromosome.
     * @return  A list of snpchromosome.
	public PageSNPInsertionDeletion findAll(Integer pageNumber);
     */
}
