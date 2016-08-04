package com.roslin.mwicks.spring.variation.exception.ensemblgene;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionEnsemblGeneUpStreamSearchRangeGreaterThanTenThousand extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeNotFound with the given detail message.
     */
    public ExceptionEnsemblGeneUpStreamSearchRangeGreaterThanTenThousand(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeNotFound with the given root cause.
     */
    public ExceptionEnsemblGeneUpStreamSearchRangeGreaterThanTenThousand(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeNotFound with the given detail message and root cause.
     */
    public ExceptionEnsemblGeneUpStreamSearchRangeGreaterThanTenThousand(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
