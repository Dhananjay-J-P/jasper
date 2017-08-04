package com.tutorialspoint;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.erp.constants.ORDER_STATUS;
import com.erp.constants.PAYMENT_STATUS;
import com.erp.customer.ERPAddress;
import com.erp.customer.ERPCustomer;
import com.erp.order.ERPOrder;
import com.erp.payment.ERPPayment;
import com.erp.product.ERPPart;
import com.erp.product.ERPPartQuantityMap;
import com.erp.product.ERPProduct;
import com.erp.product.ERPSaleItem;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class TestPrint2 {

	
	public static void main(String[] args) {
		
		
	      
		String orderJasper =  "resource/jasper/tabletemplate.jasper";
		String printFileName = null;
		 
		ERPCustomer customer = new ERPCustomer("Dhananjay", "Patade", new ERPAddress("Vartak Nagar", "Mh", 400606),
				Long.parseLong("9930007916"), Long.parseLong("9930007916"));
		customer.setCustomerId("C123");
		ERPPart part = new ERPPart("Par1", 100.00, null);
		part.setPartId(120);

		ERPProduct product = new ERPProduct("Prod1", "", 200.00, null);
		product.setId("P200");
		
		com.erp.product.ERPPartQuantityMap map = new ERPPartQuantityMap(part, 2);

		product.getPartQuantityMapSet().add(map);

		ERPPayment payment = new ERPPayment("Cash", 100, new Date());

		ERPPayment payment2 = new ERPPayment("Cheque", 1200, new Date());
		payment2.setChequeId("122222");
		ERPSaleItem item = new ERPSaleItem(product, 10, 1000.00);
		ERPSaleItem item2 = new ERPSaleItem(product, 11, 1000.00);

		ERPOrder order = new ERPOrder(new Date(), new Date(), "Pending", customer, "100", new ArrayList<>());
		order.setOrderId("ORD355");
		order.getSaleItemList().add(item2);
		order.getSaleItemList().add(item);
		order.getSaleItemList().add(item2);
		order.getSaleItemList().add(item);
		order.getSaleItemList().add(item2);
		order.getSaleItemList().add(item);
		
		order.getTenderList().add(payment);
		order.getTenderList().add(payment2);
		order.setOrderDate(new Date());
		order.setOrderStatus(ORDER_STATUS.STATUS_PLACED.value());
		order.setPaymentStatus(PAYMENT_STATUS.STATUS_PENDING.value());
		
		
		  try {
		        

		        
		         DataBeanList DataBeanList = new DataBeanList();
			      ArrayList<DataBean> dataList = DataBeanList.getDataBeanList();
			      ArrayList<ERPSaleItem> or=new ArrayList<ERPSaleItem>();
			      or.add(item);
			    JRBeanCollectionDataSource beanColDataSource = new 
			             JRBeanCollectionDataSource(or);
			    
			    
			    Map parameters = new HashMap();
		        parameters.put("INFO", "Hello");
		        parameters.put("DS1", beanColDataSource);

		        
			    
				printFileName= JasperFillManager.fillReportToFile(orderJasper, 
		        		  parameters,  new JREmptyDataSource());

		         
		         JasperExportManager.exportReportToHtmlFile(printFileName, "resource/output/sample_report.html");
		         
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
