package com.roslin.mwicks.spring.variation.model.other;

import java.util.ArrayList;
import java.util.Collection;

import com.roslin.mwicks.spring.variation.dto.DTODownload;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;


@SuppressWarnings("serial")
public class CSVResponse extends ArrayList<SNPChromosome> {

    // Constants ----------------------------------------------------------------------------------

	
	// Properties ---------------------------------------------------------------------------------
    private DTODownload dtoDownload;

    
    // Constructor --------------------------------------------------------------------------------
	public CSVResponse() {
    }

    public CSVResponse(DTODownload dtoDownload, Collection<? extends SNPChromosome> c) {
     
    	super(c);

    	this.dtoDownload = dtoDownload;
    }

    
    // Getters ------------------------------------------------------------------------------------
    public DTODownload getDTODownload() {
        return this.dtoDownload;
    }

    
    // Setters ------------------------------------------------------------------------------------
    public void setDTODownload(DTODownload dtoDownload) {
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
        return this.dtoDownload.isDownloadReferenceNone();
    }
    public boolean isDownloadReference7() {
        return this.dtoDownload.isDownloadReference7();
    }
    public boolean isDownloadReferenceP() {
        return this.dtoDownload.isDownloadReferenceP();
    }
    public boolean isDownloadReferenceW() {
        return this.dtoDownload.isDownloadReferenceW();
    }
    public boolean isDownloadReferenceN() {
        return this.dtoDownload.isDownloadReferenceN();
    }
    public boolean isDownloadReference15I() {
        return this.dtoDownload.isDownloadReference15I();
    }
    public boolean isDownloadReferenceZero() {
        return this.dtoDownload.isDownloadReferenceZero();
    }
    public boolean isDownloadReference6() {
        return this.dtoDownload.isDownloadReference6();
    }
    public boolean isDownloadReferenceC() {
        return this.dtoDownload.isDownloadReferenceC();
    }

    public boolean isDownloadAlternativeNone() {
        return this.dtoDownload.isDownloadAlternativeNone();
    }
    public boolean isDownloadAlternative7() {
        return this.dtoDownload.isDownloadAlternative7();
    }
    public boolean isDownloadAlternativeP() {
        return this.dtoDownload.isDownloadAlternativeP();
    }
    public boolean isDownloadAlternativeW() {
        return this.dtoDownload.isDownloadAlternativeW();
    }
    public boolean isDownloadAlternativeN() {
        return this.dtoDownload.isDownloadAlternativeN();
    }
    public boolean isDownloadAlternative15I() {
        return this.dtoDownload.isDownloadAlternative15I();
    }
    public boolean isDownloadAlternativeZero() {
        return this.dtoDownload.isDownloadAlternativeZero();
    }
    public boolean isDownloadAlternative6() {
        return this.dtoDownload.isDownloadAlternative6();
    }
    public boolean isDownloadAlternativeC() {
        return this.dtoDownload.isDownloadAlternativeC();
    }


}