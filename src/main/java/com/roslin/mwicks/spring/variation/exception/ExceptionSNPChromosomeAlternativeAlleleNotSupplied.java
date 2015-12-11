package com.roslin.mwicks.spring.variation.exception;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPChromosomeAlternativeAlleleNotSupplied extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeAlternativeAlleleNotSupplied with the given detail message.
     */
    public ExceptionSNPChromosomeAlternativeAlleleNotSupplied(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeAlternativeAlleleNotSupplied with the given root cause.
     */
    public ExceptionSNPChromosomeAlternativeAlleleNotSupplied(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeAlternativeAlleleNotSupplied with the given detail message and root cause.
     */
    public ExceptionSNPChromosomeAlternativeAlleleNotSupplied(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
