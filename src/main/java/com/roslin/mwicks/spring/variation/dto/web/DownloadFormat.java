package com.roslin.mwicks.spring.variation.dto.web;

/**
 * What Format do you want the downloaded file in?
 * <ul>
 *     <li>FORMAT_NONE
 *     <li>FORMAT_CSV
 *     <li>FORMAT_TSV
 *     <li>FORMAT_VCF
 * </ul>
 * @author Mike Wicks
 */
public enum DownloadFormat {
	FORMAT_NONE,
	FORMAT_CSV,
	FORMAT_TSV,
	FORMAT_VCF
}
