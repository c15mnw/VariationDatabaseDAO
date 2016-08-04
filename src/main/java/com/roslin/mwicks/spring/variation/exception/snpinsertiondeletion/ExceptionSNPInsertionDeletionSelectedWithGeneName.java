package com.roslin.mwicks.spring.variation.exception.snpinsertiondeletion;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPInsertionDeletionSelectedWithGeneName extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPInsertionDeletionNotSelected with the given detail message.
     */
    public ExceptionSNPInsertionDeletionSelectedWithGeneName(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionNotSelected with the given root cause.
     */
    public ExceptionSNPInsertionDeletionSelectedWithGeneName(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPInsertionDeletionNotSelected with the given detail message and root cause.
     */
    public ExceptionSNPInsertionDeletionSelectedWithGeneName(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
