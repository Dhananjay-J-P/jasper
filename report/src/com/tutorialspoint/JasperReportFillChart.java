package com.tutorialspoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class JasperReportFillChart {
   @SuppressWarnings("unchecked")
   public static void main(String[] args) {
      String sourceFileName = 
         "C:/jas/report/target/jasper/chart.jasper";
      String printFileName = null;
     
      ArrayList<DataBeanChart> dataList = DataBeanListChart.getDataBeanList();

      JRBeanCollectionDataSource beanColDataSource = new 
         JRBeanCollectionDataSource(dataList);

      Map parameters = new HashMap();

      try {
    	  printFileName =  JasperFillManager.fillReportToFile( sourceFileName,
            parameters, beanColDataSource);
    	  
    	  JasperExportManager.exportReportToHtmlFile(printFileName, "C://sample_report.html");
      } catch (JRException e) {
         e.printStackTrace();
      }
   }
}