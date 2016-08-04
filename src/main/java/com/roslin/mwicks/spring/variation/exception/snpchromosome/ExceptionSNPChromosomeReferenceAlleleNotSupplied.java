package com.roslin.mwicks.spring.variation.exception.snpchromosome;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPChromosomeReferenceAlleleNotSupplied extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeReferenceAlleleNotSupplied with the given detail message.
     */
    public ExceptionSNPChromosomeReferenceAlleleNotSupplied(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeReferenceAlleleNotSupplied with the given root cause.
     */
    public ExceptionSNPChromosomeReferenceAlleleNotSupplied(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeReferenceAlleleNotSupplied with the given detail message and root cause.
     */
    public ExceptionSNPChromosomeReferenceAlleleNotSupplied(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
