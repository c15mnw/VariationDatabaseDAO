package com.roslin.mwicks.spring.variation.exception.snpchromosome;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPChromosomeSearchFilterSiftConservationScoreValueNotNumeric extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeHighCoordinateNotNumeric with the given detail message.
     */
    public ExceptionSNPChromosomeSearchFilterSiftConservationScoreValueNotNumeric(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeHighCoordinateNotNumeric with the given root cause.
     */
    public ExceptionSNPChromosomeSearchFilterSiftConservationScoreValueNotNumeric(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeHighCoordinateNotNumeric with the given detail message and root cause.
     */
    public ExceptionSNPChromosomeSearchFilterSiftConservationScoreValueNotNumeric(String message, Throwable cause) {
        
    	super(message, cause);
    }
}
