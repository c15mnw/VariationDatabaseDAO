package com.roslin.mwicks.spring.variation.repository.snpinsertiondeletion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import com.roslin.mwicks.spring.variation.model.snpinsertiondeletion.SNPInsertionDeletion;

import java.util.List;

/**
 * Specifies methods used to obtain and modify SNPInsertionDeletion related information
 * which is stored in the database.
 * @author Mike Wicks
 */
public interface RepositorySNPInsertionDeletion extends JpaRepository<SNPInsertionDeletion, Long> {

	
    public List<SNPInsertionDeletion> findByInsertionDeletionId(String insertionDeletionId);


	@Query("Select p from SNPInsertionDeletion p where p.oid = :longOid " )
	public SNPInsertionDeletion findByOid(@Param("longOid") long longOid );


	@Query("Select p from SNPInsertionDeletion p where p.position > :intLowRange and p.position < :intHighRange and not ( p.breedAllelesI = p.breedAllelesJ )" )
	public List<SNPInsertionDeletion> findByRangeANDAllelesINEAllelesJ(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPInsertionDeletion p where p.position > :intLowRange and p.position < :intHighRange and not ( p.breedAllelesI = p.breedAllelesL )" )
    public List<SNPInsertionDeletion> findByRangeANDAllelesINEAllelesL(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPInsertionDeletion p where p.position > :intLowRange and p.position < :intHighRange and not ( p.breedAllelesI = p.breedAllelesN )" )
    public List<SNPInsertionDeletion> findByRangeANDAllelesINEAllelesN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPInsertionDeletion p where p.position > :intLowRange and p.position < :intHighRange and not ( p.breedAllelesI = p.breedAllelesW )" )
    public List<SNPInsertionDeletion> findByRangeANDAllelesINEAllelesW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPInsertionDeletion p where p.position > :intLowRange and p.position < :intHighRange and not ( p.breedAllelesI = p.breedAllelesZ )" )
    public List<SNPInsertionDeletion> findByRangeANDAllelesINEAllelesZ(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );


	@Query("Select p from SNPInsertionDeletion p where p.position > :intLowRange and p.position < :intHighRange and not ( p.breedAllelesJ = p.breedAllelesL )" )
	public List<SNPInsertionDeletion> findByRangeANDAllelesJNEAllelesL(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPInsertionDeletion p where p.position > :intLowRange and p.position < :intHighRange and not ( p.breedAllelesJ = p.breedAllelesN )" )
    public List<SNPInsertionDeletion> findByRangeANDAllelesJNEAllelesN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPInsertionDeletion p where p.position > :intLowRange and p.position < :intHighRange and not ( p.breedAllelesJ = p.breedAllelesW )" )
    public List<SNPInsertionDeletion> findByRangeANDAllelesJNEAllelesW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPInsertionDeletion p where p.position > :intLowRange and p.position < :intHighRange and not ( p.breedAllelesJ = p.breedAllelesZ )" )
    public List<SNPInsertionDeletion> findByRangeANDAllelesJNEAllelesZ(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );


	@Query("Select p from SNPInsertionDeletion p where p.position > :intLowRange and p.position < :intHighRange and not ( p.breedAllelesL = p.breedAllelesN )" )
    public List<SNPInsertionDeletion> findByRangeANDAllelesLNEAllelesN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPInsertionDeletion p where p.position > :intLowRange and p.position < :intHighRange and not ( p.breedAllelesL = p.breedAllelesW )" )
    public List<SNPInsertionDeletion> findByRangeANDAllelesLNEAllelesW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPInsertionDeletion p where p.position > :intLowRange and p.position < :intHighRange and not ( p.breedAllelesL = p.breedAllelesZ )" )
    public List<SNPInsertionDeletion> findByRangeANDAllelesLNEAllelesZ(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );


	@Query("Select p from SNPInsertionDeletion p where p.position > :intLowRange and p.position < :intHighRange and not ( p.breedAllelesN = p.breedAllelesW )" )
    public List<SNPInsertionDeletion> findByRangeANDAllelesNNEAllelesW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );

	@Query("Select p from SNPInsertionDeletion p where p.position > :intLowRange and p.position < :intHighRange and not ( p.breedAllelesN = p.breedAllelesZ )" )
    public List<SNPInsertionDeletion> findByRangeANDAllelesNNEAllelesZ(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );


	@Query("Select p from SNPInsertionDeletion p where p.position > :intLowRange and p.position < :intHighRange and not ( p.breedAllelesW = p.breedAllelesZ )" )
    public List<SNPInsertionDeletion> findByRangeANDAllelesWNEAllelesZ(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange );
	
}
