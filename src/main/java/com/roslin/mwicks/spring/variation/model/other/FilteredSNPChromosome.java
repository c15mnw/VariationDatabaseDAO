package com.roslin.mwicks.spring.variation.model.other;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.roslin.mwicks.spring.variation.dto.web.SearchFilterProteinAlignNumber;
import com.roslin.mwicks.spring.variation.dto.web.SearchFilterProveanScore;
import com.roslin.mwicks.spring.variation.dto.web.SearchFilterSiftConservationScore;
import com.roslin.mwicks.spring.variation.dto.web.SearchFilterSiftScore;
import com.roslin.mwicks.spring.variation.dto.web.SearchFilterTotalNumberSeqAligned;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome01;

/**
 * An entity class which contains the information of a single SNPChromosome1 Table Row.
 * @author Mike Wicks
 */

@SuppressWarnings("serial")
public class FilteredSNPChromosome extends ArrayList<SNPChromosome> {
    
    // Constants ----------------------------------------------------------------------------------
	protected static final String SIFT_SCORE_ABOVE = "SIFT_SCORE_ABOVE";
	protected static final String SIFT_SCORE_BELOW = "SIFT_SCORE_BELOW";

	protected static final String SIFT_CONSERVATION_SCORE_ABOVE = "SIFT_CONSERVATION_SCORE_ABOVE";
	protected static final String SIFT_CONSERVATION_SCORE_BELOW = "SIFT_CONSERVATION_SCORE_BELOW";

	protected static final String PROTEIN_ALIGN_NUMBER_ABOVE = "PROTEIN_ALIGN_NUMBER_ABOVE";
	protected static final String PROTEIN_ALIGN_NUMBER_BELOW = "PROTEIN_ALIGN_NUMBER_BELOW";

	protected static final String TOTAL_NUMBER_SEQ_ALIGNED_ABOVE = "TOTAL_NUMBER_SEQ_ALIGNED_ABOVE";
	protected static final String TOTAL_NUMBER_SEQ_ALIGNED_BELOW = "TOTAL_NUMBER_SEQ_ALIGNED_BELOW";

	protected static final String PROVEAN_SCORE_ABOVE = "PROVEAN_SCORE_ABOVE";
	protected static final String PROVEAN_SCORE_BELOW = "PROVEAN_SCORE_BELOW";

    // Properties ----------------------------------------------------------------------------------
    private double searchFilterSiftScoreValue;
    private double searchFilterSiftConservationScoreValue;
    private long searchFilterProteinAlignNumberValue;
    private long searchFilterTotalNumberSeqAlignedValue;
    private double searchFilterProveanScoreValue;

    private SearchFilterSiftScore searchFilterSiftScore;
    private SearchFilterSiftConservationScore searchFilterSiftConservationScore;
    private SearchFilterProteinAlignNumber searchFilterProteinAlignNumber;
    private SearchFilterTotalNumberSeqAligned searchFilterTotalNumberSeqAligned;
    private SearchFilterProveanScore searchFilterProveanScore;
    
    private List<SNPChromosome> filteredSNPChromosomes;

    
    // Constructors --------------------------------------------------------------------------------
	public FilteredSNPChromosome() {
    }

    public FilteredSNPChromosome(
    		double searchFilterSiftScoreValue, 
    		double searchFilterSiftConservationScoreValue, 
    		long searchFilterProteinAlignNumberValue, 
    		long searchFilterTotalNumberSeqAlignedValue, 
    		double searchFilterProveanScoreValue,
    		SearchFilterSiftScore searchFilterSiftScore,
    	    SearchFilterSiftConservationScore searchFilterSiftConservationScore,
    	    SearchFilterProteinAlignNumber searchFilterProteinAlignNumber,
    	    SearchFilterTotalNumberSeqAligned searchFilterTotalNumberSeqAligned,
    	    SearchFilterProveanScore searchFilterProveanScore,
    		Collection<? extends SNPChromosome> c) {
     
    	super(c);

    	this.searchFilterSiftScoreValue = searchFilterSiftScoreValue;
    	this.searchFilterSiftConservationScoreValue = searchFilterSiftConservationScoreValue;
    	this.searchFilterProteinAlignNumberValue = searchFilterProteinAlignNumberValue;
    	this.searchFilterTotalNumberSeqAlignedValue = searchFilterTotalNumberSeqAlignedValue;
    	this.searchFilterProveanScoreValue = searchFilterProveanScoreValue;
    	
    	this.searchFilterSiftScore = searchFilterSiftScore;
    	this.searchFilterSiftConservationScore = searchFilterSiftConservationScore;
    	this.searchFilterProteinAlignNumber = searchFilterProteinAlignNumber;
    	this.searchFilterTotalNumberSeqAligned = searchFilterTotalNumberSeqAligned;
    	this.searchFilterProveanScore = searchFilterProveanScore;
    	
    	this.filteredSNPChromosomes = new ArrayList<SNPChromosome>();
    	
    	filterSNPChromsomes();
    }

    
    // Getters ------------------------------------------------------------------------------------
    public double getSearchFilterSiftScoreValue() {
        return this.searchFilterSiftScoreValue;
    }
    public double getSearchFilterSiftConservationScoreValue() {
        return this.searchFilterSiftConservationScoreValue;
    }
    public long getSearchFilterProteinAlignNumberValue() {
        return this.searchFilterProteinAlignNumberValue;
    }
    public long getSearchFilterTotalNumberSeqAlignedValue() {
        return this.searchFilterTotalNumberSeqAlignedValue;
    }
    public double getSearchFilterProveanScoreValue() {
        return this.searchFilterProveanScoreValue;
    }
    public SearchFilterSiftScore getSearchFilterSiftScore() {
        return this.searchFilterSiftScore;
    }
    public SearchFilterSiftConservationScore getSearchFilterSiftConservationScore() {
        return this.searchFilterSiftConservationScore;
    }
    public SearchFilterProteinAlignNumber getSearchFilterProteinAlignNumber() {
        return this.searchFilterProteinAlignNumber;
    }
    public SearchFilterTotalNumberSeqAligned getSearchFilterTotalNumberSeqAligned() {
        return this.searchFilterTotalNumberSeqAligned;
    }
    public SearchFilterProveanScore getSearchFilterProveanScore() {
        return this.searchFilterProveanScore;
    }
    public List<SNPChromosome> getFilteredSNPChromosomes() {
        return this.filteredSNPChromosomes;
    }
    
    public boolean isSearchFilterSiftScoreValueZero() {
        if ( this.searchFilterSiftScoreValue == 0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchFilterSiftConservationScoreValueZero() {
    	if ( this.searchFilterSiftConservationScoreValue == 0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchFilterProteinAlignNumberValueZero() {
    	if ( this.searchFilterProteinAlignNumberValue == 0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchFilterTotalNumberSeqAlignedValueZero() {
    	if ( this.searchFilterTotalNumberSeqAlignedValue == 0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchFilterProveanScoreValueZero() {
    	if ( this.searchFilterProveanScoreValue == 0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchFilterSiftScoreAbove() {
    	if ( this.searchFilterSiftScore.name().equals(SIFT_SCORE_ABOVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchFilterSiftScoreBelow() {
    	if ( this.searchFilterSiftScore.name().equals(SIFT_SCORE_BELOW)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchFilterSiftConservationScoreAbove() {
    	if ( this.searchFilterSiftConservationScore.name().equals(SIFT_CONSERVATION_SCORE_ABOVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchFilterSiftConservationScoreBelow() {
    	if ( this.searchFilterSiftConservationScore.name().equals(SIFT_CONSERVATION_SCORE_BELOW)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchFilterProteinAlignNumberAbove() {
    	if ( this.searchFilterProteinAlignNumber.name().equals(PROTEIN_ALIGN_NUMBER_ABOVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchFilterProteinAlignNumberBelow() {
    	if ( this.searchFilterProteinAlignNumber.name().equals(PROTEIN_ALIGN_NUMBER_BELOW)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchFilterTotalNumberSeqAlignedAbove() {
    	if ( this.searchFilterTotalNumberSeqAligned.name().equals(TOTAL_NUMBER_SEQ_ALIGNED_ABOVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchFilterTotalNumberSeqAlignedBelow() {
    	if ( this.searchFilterTotalNumberSeqAligned.name().equals(TOTAL_NUMBER_SEQ_ALIGNED_BELOW)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isSearchFilterProveanScoreAbove() {
    	if ( this.searchFilterProveanScore.name().equals(PROVEAN_SCORE_ABOVE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isSearchFilterProveanScoreBelow() {
    	if ( this.searchFilterProveanScore.name().equals(PROVEAN_SCORE_BELOW)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    // Setters ------------------------------------------------------------------------------------
    public void setSearchFilterSiftScoreValue(double searchFilterSiftScoreValue) {
    	this.searchFilterSiftScoreValue = searchFilterSiftScoreValue;
    }
    public void setSearchFilterSiftConservationScoreValue(double searchFilterSiftConservationScoreValue) {
    	this.searchFilterSiftConservationScoreValue = searchFilterSiftConservationScoreValue;
    }
    public void setSearchFilterProteinAlignNumberValue(long searchFilterProteinAlignNumberValue) {
    	this.searchFilterProteinAlignNumberValue = searchFilterProteinAlignNumberValue;
    }
    public void setSearchFilterTotalNumberSeqAlignedValue(long searchFilterTotalNumberSeqAlignedValue) {
    	this.searchFilterTotalNumberSeqAlignedValue = searchFilterTotalNumberSeqAlignedValue;
    }
    public void setSearchFilterProveanScoreValue(double searchFilterProveanScoreValue) {
    	this.searchFilterProveanScoreValue = searchFilterProveanScoreValue;
    }
    public void setSearchFilterSiftScore(SearchFilterSiftScore searchFilterSiftScore) {
        this.searchFilterSiftScore = searchFilterSiftScore;
    }
    public void setSearchFilterSiftConservationScore(SearchFilterSiftConservationScore searchFilterSiftConservationScore) {
        this.searchFilterSiftConservationScore = searchFilterSiftConservationScore;
    }
    public void setSearchFilterProteinAlignNumber(SearchFilterProteinAlignNumber searchFilterProteinAlignNumber) {
        this.searchFilterProteinAlignNumber = searchFilterProteinAlignNumber;
    }
    public void setSearchFilterTotalNumberSeqAligned(SearchFilterTotalNumberSeqAligned searchFilterTotalNumberSeqAligned) {
        this.searchFilterTotalNumberSeqAligned = searchFilterTotalNumberSeqAligned;
    }
    public void setSearchFilterProveanScore(SearchFilterProveanScore searchFilterProveanScore) {
        this.searchFilterProveanScore = searchFilterProveanScore;
    }
    public void setFilteredSNPChromosomes(ArrayList<SNPChromosome> filteredSNPChromosomes) {
        this.filteredSNPChromosomes = filteredSNPChromosomes;
    }

    // Helpers ------------------------------------------------------------------------------------
    public void filterSNPChromsomes() {

        Iterator<SNPChromosome> iteratorSNPChromosome = this.iterator();
        
     	while (iteratorSNPChromosome.hasNext()) {
    		
     		SNPChromosome snpchromosome = iteratorSNPChromosome.next();

     		boolean addRow = false;
     		
     		// Are there any Filters set?
     		if ( this.isSearchFilterSiftScoreValueZero() && 
     				this.isSearchFilterSiftConservationScoreValueZero() && 
     				this.isSearchFilterProteinAlignNumberValueZero() && 
     				this.isSearchFilterTotalNumberSeqAlignedValueZero() && 
     				this.isSearchFilterProveanScoreValueZero() ) {

     			// No - All Zeroes, therefore cannot filter, pass through in list to out list
     			addRow = true;
    		}
     		// Yes - Filter values set
     		else {
     			// Does the input row have any Provean/Sift data
     			if ( snpchromosome.getScoreSift() == 0 &&
     					snpchromosome.getScoreConservation() == 0 &&
     					snpchromosome.getProteinAlignNumber() == 0 &&
     					snpchromosome.getTotalAlignSequenceNumber() == 0 && 
     					snpchromosome.getScoreProvean() == 0 ) {
     				
     				// No data on the row - Therefore IGNORE
     				addRow = false;
     			}
     			// Yes data in the row - check values
     			else {
     				// searchFilterProveanScoreValue;
    				if ( this.isSearchFilterProveanScoreAbove() ) {
    					if ( !this.isSearchFilterProveanScoreValueZero() ) {
    						if ( snpchromosome.getScoreProvean() > this.searchFilterProveanScoreValue ) {
    							addRow = true;
    						}
    					}
    				}
    				else {
    					if ( !this.isSearchFilterProveanScoreValueZero() ) {
    						if ( snpchromosome.getScoreProvean() < this.searchFilterProveanScoreValue ) {
      							addRow = true;
    						}
    					}
     				}
     				// searchFilterSiftScoreValue;
     				if ( this.isSearchFilterSiftScoreAbove()) {
     				    if ( !this.isSearchFilterSiftScoreValueZero() ) {
     				        if ( snpchromosome.getScoreSift() > this.searchFilterSiftScoreValue ) {
     				        	addRow = true;
     				        }
     				    }
     				}
     				else {
     					if ( !this.isSearchFilterSiftScoreValueZero() ) {
     						if ( snpchromosome.getScoreSift() < this.searchFilterSiftScoreValue ) {
     							addRow = true;
     						}
     					}
     				}
     				// searchFilterSiftConservationScoreValue
     				if ( this.isSearchFilterSiftConservationScoreAbove() ) {
     					if ( !this.isSearchFilterSiftConservationScoreValueZero() ) {
     						if ( snpchromosome.getScoreConservation() > this.searchFilterSiftConservationScoreValue ) {
     							addRow = true;
     						}
     					}
     				}
     				else {
     					if ( !this.isSearchFilterSiftConservationScoreValueZero() ) {
     						if ( snpchromosome.getScoreConservation() < this.searchFilterSiftConservationScoreValue ) {
     							addRow = true;
     						}
     					}
     				}
     				// searchFilterProteinAlignNumberValue
     				if ( this.isSearchFilterProteinAlignNumberAbove() ) {
     					if ( !this.isSearchFilterProteinAlignNumberValueZero() ) {
     						if ( snpchromosome.getProteinAlignNumber() > this.searchFilterProteinAlignNumberValue ) {
     							addRow = true;
    						}
     					}
     				}
     				else {
     					if ( !this.isSearchFilterProteinAlignNumberValueZero() ) {
     						if ( snpchromosome.getProteinAlignNumber() < this.searchFilterProteinAlignNumberValue ) {
     							addRow = true;
     						}
     					}
     				}
     				// searchFilterTotalNumberSeqAlignedValue
     				if ( this.isSearchFilterTotalNumberSeqAlignedAbove() ) {
     					if ( !this.isSearchFilterTotalNumberSeqAlignedValueZero() ) {
     						if ( snpchromosome.getTotalAlignSequenceNumber() > this.searchFilterTotalNumberSeqAlignedValue ) {
     							addRow = true;
     						}
     					}
     				}
     				else {
     					if ( !this.isSearchFilterTotalNumberSeqAlignedValueZero() ) {
     						if ( snpchromosome.getTotalAlignSequenceNumber() < this.searchFilterTotalNumberSeqAlignedValue ) {
     							addRow = true;
     						}
     					}
     				}
     			}
     		}

     		// Have we found a row to add; that matches our filter criteria?
     		if ( addRow ) {
         		this.filteredSNPChromosomes.add(snpchromosome);
     		}
     	}
    }
}
