package com.roslin.mwicks.spring.variation.service.snpinsertiondeletion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.roslin.mwicks.spring.variation.dto.web.objects.snpinsertiondeletion.DTODownloadSNPInsertionDeletion;
import com.roslin.mwicks.spring.variation.dto.web.objects.snpinsertiondeletion.DTOSearchSNPInsertionDeletion;

import com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion.ExceptionSNPInsertionDeletionNotFound;

import com.roslin.mwicks.spring.variation.model.other.PageSNPInsertionDeletion;

import com.roslin.mwicks.spring.variation.model.snpinsertiondeletion.SNPInsertionDeletion;

import com.roslin.mwicks.spring.variation.repository.snpinsertiondeletion.RepositorySNPInsertionDeletion;

import com.roslin.mwicks.spring.variation.serviceinterface.snpinsertiondeletion.ServiceSNPInsertionDeletion;

import com.roslin.mwicks.utility.ObjectConverter;


/**
 * This implementation of the SNPInsertionDeletionService interface communicates with
 * the database by using a Spring Data JPA repository.
 * @author Mike Wicks
 */
@Service
public class ServiceRepositorySNPInsertionDeletion implements ServiceSNPInsertionDeletion {
    
	protected static final String SORT_ASC = "asc";
	protected static final String SORT_DESC = "desc";

	protected static final String FIELD_POSITION_START = "positionStart";
	protected static final String FIELD_POSITION_END = "positionEnd";
	protected static final String FIELD_REFERENCE = "reference";
	protected static final String FIELD_ALTERNATIVE = "alternative";
	protected static final String FIELD_AMINO_ACID_SUBSITUTION = "aminoAcidSubs";
	protected static final String FIELD_PREDICTION_CATEGORY = "predictionCategory";
	protected static final String FIELD_SIFT_SCORE = "scoreSift";
	protected static final String FIELD_SIFT_SCORE_CONSERVATION = "scoreConservation";
	protected static final String FIELD_PROTEIN_ALIGNMENT_NUMBER = "proteinAlignNumber";
	protected static final String FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER = "totalAlignSequenceNumber";
	protected static final String FIELD_PROVEAN_SCORE = "scoreProvean";
	
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceRepositorySNPInsertionDeletion.class);
    
    private static final int NUMBER_OF_SNPCHROMOSOMES_PER_PAGE = 30;
    
    @PersistenceContext
    private EntityManager entityManager;
     
    @Resource
    private RepositorySNPInsertionDeletion repositorysnpinsertiondeletion;

    
    @Transactional(readOnly = true)
    public SNPInsertionDeletion findByOid(Long oid) {
    	
        LOGGER.debug("Finding SNPInsertionDeletion by oid: " + oid);
        
        return repositorysnpinsertiondeletion.findOne(oid);
    }
    
    @Transactional
    public <T extends SNPInsertionDeletion> Collection<T> bulkSave(int intBatchSize, Collection<T> entities) {
    	
    	final List<T> savedEntities = new ArrayList<T>(entities.size());
    	int i = 0;

    	for (T t : entities) {
    	    
    		//savedEntities.add(persistOrMerge(t));
    		entityManager.persist(t);

    		i++;
    	    
    		if (i % intBatchSize == 0) {

    			// Flush a batch of inserts and release memory.
    			entityManager.flush();
    			entityManager.clear();
    		}
    	}
    	
    	return savedEntities;
    }
    	 
    
    @Transactional(readOnly = true)
    public List<SNPInsertionDeletion> download(DTODownloadSNPInsertionDeletion dtoDownload) {
        
    	LOGGER.debug("Downloading snpinsertiondeletions with download criteria: " + dtoDownload);

    	List<SNPInsertionDeletion> snpinsertiondeletions = null;
    	
        if ( dtoDownload.isDownloadReferenceBreedI() && dtoDownload.isDownloadAlternativeBreedJ() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesJ");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesJ( dtoDownload.getDownloadChromosomeAsString(), dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if ( dtoDownload.isDownloadReferenceBreedI() && dtoDownload.isDownloadAlternativeBreedL() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesL");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesL( dtoDownload.getDownloadChromosomeAsString(), dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if ( dtoDownload.isDownloadReferenceBreedI() && dtoDownload.isDownloadAlternativeBreedN() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesN");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesN( dtoDownload.getDownloadChromosomeAsString(), dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if ( dtoDownload.isDownloadReferenceBreedI() && dtoDownload.isDownloadAlternativeBreedW() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesW");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesW( dtoDownload.getDownloadChromosomeAsString(), dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if ( dtoDownload.isDownloadReferenceBreedI() && dtoDownload.isDownloadAlternativeBreedZ() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesZ");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesZ( dtoDownload.getDownloadChromosomeAsString(), dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if ( dtoDownload.isDownloadReferenceBreedJ() && dtoDownload.isDownloadAlternativeBreedL() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesJNEAllelesL");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesJNEAllelesL( dtoDownload.getDownloadChromosomeAsString(), dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if ( dtoDownload.isDownloadReferenceBreedJ() && dtoDownload.isDownloadAlternativeBreedN() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesJNEAllelesN");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesJNEAllelesN( dtoDownload.getDownloadChromosomeAsString(), dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if ( dtoDownload.isDownloadReferenceBreedJ() && dtoDownload.isDownloadAlternativeBreedW() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesJNEAllelesW");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesJNEAllelesW( dtoDownload.getDownloadChromosomeAsString(), dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if ( dtoDownload.isDownloadReferenceBreedJ() && dtoDownload.isDownloadAlternativeBreedZ() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesJNEAllelesZ");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesJNEAllelesZ( dtoDownload.getDownloadChromosomeAsString(), dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if ( dtoDownload.isDownloadReferenceBreedL() && dtoDownload.isDownloadAlternativeBreedN() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesLNEAllelesN");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesLNEAllelesN( dtoDownload.getDownloadChromosomeAsString(), dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if ( dtoDownload.isDownloadReferenceBreedL() && dtoDownload.isDownloadAlternativeBreedW() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesLNEAllelesW");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesLNEAllelesW( dtoDownload.getDownloadChromosomeAsString(), dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if ( dtoDownload.isDownloadReferenceBreedL() && dtoDownload.isDownloadAlternativeBreedZ() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesLNEAllelesZ");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesLNEAllelesZ( dtoDownload.getDownloadChromosomeAsString(), dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if ( dtoDownload.isDownloadReferenceBreedN() && dtoDownload.isDownloadAlternativeBreedW() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesNNEAllelesW");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesNNEAllelesW( dtoDownload.getDownloadChromosomeAsString(), dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if ( dtoDownload.isDownloadReferenceBreedN() && dtoDownload.isDownloadAlternativeBreedZ() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesNNEAllelesZ");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesNNEAllelesZ( dtoDownload.getDownloadChromosomeAsString(), dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }
        if ( dtoDownload.isDownloadReferenceBreedW() && dtoDownload.isDownloadAlternativeBreedZ() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesWNEAllelesZ");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesWNEAllelesZ( dtoDownload.getDownloadChromosomeAsString(), dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt() );
        }

        return snpinsertiondeletions;
    }


    @Transactional(readOnly = true)
    public PageSNPInsertionDeletion search(DTOSearchSNPInsertionDeletion dtoSearch, int pageNumber, String sortField, String sortDirection) {
        
    	LOGGER.debug("Searching snpinsertiondeletions with search criteria: " + dtoSearch);

    	List<SNPInsertionDeletion> snpinsertiondeletions = new ArrayList<SNPInsertionDeletion>();
    	List<SNPInsertionDeletion> snpinsertiondeletionsCutdown = new ArrayList<SNPInsertionDeletion>();
    	List<SNPInsertionDeletion> snpinsertiondeletionsFiltered = new ArrayList<SNPInsertionDeletion>();;

    	String strColumn = sortField;
    	String strDirection = sortDirection;
    	int intStart = 0;
    	int intStop = 0;
    	int intTotalPages = 0;
    	
        if ( dtoSearch.isSearchReferenceBreedI() && dtoSearch.isSearchAlternativeBreedJ() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesJ");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesJ( dtoSearch.getSearchChromosomeAsString(), dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if ( dtoSearch.isSearchReferenceBreedI() && dtoSearch.isSearchAlternativeBreedL() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesL");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesL( dtoSearch.getSearchChromosomeAsString(), dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if ( dtoSearch.isSearchReferenceBreedI() && dtoSearch.isSearchAlternativeBreedN() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesN");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesN( dtoSearch.getSearchChromosomeAsString(), dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if ( dtoSearch.isSearchReferenceBreedI() && dtoSearch.isSearchAlternativeBreedW() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesW");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesW( dtoSearch.getSearchChromosomeAsString(), dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if ( dtoSearch.isSearchReferenceBreedI() && dtoSearch.isSearchAlternativeBreedZ() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesZ");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesINEAllelesZ( dtoSearch.getSearchChromosomeAsString(), dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if ( dtoSearch.isSearchReferenceBreedJ() && dtoSearch.isSearchAlternativeBreedL() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesJNEAllelesL");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesJNEAllelesL( dtoSearch.getSearchChromosomeAsString(), dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if ( dtoSearch.isSearchReferenceBreedJ() && dtoSearch.isSearchAlternativeBreedN() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesJNEAllelesN");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesJNEAllelesN( dtoSearch.getSearchChromosomeAsString(), dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if ( dtoSearch.isSearchReferenceBreedJ() && dtoSearch.isSearchAlternativeBreedW() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesJNEAllelesW");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesJNEAllelesW( dtoSearch.getSearchChromosomeAsString(), dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if ( dtoSearch.isSearchReferenceBreedJ() && dtoSearch.isSearchAlternativeBreedZ() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesJNEAllelesZ");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesJNEAllelesZ( dtoSearch.getSearchChromosomeAsString(), dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if ( dtoSearch.isSearchReferenceBreedL() && dtoSearch.isSearchAlternativeBreedN() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesLNEAllelesN");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesLNEAllelesN( dtoSearch.getSearchChromosomeAsString(), dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if ( dtoSearch.isSearchReferenceBreedL() && dtoSearch.isSearchAlternativeBreedW() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesLNEAllelesW");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesLNEAllelesW( dtoSearch.getSearchChromosomeAsString(), dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if ( dtoSearch.isSearchReferenceBreedL() && dtoSearch.isSearchAlternativeBreedZ() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesLNEAllelesZ");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesLNEAllelesZ( dtoSearch.getSearchChromosomeAsString(), dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if ( dtoSearch.isSearchReferenceBreedN() && dtoSearch.isSearchAlternativeBreedW() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesNNEAllelesW");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesNNEAllelesW( dtoSearch.getSearchChromosomeAsString(), dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if ( dtoSearch.isSearchReferenceBreedN() && dtoSearch.isSearchAlternativeBreedZ() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesNNEAllelesZ");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesNNEAllelesZ( dtoSearch.getSearchChromosomeAsString(), dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        if ( dtoSearch.isSearchReferenceBreedW() && dtoSearch.isSearchAlternativeBreedZ() ) {
            LOGGER.debug("Searching snpinsertiondeletions by using repositorysnpinsertiondeletion.findByRangeANDAllelesWNEAllelesZ");
            snpinsertiondeletions = repositorysnpinsertiondeletion.findByRangeANDAllelesWNEAllelesZ( dtoSearch.getSearchChromosomeAsString(), dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt() );
        }
        
        if ( snpinsertiondeletions.size() != 0 ) {
        	
         	//System.out.println("snpinsertiondeletions.size() : " + snpinsertiondeletions.size() );

         	Iterator<SNPInsertionDeletion> iteratorSNPInsertionDeletions = snpinsertiondeletions.iterator();
            
         	while (iteratorSNPInsertionDeletions.hasNext()) {
        		
         		SNPInsertionDeletion snpinsertiondeletion = iteratorSNPInsertionDeletions.next();

         		boolean addRow = false;

         		//System.out.println("dtoSearch.getSearchFilterSiftScoreValueAsDouble() : " + dtoSearch.getSearchFilterSiftScoreValueAsDouble() );
         		//System.out.println("dtoSearch.getSearchFilterSiftConservationScoreValueAsDouble() : " + dtoSearch.getSearchFilterSiftConservationScoreValueAsDouble() );
         		//System.out.println("dtoSearch.getSearchFilterProteinAlignNumberValueAsLong() : " + dtoSearch.getSearchFilterProteinAlignNumberValueAsLong() );
         		//System.out.println("dtoSearch.getSearchFilterTotalNumberSeqAlignedValueAsLong() : " + dtoSearch.getSearchFilterTotalNumberSeqAlignedValueAsLong() );
         		//System.out.println("dtoSearch.getSearchFilterProveanScoreValueAsDouble() : " + dtoSearch.getSearchFilterProveanScoreValueAsDouble() );

         		// Are there any Filters set?
         		if ( dtoSearch.getSearchFilterSiftScoreValueAsDouble() == 0 &&
         				dtoSearch.getSearchFilterSiftConservationScoreValueAsDouble() == 0 &&
         				dtoSearch.getSearchFilterProteinAlignNumberValueAsLong() == 0 &&
         				dtoSearch.getSearchFilterTotalNumberSeqAlignedValueAsLong() == 0 &&
         				dtoSearch.getSearchFilterProveanScoreValueAsDouble()  == 0 ) {

         			// No - All Zeroes, therefore cannot filter, pass through in list to out list
         			addRow = true;
        		}
         		// Yes - Filter values set
         		else {
             		//System.out.println("snpinsertiondeletion.getScoreSift() : " + snpinsertiondeletion.getScoreSift() );
             		//System.out.println("snpinsertiondeletion.getScoreConservation() : " + snpinsertiondeletion.getScoreConservation() );
             		//System.out.println("snpinsertiondeletion.getProteinAlignNumber() : " + snpinsertiondeletion.getProteinAlignNumber() );
             		//System.out.println("snpinsertiondeletion.getTotalAlignSequenceNumber() : " + snpinsertiondeletion.getTotalAlignSequenceNumber() );
             		//System.out.println("snpinsertiondeletion.getScoreProvean() : " + snpinsertiondeletion.getScoreProvean() );

             		// Does the input row have any Provean/Sift data
         			if ( snpinsertiondeletion.getScoreSift() == 0 &&
         					snpinsertiondeletion.getScoreConservation() == 0 &&
         					snpinsertiondeletion.getProteinAlignNumber() == 0 &&
         					snpinsertiondeletion.getTotalAlignSequenceNumber() == 0 && 
         					snpinsertiondeletion.getScoreProvean() == 0 ) {
         				
         				// No data on the row - Therefore IGNORE
         				addRow = false;
         			}
         			// Yes data in the row - check values
         			else {
         				// searchFilterProveanScoreValue;
        				if ( dtoSearch.isSearchFilterProveanScoreAbove() ) {
        					if ( !dtoSearch.isSearchFilterProveanScoreValueZero() ) {
        						if ( snpinsertiondeletion.getScoreProvean() > dtoSearch.getSearchFilterProveanScoreValueAsDouble() ) {
        							addRow = true;
        						}
        					}
        				}
        				else {
        					if ( !dtoSearch.isSearchFilterProveanScoreValueZero() ) {
        						if ( snpinsertiondeletion.getScoreProvean() < dtoSearch.getSearchFilterProveanScoreValueAsDouble() ) {
          							addRow = true;
        						}
        					}
         				}
         				// searchFilterSiftScoreValue;
         				if ( dtoSearch.isSearchFilterSiftScoreAbove()) {
         				    if ( !dtoSearch.isSearchFilterSiftScoreValueZero() ) {
         				        if ( snpinsertiondeletion.getScoreSift() > dtoSearch.getSearchFilterSiftScoreValueAsDouble() ) {
         				        	addRow = true;
         				        }
         				    }
         				}
         				else {
         					if ( !dtoSearch.isSearchFilterSiftScoreValueZero() ) {
         						if ( snpinsertiondeletion.getScoreSift() < dtoSearch.getSearchFilterSiftScoreValueAsDouble() ) {
         							addRow = true;
         						}
         					}
         				}
         				// searchFilterSiftConservationScoreValue
         				if ( dtoSearch.isSearchFilterSiftConservationScoreAbove() ) {
         					if ( !dtoSearch.isSearchFilterSiftConservationScoreValueZero() ) {
         						if ( snpinsertiondeletion.getScoreConservation() > dtoSearch.getSearchFilterSiftConservationScoreValueAsDouble() ) {
         							addRow = true;
         						}
         					}
         				}
         				else {
         					if ( !dtoSearch.isSearchFilterSiftConservationScoreValueZero() ) {
         						if ( snpinsertiondeletion.getScoreConservation() < dtoSearch.getSearchFilterSiftConservationScoreValueAsDouble() ) {
         							addRow = true;
         						}
         					}
         				}
         				// searchFilterProteinAlignNumberValue
         				if ( dtoSearch.isSearchFilterProteinAlignNumberAbove() ) {
         					if ( !dtoSearch.isSearchFilterProteinAlignNumberValueZero() ) {
         						if ( snpinsertiondeletion.getProteinAlignNumber() > dtoSearch.getSearchFilterProteinAlignNumberValueAsLong() ) {
         							addRow = true;
        						}
         					}
         				}
         				else {
         					if ( !dtoSearch.isSearchFilterProteinAlignNumberValueZero() ) {
         						if ( snpinsertiondeletion.getProteinAlignNumber() < dtoSearch.getSearchFilterProteinAlignNumberValueAsLong() ) {
         							addRow = true;
         						}
         					}
         				}
         				// searchFilterTotalNumberSeqAlignedValue
         				if ( dtoSearch.isSearchFilterTotalNumberSeqAlignedAbove() ) {
         					if ( !dtoSearch.isSearchFilterTotalNumberSeqAlignedValueZero() ) {
         						if ( snpinsertiondeletion.getTotalAlignSequenceNumber() > dtoSearch.getSearchFilterTotalNumberSeqAlignedValueAsLong() ) {
         							addRow = true;
         						}
         					}
         				}
         				else {
         					if ( !dtoSearch.isSearchFilterTotalNumberSeqAlignedValueZero() ) {
         						if ( snpinsertiondeletion.getTotalAlignSequenceNumber() < dtoSearch.getSearchFilterTotalNumberSeqAlignedValueAsLong() ) {
         							addRow = true;
         						}
         					}
         				}
         			}
         		
         		}

         		// Have we found a row to add; that matches our filter criteria?
         		if ( addRow ) {
         			
         			snpinsertiondeletionsFiltered.add(snpinsertiondeletion);
         		}
         	}

         	if ( snpinsertiondeletionsFiltered.size() % NUMBER_OF_SNPCHROMOSOMES_PER_PAGE == 0  ) {
            	
        		intTotalPages = ( ObjectConverter.convert(snpinsertiondeletionsFiltered.size(), Integer.class) / NUMBER_OF_SNPCHROMOSOMES_PER_PAGE);
        	}
        	else {
        		
        	    intTotalPages = ( ObjectConverter.convert(snpinsertiondeletionsFiltered.size(), Integer.class) / NUMBER_OF_SNPCHROMOSOMES_PER_PAGE ) + 1;
        	}
        	
        	intStart = ( ( pageNumber - 1 ) * NUMBER_OF_SNPCHROMOSOMES_PER_PAGE ) + 1;
        			
        	if ( pageNumber < intTotalPages ) {
        		
        		intStop = pageNumber * NUMBER_OF_SNPCHROMOSOMES_PER_PAGE;
        	}
        	else {
        		
        		intStop = ObjectConverter.convert(snpinsertiondeletionsFiltered.size(), Integer.class);
        	}
        	
         	//System.out.println("snpinsertiondeletionsFiltered.size() : " + snpinsertiondeletionsFiltered.size());
            //System.out.println("intStart : " + intStart);
            //System.out.println("intStop : " + intStop);
            //System.out.println("intTotalPages : " + intTotalPages);
        			
            snpinsertiondeletionsCutdown = snpinsertiondeletionsFiltered.subList(intStart - 1, intStop);
            
         	//System.out.println("snpinsertiondeletionsCutdown.size() : " + snpinsertiondeletionsCutdown.size());

         	if ( strColumn.equals(FIELD_POSITION_START) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByPositionStartAsc());
            }
            if ( strColumn.equals(FIELD_POSITION_START) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByPositionStartDesc());
            }
            if ( strColumn.equals(FIELD_POSITION_END) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByPositionEndAsc());
            }
            if ( strColumn.equals(FIELD_POSITION_END) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByPositionEndDesc());
            }
            if ( strColumn.equals(FIELD_REFERENCE) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByReferenceAsc());
            }
            if ( strColumn.equals(FIELD_REFERENCE) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByReferenceDesc());
            }
            if ( strColumn.equals(FIELD_ALTERNATIVE) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByAlternativeAsc());
            }
            if ( strColumn.equals(FIELD_ALTERNATIVE) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByAlternativeDesc());
            }
            if ( strColumn.equals(FIELD_AMINO_ACID_SUBSITUTION) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByAminoAcidSubsAsc());
            }
            if ( strColumn.equals(FIELD_AMINO_ACID_SUBSITUTION) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByAminoAcidSubsDesc());
            }
            if ( strColumn.equals(FIELD_PREDICTION_CATEGORY) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByPredictionCategoryAsc());
            }
            if ( strColumn.equals(FIELD_PREDICTION_CATEGORY) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByPredictionCategoryDesc());
            }
            if ( strColumn.equals(FIELD_SIFT_SCORE) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByScoreSiftAsc());
            }
            if ( strColumn.equals(FIELD_SIFT_SCORE) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByScoreSiftDesc());
            }
            if ( strColumn.equals(FIELD_SIFT_SCORE_CONSERVATION) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByScoreConservationAsc());
            }
            if ( strColumn.equals(FIELD_SIFT_SCORE_CONSERVATION) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByScoreConservationDesc());
            }
            if ( strColumn.equals(FIELD_PROTEIN_ALIGNMENT_NUMBER) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByProteinAlignNumberAsc());
            }
            if ( strColumn.equals(FIELD_PROTEIN_ALIGNMENT_NUMBER) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByProteinAlignNumberDesc());
            }
            if ( strColumn.equals(FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByTotalAlignSequenceNumberAsc());
            }
            if ( strColumn.equals(FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByTotalAlignSequenceNumberDesc());
            }
            if ( strColumn.equals(FIELD_PROVEAN_SCORE) && strDirection.equals(SORT_ASC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByScoreProveanAsc());
            }
            if ( strColumn.equals(FIELD_PROVEAN_SCORE) && strDirection.equals(SORT_DESC) ) {
                Collections.sort(snpinsertiondeletionsCutdown, new SNPInsertionDeletion.OrderByScoreProveanDesc());
            }
        }
        
        PageSNPInsertionDeletion pagesnpinsertiondeletion = new PageSNPInsertionDeletion(pageNumber, intTotalPages, snpinsertiondeletions.size(), snpinsertiondeletionsCutdown);

        return pagesnpinsertiondeletion;
    }
    
    /*
    @Transactional(readOnly = true)
    public PageSNPInsertionDeletion findAll(Integer pageNumber) {
    	
        LOGGER.debug("Finding all snpinsertiondeletions");

        PageRequest pageRequest = new PageRequest(pageNumber - 1, NUMBER_OF_SNPCHROMOSOMES_PER_PAGE, Sort.Direction.ASC, "position");
        
        Page<SNPInsertionDeletion> pagesnpinsertiondeletions = repositorysnpinsertiondeletion.findAll(pageRequest);
        
    	List<SNPInsertionDeletion> snpinsertiondeletions = pagesnpinsertiondeletions.getContent();
    	
    	PageSNPInsertionDeletion pagesnpinsertiondeletion = new PageSNPInsertionDeletion(snpinsertiondeletions.getNumber(), snpinsertiondeletions.getTotalPages(), snpinsertiondeletions.getTotalElements(), snpinsertiondeletions);

        return pagesnpinsertiondeletion;
    }
     */
    
    
    @Transactional(readOnly = true)
    public SNPInsertionDeletion findByOid(String Oid) {
    	
        LOGGER.debug("Find a snpinsertiondeletion with Oid: " + Oid);
        
        SNPInsertionDeletion snpinsertiondeletion = repositorysnpinsertiondeletion.findByOid( ObjectConverter.convert(Oid, Long.class) );
        
        return snpinsertiondeletion;
    }

    
    @Transactional(rollbackFor = ExceptionSNPInsertionDeletionNotFound.class)
    public SNPInsertionDeletion update(SNPInsertionDeletion updated) throws ExceptionSNPInsertionDeletionNotFound {
    	
        LOGGER.debug("Updating snpinsertiondeletion with information: " + updated);
        
        SNPInsertionDeletion snpinsertiondeletion = repositorysnpinsertiondeletion.findByOid( updated.getOid() );
        
        if (snpinsertiondeletion == null) {
        	
            LOGGER.debug("No snpinsertiondeletion found with id: " + updated.getOid());
            
            throw new ExceptionSNPInsertionDeletionNotFound("No snpinsertiondeletion found with id: " + updated.getOid());
        }
        
        snpinsertiondeletion.update(
        		updated.getChromosomeId(),
        		updated.getPositionStart(),
        		updated.getPositionEnd(),
        		updated.getInsertionDeletionId(),
        		updated.getReference(),    
        		updated.getAlternative(),
        		updated.getQuality(),
        		updated.getFilter(),
        		updated.getInformation(),
            	updated.getBreedAllelesI(),
            	updated.getBreedAllelesJ(),
            	updated.getBreedAllelesL(),
            	updated.getBreedAllelesN(),
            	updated.getBreedAllelesW(),
            	updated.getBreedAllelesZ(),
            	updated.getAminoAcidSubs(),
            	updated.getPredictionCategory(),
            	updated.getScoreSift(),
            	updated.getScoreConservation(),
            	updated.getProteinAlignNumber(),
            	updated.getTotalAlignSequenceNumber(),
            	updated.getScoreProvean()  
        		);

        return snpinsertiondeletion;
    }

    
    @Transactional(readOnly = true)
    public List<SNPInsertionDeletion> findByInsertionDeletionId(String InsertionDeletionId) {
    	
        LOGGER.debug("Find a snpchromosome with InsertionDeletionId: " + InsertionDeletionId);
        
        List<SNPInsertionDeletion> snpchromosomeList = repositorysnpinsertiondeletion.findByInsertionDeletionId(InsertionDeletionId);
        
        return snpchromosomeList;
    }


    /**
     * This setter method should be used only by unit tests.
     * @param repositorySNPInsertionDeletion
     */
    protected void setRepositorySNPInsertionDeletion(RepositorySNPInsertionDeletion repositorysnpinsertiondeletion) {
    	
        this.repositorysnpinsertiondeletion = repositorysnpinsertiondeletion;
    }

}
