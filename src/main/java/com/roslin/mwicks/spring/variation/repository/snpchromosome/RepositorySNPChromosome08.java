package com.roslin.mwicks.spring.variation.repository.snpchromosome;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome08;

import java.util.List;

/**
 * Specifies methods used to obtain and modify SNPChromosome08 related information
 * which is stored in the database.
 * @author Mike Wicks
 */
public interface RepositorySNPChromosome08 extends JpaRepository<SNPChromosome08, Long> {

    /**
     * Finds SNPChromosome08 by using the snpId as a search criteria.
     * @param snpId
     * @return  A list of SNPChromosome08 whose last snpId is an exact match with the given snpId.
     *          If no SNPChromosome08 is found, this method returns null.
     */
    public List<SNPChromosome08> findBySnpId(String snpId);

    /**
     * Finds SNPChromosome08s by using the strLowRange and strHighRange as a coordinate range for search criteria.
     * @param strLowRange - Low SNP Coordinate
     * @param strHighRange - High SNP Coordinate
     * @return  A list of SNPChromosome08s between a supplied coordinate range
     *          If no SNPChromosome08s is found, this method returns an empty list.
     */
	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainPAllele )" )
	public Page<SNPChromosome08> findByRangeANDStrain7NEStrainP(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainWAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrain7NEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainNAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrain7NEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain15IAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrain7NEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainZeroAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrain7NEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain6Allele )" )
    public Page<SNPChromosome08> findByRangeANDStrain7NEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainCAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrain7NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainWAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrainPNEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainNAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrainPNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain15IAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrainPNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainZeroAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrainPNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain6Allele )" )
    public Page<SNPChromosome08> findByRangeANDStrainPNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainCAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrainPNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainNAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrainWNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain15IAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrainWNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainZeroAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrainWNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain6Allele )" )
    public Page<SNPChromosome08> findByRangeANDStrainWNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainCAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrainWNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain15IAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrainNNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainZeroAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrainNNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain6Allele )" )
    public Page<SNPChromosome08> findByRangeANDStrainNNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainCAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrainNNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainZeroAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrain15INEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strain6Allele )" )
    public Page<SNPChromosome08> findByRangeANDStrain15INEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainCAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrain15INEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZeroAllele = p.strain6Allele )" )
    public Page<SNPChromosome08> findByRangeANDstrainZeroNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZeroAllele = p.strainCAllele )" )
    public Page<SNPChromosome08> findByRangeANDstrainZeroNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);
	
	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain6Allele = p.strainCAllele )" )
    public Page<SNPChromosome08> findByRangeANDStrain6NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	
    /**
     * Lists SNPChromosome08s by using the strLowRange and strHighRange as a coordinate range for search criteria.
     * @param strLowRange - Low SNP Coordinate
     * @param strHighRange - High SNP Coordinate
     * @return  A list of SNPChromosome08s between a supplied coordinate range
     *          If no SNPChromosome08s is found, this method returns an empty list.
     */
	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainPAllele )" )
	public List<SNPChromosome08> listByRangeANDStrain7NEStrainP(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainWAllele )" )
    public List<SNPChromosome08> listByRangeANDStrain7NEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainNAllele )" )
    public List<SNPChromosome08> listByRangeANDStrain7NEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain15IAllele )" )
    public List<SNPChromosome08> listByRangeANDStrain7NEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainZeroAllele )" )
    public List<SNPChromosome08> listByRangeANDStrain7NEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain6Allele )" )
    public List<SNPChromosome08> listByRangeANDStrain7NEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainCAllele )" )
    public List<SNPChromosome08> listByRangeANDStrain7NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainWAllele )" )
    public List<SNPChromosome08> listByRangeANDStrainPNEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainNAllele )" )
    public List<SNPChromosome08> listByRangeANDStrainPNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain15IAllele )" )
    public List<SNPChromosome08> listByRangeANDStrainPNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainZeroAllele )" )
    public List<SNPChromosome08> listByRangeANDStrainPNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain6Allele )" )
    public List<SNPChromosome08> listByRangeANDStrainPNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainCAllele )" )
    public List<SNPChromosome08> listByRangeANDStrainPNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainNAllele )" )
    public List<SNPChromosome08> listByRangeANDStrainWNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain15IAllele )" )
    public List<SNPChromosome08> listByRangeANDStrainWNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainZeroAllele )" )
    public List<SNPChromosome08> listByRangeANDStrainWNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain6Allele )" )
    public List<SNPChromosome08> listByRangeANDStrainWNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainCAllele )" )
    public List<SNPChromosome08> listByRangeANDStrainWNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain15IAllele )" )
    public List<SNPChromosome08> listByRangeANDStrainNNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainZeroAllele )" )
    public List<SNPChromosome08> listByRangeANDStrainNNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain6Allele )" )
    public List<SNPChromosome08> listByRangeANDStrainNNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainCAllele )" )
    public List<SNPChromosome08> listByRangeANDStrainNNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainZeroAllele )" )
    public List<SNPChromosome08> listByRangeANDStrain15INEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strain6Allele )" )
    public List<SNPChromosome08> listByRangeANDStrain15INEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainCAllele )" )
    public List<SNPChromosome08> listByRangeANDStrain15INEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZeroAllele = p.strain6Allele )" )
    public List<SNPChromosome08> listByRangeANDstrainZeroNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZeroAllele = p.strainCAllele )" )
    public List<SNPChromosome08> listByRangeANDstrainZeroNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);
	
	@Query("Select p from SNPChromosome08 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain6Allele = p.strainCAllele )" )
    public List<SNPChromosome08> listByRangeANDStrain6NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

}
