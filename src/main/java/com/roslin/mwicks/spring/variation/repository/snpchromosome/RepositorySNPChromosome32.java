package com.roslin.mwicks.spring.variation.repository.snpchromosome;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome32;

import java.util.List;

/**
 * Specifies methods used to obtain and modify SNPChromosome32 related information
 * which is stored in the database.
 * @author Mike Wicks
 */
public interface RepositorySNPChromosome32 extends JpaRepository<SNPChromosome32, Long> {

    /**
     * Finds SNPChromosome32s by using the strLowRange and strHighRange as a coordinate range for search criteria.
     * @param strLowRange - Low SNP Coordinate
     * @param strHighRange - High SNP Coordinate
     * @return  A list of SNPChromosome32s between a supplied coordinate range
     *          If no SNPChromosome32s is found, this method returns an empty list.
     */
	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainPAllele )" )
	public Page<SNPChromosome32> findByRangeANDStrain7NEStrainP(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainWAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrain7NEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainNAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrain7NEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain15IAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrain7NEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainZeroAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrain7NEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain6Allele )" )
    public Page<SNPChromosome32> findByRangeANDStrain7NEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainCAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrain7NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainWAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrainPNEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainNAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrainPNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain15IAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrainPNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainZeroAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrainPNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain6Allele )" )
    public Page<SNPChromosome32> findByRangeANDStrainPNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainCAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrainPNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainNAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrainWNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain15IAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrainWNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainZeroAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrainWNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain6Allele )" )
    public Page<SNPChromosome32> findByRangeANDStrainWNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainCAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrainWNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain15IAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrainNNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainZeroAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrainNNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain6Allele )" )
    public Page<SNPChromosome32> findByRangeANDStrainNNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainCAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrainNNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainZeroAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrain15INEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strain6Allele )" )
    public Page<SNPChromosome32> findByRangeANDStrain15INEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainCAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrain15INEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZeroAllele = p.strain6Allele )" )
    public Page<SNPChromosome32> findByRangeANDstrainZeroNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZeroAllele = p.strainCAllele )" )
    public Page<SNPChromosome32> findByRangeANDstrainZeroNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);
	
	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain6Allele = p.strainCAllele )" )
    public Page<SNPChromosome32> findByRangeANDStrain6NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	
    /**
     * Lists SNPChromosome32s by using the strLowRange and strHighRange as a coordinate range for search criteria.
     * @param strLowRange - Low SNP Coordinate
     * @param strHighRange - High SNP Coordinate
     * @return  A list of SNPChromosome32s between a supplied coordinate range
     *          If no SNPChromosome32s is found, this method returns an empty list.
     */
	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainPAllele )" )
	public List<SNPChromosome32> listByRangeANDStrain7NEStrainP(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainWAllele )" )
    public List<SNPChromosome32> listByRangeANDStrain7NEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainNAllele )" )
    public List<SNPChromosome32> listByRangeANDStrain7NEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain15IAllele )" )
    public List<SNPChromosome32> listByRangeANDStrain7NEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainZeroAllele )" )
    public List<SNPChromosome32> listByRangeANDStrain7NEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain6Allele )" )
    public List<SNPChromosome32> listByRangeANDStrain7NEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainCAllele )" )
    public List<SNPChromosome32> listByRangeANDStrain7NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainWAllele )" )
    public List<SNPChromosome32> listByRangeANDStrainPNEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainNAllele )" )
    public List<SNPChromosome32> listByRangeANDStrainPNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain15IAllele )" )
    public List<SNPChromosome32> listByRangeANDStrainPNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainZeroAllele )" )
    public List<SNPChromosome32> listByRangeANDStrainPNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain6Allele )" )
    public List<SNPChromosome32> listByRangeANDStrainPNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainCAllele )" )
    public List<SNPChromosome32> listByRangeANDStrainPNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainNAllele )" )
    public List<SNPChromosome32> listByRangeANDStrainWNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain15IAllele )" )
    public List<SNPChromosome32> listByRangeANDStrainWNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainZeroAllele )" )
    public List<SNPChromosome32> listByRangeANDStrainWNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain6Allele )" )
    public List<SNPChromosome32> listByRangeANDStrainWNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainCAllele )" )
    public List<SNPChromosome32> listByRangeANDStrainWNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain15IAllele )" )
    public List<SNPChromosome32> listByRangeANDStrainNNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainZeroAllele )" )
    public List<SNPChromosome32> listByRangeANDStrainNNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain6Allele )" )
    public List<SNPChromosome32> listByRangeANDStrainNNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainCAllele )" )
    public List<SNPChromosome32> listByRangeANDStrainNNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainZeroAllele )" )
    public List<SNPChromosome32> listByRangeANDStrain15INEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strain6Allele )" )
    public List<SNPChromosome32> listByRangeANDStrain15INEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainCAllele )" )
    public List<SNPChromosome32> listByRangeANDStrain15INEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZeroAllele = p.strain6Allele )" )
    public List<SNPChromosome32> listByRangeANDstrainZeroNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZeroAllele = p.strainCAllele )" )
    public List<SNPChromosome32> listByRangeANDstrainZeroNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);
	
	@Query("Select p from SNPChromosome32 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain6Allele = p.strainCAllele )" )
    public List<SNPChromosome32> listByRangeANDStrain6NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

}
