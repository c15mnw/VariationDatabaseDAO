package com.roslin.mwicks.spring.variation.dto.web.enums;

/**
 * Describes the search type of the search. Legal values are:
 * <ul>
 *     <li>NONE
 *     <li>STRAIN_7 as the Reference Allele
 *     <li>STRAIN_P as the Reference Allele
 *     <li>STRAIN_W as the Reference Allele
 *     <li>STRAIN_N as the Reference Allele
 *     <li>STRAIN_15I as the Reference Allele
 *     <li>STRAIN_ZERO as the Reference Allele
 *     <li>STRAIN_6 as the Reference Allele
 *     <li>STRAIN_C as the Reference Allele
 * </ul>
 * @author Mike Wicks
 */
public enum SearchReference {
	STRAIN_NONE,
	STRAIN_REFERENCE,
	STRAIN_7,
	STRAIN_P,
	STRAIN_W,
	STRAIN_N,
	STRAIN_15I,
	STRAIN_ZERO,
	STRAIN_6,
	STRAIN_C
}
