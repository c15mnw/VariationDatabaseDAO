package com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPInsertionDeletionSearchRangeGreaterThanOneMillion extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPInsertionDeletionAlternativeAlleleNotSupplied with the given detail message.
     */
    public ExceptionSNPInsertionDeletionSearchRangeGreaterThanOneMillion(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionAlternativeAlleleNotSupplied with the given root cause.
     */
    public ExceptionSNPInsertionDeletionSearchRangeGreaterThanOneMillion(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionAlternativeAlleleNotSupplied with the given detail message and root cause.
     */
    public ExceptionSNPInsertionDeletionSearchRangeGreaterThanOneMillion(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
