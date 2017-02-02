package com.roslin.mwicks.spring.variation.model.other;

import java.util.ArrayList;
import java.util.Collection;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;

/**
 * An entity class which contains the information of a single SNPChromosome1 Table Row.
 * @author Mike Wicks
 */

@SuppressWarnings("serial")
public class PageSNPChromosome extends ArrayList<SNPChromosome> {
    
    // Properties ----------------------------------------------------------------------------------
    private int pageNumber;
    private int totalPages;
    private long totalElements;
    

    // Constructors --------------------------------------------------------------------------------
	public PageSNPChromosome() {
    }

    public PageSNPChromosome(int pageNumber, int totalPages, long totalElements, Collection<? extends SNPChromosome> c) {
     
    	super(c);

    	this.pageNumber = pageNumber;
    	this.totalPages = totalPages;
    	this.totalElements = totalElements;
    }

    
    // Getters ------------------------------------------------------------------------------------
    public int getPageNumber() {
        return this.pageNumber;
    }
    public int getTotalPages() {
        return this.totalPages;
    }
    public long getTotalElements() {
        return this.totalElements;
    }

    
    // Setters ------------------------------------------------------------------------------------
    public void setPageNumber(int pageNumber) {
    	this.pageNumber = pageNumber;
    }
    public void setTotalPages(int totalPages) {
    	this.totalPages = totalPages;
    }
    public void setTotalElements(long totalElements) {
    	this.totalElements = totalElements;
    }
    

    // Helpers ------------------------------------------------------------------------------------
    public void incrementPageNumber() {
    	this.pageNumber++;
    }
    public void incrementTotalPages() {
    	this.totalPages++;
    }
    public void incrementTotalElements() {
    	this.totalElements++;
    }


}
