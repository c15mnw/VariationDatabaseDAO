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
public enum SearchSortField {
	SORT_FIELD_NONE,
	SORT_FIELD_POSITION,
	SORT_FIELD_REFERENCE,
	SORT_FIELD_ALTERNATIVE,
	SORT_FIELD_REGION,
	SORT_FIELD_ENSEMBL_GENE,
	SORT_FIELD_ENSEMBLE_TRANSCRIPT,
	SORT_FIELD_ENSEMBLE_ANNOTATION,
	SORT_FIELD_AMINO_ACID_SUBS,
	SORT_FIELD_PREDICTION_CATEGORY,
	SORT_FIELD_SCORE_SIFT,
	SORT_FIELD_SCORE_CONSERV,
	SORT_FIELD_PROTEIN_ALIGN_NO,
	SORT_FIELD_TOT_ALIGN_SEQ_NO,
	SORT_FIELD_SCORE_PROVEAN
}
