package com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion;

/**
 * This exception is thrown if the wanted SNPInsertionDeletion is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPInsertionDeletionNotFound extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPInsertionDeletionNotFound with the given detail message.
     */
    public ExceptionSNPInsertionDeletionNotFound(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionNotFound with the given root cause.
     */
    public ExceptionSNPInsertionDeletionNotFound(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionNotFound with the given detail message and root cause.
     */
    public ExceptionSNPInsertionDeletionNotFound(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
