package com.roslin.mwicks.spring.variation.model.other;

import java.util.ArrayList;
import java.util.Collection;

import com.roslin.mwicks.spring.variation.dto.web.objects.snpinsertiondeletion.DTODownloadSNPInsertionDeletion;

import com.roslin.mwicks.spring.variation.model.snpinsertiondeletion.SNPInsertionDeletion;


@SuppressWarnings("serial")
public class CSVResponseSNPInsertionDeletion extends ArrayList<SNPInsertionDeletion> {

    // Constants ----------------------------------------------------------------------------------

	
	// Properties ---------------------------------------------------------------------------------
    private DTODownloadSNPInsertionDeletion dtoDownload;

    
    // Constructor --------------------------------------------------------------------------------
	public CSVResponseSNPInsertionDeletion() {
    }

    public CSVResponseSNPInsertionDeletion(DTODownloadSNPInsertionDeletion dtoDownload, Collection<? extends SNPInsertionDeletion> c) {
     
    	super(c);

    	this.dtoDownload = dtoDownload;
    }

    
    // Getters ------------------------------------------------------------------------------------
    public DTODownloadSNPInsertionDeletion getDTODownloadSNPInsertionDeletion() {
        return this.dtoDownload;
    }

    
    // Setters ------------------------------------------------------------------------------------
    public void setDTODownloadSNPInsertionDeletion(DTODownloadSNPInsertionDeletion dtoDownload) {
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
    
    public boolean isSearchReferenceBreedNone() {
        return this.dtoDownload.isSearchReferenceBreedNone();
    }
    public boolean isSearchReferenceBreedJ() {
        return this.dtoDownload.isSearchReferenceBreedJ();
    }
    public boolean isSearchReferenceBreedL() {
        return this.dtoDownload.isSearchReferenceBreedL();
    }
    public boolean isSearchReferenceBreedW() {
        return this.dtoDownload.isSearchReferenceBreedW();
    }
    public boolean isSearchReferenceBreedN() {
        return this.dtoDownload.isSearchReferenceBreedN();
    }
    public boolean isSearchReferenceBreedI() {
        return this.dtoDownload.isSearchReferenceBreedI();
    }
    public boolean isSearchReferenceBreedZ() {
        return this.dtoDownload.isSearchReferenceBreedZ();
    }

    public boolean isSearchAlternativeBreedNone() {
        return this.dtoDownload.isSearchAlternativeBreedNone();
    }
    public boolean isSearchAlternativeBreedJ() {
        return this.dtoDownload.isSearchAlternativeBreedJ();
    }
    public boolean isSearchAlternativeBreedL() {
        return this.dtoDownload.isSearchAlternativeBreedL();
    }
    public boolean isSearchAlternativeBreedW() {
        return this.dtoDownload.isSearchAlternativeBreedW();
    }
    public boolean isSearchAlternativeBreedN() {
        return this.dtoDownload.isSearchAlternativeBreedN();
    }
    public boolean isSearchAlternativeBreedI() {
        return this.dtoDownload.isSearchAlternativeBreedI();
    }
    public boolean isSearchAlternativeBreedZ() {
        return this.dtoDownload.isSearchAlternativeBreedZ();
    }


}