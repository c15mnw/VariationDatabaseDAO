package com.roslin.mwicks.spring.variation.repository.snpchromosome;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;

import java.util.List;

/**
 * Specifies methods used to obtain and modify SNPChromosome related information
 * which is stored in the database.
 * @author Mike Wicks
 */
public interface RepositorySNPChromosome extends JpaRepository<SNPChromosome, Long> {

	
    /**
     * Finds SNPChromosome by using the snpId as a search criteria.
     * @param snpId
     * @return  A list of SNPChromosome whose last snpId is an exact match with the given snpId.
     *          If no SNPChromosome is found, this method returns null.
     */
    public List<SNPChromosome> findBySnpId(String snpId);


    /**
     * Finds SNPChromosomes by using the strLowRange and strHighRange as a coordinate range for search criteria.
     * @param strLowRange - Low SNP Coordinate
     * @param strHighRange - High SNP Coordinate
     * @return  A list of SNPChromosomes between a supplied coordinate range
     *          If no SNPChromosomes is found, this method returns an empty list.
     */
	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainPAllele )" )
	public List<SNPChromosome> findByRangeANDStrain7NEStrainP(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainWAllele )" )
    public List<SNPChromosome> findByRangeANDStrain7NEStrainW(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainNAllele )" )
    public List<SNPChromosome> findByRangeANDStrain7NEStrainN(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain15IAllele )" )
    public List<SNPChromosome> findByRangeANDStrain7NEStrain15I(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainZeroAllele )" )
    public List<SNPChromosome> findByRangeANDStrain7NEstrainZero(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain6Allele )" )
    public List<SNPChromosome> findByRangeANDStrain7NEStrain6(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainCAllele )" )
    public List<SNPChromosome> findByRangeANDStrain7NEStrainC(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainWAllele )" )
    public List<SNPChromosome> findByRangeANDStrainPNEStrainW(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainNAllele )" )
    public List<SNPChromosome> findByRangeANDStrainPNEStrainN(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain15IAllele )" )
    public List<SNPChromosome> findByRangeANDStrainPNEStrain15I(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainZeroAllele )" )
    public List<SNPChromosome> findByRangeANDStrainPNEstrainZero(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain6Allele )" )
    public List<SNPChromosome> findByRangeANDStrainPNEStrain6(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainCAllele )" )
    public List<SNPChromosome> findByRangeANDStrainPNEStrainC(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainNAllele )" )
    public List<SNPChromosome> findByRangeANDStrainWNEStrainN(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain15IAllele )" )
    public List<SNPChromosome> findByRangeANDStrainWNEStrain15I(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainZeroAllele )" )
    public List<SNPChromosome> findByRangeANDStrainWNEstrainZero(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain6Allele )" )
    public List<SNPChromosome> findByRangeANDStrainWNEStrain6(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainCAllele )" )
    public List<SNPChromosome> findByRangeANDStrainWNEStrainC(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain15IAllele )" )
    public List<SNPChromosome> findByRangeANDStrainNNEStrain15I(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainZeroAllele )" )
    public List<SNPChromosome> findByRangeANDStrainNNEstrainZero(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain6Allele )" )
    public List<SNPChromosome> findByRangeANDStrainNNEStrain6(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainCAllele )" )
    public List<SNPChromosome> findByRangeANDStrainNNEStrainC(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainZeroAllele )" )
    public List<SNPChromosome> findByRangeANDStrain15INEstrainZero(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strain6Allele )" )
    public List<SNPChromosome> findByRangeANDStrain15INEStrain6(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainCAllele )" )
    public List<SNPChromosome> findByRangeANDStrain15INEStrainC(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZeroAllele = p.strain6Allele )" )
    public List<SNPChromosome> findByRangeANDStrainZeroNEStrain6(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZeroAllele = p.strainCAllele )" )
    public List<SNPChromosome> findByRangeANDStrainZeroNEStrainC(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );
	
	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.strain6Allele = p.strainCAllele )" )
    public List<SNPChromosome> findByRangeANDStrain6NEStrainC(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );


	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.reference = p.strainPAllele )" )
	public List<SNPChromosome> findByRangeANDReferenceNEStrainP(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.reference = p.strainWAllele )" )
    public List<SNPChromosome> findByRangeANDReferenceNEStrainW(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.reference = p.strainNAllele )" )
    public List<SNPChromosome> findByRangeANDReferenceNEStrainN(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.reference = p.strain15IAllele )" )
    public List<SNPChromosome> findByRangeANDReferenceNEStrain15I(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.reference = p.strainZeroAllele )" )
    public List<SNPChromosome> findByRangeANDReferenceNEstrainZero(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.reference = p.strain6Allele )" )
    public List<SNPChromosome> findByRangeANDReferenceNEStrain6(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.reference = p.strainCAllele )" )
    public List<SNPChromosome> findByRangeANDReferenceNEStrainC(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.partitionId = :longPartition and p.position > :intLowRange and p.position < :intHighRange and not ( p.reference = p.strain7Allele )" )
    public List<SNPChromosome> findByRangeANDReferenceNEStrain7(@Param("longPartition") long longPartition, @Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );


	@Query("Select p from SNPChromosome p where p.snpChromosomePrimaryKey.oid = :longOid and p.snpChromosomePrimaryKey.partitionId = :longPartition " )
	public SNPChromosome findByOidAndPartitionId(@Param("longOid") long longOid, @Param("longPartition") long longPartition );


	
}
