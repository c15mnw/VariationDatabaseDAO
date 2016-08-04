package com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPInsertionDeletionLowCoordinateGreaterThanHighCoordinate extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPInsertionDeletionLowCoordinateGreaterThanHighCoordinate with the given detail message.
     */
    public ExceptionSNPInsertionDeletionLowCoordinateGreaterThanHighCoordinate(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionLowCoordinateGreaterThanHighCoordinate with the given root cause.
     */
    public ExceptionSNPInsertionDeletionLowCoordinateGreaterThanHighCoordinate(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionLowCoordinateGreaterThanHighCoordinate with the given detail message and root cause.
     */
    public ExceptionSNPInsertionDeletionLowCoordinateGreaterThanHighCoordinate(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
