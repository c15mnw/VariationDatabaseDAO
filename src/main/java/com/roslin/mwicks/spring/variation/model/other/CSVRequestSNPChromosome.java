package com.roslin.mwicks.spring.variation.model.other;

import java.util.ArrayList;
import java.util.Collection;

import com.roslin.mwicks.spring.variation.dto.web.objects.snpchromosome.DTOSearchSNPChromosome;


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

}