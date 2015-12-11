package com.roslin.mwicks.spring.variation.exception;

/**
 * This exception is thrown if the wanted SNPChromosome is not found.
 * @author Mike Wicks
 */
@SuppressWarnings("serial")
public class ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate extends Exception {
    // Constructors -------------------------------------------------------------------------------
    /*
     * Constructs an ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate with the given detail message.
     */
    public ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate(String message) {

    	super(message);
    }

    /*
     * Constructs an ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate with the given root cause.
     */
    public ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate(Throwable cause) {
        
    	super(cause);
    }

    /*
     * Constructs an ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate with the given detail message and root cause.
     */
    public ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate(String message, Throwable cause) {
        
    	super(message, cause);
    }

}
