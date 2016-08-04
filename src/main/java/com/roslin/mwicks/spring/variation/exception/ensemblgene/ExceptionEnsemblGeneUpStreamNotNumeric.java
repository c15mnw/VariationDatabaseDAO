package com.roslin.mwicks.spring.variation.exception.ensemblgene;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionEnsemblGeneUpStreamNotNumeric extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeNotFound with the given detail message.
     */
    public ExceptionEnsemblGeneUpStreamNotNumeric(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeNotFound with the given root cause.
     */
    public ExceptionEnsemblGeneUpStreamNotNumeric(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeNotFound with the given detail message and root cause.
     */
    public ExceptionEnsemblGeneUpStreamNotNumeric(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
