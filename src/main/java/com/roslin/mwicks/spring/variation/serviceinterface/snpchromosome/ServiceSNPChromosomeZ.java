package com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome;

import java.util.Collection;
import java.util.List;

import com.roslin.mwicks.spring.variation.dto.DTOSearch;
import com.roslin.mwicks.spring.variation.dto.DTODownload;
import com.roslin.mwicks.spring.variation.dto.DTOSNPChromosome;

import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeNotFound;
import com.roslin.mwicks.spring.variation.model.other.PageSNPChromosome;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosomeZ;

/**
 * Declares methods used to obtain and modify SNPChromosomeZ information.
 * @author Mike Wicks
 */
public interface ServiceSNPChromosomeZ {
	
    /**
     * Finds SNPChromosomeZ by SNPId.
     * @param SnpId    The SNPId of the wanted SNPChromosomeZ.
     * @return  The found SNPChromosomeZ. If no SNPChromosomeZ is found, this method returns null.
     */
    public List<SNPChromosomeZ> findBySnpId(String SnpId);


    /**
     * Saves a List of SNPChromosome1
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
	public <T extends SNPChromosomeZ> Collection<T> bulkSave(int intBatchSize, Collection<T> entities);
	
    /**
     * Creates a new snpchromosome.
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
    public SNPChromosomeZ create(DTOSNPChromosome created);

    /**
     * Deletes a snpchromosome.
     * @param snpchromosomeId  The id of the deleted snpchromosome.
     * @return  The deleted snpchromosome.
     * @throws SNPChromosomeZNotFoundException  if no snpchromosome is found with the given id.
     */
    public SNPChromosomeZ delete(Long snpchromosomeId) throws ExceptionSNPChromosomeNotFound;


    /**
     * Updates the information of a snpchromosome.
     * @param updated   The information of the updated snpchromosome.
     * @return  The updated snpchromosome.
     * @throws SNPChromosomeZNotFoundException  if no snpchromosome is found with given id.
     */
    public SNPChromosomeZ update(SNPChromosomeZ updated) throws ExceptionSNPChromosomeNotFound;

    /**
     * Searches SNPChromosomeZs by using the search criteria given as a parameter.
     * @param searchCriteria
     * @param pageIndex
     * @return  A Page of SNPChromosomeZs matching with the search criteria. 
     *          If no SNPChromosomeZs is found, this method returns an empty list.
     */
    public PageSNPChromosome search(DTOSearch searchCriteria, Integer pageNumber) ;

    
    /**
     * Searches SNPChromosomeZs by using the search criteria given as a parameter.
     * @param searchCriteria
     * @return  A list of SNPChromosomeZs matching with the search criteria. 
     *          If no SNPChromosomeZs is found, this method returns an empty list.
     */
    public List<SNPChromosome> download(DTODownload dtoDownload);

    
    /**
     * Finds ensemblgene by id.
     * @param oid    The oid of the wanted ensemblgene.
     * @return  The found ensemblgene. If no ensemblgene is found, this method returns null.
     */
    public SNPChromosomeZ findByOid(Long oid);


    /**
     * Finds all snpchromosome.
     * @return  A list of snpchromosome.
     */
	public PageSNPChromosome findAll(Integer pageNumber);
}
