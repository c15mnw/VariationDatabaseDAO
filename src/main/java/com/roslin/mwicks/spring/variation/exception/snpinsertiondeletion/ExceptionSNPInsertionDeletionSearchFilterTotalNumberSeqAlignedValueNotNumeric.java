package com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPInsertionDeletionSearchFilterTotalNumberSeqAlignedValueNotNumeric extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPInsertionDeletionHighCoordinateNotNumeric with the given detail message.
     */
    public ExceptionSNPInsertionDeletionSearchFilterTotalNumberSeqAlignedValueNotNumeric(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionHighCoordinateNotNumeric with the given root cause.
     */
    public ExceptionSNPInsertionDeletionSearchFilterTotalNumberSeqAlignedValueNotNumeric(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionHighCoordinateNotNumeric with the given detail message and root cause.
     */
    public ExceptionSNPInsertionDeletionSearchFilterTotalNumberSeqAlignedValueNotNumeric(String message, Throwable cause) {
        
    	super(message, cause);
    }
}
