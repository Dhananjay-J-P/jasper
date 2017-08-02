package com.tutorialspoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class JasperReportFill {
   @SuppressWarnings("unchecked")
   public static void main(String[] args) {
      String sourceFileName =  "C:/jas/report/target/jasper/jasper_report_template.jasper";
      String printFileName = null;
      DataBeanList DataBeanList = new DataBeanList();
      ArrayList<DataBean> dataList = DataBeanList.getDataBeanList();

      JRBeanCollectionDataSource beanColDataSource = new 
         JRBeanCollectionDataSource(dataList);

      Map parameters = new HashMap();
      try {
    	   printFileName = JasperFillManager.fillReportToFile( 
            sourceFileName, parameters, beanColDataSource);
       
    	   //Print report logic
    	   /*if(printFileName != null){
            JasperPrintManager.printReport( printFileName, true);
         }*/

    	   //pdf logic
    	   JasperExportManager.exportReportToPdfFile(printFileName, "C://sample_report.pdf");
         
         
      } catch (JRException e) {
         e.printStackTrace();
      }
   }
}