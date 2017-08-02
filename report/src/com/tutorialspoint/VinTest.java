package com.tutorialspoint;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class VinTest {
	
	public static void main(String[] args) {
		
		
		 String sourceFileName =  "C:/GIT/PUBLIC/jasper/report/target/jasper/vin.jasper";
		 
		 String printFileName = null;
		 
		 List<VinBean> l = Arrays.asList(new VinBean("dj", "28"),new VinBean("Vinayak", "23"));
				 
		 JRBeanCollectionDataSource beanColDataSource = new 
		         JRBeanCollectionDataSource(l);
		
		 Map parameters = new HashMap();
		 parameters.put("exampleParameter", "My List");
		 try {
	    	   printFileName = JasperFillManager.fillReportToFile( 
	            sourceFileName, parameters, beanColDataSource);
	       
	    	   //Print report logic
	    	   /*if(printFileName != null){
	            JasperPrintManager.printReport( printFileName, true);
	         }*/

	    	   //pdf logic
	    	   JasperExportManager.exportReportToPdfFile(printFileName, "C://sample_report.pdf");
	    	   JasperExportManager.exportReportToHtmlFile(printFileName, "C://sample_report.html");
	         
	      } catch (JRException e) {
	         e.printStackTrace();
	      }
		 
		 
	}

}
