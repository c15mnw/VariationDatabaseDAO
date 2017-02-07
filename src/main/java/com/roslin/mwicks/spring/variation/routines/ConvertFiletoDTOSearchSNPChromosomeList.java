package com.roslin.mwicks.spring.variation.routines;

import java.io.File;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.roslin.mwicks.utility.CsvUtil;
import com.roslin.mwicks.utility.FileUtil;
import com.roslin.mwicks.utility.Wrapper;

import com.roslin.mwicks.spring.variation.dto.web.objects.snpchromosome.DTOSearchSNPChromosome;

import com.roslin.mwicks.spring.variation.model.other.SNPChromosomeRequestData;


public final class ConvertFiletoDTOSearchSNPChromosomeList {

    // Constants ----------------------------------------------------------------------------------
	protected static final String STRING_NA = "NA";
	protected static final String STRING_FIXED = "fixed";
	protected static final String STRING_NOT_FIXED = "not_fixed";
	protected static final String STRING_REFERENCE = "ref";

	protected static final String STRING_OUTPUT_NA = "N/A";
	protected static final String STRING_OUTPUT_FIXED = "Fixed";
	protected static final String STRING_OUTPUT_NOT_FIXED = "Not Fixed";
	protected static final String STRING_OUTPUT_REFERENCE = "Ref.";
	

	public static List<DTOSearchSNPChromosome> run ( InputStream csvInput, int startRecordCount, String messagePriority, String requestPriority ) throws Exception {

        // Create List of SNPChromosomeRequestDatas
        List<DTOSearchSNPChromosome> dtosearchsnpchromosomeList = new ArrayList<DTOSearchSNPChromosome>();

		try {

	     	int error = 0;

	     	long recordCount = startRecordCount + 1;

	        // Create CSV List
	        List<List<String>> csvList = CsvUtil.parseCsv(csvInput, '\t');

	        // Create CSV List

	        Iterator<List<String>> iteratorRow = csvList.iterator();
	        
	     	while (iteratorRow.hasNext()) {
	    		
	    		List<String> row = iteratorRow.next();

	            Iterator<String> iteratorColumn = row.iterator();
	            
	            int i = 1;
	            
	            SNPChromosomeRequestData snpchromosomerequestdata = new SNPChromosomeRequestData();
	            
        	    recordCount++;
        	    
        	    while (iteratorColumn.hasNext()) {
	        		
	        		String column = iteratorColumn.next();
	        		
	        		if ( i == 1 ) {
		        	    snpchromosomerequestdata.setChromosome(column.trim());
	        		}
	        		if ( i == 2 ) {
		        	    snpchromosomerequestdata.setLowRange(column.trim());
	        		}
	        		if ( i == 3 ) {
		        	    snpchromosomerequestdata.setHighRange(column.trim());
	        		}
	        		if ( i == 4 ) {
		        	    snpchromosomerequestdata.setReference(column.trim());
	        		}
	        		if ( i == 5 ) {
		        	    snpchromosomerequestdata.setAlternative(column.trim());
	        		}
	        		
	        		i++;
	         	}

         		dtosearchsnpchromosomeList.add( snpchromosomerequestdata.convertToDTOSearchSNPChromosome() );
         		
         		/*
	         	if ( snpchromosomerequestdata.isThisAValidSNPChromosomeRequestData() ) {
	         		
	         		//Wrapper.printMessage("snpchromosomerequestdata.toString() : " + snpchromosomerequestdata.toString(), messagePriority, requestPriority);
		         	
	         	}
	         	else {
	         		
	         		error++;
	         		Wrapper.printMessage("Error No." + error + " : " + snpchromosomerequestdata.toString(), messagePriority, requestPriority);
	         	}
         		 */
	     	}
		}
		catch (Exception e) {
			
	        Wrapper.printMessage("Exception : " + e.toString(), messagePriority, requestPriority);
		}
		
		return dtosearchsnpchromosomeList;
	}
	
	
	public static List<DTOSearchSNPChromosome> run ( File file, int startRecordCount, String messagePriority, String requestPriority ) throws Exception {

        // Create List of SNPChromosomeRequestDatas
        List<DTOSearchSNPChromosome> dtosearchsnpchromosomeList = new ArrayList<DTOSearchSNPChromosome>();

		try {

	     	int error = 0;

	     	long recordCount = startRecordCount + 1;

	        // Format InputStream for CSV.
	        InputStream csvInput = FileUtil.readStream(file);
	        
	        // Create CSV List
	        List<List<String>> csvList = CsvUtil.parseCsv(csvInput, '\t');

	        // Create CSV List

	        Iterator<List<String>> iteratorRow = csvList.iterator();
	        
	     	while (iteratorRow.hasNext()) {
	    		
	    		List<String> row = iteratorRow.next();

	            Iterator<String> iteratorColumn = row.iterator();
	            
	            int i = 1;
	            
	            SNPChromosomeRequestData snpchromosomerequestdata = new SNPChromosomeRequestData();
	            
        	    recordCount++;
        	    
        	    while (iteratorColumn.hasNext()) {
	        		
	        		String column = iteratorColumn.next();
	        		
	        		if ( i == 1 ) {
		        	    snpchromosomerequestdata.setChromosome(column.trim());
	        		}
	        		if ( i == 2 ) {
		        	    snpchromosomerequestdata.setLowRange(column.trim());
	        		}
	        		if ( i == 3 ) {
		        	    snpchromosomerequestdata.setHighRange(column.trim());
	        		}
	        		if ( i == 4 ) {
		        	    snpchromosomerequestdata.setReference(column.trim());
	        		}
	        		if ( i == 5 ) {
		        	    snpchromosomerequestdata.setAlternative(column.trim());
	        		}
	        		
	        		i++;
	         	}

	         	if ( snpchromosomerequestdata.isThisAValidSNPChromosomeRequestData() ) {
	         		
	         		//Wrapper.printMessage("snpchromosomerequestdata.toString() : " + snpchromosomerequestdata.toString(), messagePriority, requestPriority);
		         	
	         		dtosearchsnpchromosomeList.add( snpchromosomerequestdata.convertToDTOSearchSNPChromosome() );
	         	}
	         	else {
	         		
	         		error++;
	         		Wrapper.printMessage("Error No." + error + " : " + snpchromosomerequestdata.toString(), messagePriority, requestPriority);
	    	        System.exit(99);
	         	}
	     	}
		}
		catch (Exception e) {
			
	        Wrapper.printMessage("Exception : " + e.toString(), messagePriority, requestPriority);
	        
	        System.exit(99);
		}
		
		return dtosearchsnpchromosomeList;
	}

}
