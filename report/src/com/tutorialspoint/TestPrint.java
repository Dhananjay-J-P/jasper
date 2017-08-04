package com.tutorialspoint;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

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

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class TestPrint {

	
	public static void main(String[] args) {
		
		
	      
		String orderJasper =  "resource/jasper/order.jasper";
		String itemJasper =  "resource/jasper/itemlist.jasper";
		String tenderJasper =  "resource/jasper/tender.jasper";
		 String printFileName = null;
		 
		ERPCustomer customer = new ERPCustomer("Dhananjay", "Patade", new ERPAddress("Vartak Nagar", "Mh", 400606),
				Long.parseLong("9930007916"), Long.parseLong("9930007916"));
		customer.setCustomerId("C123");
		ERPPart part = new ERPPart("Par1", 100.00, null);
		part.setPartId(120);

		ERPProduct product = new ERPProduct("Prod1", "", 20000.00, null);
		product.setId("P200");
		
		com.erp.product.ERPPartQuantityMap map = new ERPPartQuantityMap(part, 2);

		product.getPartQuantityMapSet().add(map);

		ERPPayment payment = new ERPPayment("Cash", 100, new Date());

		ERPPayment payment2 = new ERPPayment("Cheque", 1200, new Date());
		payment2.setChequeId("122232");
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
		order.getSaleItemList().add(item);
		order.getSaleItemList().add(item2);
		order.getSaleItemList().add(item);
		order.getSaleItemList().add(item2);
		order.getSaleItemList().add(item);
		
		
		/*order.getTenderList().add(payment);*/
		order.getTenderList().add(payment2);
		order.setOrderDate(new Date());
		order.setOrderStatus(ORDER_STATUS.STATUS_PLACED.value());
		order.setPaymentStatus(PAYMENT_STATUS.STATUS_PENDING.value());
		
		
		  try {
		        

		         Map<String, Object> parameters = new HashMap<String, Object>();
		         parameters.put("saleItemList", itemJasper);
		         parameters.put("tenderList", tenderJasper);
		         parameters.put("grandItemTotal",order.getOrderTotal());
		         parameters.put("grandTenderTotal",order.getOrderTenderTotal() );
		         parameters.put("balanceDue", order.getOrderTotal() - order.getOrderTenderTotal());
		         parameters.put("ERName", "Order Summary");
		         parameters.put("customerId",order.getCustomer().getCustomerId() );
		         parameters.put("cname",order.getCustomer().getName()+" "+order.getCustomer().getLname());
		         parameters.put("pstatus",PAYMENT_STATUS.STATUS_PENDING.value() );
		         parameters.put("orderStatus",ORDER_STATUS.STATUS_PLACED.value());
		         parameters.put("orderId", order.getOrderId());
		         parameters.put("orderDate", order.getOrderDate());
		         
		         
		         BufferedImage image;
				try {
					image = ImageIO.read(new File("C:/Users/Dhananjay P/Desktop/dcm/a.jpg") );
					 parameters.put("logo", image );
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			      ArrayList<ERPOrder> or=new ArrayList<>();
			      or.add(order);
			    JRBeanCollectionDataSource beanColDataSource = new 
			             JRBeanCollectionDataSource(or);
			     
				printFileName= JasperFillManager.fillReportToFile(orderJasper, 
		        		  parameters, beanColDataSource);

		         
		         JasperExportManager.exportReportToHtmlFile(printFileName, "resource/output/sample_report.html");
		         JasperExportManager.exportReportToPdfFile(printFileName, "resource/output/sample_report.pdf");
		         
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
