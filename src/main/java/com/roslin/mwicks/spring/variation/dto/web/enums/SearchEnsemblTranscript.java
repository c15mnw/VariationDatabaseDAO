package com.roslin.mwicks.spring.variation.dto.web.enums;

/**
 * Describes the search type of the search. Legal values are:
 * <ul>
 *     <li>NONE
 *     <li>NA
 *     <li>nonsynonymous SNV
 *     <li>synonymous SNV
 *     <li>stopgain SNV
 *     <li>stoploss SNV
 *     <li>unknown
 * </ul>
 * @author Mike Wicks
 */
public enum SearchEnsemblTranscript {
	TRANSCRIPT_NONE,
	TRANSCRIPT_NA,
	TRANSCRIPT_NONSYNONYMOUS_SNV,
	TRANSCRIPT_STOPGAIN_SNV,
	TRANSCRIPT_STOPLOSS_SNV,
	TRANSCRIPT_SYNONYMOUS_SNV,
	TRANSCRIPT_UNKNOWN
}
