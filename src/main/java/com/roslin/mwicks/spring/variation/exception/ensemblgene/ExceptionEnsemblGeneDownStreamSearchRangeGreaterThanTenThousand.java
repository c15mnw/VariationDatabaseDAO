package com.roslin.mwicks.spring.variation.exception.ensemblgene;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionEnsemblGeneDownStreamSearchRangeGreaterThanTenThousand extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeNotFound with the given detail message.
     */
    public ExceptionEnsemblGeneDownStreamSearchRangeGreaterThanTenThousand(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeNotFound with the given root cause.
     */
    public ExceptionEnsemblGeneDownStreamSearchRangeGreaterThanTenThousand(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeNotFound with the given detail message and root cause.
     */
    public ExceptionEnsemblGeneDownStreamSearchRangeGreaterThanTenThousand(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
