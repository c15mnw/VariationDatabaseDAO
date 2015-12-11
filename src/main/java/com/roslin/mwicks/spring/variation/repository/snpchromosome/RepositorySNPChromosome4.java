package com.roslin.mwicks.spring.variation.repository.snpchromosome;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome4;

import java.util.List;

/**
 * Specifies methods used to obtain and modify SNPChromosome4 related information
 * which is stored in the database.
 * @author Mike Wicks
 */
public interface RepositorySNPChromosome4 extends JpaRepository<SNPChromosome4, Long> {

    /**
     * Finds SNPChromosome4s by using the strLowRange and strHighRange as a coordinate range for search criteria.
     * @param strLowRange - Low SNP Coordinate
     * @param strHighRange - High SNP Coordinate
     * @return  A list of SNPChromosome4s between a supplied coordinate range
     *          If no SNPChromosome4s is found, this method returns an empty list.
     */
	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainPAllele )" )
	public Page<SNPChromosome4> findByRangeANDStrain7NEStrainP(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainWAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrain7NEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainNAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrain7NEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain15IAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrain7NEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainZeroAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrain7NEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain6Allele )" )
    public Page<SNPChromosome4> findByRangeANDStrain7NEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainCAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrain7NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainWAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrainPNEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainNAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrainPNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain15IAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrainPNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainZeroAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrainPNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain6Allele )" )
    public Page<SNPChromosome4> findByRangeANDStrainPNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainCAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrainPNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainNAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrainWNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain15IAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrainWNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainZeroAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrainWNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain6Allele )" )
    public Page<SNPChromosome4> findByRangeANDStrainWNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainCAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrainWNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain15IAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrainNNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainZeroAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrainNNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain6Allele )" )
    public Page<SNPChromosome4> findByRangeANDStrainNNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainCAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrainNNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainZeroAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrain15INEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strain6Allele )" )
    public Page<SNPChromosome4> findByRangeANDStrain15INEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainCAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrain15INEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZeroAllele = p.strain6Allele )" )
    public Page<SNPChromosome4> findByRangeANDstrainZeroNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZeroAllele = p.strainCAllele )" )
    public Page<SNPChromosome4> findByRangeANDstrainZeroNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);
	
	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain6Allele = p.strainCAllele )" )
    public Page<SNPChromosome4> findByRangeANDStrain6NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	
    /**
     * Lists SNPChromosome4s by using the strLowRange and strHighRange as a coordinate range for search criteria.
     * @param strLowRange - Low SNP Coordinate
     * @param strHighRange - High SNP Coordinate
     * @return  A list of SNPChromosome4s between a supplied coordinate range
     *          If no SNPChromosome4s is found, this method returns an empty list.
     */
	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainPAllele )" )
	public List<SNPChromosome4> listByRangeANDStrain7NEStrainP(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainWAllele )" )
    public List<SNPChromosome4> listByRangeANDStrain7NEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainNAllele )" )
    public List<SNPChromosome4> listByRangeANDStrain7NEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain15IAllele )" )
    public List<SNPChromosome4> listByRangeANDStrain7NEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainZeroAllele )" )
    public List<SNPChromosome4> listByRangeANDStrain7NEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain6Allele )" )
    public List<SNPChromosome4> listByRangeANDStrain7NEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainCAllele )" )
    public List<SNPChromosome4> listByRangeANDStrain7NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainWAllele )" )
    public List<SNPChromosome4> listByRangeANDStrainPNEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainNAllele )" )
    public List<SNPChromosome4> listByRangeANDStrainPNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain15IAllele )" )
    public List<SNPChromosome4> listByRangeANDStrainPNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainZeroAllele )" )
    public List<SNPChromosome4> listByRangeANDStrainPNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain6Allele )" )
    public List<SNPChromosome4> listByRangeANDStrainPNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainCAllele )" )
    public List<SNPChromosome4> listByRangeANDStrainPNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainNAllele )" )
    public List<SNPChromosome4> listByRangeANDStrainWNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain15IAllele )" )
    public List<SNPChromosome4> listByRangeANDStrainWNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainZeroAllele )" )
    public List<SNPChromosome4> listByRangeANDStrainWNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain6Allele )" )
    public List<SNPChromosome4> listByRangeANDStrainWNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainCAllele )" )
    public List<SNPChromosome4> listByRangeANDStrainWNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain15IAllele )" )
    public List<SNPChromosome4> listByRangeANDStrainNNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainZeroAllele )" )
    public List<SNPChromosome4> listByRangeANDStrainNNEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain6Allele )" )
    public List<SNPChromosome4> listByRangeANDStrainNNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainCAllele )" )
    public List<SNPChromosome4> listByRangeANDStrainNNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainZeroAllele )" )
    public List<SNPChromosome4> listByRangeANDStrain15INEstrainZero(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strain6Allele )" )
    public List<SNPChromosome4> listByRangeANDStrain15INEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainCAllele )" )
    public List<SNPChromosome4> listByRangeANDStrain15INEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZeroAllele = p.strain6Allele )" )
    public List<SNPChromosome4> listByRangeANDstrainZeroNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZeroAllele = p.strainCAllele )" )
    public List<SNPChromosome4> listByRangeANDstrainZeroNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);
	
	@Query("Select p from SNPChromosome4 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain6Allele = p.strainCAllele )" )
    public List<SNPChromosome4> listByRangeANDStrain6NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

}
