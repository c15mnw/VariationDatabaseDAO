package com.roslin.mwicks.spring.variation.dto.web.enums;

/**
 * Describes the search type of the search. Legal values are:
 * <ul>
 *     <li>NONE
 *     <li>BLANK
 *     <li>TOLERATED
 *     <li>DELETERIOUS
 *     <li>NOT SCORED
 * </ul>
 * @author Mike Wicks
 */
public enum SearchPredictionCategory {
	PREDCAT_NONE,
	PREDCAT_BLANK,
	PREDCAT_DELETERIOUS,
	PREDCAT_NOT_SCORED,
	PREDCAT_TOLERATED
}
