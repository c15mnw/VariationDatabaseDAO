package com.roslin.mwicks.spring.variation.model.other;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.roslin.mwicks.spring.variation.dto.web.enums.SearchAlternativeBreed;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchChromosome;
import com.roslin.mwicks.spring.variation.dto.web.enums.SearchReferenceBreed;
import com.roslin.mwicks.spring.variation.format.CustomDateToStringStyle;

import com.roslin.mwicks.spring.variation.dto.web.objects.snpinsertiondeletion.DTOSearchSNPInsertionDeletion;

import com.roslin.mwicks.utility.ObjectConverter;
import com.roslin.mwicks.utility.StringUtility;

import javax.persistence.*;

import java.util.Date;

/**
 * An entity class which contains the information of a single SNPInsertionDeletion Table Row.
 * @author Mike Wicks
 */

public class SNPInsertionDeletionRequestData {
    
    // Constants ----------------------------------------------------------------------------------
	protected static final String CHROMOSOME_NONE = "CHROMOSOME_NONE";
	protected static final String CHROMOSOME_1 = "CHROMOSOME_1";
	protected static final String CHROMOSOME_2 = "CHROMOSOME_2";
	protected static final String CHROMOSOME_3 = "CHROMOSOME_3";
	protected static final String CHROMOSOME_4 = "CHROMOSOME_4";
	protected static final String CHROMOSOME_5 = "CHROMOSOME_5";
	protected static final String CHROMOSOME_6 = "CHROMOSOME_6";
	protected static final String CHROMOSOME_7 = "CHROMOSOME_7";
	protected static final String CHROMOSOME_8 = "CHROMOSOME_8";
	protected static final String CHROMOSOME_9 = "CHROMOSOME_9";
	protected static final String CHROMOSOME_10 = "CHROMOSOME_10";
	protected static final String CHROMOSOME_11 = "CHROMOSOME_11";
	protected static final String CHROMOSOME_12 = "CHROMOSOME_12";
	protected static final String CHROMOSOME_13 = "CHROMOSOME_13";
	protected static final String CHROMOSOME_14 = "CHROMOSOME_14";
	protected static final String CHROMOSOME_15 = "CHROMOSOME_15";
	protected static final String CHROMOSOME_16 = "CHROMOSOME_16";
	protected static final String CHROMOSOME_17 = "CHROMOSOME_17";
	protected static final String CHROMOSOME_18 = "CHROMOSOME_18";
	protected static final String CHROMOSOME_19 = "CHROMOSOME_19";
	protected static final String CHROMOSOME_20 = "CHROMOSOME_20";
	protected static final String CHROMOSOME_21 = "CHROMOSOME_21";
	protected static final String CHROMOSOME_22 = "CHROMOSOME_22";
	protected static final String CHROMOSOME_23 = "CHROMOSOME_23";
	protected static final String CHROMOSOME_24 = "CHROMOSOME_24";
	protected static final String CHROMOSOME_25 = "CHROMOSOME_25";
	protected static final String CHROMOSOME_26 = "CHROMOSOME_26";
	protected static final String CHROMOSOME_27 = "CHROMOSOME_27";
	protected static final String CHROMOSOME_28 = "CHROMOSOME_28";
	protected static final String CHROMOSOME_32 = "CHROMOSOME_32";
	protected static final String CHROMOSOME_LGE22C19W28_E50C23 = "CHROMOSOME_LGE22C19W28_E50C23";
	protected static final String CHROMOSOME_LGE64 = "CHROMOSOME_LGE64";
	protected static final String CHROMOSOME_W = "CHROMOSOME_W";
	protected static final String CHROMOSOME_Z = "CHROMOSOME_Z";

	protected static final String ONLY_NONE = "NONE";
	protected static final String ONLY_1 = "1";
	protected static final String ONLY_2 = "2";
	protected static final String ONLY_3 = "3";
	protected static final String ONLY_4 = "4";
	protected static final String ONLY_5 = "5";
	protected static final String ONLY_6 = "6";
	protected static final String ONLY_7 = "7";
	protected static final String ONLY_8 = "8";
	protected static final String ONLY_9 = "9";
	protected static final String ONLY_10 = "10";
	protected static final String ONLY_11 = "11";
	protected static final String ONLY_12 = "12";
	protected static final String ONLY_13 = "13";
	protected static final String ONLY_14 = "14";
	protected static final String ONLY_15 = "15";
	protected static final String ONLY_16 = "16";
	protected static final String ONLY_17 = "17";
	protected static final String ONLY_18 = "18";
	protected static final String ONLY_19 = "19";
	protected static final String ONLY_20 = "20";
	protected static final String ONLY_21 = "21";
	protected static final String ONLY_22 = "22";
	protected static final String ONLY_23 = "23";
	protected static final String ONLY_24 = "24";
	protected static final String ONLY_25 = "25";
	protected static final String ONLY_26 = "26";
	protected static final String ONLY_27 = "27";
	protected static final String ONLY_28 = "28";
	protected static final String ONLY_32 = "32";
	protected static final String ONLY_LGE22C19W28_E50C23 = "LGE22C19W28_E50C23";
	protected static final String ONLY_LGE64 = "LGE64";
	protected static final String ONLY_W = "W";
	protected static final String ONLY_Z = "Z";

	protected static final String BREED_NONE = "BREED_NONE";
	protected static final String BREED_Z = "BREED_Z";
	protected static final String BREED_W = "BREED_W";
	protected static final String BREED_N = "BREED_N";
	protected static final String BREED_L = "BREED_L";
	protected static final String BREED_J = "BREED_J";
	protected static final String BREED_I = "BREED_I";
			
	protected static final String ONLY_BREED_NONE = "NONE";
	protected static final String ONLY_BREED_Z = "Z";
	protected static final String ONLY_BREED_W = "W";
	protected static final String ONLY_BREED_N = "N";
	protected static final String ONLY_BREED_L = "L";
	protected static final String ONLY_BREED_J = "J";
	protected static final String ONLY_BREED_I = "I";
			
	
    // Properties  --------------------------------------------------------------------------------
    private SearchChromosome chromosome;

    private String lowRange;
    private String highRange;

    private SearchReferenceBreed reference;
    private SearchAlternativeBreed alternative;

    
    // Constructor --------------------------------------------------------------------------------
    // 0 Attributes (NONE)
    public SNPInsertionDeletionRequestData() {

        this.chromosome = SearchChromosome.CHROMOSOME_NONE;
        this.lowRange = "";
        this.highRange = "";
        this.reference = SearchReferenceBreed.BREED_NONE;
        this.alternative = SearchAlternativeBreed.BREED_NONE;
    }
   
    // ALL Attributes (5)
    public SNPInsertionDeletionRequestData( 
            SearchChromosome chromosome,
            String lowRange,
            String highRange,
            SearchReferenceBreed reference,
            SearchAlternativeBreed alternative ) {

        this.chromosome = chromosome;
        this.lowRange = lowRange;
        this.highRange = highRange;
        this.reference = reference;
        this.alternative = alternative;
    }

    // ALL Attributes (5) - Strings
    public SNPInsertionDeletionRequestData( 
            String chromosome,
            String lowRange,
            String highRange,
            String reference,
            String alternative ) {

        this.setChromosome( chromosome );
        this.lowRange = lowRange;
        this.highRange = highRange;
        this.setReferenceBreed( reference ) ;
        this.setAlternativeBreed( alternative );
    }
    

    // Getters ------------------------------------------------------------------------------------
    public SearchChromosome getChromosome() {
        return this.chromosome;
    }
    public String getLowRange() {
        return this.lowRange;
    }
    public String getHighRange() {
        return this.highRange;
    }
    public SearchReferenceBreed getReferenceBreed() {
        return this.reference;
    }
    public SearchAlternativeBreed getAlternativeBreed() {
        return this.alternative;
    }

    
    // Setters ------------------------------------------------------------------------------------
    public void setChromosome(SearchChromosome chromosome) {
        this.chromosome = chromosome;
    }
    public void setLowRange(String lowRange) {
        this.lowRange = lowRange;
    }
    public void setHighRange(String highRange) {
        this.highRange = highRange;
    }
    public void setReferenceBreed(SearchReferenceBreed reference) {
        this.reference = reference;
    }
    public void setAlternativeBreed(SearchAlternativeBreed alternative) {
        this.alternative = alternative;
    }
    
    
    // Getters As Other Types ---------------------------------------------------------------------
    public String getSearchChromosomeAsString() {
        
        String rtnString = "";
        
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_NONE) ) {
            rtnString = ONLY_NONE;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_1) ) {
            rtnString = ONLY_1;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_2) ) {
            rtnString = ONLY_2;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_3) ) {
            rtnString = ONLY_3;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_4) ) {
            rtnString = ONLY_4;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_5) ) {
            rtnString = ONLY_5;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_6) ) {
            rtnString = ONLY_6;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_7) ) {
            rtnString = ONLY_7;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_8) ) {
            rtnString = ONLY_8;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_9) ) {
            rtnString = ONLY_9;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_10) ) {
            rtnString = ONLY_10;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_11) ) {
            rtnString = ONLY_11;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_11) ) {
            rtnString = ONLY_11;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_12) ) {
            rtnString = ONLY_12;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_13) ) {
            rtnString = ONLY_13;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_14) ) {
            rtnString = ONLY_14;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_15) ) {
            rtnString = ONLY_15;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_16) ) {
            rtnString = ONLY_16;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_17) ) {
            rtnString = ONLY_17;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_18) ) {
            rtnString = ONLY_18;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_19) ) {
            rtnString = ONLY_19;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_20) ) {
            rtnString = ONLY_20;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_21) ) {
            rtnString = ONLY_21;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_22) ) {
            rtnString = ONLY_22;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_23) ) {
            rtnString = ONLY_23;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_24) ) {
            rtnString = ONLY_24;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_25) ) {
            rtnString = ONLY_25;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_26) ) {
            rtnString = ONLY_26;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_27) ) {
            rtnString = ONLY_27;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_28) ) {
            rtnString = ONLY_28;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_32) ) {
            rtnString = ONLY_32;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_W) ) {
            rtnString = ONLY_W;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_Z) ) {
            rtnString = ONLY_Z;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_LGE22C19W28_E50C23) ) {
            rtnString = ONLY_LGE22C19W28_E50C23;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_LGE64) ) {
            rtnString = ONLY_LGE64;
    	}
    	
    	return rtnString;
    }

    public int getLowRangeAsInt(){

        return ObjectConverter.convert( StringUtility.getIntegerStringFromFormatted( this.lowRange ), Integer.class);
    }

    public int getHighRangeAsInt(){

        return ObjectConverter.convert( StringUtility.getIntegerStringFromFormatted( this.highRange ), Integer.class);
    }

    public String getReferenceBreedAsString() {

        String rtnString = "";
        
    	if ( this.reference.equals(SearchReferenceBreed.BREED_NONE)) {
            rtnString = ONLY_BREED_NONE;
    	}
    	if ( this.reference.equals(SearchReferenceBreed.BREED_Z)) {
            rtnString = ONLY_BREED_Z;
    	}
    	if ( this.reference.equals(SearchReferenceBreed.BREED_W)) {
            rtnString = ONLY_BREED_W;
    	}
    	if ( this.reference.equals(SearchReferenceBreed.BREED_N)) {
            rtnString = ONLY_BREED_N;
    	}
    	if ( this.reference.equals(SearchReferenceBreed.BREED_I)) {
            rtnString = ONLY_BREED_I;
    	}
    	if ( this.reference.equals(SearchReferenceBreed.BREED_L)) {
            rtnString = ONLY_BREED_L;
    	}
    	if ( this.reference.equals(SearchReferenceBreed.BREED_J)) {
            rtnString = ONLY_BREED_J;
    	}
    	
    	return rtnString;
    }
    
    public String getAlternativeBreedAsString() {

        String rtnString = "";
        
    	if ( this.alternative.equals(SearchAlternativeBreed.BREED_NONE)) {
            rtnString = ONLY_BREED_NONE;
    	}
    	if ( this.alternative.equals(SearchAlternativeBreed.BREED_Z)) {
            rtnString = ONLY_BREED_Z;
    	}
    	if ( this.alternative.equals(SearchAlternativeBreed.BREED_W)) {
            rtnString = ONLY_BREED_W;
    	}
    	if ( this.alternative.equals(SearchAlternativeBreed.BREED_N)) {
            rtnString = ONLY_BREED_N;
    	}
    	if ( this.alternative.equals(SearchAlternativeBreed.BREED_I)) {
            rtnString = ONLY_BREED_I;
    	}
    	if ( this.alternative.equals(SearchAlternativeBreed.BREED_L)) {
            rtnString = ONLY_BREED_L;
    	}
    	if ( this.alternative.equals(SearchAlternativeBreed.BREED_J)) {
            rtnString = ONLY_BREED_J;
    	}
    	
    	return rtnString;
    }
    

    // Setters From Strings -----------------------------------------------------------------------
    public void setChromosome(String chromosome) {
    	if ( chromosome.equals(CHROMOSOME_NONE)) {
            this.chromosome = SearchChromosome.CHROMOSOME_NONE;
    	}
    	if ( chromosome.equals(CHROMOSOME_1)) {
            this.chromosome = SearchChromosome.CHROMOSOME_1;
    	}
    	if ( chromosome.equals(CHROMOSOME_2)) {
            this.chromosome = SearchChromosome.CHROMOSOME_2;
    	}
    	if ( chromosome.equals(CHROMOSOME_3)) {
            this.chromosome = SearchChromosome.CHROMOSOME_3;
    	}
    	if ( chromosome.equals(CHROMOSOME_4)) {
            this.chromosome = SearchChromosome.CHROMOSOME_4;
    	}
    	if ( chromosome.equals(CHROMOSOME_5)) {
            this.chromosome = SearchChromosome.CHROMOSOME_5;
    	}
    	if ( chromosome.equals(CHROMOSOME_6)) {
            this.chromosome = SearchChromosome.CHROMOSOME_6;
    	}
    	if ( chromosome.equals(CHROMOSOME_7)) {
            this.chromosome = SearchChromosome.CHROMOSOME_7;
    	}
    	if ( chromosome.equals(CHROMOSOME_8)) {
            this.chromosome = SearchChromosome.CHROMOSOME_8;
    	}
    	if ( chromosome.equals(CHROMOSOME_9)) {
            this.chromosome = SearchChromosome.CHROMOSOME_9;
    	}
    	if ( chromosome.equals(CHROMOSOME_10)) {
            this.chromosome = SearchChromosome.CHROMOSOME_10;
    	}
    	if ( chromosome.equals(CHROMOSOME_11)) {
            this.chromosome = SearchChromosome.CHROMOSOME_11;
    	}
    	if ( chromosome.equals(CHROMOSOME_11)) {
            this.chromosome = SearchChromosome.CHROMOSOME_11;
    	}
    	if ( chromosome.equals(CHROMOSOME_12)) {
            this.chromosome = SearchChromosome.CHROMOSOME_12;
    	}
    	if ( chromosome.equals(CHROMOSOME_13)) {
            this.chromosome = SearchChromosome.CHROMOSOME_13;
    	}
    	if ( chromosome.equals(CHROMOSOME_14)) {
            this.chromosome = SearchChromosome.CHROMOSOME_14;
    	}
    	if ( chromosome.equals(CHROMOSOME_15)) {
            this.chromosome = SearchChromosome.CHROMOSOME_15;
    	}
    	if ( chromosome.equals(CHROMOSOME_16)) {
            this.chromosome = SearchChromosome.CHROMOSOME_16;
    	}
    	if ( chromosome.equals(CHROMOSOME_17)) {
            this.chromosome = SearchChromosome.CHROMOSOME_17;
    	}
    	if ( chromosome.equals(CHROMOSOME_18)) {
            this.chromosome = SearchChromosome.CHROMOSOME_18;
    	}
    	if ( chromosome.equals(CHROMOSOME_19)) {
            this.chromosome = SearchChromosome.CHROMOSOME_19;
    	}
    	if ( chromosome.equals(CHROMOSOME_20)) {
            this.chromosome = SearchChromosome.CHROMOSOME_20;
    	}
    	if ( chromosome.equals(CHROMOSOME_21)) {
            this.chromosome = SearchChromosome.CHROMOSOME_21;
    	}
    	if ( chromosome.equals(CHROMOSOME_22)) {
            this.chromosome = SearchChromosome.CHROMOSOME_22;
    	}
    	if ( chromosome.equals(CHROMOSOME_23)) {
            this.chromosome = SearchChromosome.CHROMOSOME_23;
    	}
    	if ( chromosome.equals(CHROMOSOME_24)) {
            this.chromosome = SearchChromosome.CHROMOSOME_24;
    	}
    	if ( chromosome.equals(CHROMOSOME_25)) {
            this.chromosome = SearchChromosome.CHROMOSOME_25;
    	}
    	if ( chromosome.equals(CHROMOSOME_26)) {
            this.chromosome = SearchChromosome.CHROMOSOME_26;
    	}
    	if ( chromosome.equals(CHROMOSOME_27)) {
            this.chromosome = SearchChromosome.CHROMOSOME_27;
    	}
    	if ( chromosome.equals(CHROMOSOME_28)) {
            this.chromosome = SearchChromosome.CHROMOSOME_28;
    	}
    	if ( chromosome.equals(CHROMOSOME_32)) {
            this.chromosome = SearchChromosome.CHROMOSOME_32;
    	}
    	if ( chromosome.equals(CHROMOSOME_W)) {
            this.chromosome = SearchChromosome.CHROMOSOME_W;
    	}
    	if ( chromosome.equals(CHROMOSOME_Z)) {
            this.chromosome = SearchChromosome.CHROMOSOME_Z;
    	}
    	if ( chromosome.equals(CHROMOSOME_LGE22C19W28_E50C23)) {
            this.chromosome = SearchChromosome.CHROMOSOME_LGE22C19W28_E50C23;
    	}
    	if ( chromosome.equals(CHROMOSOME_LGE64)) {
            this.chromosome = SearchChromosome.CHROMOSOME_LGE64;
    	}
    	if ( chromosome.equals(ONLY_NONE)) {
            this.chromosome = SearchChromosome.CHROMOSOME_NONE;
    	}
    	if ( chromosome.equals(ONLY_1)) {
            this.chromosome = SearchChromosome.CHROMOSOME_1;
    	}
    	if ( chromosome.equals(ONLY_2)) {
            this.chromosome = SearchChromosome.CHROMOSOME_2;
    	}
    	if ( chromosome.equals(ONLY_3)) {
            this.chromosome = SearchChromosome.CHROMOSOME_3;
    	}
    	if ( chromosome.equals(ONLY_4)) {
            this.chromosome = SearchChromosome.CHROMOSOME_4;
    	}
    	if ( chromosome.equals(ONLY_5)) {
            this.chromosome = SearchChromosome.CHROMOSOME_5;
    	}
    	if ( chromosome.equals(ONLY_6)) {
            this.chromosome = SearchChromosome.CHROMOSOME_6;
    	}
    	if ( chromosome.equals(ONLY_7)) {
            this.chromosome = SearchChromosome.CHROMOSOME_7;
    	}
    	if ( chromosome.equals(ONLY_8)) {
            this.chromosome = SearchChromosome.CHROMOSOME_8;
    	}
    	if ( chromosome.equals(ONLY_9)) {
            this.chromosome = SearchChromosome.CHROMOSOME_9;
    	}
    	if ( chromosome.equals(ONLY_10)) {
            this.chromosome = SearchChromosome.CHROMOSOME_10;
    	}
    	if ( chromosome.equals(ONLY_11)) {
            this.chromosome = SearchChromosome.CHROMOSOME_11;
    	}
    	if ( chromosome.equals(ONLY_11)) {
            this.chromosome = SearchChromosome.CHROMOSOME_11;
    	}
    	if ( chromosome.equals(ONLY_12)) {
            this.chromosome = SearchChromosome.CHROMOSOME_12;
    	}
    	if ( chromosome.equals(ONLY_13)) {
            this.chromosome = SearchChromosome.CHROMOSOME_13;
    	}
    	if ( chromosome.equals(ONLY_14)) {
            this.chromosome = SearchChromosome.CHROMOSOME_14;
    	}
    	if ( chromosome.equals(ONLY_15)) {
            this.chromosome = SearchChromosome.CHROMOSOME_15;
    	}
    	if ( chromosome.equals(ONLY_16)) {
            this.chromosome = SearchChromosome.CHROMOSOME_16;
    	}
    	if ( chromosome.equals(ONLY_17)) {
            this.chromosome = SearchChromosome.CHROMOSOME_17;
    	}
    	if ( chromosome.equals(ONLY_18)) {
            this.chromosome = SearchChromosome.CHROMOSOME_18;
    	}
    	if ( chromosome.equals(ONLY_19)) {
            this.chromosome = SearchChromosome.CHROMOSOME_19;
    	}
    	if ( chromosome.equals(ONLY_20)) {
            this.chromosome = SearchChromosome.CHROMOSOME_20;
    	}
    	if ( chromosome.equals(ONLY_21)) {
            this.chromosome = SearchChromosome.CHROMOSOME_21;
    	}
    	if ( chromosome.equals(ONLY_22)) {
            this.chromosome = SearchChromosome.CHROMOSOME_22;
    	}
    	if ( chromosome.equals(ONLY_23)) {
            this.chromosome = SearchChromosome.CHROMOSOME_23;
    	}
    	if ( chromosome.equals(ONLY_24)) {
            this.chromosome = SearchChromosome.CHROMOSOME_24;
    	}
    	if ( chromosome.equals(ONLY_25)) {
            this.chromosome = SearchChromosome.CHROMOSOME_25;
    	}
    	if ( chromosome.equals(ONLY_26)) {
            this.chromosome = SearchChromosome.CHROMOSOME_26;
    	}
    	if ( chromosome.equals(ONLY_27)) {
            this.chromosome = SearchChromosome.CHROMOSOME_27;
    	}
    	if ( chromosome.equals(ONLY_28)) {
            this.chromosome = SearchChromosome.CHROMOSOME_28;
    	}
    	if ( chromosome.equals(ONLY_32)) {
            this.chromosome = SearchChromosome.CHROMOSOME_32;
    	}
    	if ( chromosome.equals(ONLY_W)) {
            this.chromosome = SearchChromosome.CHROMOSOME_W;
    	}
    	if ( chromosome.equals(ONLY_Z)) {
            this.chromosome = SearchChromosome.CHROMOSOME_Z;
    	}
    	if ( chromosome.equals(ONLY_LGE22C19W28_E50C23)) {
            this.chromosome = SearchChromosome.CHROMOSOME_LGE22C19W28_E50C23;
    	}
    	if ( chromosome.equals(ONLY_LGE64)) {
            this.chromosome = SearchChromosome.CHROMOSOME_LGE64;
    	}
    }
    
    public void setReferenceBreed(String reference) {
    	if ( reference.equals(BREED_NONE)) {
            this.reference = SearchReferenceBreed.BREED_NONE;
    	}
    	if ( reference.equals(BREED_Z)) {
            this.reference = SearchReferenceBreed.BREED_Z;
    	}
    	if ( reference.equals(BREED_W)) {
            this.reference = SearchReferenceBreed.BREED_W;
    	}
    	if ( reference.equals(BREED_N)) {
            this.reference = SearchReferenceBreed.BREED_N;
    	}
    	if ( reference.equals(BREED_L)) {
            this.reference = SearchReferenceBreed.BREED_L;
    	}
    	if ( reference.equals(BREED_I)) {
            this.reference = SearchReferenceBreed.BREED_I;
    	}
    	if ( reference.equals(BREED_J)) {
            this.reference = SearchReferenceBreed.BREED_J;
    	}
    	if ( reference.equals(ONLY_BREED_NONE)) {
            this.reference = SearchReferenceBreed.BREED_NONE;
    	}
    	if ( reference.equals(ONLY_BREED_Z)) {
            this.reference = SearchReferenceBreed.BREED_Z;
    	}
    	if ( reference.equals(ONLY_BREED_W)) {
            this.reference = SearchReferenceBreed.BREED_W;
    	}
    	if ( reference.equals(ONLY_BREED_N)) {
            this.reference = SearchReferenceBreed.BREED_N;
    	}
    	if ( reference.equals(ONLY_BREED_L)) {
            this.reference = SearchReferenceBreed.BREED_L;
    	}
    	if ( reference.equals(ONLY_BREED_J)) {
            this.reference = SearchReferenceBreed.BREED_J;
    	}
    	if ( reference.equals(ONLY_BREED_I)) {
            this.reference = SearchReferenceBreed.BREED_I;
    	}
    }

    public void setAlternativeBreed(String alternative) {
    	if ( alternative.equals(BREED_NONE)) {
            this.alternative = SearchAlternativeBreed.BREED_NONE;
    	}
    	if ( alternative.equals(BREED_Z)) {
            this.alternative = SearchAlternativeBreed.BREED_Z;
    	}
    	if ( alternative.equals(BREED_W)) {
            this.alternative = SearchAlternativeBreed.BREED_W;
    	}
    	if ( alternative.equals(BREED_N)) {
            this.alternative = SearchAlternativeBreed.BREED_N;
    	}
    	if ( alternative.equals(BREED_L)) {
            this.alternative = SearchAlternativeBreed.BREED_L;
    	}
    	if ( alternative.equals(BREED_J)) {
            this.alternative = SearchAlternativeBreed.BREED_J;
    	}
    	if ( alternative.equals(BREED_I)) {
            this.alternative = SearchAlternativeBreed.BREED_I;
    	}
    	if ( alternative.equals(ONLY_BREED_NONE)) {
            this.alternative = SearchAlternativeBreed.BREED_NONE;
    	}
    	if ( alternative.equals(ONLY_BREED_Z)) {
            this.alternative = SearchAlternativeBreed.BREED_Z;
    	}
    	if ( alternative.equals(ONLY_BREED_W)) {
            this.alternative = SearchAlternativeBreed.BREED_W;
    	}
    	if ( alternative.equals(ONLY_BREED_N)) {
            this.alternative = SearchAlternativeBreed.BREED_N;
    	}
    	if ( alternative.equals(ONLY_BREED_L)) {
            this.alternative = SearchAlternativeBreed.BREED_L;
    	}
    	if ( alternative.equals(ONLY_BREED_J)) {
            this.alternative = SearchAlternativeBreed.BREED_J;
    	}
    	if ( alternative.equals(ONLY_BREED_I)) {
            this.alternative = SearchAlternativeBreed.BREED_I;
    	}
    }
    
    
    // Helpers ------------------------------------------------------------------------------------
    public boolean isChromosomeValid() {
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_1)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_2)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_3)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_4)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_5)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_6)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_7)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_8)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_9)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_10)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_11)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_12)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_13)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_14)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_15)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_16)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_17)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_18)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_19)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_20)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_21)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_22)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_23)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_24)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_25)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_26)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_27)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_28)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_32)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_LGE22C19W28_E50C23)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_LGE64)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_W)) {
    		return true;
    	}
    	if ( this.chromosome.equals(SearchChromosome.CHROMOSOME_Z)) {
    		return true;
    	}

    	return false;
    }

    public boolean isLowRangeNumeric() {
    	
    	if ( StringUtility.isItNumberFormat(this.lowRange) ){
    	
    		return true;
    	}
    	else {
    		
    		return false;
    	}
    }

    public boolean isHighRangeNumeric() {
    	
    	if ( StringUtility.isItNumberFormat(this.highRange) ){
    	
    		return true;
    	}
    	else {
    		
    		return false;
    	}
    }
    
    public boolean isLowRangeEmpty() {
    	
    	if ( this.lowRange.equals("") ){
    	
    		return true;
    	}
    	else {
    		
    		return false;
    	}
    }

    public boolean isHighRangeEmpty() {
    	
    	if ( this.highRange.equals("") ){
    	
    		return true;
    	}
    	else {
    		
    		return false;
    	}
    }

    public boolean isLowRangeValid() {

    	if ( !this.isLowRangeEmpty() ) {

    		if ( this.isLowRangeNumeric() ) {
    			
    			return true;
    		}
    	}

    	return false;
    }

    public boolean isHighRangeValid() {

    	if ( !this.isHighRangeEmpty() ) {

    		if ( this.isHighRangeNumeric() ) {
    			
    			return true;
    		}
    	}

    	return false;
    }

    public boolean isReferenceBreedValid() {

    	if ( this.reference.equals(SearchReferenceBreed.BREED_NONE)) {
    		return true;
    	}
    	if ( this.reference.equals(SearchReferenceBreed.BREED_Z)) {
    		return true;
    	}
    	if ( this.reference.equals(SearchReferenceBreed.BREED_W)) {
    		return true;
    	}
    	if ( this.reference.equals(SearchReferenceBreed.BREED_N)) {
    		return true;
    	}
    	if ( this.reference.equals(SearchReferenceBreed.BREED_L)) {
    		return true;
    	}
    	if ( this.reference.equals(SearchReferenceBreed.BREED_J)) {
    		return true;
    	}
    	if ( this.reference.equals(SearchReferenceBreed.BREED_I)) {
    		return true;
    	}

    	return false;
    }

    public boolean isAlternativeBreedValid() {

    	if ( this.alternative.equals(SearchAlternativeBreed.BREED_NONE)) {
    		return true;
    	}
    	if ( this.alternative.equals(SearchAlternativeBreed.BREED_Z)) {
    		return true;
    	}
    	if ( this.alternative.equals(SearchAlternativeBreed.BREED_W)) {
    		return true;
    	}
    	if ( this.alternative.equals(SearchAlternativeBreed.BREED_N)) {
    		return true;
    	}
    	if ( this.alternative.equals(SearchAlternativeBreed.BREED_L)) {
    		return true;
    	}
    	if ( this.alternative.equals(SearchAlternativeBreed.BREED_J)) {
    		return true;
    	}
    	if ( this.alternative.equals(SearchAlternativeBreed.BREED_I)) {
    		return true;
    	}

    	return false;
    }


    /*
     * Is this SNPInsertionDeletionRequestData VALID?
     */
    public boolean isThisAValidSNPInsertionDeletionRequestData(){

        if ( this.isChromosomeValid() &&
        		this.isLowRangeValid() &&
        		this.isHighRangeValid() &&
        		this.isReferenceBreedValid() &&
        		this.isAlternativeBreedValid() ) {

        	return true;
        }
        else {
        	
        	return false;
        }
    }

    
    /*
     * Is this Component the same as the Supplied Component?
     *     
     */
    public boolean isSameAs(SNPInsertionDeletionRequestData snpinsertiondeletionrequestdata){

        if ( this.getChromosome().equals( snpinsertiondeletionrequestdata.getChromosome() ) && 
        	    this.getLowRange().equals( snpinsertiondeletionrequestdata.getLowRange() ) && 
        	    this.getHighRange().equals( snpinsertiondeletionrequestdata.getHighRange() ) && 
        	    this.getReferenceBreed().equals( snpinsertiondeletionrequestdata.getReferenceBreed() ) && 
        	    this.getAlternativeBreed().equals( snpinsertiondeletionrequestdata.getAlternativeBreed() ) 
        	    ) {

        	return true;
        }
        else {

        	return false;
        }
    }


    public void update(
    		String chromosome,
    		String lowRange,
    		String highRange,
    		String reference,
    		String alternative
    		) {

    	this.setChromosome( chromosome );
    	this.lowRange = lowRange;
    	this.highRange = highRange;
    	this.setReferenceBreed( reference );
    	this.setAlternativeBreed( alternative );
    }

    
    public String toString() {
    	
        return ToStringBuilder.reflectionToString(this, new CustomDateToStringStyle());
    }

    // SNPInsertionDeletionRequestData Builder ---------------------------------------------------------------------
    /**
     * Gets a builder which is used to create SNPInsertionDeletionRequestData objects.
     * @return  A new Builder instance.
     */
    public static Builder getBuilder(
    		SearchChromosome chromosome,
    		String lowRange,
    		String highRange,
    		SearchReferenceBreed reference,
    		SearchAlternativeBreed alternative
    		) {
    	
        return new Builder(
        		chromosome,
        		lowRange,
        		highRange,
        		reference,
        		alternative
        		);
    }
    
    /**
     * A Builder class used to create new SNPInsertionDeletion objects.
     */
    public static class Builder {
    	
    	SNPInsertionDeletionRequestData built;

        /**
         * Creates a new Builder instance.
         */
        Builder(
        		SearchChromosome chromosome,
        		String lowRange,
        		String highRange,
        		SearchReferenceBreed reference,
        		SearchAlternativeBreed alternative
        		) {
        	
            built = new SNPInsertionDeletionRequestData();
            
            built.chromosome = chromosome;
            built.lowRange = lowRange;
            built.highRange = highRange;
        	built.reference = reference;
        	built.alternative = alternative;
        }

        /**
         * Builds the new SNPInsertionDeletion object.
         * 
         * @return  The created SNPInsertionDeletion object.
         */
        public SNPInsertionDeletionRequestData build() {
        	
            return built;
        }
    }

    /*
     * Convert a DTOProveanData Object to an ProveanData Object
     */
    public DTOSearchSNPInsertionDeletion convertToDTOSearchSNPInsertionDeletion(){

        DTOSearchSNPInsertionDeletion dtosearchsnpinsertiondeletion =  new DTOSearchSNPInsertionDeletion (
    	    	this.getLowRange(),
    	    	this.getHighRange(),
    	    	this.getReferenceBreed(),
    	    	this.getAlternativeBreed(),
    	    	this.getChromosome()
        		);
    	
        return dtosearchsnpinsertiondeletion;
    }

}
