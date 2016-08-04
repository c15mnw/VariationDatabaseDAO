package com.roslin.mwicks.spring.variation.exception.snpchromosome;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPChromosomeNotSelected extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeNotSelected with the given detail message.
     */
    public ExceptionSNPChromosomeNotSelected(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeNotSelected with the given root cause.
     */
    public ExceptionSNPChromosomeNotSelected(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeNotSelected with the given detail message and root cause.
     */
    public ExceptionSNPChromosomeNotSelected(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
