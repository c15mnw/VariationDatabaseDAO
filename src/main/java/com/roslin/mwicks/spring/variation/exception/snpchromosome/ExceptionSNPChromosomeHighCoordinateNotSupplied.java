package com.roslin.mwicks.spring.variation.exception.snpchromosome;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPChromosomeHighCoordinateNotSupplied extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeLowCoordinateNotNumeric with the given detail message.
     */
    public ExceptionSNPChromosomeHighCoordinateNotSupplied(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeLowCoordinateNotNumeric with the given root cause.
     */
    public ExceptionSNPChromosomeHighCoordinateNotSupplied(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeLowCoordinateNotNumeric with the given detail message and root cause.
     */
    public ExceptionSNPChromosomeHighCoordinateNotSupplied(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
