package com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPInsertionDeletionLowCoordinateNotSupplied extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeLowCoordinateNotNumeric with the given detail message.
     */
    public ExceptionSNPInsertionDeletionLowCoordinateNotSupplied(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeLowCoordinateNotNumeric with the given root cause.
     */
    public ExceptionSNPInsertionDeletionLowCoordinateNotSupplied(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeLowCoordinateNotNumeric with the given detail message and root cause.
     */
    public ExceptionSNPInsertionDeletionLowCoordinateNotSupplied(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
