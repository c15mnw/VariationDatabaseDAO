package com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPInsertionDeletionSearchFilterSiftScoreValueNotNumeric extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPInsertionDeletionHighCoordinateNotNumeric with the given detail message.
     */
    public ExceptionSNPInsertionDeletionSearchFilterSiftScoreValueNotNumeric(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionHighCoordinateNotNumeric with the given root cause.
     */
    public ExceptionSNPInsertionDeletionSearchFilterSiftScoreValueNotNumeric(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionHighCoordinateNotNumeric with the given detail message and root cause.
     */
    public ExceptionSNPInsertionDeletionSearchFilterSiftScoreValueNotNumeric(String message, Throwable cause) {
        
    	super(message, cause);
    }
}
