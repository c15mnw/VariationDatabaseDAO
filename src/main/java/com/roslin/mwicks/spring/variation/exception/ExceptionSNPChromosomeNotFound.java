package com.roslin.mwicks.spring.variation.exception;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPChromosomeNotFound extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeNotFound with the given detail message.
     */
    public ExceptionSNPChromosomeNotFound(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeNotFound with the given root cause.
     */
    public ExceptionSNPChromosomeNotFound(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeNotFound with the given detail message and root cause.
     */
    public ExceptionSNPChromosomeNotFound(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
