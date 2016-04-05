package com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Sort;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchSortField;

import com.roslin.mwicks.spring.variation.dto.offline.DTOSNPChromosome;
import com.roslin.mwicks.spring.variation.dto.web.objects.DTODownload;
import com.roslin.mwicks.spring.variation.dto.web.objects.DTOSearch;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeNotFound;

import com.roslin.mwicks.spring.variation.model.other.PageSNPChromosome;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome25;

/**
 * Declares methods used to obtain and modify SNPChromosome25 information.
 * @author Mike Wicks
 */
public interface ServiceSNPChromosome25 {
	
    /**
     * Finds SNPChromosome25 by SNPId.
     * @param SnpId    The SNPId of the wanted SNPChromosome25.
     * @return  The found SNPChromosome25. If no SNPChromosome25 is found, this method returns null.
     */
    public List<SNPChromosome25> findBySnpId(String SnpId);


    /**
     * Saves a List of SNPChromosome1
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
	public <T extends SNPChromosome25> Collection<T> bulkSave(int intBatchSize, Collection<T> entities);
	
    /**
     * Creates a new snpchromosome.
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
    public SNPChromosome25 create(DTOSNPChromosome created);

    /**
     * Deletes a snpchromosome.
     * @param snpchromosomeId  The id of the deleted snpchromosome.
     * @return  The deleted snpchromosome.
     * @throws SNPChromosome25NotFoundException  if no snpchromosome is found with the given id.
     */
    public SNPChromosome25 delete(Long snpchromosomeId) throws ExceptionSNPChromosomeNotFound;


    /**
     * Updates the information of a snpchromosome.
     * @param updated   The information of the updated snpchromosome.
     * @return  The updated snpchromosome.
     * @throws SNPChromosome25NotFoundException  if no snpchromosome is found with given id.
     */
    public SNPChromosome25 update(SNPChromosome25 updated) throws ExceptionSNPChromosomeNotFound;

    /**
     * Searches SNPChromosome25s by using the search criteria given as a parameter.
     * @param searchCriteria
     * @param pageIndex
     * @return  A Page of SNPChromosome25s matching with the search criteria. 
     *          If no SNPChromosome25s is found, this method returns an empty list.
     */
    public PageSNPChromosome search(DTOSearch searchCriteria, Integer pageNumber, String sortField, Sort.Direction sortDirection);

    
    /**
     * Searches SNPChromosome25s by using the search criteria given as a parameter.
     * @param searchCriteria
     * @return  A list of SNPChromosome25s matching with the search criteria. 
     *          If no SNPChromosome25s is found, this method returns an empty list.
     */
    public List<SNPChromosome> download(DTODownload dtoDownload);

    
    /**
     * Finds ensemblgene by id.
     * @param oid    The oid of the wanted ensemblgene.
     * @return  The found ensemblgene. If no ensemblgene is found, this method returns null.
     */
    public SNPChromosome25 findByOid(Long oid);


    /**
     * Finds all snpchromosome.
     * @return  A list of snpchromosome.
     */
	public PageSNPChromosome findAll(Integer pageNumber);
}
