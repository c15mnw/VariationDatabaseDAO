package com.roslin.mwicks.spring.variation.dto.offline;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.springframework.data.domain.Sort;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import com.roslin.mwicks.spring.variation.dto.web.enums.SearchReference;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchRegion;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchAlternative;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchChromosome;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchEnsemblTranscript;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchFilterSiftScore;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchFilterSiftConservationScore;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchFilterProteinAlignNumber;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchFilterTotalNumberSeqAligned;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchPredictionCategory;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchSortDirection;
import com.roslin.mwicks.spring.variation.dto.web.enums.snpchromosome.SearchSortField;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchFilterProveanScore;

import com.roslin.mwicks.spring.variation.format.CustomDateToStringStyle;

import com.roslin.mwicks.spring.variation.model.ensemblgene.EnsemblGene;

import com.roslin.mwicks.spring.variation.serviceinterface.ensemblgene.ServiceEnsemblGene;

import com.roslin.mwicks.utility.ObjectConverter;
import com.roslin.mwicks.utility.StringUtility;

import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneDownStreamNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneDownStreamSearchRangeGreaterThanTenThousand;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneMultiplesFound;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneNotFound;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneSearchRangeLessThanZero;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneUpStreamNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneUpStreamSearchRangeGreaterThanTenThousand;

import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeAlternativeAlleleNotSupplied;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeHighCoordinateNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeHighCoordinateNotSupplied;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeLowCoordinateNotSupplied;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeLowCoordinateNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeNotSelected;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeReferenceAlleleNotSupplied;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeSearchFilterProteinAlignNumberValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeSearchFilterProveanScoreValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeSearchFilterSiftConservationScoreValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeSearchFilterSiftScoreValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeSearchFilterTotalNumberSeqAlignedValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeSearchRangeGreaterThanOneMillion;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeSelectedWithGeneName;


/**
 * A DTO class which is used as a form object in the search form.
 * @author Mike Wicks
 */
public class DTOSNPChromosomeRequest {

    // Constants ----------------------------------------------------------------------------------
	protected static final String SORT_FIELD_NONE = "SORT_FIELD_NONE";
	protected static final String SORT_FIELD_POSITION = "SORT_FIELD_POSITION";
	protected static final String SORT_FIELD_REFERENCE = "SORT_FIELD_REFERENCE";
	protected static final String SORT_FIELD_ALTERNATIVE = "SORT_FIELD_ALTERNATIVE";
	protected static final String SORT_FIELD_REGION = "SORT_FIELD_REGION";
	protected static final String SORT_FIELD_ENSEMBL_GENE = "SORT_FIELD_ENSEMBL_GENE";
	protected static final String SORT_FIELD_ENSEMBLE_TRANSCRIPT = "SORT_FIELD_ENSEMBLE_TRANSCRIPT";
	protected static final String SORT_FIELD_ENSEMBLE_ANNOTATION = "SORT_FIELD_ENSEMBLE_ANNOTATION";
	protected static final String SORT_FIELD_AMINO_ACID_SUBS = "SORT_FIELD_AMINO_ACID_SUBS";
	protected static final String SORT_FIELD_PREDICTION_CATEGORY = "SORT_FIELD_PREDICTION_CATEGORY";
	protected static final String SORT_FIELD_SCORE_SIFT = "SORT_FIELD_SCORE_SIFT";
	protected static final String SORT_FIELD_SCORE_CONSERV = "SORT_FIELD_SCORE_CONSERV";
	protected static final String SORT_FIELD_PROTEIN_ALIGN_NO = "SORT_FIELD_PROTEIN_ALIGN_NO";
	protected static final String SORT_FIELD_TOT_ALIGN_SEQ_NO = "SORT_FIELD_TOT_ALIGN_SEQ_NO";
	protected static final String SORT_FIELD_SCORE_PROVEAN = "SORT_FIELD_SCORE_PROVEAN";

	protected static final String SORT_DIRECTION_NONE = "SORT_DIRECTION_NONE";
	protected static final String SORT_DIRECTION_ASCENDING = "SORT_DIRECTION_ASCENDING";
	protected static final String SORT_DIRECTION_DESCENDING = "SORT_DIRECTION_DESCENDING";
			
	protected static final String ONLY_SORT_FIELD_NONE = "position";
	protected static final String ONLY_SORT_FIELD_POSITION = "position";
	protected static final String ONLY_SORT_FIELD_REFERENCE = "reference";
	protected static final String ONLY_SORT_FIELD_ALTERNATIVE = "alternative";
	protected static final String ONLY_SORT_FIELD_REGION = "region";
	protected static final String ONLY_SORT_FIELD_ENSEMBL_GENE = "ensemblGene";
	protected static final String ONLY_SORT_FIELD_ENSEMBLE_TRANSCRIPT = "ensemblTranscript";
	protected static final String ONLY_SORT_FIELD_ENSEMBLE_ANNOTATION = "ensemblAnnotation";
	protected static final String ONLY_SORT_FIELD_AMINO_ACID_SUBS = "aminoAcidSubs";
	protected static final String ONLY_SORT_FIELD_PREDICTION_CATEGORY = "predictionCategory";
	protected static final String ONLY_SORT_FIELD_SCORE_SIFT = "scoreSift";
	protected static final String ONLY_SORT_FIELD_SCORE_CONSERV = "scoreConservation";
	protected static final String ONLY_SORT_FIELD_PROTEIN_ALIGN_NO = "proteinAlignNumber";
	protected static final String ONLY_SORT_FIELD_TOT_ALIGN_SEQ_NO = "totalAlignSequenceNumber";
	protected static final String ONLY_SORT_FIELD_SCORE_PROVEAN = "scoreProvean";

	protected static final String ONLY_SORT_DIRECTION_NONE = "asc";
	protected static final String ONLY_SORT_DIRECTION_ASCENDING = "asc";
	protected static final String ONLY_SORT_DIRECTION_DESCENDING = "desc";

	protected static final String STRAIN_NONE = "STRAIN_NONE";
	protected static final String STRAIN_REFERENCE = "STRAIN_REFERENCE";
	protected static final String STRAIN_7 = "STRAIN_7";
	protected static final String STRAIN_P = "STRAIN_P";
	protected static final String STRAIN_W = "STRAIN_W";
	protected static final String STRAIN_N = "STRAIN_N";
	protected static final String STRAIN_15I = "STRAIN_15I";
	protected static final String STRAIN_ZERO = "STRAIN_ZERO";
	protected static final String STRAIN_6 = "STRAIN_6";
	protected static final String STRAIN_C = "STRAIN_C";
			
	protected static final String ONLY_STRAIN_NONE = "NONE";
	protected static final String ONLY_STRAIN_REFERENCE = "REFERENCE";
	protected static final String ONLY_STRAIN_7 = "7";
	protected static final String ONLY_STRAIN_P = "P";
	protected static final String ONLY_STRAIN_W = "W";
	protected static final String ONLY_STRAIN_N = "N";
	protected static final String ONLY_STRAIN_15I = "15I";
	protected static final String ONLY_STRAIN_ZERO = "ZERO";
	protected static final String ONLY_STRAIN_6 = "6";
	protected static final String ONLY_STRAIN_C = "C";
			
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

    protected static final int ONE_MILLION = 1000000;
    protected static final int TEN_THOUSAND = 10000;


    // Properties ---------------------------------------------------------------------------------
    private String searchGeneName;

    private String searchDownStream;
    private String searchUpStream;

    private String searchLowRange;
    private String searchHighRange;

    private SearchReference searchReference;
    private SearchAlternative searchAlternative;
    
    private SearchChromosome searchChromosome;

   
    // Constructor --------------------------------------------------------------------------------
    // 0 Attributes (NONE)
    public DTOSNPChromosomeRequest() {

        this.searchGeneName = "";
        this.searchDownStream = "";
        this.searchUpStream = "";
        this.searchLowRange = "";
        this.searchHighRange = "";
        this.searchReference = SearchReference.STRAIN_NONE;
        this.searchAlternative = SearchAlternative.STRAIN_NONE;
        this.searchChromosome = SearchChromosome.CHROMOSOME_NONE;
    }
   
    // ALL Attributes (8)
    public DTOSNPChromosomeRequest( 
            String searchGeneName,
            String searchDownStream,
            String searchUpStream,
            String searchLowRange,
            String searchHighRange,
            SearchReference searchReference,
            SearchAlternative searchAlternative,
            SearchChromosome searchChromosome ) {

    	this( searchLowRange,
    			searchHighRange,
    			searchReference,
    			searchAlternative,
    			searchChromosome);

        this.searchGeneName = searchGeneName;
        this.searchDownStream = searchDownStream;
        this.searchUpStream = searchUpStream;
    }

    // ALL Attributes (8) - Strings
    public DTOSNPChromosomeRequest( 
            String searchGeneName,
            String searchDownStream,
            String searchUpStream,
            String searchLowRange,
            String searchHighRange,
            String searchReference,
            String searchAlternative,
            String searchChromosome ) {

    	this( searchLowRange,
    			searchHighRange,
    			searchReference,
    			searchAlternative,
    			searchChromosome);

        this.searchGeneName = searchGeneName;
        this.searchDownStream = searchDownStream;
        this.searchUpStream = searchUpStream;
    }

    // 5 Attributes (5/9)
    public DTOSNPChromosomeRequest( 
            String searchLowRange,
            String searchHighRange,
            SearchReference searchReference,
            SearchAlternative searchAlternative,
            SearchChromosome searchChromosome ) {

        this.searchLowRange = searchLowRange;
        this.searchHighRange = searchHighRange;
        this.searchReference = searchReference;
        this.searchAlternative = searchAlternative;
        this.searchChromosome = searchChromosome;

        this.searchGeneName = "";
        this.searchDownStream = "";
        this.searchUpStream = "";
    }

    // 5 Attributes (5/9) - Strings
    public DTOSNPChromosomeRequest( 
            String searchLowRange,
            String searchHighRange,
            String searchReference,
            String searchAlternative,
            String searchChromosome ) {

        this.searchLowRange = searchLowRange;
        this.searchHighRange = searchHighRange;
        this.setSearchReference( searchReference ) ;
        this.setSearchAlternative( searchAlternative );
        this.setSearchChromosome( searchChromosome );

        this.searchGeneName = "";
        this.searchDownStream = "";
        this.searchUpStream = "";
    }

    // Getters ------------------------------------------------------------------------------------
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
    public SearchReference getSearchReference() {
        return this.searchReference;
    }
    public String getSearchReferenceAsString() {

        String rtnString = "";
        
    	if ( this.searchReference.equals(SearchReference.STRAIN_NONE)) {
            rtnString = ONLY_STRAIN_NONE;
    	}
    	if ( this.searchReference.equals(SearchReference.STRAIN_REFERENCE)) {
            rtnString = ONLY_STRAIN_REFERENCE;
    	}
    	if ( this.searchReference.equals(SearchReference.STRAIN_7)) {
            rtnString = ONLY_STRAIN_7;
    	}
    	if ( this.searchReference.equals(SearchReference.STRAIN_P)) {
            rtnString = ONLY_STRAIN_P;
    	}
    	if ( this.searchReference.equals(SearchReference.STRAIN_W)) {
            rtnString = ONLY_STRAIN_W;
    	}
    	if ( this.searchReference.equals(SearchReference.STRAIN_N)) {
            rtnString = ONLY_STRAIN_N;
    	}
    	if ( this.searchReference.equals(SearchReference.STRAIN_15I)) {
            rtnString = ONLY_STRAIN_15I;
    	}
    	if ( this.searchReference.equals(SearchReference.STRAIN_ZERO)) {
            rtnString = ONLY_STRAIN_ZERO;
    	}
    	if ( this.searchReference.equals(SearchReference.STRAIN_6)) {
            rtnString = ONLY_STRAIN_6;
    	}
    	if ( this.searchReference.equals(SearchReference.STRAIN_C)) {
            rtnString = ONLY_STRAIN_C;
    	}
    	
    	return rtnString;
    }
    public SearchAlternative getSearchAlternative() {
        return this.searchAlternative;
    }
    public String getSearchAlternativeAsString() {

        String rtnString = "";
        
    	if ( this.searchAlternative.equals(SearchAlternative.STRAIN_NONE)) {
            rtnString = ONLY_STRAIN_NONE;
    	}
    	if ( this.searchAlternative.equals(SearchAlternative.STRAIN_7)) {
            rtnString = ONLY_STRAIN_7;
    	}
    	if ( this.searchAlternative.equals(SearchAlternative.STRAIN_P)) {
            rtnString = ONLY_STRAIN_P;
    	}
    	if ( this.searchAlternative.equals(SearchAlternative.STRAIN_W)) {
            rtnString = ONLY_STRAIN_W;
    	}
    	if ( this.searchAlternative.equals(SearchAlternative.STRAIN_N)) {
            rtnString = ONLY_STRAIN_N;
    	}
    	if ( this.searchAlternative.equals(SearchAlternative.STRAIN_15I)) {
            rtnString = ONLY_STRAIN_15I;
    	}
    	if ( this.searchAlternative.equals(SearchAlternative.STRAIN_ZERO)) {
            rtnString = ONLY_STRAIN_ZERO;
    	}
    	if ( this.searchAlternative.equals(SearchAlternative.STRAIN_6)) {
            rtnString = ONLY_STRAIN_6;
    	}
    	if ( this.searchAlternative.equals(SearchAlternative.STRAIN_C)) {
            rtnString = ONLY_STRAIN_C;
    	}
    	
    	return rtnString;
    }
    public SearchChromosome getSearchChromosome() {
        return this.searchChromosome;
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
    // Setters ------------------------------------------------------------------------------------
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
    public void setSearchReference(SearchReference searchReference) {
        this.searchReference = searchReference;
    }
    public void setSearchAlternative(SearchAlternative searchAlternative) {
        this.searchAlternative = searchAlternative;
    }
    public void setSearchChromosome(SearchChromosome searchChromosome) {
        this.searchChromosome = searchChromosome;
    }
    
    // helpers ------------------------------------------------------------------------------------

    public void setSearchReference(String searchReference) {
    	if ( searchReference.equals(STRAIN_NONE)) {
            this.searchReference = SearchReference.STRAIN_NONE;
    	}
    	if ( searchReference.equals(STRAIN_REFERENCE)) {
            this.searchReference = SearchReference.STRAIN_REFERENCE;
    	}
    	if ( searchReference.equals(STRAIN_7)) {
            this.searchReference = SearchReference.STRAIN_7;
    	}
    	if ( searchReference.equals(STRAIN_P)) {
            this.searchReference = SearchReference.STRAIN_P;
    	}
    	if ( searchReference.equals(STRAIN_W)) {
            this.searchReference = SearchReference.STRAIN_W;
    	}
    	if ( searchReference.equals(STRAIN_N)) {
            this.searchReference = SearchReference.STRAIN_N;
    	}
    	if ( searchReference.equals(STRAIN_15I)) {
            this.searchReference = SearchReference.STRAIN_15I;
    	}
    	if ( searchReference.equals(STRAIN_ZERO)) {
            this.searchReference = SearchReference.STRAIN_ZERO;
    	}
    	if ( searchReference.equals(STRAIN_6)) {
            this.searchReference = SearchReference.STRAIN_6;
    	}
    	if ( searchReference.equals(STRAIN_C)) {
            this.searchReference = SearchReference.STRAIN_C;
    	}
    	if ( searchReference.equals(ONLY_STRAIN_NONE)) {
            this.searchReference = SearchReference.STRAIN_NONE;
    	}
    	if ( searchReference.equals(ONLY_STRAIN_REFERENCE)) {
            this.searchReference = SearchReference.STRAIN_REFERENCE;
    	}
    	if ( searchReference.equals(ONLY_STRAIN_7)) {
            this.searchReference = SearchReference.STRAIN_7;
    	}
    	if ( searchReference.equals(ONLY_STRAIN_P)) {
            this.searchReference = SearchReference.STRAIN_P;
    	}
    	if ( searchReference.equals(ONLY_STRAIN_W)) {
            this.searchReference = SearchReference.STRAIN_W;
    	}
    	if ( searchReference.equals(ONLY_STRAIN_N)) {
            this.searchReference = SearchReference.STRAIN_N;
    	}
    	if ( searchReference.equals(ONLY_STRAIN_15I)) {
            this.searchReference = SearchReference.STRAIN_15I;
    	}
    	if ( searchReference.equals(ONLY_STRAIN_ZERO)) {
            this.searchReference = SearchReference.STRAIN_ZERO;
    	}
    	if ( searchReference.equals(ONLY_STRAIN_6)) {
            this.searchReference = SearchReference.STRAIN_6;
    	}
    	if ( searchReference.equals(ONLY_STRAIN_C)) {
            this.searchReference = SearchReference.STRAIN_C;
    	}
    }

    public void setSearchAlternative(String searchAlternative) {
    	if ( searchAlternative.equals(STRAIN_NONE)) {
            this.searchAlternative = SearchAlternative.STRAIN_NONE;
    	}
    	if ( searchAlternative.equals(STRAIN_7)) {
            this.searchAlternative = SearchAlternative.STRAIN_7;
    	}
    	if ( searchAlternative.equals(STRAIN_P)) {
            this.searchAlternative = SearchAlternative.STRAIN_P;
    	}
    	if ( searchAlternative.equals(STRAIN_W)) {
            this.searchAlternative = SearchAlternative.STRAIN_W;
    	}
    	if ( searchAlternative.equals(STRAIN_N)) {
            this.searchAlternative = SearchAlternative.STRAIN_N;
    	}
    	if ( searchAlternative.equals(STRAIN_15I)) {
            this.searchAlternative = SearchAlternative.STRAIN_15I;
    	}
    	if ( searchAlternative.equals(STRAIN_ZERO)) {
            this.searchAlternative = SearchAlternative.STRAIN_ZERO;
    	}
    	if ( searchAlternative.equals(STRAIN_6)) {
            this.searchAlternative = SearchAlternative.STRAIN_6;
    	}
    	if ( searchAlternative.equals(STRAIN_C)) {
            this.searchAlternative = SearchAlternative.STRAIN_C;
    	}
    	if ( searchAlternative.equals(ONLY_STRAIN_NONE)) {
            this.searchAlternative = SearchAlternative.STRAIN_NONE;
    	}
    	if ( searchAlternative.equals(ONLY_STRAIN_7)) {
            this.searchAlternative = SearchAlternative.STRAIN_7;
    	}
    	if ( searchAlternative.equals(ONLY_STRAIN_P)) {
            this.searchAlternative = SearchAlternative.STRAIN_P;
    	}
    	if ( searchAlternative.equals(ONLY_STRAIN_W)) {
            this.searchAlternative = SearchAlternative.STRAIN_W;
    	}
    	if ( searchAlternative.equals(ONLY_STRAIN_N)) {
            this.searchAlternative = SearchAlternative.STRAIN_N;
    	}
    	if ( searchAlternative.equals(ONLY_STRAIN_15I)) {
            this.searchAlternative = SearchAlternative.STRAIN_15I;
    	}
    	if ( searchAlternative.equals(ONLY_STRAIN_ZERO)) {
            this.searchAlternative = SearchAlternative.STRAIN_ZERO;
    	}
    	if ( searchAlternative.equals(ONLY_STRAIN_6)) {
            this.searchAlternative = SearchAlternative.STRAIN_6;
    	}
    	if ( searchAlternative.equals(ONLY_STRAIN_C)) {
            this.searchAlternative = SearchAlternative.STRAIN_C;
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
    

    public boolean isSearchGeneNameEmpty() {
    	if ( this.searchGeneName.equals("") ){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public int getSearchDownStreamAsInt(){
    	
        return ObjectConverter.convert( StringUtility.getIntegerStringFromFormatted( this.searchDownStream ), Integer.class);
    }
    public boolean isSearchDownStreamNumeric() {
    	
    	if ( StringUtility.isItNumberFormat(this.searchDownStream) ){
    	
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
    
    public int getSearchUpStreamAsInt(){

    	return ObjectConverter.convert( StringUtility.getIntegerStringFromFormatted( this.searchUpStream ), Integer.class);
    }
    public boolean isSearchUpStreamNumeric() {
    	
    	if ( StringUtility.isItNumberFormat(this.searchUpStream) ){
    	
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
    
    public int getSearchLowRangeAsInt(){

    	return ObjectConverter.convert( StringUtility.getIntegerStringFromFormatted( this.searchLowRange ), Integer.class);
    }
    public boolean isSearchLowRangeNumeric() {
    	
    	if ( StringUtility.isItNumberFormat(this.searchLowRange) ){
    		
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
    
    public int getSearchHighRangeAsInt(){

        return ObjectConverter.convert( StringUtility.getIntegerStringFromFormatted( this.searchHighRange ), Integer.class);
    }
    public boolean isSearchHighRangeNumeric() {
    	
    	if ( StringUtility.isItNumberFormat(this.searchHighRange) ){
    	
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

    public boolean isSearchReferenceNone() {
    	if ( this.searchReference.name().equals(STRAIN_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchReferenceReference() {
    	if ( this.searchReference.name().equals(STRAIN_REFERENCE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchReference7() {
    	if ( this.searchReference.name().equals(STRAIN_7)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchReferenceP() {
    	if ( this.searchReference.name().equals(STRAIN_P)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchReferenceW() {
    	if ( this.searchReference.name().equals(STRAIN_W)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchReferenceN() {
    	if ( this.searchReference.name().equals(STRAIN_N)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchReference15I() {
    	if ( this.searchReference.name().equals(STRAIN_15I)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchReferenceZero() {
    	if ( this.searchReference.name().equals(STRAIN_ZERO)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchReference6() {
    	if ( this.searchReference.name().equals(STRAIN_6)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchReferenceC() {
    	if ( this.searchReference.name().equals(STRAIN_C)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchAlternativeNone() {
    	if ( this.searchAlternative.name().equals(STRAIN_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchAlternative7() {
    	if ( this.searchAlternative.name().equals(STRAIN_7)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchAlternativeP() {
    	if ( this.searchAlternative.name().equals(STRAIN_P)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchAlternativeW() {
    	if ( this.searchAlternative.name().equals(STRAIN_W)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchAlternativeN() {
    	if ( this.searchAlternative.name().equals(STRAIN_N)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchAlternative15I() {
    	if ( this.searchAlternative.name().equals(STRAIN_15I)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchAlternativeZero() {
    	if ( this.searchAlternative.name().equals(STRAIN_ZERO)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchAlternative6() {
    	if ( this.searchAlternative.name().equals(STRAIN_6)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchAlternativeC() {
    	if ( this.searchAlternative.name().equals(STRAIN_C)) {
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
    

    
    public String isDTOSNPChromosomeRequestValid(ServiceEnsemblGene serviceensemblgene) throws Exception {
    
        int intSearchLow = 0;
        int intSearchHigh = 0;
        int intSearchLowHighDiff = 0;

        int intSearchUp = 0;
        int intSearchDown = 0;
        
        String successMsg = "";
        
        //System.out.println("BEFORE this.toString() : " + this.toString());
        
        if ( this.isSearchReferenceNone() ) {
        	
            throw new ExceptionSNPChromosomeReferenceAlleleNotSupplied("ERROR: Reference Allele Not Supplied !!!");
        }
        
        if ( this.isSearchAlternativeNone()  ) {
        	
            throw new ExceptionSNPChromosomeAlternativeAlleleNotSupplied("ERROR: Alternative Allele Not Supplied !!!");
        }
        
        if ( this.getSearchReference().name().equals(this.getSearchAlternative().name()) ) {
        	
            throw new ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele("ERROR: Reference Allele EQUALS Alternative Allele !!!");
        }

        if ( this.isSearchGeneNameEmpty() ) {
    		
    		if ( this.isSearchChromosomeNone() ) {

    			throw new ExceptionSNPChromosomeNotSelected("ERROR: Search Chromosome Not Supplied !!!");
    		}
    		
    		if ( this.isSearchLowRangeEmpty() ) {
            	
    			throw new ExceptionSNPChromosomeLowCoordinateNotSupplied("ERROR: Search Low Co-ordinate is NOT Supplied !!!");
    		}
    		else {
        		if ( this.isSearchLowRangeNumeric() ) {
                
        			intSearchLow = this.getSearchLowRangeAsInt();
                }
                else {
                	
                	throw new ExceptionSNPChromosomeLowCoordinateNotNumeric("ERROR: Search Low Co-ordinate is NOT Numeric : " + this.getSearchLowRange() + " !!!");
                }
    		}
    		
    		if ( this.isSearchHighRangeEmpty() ) {
    			
    			throw new ExceptionSNPChromosomeHighCoordinateNotSupplied("ERROR: Search High Co-ordinate is NOT Supplied !!!");
    		}
    		else {
                
    			if ( this.isSearchHighRangeNumeric() ) {
                
    				intSearchHigh = this.getSearchHighRangeAsInt();
                }
                else {
                    
                	throw new ExceptionSNPChromosomeHighCoordinateNotNumeric("ERROR: Search High Co-ordinate is NOT Numeric : " + this.getSearchHighRange() + " !!!");
                }
    		}
    		
            if ( intSearchLow > intSearchHigh) {
                
            	throw new ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate("ERROR: Search Low Co-ordinate (" + intSearchLow + ") is GREATER THAN Search High Co-ordinate (" + intSearchHigh + ") !!!");
            }
            
            intSearchLowHighDiff = intSearchHigh - intSearchLow;
            
            if ( intSearchLowHighDiff > ONE_MILLION) {
            	
                throw new ExceptionSNPChromosomeSearchRangeGreaterThanOneMillion("ERROR: Search Range (" + intSearchLowHighDiff + ") is GREATER THAN One Million Base Pairs !!!");
            }

            successMsg = "for the Query: Chr." + this.getSearchChromosomeAsString() + ", " + 
        	        NumberFormat.getNumberInstance(Locale.UK).format( this.getSearchLowRangeAsInt() ) + "-" + 
        	        NumberFormat.getNumberInstance(Locale.UK).format( this.getSearchHighRangeAsInt() ) + ", Ref." + 
                    this.getSearchReferenceAsString() +" and Alt." + 
            		this.getSearchAlternativeAsString();
    	}
    	else {
    		
    		if ( !this.isSearchChromosomeNone() ) {
    			
                throw new ExceptionSNPChromosomeSelectedWithGeneName("ERROR: Search Chromosome Supplied AND Ensembl Gene Name Supplied !!!");
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
            	        NumberFormat.getNumberInstance(Locale.UK).format(this.getSearchUpStreamAsInt()) + ", -" + 
            			NumberFormat.getNumberInstance(Locale.UK).format(this.getSearchDownStreamAsInt()) + ", Ref." + 
            	        this.getSearchReferenceAsString() +" and Alt." + 
            			this.getSearchAlternativeAsString();
            }
            
            if ( ensemblgene.isStrandNegative() ) {
            
            	searchHighRange = ensemblgene.getStart() - this.getSearchUpStreamAsInt();
            	searchLowRange = ensemblgene.getEnd() + this.getSearchDownStreamAsInt();

            	this.setSearchLowRange( StringUtility.getFormattedFromIntegerString( ObjectConverter.convert( searchHighRange, String.class ) ) );
            	this.setSearchHighRange( StringUtility.getFormattedFromIntegerString( ObjectConverter.convert( searchLowRange, String.class ) ) );

            	successMsg = "for the Query: Gene " + this.getSearchGeneName() + ", +" + 
            	        NumberFormat.getNumberInstance(Locale.UK).format(this.getSearchDownStreamAsInt()) + ", -" + 
            			NumberFormat.getNumberInstance(Locale.UK).format(this.getSearchUpStreamAsInt()) + ", Ref." + 
            	        this.getSearchReferenceAsString() +" and Alt." + 
            			this.getSearchAlternativeAsString();
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

        //System.out.println("successMsg : " + successMsg);

        //System.out.println("AFTER this.toString() : " + this.toString());

        return successMsg;
    }
    
    public String toString() {
        return ToStringBuilder.reflectionToString(this, new CustomDateToStringStyle());
    }
}
