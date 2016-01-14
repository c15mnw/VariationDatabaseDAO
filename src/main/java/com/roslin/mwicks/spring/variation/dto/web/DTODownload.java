package com.roslin.mwicks.spring.variation.dto.web;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.roslin.mwicks.spring.variation.format.CustomDateToStringStyle;
import com.roslin.mwicks.utility.ObjectConverter;
import com.roslin.mwicks.utility.StringUtility;


/**
 * A DTO class which is used as a form object in the download form.
 * @author Mike Wicks
 */
public class DTODownload {

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

	protected static final String STRAIN_NONE = "STRAIN_NONE";
	protected static final String STRAIN_7 = "STRAIN_7";
	protected static final String STRAIN_P = "STRAIN_P";
	protected static final String STRAIN_W = "STRAIN_W";
	protected static final String STRAIN_N = "STRAIN_N";
	protected static final String STRAIN_15I = "STRAIN_15I";
	protected static final String STRAIN_ZERO = "STRAIN_ZERO";
	protected static final String STRAIN_6 = "STRAIN_6";
	protected static final String STRAIN_C = "STRAIN_C";
			
	protected static final String CHROMOSOME_NONE = "CHROMOSOME_NONE";
	protected static final String CHROMOSOME_1 = "CHROMOSOME_1";
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

    private SearchReference downloadReference;
    private SearchAlternative downloadAlternative;
    
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

    
    // Constructor --------------------------------------------------------------------------------
    public DTODownload() {

        this.downloadDownStream = "";
        this.downloadUpStream = "";
        
        this.downloadLowRange = "";
        this.downloadHighRange = "";
        
        this.downloadReference = SearchReference.STRAIN_NONE;
        this.downloadAlternative = SearchAlternative.STRAIN_NONE;

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
    public SearchReference getDownloadReference() {
        return this.downloadReference;
    }
    public SearchAlternative getDownloadAlternative() {
        return this.downloadAlternative;
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
    public void setDownloadReference(SearchReference downloadReference) {
        this.downloadReference = downloadReference;
    }
    public void setDownloadAlternative(SearchAlternative downloadAlternative) {
        this.downloadAlternative = downloadAlternative;
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

    // Helpers ------------------------------------------------------------------------------------
    public void setSearchChromosome(String downloadChromosome) {
    	if ( downloadChromosome.equals(CHROMOSOME_NONE)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_NONE;
    	}
    	if ( downloadChromosome.equals(CHROMOSOME_1)) {
            this.downloadChromosome = SearchChromosome.CHROMOSOME_1;
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


    public boolean isDownloadReferenceNone() {
    	if ( this.downloadReference.name().equals(STRAIN_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadReference7() {
    	if ( this.downloadReference.name().equals(STRAIN_7)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadReferenceP() {
    	if ( this.downloadReference.name().equals(STRAIN_P)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadReferenceW() {
    	if ( this.downloadReference.name().equals(STRAIN_W)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadReferenceN() {
    	if ( this.downloadReference.name().equals(STRAIN_N)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadReference15I() {
    	if ( this.downloadReference.name().equals(STRAIN_15I)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadReferenceZero() {
    	if ( this.downloadReference.name().equals(STRAIN_ZERO)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadReference6() {
    	if ( this.downloadReference.name().equals(STRAIN_6)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadReferenceC() {
    	if ( this.downloadReference.name().equals(STRAIN_C)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isDownloadAlternativeNone() {
    	if ( this.downloadAlternative.name().equals(STRAIN_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadAlternative7() {
    	if ( this.downloadAlternative.name().equals(STRAIN_7)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadAlternativeP() {
    	if ( this.downloadAlternative.name().equals(STRAIN_P)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadAlternativeW() {
    	if ( this.downloadAlternative.name().equals(STRAIN_W)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadAlternativeN() {
    	if ( this.downloadAlternative.name().equals(STRAIN_N)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadAlternative15I() {
    	if ( this.downloadAlternative.name().equals(STRAIN_15I)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadAlternativeZero() {
    	if ( this.downloadAlternative.name().equals(STRAIN_ZERO)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadAlternative6() {
    	if ( this.downloadAlternative.name().equals(STRAIN_6)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadAlternativeC() {
    	if ( this.downloadAlternative.name().equals(STRAIN_C)) {
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

    
    public String toString() {
        return ToStringBuilder.reflectionToString(this, new CustomDateToStringStyle());
    }
}
