package com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPInsertionDeletionReferenceAlleleEqualsAlternativeAllele extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPInsertionDeletionReferenceAlleleEqualsAlternativeAllele with the given detail message.
     */
    public ExceptionSNPInsertionDeletionReferenceAlleleEqualsAlternativeAllele(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionReferenceAlleleEqualsAlternativeAllele with the given root cause.
     */
    public ExceptionSNPInsertionDeletionReferenceAlleleEqualsAlternativeAllele(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionReferenceAlleleEqualsAlternativeAllele with the given detail message and root cause.
     */
    public ExceptionSNPInsertionDeletionReferenceAlleleEqualsAlternativeAllele(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
