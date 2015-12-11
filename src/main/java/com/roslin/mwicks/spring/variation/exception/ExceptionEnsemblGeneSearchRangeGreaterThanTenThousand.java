package com.roslin.mwicks.spring.variation.exception;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionEnsemblGeneSearchRangeGreaterThanTenThousand extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeNotFound with the given detail message.
     */
    public ExceptionEnsemblGeneSearchRangeGreaterThanTenThousand(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeNotFound with the given root cause.
     */
    public ExceptionEnsemblGeneSearchRangeGreaterThanTenThousand(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeNotFound with the given detail message and root cause.
     */
    public ExceptionEnsemblGeneSearchRangeGreaterThanTenThousand(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
