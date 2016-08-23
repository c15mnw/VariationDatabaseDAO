package com.roslin.mwicks.spring.variation.dto.web.objects.snpinsertiondeletion;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.springframework.data.domain.Sort;

import com.roslin.mwicks.spring.variation.dto.web.enums.DownloadFormat;
import com.roslin.mwicks.spring.variation.dto.web.enums.DownloadHeaders;
import com.roslin.mwicks.spring.variation.dto.web.enums.DownloadQuotes;

import com.roslin.mwicks.spring.variation.dto.web.enums.SearchReferenceBreed;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchSortDirection;
import com.roslin.mwicks.spring.variation.dto.web.enums.snpinsertiondeletion.SearchSortField;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchAlternativeBreed;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchChromosome;

import com.roslin.mwicks.spring.variation.dto.web.enums.SearchFilterSiftScore;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchFilterSiftConservationScore;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchFilterProteinAlignNumber;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchFilterTotalNumberSeqAligned;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchFilterProveanScore;

import com.roslin.mwicks.spring.variation.format.CustomDateToStringStyle;

import com.roslin.mwicks.utility.ObjectConverter;

import com.roslin.mwicks.utility.StringUtility;


/**
 * A DTO class which is used as a form object in the download form.
 * @author Mike Wicks
 */
public class DTODownloadSNPInsertionDeletion {

    // Constants ----------------------------------------------------------------------------------
	protected static final String HEADERS_NONE = "HEADERS_NONE";
	protected static final String HEADERS_YES = "HEADERS_YES";
	protected static final String HEADERS_NO = "HEADERS_NO";

	protected static final String QUOTES_NONE = "QUOTES_NONE";
	protected static final String QUOTES_YES = "QUOTES_YES";
	protected static final String QUOTES_NO = "QUOTES_NO";

	protected static final String FORMAT_NONE = "FORMAT_NONE";
	protected static final String FORMAT_CSV = "FORMAT_CSV";
	protected static final String FORMAT_TSV = "FORMAT_TSV";
	protected static final String FORMAT_VCF = "FORMAT_VCF";

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

	protected static final String SIFT_CONSERVATION_SCORE_NONE = "SIFT_CONSERVATION_SCORE_NONE";
	protected static final String SIFT_CONSERVATION_SCORE_ABOVE = "SIFT_CONSERVATION_SCORE_ABOVE";
	protected static final String SIFT_CONSERVATION_SCORE_BELOW = "SIFT_CONSERVATION_SCORE_BELOW";

	protected static final String PROTEIN_ALIGN_NUMBER_NONE = "PROTEIN_ALIGN_NUMBER_NONE";
	protected static final String PROTEIN_ALIGN_NUMBER_ABOVE = "PROTEIN_ALIGN_NUMBER_ABOVE";
	protected static final String PROTEIN_ALIGN_NUMBER_BELOW = "PROTEIN_ALIGN_NUMBER_BELOW";

	protected static final String TOTAL_NUMBER_SEQ_ALIGNED_NONE = "TOTAL_NUMBER_SEQ_ALIGNED_NONE";
	protected static final String TOTAL_NUMBER_SEQ_ALIGNED_ABOVE = "TOTAL_NUMBER_SEQ_ALIGNED_ABOVE";
	protected static final String TOTAL_NUMBER_SEQ_ALIGNED_BELOW = "TOTAL_NUMBER_SEQ_ALIGNED_BELOW";

	protected static final String PROVEAN_SCORE_NONE = "PROVEAN_SCORE_NONE";
	protected static final String PROVEAN_SCORE_ABOVE = "PROVEAN_SCORE_ABOVE";
	protected static final String PROVEAN_SCORE_BELOW = "PROVEAN_SCORE_BELOW";

	
    // Properties ---------------------------------------------------------------------------------
	private String downloadLowRange;
    private String downloadHighRange;
    
    private String downloadDownStream;
    private String downloadUpStream;

    private SearchReferenceBreed downloadReferenceBreed;
    private SearchAlternativeBreed downloadAlternativeBreed;
    
    private DownloadFormat downloadFormat;
    private DownloadQuotes downloadQuotes;
    private DownloadHeaders downloadHeaders;

    private SearchChromosome downloadChromosome;
    
    private String downloadFilterSiftScoreValue;
    private String downloadFilterSiftConservationScoreValue;
    private String downloadFilterProteinAlignNumberValue;
    private String downloadFilterTotalNumberSeqAlignedValue;
    private String downloadFilterProveanScoreValue;

    private SearchFilterSiftScore downloadFilterSiftScore;
    private SearchFilterSiftConservationScore downloadFilterSiftConservationScore;
    private SearchFilterProteinAlignNumber downloadFilterProteinAlignNumber;
    private SearchFilterTotalNumberSeqAligned downloadFilterTotalNumberSeqAligned;
    private SearchFilterProveanScore downloadFilterProveanScore;

    private SearchSortField downloadSortField;
    private SearchSortDirection downloadSortDirection;

    // Constructor --------------------------------------------------------------------------------
    public DTODownloadSNPInsertionDeletion() {

        this.downloadDownStream = "";
        this.downloadUpStream = "";
        
        this.downloadLowRange = "";
        this.downloadHighRange = "";
        
        this.downloadReferenceBreed = SearchReferenceBreed.BREED_NONE;
        this.downloadAlternativeBreed = SearchAlternativeBreed.BREED_NONE;

        this.downloadFormat = DownloadFormat.FORMAT_CSV;
        this.downloadQuotes = DownloadQuotes.QUOTES_NO;
        this.downloadHeaders = DownloadHeaders.HEADERS_NO;

        this.downloadChromosome = SearchChromosome.CHROMOSOME_NONE;
        
        this.downloadFilterSiftScoreValue = "";
        this.downloadFilterSiftConservationScoreValue = "";
        this.downloadFilterProteinAlignNumberValue = "";
        this.downloadFilterTotalNumberSeqAlignedValue = "";
        this.downloadFilterProveanScoreValue = "";

        this.downloadFilterSiftScore = SearchFilterSiftScore.SIFT_SCORE_ABOVE;
        this.downloadFilterSiftConservationScore = SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_ABOVE;
        this.downloadFilterProteinAlignNumber = SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_ABOVE;
        this.downloadFilterTotalNumberSeqAligned = SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_ABOVE;
        this.downloadFilterProveanScore = SearchFilterProveanScore.PROVEAN_SCORE_ABOVE;

        this.downloadSortField = SearchSortField.SORT_FIELD_POSITION_START;
        this.downloadSortDirection = SearchSortDirection.SORT_DIRECTION_ASCENDING;
    }

    // Getters ------------------------------------------------------------------------------------
    public String getDownloadDownStream() {
        return this.downloadDownStream;
    }
    public String getDownloadUpStream() {
        return this.downloadUpStream;
    }
    public String getDownloadLowRange() {
        return this.downloadLowRange;
    }
    public String getDownloadHighRange() {
        return this.downloadHighRange;
    }
    public SearchReferenceBreed getDownloadReference() {
        return this.downloadReferenceBreed;
    }
    public String getDownloadReferenceAsString() {

        String rtnString = "";
        
    	if ( this.downloadReferenceBreed.equals(SearchReferenceBreed.BREED_NONE)) {
            rtnString = ONLY_BREED_NONE;
    	}
    	if ( this.downloadReferenceBreed.equals(SearchReferenceBreed.BREED_I)) {
            rtnString = ONLY_BREED_I;
    	}
    	if ( this.downloadReferenceBreed.equals(SearchReferenceBreed.BREED_J)) {
            rtnString = ONLY_BREED_J;
    	}
    	if ( this.downloadReferenceBreed.equals(SearchReferenceBreed.BREED_W)) {
            rtnString = ONLY_BREED_W;
    	}
    	if ( this.downloadReferenceBreed.equals(SearchReferenceBreed.BREED_N)) {
            rtnString = ONLY_BREED_N;
    	}
    	if ( this.downloadReferenceBreed.equals(SearchReferenceBreed.BREED_L)) {
            rtnString = ONLY_BREED_L;
    	}
    	if ( this.downloadReferenceBreed.equals(SearchReferenceBreed.BREED_Z)) {
            rtnString = ONLY_BREED_Z;
    	}
    	
    	return rtnString;
    }
    public SearchAlternativeBreed getDownloadAlternative() {
        return this.downloadAlternativeBreed;
    }
    public String getDownloadAlternativeAsString() {

        String rtnString = "";
        
    	if ( this.downloadAlternativeBreed.equals(SearchAlternativeBreed.BREED_NONE)) {
            rtnString = ONLY_BREED_NONE;
    	}
    	if ( this.downloadAlternativeBreed.equals(SearchAlternativeBreed.BREED_I)) {
            rtnString = ONLY_BREED_I;
    	}
    	if ( this.downloadAlternativeBreed.equals(SearchAlternativeBreed.BREED_J)) {
            rtnString = ONLY_BREED_J;
    	}
    	if ( this.downloadAlternativeBreed.equals(SearchAlternativeBreed.BREED_W)) {
            rtnString = ONLY_BREED_W;
    	}
    	if ( this.downloadAlternativeBreed.equals(SearchAlternativeBreed.BREED_N)) {
            rtnString = ONLY_BREED_N;
    	}
    	if ( this.downloadAlternativeBreed.equals(SearchAlternativeBreed.BREED_L)) {
            rtnString = ONLY_BREED_L;
    	}
    	if ( this.downloadAlternativeBreed.equals(SearchAlternativeBreed.BREED_Z)) {
            rtnString = ONLY_BREED_Z;
    	}
    	
    	return rtnString;
    }
    public DownloadFormat getDownloadFormat() {
        return this.downloadFormat;
    }
    public DownloadQuotes getDownloadQuotes() {
        return this.downloadQuotes;
    }
    public DownloadHeaders getDownloadHeaders() {
        return this.downloadHeaders;
    }
    public SearchChromosome getDownloadChromosome() {
        return this.downloadChromosome;
    }
    public String getDownloadChromosomeAsString() {
        
        String rtnString = "";
        
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_NONE) ) {
            rtnString = ONLY_NONE;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_1) ) {
            rtnString = ONLY_1;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_2) ) {
            rtnString = ONLY_2;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_3) ) {
            rtnString = ONLY_3;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_4) ) {
            rtnString = ONLY_4;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_5) ) {
            rtnString = ONLY_5;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_6) ) {
            rtnString = ONLY_6;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_7) ) {
            rtnString = ONLY_7;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_8) ) {
            rtnString = ONLY_8;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_9) ) {
            rtnString = ONLY_9;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_10) ) {
            rtnString = ONLY_10;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_11) ) {
            rtnString = ONLY_11;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_11) ) {
            rtnString = ONLY_11;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_12) ) {
            rtnString = ONLY_12;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_13) ) {
            rtnString = ONLY_13;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_14) ) {
            rtnString = ONLY_14;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_15) ) {
            rtnString = ONLY_15;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_16) ) {
            rtnString = ONLY_16;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_17) ) {
            rtnString = ONLY_17;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_18) ) {
            rtnString = ONLY_18;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_19) ) {
            rtnString = ONLY_19;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_20) ) {
            rtnString = ONLY_20;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_21) ) {
            rtnString = ONLY_21;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_22) ) {
            rtnString = ONLY_22;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_23) ) {
            rtnString = ONLY_23;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_24) ) {
            rtnString = ONLY_24;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_25) ) {
            rtnString = ONLY_25;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_26) ) {
            rtnString = ONLY_26;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_27) ) {
            rtnString = ONLY_27;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_28) ) {
            rtnString = ONLY_28;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_32) ) {
            rtnString = ONLY_32;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_W) ) {
            rtnString = ONLY_W;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_Z) ) {
            rtnString = ONLY_Z;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_LGE22C19W28_E50C23) ) {
            rtnString = ONLY_LGE22C19W28_E50C23;
    	}
    	if ( this.downloadChromosome.equals(SearchChromosome.CHROMOSOME_LGE64) ) {
            rtnString = ONLY_LGE64;
    	}
    	
    	return rtnString;
    }

    public String getDownloadFilterSiftScoreValue() {
        return this.downloadFilterSiftScoreValue;
    }
    public String getDownloadFilterSiftConservationScoreValue() {
        return this.downloadFilterSiftConservationScoreValue;
    }
    public String getDownloadFilterProteinAlignNumberValue() {
        return this.downloadFilterProteinAlignNumberValue;
    }
    public String getDownloadFilterTotalNumberSeqAlignedValue() {
        return this.downloadFilterTotalNumberSeqAlignedValue;
    }
    public String getDownloadFilterProveanScoreValue() {
        return this.downloadFilterProveanScoreValue;
    }
    public SearchFilterSiftScore getDownloadFilterSiftScore() {
        return this.downloadFilterSiftScore;
    }
    public SearchFilterSiftConservationScore getDownloadFilterSiftConservationScore() {
        return this.downloadFilterSiftConservationScore;
    }
    public SearchFilterProteinAlignNumber getDownloadFilterProteinAlignNumber() {
        return this.downloadFilterProteinAlignNumber;
    }
    public SearchFilterTotalNumberSeqAligned getDownloadFilterTotalNumberSeqAligned() {
        return this.downloadFilterTotalNumberSeqAligned;
    }
    public SearchFilterProveanScore getDownloadFilterProveanScore() {
        return this.downloadFilterProveanScore;
    }

    public SearchSortField getDownloadSortField() {
        return this.downloadSortField;
    }
    public SearchSortDirection getDownloadSortDirection() {
        return this.downloadSortDirection;
    }
    public String getDownloadSortDirectionAsString() {
    	String strReturn = "";
    	if ( this.downloadSortDirection.equals(SearchSortDirection.SORT_DIRECTION_NONE) ) {
    		strReturn = ONLY_SORT_DIRECTION_NONE;
        }
    	if ( this.downloadSortDirection.equals(SearchSortDirection.SORT_DIRECTION_ASCENDING) ) {
    		strReturn = ONLY_SORT_DIRECTION_ASCENDING;
        }
        if ( this.downloadSortDirection.equals(SearchSortDirection.SORT_DIRECTION_DESCENDING) ) {
        	strReturn = ONLY_SORT_DIRECTION_DESCENDING;
        }
        return strReturn;
    }
    public Sort.Direction getDownloadSortDirectionAsSortDirection() {
    	Sort.Direction strReturn = Sort.Direction.ASC;
    	if ( this.downloadSortDirection.equals(SearchSortDirection.SORT_DIRECTION_NONE) ) {
    		strReturn = Sort.Direction.ASC;
        }
    	if ( this.downloadSortDirection.equals(SearchSortDirection.SORT_DIRECTION_ASCENDING) ) {
    		strReturn = Sort.Direction.ASC;
        }
        if ( this.downloadSortDirection.equals(SearchSortDirection.SORT_DIRECTION_DESCENDING) ) {
        	strReturn = Sort.Direction.DESC;
        }
        return strReturn;
    }
    public String getDownloadSortFieldAsString() {
    	String strReturn = "";
    	if ( this.downloadSortField.equals(SearchSortField.SORT_FIELD_NONE) ) {
    		strReturn = ONLY_SORT_FIELD_NONE;
        }
    	if ( this.downloadSortField.equals(SearchSortField.SORT_FIELD_POSITION_START) ) {
    		strReturn = ONLY_SORT_FIELD_POSITION_START;
        }
    	if ( this.downloadSortField.equals(SearchSortField.SORT_FIELD_POSITION_END) ) {
    		strReturn = ONLY_SORT_FIELD_POSITION_END;
        }
        if ( this.downloadSortField.equals(SearchSortField.SORT_FIELD_REFERENCE) ) {
        	strReturn = ONLY_SORT_FIELD_REFERENCE;
        }
    	if ( this.downloadSortField.equals(SearchSortField.SORT_FIELD_ALTERNATIVE) ) {
    		strReturn = ONLY_SORT_FIELD_ALTERNATIVE;
        }
        if ( this.downloadSortField.equals(SearchSortField.SORT_FIELD_AMINO_ACID_SUBSITUTION) ) {
        	strReturn = ONLY_SORT_FIELD_AMINO_ACID_SUBSITUTION;
        }
    	if ( this.downloadSortField.equals(SearchSortField.SORT_FIELD_PREDICTION_CATEGORY) ) {
    		strReturn = ONLY_SORT_FIELD_PREDICTION_CATEGORY;
        }
    	if ( this.downloadSortField.equals(SearchSortField.SORT_FIELD_SIFT_SCORE) ) {
    		strReturn = ONLY_SORT_FIELD_SIFT_SCORE;
        }
        if ( this.downloadSortField.equals(SearchSortField.SORT_FIELD_SIFT_SCORE_CONSERVATION) ) {
        	strReturn = ONLY_SORT_FIELD_SIFT_SCORE_CONSERVATION;
        }
    	if ( this.downloadSortField.equals(SearchSortField.SORT_FIELD_PROTEIN_ALIGNMENT_NUMBER) ) {
    		strReturn = ONLY_SORT_FIELD_PROTEIN_ALIGNMENT_NUMBER;
        }
    	if ( this.downloadSortField.equals(SearchSortField.SORT_FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER) ) {
    		strReturn = ONLY_SORT_FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER;
        }
        if ( this.downloadSortField.equals(SearchSortField.SORT_FIELD_PROVEAN_SCORE) ) {
        	strReturn = ONLY_SORT_FIELD_PROVEAN_SCORE;
        }

        return strReturn;
    }

    // Setters ------------------------------------------------------------------------------------
    public void setDownloadDownStream(String downloadDownStream) {
    	this.downloadDownStream = downloadDownStream;
    }
    public void setDownloadUpStream(String downloadUpStream) {
    	this.downloadUpStream =  downloadUpStream;
    }
    public void setDownloadLowRange(String downloadLowRange) {
        this.downloadLowRange = downloadLowRange;
    }
    public void setDownloadHighRange(String downloadHighRange) {
        this.downloadHighRange = downloadHighRange;
    }
    public void setDownloadReference(SearchReferenceBreed downloadReferenceBreed) {
        this.downloadReferenceBreed = downloadReferenceBreed;
    }
    public void setDownloadAlternative(SearchAlternativeBreed downloadAlternativeBreed) {
        this.downloadAlternativeBreed = downloadAlternativeBreed;
    }
    public void setDownloadFormat(DownloadFormat downloadFormat) {
        this.downloadFormat = downloadFormat;
    }
    public void setDownloadQuotes(DownloadQuotes downloadQuotes) {
        this.downloadQuotes = downloadQuotes;
    }
    public void setDownloadHeaders(DownloadHeaders downloadHeaders) {
        this.downloadHeaders = downloadHeaders;
    }
    public void setDownloadChromosome(SearchChromosome downloadChromosome) {
    	this.downloadChromosome = downloadChromosome;
    }
    
    public void setDownloadFilterSiftScoreValue(String downloadFilterSiftScoreValue) {
        this.downloadFilterSiftScoreValue = downloadFilterSiftScoreValue;
    }
    public void setDownloadFilterSiftConservationScoreValue(String downloadFilterSiftConservationScoreValue) {
        this.downloadFilterSiftConservationScoreValue = downloadFilterSiftConservationScoreValue;
    }
    public void setDownloadFilterProteinAlignNumberValue(String downloadFilterProteinAlignNumberValue) {
        this.downloadFilterProteinAlignNumberValue = downloadFilterProteinAlignNumberValue;
    }
    public void setDownloadFilterTotalNumberSeqAlignedValue(String downloadFilterTotalNumberSeqAlignedValue) {
        this.downloadFilterTotalNumberSeqAlignedValue = downloadFilterTotalNumberSeqAlignedValue;
    }
    public void setDownloadFilterProveanScoreValue(String downloadFilterProveanScoreValue) {
        this.downloadFilterProveanScoreValue = downloadFilterProveanScoreValue;
    }
    public void setDownloadFilterSiftScore(SearchFilterSiftScore downloadFilterSiftScore) {
        this.downloadFilterSiftScore = downloadFilterSiftScore;
    }
    public void setDownloadFilterSiftConservationScore(SearchFilterSiftConservationScore downloadFilterSiftConservationScore) {
        this.downloadFilterSiftConservationScore = downloadFilterSiftConservationScore;
    }
    public void setDownloadFilterProteinAlignNumber(SearchFilterProteinAlignNumber downloadFilterProteinAlignNumber) {
        this.downloadFilterProteinAlignNumber = downloadFilterProteinAlignNumber;
    }
    public void setDownloadFilterTotalNumberSeqAligned(SearchFilterTotalNumberSeqAligned downloadFilterTotalNumberSeqAligned) {
        this.downloadFilterTotalNumberSeqAligned = downloadFilterTotalNumberSeqAligned;
    }
    public void setDownloadFilterProveanScore(SearchFilterProveanScore downloadFilterProveanScore) {
        this.downloadFilterProveanScore = downloadFilterProveanScore;
    }

    public void setDownloadSortField(SearchSortField downloadSortField) {
        this.downloadSortField = downloadSortField;
    }
    public void setDownloadSortDirection(SearchSortDirection downloadSortDirection) {
        this.downloadSortDirection = downloadSortDirection;
    }
    
    // Helpers ------------------------------------------------------------------------------------
    public void setDownloadSortField(String downloadSortField) {
    	if ( downloadSortField.equals(SORT_FIELD_NONE)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_POSITION_START;
    	}
    	if ( downloadSortField.equals(SORT_FIELD_POSITION_START)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_POSITION_START;
    	}
    	if ( downloadSortField.equals(SORT_FIELD_POSITION_END)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_POSITION_END;
    	}
    	if ( downloadSortField.equals(SORT_FIELD_REFERENCE)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_REFERENCE;
    	}
    	if ( downloadSortField.equals(SORT_FIELD_ALTERNATIVE)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_ALTERNATIVE;
    	}
    	if ( downloadSortField.equals(SORT_FIELD_AMINO_ACID_SUBSITUTION)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_AMINO_ACID_SUBSITUTION;
    	}
    	if ( downloadSortField.equals(SORT_FIELD_PREDICTION_CATEGORY)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_PREDICTION_CATEGORY;
    	}
    	if ( downloadSortField.equals(SORT_FIELD_SIFT_SCORE)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_SIFT_SCORE;
    	}
    	if ( downloadSortField.equals(SORT_FIELD_SIFT_SCORE_CONSERVATION)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_SIFT_SCORE_CONSERVATION;
    	}
    	if ( downloadSortField.equals(SORT_FIELD_PROTEIN_ALIGNMENT_NUMBER)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_PROTEIN_ALIGNMENT_NUMBER;
    	}
    	if ( downloadSortField.equals(SORT_FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER;
    	}
    	if ( downloadSortField.equals(SORT_FIELD_PROVEAN_SCORE)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_PROVEAN_SCORE;
    	}
    	if ( downloadSortField.equals(ONLY_SORT_FIELD_NONE)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_POSITION_START;
    	}
    	if ( downloadSortField.equals(ONLY_SORT_FIELD_POSITION_START)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_POSITION_START;
    	}
    	if ( downloadSortField.equals(ONLY_SORT_FIELD_POSITION_END)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_POSITION_END;
    	}
    	if ( downloadSortField.equals(ONLY_SORT_FIELD_REFERENCE)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_REFERENCE;
    	}
    	if ( downloadSortField.equals(ONLY_SORT_FIELD_ALTERNATIVE)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_ALTERNATIVE;
    	}
    	if ( downloadSortField.equals(ONLY_SORT_FIELD_AMINO_ACID_SUBSITUTION)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_AMINO_ACID_SUBSITUTION;
    	}
    	if ( downloadSortField.equals(ONLY_SORT_FIELD_PREDICTION_CATEGORY)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_PREDICTION_CATEGORY;
    	}
    	if ( downloadSortField.equals(ONLY_SORT_FIELD_SIFT_SCORE)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_SIFT_SCORE;
    	}
    	if ( downloadSortField.equals(ONLY_SORT_FIELD_SIFT_SCORE_CONSERVATION)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_SIFT_SCORE_CONSERVATION;
    	}
    	if ( downloadSortField.equals(ONLY_SORT_FIELD_PROTEIN_ALIGNMENT_NUMBER)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_PROTEIN_ALIGNMENT_NUMBER;
    	}
    	if ( downloadSortField.equals(ONLY_SORT_FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER;
    	}
    	if ( downloadSortField.equals(ONLY_SORT_FIELD_PROVEAN_SCORE)) {
            this.downloadSortField = SearchSortField.SORT_FIELD_PROVEAN_SCORE;
    	}
    }
    public void setDownloadSortDirection(String downloadSortDirection) {
    	if ( downloadSortDirection.equals(SORT_DIRECTION_NONE)) {
            this.downloadSortDirection = SearchSortDirection.SORT_DIRECTION_ASCENDING;
    	}
    	if ( downloadSortDirection.equals(SORT_DIRECTION_ASCENDING)) {
            this.downloadSortDirection = SearchSortDirection.SORT_DIRECTION_ASCENDING;
    	}
    	if ( downloadSortDirection.equals(SORT_DIRECTION_DESCENDING)) {
            this.downloadSortDirection = SearchSortDirection.SORT_DIRECTION_DESCENDING;
    	}
    	if ( downloadSortDirection.equals(ONLY_SORT_DIRECTION_NONE)) {
            this.downloadSortDirection = SearchSortDirection.SORT_DIRECTION_ASCENDING;
    	}
    	if ( downloadSortDirection.equals(ONLY_SORT_DIRECTION_ASCENDING)) {
            this.downloadSortDirection = SearchSortDirection.SORT_DIRECTION_ASCENDING;
    	}
    	if ( downloadSortDirection.equals(ONLY_SORT_DIRECTION_DESCENDING)) {
            this.downloadSortDirection = SearchSortDirection.SORT_DIRECTION_DESCENDING;
    	}
    }
    public void setSearchChromosome(String downloadChromosome) {
    	if ( downloadChromosome.equals(CHROMOSOME_NONE)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_NONE;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_1)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_1;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_2)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_2;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_3)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_3;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_4)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_4;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_5)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_5;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_6)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_6;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_7)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_7;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_8)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_8;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_9)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_9;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_10)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_10;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_11)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_11;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_11)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_11;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_12)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_12;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_13)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_13;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_14)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_14;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_15)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_15;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_16)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_16;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_17)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_17;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_18)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_18;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_19)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_19;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_20)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_20;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_21)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_21;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_22)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_22;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_23)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_23;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_24)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_24;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_25)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_25;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_26)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_26;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_27)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_27;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_28)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_28;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_32)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_32;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_W)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_W;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_Z)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_Z;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_LGE22C19W28_E50C23)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_LGE22C19W28_E50C23;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_LGE64)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_LGE64;
    	}
    }
    
    public int getDownloadDownStreamAsInt(){
        return ObjectConverter.convert(this.downloadDownStream, Integer.class);
    }
    public int getDownloadUpStreamAsInt(){
        return ObjectConverter.convert(this.downloadUpStream, Integer.class);
    }
    public int getDownloadLowRangeAsInt(){
        return ObjectConverter.convert(this.downloadLowRange, Integer.class);
    }
    public int getDownloadHighRangeAsInt(){
        return ObjectConverter.convert(this.downloadHighRange, Integer.class);
    }

    public boolean isDownloadFormatNone() {
    	if ( this.downloadFormat.name().equals(FORMAT_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFormatCSV() {
    	if ( this.downloadFormat.name().equals(FORMAT_CSV)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFormatTSV() {
    	if ( this.downloadFormat.name().equals(FORMAT_TSV)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFormatVCF() {
    	if ( this.downloadFormat.name().equals(FORMAT_VCF)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isDownloadQuotesNone() {
    	if ( this.downloadQuotes.name().equals(QUOTES_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadQuotesYes() {
    	if ( this.downloadQuotes.name().equals(QUOTES_YES)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadQuotesNo() {
    	if ( this.downloadQuotes.name().equals(QUOTES_NO)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isDownloadHeadersNone() {
    	if ( this.downloadHeaders.name().equals(HEADERS_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadHeadersYes() {
    	if ( this.downloadHeaders.name().equals(HEADERS_YES)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadHeadersNo() {
    	if ( this.downloadHeaders.name().equals(HEADERS_NO)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }


    public boolean isDownloadReferenceBreedNone() {
    	if ( this.downloadReferenceBreed.name().equals(BREED_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadReferenceBreedI() {
    	if ( this.downloadReferenceBreed.name().equals(BREED_I)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadReferenceBreedJ() {
    	if ( this.downloadReferenceBreed.name().equals(BREED_J)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadReferenceBreedW() {
    	if ( this.downloadReferenceBreed.name().equals(BREED_W)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadReferenceBreedN() {
    	if ( this.downloadReferenceBreed.name().equals(BREED_N)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadReferenceBreedL() {
    	if ( this.downloadReferenceBreed.name().equals(BREED_L)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadReferenceBreedZ() {
    	if ( this.downloadReferenceBreed.name().equals(BREED_Z)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isDownloadAlternativeBreedNone() {
    	if ( this.downloadAlternativeBreed.name().equals(BREED_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadAlternativeBreedI() {
    	if ( this.downloadAlternativeBreed.name().equals(BREED_I)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadAlternativeBreedJ() {
    	if ( this.downloadAlternativeBreed.name().equals(BREED_J)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadAlternativeBreedW() {
    	if ( this.downloadAlternativeBreed.name().equals(BREED_W)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadAlternativeBreedN() {
    	if ( this.downloadAlternativeBreed.name().equals(BREED_N)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadAlternativeBreedL() {
    	if ( this.downloadAlternativeBreed.name().equals(BREED_L)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadAlternativeBreedZ() {
    	if ( this.downloadAlternativeBreed.name().equals(BREED_Z)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isDownloadChromosomeNone() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome1() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_1)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome2() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_2)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome3() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_3)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome4() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_4)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome5() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_5)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome6() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_6)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome7() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_7)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome8() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_8)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome9() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_9)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome10() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_10)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome11() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_11)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome12() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_12)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome13() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_13)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome14() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_14)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome15() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_15)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome16() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_16)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome17() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_17)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome18() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_18)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome19() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_19)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome20() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_20)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome21() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_21)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome22() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_22)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome23() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_23)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome24() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_24)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome25() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_25)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome26() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_26)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome27() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_27)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome28() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_28)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosome32() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_32)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosomeLGE22C19W28_E50C23() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_LGE22C19W28_E50C23)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosomeLGE64() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_LGE64)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosomeW() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_W)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadChromosomeZ() {
    	if ( this.downloadChromosome.name().equals(CHROMOSOME_Z)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isDownloadFilterSiftScoreNone() {
    	if ( this.downloadFilterSiftScore.name().equals(SIFT_SCORE_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFilterSiftScoreAbove() {
    	if ( this.downloadFilterSiftScore.name().equals(SIFT_SCORE_ABOVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFilterSiftScoreBelow() {
    	if ( this.downloadFilterSiftScore.name().equals(SIFT_SCORE_BELOW)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isDownloadFilterSiftConservationScoreNone() {
    	if ( this.downloadFilterSiftConservationScore.name().equals(SIFT_CONSERVATION_SCORE_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFilterSiftConservationScoreAbove() {
    	if ( this.downloadFilterSiftConservationScore.name().equals(SIFT_CONSERVATION_SCORE_ABOVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFilterSiftConservationScoreBelow() {
    	if ( this.downloadFilterSiftConservationScore.name().equals(SIFT_CONSERVATION_SCORE_BELOW)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isDownloadFilterProteinAlignNumberNone() {
    	if ( this.downloadFilterProteinAlignNumber.name().equals(PROTEIN_ALIGN_NUMBER_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFilterProteinAlignNumberAbove() {
    	if ( this.downloadFilterProteinAlignNumber.name().equals(PROTEIN_ALIGN_NUMBER_ABOVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFilterProteinAlignNumberBelow() {
    	if ( this.downloadFilterProteinAlignNumber.name().equals(PROTEIN_ALIGN_NUMBER_BELOW)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isDownloadFilterTotalNumberSeqAlignedNone() {
    	if ( this.downloadFilterTotalNumberSeqAligned.name().equals(TOTAL_NUMBER_SEQ_ALIGNED_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFilterTotalNumberSeqAlignedAbove() {
    	if ( this.downloadFilterTotalNumberSeqAligned.name().equals(TOTAL_NUMBER_SEQ_ALIGNED_ABOVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFilterTotalNumberSeqAlignedBelow() {
    	if ( this.downloadFilterTotalNumberSeqAligned.name().equals(TOTAL_NUMBER_SEQ_ALIGNED_BELOW)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isDownloadFilterProveanScoreNone() {
    	if ( this.downloadFilterProveanScore.name().equals(PROVEAN_SCORE_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFilterProveanScoreAbove() {
    	if ( this.downloadFilterProveanScore.name().equals(PROVEAN_SCORE_ABOVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFilterProveanScoreBelow() {
    	if ( this.downloadFilterProveanScore.name().equals(PROVEAN_SCORE_BELOW)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isDownloadFilterSiftScoreValueEmpty() {
        if ( this.downloadFilterSiftScoreValue.equals("") ){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFilterSiftConservationScoreValueEmpty() {
        if ( this.downloadFilterSiftConservationScoreValue.equals("") ){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFilterProteinAlignNumberValueEmpty() {
        if ( this.downloadFilterProteinAlignNumberValue.equals("") ){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFilterTotalNumberSeqAlignedValueEmpty() {
        if ( this.downloadFilterTotalNumberSeqAlignedValue.equals("") ){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFilterProveanScoreValueEmpty() {
        if ( this.downloadFilterProveanScoreValue.equals("") ){
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isDownloadFilterSiftScoreValueANumber() {
    	if ( StringUtility.isItNumeric(this.downloadFilterSiftScoreValue) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public double getDownloadFilterSiftScoreValueAsDouble(){
    	if ( isDownloadFilterSiftScoreValueANumber() ) {
        	return ObjectConverter.convert(this.downloadFilterSiftScoreValue, Double.class);
    	}
    	else {
            return 0;
    	}
    }

    public boolean isDownloadFilterSiftConservationScoreValueANumber() {
    	if ( StringUtility.isItNumeric(this.downloadFilterSiftConservationScoreValue) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public double getDownloadFilterSiftConservationScoreValueAsDouble(){
    	if ( isDownloadFilterSiftConservationScoreValueANumber() ) {
        	return ObjectConverter.convert(this.downloadFilterSiftConservationScoreValue, Double.class);
    	}
    	else {
            return 0;
    	}
    }

    public boolean isDownloadFilterProteinAlignNumberValueANumber() {
    	if ( StringUtility.isItNumeric(this.downloadFilterProteinAlignNumberValue) ) {
    		return true;
    	}
    	else {
    		
    		return false;
    	}
    }
    public long getDownloadFilterProteinAlignNumberValueAsLong(){
    	if ( isDownloadFilterProteinAlignNumberValueANumber() ) {
            return ObjectConverter.convert(this.downloadFilterProteinAlignNumberValue, Long.class);
    	}
    	else {
            return 0;
    	}
    }

    public boolean isDownloadFilterTotalNumberSeqAlignedValueANumber() {
    	if ( StringUtility.isItNumeric(this.downloadFilterTotalNumberSeqAlignedValue) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public long getDownloadFilterTotalNumberSeqAlignedValueAsLong(){
    	if ( isDownloadFilterTotalNumberSeqAlignedValueANumber() ) {
            return ObjectConverter.convert(this.downloadFilterTotalNumberSeqAlignedValue, Long.class);
    	}
    	else {
            return 0;
    	}
    }

    public boolean isDownloadFilterProveanScoreValueANumber() {
    	if ( StringUtility.isItNumeric(this.downloadFilterProveanScoreValue) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public double getDownloadFilterProveanScoreValueAsDouble(){
    	if ( isDownloadFilterProveanScoreValueANumber() ) {
        	return ObjectConverter.convert(this.downloadFilterProveanScoreValue, Double.class);
    	}
    	else {
            return 0;
    	}
    }

    public boolean isDownloadSortFieldNone() {
    	if ( this.downloadSortField.name().equals(SORT_FIELD_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadSortFieldPositionStart() {
    	if ( this.downloadSortField.name().equals(SORT_FIELD_POSITION_START)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadSortFieldPositionEnd() {
    	if ( this.downloadSortField.name().equals(SORT_FIELD_POSITION_END)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadSortFieldReference() {
    	if ( this.downloadSortField.name().equals(SORT_FIELD_REFERENCE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadSortFieldAlternative() {
    	if ( this.downloadSortField.name().equals(SORT_FIELD_ALTERNATIVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadSortFieldAminoAcidSubs() {
    	if ( this.downloadSortField.name().equals(SORT_FIELD_AMINO_ACID_SUBSITUTION)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadSortFieldPredictionCategory() {
    	if ( this.downloadSortField.name().equals(SORT_FIELD_PREDICTION_CATEGORY)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadSortFieldScoreSift() {
    	if ( this.downloadSortField.name().equals(SORT_FIELD_SIFT_SCORE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadSortFieldScoreConservation() {
    	if ( this.downloadSortField.name().equals(SORT_FIELD_SIFT_SCORE_CONSERVATION)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadSortFieldProteinAlignNumber() {
    	if ( this.downloadSortField.name().equals(SORT_FIELD_PROTEIN_ALIGNMENT_NUMBER)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadSortFieldTotalAlignSequenceNumber() {
    	if ( this.downloadSortField.name().equals(SORT_FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadSortFieldScoreProvean() {
    	if ( this.downloadSortField.name().equals(SORT_FIELD_PROVEAN_SCORE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isDownloadSortDirectionNone() {
    	if ( this.downloadSortDirection.name().equals(SORT_DIRECTION_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadSortDirectionAsc() {
    	if ( this.downloadSortDirection.name().equals(SORT_DIRECTION_ASCENDING)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadSortDirectionDesc() {
    	if ( this.downloadSortDirection.name().equals(SORT_DIRECTION_DESCENDING)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public String toString() {
        return ToStringBuilder.reflectionToString(this, new CustomDateToStringStyle());
    }
}
