package com.roslin.mwicks.spring.variation.dto.web.objects.snpinsertiondeletion;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.springframework.web.multipart.MultipartFile;

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


/**
 * A DTO class which is used as a form object in the search form.
 * @author Mike Wicks
 */
public class DTODownloadSNPInsertionDeletion extends DTOSearchSNPInsertionDeletion {

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


	
    // Properties ---------------------------------------------------------------------------------
    private DownloadFormat searchFormat;
    private DownloadQuotes searchQuotes;
    private DownloadHeaders searchHeaders;


    // Constructor --------------------------------------------------------------------------------
    public DTODownloadSNPInsertionDeletion() {

    	super();
    	
        this.searchFormat = DownloadFormat.FORMAT_CSV;
        this.searchQuotes = DownloadQuotes.QUOTES_NO;
        this.searchHeaders = DownloadHeaders.HEADERS_NO;
    }

    
    public DTODownloadSNPInsertionDeletion(
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

    	super(1,
    			"",
    			searchDownStream,
    			searchUpStream,
    			searchLowRange,
    			searchHighRange,
    			searchReferenceBreed,
    			searchAlternativeBreed,
    			searchChromosome,
    			searchFilterSiftScoreValue,
    			searchFilterSiftConservationScoreValue,
    			searchFilterProteinAlignNumberValue,
    			searchFilterTotalNumberSeqAlignedValue,
    			searchFilterProveanScoreValue,
    			searchFilterSiftScore,
    			searchFilterSiftConservationScore,
    			searchFilterProteinAlignNumber,
    			searchFilterTotalNumberSeqAligned,
    			searchFilterProveanScore,
    			searchSortField,
    			searchSortDirection,
    			searchUploadFileName,
        		searchUploadFile
    			);
    	
    	
        this.searchFormat = DownloadFormat.FORMAT_CSV;
        this.searchQuotes = DownloadQuotes.QUOTES_NO;
        this.searchHeaders = DownloadHeaders.HEADERS_NO;
    }
    
    public DTODownloadSNPInsertionDeletion(
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

    	super(pageIndex,
    			searchGeneName,
    			searchDownStream,
    			searchUpStream,
    			searchLowRange,
    			searchHighRange,
    			searchReferenceBreed,
    			searchAlternativeBreed,
    			searchChromosome,
    			searchFilterSiftScoreValue,
    			searchFilterSiftConservationScoreValue,
    			searchFilterProteinAlignNumberValue,
    			searchFilterTotalNumberSeqAlignedValue,
    			searchFilterProveanScoreValue,
    			searchFilterSiftScore,
    			searchFilterSiftConservationScore,
    			searchFilterProteinAlignNumber,
    			searchFilterTotalNumberSeqAligned,
    			searchFilterProveanScore,
    			searchSortField,
    			searchSortDirection,
    			searchUploadFileName,
    			searchUploadFile
    			);

    	this.searchFormat = DownloadFormat.FORMAT_CSV;
        this.searchQuotes = DownloadQuotes.QUOTES_NO;
        this.searchHeaders = DownloadHeaders.HEADERS_NO;
    }
    

    // Getters ------------------------------------------------------------------------------------
    public DownloadFormat getDownloadFormat() {
        return this.searchFormat;
    }
    public DownloadQuotes getDownloadQuotes() {
        return this.searchQuotes;
    }
    public DownloadHeaders getDownloadHeaders() {
        return this.searchHeaders;
    }
    

    // Setters ------------------------------------------------------------------------------------
    public void setDownloadFormat(DownloadFormat searchFormat) {
        this.searchFormat = searchFormat;
    }
    public void setDownloadQuotes(DownloadQuotes searchQuotes) {
        this.searchQuotes = searchQuotes;
    }
    public void setDownloadHeaders(DownloadHeaders searchHeaders) {
        this.searchHeaders = searchHeaders;
    }
    

    // Helpers ------------------------------------------------------------------------------------
    public boolean isDownloadFormatNone() {
    	if ( this.searchFormat.name().equals(FORMAT_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isDownloadFormatCSV() {
    	if ( this.searchFormat.name().equals(FORMAT_CSV)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isDownloadFormatTSV() {
    	if ( this.searchFormat.name().equals(FORMAT_TSV)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isDownloadFormatVCF() {
    	if ( this.searchFormat.name().equals(FORMAT_VCF)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isDownloadQuotesNone() {
    	if ( this.searchQuotes.name().equals(QUOTES_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isDownloadQuotesYes() {
    	if ( this.searchQuotes.name().equals(QUOTES_YES)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isDownloadQuotesNo() {
    	if ( this.searchQuotes.name().equals(QUOTES_NO)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isDownloadHeadersNone() {
    	if ( this.searchHeaders.name().equals(HEADERS_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isDownloadHeadersYes() {
    	if ( this.searchHeaders.name().equals(HEADERS_YES)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isDownloadHeadersNo() {
    	if ( this.searchHeaders.name().equals(HEADERS_NO)) {
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
