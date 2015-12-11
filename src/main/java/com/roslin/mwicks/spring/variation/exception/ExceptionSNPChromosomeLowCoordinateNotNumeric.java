package com.roslin.mwicks.spring.variation.exception;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPChromosomeLowCoordinateNotNumeric extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeLowCoordinateNotNumeric with the given detail message.
     */
    public ExceptionSNPChromosomeLowCoordinateNotNumeric(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeLowCoordinateNotNumeric with the given root cause.
     */
    public ExceptionSNPChromosomeLowCoordinateNotNumeric(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeLowCoordinateNotNumeric with the given detail message and root cause.
     */
    public ExceptionSNPChromosomeLowCoordinateNotNumeric(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
