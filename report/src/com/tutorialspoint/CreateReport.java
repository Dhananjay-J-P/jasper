package com.tutorialspoint;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class CreateReport {

   public static void main(String[] args) {
      String masterReportFileName = "C:/jas/report/resource/jrxml/jasperaddress_report_template.jrxml";
      String subReportFileName = "C:/jas/report/resource/jrxml/address_report_template.jrxml";
      String destFileName = "C:/jas/report/target/jasper/jasper_report_template.JRprint";
			 
      DataBeanList DataBeanList = new DataBeanList();
      ArrayList<DataBean> dataList = DataBeanList.getDataBeanList();
      JRBeanCollectionDataSource beanColDataSource = new 
         JRBeanCollectionDataSource(dataList);

      try {
         /* Compile the master and sub report */
         JasperReport jasperMasterReport = JasperCompileManager
            .compileReport(masterReportFileName);
         JasperReport jasperSubReport = JasperCompileManager
            .compileReport(subReportFileName);

         Map<String, Object> parameters = new HashMap<String, Object>();
         parameters.put("subreportParameter", jasperSubReport);
         parameters.put("exampleParameter", "Order Summary");
         
         BufferedImage image;
		try {
			image = ImageIO.read(new File("C:/Users/Dhananjay P/Desktop/dcm/a.jpg") );
			 parameters.put("logo", image );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
         
         JasperFillManager.fillReportToFile(jasperMasterReport, 
            destFileName, parameters, beanColDataSource);

         JasperExportManager.exportReportToHtmlFile(destFileName, "C://sample_report.html");
         
        /* try {
      	
           if(destFileName != null){
              JasperPrintManager.printReport( destFileName, true);
           }
        } catch (JRException e) {
           e.printStackTrace();
        }*/
      } catch (JRException e) {

         e.printStackTrace();
      }
      System.out.println("Done filling!!! ...");
   }
}