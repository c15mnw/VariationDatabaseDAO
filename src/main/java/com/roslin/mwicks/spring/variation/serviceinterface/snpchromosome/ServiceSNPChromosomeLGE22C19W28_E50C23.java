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
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosomeLGE22C19W28_E50C23;

/**
 * Declares methods used to obtain and modify SNPChromosomeLGE22C19W28_E50C23 information.
 * @author Mike Wicks
 */
public interface ServiceSNPChromosomeLGE22C19W28_E50C23 {
	
    /**
     * Finds SNPChromosomeLGE22C19W28_E50C23 by SNPId.
     * @param SnpId    The SNPId of the wanted SNPChromosomeLGE22C19W28_E50C23.
     * @return  The found SNPChromosomeLGE22C19W28_E50C23. If no SNPChromosomeLGE22C19W28_E50C23 is found, this method returns null.
     */
    public List<SNPChromosomeLGE22C19W28_E50C23> findBySnpId(String SnpId);


    /**
     * Saves a List of SNPChromosome1
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
	public <T extends SNPChromosomeLGE22C19W28_E50C23> Collection<T> bulkSave(int intBatchSize, Collection<T> entities);
	
    /**
     * Creates a new snpchromosome.
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
    public SNPChromosomeLGE22C19W28_E50C23 create(DTOSNPChromosome created);

    /**
     * Deletes a snpchromosome.
     * @param snpchromosomeId  The id of the deleted snpchromosome.
     * @return  The deleted snpchromosome.
     * @throws SNPChromosomeLGE22C19W28_E50C23NotFoundException  if no snpchromosome is found with the given id.
     */
    public SNPChromosomeLGE22C19W28_E50C23 delete(Long snpchromosomeId) throws ExceptionSNPChromosomeNotFound;


    /**
     * Updates the information of a snpchromosome.
     * @param updated   The information of the updated snpchromosome.
     * @return  The updated snpchromosome.
     * @throws SNPChromosomeLGE22C19W28_E50C23NotFoundException  if no snpchromosome is found with given id.
     */
    public SNPChromosomeLGE22C19W28_E50C23 update(SNPChromosomeLGE22C19W28_E50C23 updated) throws ExceptionSNPChromosomeNotFound;

    /**
     * Searches SNPChromosomeLGE22C19W28_E50C23s by using the search criteria given as a parameter.
     * @param searchCriteria
     * @param pageIndex
     * @return  A Page of SNPChromosomeLGE22C19W28_E50C23s matching with the search criteria. 
     *          If no SNPChromosomeLGE22C19W28_E50C23s is found, this method returns an empty list.
     */
    public PageSNPChromosome search(DTOSearch searchCriteria, Integer pageNumber, String sortField, Sort.Direction sortDirection);

    
    /**
     * Searches SNPChromosomeLGE22C19W28_E50C23s by using the search criteria given as a parameter.
     * @param searchCriteria
     * @return  A list of SNPChromosomeLGE22C19W28_E50C23s matching with the search criteria. 
     *          If no SNPChromosomeLGE22C19W28_E50C23s is found, this method returns an empty list.
     */
    public List<SNPChromosome> download(DTODownload dtoDownload);

    
    /**
     * Finds ensemblgene by id.
     * @param oid    The oid of the wanted ensemblgene.
     * @return  The found ensemblgene. If no ensemblgene is found, this method returns null.
     */
    public SNPChromosomeLGE22C19W28_E50C23 findByOid(Long oid);


    /**
     * Finds all snpchromosome.
     * @return  A list of snpchromosome.
     */
	public PageSNPChromosome findAll(Integer pageNumber);
}
