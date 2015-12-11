package com.roslin.mwicks.spring.variation.exception;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPChromosomeHighCoordinateNotNumeric extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeHighCoordinateNotNumeric with the given detail message.
     */
    public ExceptionSNPChromosomeHighCoordinateNotNumeric(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeHighCoordinateNotNumeric with the given root cause.
     */
    public ExceptionSNPChromosomeHighCoordinateNotNumeric(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeHighCoordinateNotNumeric with the given detail message and root cause.
     */
    public ExceptionSNPChromosomeHighCoordinateNotNumeric(String message, Throwable cause) {
        
    	super(message, cause);
    }
}
