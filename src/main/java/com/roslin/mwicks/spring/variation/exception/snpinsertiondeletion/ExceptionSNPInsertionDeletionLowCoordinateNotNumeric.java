package com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPInsertionDeletionLowCoordinateNotNumeric extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPInsertionDeletionLowCoordinateNotNumeric with the given detail message.
     */
    public ExceptionSNPInsertionDeletionLowCoordinateNotNumeric(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionLowCoordinateNotNumeric with the given root cause.
     */
    public ExceptionSNPInsertionDeletionLowCoordinateNotNumeric(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionLowCoordinateNotNumeric with the given detail message and root cause.
     */
    public ExceptionSNPInsertionDeletionLowCoordinateNotNumeric(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
