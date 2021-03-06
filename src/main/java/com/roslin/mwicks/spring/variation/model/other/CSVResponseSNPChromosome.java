package com.roslin.mwicks.spring.variation.model.other;

import java.util.ArrayList;
import java.util.Collection;

import com.roslin.mwicks.spring.variation.dto.web.objects.snpchromosome.DTODownloadSNPChromosome;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;


@SuppressWarnings("serial")
public class CSVResponseSNPChromosome extends ArrayList<SNPChromosome> {

    // Constants ----------------------------------------------------------------------------------

	
	// Properties ---------------------------------------------------------------------------------
    private DTODownloadSNPChromosome dtoDownload;

    
    // Constructor --------------------------------------------------------------------------------
	public CSVResponseSNPChromosome() {
    }

    public CSVResponseSNPChromosome(DTODownloadSNPChromosome dtoDownload, Collection<? extends SNPChromosome> c) {
     
    	super(c);

    	this.dtoDownload = dtoDownload;
    }

    
    // Getters ------------------------------------------------------------------------------------
    public DTODownloadSNPChromosome getDTODownloadSNPChromosome() {
        return this.dtoDownload;
    }

    
    // Setters ------------------------------------------------------------------------------------
    public void setDTODownloadSNPChromosome(DTODownloadSNPChromosome dtoDownload) {
        this.dtoDownload = dtoDownload;
    }

    
    // Helpers ------------------------------------------------------------------------------------
    public boolean isDownloadFormatNone() {
    	return this.dtoDownload.isDownloadFormatNone(); 
    }
    public boolean isDownloadFormatCSV() {
    	return this.dtoDownload.isDownloadFormatCSV(); 
    }
    public boolean isDownloadFormatTSV() {
    	return this.dtoDownload.isDownloadFormatTSV(); 
    }
    public boolean isDownloadFormatVCF() {
    	return this.dtoDownload.isDownloadFormatVCF(); 
    }

    public boolean isDownloadQuotesNone() {
    	return this.dtoDownload.isDownloadQuotesNone();
    }
    public boolean isDownloadQuotesYes() {
    	return this.dtoDownload.isDownloadQuotesYes();
    }
    public boolean isDownloadQuotesNo() {
    	return this.dtoDownload.isDownloadQuotesNo();
    }
    
    public boolean isDownloadHeadersNone() {
    	return this.dtoDownload.isDownloadHeadersNone();
    }
    public boolean isDownloadHeadersYes() {
    	return this.dtoDownload.isDownloadHeadersYes();
    }
    public boolean isDownloadHeadersNo() {
    	return this.dtoDownload.isDownloadHeadersNo();
    }
    
    public boolean isDownloadReferenceNone() {
        return this.dtoDownload.isSearchReferenceNone();
    }
    public boolean isDownloadReference7() {
        return this.dtoDownload.isSearchReference7();
    }
    public boolean isDownloadReferenceP() {
        return this.dtoDownload.isSearchReferenceP();
    }
    public boolean isDownloadReferenceW() {
        return this.dtoDownload.isSearchReferenceW();
    }
    public boolean isDownloadReferenceN() {
        return this.dtoDownload.isSearchReferenceN();
    }
    public boolean isDownloadReference15I() {
        return this.dtoDownload.isSearchReference15I();
    }
    public boolean isDownloadReferenceZero() {
        return this.dtoDownload.isSearchReferenceZero();
    }
    public boolean isDownloadReference6() {
        return this.dtoDownload.isSearchReference6();
    }
    public boolean isDownloadReferenceC() {
        return this.dtoDownload.isSearchReferenceC();
    }

    public boolean isDownloadAlternativeNone() {
        return this.dtoDownload.isSearchAlternativeNone();
    }
    public boolean isDownloadAlternative7() {
        return this.dtoDownload.isSearchAlternative7();
    }
    public boolean isDownloadAlternativeP() {
        return this.dtoDownload.isSearchAlternativeP();
    }
    public boolean isDownloadAlternativeW() {
        return this.dtoDownload.isSearchAlternativeW();
    }
    public boolean isDownloadAlternativeN() {
        return this.dtoDownload.isSearchAlternativeN();
    }
    public boolean isDownloadAlternative15I() {
        return this.dtoDownload.isSearchAlternative15I();
    }
    public boolean isDownloadAlternativeZero() {
        return this.dtoDownload.isSearchAlternativeZero();
    }
    public boolean isDownloadAlternative6() {
        return this.dtoDownload.isSearchAlternative6();
    }
    public boolean isDownloadAlternativeC() {
        return this.dtoDownload.isSearchAlternativeC();
    }


}