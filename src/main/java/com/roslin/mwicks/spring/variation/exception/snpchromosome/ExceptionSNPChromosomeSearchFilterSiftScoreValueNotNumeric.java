package com.roslin.mwicks.spring.variation.exception.snpchromosome;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPChromosomeSearchFilterSiftScoreValueNotNumeric extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeHighCoordinateNotNumeric with the given detail message.
     */
    public ExceptionSNPChromosomeSearchFilterSiftScoreValueNotNumeric(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeHighCoordinateNotNumeric with the given root cause.
     */
    public ExceptionSNPChromosomeSearchFilterSiftScoreValueNotNumeric(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeHighCoordinateNotNumeric with the given detail message and root cause.
     */
    public ExceptionSNPChromosomeSearchFilterSiftScoreValueNotNumeric(String message, Throwable cause) {
        
    	super(message, cause);
    }
}
