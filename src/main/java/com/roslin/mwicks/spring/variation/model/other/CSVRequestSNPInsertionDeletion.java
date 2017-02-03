package com.roslin.mwicks.spring.variation.model.other;

import java.util.ArrayList;
import java.util.Collection;

import com.roslin.mwicks.spring.variation.dto.web.objects.snpinsertiondeletion.DTOSearchSNPInsertionDeletion;


@SuppressWarnings("serial")
public class CSVRequestSNPInsertionDeletion extends ArrayList<DTOSearchSNPInsertionDeletion> {

    // Constants ----------------------------------------------------------------------------------

	
	// Properties ---------------------------------------------------------------------------------
    private DTOSearchSNPInsertionDeletion dtoSearch;

    
    // Constructor --------------------------------------------------------------------------------
	public CSVRequestSNPInsertionDeletion() {
    }

    public CSVRequestSNPInsertionDeletion(DTOSearchSNPInsertionDeletion dtoSearch, Collection<? extends DTOSearchSNPInsertionDeletion> c) {
     
    	super(c);

    	this.dtoSearch = dtoSearch;
    }

    
    // Getters ------------------------------------------------------------------------------------
    public DTOSearchSNPInsertionDeletion getDTODownloadSNPInsertionDeletion() {
        return this.dtoSearch;
    }

    
    // Setters ------------------------------------------------------------------------------------
    public void setDTOSearchSNPInsertionDeletion(DTOSearchSNPInsertionDeletion dtoSearch) {
        this.dtoSearch = dtoSearch;
    }

    
    // Helpers ------------------------------------------------------------------------------------

}