package com.roslin.mwicks.spring.variation.dto.web.objects.snpinsertiondeletion;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.springframework.data.domain.Sort;
import org.springframework.web.multipart.MultipartFile;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import com.roslin.mwicks.utility.ObjectConverter;
import com.roslin.mwicks.utility.StringUtility;

import com.roslin.mwicks.spring.variation.dto.web.enums.SearchReferenceBreed;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchAlternativeBreed;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchChromosome;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchFilterSiftScore;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchFilterSiftConservationScore;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchFilterProteinAlignNumber;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchFilterTotalNumberSeqAligned;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchSortDirection;
import com.roslin.mwicks.spring.variation.dto.web.enums.snpinsertiondeletion.SearchSortField;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchFilterProveanScore;

import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneDownStreamNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneDownStreamSearchRangeGreaterThanTenThousand;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneMultiplesFound;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneNotFound;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneSearchRangeLessThanZero;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneUpStreamNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneUpStreamSearchRangeGreaterThanTenThousand;

import com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion.ExceptionSNPInsertionDeletionAlternativeAlleleNotSupplied;
import com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion.ExceptionSNPInsertionDeletionHighCoordinateNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion.ExceptionSNPInsertionDeletionLowCoordinateGreaterThanHighCoordinate;
import com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion.ExceptionSNPInsertionDeletionLowCoordinateNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion.ExceptionSNPInsertionDeletionNotSelected;
import com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion.ExceptionSNPInsertionDeletionReferenceAlleleEqualsAlternativeAllele;
import com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion.ExceptionSNPInsertionDeletionReferenceAlleleNotSupplied;
import com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion.ExceptionSNPInsertionDeletionSearchFilterProteinAlignNumberValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion.ExceptionSNPInsertionDeletionSearchFilterProveanScoreValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion.ExceptionSNPInsertionDeletionSearchFilterSiftConservationScoreValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion.ExceptionSNPInsertionDeletionSearchFilterSiftScoreValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion.ExceptionSNPInsertionDeletionSearchFilterTotalNumberSeqAlignedValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion.ExceptionSNPInsertionDeletionSearchRangeGreaterThanOneMillion;
import com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion.ExceptionSNPInsertionDeletionSelectedWithGeneName;

import com.roslin.mwicks.spring.variation.format.CustomDateToStringStyle;

import com.roslin.mwicks.spring.variation.serviceinterface.ensemblgene.ServiceEnsemblGene;

import com.roslin.mwicks.spring.variation.model.ensemblgene.EnsemblGene;


/**
 * A DTO class which is used as a form object in the search form.
 * @author Mike Wicks
 */
public class DTOSearchSNPInsertionDeletion {

    // Constants ----------------------------------------------------------------------------------
	protected static final String SORT_FIELD_NONE = "SORT_FIELD_NONE";
	protected static final String SORT_FIELD_POSITION_START = "SORT_FIELD_POSITION_START";
	protected static final String SORT_FIELD_POSITION_END = "SORT_FIELD_POSITION_END";
	protected static final String SORT_FIELD_REFERENCE = "SORT_FIELD_REFERENCE";
	protected static final String SORT_FIELD_ALTERNATIVE = "SORT_FIELD_ALTERNATIVE";
	protected static final String SORT_FIELD_AMINO_ACID_SUBSITUTION = "SORT_FIELD_AMINO_ACID_SUBSITUTION";
	protected static final String SORT_FIELD_PREDICTION_CATEGORY = "SORT_FIELD_PREDICTION_CATEGORY";
	protected static final String SORT_FIELD_SIFT_SCORE = "SORT_FIELD_SIFT_SCORE";
	protected static final String SORT_FIELD_SIFT_SCORE_CONSERVATION = "SORT_FIELD_SIFT_SCORE_CONSERVATION";
	protected static final String SORT_FIELD_PROTEIN_ALIGNMENT_NUMBER = "SORT_FIELD_PROTEIN_ALIGNMENT_NUMBER";
	protected static final String SORT_FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER = "SORT_FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER";
	protected static final String SORT_FIELD_PROVEAN_SCORE = "SORT_FIELD_PROVEAN_SCORE";

	protected static final String SORT_DIRECTION_NONE = "SORT_DIRECTION_NONE";
	protected static final String SORT_DIRECTION_ASCENDING = "SORT_DIRECTION_ASCENDING";
	protected static final String SORT_DIRECTION_DESCENDING = "SORT_DIRECTION_DESCENDING";
			
	protected static final String ONLY_SORT_FIELD_NONE = "positionStart";
	protected static final String ONLY_SORT_FIELD_POSITION_START = "positionStart";
	protected static final String ONLY_SORT_FIELD_POSITION_END = "positionEnd";
	protected static final String ONLY_SORT_FIELD_REFERENCE = "reference";
	protected static final String ONLY_SORT_FIELD_ALTERNATIVE = "alternative";
	protected static final String ONLY_SORT_FIELD_AMINO_ACID_SUBSITUTION = "aminoAcidSubs";
	protected static final String ONLY_SORT_FIELD_PREDICTION_CATEGORY = "predictionCategory";
	protected static final String ONLY_SORT_FIELD_SIFT_SCORE = "scoreSift";
	protected static final String ONLY_SORT_FIELD_SIFT_SCORE_CONSERVATION = "scoreConservation";
	protected static final String ONLY_SORT_FIELD_PROTEIN_ALIGNMENT_NUMBER = "proteinAlignNumber";
	protected static final String ONLY_SORT_FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER = "totalAlignSequenceNumber";
	protected static final String ONLY_SORT_FIELD_PROVEAN_SCORE = "scoreProvean";

	protected static final String ONLY_SORT_DIRECTION_NONE = "asc";
	protected static final String ONLY_SORT_DIRECTION_ASCENDING = "asc";
	protected static final String ONLY_SORT_DIRECTION_DESCENDING = "desc";

	protected static final String BREED_NONE = "BREED_NONE";
	protected static final String BREED_I = "BREED_I";
	protected static final String BREED_J = "BREED_J";
	protected static final String BREED_L = "BREED_L";
	protected static final String BREED_N = "BREED_N";
	protected static final String BREED_W = "BREED_W";
	protected static final String BREED_Z = "BREED_Z";
			
	protected static final String ONLY_BREED_NONE = "NONE";
	protected static final String ONLY_BREED_I = "I";
	protected static final String ONLY_BREED_J = "J";
	protected static final String ONLY_BREED_L = "L";
	protected static final String ONLY_BREED_N = "N";
	protected static final String ONLY_BREED_W = "W";
	protected static final String ONLY_BREED_Z = "Z";
			
	protected static final String CHROMOSOME_NONE = "CHROMOSOME_NONE";
	protected static final String CHROMOSOME_1 = "CHROMOSOME_1";
	protected static final String CHROMOSOME_2 = "CHROMOSOME_2";
	protected static final String CHROMOSOME_3 = "CHROMOSOME_3";
	protected static final String CHROMOSOME_4 = "CHROMOSOME_4";
	protected static final String CHROMOSOME_5 = "CHROMOSOME_5";
	protected static final String CHROMOSOME_6 = "CHROMOSOME_6";
	protected static final String CHROMOSOME_7 = "CHROMOSOME_7";
	protected static final String CHROMOSOME_8 = "CHROMOSOME_8";
	protected static final String CHROMOSOME_9 = "CHROMOSOME_9";
	protected static final String CHROMOSOME_10 = "CHROMOSOME_10";
	protected static final String CHROMOSOME_11 = "CHROMOSOME_11";
	protected static final String CHROMOSOME_12 = "CHROMOSOME_12";
	protected static final String CHROMOSOME_13 = "CHROMOSOME_13";
	protected static final String CHROMOSOME_14 = "CHROMOSOME_14";
	protected static final String CHROMOSOME_15 = "CHROMOSOME_15";
	protected static final String CHROMOSOME_16 = "CHROMOSOME_16";
	protected static final String CHROMOSOME_17 = "CHROMOSOME_17";
	protected static final String CHROMOSOME_18 = "CHROMOSOME_18";
	protected static final String CHROMOSOME_19 = "CHROMOSOME_19";
	protected static final String CHROMOSOME_20 = "CHROMOSOME_20";
	protected static final String CHROMOSOME_21 = "CHROMOSOME_21";
	protected static final String CHROMOSOME_22 = "CHROMOSOME_22";
	protected static final String CHROMOSOME_23 = "CHROMOSOME_23";
	protected static final String CHROMOSOME_24 = "CHROMOSOME_24";
	protected static final String CHROMOSOME_25 = "CHROMOSOME_25";
	protected static final String CHROMOSOME_26 = "CHROMOSOME_26";
	protected static final String CHROMOSOME_27 = "CHROMOSOME_27";
	protected static final String CHROMOSOME_28 = "CHROMOSOME_28";
	protected static final String CHROMOSOME_32 = "CHROMOSOME_32";
	protected static final String CHROMOSOME_LGE22C19W28_E50C23 = "CHROMOSOME_LGE22C19W28_E50C23";
	protected static final String CHROMOSOME_LGE64 = "CHROMOSOME_LGE64";
	protected static final String CHROMOSOME_W = "CHROMOSOME_W";
	protected static final String CHROMOSOME_Z = "CHROMOSOME_Z";

	protected static final String ONLY_NONE = "NONE";
	protected static final String ONLY_1 = "1";
	protected static final String ONLY_2 = "2";
	protected static final String ONLY_3 = "3";
	protected static final String ONLY_4 = "4";
	protected static final String ONLY_5 = "5";
	protected static final String ONLY_6 = "6";
	protected static final String ONLY_7 = "7";
	protected static final String ONLY_8 = "8";
	protected static final String ONLY_9 = "9";
	protected static final String ONLY_10 = "10";
	protected static final String ONLY_11 = "11";
	protected static final String ONLY_12 = "12";
	protected static final String ONLY_13 = "13";
	protected static final String ONLY_14 = "14";
	protected static final String ONLY_15 = "15";
	protected static final String ONLY_16 = "16";
	protected static final String ONLY_17 = "17";
	protected static final String ONLY_18 = "18";
	protected static final String ONLY_19 = "19";
	protected static final String ONLY_20 = "20";
	protected static final String ONLY_21 = "21";
	protected static final String ONLY_22 = "22";
	protected static final String ONLY_23 = "23";
	protected static final String ONLY_24 = "24";
	protected static final String ONLY_25 = "25";
	protected static final String ONLY_26 = "26";
	protected static final String ONLY_27 = "27";
	protected static final String ONLY_28 = "28";
	protected static final String ONLY_32 = "32";
	protected static final String ONLY_LGE22C19W28_E50C23 = "LGE22C19W28_E50C23";
	protected static final String ONLY_LGE64 = "LGE64";
	protected static final String ONLY_W = "W";
	protected static final String ONLY_Z = "Z";

	protected static final String SIFT_SCORE_NONE = "SIFT_SCORE_NONE";
	protected static final String SIFT_SCORE_ABOVE = "SIFT_SCORE_ABOVE";
	protected static final String SIFT_SCORE_BELOW = "SIFT_SCORE_BELOW";

	protected static final String ONLY_SIFT_SCORE_NONE = "NONE";
	protected static final String ONLY_SIFT_SCORE_ABOVE = "ABOVE";
	protected static final String ONLY_SIFT_SCORE_BELOW = "BELOW";

	protected static final String SIFT_CONSERVATION_SCORE_NONE = "SIFT_CONSERVATION_SCORE_NONE";
	protected static final String SIFT_CONSERVATION_SCORE_ABOVE = "SIFT_CONSERVATION_SCORE_ABOVE";
	protected static final String SIFT_CONSERVATION_SCORE_BELOW = "SIFT_CONSERVATION_SCORE_BELOW";

	protected static final String ONLY_SIFT_CONSERVATION_SCORE_NONE = "NONE";
	protected static final String ONLY_SIFT_CONSERVATION_SCORE_ABOVE = "ABOVE";
	protected static final String ONLY_SIFT_CONSERVATION_SCORE_BELOW = "BELOW";

	protected static final String PROTEIN_ALIGN_NUMBER_NONE = "PROTEIN_ALIGN_NUMBER_NONE";
	protected static final String PROTEIN_ALIGN_NUMBER_ABOVE = "PROTEIN_ALIGN_NUMBER_ABOVE";
	protected static final String PROTEIN_ALIGN_NUMBER_BELOW = "PROTEIN_ALIGN_NUMBER_BELOW";

	protected static final String ONLY_PROTEIN_ALIGN_NUMBER_NONE = "NONE";
	protected static final String ONLY_PROTEIN_ALIGN_NUMBER_ABOVE = "ABOVE";
	protected static final String ONLY_PROTEIN_ALIGN_NUMBER_BELOW = "BELOW";

	protected static final String TOTAL_NUMBER_SEQ_ALIGNED_NONE = "TOTAL_NUMBER_SEQ_ALIGNED_NONE";
	protected static final String TOTAL_NUMBER_SEQ_ALIGNED_ABOVE = "TOTAL_NUMBER_SEQ_ALIGNED_ABOVE";
	protected static final String TOTAL_NUMBER_SEQ_ALIGNED_BELOW = "TOTAL_NUMBER_SEQ_ALIGNED_BELOW";

	protected static final String ONLY_TOTAL_NUMBER_SEQ_ALIGNED_NONE = "NONE";
	protected static final String ONLY_TOTAL_NUMBER_SEQ_ALIGNED_ABOVE = "ABOVE";
	protected static final String ONLY_TOTAL_NUMBER_SEQ_ALIGNED_BELOW = "BELOW";

	protected static final String PROVEAN_SCORE_NONE = "PROVEAN_SCORE_NONE";
	protected static final String PROVEAN_SCORE_ABOVE = "PROVEAN_SCORE_ABOVE";
	protected static final String PROVEAN_SCORE_BELOW = "PROVEAN_SCORE_BELOW";

	protected static final String ONLY_PROVEAN_SCORE_NONE = "NONE";
	protected static final String ONLY_PROVEAN_SCORE_ABOVE = "ABOVE";
	protected static final String ONLY_PROVEAN_SCORE_BELOW = "BELOW";

	protected static final int ONE_HUNDRED_MILLION = 100000000;
    protected static final int TEN_THOUSAND = 10000;

    
    // Properties ---------------------------------------------------------------------------------
    private int pageIndex;

    private String searchGeneName;

    private String searchDownStream;
    private String searchUpStream;

    private String searchLowRange;
    private String searchHighRange;

    private SearchReferenceBreed searchReferenceBreed;
    private SearchAlternativeBreed searchAlternativeBreed;
    
    private SearchChromosome searchChromosome;

    private String searchFilterSiftScoreValue;
    private String searchFilterSiftConservationScoreValue;
    private String searchFilterProteinAlignNumberValue;
    private String searchFilterTotalNumberSeqAlignedValue;
    private String searchFilterProveanScoreValue;

    private SearchFilterSiftScore searchFilterSiftScore;
    private SearchFilterSiftConservationScore searchFilterSiftConservationScore;
    private SearchFilterProteinAlignNumber searchFilterProteinAlignNumber;
    private SearchFilterTotalNumberSeqAligned searchFilterTotalNumberSeqAligned;
    private SearchFilterProveanScore searchFilterProveanScore;

    private SearchSortField searchSortField;
    private SearchSortDirection searchSortDirection;

    private String searchUploadFileName;
    private MultipartFile searchUploadFile;

    
    // CONSTRUCTORS -------------------------------------------------------------------------------

    // 0 Attributes (NONE)
    public DTOSearchSNPInsertionDeletion() {

    	this.pageIndex = 0;
    	
        this.searchGeneName = "";
        
        this.searchDownStream = "";
        this.searchUpStream = "";
        
        this.searchLowRange = "";
        this.searchHighRange = "";
        
        this.searchReferenceBreed = SearchReferenceBreed.BREED_NONE;
        this.searchAlternativeBreed = SearchAlternativeBreed.BREED_NONE;
        this.searchChromosome = SearchChromosome.CHROMOSOME_NONE;

        this.searchFilterSiftScoreValue = "";
        this.searchFilterSiftConservationScoreValue = "";
        this.searchFilterProteinAlignNumberValue = "";
        this.searchFilterTotalNumberSeqAlignedValue = "";
        this.searchFilterProveanScoreValue = "";

        this.searchFilterSiftScore = SearchFilterSiftScore.SIFT_SCORE_ABOVE;
        this.searchFilterSiftConservationScore = SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_ABOVE;
        this.searchFilterProteinAlignNumber = SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_ABOVE;
        this.searchFilterTotalNumberSeqAligned = SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_ABOVE;
        this.searchFilterProveanScore = SearchFilterProveanScore.PROVEAN_SCORE_ABOVE;

        this.searchSortField = SearchSortField.SORT_FIELD_POSITION_START;
        this.searchSortDirection = SearchSortDirection.SORT_DIRECTION_ASCENDING;

        this.searchUploadFileName = "";
        this.searchUploadFile = null;
    }
    
    // 21 Attributes (ALL)
    public DTOSearchSNPInsertionDeletion(
    		int pageIndex,
            String searchGeneName,
            String searchDownStream,
            String searchUpStream,
            String searchLowRange,
            String searchHighRange,
            SearchReferenceBreed searchReferenceBreed,
            SearchAlternativeBreed searchAlternativeBreed,
            SearchChromosome searchChromosome,
            String searchFilterSiftScoreValue,
            String searchFilterSiftConservationScoreValue,
            String searchFilterProteinAlignNumberValue,
            String searchFilterTotalNumberSeqAlignedValue,
            String searchFilterProveanScoreValue,
            SearchFilterSiftScore searchFilterSiftScore,
            SearchFilterSiftConservationScore searchFilterSiftConservationScore,
            SearchFilterProteinAlignNumber searchFilterProteinAlignNumber,
            SearchFilterTotalNumberSeqAligned searchFilterTotalNumberSeqAligned,
            SearchFilterProveanScore searchFilterProveanScore,
            SearchSortField searchSortField,
            SearchSortDirection searchSortDirection,
            String searchUploadFileName,
            MultipartFile searchUploadFile
            ) {
    	
    	this( pageIndex,
    			searchGeneName,
    			searchDownStream,
    			searchUpStream,
    			searchLowRange,
    			searchHighRange,
    			searchReferenceBreed,
    			searchAlternativeBreed,
    			searchChromosome);
    	
        this.searchFilterSiftScoreValue = searchFilterSiftScoreValue;
        this.searchFilterSiftConservationScoreValue = searchFilterSiftConservationScoreValue;
        this.searchFilterProteinAlignNumberValue = searchFilterProteinAlignNumberValue;
        this.searchFilterTotalNumberSeqAlignedValue = searchFilterTotalNumberSeqAlignedValue;
        this.searchFilterProveanScoreValue = searchFilterProveanScoreValue;
        
        this.searchFilterSiftConservationScore = searchFilterSiftConservationScore;
        this.searchFilterProteinAlignNumber = searchFilterProteinAlignNumber;
        this.searchFilterTotalNumberSeqAligned = searchFilterTotalNumberSeqAligned;
        this.searchFilterProveanScore = searchFilterProveanScore;
        
        this.searchSortField = searchSortField;
        this.searchSortDirection = searchSortDirection;
        
        this.searchUploadFileName = searchUploadFileName;
        this.searchUploadFile = searchUploadFile;
    }
    
    // 21 Attributes (ALL) - Strings
    public DTOSearchSNPInsertionDeletion(
    		int pageIndex,
            String searchGeneName,
            String searchDownStream,
            String searchUpStream,
            String searchLowRange,
            String searchHighRange,
            String searchReferenceBreed,
            String searchAlternativeBreed,
            String searchChromosome,
            String searchFilterSiftScoreValue,
            String searchFilterSiftConservationScoreValue,
            String searchFilterProteinAlignNumberValue,
            String searchFilterTotalNumberSeqAlignedValue,
            String searchFilterProveanScoreValue,
            String searchFilterSiftScore,
            String searchFilterSiftConservationScore,
            String searchFilterProteinAlignNumber,
            String searchFilterTotalNumberSeqAligned,
            String searchFilterProveanScore,
            String searchSortField,
            String searchSortDirection, 
            String searchUploadFileName,
            String searchUploadFile
            ) {
    	
    	this( pageIndex,
    			searchGeneName,
    			searchDownStream,
    			searchUpStream,
    			searchLowRange,
    			searchHighRange,
    			searchReferenceBreed,
    			searchAlternativeBreed,
    			searchChromosome);
    	
        this.searchFilterSiftScoreValue = searchFilterSiftScoreValue;
        this.searchFilterSiftConservationScoreValue = searchFilterSiftConservationScoreValue;
        this.searchFilterProteinAlignNumberValue = searchFilterProteinAlignNumberValue;
        this.searchFilterTotalNumberSeqAlignedValue = searchFilterTotalNumberSeqAlignedValue;
        this.searchFilterProveanScoreValue = searchFilterProveanScoreValue;
        
        this.setSearchFilterSiftConservationScore( searchFilterSiftConservationScore );
        this.setSearchFilterProteinAlignNumber( searchFilterProteinAlignNumber );
        this.setSearchFilterTotalNumberSeqAligned( searchFilterTotalNumberSeqAligned );
        this.setSearchFilterProveanScore( searchFilterProveanScore );
        
        this.setSearchSortField( searchSortField );
        this.setSearchSortDirection( searchSortDirection );
        
        this.searchUploadFileName = searchUploadFileName;
        this.searchUploadFile = null;
    }
    
    // 9 Attributes (9/21)
    public DTOSearchSNPInsertionDeletion( 
        	int pageIndex,
            String searchGeneName,
            String searchDownStream,
            String searchUpStream,
            String searchLowRange,
            String searchHighRange,
            SearchReferenceBreed searchReferenceBreed,
            SearchAlternativeBreed searchAlternativeBreed,
            SearchChromosome searchChromosome ) {

    	this( pageIndex,
    			searchLowRange,
    			searchHighRange,
    			searchReferenceBreed,
    			searchAlternativeBreed,
    			searchChromosome);

        this.searchGeneName = searchGeneName;
        this.searchDownStream = searchDownStream;
        this.searchUpStream = searchUpStream;

        this.searchFilterSiftScoreValue = "";
        this.searchFilterSiftConservationScoreValue = "";
        this.searchFilterProteinAlignNumberValue = "";
        this.searchFilterTotalNumberSeqAlignedValue = "";
        this.searchFilterProveanScoreValue = "";

        this.searchFilterSiftScore = SearchFilterSiftScore.SIFT_SCORE_ABOVE;
        this.searchFilterSiftConservationScore = SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_ABOVE;
        this.searchFilterProteinAlignNumber = SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_ABOVE;
        this.searchFilterTotalNumberSeqAligned = SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_ABOVE;
        this.searchFilterProveanScore = SearchFilterProveanScore.PROVEAN_SCORE_ABOVE;

        this.searchSortField = SearchSortField.SORT_FIELD_POSITION_START;
        this.searchSortDirection = SearchSortDirection.SORT_DIRECTION_ASCENDING;
        
        this.searchUploadFileName = "";
        this.searchUploadFile = null;
    }

    // 9 Attributes (9/21) - Strings
    public DTOSearchSNPInsertionDeletion( 
        	int pageIndex,
            String searchGeneName,
            String searchDownStream,
            String searchUpStream,
            String searchLowRange,
            String searchHighRange,
            String searchReferenceBreed,
            String searchAlternativeBreed,
            String searchChromosome ) {

    	this( pageIndex,
    			searchLowRange,
    			searchHighRange,
    			searchReferenceBreed,
    			searchAlternativeBreed,
    			searchChromosome);

        this.searchGeneName = searchGeneName;
        this.searchDownStream = searchDownStream;
        this.searchUpStream = searchUpStream;

        this.searchFilterSiftScoreValue = "";
        this.searchFilterSiftConservationScoreValue = "";
        this.searchFilterProteinAlignNumberValue = "";
        this.searchFilterTotalNumberSeqAlignedValue = "";
        this.searchFilterProveanScoreValue = "";

        this.searchFilterSiftScore = SearchFilterSiftScore.SIFT_SCORE_ABOVE;
        this.searchFilterSiftConservationScore = SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_ABOVE;
        this.searchFilterProteinAlignNumber = SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_ABOVE;
        this.searchFilterTotalNumberSeqAligned = SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_ABOVE;
        this.searchFilterProveanScore = SearchFilterProveanScore.PROVEAN_SCORE_ABOVE;

        this.searchSortField = SearchSortField.SORT_FIELD_POSITION_START;
        this.searchSortDirection = SearchSortDirection.SORT_DIRECTION_ASCENDING;
        
        this.searchUploadFileName = "";
        this.searchUploadFile = null;
    }

    // 6 Attributes (6/21)
    public DTOSearchSNPInsertionDeletion( 
        	int pageIndex,
            String searchLowRange,
            String searchHighRange,
            SearchReferenceBreed searchReferenceBreed,
            SearchAlternativeBreed searchAlternativeBreed,
            SearchChromosome searchChromosome ) {

    	this.pageIndex = pageIndex;
        this.searchLowRange = searchLowRange;
        this.searchHighRange = searchHighRange;
        this.searchReferenceBreed = searchReferenceBreed;
        this.searchAlternativeBreed = searchAlternativeBreed;
        this.searchChromosome = searchChromosome;

        this.searchGeneName = "";
        this.searchDownStream = "";
        this.searchUpStream = "";

        this.searchFilterSiftScoreValue = "";
        this.searchFilterSiftConservationScoreValue = "";
        this.searchFilterProteinAlignNumberValue = "";
        this.searchFilterTotalNumberSeqAlignedValue = "";
        this.searchFilterProveanScoreValue = "";

        this.searchFilterSiftScore = SearchFilterSiftScore.SIFT_SCORE_ABOVE;
        this.searchFilterSiftConservationScore = SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_ABOVE;
        this.searchFilterProteinAlignNumber = SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_ABOVE;
        this.searchFilterTotalNumberSeqAligned = SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_ABOVE;
        this.searchFilterProveanScore = SearchFilterProveanScore.PROVEAN_SCORE_ABOVE;

        this.searchSortField = SearchSortField.SORT_FIELD_POSITION_START;
        this.searchSortDirection = SearchSortDirection.SORT_DIRECTION_ASCENDING;
        
        this.searchUploadFileName = "";
        this.searchUploadFile = null;
    }

    // 6 Attributes (6/21) - Strings
    public DTOSearchSNPInsertionDeletion( 
        	int pageIndex,
            String searchLowRange,
            String searchHighRange,
            String searchReferenceBreed,
            String searchAlternativeBreed,
            String searchChromosome ) {

    	this.pageIndex = pageIndex;
        this.searchLowRange = searchLowRange;
        this.searchHighRange = searchHighRange;
        this.setSearchReferenceBreed( searchReferenceBreed ) ;
        this.setSearchAlternativeBreed( searchAlternativeBreed );
        this.setSearchChromosome( searchChromosome );

        this.searchGeneName = "";
        this.searchDownStream = "";
        this.searchUpStream = "";

        this.searchFilterSiftScoreValue = "";
        this.searchFilterSiftConservationScoreValue = "";
        this.searchFilterProteinAlignNumberValue = "";
        this.searchFilterTotalNumberSeqAlignedValue = "";
        this.searchFilterProveanScoreValue = "";

        this.searchFilterSiftScore = SearchFilterSiftScore.SIFT_SCORE_ABOVE;
        this.searchFilterSiftConservationScore = SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_ABOVE;
        this.searchFilterProteinAlignNumber = SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_ABOVE;
        this.searchFilterTotalNumberSeqAligned = SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_ABOVE;
        this.searchFilterProveanScore = SearchFilterProveanScore.PROVEAN_SCORE_ABOVE;

        this.searchSortField = SearchSortField.SORT_FIELD_POSITION_START;
        this.searchSortDirection = SearchSortDirection.SORT_DIRECTION_ASCENDING;

        this.searchUploadFileName = "";
        this.searchUploadFile = null;
    }

    // 5 Attributes (5/24)
    public DTOSearchSNPInsertionDeletion( 
            String searchLowRange,
            String searchHighRange,
            SearchReferenceBreed searchReferenceBreed,
            SearchAlternativeBreed searchAlternativeBreed,
            SearchChromosome searchChromosome ) {

        this.searchLowRange = searchLowRange;
        this.searchHighRange = searchHighRange;
        this.searchReferenceBreed = searchReferenceBreed;
        this.searchAlternativeBreed = searchAlternativeBreed;
        this.searchChromosome = searchChromosome;

    	this.pageIndex = 1;
    	
        this.searchGeneName = "";
        this.searchDownStream = "";
        this.searchUpStream = "";

        this.searchFilterSiftScoreValue = "";
        this.searchFilterSiftConservationScoreValue = "";
        this.searchFilterProteinAlignNumberValue = "";
        this.searchFilterTotalNumberSeqAlignedValue = "";
        this.searchFilterProveanScoreValue = "";

        this.searchFilterSiftScore = SearchFilterSiftScore.SIFT_SCORE_ABOVE;
        this.searchFilterSiftConservationScore = SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_ABOVE;
        this.searchFilterProteinAlignNumber = SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_ABOVE;
        this.searchFilterTotalNumberSeqAligned = SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_ABOVE;
        this.searchFilterProveanScore = SearchFilterProveanScore.PROVEAN_SCORE_ABOVE;

        this.searchSortField = SearchSortField.SORT_FIELD_POSITION_START;
        this.searchSortDirection = SearchSortDirection.SORT_DIRECTION_ASCENDING;
        
        this.searchUploadFileName = "";
        this.searchUploadFile = null;
    }

    // 5 Attributes (5/24) - Strings
    public DTOSearchSNPInsertionDeletion( 
            String searchLowRange,
            String searchHighRange,
            String searchReferenceBreed,
            String searchAlternativeBreed,
            String searchChromosome ) {

        this.searchLowRange = searchLowRange;
        this.searchHighRange = searchHighRange;
        this.setSearchReferenceBreed( searchReferenceBreed ) ;
        this.setSearchAlternativeBreed( searchAlternativeBreed );
        this.setSearchChromosome( searchChromosome );

    	this.pageIndex = 1;
    	
        this.searchGeneName = "";
        this.searchDownStream = "";
        this.searchUpStream = "";

        this.searchFilterSiftScoreValue = "";
        this.searchFilterSiftConservationScoreValue = "";
        this.searchFilterProteinAlignNumberValue = "";
        this.searchFilterTotalNumberSeqAlignedValue = "";
        this.searchFilterProveanScoreValue = "";

        this.searchFilterSiftScore = SearchFilterSiftScore.SIFT_SCORE_ABOVE;
        this.searchFilterSiftConservationScore = SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_ABOVE;
        this.searchFilterProteinAlignNumber = SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_ABOVE;
        this.searchFilterTotalNumberSeqAligned = SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_ABOVE;
        this.searchFilterProveanScore = SearchFilterProveanScore.PROVEAN_SCORE_ABOVE;

        this.searchSortField = SearchSortField.SORT_FIELD_POSITION_START;
        this.searchSortDirection = SearchSortDirection.SORT_DIRECTION_ASCENDING;
        
        this.searchUploadFileName = "";
        this.searchUploadFile = null;
    }
    
    // 1 Attributes (1/24)
    public DTOSearchSNPInsertionDeletion( 
    		String searchUploadFileName 
            ) {

        this.searchReferenceBreed = SearchReferenceBreed.BREED_NONE;
        this.searchAlternativeBreed = SearchAlternativeBreed.BREED_NONE;
        this.searchChromosome = SearchChromosome.CHROMOSOME_NONE;

    	this.pageIndex = 0;
    	
        this.searchGeneName = "";
        
        this.searchDownStream = "";
        this.searchUpStream = "";

        this.searchFilterSiftScoreValue = "";
        this.searchFilterSiftConservationScoreValue = "";
        this.searchFilterProteinAlignNumberValue = "";
        this.searchFilterTotalNumberSeqAlignedValue = "";
        this.searchFilterProveanScoreValue = "";

        this.searchFilterSiftScore = SearchFilterSiftScore.SIFT_SCORE_ABOVE;
        this.searchFilterSiftConservationScore = SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_ABOVE;
        this.searchFilterProteinAlignNumber = SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_ABOVE;
        this.searchFilterTotalNumberSeqAligned = SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_ABOVE;
        this.searchFilterProveanScore = SearchFilterProveanScore.PROVEAN_SCORE_ABOVE;

        this.searchSortField = SearchSortField.SORT_FIELD_POSITION_START;
        this.searchSortDirection = SearchSortDirection.SORT_DIRECTION_ASCENDING;

        this.searchUploadFileName = searchUploadFileName;
        this.searchUploadFile = null;
    }

    
    // GETTERS ------------------------------------------------------------------------------------
    public int getPageIndex() {
        return this.pageIndex;
    }
    public String getSearchGeneName() {
        return this.searchGeneName;
    }
    public String getSearchDownStream() {
        return this.searchDownStream;
    }
    public String getSearchUpStream() {
        return this.searchUpStream;
    }
    public String getSearchLowRange() {
        return this.searchLowRange;
    }
    public String getSearchHighRange() {
        return this.searchHighRange;
    }
    public SearchReferenceBreed getSearchReferenceBreed() {
        return this.searchReferenceBreed;
    }
    public SearchAlternativeBreed getSearchAlternativeBreed() {
        return this.searchAlternativeBreed;
    }
    public SearchChromosome getSearchChromosome() {
        return this.searchChromosome;
    }
    public String getSearchFilterSiftScoreValue() {
        return this.searchFilterSiftScoreValue;
    }
    public String getSearchFilterSiftConservationScoreValue() {
        return this.searchFilterSiftConservationScoreValue;
    }
    public String getSearchFilterProteinAlignNumberValue() {
        return this.searchFilterProteinAlignNumberValue;
    }
    public String getSearchFilterTotalNumberSeqAlignedValue() {
        return this.searchFilterTotalNumberSeqAlignedValue;
    }
    public String getSearchFilterProveanScoreValue() {
        return this.searchFilterProveanScoreValue;
    }
    public SearchFilterSiftScore getSearchFilterSiftScore() {
        return this.searchFilterSiftScore;
    }
    public SearchFilterSiftConservationScore getSearchFilterSiftConservationScore() {
        return this.searchFilterSiftConservationScore;
    }
    public SearchFilterProteinAlignNumber getSearchFilterProteinAlignNumber() {
        return this.searchFilterProteinAlignNumber;
    }
    public SearchFilterTotalNumberSeqAligned getSearchFilterTotalNumberSeqAligned() {
        return this.searchFilterTotalNumberSeqAligned;
    }
    public SearchFilterProveanScore getSearchFilterProveanScore() {
        return this.searchFilterProveanScore;
    }
    public SearchSortField getSearchSortField() {
        return this.searchSortField;
    }
    public SearchSortDirection getSearchSortDirection() {
        return this.searchSortDirection;
    }
    public String getSearchUploadFileName() {
    	return this.searchUploadFileName;
    }
    public MultipartFile getSearchUploadFile() {
    	return this.searchUploadFile;
    }

    
    // SETTERS ------------------------------------------------------------------------------------
    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }
    public void setSearchGeneName(String searchGeneName) {
        this.searchGeneName = searchGeneName;
    }
    public void setSearchDownStream(String searchDownStream) {
        this.searchDownStream = searchDownStream;
    }
    public void setSearchUpStream(String searchUpStream) {
        this.searchUpStream = searchUpStream;
    }
    public void setSearchLowRange(String searchLowRange) {
        this.searchLowRange = searchLowRange;
    }
    public void setSearchHighRange(String searchHighRange) {
        this.searchHighRange = searchHighRange;
    }
    public void setSearchReferenceBreed(SearchReferenceBreed searchReferenceBreed) {
        this.searchReferenceBreed = searchReferenceBreed;
    }
    public void setSearchAlternativeBreed(SearchAlternativeBreed searchAlternativeBreed) {
        this.searchAlternativeBreed = searchAlternativeBreed;
    }
    public void setSearchChromosome(SearchChromosome searchChromosome) {
        this.searchChromosome = searchChromosome;
    }
    public void setSearchFilterSiftScoreValue(String searchFilterSiftScoreValue) {
        this.searchFilterSiftScoreValue = searchFilterSiftScoreValue;
    }
    public void setSearchFilterSiftConservationScoreValue(String searchFilterSiftConservationScoreValue) {
        this.searchFilterSiftConservationScoreValue = searchFilterSiftConservationScoreValue;
    }
    public void setSearchFilterProteinAlignNumberValue(String searchFilterProteinAlignNumberValue) {
        this.searchFilterProteinAlignNumberValue = searchFilterProteinAlignNumberValue;
    }
    public void setSearchFilterTotalNumberSeqAlignedValue(String searchFilterTotalNumberSeqAlignedValue) {
        this.searchFilterTotalNumberSeqAlignedValue = searchFilterTotalNumberSeqAlignedValue;
    }
    public void setSearchFilterProveanScoreValue(String searchFilterProveanScoreValue) {
        this.searchFilterProveanScoreValue = searchFilterProveanScoreValue;
    }
    public void setSearchFilterSiftScore(SearchFilterSiftScore searchFilterSiftScore) {
        this.searchFilterSiftScore = searchFilterSiftScore;
    }
    public void setSearchFilterSiftConservationScore(SearchFilterSiftConservationScore searchFilterSiftConservationScore) {
        this.searchFilterSiftConservationScore = searchFilterSiftConservationScore;
    }
    public void setSearchFilterProteinAlignNumber(SearchFilterProteinAlignNumber searchFilterProteinAlignNumber) {
        this.searchFilterProteinAlignNumber = searchFilterProteinAlignNumber;
    }
    public void setSearchFilterTotalNumberSeqAligned(SearchFilterTotalNumberSeqAligned searchFilterTotalNumberSeqAligned) {
        this.searchFilterTotalNumberSeqAligned = searchFilterTotalNumberSeqAligned;
    }
    public void setSearchFilterProveanScore(SearchFilterProveanScore searchFilterProveanScore) {
        this.searchFilterProveanScore = searchFilterProveanScore;
    }
    public void setSearchSortField(SearchSortField searchSortField) {
        this.searchSortField = searchSortField;
    }
    public void setSearchSortDirection(SearchSortDirection searchSortDirection) {
        this.searchSortDirection = searchSortDirection;
    }
    public void setSearchUploadFileName(String searchUploadFileName) {
        this.searchUploadFileName = searchUploadFileName;
    }
    public void setSearchUploadFile(MultipartFile searchUploadFile) {
        this.searchUploadFile = searchUploadFile;
    }

    
    // GETTERS as Other Types ---------------------------------------------------------------------
    public String getSearchReferenceBreedAsString() {

        String rtnString = "";
        
    	if ( this.searchReferenceBreed.equals(SearchReferenceBreed.BREED_NONE)) {
            rtnString = ONLY_BREED_NONE;
    	}
    	if ( this.searchReferenceBreed.equals(SearchReferenceBreed.BREED_I)) {
            rtnString = ONLY_BREED_I;
    	}
    	if ( this.searchReferenceBreed.equals(SearchReferenceBreed.BREED_J)) {
            rtnString = ONLY_BREED_J;
    	}
    	if ( this.searchReferenceBreed.equals(SearchReferenceBreed.BREED_W)) {
            rtnString = ONLY_BREED_W;
    	}
    	if ( this.searchReferenceBreed.equals(SearchReferenceBreed.BREED_N)) {
            rtnString = ONLY_BREED_N;
    	}
    	if ( this.searchReferenceBreed.equals(SearchReferenceBreed.BREED_L)) {
            rtnString = ONLY_BREED_L;
    	}
    	if ( this.searchReferenceBreed.equals(SearchReferenceBreed.BREED_Z)) {
            rtnString = ONLY_BREED_Z;
    	}
    	
    	return rtnString;
    }
    
    public String getSearchAlternativeBreedAsString() {

        String rtnString = "";
        
    	if ( this.searchAlternativeBreed.equals(SearchAlternativeBreed.BREED_NONE)) {
            rtnString = ONLY_BREED_NONE;
    	}
    	if ( this.searchAlternativeBreed.equals(SearchAlternativeBreed.BREED_I)) {
            rtnString = ONLY_BREED_I;
    	}
    	if ( this.searchAlternativeBreed.equals(SearchAlternativeBreed.BREED_J)) {
            rtnString = ONLY_BREED_J;
    	}
    	if ( this.searchAlternativeBreed.equals(SearchAlternativeBreed.BREED_W)) {
            rtnString = ONLY_BREED_W;
    	}
    	if ( this.searchAlternativeBreed.equals(SearchAlternativeBreed.BREED_N)) {
            rtnString = ONLY_BREED_N;
    	}
    	if ( this.searchAlternativeBreed.equals(SearchAlternativeBreed.BREED_L)) {
            rtnString = ONLY_BREED_L;
    	}
    	if ( this.searchAlternativeBreed.equals(SearchAlternativeBreed.BREED_Z)) {
            rtnString = ONLY_BREED_Z;
    	}
    	
    	return rtnString;
    }
    
    public String getSearchChromosomeAsString() {
        
        String rtnString = "";
        
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_NONE) ) {
            rtnString = ONLY_NONE;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_1) ) {
            rtnString = ONLY_1;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_2) ) {
            rtnString = ONLY_2;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_3) ) {
            rtnString = ONLY_3;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_4) ) {
            rtnString = ONLY_4;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_5) ) {
            rtnString = ONLY_5;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_6) ) {
            rtnString = ONLY_6;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_7) ) {
            rtnString = ONLY_7;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_8) ) {
            rtnString = ONLY_8;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_9) ) {
            rtnString = ONLY_9;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_10) ) {
            rtnString = ONLY_10;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_11) ) {
            rtnString = ONLY_11;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_11) ) {
            rtnString = ONLY_11;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_12) ) {
            rtnString = ONLY_12;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_13) ) {
            rtnString = ONLY_13;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_14) ) {
            rtnString = ONLY_14;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_15) ) {
            rtnString = ONLY_15;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_16) ) {
            rtnString = ONLY_16;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_17) ) {
            rtnString = ONLY_17;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_18) ) {
            rtnString = ONLY_18;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_19) ) {
            rtnString = ONLY_19;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_20) ) {
            rtnString = ONLY_20;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_21) ) {
            rtnString = ONLY_21;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_22) ) {
            rtnString = ONLY_22;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_23) ) {
            rtnString = ONLY_23;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_24) ) {
            rtnString = ONLY_24;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_25) ) {
            rtnString = ONLY_25;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_26) ) {
            rtnString = ONLY_26;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_27) ) {
            rtnString = ONLY_27;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_28) ) {
            rtnString = ONLY_28;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_32) ) {
            rtnString = ONLY_32;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_W) ) {
            rtnString = ONLY_W;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_Z) ) {
            rtnString = ONLY_Z;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_LGE22C19W28_E50C23) ) {
            rtnString = ONLY_LGE22C19W28_E50C23;
    	}
    	if ( this.searchChromosome.equals(SearchChromosome.CHROMOSOME_LGE64) ) {
            rtnString = ONLY_LGE64;
    	}
    	
    	return rtnString;
    }
    
    public String getSearchSortDirectionAsString() {
    	String strReturn = "";
    	if ( this.searchSortDirection.equals(SearchSortDirection.SORT_DIRECTION_NONE) ) {
    		strReturn = ONLY_SORT_DIRECTION_NONE;
        }
    	if ( this.searchSortDirection.equals(SearchSortDirection.SORT_DIRECTION_ASCENDING) ) {
    		strReturn = ONLY_SORT_DIRECTION_ASCENDING;
        }
        if ( this.searchSortDirection.equals(SearchSortDirection.SORT_DIRECTION_DESCENDING) ) {
        	strReturn = ONLY_SORT_DIRECTION_DESCENDING;
        }
        return strReturn;
    }
    
    public Sort.Direction getSearchSortDirectionAsSortDirection() {
    	Sort.Direction strReturn = Sort.Direction.ASC;
    	if ( this.searchSortDirection.equals(SearchSortDirection.SORT_DIRECTION_NONE) ) {
    		strReturn = Sort.Direction.ASC;
        }
    	if ( this.searchSortDirection.equals(SearchSortDirection.SORT_DIRECTION_ASCENDING) ) {
    		strReturn = Sort.Direction.ASC;
        }
        if ( this.searchSortDirection.equals(SearchSortDirection.SORT_DIRECTION_DESCENDING) ) {
        	strReturn = Sort.Direction.DESC;
        }
        return strReturn;
    }
    
    public String getSearchSortFieldAsString() {
    	String strReturn = "";
    	if ( this.searchSortField.equals(SearchSortField.SORT_FIELD_NONE) ) {
    		strReturn = ONLY_SORT_FIELD_NONE;
        }
    	if ( this.searchSortField.equals(SearchSortField.SORT_FIELD_POSITION_START) ) {
    		strReturn = ONLY_SORT_FIELD_POSITION_START;
        }
    	if ( this.searchSortField.equals(SearchSortField.SORT_FIELD_POSITION_END) ) {
    		strReturn = ONLY_SORT_FIELD_POSITION_END;
        }
        if ( this.searchSortField.equals(SearchSortField.SORT_FIELD_REFERENCE) ) {
        	strReturn = ONLY_SORT_FIELD_REFERENCE;
        }
    	if ( this.searchSortField.equals(SearchSortField.SORT_FIELD_ALTERNATIVE) ) {
    		strReturn = ONLY_SORT_FIELD_ALTERNATIVE;
        }
    	if ( this.searchSortField.equals(SearchSortField.SORT_FIELD_AMINO_ACID_SUBSITUTION) ) {
        	strReturn = ONLY_SORT_FIELD_AMINO_ACID_SUBSITUTION;
        }
    	if ( this.searchSortField.equals(SearchSortField.SORT_FIELD_PREDICTION_CATEGORY) ) {
    		strReturn = ONLY_SORT_FIELD_PREDICTION_CATEGORY;
        }
    	if ( this.searchSortField.equals(SearchSortField.SORT_FIELD_SIFT_SCORE) ) {
    		strReturn = ONLY_SORT_FIELD_SIFT_SCORE;
        }
        if ( this.searchSortField.equals(SearchSortField.SORT_FIELD_SIFT_SCORE_CONSERVATION) ) {
        	strReturn = ONLY_SORT_FIELD_SIFT_SCORE_CONSERVATION;
        }
    	if ( this.searchSortField.equals(SearchSortField.SORT_FIELD_PROTEIN_ALIGNMENT_NUMBER) ) {
    		strReturn = ONLY_SORT_FIELD_PROTEIN_ALIGNMENT_NUMBER;
        }
    	if ( this.searchSortField.equals(SearchSortField.SORT_FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER) ) {
    		strReturn = ONLY_SORT_FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER;
        }
        if ( this.searchSortField.equals(SearchSortField.SORT_FIELD_PROVEAN_SCORE) ) {
        	strReturn = ONLY_SORT_FIELD_PROVEAN_SCORE;
        }

        return strReturn;
    }
    
    public String getSearchFilterSiftScoreAsString() {
    	String strReturn = "";
    	if ( this.searchFilterSiftScore.equals(SearchFilterSiftScore.SIFT_SCORE_NONE) ) {
    		strReturn = ONLY_SIFT_SCORE_NONE;
        }
    	if ( this.searchFilterSiftScore.equals(SearchFilterSiftScore.SIFT_SCORE_ABOVE) ) {
    		strReturn = ONLY_SIFT_SCORE_ABOVE;
        }
        if ( this.searchFilterSiftScore.equals(SearchFilterSiftScore.SIFT_SCORE_BELOW) ) {
        	strReturn = ONLY_SIFT_SCORE_BELOW;
        }
        return strReturn;
    }
    
    public String getSearchFilterSiftConservationScoreAsString() {
    	String strReturn = "";
    	if ( this.searchFilterSiftConservationScore.equals(SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_NONE) ) {
    		strReturn = ONLY_SIFT_CONSERVATION_SCORE_NONE;
        }
    	if ( this.searchFilterSiftConservationScore.equals(SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_ABOVE) ) {
    		strReturn = ONLY_SIFT_CONSERVATION_SCORE_ABOVE;
        }
        if ( this.searchFilterSiftConservationScore.equals(SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_BELOW) ) {
        	strReturn = ONLY_SIFT_CONSERVATION_SCORE_BELOW;
        }
        return strReturn;
    }
    
    public String getSearchFilterProteinAlignNumberAsString() {
    	String strReturn = "";
    	if ( this.searchFilterProteinAlignNumber.equals(SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_NONE) ) {
    		strReturn = ONLY_PROTEIN_ALIGN_NUMBER_NONE;
        }
    	if ( this.searchFilterProteinAlignNumber.equals(SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_ABOVE) ) {
    		strReturn = ONLY_PROTEIN_ALIGN_NUMBER_ABOVE;
        }
        if ( this.searchFilterProteinAlignNumber.equals(SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_BELOW) ) {
        	strReturn = ONLY_PROTEIN_ALIGN_NUMBER_BELOW;
        }
        return strReturn;
    }
    
    public String getSearchFilterTotalNumberSeqAlignedAsString() {
    	String strReturn = "";
    	if ( this.searchFilterTotalNumberSeqAligned.equals(SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_NONE) ) {
    		strReturn = ONLY_TOTAL_NUMBER_SEQ_ALIGNED_NONE;
        }
    	if ( this.searchFilterTotalNumberSeqAligned.equals(SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_ABOVE) ) {
    		strReturn = ONLY_TOTAL_NUMBER_SEQ_ALIGNED_ABOVE;
        }
        if ( this.searchFilterTotalNumberSeqAligned.equals(SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_BELOW) ) {
        	strReturn = ONLY_TOTAL_NUMBER_SEQ_ALIGNED_BELOW;
        }
        return strReturn;
    }
    
    public String getSearchFilterProveanScoreAsString() {
    	String strReturn = "";
    	if ( this.searchFilterProveanScore.equals(SearchFilterProveanScore.PROVEAN_SCORE_NONE) ) {
    		strReturn = ONLY_PROVEAN_SCORE_NONE;
        }
    	if ( this.searchFilterProveanScore.equals(SearchFilterProveanScore.PROVEAN_SCORE_ABOVE) ) {
    		strReturn = ONLY_PROVEAN_SCORE_ABOVE;
        }
        if ( this.searchFilterProveanScore.equals(SearchFilterProveanScore.PROVEAN_SCORE_BELOW) ) {
        	strReturn = ONLY_PROVEAN_SCORE_BELOW;
        }
        return strReturn;
    }

    public int getSearchDownStreamAsInt(){
        return ObjectConverter.convert(this.searchDownStream, Integer.class);
    }
    
    public int getSearchUpStreamAsInt(){
        return ObjectConverter.convert(this.searchUpStream, Integer.class);
    }
    
    public int getSearchLowRangeAsInt(){
    	return ObjectConverter.convert( StringUtility.getIntegerStringFromFormatted( this.searchLowRange ), Integer.class);
    }
    
    public int getSearchHighRangeAsInt(){
    	return ObjectConverter.convert( StringUtility.getIntegerStringFromFormatted( this.searchHighRange ), Integer.class);
    }

    public double getSearchFilterSiftScoreValueAsDouble(){
    	if ( isSearchFilterSiftScoreValueANumber() ) {
        	return ObjectConverter.convert(this.searchFilterSiftScoreValue, Double.class);
    	}
    	else {
            return 0;
    	}
    }

    public double getSearchFilterSiftConservationScoreValueAsDouble(){
    	if ( isSearchFilterSiftConservationScoreValueANumber() ) {
        	return ObjectConverter.convert(this.searchFilterSiftConservationScoreValue, Double.class);
    	}
    	else {
            return 0;
    	}
    }

    public long getSearchFilterProteinAlignNumberValueAsLong(){
    	if ( isSearchFilterProteinAlignNumberValueANumber() ) {
            return ObjectConverter.convert(this.searchFilterProteinAlignNumberValue, Long.class);
    	}
    	else {
            return 0;
    	}
    }

    public long getSearchFilterTotalNumberSeqAlignedValueAsLong(){
    	if ( isSearchFilterTotalNumberSeqAlignedValueANumber() ) {
            return ObjectConverter.convert(this.searchFilterTotalNumberSeqAlignedValue, Long.class);
    	}
    	else {
            return 0;
    	}
    }

    public double getSearchFilterProveanScoreValueAsDouble(){
    	if ( isSearchFilterProveanScoreValueANumber() ) {
        	return ObjectConverter.convert(this.searchFilterProveanScoreValue, Double.class);
    	}
    	else {
            return 0;
    	}
    }

    
    // SETTERS from Other Types -------------------------------------------------------------------
    public void setSearchSortField(String searchSortField) {
    	if ( searchSortField.equals(SORT_FIELD_NONE)) {
            this.searchSortField = SearchSortField.SORT_FIELD_NONE;
    	}
    	if ( searchSortField.equals(SORT_FIELD_POSITION_START)) {
            this.searchSortField = SearchSortField.SORT_FIELD_POSITION_START;
    	}
    	if ( searchSortField.equals(SORT_FIELD_POSITION_END)) {
            this.searchSortField = SearchSortField.SORT_FIELD_POSITION_END;
    	}
    	if ( searchSortField.equals(SORT_FIELD_REFERENCE)) {
            this.searchSortField = SearchSortField.SORT_FIELD_REFERENCE;
    	}
    	if ( searchSortField.equals(SORT_FIELD_ALTERNATIVE)) {
            this.searchSortField = SearchSortField.SORT_FIELD_ALTERNATIVE;
    	}
    	if ( searchSortField.equals(SORT_FIELD_AMINO_ACID_SUBSITUTION)) {
            this.searchSortField = SearchSortField.SORT_FIELD_AMINO_ACID_SUBSITUTION;
    	}
    	if ( searchSortField.equals(SORT_FIELD_PREDICTION_CATEGORY)) {
            this.searchSortField = SearchSortField.SORT_FIELD_PREDICTION_CATEGORY;
    	}
    	if ( searchSortField.equals(SORT_FIELD_SIFT_SCORE)) {
            this.searchSortField = SearchSortField.SORT_FIELD_SIFT_SCORE;
    	}
    	if ( searchSortField.equals(SORT_FIELD_SIFT_SCORE_CONSERVATION)) {
            this.searchSortField = SearchSortField.SORT_FIELD_SIFT_SCORE_CONSERVATION;
    	}
    	if ( searchSortField.equals(SORT_FIELD_PROTEIN_ALIGNMENT_NUMBER)) {
            this.searchSortField = SearchSortField.SORT_FIELD_PROTEIN_ALIGNMENT_NUMBER;
    	}
    	if ( searchSortField.equals(SORT_FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER)) {
            this.searchSortField = SearchSortField.SORT_FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER;
    	}
    	if ( searchSortField.equals(SORT_FIELD_PROVEAN_SCORE)) {
            this.searchSortField = SearchSortField.SORT_FIELD_PROVEAN_SCORE;
    	}
    	if ( searchSortField.equals(ONLY_SORT_FIELD_NONE)) {
            this.searchSortField = SearchSortField.SORT_FIELD_POSITION_START;
    	}
    	if ( searchSortField.equals(ONLY_SORT_FIELD_POSITION_START)) {
            this.searchSortField = SearchSortField.SORT_FIELD_POSITION_START;
    	}
    	if ( searchSortField.equals(ONLY_SORT_FIELD_POSITION_END)) {
            this.searchSortField = SearchSortField.SORT_FIELD_POSITION_END;
    	}
    	if ( searchSortField.equals(ONLY_SORT_FIELD_REFERENCE)) {
            this.searchSortField = SearchSortField.SORT_FIELD_REFERENCE;
    	}
    	if ( searchSortField.equals(ONLY_SORT_FIELD_ALTERNATIVE)) {
            this.searchSortField = SearchSortField.SORT_FIELD_ALTERNATIVE;
    	}
    	if ( searchSortField.equals(ONLY_SORT_FIELD_AMINO_ACID_SUBSITUTION)) {
            this.searchSortField = SearchSortField.SORT_FIELD_AMINO_ACID_SUBSITUTION;
    	}
    	if ( searchSortField.equals(ONLY_SORT_FIELD_PREDICTION_CATEGORY)) {
            this.searchSortField = SearchSortField.SORT_FIELD_PREDICTION_CATEGORY;
    	}
    	if ( searchSortField.equals(ONLY_SORT_FIELD_SIFT_SCORE)) {
            this.searchSortField = SearchSortField.SORT_FIELD_SIFT_SCORE;
    	}
    	if ( searchSortField.equals(ONLY_SORT_FIELD_SIFT_SCORE_CONSERVATION)) {
            this.searchSortField = SearchSortField.SORT_FIELD_SIFT_SCORE_CONSERVATION;
    	}
    	if ( searchSortField.equals(ONLY_SORT_FIELD_PROTEIN_ALIGNMENT_NUMBER)) {
            this.searchSortField = SearchSortField.SORT_FIELD_PROTEIN_ALIGNMENT_NUMBER;
    	}
    	if ( searchSortField.equals(ONLY_SORT_FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER)) {
            this.searchSortField = SearchSortField.SORT_FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER;
    	}
    	if ( searchSortField.equals(ONLY_SORT_FIELD_PROVEAN_SCORE)) {
            this.searchSortField = SearchSortField.SORT_FIELD_PROVEAN_SCORE;
    	}
    }
    
    public void setSearchSortDirection(String searchSortDirection) {
    	if ( searchSortDirection.equals(SORT_DIRECTION_NONE)) {
            this.searchSortDirection = SearchSortDirection.SORT_DIRECTION_ASCENDING;
    	}
    	if ( searchSortDirection.equals(SORT_DIRECTION_ASCENDING)) {
            this.searchSortDirection = SearchSortDirection.SORT_DIRECTION_ASCENDING;
    	}
    	if ( searchSortDirection.equals(SORT_DIRECTION_DESCENDING)) {
            this.searchSortDirection = SearchSortDirection.SORT_DIRECTION_DESCENDING;
    	}
    	if ( searchSortDirection.equals(ONLY_SORT_DIRECTION_NONE)) {
            this.searchSortDirection = SearchSortDirection.SORT_DIRECTION_ASCENDING;
    	}
    	if ( searchSortDirection.equals(ONLY_SORT_DIRECTION_ASCENDING)) {
            this.searchSortDirection = SearchSortDirection.SORT_DIRECTION_ASCENDING;
    	}
    	if ( searchSortDirection.equals(ONLY_SORT_DIRECTION_DESCENDING)) {
            this.searchSortDirection = SearchSortDirection.SORT_DIRECTION_DESCENDING;
    	}
    }
    
    public void setSearchAlternativeBreed(String searchAlternativeBreed) {
    	if ( searchAlternativeBreed.equals(BREED_NONE)) {
            this.searchAlternativeBreed = SearchAlternativeBreed.BREED_NONE;
    	}
    	if ( searchAlternativeBreed.equals(BREED_I)) {
            this.searchAlternativeBreed = SearchAlternativeBreed.BREED_I;
    	}
    	if ( searchAlternativeBreed.equals(BREED_J)) {
            this.searchAlternativeBreed = SearchAlternativeBreed.BREED_J;
    	}
    	if ( searchAlternativeBreed.equals(BREED_W)) {
            this.searchAlternativeBreed = SearchAlternativeBreed.BREED_W;
    	}
    	if ( searchAlternativeBreed.equals(BREED_N)) {
            this.searchAlternativeBreed = SearchAlternativeBreed.BREED_N;
    	}
    	if ( searchAlternativeBreed.equals(BREED_L)) {
            this.searchAlternativeBreed = SearchAlternativeBreed.BREED_L;
    	}
    	if ( searchAlternativeBreed.equals(BREED_Z)) {
            this.searchAlternativeBreed = SearchAlternativeBreed.BREED_Z;
    	}
    	if ( searchAlternativeBreed.equals(ONLY_BREED_NONE)) {
            this.searchAlternativeBreed = SearchAlternativeBreed.BREED_NONE;
    	}
    	if ( searchAlternativeBreed.equals(ONLY_BREED_I)) {
            this.searchAlternativeBreed = SearchAlternativeBreed.BREED_I;
    	}
    	if ( searchAlternativeBreed.equals(ONLY_BREED_J)) {
            this.searchAlternativeBreed = SearchAlternativeBreed.BREED_J;
    	}
    	if ( searchAlternativeBreed.equals(ONLY_BREED_W)) {
            this.searchAlternativeBreed = SearchAlternativeBreed.BREED_W;
    	}
    	if ( searchAlternativeBreed.equals(ONLY_BREED_N)) {
            this.searchAlternativeBreed = SearchAlternativeBreed.BREED_N;
    	}
    	if ( searchAlternativeBreed.equals(ONLY_BREED_L)) {
            this.searchAlternativeBreed = SearchAlternativeBreed.BREED_L;
    	}
    	if ( searchAlternativeBreed.equals(ONLY_BREED_Z)) {
            this.searchAlternativeBreed = SearchAlternativeBreed.BREED_Z;
    	}
    }

    public void setSearchReferenceBreed(String searchReferenceBreed) {
    	if ( searchReferenceBreed.equals(BREED_NONE)) {
            this.searchReferenceBreed = SearchReferenceBreed.BREED_NONE;
    	}
    	if ( searchReferenceBreed.equals(BREED_I)) {
            this.searchReferenceBreed = SearchReferenceBreed.BREED_I;
    	}
    	if ( searchReferenceBreed.equals(BREED_J)) {
            this.searchReferenceBreed = SearchReferenceBreed.BREED_J;
    	}
    	if ( searchReferenceBreed.equals(BREED_W)) {
            this.searchReferenceBreed = SearchReferenceBreed.BREED_W;
    	}
    	if ( searchReferenceBreed.equals(BREED_N)) {
            this.searchReferenceBreed = SearchReferenceBreed.BREED_N;
    	}
    	if ( searchReferenceBreed.equals(BREED_L)) {
            this.searchReferenceBreed = SearchReferenceBreed.BREED_L;
    	}
    	if ( searchReferenceBreed.equals(BREED_Z)) {
            this.searchReferenceBreed = SearchReferenceBreed.BREED_Z;
    	}
    	if ( searchReferenceBreed.equals(ONLY_BREED_NONE)) {
            this.searchReferenceBreed = SearchReferenceBreed.BREED_NONE;
    	}
    	if ( searchReferenceBreed.equals(ONLY_BREED_I)) {
            this.searchReferenceBreed = SearchReferenceBreed.BREED_I;
    	}
    	if ( searchReferenceBreed.equals(ONLY_BREED_J)) {
            this.searchReferenceBreed = SearchReferenceBreed.BREED_J;
    	}
    	if ( searchReferenceBreed.equals(ONLY_BREED_W)) {
            this.searchReferenceBreed = SearchReferenceBreed.BREED_W;
    	}
    	if ( searchReferenceBreed.equals(ONLY_BREED_N)) {
            this.searchReferenceBreed = SearchReferenceBreed.BREED_N;
    	}
    	if ( searchReferenceBreed.equals(ONLY_BREED_L)) {
            this.searchReferenceBreed = SearchReferenceBreed.BREED_L;
    	}
    	if ( searchReferenceBreed.equals(ONLY_BREED_Z)) {
            this.searchReferenceBreed = SearchReferenceBreed.BREED_Z;
    	}
    }

    public void setSearchChromosome(String searchChromosome) {
    	if ( searchChromosome.equals(CHROMOSOME_NONE)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_NONE;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_1)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_1;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_2)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_2;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_3)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_3;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_4)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_4;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_5)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_5;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_6)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_6;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_7)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_7;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_8)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_8;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_9)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_9;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_10)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_10;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_11)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_11;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_11)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_11;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_12)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_12;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_13)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_13;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_14)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_14;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_15)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_15;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_16)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_16;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_17)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_17;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_18)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_18;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_19)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_19;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_20)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_20;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_21)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_21;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_22)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_22;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_23)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_23;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_24)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_24;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_25)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_25;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_26)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_26;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_27)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_27;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_28)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_28;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_32)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_32;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_W)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_W;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_Z)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_Z;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_LGE22C19W28_E50C23)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_LGE22C19W28_E50C23;
    	}
    	if ( searchChromosome.equals(CHROMOSOME_LGE64)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_LGE64;
    	}
    	if ( searchChromosome.equals(ONLY_NONE)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_NONE;
    	}
    	if ( searchChromosome.equals(ONLY_1)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_1;
    	}
    	if ( searchChromosome.equals(ONLY_2)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_2;
    	}
    	if ( searchChromosome.equals(ONLY_3)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_3;
    	}
    	if ( searchChromosome.equals(ONLY_4)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_4;
    	}
    	if ( searchChromosome.equals(ONLY_5)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_5;
    	}
    	if ( searchChromosome.equals(ONLY_6)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_6;
    	}
    	if ( searchChromosome.equals(ONLY_7)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_7;
    	}
    	if ( searchChromosome.equals(ONLY_8)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_8;
    	}
    	if ( searchChromosome.equals(ONLY_9)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_9;
    	}
    	if ( searchChromosome.equals(ONLY_10)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_10;
    	}
    	if ( searchChromosome.equals(ONLY_11)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_11;
    	}
    	if ( searchChromosome.equals(ONLY_11)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_11;
    	}
    	if ( searchChromosome.equals(ONLY_12)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_12;
    	}
    	if ( searchChromosome.equals(ONLY_13)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_13;
    	}
    	if ( searchChromosome.equals(ONLY_14)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_14;
    	}
    	if ( searchChromosome.equals(ONLY_15)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_15;
    	}
    	if ( searchChromosome.equals(ONLY_16)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_16;
    	}
    	if ( searchChromosome.equals(ONLY_17)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_17;
    	}
    	if ( searchChromosome.equals(ONLY_18)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_18;
    	}
    	if ( searchChromosome.equals(ONLY_19)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_19;
    	}
    	if ( searchChromosome.equals(ONLY_20)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_20;
    	}
    	if ( searchChromosome.equals(ONLY_21)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_21;
    	}
    	if ( searchChromosome.equals(ONLY_22)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_22;
    	}
    	if ( searchChromosome.equals(ONLY_23)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_23;
    	}
    	if ( searchChromosome.equals(ONLY_24)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_24;
    	}
    	if ( searchChromosome.equals(ONLY_25)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_25;
    	}
    	if ( searchChromosome.equals(ONLY_26)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_26;
    	}
    	if ( searchChromosome.equals(ONLY_27)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_27;
    	}
    	if ( searchChromosome.equals(ONLY_28)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_28;
    	}
    	if ( searchChromosome.equals(ONLY_32)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_32;
    	}
    	if ( searchChromosome.equals(ONLY_W)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_W;
    	}
    	if ( searchChromosome.equals(ONLY_Z)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_Z;
    	}
    	if ( searchChromosome.equals(ONLY_LGE22C19W28_E50C23)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_LGE22C19W28_E50C23;
    	}
    	if ( searchChromosome.equals(ONLY_LGE64)) {
            this.searchChromosome = SearchChromosome.CHROMOSOME_LGE64;
    	}
    }

    public void setSearchFilterSiftScore(String searchFilterSiftScore) {
    	if ( searchFilterSiftScore.equals(SIFT_SCORE_NONE)) {
            this.searchFilterSiftScore = SearchFilterSiftScore.SIFT_SCORE_ABOVE;
    	}
    	if ( searchFilterSiftScore.equals(SIFT_SCORE_ABOVE)) {
            this.searchFilterSiftScore = SearchFilterSiftScore.SIFT_SCORE_ABOVE;
    	}
    	if ( searchFilterSiftScore.equals(SIFT_SCORE_BELOW)) {
            this.searchFilterSiftScore = SearchFilterSiftScore.SIFT_SCORE_BELOW;
    	}
    	if ( searchFilterSiftScore.equals(ONLY_SIFT_SCORE_NONE)) {
            this.searchFilterSiftScore = SearchFilterSiftScore.SIFT_SCORE_ABOVE;
    	}
    	if ( searchFilterSiftScore.equals(ONLY_SIFT_SCORE_ABOVE)) {
            this.searchFilterSiftScore = SearchFilterSiftScore.SIFT_SCORE_ABOVE;
    	}
    	if ( searchFilterSiftScore.equals(ONLY_SIFT_SCORE_BELOW)) {
            this.searchFilterSiftScore = SearchFilterSiftScore.SIFT_SCORE_BELOW;
    	}
    }

    public void setSearchFilterSiftConservationScore(String searchFilterSiftConservationScore) {
    	if ( searchFilterSiftConservationScore.equals(SIFT_CONSERVATION_SCORE_NONE)) {
            this.searchFilterSiftConservationScore = SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_ABOVE;
    	}
    	if ( searchFilterSiftConservationScore.equals(SIFT_CONSERVATION_SCORE_ABOVE)) {
            this.searchFilterSiftConservationScore = SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_ABOVE;
    	}
    	if ( searchFilterSiftConservationScore.equals(SIFT_CONSERVATION_SCORE_BELOW)) {
            this.searchFilterSiftConservationScore = SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_BELOW;
    	}
    	if ( searchFilterSiftConservationScore.equals(ONLY_SIFT_CONSERVATION_SCORE_NONE)) {
            this.searchFilterSiftConservationScore = SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_ABOVE;
    	}
    	if ( searchFilterSiftConservationScore.equals(ONLY_SIFT_CONSERVATION_SCORE_ABOVE)) {
            this.searchFilterSiftConservationScore = SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_ABOVE;
    	}
    	if ( searchFilterSiftConservationScore.equals(ONLY_SIFT_CONSERVATION_SCORE_BELOW)) {
            this.searchFilterSiftConservationScore = SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_BELOW;
    	}
    }

    public void setSearchFilterProteinAlignNumber(String searchFilterProteinAlignNumber) {
    	if ( searchFilterProteinAlignNumber.equals(PROTEIN_ALIGN_NUMBER_NONE)) {
            this.searchFilterProteinAlignNumber = SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_ABOVE;
    	}
    	if ( searchFilterProteinAlignNumber.equals(PROTEIN_ALIGN_NUMBER_ABOVE)) {
            this.searchFilterProteinAlignNumber = SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_ABOVE;
    	}
    	if ( searchFilterProteinAlignNumber.equals(PROTEIN_ALIGN_NUMBER_BELOW)) {
            this.searchFilterProteinAlignNumber = SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_BELOW;
    	}
    	if ( searchFilterProteinAlignNumber.equals(ONLY_PROTEIN_ALIGN_NUMBER_NONE)) {
            this.searchFilterProteinAlignNumber = SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_ABOVE;
    	}
    	if ( searchFilterProteinAlignNumber.equals(ONLY_PROTEIN_ALIGN_NUMBER_ABOVE)) {
            this.searchFilterProteinAlignNumber = SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_ABOVE;
    	}
    	if ( searchFilterProteinAlignNumber.equals(ONLY_PROTEIN_ALIGN_NUMBER_BELOW)) {
            this.searchFilterProteinAlignNumber = SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_BELOW;
    	}
    }

    public void setSearchFilterTotalNumberSeqAligned(String searchFilterTotalNumberSeqAligned) {
    	if ( searchFilterTotalNumberSeqAligned.equals(TOTAL_NUMBER_SEQ_ALIGNED_NONE)) {
            this.searchFilterTotalNumberSeqAligned = SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_ABOVE;
    	}
    	if ( searchFilterTotalNumberSeqAligned.equals(TOTAL_NUMBER_SEQ_ALIGNED_ABOVE)) {
            this.searchFilterTotalNumberSeqAligned = SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_ABOVE;
    	}
    	if ( searchFilterTotalNumberSeqAligned.equals(TOTAL_NUMBER_SEQ_ALIGNED_BELOW)) {
            this.searchFilterTotalNumberSeqAligned = SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_BELOW;
    	}
    	if ( searchFilterTotalNumberSeqAligned.equals(ONLY_TOTAL_NUMBER_SEQ_ALIGNED_NONE)) {
            this.searchFilterTotalNumberSeqAligned = SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_ABOVE;
    	}
    	if ( searchFilterTotalNumberSeqAligned.equals(ONLY_TOTAL_NUMBER_SEQ_ALIGNED_ABOVE)) {
            this.searchFilterTotalNumberSeqAligned = SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_ABOVE;
    	}
    	if ( searchFilterTotalNumberSeqAligned.equals(ONLY_TOTAL_NUMBER_SEQ_ALIGNED_BELOW)) {
            this.searchFilterTotalNumberSeqAligned = SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_BELOW;
    	}
    }

    public void setSearchFilterProveanScore(String searchFilterProveanScore) {
    	if ( searchFilterProveanScore.equals(PROVEAN_SCORE_NONE)) {
            this.searchFilterProveanScore = SearchFilterProveanScore.PROVEAN_SCORE_ABOVE;
    	}
    	if ( searchFilterProveanScore.equals(PROVEAN_SCORE_ABOVE)) {
            this.searchFilterProveanScore = SearchFilterProveanScore.PROVEAN_SCORE_ABOVE;
    	}
    	if ( searchFilterProveanScore.equals(PROVEAN_SCORE_BELOW)) {
            this.searchFilterProveanScore = SearchFilterProveanScore.PROVEAN_SCORE_BELOW;
    	}
    	if ( searchFilterProveanScore.equals(ONLY_PROVEAN_SCORE_NONE)) {
            this.searchFilterProveanScore = SearchFilterProveanScore.PROVEAN_SCORE_ABOVE;
    	}
    	if ( searchFilterProveanScore.equals(ONLY_PROVEAN_SCORE_ABOVE)) {
            this.searchFilterProveanScore = SearchFilterProveanScore.PROVEAN_SCORE_ABOVE;
    	}
    	if ( searchFilterProveanScore.equals(ONLY_PROVEAN_SCORE_BELOW)) {
            this.searchFilterProveanScore = SearchFilterProveanScore.PROVEAN_SCORE_BELOW;
    	}
    }


    // HELPERS ------------------------------------------------------------------------------------
    public boolean isSearchGeneNameEmpty() {
    	if ( this.searchGeneName.equals("") ){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchDownStreamNumeric() {
    	if ( StringUtility.isItNumberFormat( this.searchDownStream ) ){
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchDownStreamEmpty() {
    	if ( this.searchDownStream.equals("") ){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchUpStreamNumeric() {
    	if ( StringUtility.isItNumberFormat( this.searchUpStream ) ){
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchUpStreamEmpty() {
    	if ( this.searchUpStream.equals("") ){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchLowRangeNumeric() {

    	if ( StringUtility.isItNumberFormat( this.searchLowRange ) ){
    	
    		return true;
    	}
    	else {
    		
    		return false;
    	}
    }

    public boolean isSearchLowRangeEmpty() {

    	if ( this.searchLowRange.equals("") ){
    	
    		return true;
    	}
    	else {
    		
    		return false;
    	}
    }
    
    public boolean isSearchHighRangeNumeric() {

    	if ( StringUtility.isItNumberFormat( this.searchHighRange ) ){
    	
    		return true;
    	}
    	else {
    		
    		return false;
    	}
    }

    public boolean isSearchHighRangeEmpty() {
    	if ( this.searchHighRange.equals("") ){
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchReferenceBreedNone() {
    	if ( this.searchReferenceBreed.name().equals(BREED_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchReferenceBreedI() {
    	if ( this.searchReferenceBreed.name().equals(BREED_I)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchReferenceBreedJ() {
    	if ( this.searchReferenceBreed.name().equals(BREED_J)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchReferenceBreedW() {
    	if ( this.searchReferenceBreed.name().equals(BREED_W)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchReferenceBreedN() {
    	if ( this.searchReferenceBreed.name().equals(BREED_N)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchReferenceBreedL() {
    	if ( this.searchReferenceBreed.name().equals(BREED_L)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchReferenceBreedZ() {
    	if ( this.searchReferenceBreed.name().equals(BREED_Z)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchAlternativeBreedNone() {
    	if ( this.searchAlternativeBreed.name().equals(BREED_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchAlternativeBreedI() {
    	if ( this.searchAlternativeBreed.name().equals(BREED_I)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchAlternativeBreedJ() {
    	if ( this.searchAlternativeBreed.name().equals(BREED_J)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchAlternativeBreedW() {
    	if ( this.searchAlternativeBreed.name().equals(BREED_W)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchAlternativeBreedN() {
    	if ( this.searchAlternativeBreed.name().equals(BREED_N)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchAlternativeBreedL() {
    	if ( this.searchAlternativeBreed.name().equals(BREED_L)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchAlternativeBreedZ() {
    	if ( this.searchAlternativeBreed.name().equals(BREED_Z)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchChromosomeNone() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome1() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_1)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome2() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_2)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome3() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_3)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome4() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_4)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome5() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_5)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome6() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_6)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome7() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_7)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome8() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_8)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome9() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_9)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome10() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_10)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome11() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_11)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome12() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_12)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome13() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_13)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome14() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_14)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome15() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_15)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome16() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_16)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome17() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_17)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome18() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_18)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome19() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_19)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome20() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_20)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome21() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_21)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome22() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_22)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome23() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_23)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome24() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_24)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome25() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_25)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome26() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_26)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome27() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_27)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome28() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_28)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosome32() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_32)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosomeLGE22C19W28_E50C23() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_LGE22C19W28_E50C23)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosomeLGE64() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_LGE64)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosomeW() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_W)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchChromosomeZ() {
    	if ( this.searchChromosome.name().equals(CHROMOSOME_Z)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterSiftScoreValueZero() {
        if ( this.searchFilterSiftScoreValue.equals("0") ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterSiftConservationScoreValueZero() {
    	if ( this.searchFilterSiftConservationScoreValue.equals("0") ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterProteinAlignNumberValueZero() {
    	if ( this.searchFilterProteinAlignNumberValue.equals("0") ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterTotalNumberSeqAlignedValueZero() {
    	if ( this.searchFilterTotalNumberSeqAlignedValue.equals("0") ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterProveanScoreValueZero() {
    	if ( this.searchFilterProveanScoreValue.equals("0") ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchFilterSiftScoreNone() {
    	if ( this.searchFilterSiftScore.name().equals(SIFT_SCORE_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterSiftScoreAbove() {
    	if ( this.searchFilterSiftScore.name().equals(SIFT_SCORE_ABOVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterSiftScoreBelow() {
    	if ( this.searchFilterSiftScore.name().equals(SIFT_SCORE_BELOW)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchFilterSiftConservationScoreNone() {
    	if ( this.searchFilterSiftConservationScore.name().equals(SIFT_CONSERVATION_SCORE_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterSiftConservationScoreAbove() {
    	if ( this.searchFilterSiftConservationScore.name().equals(SIFT_CONSERVATION_SCORE_ABOVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterSiftConservationScoreBelow() {
    	if ( this.searchFilterSiftConservationScore.name().equals(SIFT_CONSERVATION_SCORE_BELOW)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchFilterProteinAlignNumberNone() {
    	if ( this.searchFilterProteinAlignNumber.name().equals(PROTEIN_ALIGN_NUMBER_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterProteinAlignNumberAbove() {
    	if ( this.searchFilterProteinAlignNumber.name().equals(PROTEIN_ALIGN_NUMBER_ABOVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterProteinAlignNumberBelow() {
    	if ( this.searchFilterProteinAlignNumber.name().equals(PROTEIN_ALIGN_NUMBER_BELOW)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchFilterTotalNumberSeqAlignedNone() {
    	if ( this.searchFilterTotalNumberSeqAligned.name().equals(TOTAL_NUMBER_SEQ_ALIGNED_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterTotalNumberSeqAlignedAbove() {
    	if ( this.searchFilterTotalNumberSeqAligned.name().equals(TOTAL_NUMBER_SEQ_ALIGNED_ABOVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterTotalNumberSeqAlignedBelow() {
    	if ( this.searchFilterTotalNumberSeqAligned.name().equals(TOTAL_NUMBER_SEQ_ALIGNED_BELOW)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchFilterProveanScoreNone() {
    	if ( this.searchFilterProveanScore.name().equals(PROVEAN_SCORE_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterProveanScoreAbove() {
    	if ( this.searchFilterProveanScore.name().equals(PROVEAN_SCORE_ABOVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterProveanScoreBelow() {
    	if ( this.searchFilterProveanScore.name().equals(PROVEAN_SCORE_BELOW)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchFilterSiftScoreValueEmpty() {
        if ( this.searchFilterSiftScoreValue.equals("") ){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterSiftConservationScoreValueEmpty() {
        if ( this.searchFilterSiftConservationScoreValue.equals("") ){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterProteinAlignNumberValueEmpty() {
        if ( this.searchFilterProteinAlignNumberValue.equals("") ){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterTotalNumberSeqAlignedValueEmpty() {
        if ( this.searchFilterTotalNumberSeqAlignedValue.equals("") ){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterProveanScoreValueEmpty() {
        if ( this.searchFilterProveanScoreValue.equals("") ){
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchFilterSiftScoreValueANumber() {
    	if ( StringUtility.isItNumericWithLeadingSignAndDecimalPoint(this.searchFilterSiftScoreValue) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterSiftConservationScoreValueANumber() {
    	if ( StringUtility.isItNumericWithLeadingSignAndDecimalPoint(this.searchFilterSiftConservationScoreValue) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchFilterProteinAlignNumberValueANumber() {
    	if ( StringUtility.isItNumeric(this.searchFilterProteinAlignNumberValue) ) {
    		return true;
    	}
    	else {
    		
    		return false;
    	}
    }
    
    public boolean isSearchFilterTotalNumberSeqAlignedValueANumber() {
    	if ( StringUtility.isItNumeric(this.searchFilterTotalNumberSeqAlignedValue) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchFilterProveanScoreValueANumber() {
    	if ( StringUtility.isItNumericWithLeadingSignAndDecimalPoint(this.searchFilterProveanScoreValue) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchSortFieldNone() {
    	if ( this.searchSortField.name().equals(SORT_FIELD_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchSortFieldPositionStart() {
    	if ( this.searchSortField.name().equals(SORT_FIELD_POSITION_START)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchSortFieldPositionEnd() {
    	if ( this.searchSortField.name().equals(SORT_FIELD_POSITION_END)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchSortFieldReference() {
    	if ( this.searchSortField.name().equals(SORT_FIELD_REFERENCE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchSortFieldAlternative() {
    	if ( this.searchSortField.name().equals(SORT_FIELD_ALTERNATIVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchSortFieldAminoAcidSubs() {
    	if ( this.searchSortField.name().equals(SORT_FIELD_AMINO_ACID_SUBSITUTION)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchSortFieldPredictionCategory() {
    	if ( this.searchSortField.name().equals(SORT_FIELD_PREDICTION_CATEGORY)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchSortFieldScoreSift() {
    	if ( this.searchSortField.name().equals(SORT_FIELD_SIFT_SCORE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchSortFieldScoreConservation() {
    	if ( this.searchSortField.name().equals(SORT_FIELD_SIFT_SCORE_CONSERVATION)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchSortFieldProteinAlignNumber() {
    	if ( this.searchSortField.name().equals(SORT_FIELD_PROTEIN_ALIGNMENT_NUMBER)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchSortFieldTotalAlignSequenceNumber() {
    	if ( this.searchSortField.name().equals(SORT_FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchSortFieldScoreProvean() {
    	if ( this.searchSortField.name().equals(SORT_FIELD_PROVEAN_SCORE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchSortDirectionNone() {
    	if ( this.searchSortDirection.name().equals(SORT_DIRECTION_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchSortDirectionAsc() {
    	if ( this.searchSortDirection.name().equals(SORT_DIRECTION_ASCENDING)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isSearchSortDirectionDesc() {
    	if ( this.searchSortDirection.name().equals(SORT_DIRECTION_DESCENDING)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }


    // ROUTINES -----------------------------------------------------------------------------------
    public String isDTOSearchSNPInsertionDeletionValid(ServiceEnsemblGene serviceensemblgene) throws Exception {
        
        int intSearchLow = 0;
        int intSearchHigh = 0;
        int intSearchLowHighDiff = 0;

        int intSearchUp = 0;
        int intSearchDown = 0;
        
        String successMsg = "";
        
        //System.out.println("BEFORE this.toString() : " + this.toString());

    	if ( !this.isSearchFilterProteinAlignNumberValueEmpty() ) {
    		
    		if ( !this.isSearchFilterProteinAlignNumberValueANumber() ) {
    		
    			throw new ExceptionSNPInsertionDeletionSearchFilterProteinAlignNumberValueNotNumeric("ERROR: Search Filter Protein Alignment Number is NOT Numeric : " + this.getSearchFilterProteinAlignNumberValue() + " !!!");
    		}
    	}
    	
    	if ( !this.isSearchFilterProveanScoreValueEmpty() ) {
    	
    		if ( !this.isSearchFilterProveanScoreValueANumber() ) {
    		
    			throw new ExceptionSNPInsertionDeletionSearchFilterProveanScoreValueNotNumeric("ERROR: Search Filter PROVEAN Score is NOT Numeric : " + this.getSearchFilterProveanScoreValue() + " !!!");        		}
    	}
    	
    	if ( !this.isSearchFilterSiftConservationScoreValueEmpty() ) {
    	
    		if ( !this.isSearchFilterSiftConservationScoreValueANumber() ) {
    		
    			throw new ExceptionSNPInsertionDeletionSearchFilterSiftConservationScoreValueNotNumeric("ERROR: Search Filter SIFT Conservation Score is NOT Numeric : " + this.getSearchFilterSiftConservationScoreValue() + " !!!");
    		}
    	}
    	
    	if ( !this.isSearchFilterSiftScoreValueEmpty() ) {
    	
    		if ( !this.isSearchFilterSiftScoreValueANumber() ) {
    		
    			throw new ExceptionSNPInsertionDeletionSearchFilterSiftScoreValueNotNumeric("ERROR: Search Filter SIFT Score is NOT Numeric : " + this.getSearchFilterSiftScoreValue() + " !!!");
    		}
    	}
    	
    	if ( !this.isSearchFilterTotalNumberSeqAlignedValueEmpty() ) {
    	
    		if ( !this.isSearchFilterTotalNumberSeqAlignedValueANumber() ) {
    		
    			throw new ExceptionSNPInsertionDeletionSearchFilterTotalNumberSeqAlignedValueNotNumeric("ERROR: Search Filter Total Number of Sequences Aligned is NOT Numeric : " + this.getSearchFilterTotalNumberSeqAlignedValue() + " !!!");
    		}
    	}
    	
    	if ( this.isSearchGeneNameEmpty() ) {
    		
    		if ( this.isSearchLowRangeEmpty() ) {
    			
    			intSearchLow = 0;
    		}
    		else {
        		
    			if ( this.isSearchLowRangeNumeric() ) {
                
    				intSearchLow = this.getSearchLowRangeAsInt();
                }
                else {
                	
                	throw new ExceptionSNPInsertionDeletionLowCoordinateNotNumeric("ERROR: Search Low Co-ordinate is NOT Numeric : " + this.getSearchLowRange() + " !!!");
                }
    		}
    		
    		if ( this.isSearchHighRangeEmpty() ) {
    		
    			intSearchHigh = 0;
    		}
    		else {
                
    			if ( this.isSearchHighRangeNumeric() ) {
                
    				intSearchHigh = this.getSearchHighRangeAsInt();
                }
                else {
                    
                	throw new ExceptionSNPInsertionDeletionHighCoordinateNotNumeric("ERROR: Search High Co-ordinate is NOT Numeric : " + this.getSearchHighRange() + " !!!");
                }
    		}
    		
            if ( intSearchLow > intSearchHigh) {
            
            	throw new ExceptionSNPInsertionDeletionLowCoordinateGreaterThanHighCoordinate("ERROR: Search Low Co-ordinate (" + intSearchLow + ") is GREATER THAN Search High Co-ordinate (" + intSearchHigh + ") !!!");
            }
            
            intSearchLowHighDiff = intSearchHigh - intSearchLow;

            if ( intSearchLowHighDiff > ONE_HUNDRED_MILLION) {
            
            	throw new ExceptionSNPInsertionDeletionSearchRangeGreaterThanOneMillion("ERROR: Search Range (" + intSearchLowHighDiff + ") is GREATER THAN One Hundred Million Base Pairs !!!");
            }
            
            successMsg = "for the Query: Chr." + this.getSearchChromosomeAsString() + ", " + 
        	        NumberFormat.getNumberInstance(Locale.UK).format( this.getSearchLowRangeAsInt() ) + "-" + 
        	        NumberFormat.getNumberInstance(Locale.UK).format( this.getSearchHighRangeAsInt() ) + ", Ref." + 
            		this.getSearchReferenceBreedAsString() +" and Alt." + 
            		this.getSearchAlternativeBreedAsString();

    	}
    	else {
    		
    		if ( !this.isSearchChromosomeNone() ) {
    			
                throw new ExceptionSNPInsertionDeletionSelectedWithGeneName("ERROR: Search Chromosome Supplied AND Ensembl Gene Name Supplied !!!");
    		}
    		
    		if ( this.isSearchDownStreamEmpty() ) {
    		
    			this.setSearchDownStream("0");
    		}
    		else {
        		
    			if ( this.isSearchDownStreamNumeric()) {
        		
    				intSearchDown = this.getSearchDownStreamAsInt();
        		}
        		else {
                    
        			throw new ExceptionEnsemblGeneDownStreamNotNumeric("ERROR: Search Downstream Range is NOT Numeric : " + this.getSearchDownStream() + " !!!");
        		}
    		}
    		
    		if ( this.isSearchUpStreamEmpty() ) {
    		
    			this.setSearchUpStream("0");
    		}
    		else {
        		
    			if ( this.isSearchUpStreamNumeric()) {
        		
    				intSearchUp = this.getSearchUpStreamAsInt();
        		}
        		else {
                    
        			throw new ExceptionEnsemblGeneUpStreamNotNumeric("ERROR: Search Upstream Range is NOT Numeric : " + this.getSearchUpStream() + " !!!");
        		}
    		}
    		
            if ( intSearchUp > TEN_THOUSAND) {
            
            	throw new ExceptionEnsemblGeneUpStreamSearchRangeGreaterThanTenThousand("ERROR: Up Stream Search Range (" + intSearchUp + ") is GREATER THAN Ten Thousand Base Pairs !!!");
            }
            
            if ( intSearchDown > TEN_THOUSAND) {
             
            	throw new ExceptionEnsemblGeneDownStreamSearchRangeGreaterThanTenThousand("ERROR: Down Stream Search Range (" + intSearchDown + ") is GREATER THAN Ten Thousand Base Pairs !!!");
            }

            List<EnsemblGene> ensemblgenes = serviceensemblgene.findByGeneName(this.getSearchGeneName());

            if ( ensemblgenes.isEmpty() ) {
            
            	throw new ExceptionEnsemblGeneNotFound("ERROR: Requested Gene does NOT Exist !!!");
            }
            
            if ( ensemblgenes.size() > 1 ) {
            
            	throw new ExceptionEnsemblGeneMultiplesFound("ERROR: Multiple Genes Exist !!!");
            }
            
            EnsemblGene ensemblgene = ensemblgenes.get(0);
            
            this.setSearchChromosome(ensemblgene.getChromosomeId());
            
        	long searchLowRange = 0;
        	long searchHighRange = 0;
        	
            if ( ensemblgene.isStrandPositive() ) {
            	
            	searchLowRange = ensemblgene.getStart() - this.getSearchUpStreamAsInt();
            	searchHighRange = ensemblgene.getEnd() + this.getSearchDownStreamAsInt();

            	this.setSearchLowRange( StringUtility.getFormattedFromIntegerString( ObjectConverter.convert( searchLowRange, String.class ) ) );
            	this.setSearchHighRange( StringUtility.getFormattedFromIntegerString( ObjectConverter.convert( searchHighRange, String.class ) ) );

            	successMsg = "for the Query: Gene " + this.getSearchGeneName() + ", +" + 
            	        NumberFormat.getNumberInstance(Locale.UK).format(this.getSearchUpStreamAsInt()) +", -" + 
            			NumberFormat.getNumberInstance(Locale.UK).format(this.getSearchDownStreamAsInt()) + ", Ref." + 
            	        this.getSearchReferenceBreedAsString() +" and Alt." + 
            			this.getSearchAlternativeBreedAsString();
            }
            
            if ( ensemblgene.isStrandNegative() ) {
            
            	searchHighRange = ensemblgene.getStart() - this.getSearchUpStreamAsInt();
            	searchLowRange = ensemblgene.getEnd() + this.getSearchDownStreamAsInt();

            	this.setSearchLowRange( StringUtility.getFormattedFromIntegerString( ObjectConverter.convert( searchHighRange, String.class ) ) );
            	this.setSearchHighRange( StringUtility.getFormattedFromIntegerString( ObjectConverter.convert( searchLowRange, String.class ) ) );

            	successMsg = "for the Query: Gene " + this.getSearchGeneName() + ", +" + 
            	        NumberFormat.getNumberInstance(Locale.UK).format(this.getSearchDownStreamAsInt()) + ", -" + 
            			NumberFormat.getNumberInstance(Locale.UK).format(this.getSearchUpStreamAsInt()) + ", Ref." + 
            	        this.getSearchReferenceBreedAsString() +" and Alt." + 
            			this.getSearchAlternativeBreedAsString();
            }
            
            this.setSearchGeneName("");
            this.setSearchDownStream("");
            this.setSearchUpStream("");
            
            if ( searchHighRange < 0 ) {
            
            	throw new ExceptionEnsemblGeneSearchRangeLessThanZero("ERROR: Search Range (" + searchHighRange + ") is LESS THAN Zero !!!");
            }
            
            if ( searchLowRange < 0 ) {
            
            	throw new ExceptionEnsemblGeneSearchRangeLessThanZero("ERROR: Search Range (" + searchLowRange + ") is LESS THAN Zero !!!");
            }

    	}

        if ( this.isSearchReferenceBreedNone() ) {
            
        	throw new ExceptionSNPInsertionDeletionReferenceAlleleNotSupplied("ERROR: Reference Allele Not Supplied !!!");
        }
        
        if ( this.isSearchAlternativeBreedNone()  ) {
            
        	throw new ExceptionSNPInsertionDeletionAlternativeAlleleNotSupplied("ERROR: Alternative Allele Not Supplied !!!");
        }
        
        if ( this.getSearchReferenceBreed().name().equals(this.getSearchAlternativeBreed().name()) ) {
            
        	throw new ExceptionSNPInsertionDeletionReferenceAlleleEqualsAlternativeAllele("ERROR: Reference Allele EQUALS Alternative Allele !!!");
        }

        if ( this.isSearchChromosomeNone() ) {
        
        	throw new ExceptionSNPInsertionDeletionNotSelected("ERROR: Search Chromosome Not Supplied !!!");
        }

        //System.out.println("successMsg : " + successMsg);

        //System.out.println("AFTER this.toString() : " + this.toString());

        return successMsg;
    }
    
    
    public String toString() {
        return ToStringBuilder.reflectionToString(this, new CustomDateToStringStyle());
    }
}
