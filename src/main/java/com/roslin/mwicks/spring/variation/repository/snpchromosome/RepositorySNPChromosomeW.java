package com.roslin.mwicks.spring.variation.repository.snpchromosome;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosomeW;

import java.util.List;

/**
 * Specifies methods used to obtain and modify SNPChromosomeW related information
 * which is stored in the database.
 * @author Mike Wicks
 */
public interface RepositorySNPChromosomeW extends JpaRepository<SNPChromosomeW, Long> {

    /**
     * Finds SNPChromosomeW by using the snpId as a search criteria.
     * @param snpId
     * @return  A list of SNPChromosomeW whose last snpId is an exact match with the given snpId.
     *          If no SNPChromosomeW is found, this method returns null.
     */
    public List<SNPChromosomeW> findBySnpId(String snpId);

    /**
     * Finds SNPChromosomeWs by using the strLowRange and strHighRange as a coordinate range for search criteria.
     * @param strLowRange - Low SNP Coordinate
     * @param strHighRange - High SNP Coordinate
     * @return  A list of SNPChromosomeWs between a supplied coordinate range
     *          If no SNPChromosomeWs is found, this method returns an empty list.
     */
	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainPAllele )" )
	public Page<SNPChromosomeW> findByRangeANDStrain7NEStrainP(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainWAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrain7NEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainNAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrain7NEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain15IAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrain7NEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainZeroAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrain7NEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain6Allele )" )
    public Page<SNPChromosomeW> findByRangeANDStrain7NEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainCAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrain7NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainWAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrainPNEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainNAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrainPNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain15IAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrainPNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainZeroAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrainPNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain6Allele )" )
    public Page<SNPChromosomeW> findByRangeANDStrainPNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainCAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrainPNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainNAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrainWNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain15IAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrainWNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainZeroAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrainWNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain6Allele )" )
    public Page<SNPChromosomeW> findByRangeANDStrainWNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainCAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrainWNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain15IAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrainNNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainZeroAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrainNNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain6Allele )" )
    public Page<SNPChromosomeW> findByRangeANDStrainNNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainCAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrainNNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainZeroAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrain15INEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strain6Allele )" )
    public Page<SNPChromosomeW> findByRangeANDStrain15INEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainCAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrain15INEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZeroAllele = p.strain6Allele )" )
    public Page<SNPChromosomeW> findByRangeANDstrainZeroNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZeroAllele = p.strainCAllele )" )
    public Page<SNPChromosomeW> findByRangeANDstrainZeroNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);
	
	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain6Allele = p.strainCAllele )" )
    public Page<SNPChromosomeW> findByRangeANDStrain6NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	
    /**
     * Lists SNPChromosomeWs by using the strLowRange and strHighRange as a coordinate range for search criteria.
     * @param strLowRange - Low SNP Coordinate
     * @param strHighRange - High SNP Coordinate
     * @return  A list of SNPChromosomeWs between a supplied coordinate range
     *          If no SNPChromosomeWs is found, this method returns an empty list.
     */
	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainPAllele )" )
	public List<SNPChromosomeW> listByRangeANDStrain7NEStrainP(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainWAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrain7NEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainNAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrain7NEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain15IAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrain7NEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainZeroAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrain7NEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain6Allele )" )
    public List<SNPChromosomeW> listByRangeANDStrain7NEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainCAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrain7NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainWAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrainPNEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainNAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrainPNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain15IAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrainPNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainZeroAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrainPNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain6Allele )" )
    public List<SNPChromosomeW> listByRangeANDStrainPNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainCAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrainPNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainNAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrainWNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain15IAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrainWNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainZeroAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrainWNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain6Allele )" )
    public List<SNPChromosomeW> listByRangeANDStrainWNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainCAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrainWNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain15IAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrainNNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainZeroAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrainNNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain6Allele )" )
    public List<SNPChromosomeW> listByRangeANDStrainNNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainCAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrainNNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainZeroAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrain15INEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strain6Allele )" )
    public List<SNPChromosomeW> listByRangeANDStrain15INEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainCAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrain15INEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZeroAllele = p.strain6Allele )" )
    public List<SNPChromosomeW> listByRangeANDstrainZeroNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZeroAllele = p.strainCAllele )" )
    public List<SNPChromosomeW> listByRangeANDstrainZeroNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);
	
	@Query("Select p from SNPChromosomeW p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain6Allele = p.strainCAllele )" )
    public List<SNPChromosomeW> listByRangeANDStrain6NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

}
