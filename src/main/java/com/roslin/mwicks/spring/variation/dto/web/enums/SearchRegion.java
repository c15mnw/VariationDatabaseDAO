package com.roslin.mwicks.spring.variation.dto.web.enums;

/**
 * Describes the search type of the search. Legal values are:
 * <ul>
 *     <li>NONE
 *     <li>intergenic
 *     <li>upstream
 *     <li>UTR5
 *     <li>exonic
 *     <li>intronic
 *     <li>exonic;splicing
 *     <li>UTR3
 *     <li>downstream
 *     <li>splicing
 *     <li>upstream;downstream
 *     <li>ncRNA_exonic
 *     <li>UTR5;UTR3
 *     <li>ncRNA_intronic
 *     <li>ncRNA_splicing
 * </ul>
 * @author Mike Wicks
 */
public enum SearchRegion {
	REGION_NONE,
	REGION_DOWNSTREAM,
	REGION_EXONIC_SPLICING,
	REGION_EXONIC,
	REGION_INTERGENIC,
	REGION_INTRONIC,
	REGION_NC_RNA_EXONIC,
	REGION_NC_RNA_INTRONIC,
	REGION_NC_RNA_SPLICING,
	REGION_SPLICING,
	REGION_UPSTREAM_DOWNSTREAM,
	REGION_UPSTREAM,
	REGION_UTR3,
	REGION_UTR5_UTR3,
	REGION_UTR5
}
