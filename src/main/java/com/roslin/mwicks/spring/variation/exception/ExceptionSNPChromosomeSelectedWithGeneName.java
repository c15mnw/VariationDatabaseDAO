package com.roslin.mwicks.spring.variation.exception;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPChromosomeSelectedWithGeneName extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeNotSelected with the given detail message.
     */
    public ExceptionSNPChromosomeSelectedWithGeneName(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeNotSelected with the given root cause.
     */
    public ExceptionSNPChromosomeSelectedWithGeneName(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeNotSelected with the given detail message and root cause.
     */
    public ExceptionSNPChromosomeSelectedWithGeneName(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
