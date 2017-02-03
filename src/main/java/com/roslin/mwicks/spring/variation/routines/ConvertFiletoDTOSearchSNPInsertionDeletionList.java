package com.roslin.mwicks.spring.variation.routines;

import java.io.InputStream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.roslin.mwicks.utility.CsvUtil;
import com.roslin.mwicks.utility.Wrapper;

import com.roslin.mwicks.spring.variation.dto.web.objects.snpinsertiondeletion.DTOSearchSNPInsertionDeletion;

import com.roslin.mwicks.spring.variation.model.other.SNPInsertionDeletionRequestData;


public final class ConvertFiletoDTOSearchSNPInsertionDeletionList {

    // Constants ----------------------------------------------------------------------------------
	protected static final String STRING_NA = "NA";
	protected static final String STRING_FIXED = "fixed";
	protected static final String STRING_NOT_FIXED = "not_fixed";
	protected static final String STRING_REFERENCE = "ref";

	protected static final String STRING_OUTPUT_NA = "N/A";
	protected static final String STRING_OUTPUT_FIXED = "Fixed";
	protected static final String STRING_OUTPUT_NOT_FIXED = "Not Fixed";
	protected static final String STRING_OUTPUT_REFERENCE = "Ref.";
	

	public static List<DTOSearchSNPInsertionDeletion> run ( InputStream csvInput, int startRecordCount, String messagePriority, String requestPriority ) throws Exception {

        // Create List of SNPInsertionDeletionRequestDatas
        List<DTOSearchSNPInsertionDeletion> dtosearchsnpinsertiondeletionList = new ArrayList<DTOSearchSNPInsertionDeletion>();

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
	            
	            SNPInsertionDeletionRequestData snpinsertiondeletionrequestdata = new SNPInsertionDeletionRequestData();
	            
        	    recordCount++;
        	    
        	    while (iteratorColumn.hasNext()) {
	        		
	        		String column = iteratorColumn.next();
	        		
	        		if ( i == 1 ) {
		        	    snpinsertiondeletionrequestdata.setChromosome(column.trim());
	        		}
	        		if ( i == 2 ) {
		        	    snpinsertiondeletionrequestdata.setLowRange(column.trim());
	        		}
	        		if ( i == 3 ) {
		        	    snpinsertiondeletionrequestdata.setHighRange(column.trim());
	        		}
	        		if ( i == 4 ) {
		        	    snpinsertiondeletionrequestdata.setReferenceBreed(column.trim());
	        		}
	        		if ( i == 5 ) {
		        	    snpinsertiondeletionrequestdata.setAlternativeBreed(column.trim());
	        		}
	        		
	        		i++;
	         	}

         		dtosearchsnpinsertiondeletionList.add( snpinsertiondeletionrequestdata.convertToDTOSearchSNPInsertionDeletion() );
         		
         		/*
	         	if ( snpinsertiondeletionrequestdata.isThisAValidSNPInsertionDeletionRequestData() ) {
	         		
	         		//Wrapper.printMessage("snpinsertiondeletionrequestdata.toString() : " + snpinsertiondeletionrequestdata.toString(), messagePriority, requestPriority);
		         	
	         	}
	         	else {
	         		
	         		error++;
	         		Wrapper.printMessage("Error No." + error + " : " + snpinsertiondeletionrequestdata.toString(), messagePriority, requestPriority);
	         	}
         		 */
	     	}
		}
		catch (Exception e) {
			
	        Wrapper.printMessage("Exception : " + e.toString(), messagePriority, requestPriority);
		}
		
		return dtosearchsnpinsertiondeletionList;
	}
}
