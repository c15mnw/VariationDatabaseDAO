package com.roslin.mwicks.spring.variation.exception;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele with the given detail message.
     */
    public ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele with the given root cause.
     */
    public ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele with the given detail message and root cause.
     */
    public ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
