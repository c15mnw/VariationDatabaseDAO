package com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPInsertionDeletionReferenceAlleleNotSupplied extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPInsertionDeletionReferenceAlleleNotSupplied with the given detail message.
     */
    public ExceptionSNPInsertionDeletionReferenceAlleleNotSupplied(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionReferenceAlleleNotSupplied with the given root cause.
     */
    public ExceptionSNPInsertionDeletionReferenceAlleleNotSupplied(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionReferenceAlleleNotSupplied with the given detail message and root cause.
     */
    public ExceptionSNPInsertionDeletionReferenceAlleleNotSupplied(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
