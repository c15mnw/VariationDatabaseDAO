package com.roslin.mwicks.spring.variation.dto.web.enums.snpinsertiondeletion;

/**
 * Describes the search type of the search. Legal values are:
 * 
 * <ul>
 *     <li>NONE
 *     <li>VSI_OID - Primary Key
 *     <li>VSI_CHROMOSOME_ID - The SNP ID
 *     <li>VSI_POSITION_START - The SNP Start Position or coordinate
 *     <li>VSI_POSITION_END - The SNP End Position or coordinate
 *     <li>VSI_INSERTION_DELETION_ID - The Chromosome ID
 *     <li>VSI_REFERENCE - The Reference or Expected Nucleobase
 *     <li>VSI_ALTERNATIVE - The Alternative Nucleobase as found
 *     <li>VSI_QUALITY - The Region
 *     <li>VSI_FILTER - The Ensembl Gene Name
 *     <li>VSI_INFORMATION - The Ensembl Transcript
 *     <li>VSI_STRAIN_I_ALTERNATIVE_ALLELES - For Strain I the Alternative Alleles
 *     <li>VSI_STRAIN_J_ALTERNATIVE_ALLELES - For Strain J the Alternative Alleles
 *     <li>VSI_STRAIN_L_ALTERNATIVE_ALLELES - For Strain L the Alternative Alleles
 *     <li>VSI_STRAIN_N_ALTERNATIVE_ALLELES - For Strain N the Alternative Alleles
 *     <li>VSI_STRAIN_W_ALTERNATIVE_ALLELES - For Strain W the Alternative Alleles
 *     <li>VSI_STRAIN_Z_ALTERNATIVE_ALLELES - For Strain Z the Alternative Alleles
 *     <li>VSI_AMINO_ACID_SUBSITUTION - Amino Acid Substitution Info. - IF available
 *     <li>VSI_PREDICTION_CATEGORY - TOLERATED or DELETERIOUS - IF available
 *     <li>VSI_SIFT_SCORE - The SIFT Score - IF available
 *     <li>VSI_SIFT_SCORE_CONSERVATION - The SIFT Conservation Score - IF available
 *     <li>VSI_PROTEIN_ALIGNMENT_NUMBER - Number of protein alignment at this SNP position - IF available
 *     <li>VSI_TOTAL_SEQUENCE_ALIGNMENT_NUMBER - Total number of sequence aligned - IF available
 *     <li>VSI_PROVEAN_SCORE - The PROVEAN Score - IF available
 * </ul>
 * @author Mike Wicks
 */
public enum SearchSortField {
	SORT_FIELD_NONE,
	SORT_FIELD_OID,
	SORT_FIELD_CHROMOSOME_ID,
	SORT_FIELD_POSITION_START,
	SORT_FIELD_POSITION_END,
	SORT_FIELD_INSERTION_DELETION_ID,
	SORT_FIELD_REFERENCE,
	SORT_FIELD_ALTERNATIVE,
	SORT_FIELD_QUALITY,
	SORT_FIELD_FILTER,
	SORT_FIELD_INFORMATION,
	SORT_FIELD_STRAIN_I_ALTERNATIVE_ALLELES,
	SORT_FIELD_STRAIN_J_ALTERNATIVE_ALLELES,
	SORT_FIELD_STRAIN_L_ALTERNATIVE_ALLELES,
	SORT_FIELD_STRAIN_N_ALTERNATIVE_ALLELES,
	SORT_FIELD_STRAIN_W_ALTERNATIVE_ALLELES,
	SORT_FIELD_STRAIN_Z_ALTERNATIVE_ALLELES,
	SORT_FIELD_AMINO_ACID_SUBSITUTION,
	SORT_FIELD_PREDICTION_CATEGORY,
	SORT_FIELD_SIFT_SCORE,
	SORT_FIELD_SIFT_SCORE_CONSERVATION,
	SORT_FIELD_PROTEIN_ALIGNMENT_NUMBER,
	SORT_FIELD_TOTAL_SEQUENCE_ALIGNMENT_NUMBER,
	SORT_FIELD_PROVEAN_SCORE
}

