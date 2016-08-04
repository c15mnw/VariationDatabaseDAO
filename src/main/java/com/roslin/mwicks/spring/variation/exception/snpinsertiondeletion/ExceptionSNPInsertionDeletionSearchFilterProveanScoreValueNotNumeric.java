package com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPInsertionDeletionSearchFilterProveanScoreValueNotNumeric extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPInsertionDeletionHighCoordinateNotNumeric with the given detail message.
     */
    public ExceptionSNPInsertionDeletionSearchFilterProveanScoreValueNotNumeric(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionHighCoordinateNotNumeric with the given root cause.
     */
    public ExceptionSNPInsertionDeletionSearchFilterProveanScoreValueNotNumeric(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionHighCoordinateNotNumeric with the given detail message and root cause.
     */
    public ExceptionSNPInsertionDeletionSearchFilterProveanScoreValueNotNumeric(String message, Throwable cause) {
        
    	super(message, cause);
    }
}
