package com.roslin.mwicks.spring.variation.exception.snpchromosome;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPChromosomeLowCoordinateNotSupplied extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeLowCoordinateNotNumeric with the given detail message.
     */
    public ExceptionSNPChromosomeLowCoordinateNotSupplied(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeLowCoordinateNotNumeric with the given root cause.
     */
    public ExceptionSNPChromosomeLowCoordinateNotSupplied(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeLowCoordinateNotNumeric with the given detail message and root cause.
     */
    public ExceptionSNPChromosomeLowCoordinateNotSupplied(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
