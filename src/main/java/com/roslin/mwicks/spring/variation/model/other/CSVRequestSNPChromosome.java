package com.roslin.mwicks.spring.variation.model.other;

import java.util.ArrayList;
import java.util.Collection;

import com.roslin.mwicks.spring.variation.dto.web.objects.snpchromosome.DTOSearchSNPChromosome;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;


@SuppressWarnings("serial")
public class CSVRequestSNPChromosome extends ArrayList<DTOSearchSNPChromosome> {

    // Constants ----------------------------------------------------------------------------------

	
	// Properties ---------------------------------------------------------------------------------
    private DTOSearchSNPChromosome dtoSearch;

    
    // Constructor --------------------------------------------------------------------------------
	public CSVRequestSNPChromosome() {
    }

    public CSVRequestSNPChromosome(DTOSearchSNPChromosome dtoSearch, Collection<? extends DTOSearchSNPChromosome> c) {
     
    	super(c);

    	this.dtoSearch = dtoSearch;
    }

    
    // Getters ------------------------------------------------------------------------------------
    public DTOSearchSNPChromosome getDTODownloadSNPChromosome() {
        return this.dtoSearch;
    }

    
    // Setters ------------------------------------------------------------------------------------
    public void setDTOSearchSNPChromosome(DTOSearchSNPChromosome dtoSearch) {
        this.dtoSearch = dtoSearch;
    }

    
    // Helpers ------------------------------------------------------------------------------------
    /*
    public boolean isDownloadFormatNone() {
    	return this.dtoSearch.isDownloadFormatNone(); 
    }
    public boolean isDownloadFormatCSV() {
    	return this.dtoSearch.isDownloadFormatCSV(); 
    }
    public boolean isDownloadFormatTSV() {
    	return this.dtoSearch.isDownloadFormatTSV(); 
    }
    public boolean isDownloadFormatVCF() {
    	return this.dtoSearch.isDownloadFormatVCF(); 
    }

    public boolean isDownloadQuotesNone() {
    	return this.dtoSearch.isDownloadQuotesNone();
    }
    public boolean isDownloadQuotesYes() {
    	return this.dtoSearch.isDownloadQuotesYes();
    }
    public boolean isDownloadQuotesNo() {
    	return this.dtoSearch.isDownloadQuotesNo();
    }
    
    public boolean isDownloadHeadersNone() {
    	return this.dtoSearch.isDownloadHeadersNone();
    }
    public boolean isDownloadHeadersYes() {
    	return this.dtoSearch.isDownloadHeadersYes();
    }
    public boolean isDownloadHeadersNo() {
    	return this.dtoSearch.isDownloadHeadersNo();
    }
    
    public boolean isDownloadReferenceNone() {
        return this.dtoSearch.isDownloadReferenceNone();
    }
    public boolean isDownloadReference7() {
        return this.dtoSearch.isDownloadReference7();
    }
    public boolean isDownloadReferenceP() {
        return this.dtoSearch.isDownloadReferenceP();
    }
    public boolean isDownloadReferenceW() {
        return this.dtoSearch.isDownloadReferenceW();
    }
    public boolean isDownloadReferenceN() {
        return this.dtoSearch.isDownloadReferenceN();
    }
    public boolean isDownloadReference15I() {
        return this.dtoSearch.isDownloadReference15I();
    }
    public boolean isDownloadReferenceZero() {
        return this.dtoSearch.isDownloadReferenceZero();
    }
    public boolean isDownloadReference6() {
        return this.dtoSearch.isDownloadReference6();
    }
    public boolean isDownloadReferenceC() {
        return this.dtoSearch.isDownloadReferenceC();
    }

    public boolean isDownloadAlternativeNone() {
        return this.dtoSearch.isDownloadAlternativeNone();
    }
    public boolean isDownloadAlternative7() {
        return this.dtoSearch.isDownloadAlternative7();
    }
    public boolean isDownloadAlternativeP() {
        return this.dtoSearch.isDownloadAlternativeP();
    }
    public boolean isDownloadAlternativeW() {
        return this.dtoSearch.isDownloadAlternativeW();
    }
    public boolean isDownloadAlternativeN() {
        return this.dtoSearch.isDownloadAlternativeN();
    }
    public boolean isDownloadAlternative15I() {
        return this.dtoSearch.isDownloadAlternative15I();
    }
    public boolean isDownloadAlternativeZero() {
        return this.dtoSearch.isDownloadAlternativeZero();
    }
    public boolean isDownloadAlternative6() {
        return this.dtoSearch.isDownloadAlternative6();
    }
    public boolean isDownloadAlternativeC() {
        return this.dtoSearch.isDownloadAlternativeC();
    }
     */


}