package com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Sort;

import com.roslin.mwicks.spring.variation.dto.offline.DTOSNPChromosome;

import com.roslin.mwicks.spring.variation.dto.web.objects.DTODownload;
import com.roslin.mwicks.spring.variation.dto.web.objects.DTOSearch;

import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeNotFound;

import com.roslin.mwicks.spring.variation.model.other.PageSNPChromosome;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;

/**
 * Declares methods used to obtain and modify SNPChromosome information.
 * @author Mike Wicks
 */
public interface ServiceSNPChromosome {
	
    /**
     * Searches SNPChromosomes by using the search criteria given as a parameter.
     * @param searchCriteria
     * @param pageIndex
     * @return  A Page of SNPChromosomes matching with the search criteria. 
     *          If no SNPChromosomes is found, this method returns an empty list.
     */
    public PageSNPChromosome search(DTOSearch searchCriteria, int pageNumber, String sortField, String sortDirection);

    
    /**
     * Searches SNPChromosomes by using the search criteria given as a parameter.
     * @param searchCriteria
     * @return  A list of SNPChromosomes matching with the search criteria. 
     *          If no SNPChromosomes is found, this method returns an empty list.
     */
    public List<SNPChromosome> download(DTODownload dtoDownload);

    
    /**
     * Finds ensemblgene by id.
     * @param oid    The oid of the wanted ensemblgene.
     * @return  The found ensemblgene. If no ensemblgene is found, this method returns null.
     */
    public SNPChromosome findByOid(Long oid);


    /**
     * Finds SNPChromosome by SNPId.
     * @param SnpId    The SNPId of the wanted SNPChromosome.
     * @return  The found SNPChromosome. If no SNPChromosome is found, this method returns null.
     */
    public List<SNPChromosome> findBySnpId(String SnpId);


    /**
     * Finds all snpchromosome.
     * @return  A list of snpchromosome.
	public PageSNPChromosome findAll(Integer pageNumber);
     */
}
