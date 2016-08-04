package com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPInsertionDeletionNotSelected extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPInsertionDeletionNotSelected with the given detail message.
     */
    public ExceptionSNPInsertionDeletionNotSelected(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionNotSelected with the given root cause.
     */
    public ExceptionSNPInsertionDeletionNotSelected(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionNotSelected with the given detail message and root cause.
     */
    public ExceptionSNPInsertionDeletionNotSelected(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
