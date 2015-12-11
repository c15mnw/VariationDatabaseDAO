package com.roslin.mwicks.spring.variation.repository.ensemblgene;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import com.roslin.mwicks.spring.variation.model.ensemblgene.EnsemblGene;

import java.util.List;

/**
 * Specifies methods used to obtain and modify SNPChromosome related information
 * which is stored in the database.
 * @author Mike Wicks
 */
public interface RepositoryEnsemblGene extends JpaRepository<EnsemblGene, Long> {

    /**
     * Finds EnsemblGene by using the strGeneName for search criteria.
     * @param strLowRange - Low SNP Coordinate
     * @return  A list of SNPChromosomes between a supplied coordinate range
     *          If no SNPChromosomes is found, this method returns an empty list.
     */
	@Query("Select p from EnsemblGene p where p.ensemblId like :strGeneName" )
	public List<EnsemblGene> findByGeneName(@Param("strGeneName") String strGeneName);


    /**
     * Finds EnsemblGene by using the strGeneName for search criteria.
     * @param strLowRange - Low SNP Coordinate
     * @return  A list of SNPChromosomes between a supplied coordinate range
     *          If no SNPChromosomes is found, this method returns an empty list.
     */
	@Query("Select p from EnsemblGene p where p.ensemblId like '%' || lower(:ensemblId)" )
	public Page<EnsemblGene> findByEnsemblIdLike(@Param("ensemblId") String ensemblId, @Param("pageable") Pageable pageable);
	
}
