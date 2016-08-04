package com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome;

import java.util.Collection;
import java.util.List;

import com.roslin.mwicks.spring.variation.dto.web.objects.snpchromosome.DTODownloadSNPChromosome;
import com.roslin.mwicks.spring.variation.dto.web.objects.snpchromosome.DTOSearchSNPChromosome;

import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeNotFound;

import com.roslin.mwicks.spring.variation.model.other.PageSNPChromosome;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;


/**
 * Declares methods used to obtain and modify SNPChromosome information.
 * @author Mike Wicks
 */
public interface ServiceSNPChromosome {
	
    /**
     * Saves a List of SNPChromosome01
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
	public <T extends SNPChromosome> Collection<T> bulkSave(int intBatchSize, Collection<T> entities);

	
	/**
     * Searches SNPChromosomes by using the search criteria given as a parameter.
     * @param searchCriteria
     * @param pageIndex
     * @return  A Page of SNPChromosomes matching with the search criteria. 
     *          If no SNPChromosomes is found, this method returns an empty list.
     */
    public PageSNPChromosome search(DTOSearchSNPChromosome searchCriteria, int pageNumber, String sortField, String sortDirection);

    
    /**
     * Searches SNPChromosomes by using the search criteria given as a parameter.
     * @param searchCriteria
     * @return  A list of SNPChromosomes matching with the search criteria. 
     *          If no SNPChromosomes is found, this method returns an empty list.
     */
    public List<SNPChromosome> download(DTODownloadSNPChromosome dtoDownload);

    
    /**
     * Finds ensemblgene by id.
     * @param oid    The oid of the wanted ensemblgene.
     * @return  The found ensemblgene. If no ensemblgene is found, this method returns null.
     */
    public SNPChromosome findByOid(Long oid);


    /**
     * Finds ensemblgene by id.
     * @param oid    The oid of the wanted ensemblgene.
     * @return  The found ensemblgene. If no ensemblgene is found, this method returns null.
     */
    public SNPChromosome findByOidAndPartitionId(long oid, long partitionId);


    /**
     * Finds SNPChromosome by SNPId.
     * @param SnpId    The SNPId of the wanted SNPChromosome.
     * @return  The found SNPChromosome. If no SNPChromosome is found, this method returns null.
     */
    public List<SNPChromosome> findBySnpId(String SnpId);


    /**
     * Updates the information of a snpchromosome.
     * @param updated   The information of the updated snpchromosome.
     * @return  The updated snpchromosome.
     * @throws SNPChromosomeZNotFoundException  if no snpchromosome is found with given id.
     */
    public SNPChromosome update(SNPChromosome updated) throws ExceptionSNPChromosomeNotFound;

    /**
     * Finds all snpchromosome.
     * @return  A list of snpchromosome.
	public PageSNPChromosome findAll(Integer pageNumber);
     */
}
