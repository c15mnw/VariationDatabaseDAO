	package com.roslin.mwicks.spring.variation.message.snpchromosome;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.IOUtils;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import com.roslin.mwicks.spring.variation.model.other.CSVResponseSNPChromosome;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;

import com.roslin.mwicks.utility.CsvUtil;


public class CSVResponseMessageConverter extends AbstractHttpMessageConverter<CSVResponseSNPChromosome> {
	
    // Constants ----------------------------------------------------------------------------------
	protected static final String DOT = ".";
	protected static final String PASS = "pass";

	protected static final String HDR_1 = "##fileformat=VCFv4.1";
	protected static final String HDR_2 = "##fileDate=";
	protected static final String HDR_3 = "##handle=DWBURT";
	protected static final String HDR_4 = "##batch=15m_snps";
	protected static final String HDR_5 = "##reference=GCF_000002315.3";
	protected static final String HDR_6 = "##INFO=<ID=VRT,Number=1,Type=Integer,Description=\"Variation type, 1 - SNV: single nucleotide variation\">";
	protected static final String HDR_7 = "##INFO=<ID=BD,Number=1,Type=String,Description=\"Breed where this variation has been identified separated by commas. Possible population categories with their abbreviations are: 7 - Inbred Line-7, P - Inbred P-Line, W - Inbred Wellcome-Line, N - Inbred N-Line, I - Inbred Line-15I, Z - Inbred Zero-Line, 6 - Inbred Line-6, C - Inbred C-Line.\">";
	protected static final String HDR_8 = "##INFO=<ID=FIX,Number=1,Type=String,Description=\"Breed where this variation has been identified as FIXED separated by commas. Possible population categories with their abbreviations are: 7 - Inbred Line-7, P - Inbred P-Line, W - Inbred Wellcome-Line, N - Inbred N-Line, I - Inbred Line-15I, Z - Inbred Zero-Line, 6 - Inbred Line-6, C - Inbred C-Line.\">";

	public static final MediaType MEDIA_TYPE = new MediaType("text", "csv", Charset.forName("utf-8"));
	

	public CSVResponseMessageConverter() {
	
		super(MEDIA_TYPE);
	}


	public CSVResponseMessageConverter(MediaType supportedMediaType) {
	
		super(supportedMediaType);
	}


	public CSVResponseMessageConverter(MediaType... supportedMediaTypes) {
	
		super(supportedMediaTypes);
	}


	@Override
	protected boolean supports(Class<?> clazz) {
	
		return CSVResponseSNPChromosome.class.equals(clazz);
	}

    protected CSVResponseSNPChromosome readInternal(Class<? extends CSVResponseSNPChromosome> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        
    	CSVResponseSNPChromosome csvResponse = new CSVResponseSNPChromosome();

        //System.out.println("CSVResponse readInternal : " + csvResponse);

        return csvResponse;
    }

	protected void writeInternal(CSVResponseSNPChromosome csvResponse, HttpOutputMessage output) throws IOException, HttpMessageNotWritableException {
	
        char separator = ',';
        char tab = '\t';
        char comma = ',';
        
    	Date dt = new Date();
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
    	String now = sdf.format(dt);
    	
    	String filename = "download_" + now;

        // Create CSV.
        List<List<String>> csvList = new ArrayList<List<String>>();
        
    	output.getHeaders().setContentType(MEDIA_TYPE);

        //System.out.println("CSVResponse writeInternal : " + csvResponse);

    	// Set Download File SUFFIX and Format
        if ( csvResponse.isDownloadFormatVCF() ) {
            output.getHeaders().set("Content-Disposition", "attachment; filename=\" " + filename + ".vcf" + "\"");
        	separator = tab;
        	
            List<String> headerList1 = new ArrayList<String>();
            List<String> headerList2 = new ArrayList<String>();
            List<String> headerList3 = new ArrayList<String>();
            List<String> headerList4 = new ArrayList<String>();
            List<String> headerList5 = new ArrayList<String>();
            List<String> headerList6 = new ArrayList<String>();
            List<String> headerList7 = new ArrayList<String>();
            List<String> headerList8 = new ArrayList<String>();

            headerList1.add(HDR_1);
            csvList.add(headerList1);
            
            Calendar calendar1 = Calendar.getInstance();
    	   	SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMdd");
            
            headerList2.add(HDR_2 + format1.format(calendar1.getTime()));
            csvList.add(headerList2);
            
            headerList3.add(HDR_3);
            csvList.add(headerList3);
            
            headerList4.add(HDR_4);
            csvList.add(headerList4);
            
            headerList5.add(HDR_5);
            csvList.add(headerList5);
            
            headerList6.add(HDR_6);
            csvList.add(headerList6);
            
            headerList7.add(HDR_7);
            csvList.add(headerList7);
            
            headerList8.add(HDR_8);
            csvList.add(headerList8);
            
            for (SNPChromosome snpchromosome : csvResponse) {
            	
                List<String> outputList = new ArrayList<String>();
                
            	outputList.add(snpchromosome.getChromosomeId());
            	outputList.add(snpchromosome.getPositionAsString());
            	outputList.add(snpchromosome.getReference());
            	outputList.add(snpchromosome.getAlternative());
            	outputList.add(DOT);
            	outputList.add(PASS);

            	String column8 = "";
            	String column8vrt = "VRT=1;";
            	String column8bd = "BD=";
            	String column8fix = "FIX=";
            	
            	if ( snpchromosome.isStrain7AlleleFixed() ) {
            		
            		if ( column8fix.equals("FIX=")) {
            			
                		column8fix = column8fix + "7";
            		}
            		else {
            			
                		column8fix = column8fix + ",7";
            		}
            	}
            	if ( snpchromosome.isStrain7AlleleFixed() || 
            			snpchromosome.isStrain7AlleleNotFixed() ) {
            		
            		if ( column8bd.equals("BD=")) {
            			
            			column8bd = column8bd + "7";
            		}
            		else {
            			
            			column8bd = column8bd + ",7";
            		}
            	}
            	
            	if ( snpchromosome.isStrainPAlleleFixed() ) {
            		
            		if ( column8fix.equals("FIX=")) {
            			
                		column8fix = column8fix + "P";
            		}
            		else {
            			
                		column8fix = column8fix + ",P";
            		}
            	}
            	if ( snpchromosome.isStrainPAlleleFixed() || 
            			snpchromosome.isStrainPAlleleNotFixed() ) {
            		
            		if ( column8bd.equals("BD=")) {
            			
            			column8bd = column8bd + "P";
            		}
            		else {
            			
            			column8bd = column8bd + ",P";
            		}
            	}
            	
            	if ( snpchromosome.isStrainWAlleleFixed() ) {
            		
            		if ( column8fix.equals("FIX=")) {
            			
                		column8fix = column8fix + "W";
            		}
            		else {
            			
                		column8fix = column8fix + ",W";
            		}
            	}
            	if ( snpchromosome.isStrainWAlleleFixed() || 
            			snpchromosome.isStrainWAlleleNotFixed() ) {
            		
            		if ( column8bd.equals("BD=")) {
            			
            			column8bd = column8bd + "W";
            		}
            		else {
            			
            			column8bd = column8bd + ",W";
            		}
            	}
            	
            	if ( snpchromosome.isStrainNAlleleFixed() ) {
            		
            		if ( column8fix.equals("FIX=")) {
            			
                		column8fix = column8fix + "N";
            		}
            		else {
            			
                		column8fix = column8fix + ",N";
            		}
            	}
            	if ( snpchromosome.isStrainNAlleleFixed() || 
            			snpchromosome.isStrainNAlleleNotFixed() ) {
            		
            		if ( column8bd.equals("BD=")) {
            			
            			column8bd = column8bd + "N";
            		}
            		else {
            			
            			column8bd = column8bd + ",N";
            		}
            	}
            	
            	if ( snpchromosome.isStrain15IAlleleFixed() ) {
            		
            		if ( column8fix.equals("FIX=")) {
            			
                		column8fix = column8fix + "I";
            		}
            		else {
            			
                		column8fix = column8fix + ",I";
            		}
            	}
            	if ( snpchromosome.isStrain15IAlleleFixed() || 
            			snpchromosome.isStrain15IAlleleNotFixed() ) {
            		
            		if ( column8bd.equals("BD=")) {
            			
            			column8bd = column8bd + "I";
            		}
            		else {
            			
            			column8bd = column8bd + ",I";
            		}
            	}
            	
            	if ( snpchromosome.isStrainZeroAlleleFixed() ) {
            		
            		if ( column8fix.equals("FIX=")) {
            			
                		column8fix = column8fix + "Z";
            		}
            		else {
            			
                		column8fix = column8fix + ",Z";
            		}
            	}
            	if ( snpchromosome.isStrainZeroAlleleFixed() || 
            			snpchromosome.isStrainZeroAlleleNotFixed() ) {
            		
            		if ( column8bd.equals("BD=")) {
            			
            			column8bd = column8bd + "Z";
            		}
            		else {
            			
            			column8bd = column8bd + ",Z";
            		}
            	}

            	if ( snpchromosome.isStrain6AlleleFixed() ) {
            		
            		if ( column8fix.equals("FIX=")) {
            			
                		column8fix = column8fix + "6";
            		}
            		else {
            			
                		column8fix = column8fix + ",6";
            		}
            	}
            	if ( snpchromosome.isStrain6AlleleFixed() || 
            			snpchromosome.isStrain6AlleleNotFixed() ) {
            		
            		if ( column8bd.equals("BD=")) {
            			
            			column8bd = column8bd + "6";
            		}
            		else {
            			
            			column8bd = column8bd + ",6";
            		}
            	}
            	
            	if ( snpchromosome.isStrainCAlleleFixed() ) {
            		
            		if ( column8fix.equals("FIX=")) {
            			
                		column8fix = column8fix + "C";
            		}
            		else {
            			
                		column8fix = column8fix + ",C";
            		}
            	}
            	if ( snpchromosome.isStrainCAlleleFixed() || 
            			snpchromosome.isStrainCAlleleNotFixed() ) {
            		
            		if ( column8bd.equals("BD=")) {
            			
            			column8bd = column8bd + "C";
            		}
            		else {
            			
            			column8bd = column8bd + ",C";
            		}
            	}

    			column8bd = column8bd + ";";

            	column8 = column8vrt + column8bd + column8fix;

            	outputList.add(column8);

                csvList.add(outputList);
            }
        }
        else {
        
        	if ( csvResponse.isDownloadFormatTSV() ) {

        		output.getHeaders().set("Content-Disposition", "attachment; filename=\" " + filename + ".tsv" + "\"");
            	separator = tab;
            }
            if ( csvResponse.isDownloadFormatCSV() ) {

            	output.getHeaders().set("Content-Disposition", "attachment; filename=\" " + filename + ".csv" + "\"");
            	separator = comma;
            }

            List<String> headerList = new ArrayList<String>();

            if ( csvResponse.isDownloadHeadersYes() && csvResponse.isDownloadQuotesNo()) {
            	
            	headerList.add("Chromosome Identifier");
            	headerList.add("Position");
            	headerList.add("Reference Allele");
            	headerList.add("Alternative Allele");
            	headerList.add("Region");
            	headerList.add("Ensembl Gene");
            	headerList.add("Ensembl Transcript");
            	headerList.add("Ensembl Coding Predictions");

            	if ( csvResponse.isDownloadReference7() || csvResponse.isDownloadAlternative7() ) {
            		headerList.add("Strain 7 Allele");
                	headerList.add("Strain 7 Allele Fixed?");
                	headerList.add("Strain 7 Allele Ratio");
                	headerList.add("Strain 7 Allele Reference Count");
                	headerList.add("Strain 7 Allele Alternative Count");
            	}
            	if ( csvResponse.isDownloadReferenceP() || csvResponse.isDownloadAlternativeP() ) {
            		headerList.add("Strain P Allele");
                	headerList.add("Strain P Allele Fixed?");
                	headerList.add("Strain P Allele Ratio");
                	headerList.add("Strain P Allele Reference Count");
                	headerList.add("Strain P Allele Alternative Count");
            	}
            	if ( csvResponse.isDownloadReferenceW() || csvResponse.isDownloadAlternativeW() ) {
            		headerList.add("Strain W Allele");
                	headerList.add("Strain W Allele Fixed?");
                	headerList.add("Strain W Allele Ratio");
                	headerList.add("Strain W Allele Reference Count");
                	headerList.add("Strain W Allele Alternative Count");
            	}
            	if ( csvResponse.isDownloadReferenceN() || csvResponse.isDownloadAlternativeN() ) {
            		headerList.add("Strain N Allele");
                	headerList.add("Strain N Allele Fixed?");
                	headerList.add("Strain N Allele Ratio");
                	headerList.add("Strain N Allele Reference Count");
                	headerList.add("Strain N Allele Alternative Count");
            	}
            	if ( csvResponse.isDownloadReference15I() || csvResponse.isDownloadAlternative15I() ) {
            		headerList.add("Strain 15I Allele");
                	headerList.add("Strain 15I Allele Fixed?");
                	headerList.add("Strain 15I Allele Ratio");
                	headerList.add("Strain 15I Allele Reference Count");
                	headerList.add("Strain 15I Allele Alternative Count");
            	}
            	if ( csvResponse.isDownloadReferenceZero() || csvResponse.isDownloadAlternativeZero() ) {
            		headerList.add("Strain Zero Allele");
                	headerList.add("Strain Zero Allele Fixed?");
                	headerList.add("Strain Zero Allele Ratio");
                	headerList.add("Strain Zero Allele Reference Count");
                	headerList.add("Strain Zero Allele Alternative Count");
            	}
            	if ( csvResponse.isDownloadReference6() || csvResponse.isDownloadAlternative6() ) {
            		headerList.add("Strain 6 Allele");
                	headerList.add("Strain 6 Allele Fixed?");
                	headerList.add("Strain 6 Allele Ratio");
                	headerList.add("Strain 6 Allele Reference Count");
                	headerList.add("Strain 6 Allele Alternative Count");
            	}
            	if ( csvResponse.isDownloadReferenceC() || csvResponse.isDownloadAlternativeC() ) {
            		headerList.add("Strain C Allele");
                	headerList.add("Strain C Allele Fixed?");
                	headerList.add("Strain C Allele Ratio");
                	headerList.add("Strain C Allele Reference Count");
                	headerList.add("Strain C Allele Alternative Count");
            	}

            	headerList.add("Amino Acid Substitution Information");
            	headerList.add("Prediction Category");
            	headerList.add("PROVEAN Score");
            	headerList.add("SIFT Score");
            	headerList.add("SIFT Conservation Score");
            	headerList.add("Protein Alignment Number");
            	headerList.add("Total Number of Sequences Aligned");
            		
                csvList.add(headerList);
            }

            if ( csvResponse.isDownloadHeadersYes() && csvResponse.isDownloadQuotesYes()) {
            	
            	headerList.add("\"Chromosome Identifier\"");
            	headerList.add("\"Position\"");
            	headerList.add("\"Reference Allele\"");
            	headerList.add("\"Alternative Allele\"");
            	headerList.add("\"Region\"");
            	headerList.add("\"Ensembl Gene\"");
            	headerList.add("\"Ensembl Transcript\"");
            	headerList.add("\"Ensembl Coding Predictions\"");

            	if ( csvResponse.isDownloadReference7() || csvResponse.isDownloadAlternative7() ) {
            		headerList.add("\"Strain 7 Allele\"");
                	headerList.add("\"Strain 7 Allele Fixed?\"");
                	headerList.add("\"Strain 7 Allele Ratio\"");
                	headerList.add("\"Strain 7 Allele Reference Count\"");
                	headerList.add("\"Strain 7 Allele Alternative Count\"");
            	}
            	if ( csvResponse.isDownloadReferenceP() || csvResponse.isDownloadAlternativeP() ) {
            		headerList.add("\"Strain P Allele\"");
                	headerList.add("\"Strain P Allele Fixed?\"");
                	headerList.add("\"Strain P Allele Ratio\"");
                	headerList.add("\"Strain P Allele Reference Count\"");
                	headerList.add("\"Strain P Allele Alternative Count\"");
            	}
            	if ( csvResponse.isDownloadReferenceW() || csvResponse.isDownloadAlternativeW() ) {
            		headerList.add("\"Strain W Allele\"");
                	headerList.add("\"Strain W Allele Fixed?\"");
                	headerList.add("\"Strain W Allele Ratio\"");
                	headerList.add("\"Strain W Allele Reference Count\"");
                	headerList.add("\"Strain W Allele Alternative Count\"");
            	}
            	if ( csvResponse.isDownloadReferenceN() || csvResponse.isDownloadAlternativeN() ) {
            		headerList.add("\"Strain N Allele\"");
                	headerList.add("\"Strain N Allele Fixed?\"");
                	headerList.add("\"Strain N Allele Ratio\"");
                	headerList.add("\"Strain N Allele Reference Count\"");
                	headerList.add("\"Strain N Allele Alternative Count\"");
            	}
            	if ( csvResponse.isDownloadReference15I() || csvResponse.isDownloadAlternative15I() ) {
            		headerList.add("\"Strain 15I Allele\"");
                	headerList.add("\"Strain 15I Allele Fixed?\"");
                	headerList.add("\"Strain 15I Allele Ratio\"");
                	headerList.add("\"Strain 15I Allele Reference Count\"");
                	headerList.add("\"Strain 15I Allele Alternative Count\"");
            	}
            	if ( csvResponse.isDownloadReferenceZero() || csvResponse.isDownloadAlternativeZero() ) {
            		headerList.add("\"Strain Zero Allele\"");
                	headerList.add("\"Strain Zero Allele Fixed?\"");
                	headerList.add("\"Strain Zero Allele Ratio\"");
                	headerList.add("\"Strain Zero Allele Reference Count\"");
                	headerList.add("\"Strain Zero Allele Alternative Count\"");
            	}
            	if ( csvResponse.isDownloadReference6() || csvResponse.isDownloadAlternative6() ) {
            		headerList.add("\"Strain 6 Allele\"");
                	headerList.add("\"Strain 6 Allele Fixed?\"");
                	headerList.add("\"Strain 6 Allele Ratio\"");
                	headerList.add("\"Strain 6 Allele Reference Count\"");
                	headerList.add("\"Strain 6 Allele Alternative Count\"");
            	}
            	if ( csvResponse.isDownloadReferenceC() || csvResponse.isDownloadAlternativeC() ) {
            		headerList.add("\"Strain C Allele\"");
                	headerList.add("\"Strain C Allele Fixed?\"");
                	headerList.add("\"Strain C Allele Ratio\"");
                	headerList.add("\"Strain C Allele Reference Count\"");
                	headerList.add("\"Strain C Allele Alternative Count\"");
            	}
            	
            	headerList.add("\"Amino Acid Substitution Information\"");
            	headerList.add("\"Prediction Category\"");
            	headerList.add("\"PROVEAN Score\"");
            	headerList.add("\"SIFT Score\"");
            	headerList.add("\"SIFT Conservation Score\"");
            	headerList.add("\"Protein Alignment Number\"");
            	headerList.add("\"Total Number of Sequences Aligned\"");
            		
                csvList.add(headerList);
            }

            if ( csvResponse.isDownloadQuotesYes() ) {
            	
                for (SNPChromosome snpchromosome : csvResponse) {
                	
                    List<String> outputList = new ArrayList<String>();
                    
                	outputList.add(snpchromosome.getChromosomeIdQuoted());
                	outputList.add(snpchromosome.getPositionAsStringQuoted());
                	outputList.add(snpchromosome.getReferenceQuoted());
                	outputList.add(snpchromosome.getAlternativeQuoted());
                	outputList.add(snpchromosome.getRegionQuoted());
                	outputList.add(snpchromosome.getEnsemblGeneQuoted());
                	outputList.add(snpchromosome.getEnsemblTranscriptQuoted());
                	outputList.add(snpchromosome.getEnsemblAnnotationQuoted());

                	if ( csvResponse.isDownloadReference7() || csvResponse.isDownloadAlternative7() ) {
                		outputList.add(snpchromosome.getStrain7AlleleQuoted());
                    	outputList.add(snpchromosome.getStrain7AlleleFixedQuoted());
                    	outputList.add(snpchromosome.getStrain7AlleleRatioQuoted());
                    	outputList.add(snpchromosome.getStrain7AlleleReferenceCountQuoted());
                    	outputList.add(snpchromosome.getStrain7AlleleAlternativeCountQuoted());
                	}
                	if ( csvResponse.isDownloadReferenceP() || csvResponse.isDownloadAlternativeP() ) {
                		outputList.add(snpchromosome.getStrainPAlleleQuoted());
                    	outputList.add(snpchromosome.getStrainPAlleleFixedQuoted());
                    	outputList.add(snpchromosome.getStrainPAlleleRatioQuoted());
                    	outputList.add(snpchromosome.getStrainPAlleleReferenceCountQuoted());
                    	outputList.add(snpchromosome.getStrainPAlleleAlternativeCountQuoted());
                	}
                	if ( csvResponse.isDownloadReferenceW() || csvResponse.isDownloadAlternativeW() ) {
                		outputList.add(snpchromosome.getStrainWAlleleQuoted());
                    	outputList.add(snpchromosome.getStrainWAlleleFixedQuoted());
                    	outputList.add(snpchromosome.getStrainWAlleleRatioQuoted());
                    	outputList.add(snpchromosome.getStrainWAlleleReferenceCountQuoted());
                    	outputList.add(snpchromosome.getStrainWAlleleAlternativeCountQuoted());
                	}
                	if ( csvResponse.isDownloadReferenceN() || csvResponse.isDownloadAlternativeN() ) {
                		outputList.add(snpchromosome.getStrainNAlleleQuoted());
                    	outputList.add(snpchromosome.getStrainNAlleleFixedQuoted());
                    	outputList.add(snpchromosome.getStrainNAlleleRatioQuoted());
                    	outputList.add(snpchromosome.getStrainNAlleleReferenceCountQuoted());
                    	outputList.add(snpchromosome.getStrainNAlleleAlternativeCountQuoted());
                	}
                	if ( csvResponse.isDownloadReference15I() || csvResponse.isDownloadAlternative15I() ) {
                		outputList.add(snpchromosome.getStrain15IAlleleQuoted());
                    	outputList.add(snpchromosome.getStrain15IAlleleFixedQuoted());
                    	outputList.add(snpchromosome.getStrain15IAlleleRatioQuoted());
                    	outputList.add(snpchromosome.getStrain15IAlleleReferenceCountQuoted());
                    	outputList.add(snpchromosome.getStrain15IAlleleAlternativeCountQuoted());
                	}
                	if ( csvResponse.isDownloadReferenceZero() || csvResponse.isDownloadAlternativeZero() ) {
                		outputList.add(snpchromosome.getStrainZeroAlleleQuoted());
                    	outputList.add(snpchromosome.getStrainZeroAlleleFixedQuoted());
                    	outputList.add(snpchromosome.getStrainZeroAlleleRatioQuoted());
                    	outputList.add(snpchromosome.getStrainZeroAlleleReferenceCountQuoted());
                    	outputList.add(snpchromosome.getStrainZeroAlleleAlternativeCountQuoted());
                	}
                	if ( csvResponse.isDownloadReference6() || csvResponse.isDownloadAlternative6() ) {
                		outputList.add(snpchromosome.getStrain6AlleleQuoted());
                    	outputList.add(snpchromosome.getStrain6AlleleFixedQuoted());
                    	outputList.add(snpchromosome.getStrain6AlleleRatioQuoted());
                    	outputList.add(snpchromosome.getStrain6AlleleReferenceCountQuoted());
                    	outputList.add(snpchromosome.getStrain6AlleleAlternativeCountQuoted());
                	}
                	if ( csvResponse.isDownloadReferenceC() || csvResponse.isDownloadAlternativeC() ) {
                		outputList.add(snpchromosome.getStrainCAlleleQuoted());
                    	outputList.add(snpchromosome.getStrainCAlleleFixedQuoted());
                    	outputList.add(snpchromosome.getStrainCAlleleRatioQuoted());
                    	outputList.add(snpchromosome.getStrainCAlleleReferenceCountQuoted());
                    	outputList.add(snpchromosome.getStrainCAlleleAlternativeCountQuoted());
                	}
                		
                	outputList.add(snpchromosome.getAminoAcidSubsQuoted());
                	outputList.add(snpchromosome.getPredictionCategoryQuoted());
                	outputList.add(snpchromosome.getScoreProveanAsStringQuoted());
                	outputList.add(snpchromosome.getScoreSiftAsStringQuoted());
                	outputList.add(snpchromosome.getScoreConservationAsStringQuoted());
                	outputList.add(snpchromosome.getProteinAlignNumberAsStringQuoted());
                	outputList.add(snpchromosome.getTotalAlignSequenceNumberAsStringQuoted());

                    csvList.add(outputList);
                }
            }
            
            if ( csvResponse.isDownloadQuotesNo() ) {
            	
                for (SNPChromosome snpchromosome : csvResponse) {

                    List<String> outputList = new ArrayList<String>();

                	outputList.add(snpchromosome.getChromosomeId());
                	outputList.add(snpchromosome.getPositionAsString());
                	outputList.add(snpchromosome.getReference());
                	outputList.add(snpchromosome.getAlternative());
                	outputList.add(snpchromosome.getRegion());
                	outputList.add(snpchromosome.getEnsemblGene());
                	outputList.add(snpchromosome.getEnsemblTranscript());
                	outputList.add(snpchromosome.getEnsemblAnnotation());

                	if ( csvResponse.isDownloadReference7() || csvResponse.isDownloadAlternative7() ) {
                		outputList.add(snpchromosome.getStrain7Allele());
                    	outputList.add(snpchromosome.getStrain7AlleleFixed());
                    	outputList.add(snpchromosome.getStrain7AlleleRatioAsString());
                    	outputList.add(snpchromosome.getStrain7AlleleReferenceCountAsString());
                    	outputList.add(snpchromosome.getStrain7AlleleAlternativeCountAsString());
                	}
                	if ( csvResponse.isDownloadReferenceP() || csvResponse.isDownloadAlternativeP() ) {
                		outputList.add(snpchromosome.getStrainPAllele());
                    	outputList.add(snpchromosome.getStrainPAlleleFixed());
                    	outputList.add(snpchromosome.getStrainPAlleleRatioAsString());
                    	outputList.add(snpchromosome.getStrainPAlleleReferenceCountAsString());
                    	outputList.add(snpchromosome.getStrainPAlleleAlternativeCountAsString());
                	}
                	if ( csvResponse.isDownloadReferenceW() || csvResponse.isDownloadAlternativeW() ) {
                		outputList.add(snpchromosome.getStrainWAllele());
                    	outputList.add(snpchromosome.getStrainWAlleleFixed());
                    	outputList.add(snpchromosome.getStrainWAlleleRatioAsString());
                    	outputList.add(snpchromosome.getStrainWAlleleReferenceCountAsString());
                    	outputList.add(snpchromosome.getStrainWAlleleAlternativeCountAsString());
                	}
                	if ( csvResponse.isDownloadReferenceN() || csvResponse.isDownloadAlternativeN() ) {
                		outputList.add(snpchromosome.getStrainNAllele());
                    	outputList.add(snpchromosome.getStrainNAlleleFixed());
                    	outputList.add(snpchromosome.getStrainNAlleleRatioAsString());
                    	outputList.add(snpchromosome.getStrainNAlleleReferenceCountAsString());
                    	outputList.add(snpchromosome.getStrainNAlleleAlternativeCountAsString());
                	}
                	if ( csvResponse.isDownloadReference15I() || csvResponse.isDownloadAlternative15I() ) {
                		outputList.add(snpchromosome.getStrain15IAllele());
                    	outputList.add(snpchromosome.getStrain15IAlleleFixed());
                    	outputList.add(snpchromosome.getStrain15IAlleleRatioAsString());
                    	outputList.add(snpchromosome.getStrain15IAlleleReferenceCountAsString());
                    	outputList.add(snpchromosome.getStrain15IAlleleAlternativeCountAsString());
                	}
                	if ( csvResponse.isDownloadReferenceZero() || csvResponse.isDownloadAlternativeZero() ) {
                		outputList.add(snpchromosome.getStrainZeroAllele());
                    	outputList.add(snpchromosome.getStrainZeroAlleleFixed());
                    	outputList.add(snpchromosome.getStrainZeroAlleleRatioAsString());
                    	outputList.add(snpchromosome.getStrainZeroAlleleReferenceCountAsString());
                    	outputList.add(snpchromosome.getStrainZeroAlleleAlternativeCountAsString());
                	}
                	if ( csvResponse.isDownloadReference6() || csvResponse.isDownloadAlternative6() ) {
                		outputList.add(snpchromosome.getStrain6Allele());
                    	outputList.add(snpchromosome.getStrain6AlleleFixed());
                    	outputList.add(snpchromosome.getStrain6AlleleRatioAsString());
                    	outputList.add(snpchromosome.getStrain6AlleleReferenceCountAsString());
                    	outputList.add(snpchromosome.getStrain6AlleleAlternativeCountAsString());
                	}
                	if ( csvResponse.isDownloadReferenceC() || csvResponse.isDownloadAlternativeC() ) {
                		outputList.add(snpchromosome.getStrainCAllele());
                    	outputList.add(snpchromosome.getStrainCAlleleFixed());
                    	outputList.add(snpchromosome.getStrainCAlleleRatioAsString());
                    	outputList.add(snpchromosome.getStrainCAlleleReferenceCountAsString());
                    	outputList.add(snpchromosome.getStrainCAlleleAlternativeCountAsString());
                	}
                	
                	outputList.add(snpchromosome.getAminoAcidSubs());
                	outputList.add(snpchromosome.getPredictionCategory());
                	outputList.add(snpchromosome.getScoreProveanAsString());
                	outputList.add(snpchromosome.getScoreSiftAsString());
                	outputList.add(snpchromosome.getScoreConservationAsString());
                	outputList.add(snpchromosome.getProteinAlignNumberAsString());
                	outputList.add(snpchromosome.getTotalAlignSequenceNumberAsString());

                    csvList.add(outputList);
                }
            }
        }
        
        InputStream csvInput = CsvUtil.formatCsvWithQuotes(csvList, separator);

        try {
	    	
	        IOUtils.copy(csvInput, output.getBody());
	    }
	    catch (IOException e) {
	        
	    	e.printStackTrace();
	    }
        catch(Exception e){
	    
	    	//System.out.println("Exception in file download :"+e);
	    }
	}
	
}

