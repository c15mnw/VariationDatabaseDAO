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
public enum SearchSortDirection {
	SORT_DIRECTION_NONE,
	SORT_DIRECTION_ASCENDING,
	SORT_DIRECTION_DESCENDING
}
