package com.roslin.mwicks.spring.variation.exception;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPChromosomeSearchRangeGreaterThanOneMillion extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeAlternativeAlleleNotSupplied with the given detail message.
     */
    public ExceptionSNPChromosomeSearchRangeGreaterThanOneMillion(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeAlternativeAlleleNotSupplied with the given root cause.
     */
    public ExceptionSNPChromosomeSearchRangeGreaterThanOneMillion(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeAlternativeAlleleNotSupplied with the given detail message and root cause.
     */
    public ExceptionSNPChromosomeSearchRangeGreaterThanOneMillion(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
