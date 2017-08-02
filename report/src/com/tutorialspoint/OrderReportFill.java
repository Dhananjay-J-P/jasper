package com.tutorialspoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class OrderReportFill {
	public static void main(String[] args) {
		String sourceFileName = "C:/jas/report/target/jasper/Ord.jasper";
		String printFileName = null;
		/*
		 * DataBeanList DataBeanList = new DataBeanList(); ArrayList<DataBean>
		 * dataList = DataBeanList.getDataBeanList();
		 * 
		 * JRBeanCollectionDataSource beanColDataSource = new
		 * JRBeanCollectionDataSource(dataList);
		 */
		OrderItem i=new OrderItem("123", "2");
		OrderItem i2=new OrderItem("124", "4");
		List<OrderItem> l=new ArrayList<>();
		l.add(i);
		l.add(i2);
		
		OrderBean order = new OrderBean("ORD255","2017-08-02",l);
		
		List<OrderBean> l2 = new ArrayList<OrderBean>();
		l2.add(order);
		
		JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(l2);
		Map parameters = new HashMap();
		try {
			printFileName = JasperFillManager.fillReportToFile(sourceFileName, parameters, beanColDataSource);

			// Print report logic
			/*
			 * if(printFileName != null){ JasperPrintManager.printReport(
			 * printFileName, true); }
			 */

			// pdf logic
			JasperExportManager.exportReportToPdfFile(printFileName, "C://sample_report.pdf");

		} catch (JRException e) {
			e.printStackTrace();
		}
	}
}
