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
    
    public boolean isDownloadReferenceBreedNone() {
        return this.dtoDownload.isDownloadReferenceBreedNone();
    }
    public boolean isDownloadReferenceBreedJ() {
        return this.dtoDownload.isDownloadReferenceBreedJ();
    }
    public boolean isDownloadReferenceBreedL() {
        return this.dtoDownload.isDownloadReferenceBreedL();
    }
    public boolean isDownloadReferenceBreedW() {
        return this.dtoDownload.isDownloadReferenceBreedW();
    }
    public boolean isDownloadReferenceBreedN() {
        return this.dtoDownload.isDownloadReferenceBreedN();
    }
    public boolean isDownloadReferenceBreedI() {
        return this.dtoDownload.isDownloadReferenceBreedI();
    }
    public boolean isDownloadReferenceBreedZ() {
        return this.dtoDownload.isDownloadReferenceBreedZ();
    }

    public boolean isDownloadAlternativeBreedNone() {
        return this.dtoDownload.isDownloadAlternativeBreedNone();
    }
    public boolean isDownloadAlternativeBreedJ() {
        return this.dtoDownload.isDownloadAlternativeBreedJ();
    }
    public boolean isDownloadAlternativeBreedL() {
        return this.dtoDownload.isDownloadAlternativeBreedL();
    }
    public boolean isDownloadAlternativeBreedW() {
        return this.dtoDownload.isDownloadAlternativeBreedW();
    }
    public boolean isDownloadAlternativeBreedN() {
        return this.dtoDownload.isDownloadAlternativeBreedN();
    }
    public boolean isDownloadAlternativeBreedI() {
        return this.dtoDownload.isDownloadAlternativeBreedI();
    }
    public boolean isDownloadAlternativeBreedZ() {
        return this.dtoDownload.isDownloadAlternativeBreedZ();
    }


}