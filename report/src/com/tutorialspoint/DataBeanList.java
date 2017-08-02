package com.tutorialspoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataBeanList {
   public ArrayList<DataBean> getDataBeanList() {

      // Create sub report data
      SubReportBean subBean1 = new SubReportBean();
      subBean1.setItemId("1234");
      subBean1.setItemQ("2");
      
      SubReportBean subBean2 = new SubReportBean();
      subBean2.setItemId("P234");
      subBean2.setItemQ("4");
     

      ArrayList<DataBean> dataBeanList = new ArrayList<DataBean>();

      // Create master report data
      dataBeanList.add(produce("2017-08-02", "ORD122",
         Arrays.asList(subBean1,subBean2)));

      return dataBeanList;
   }

   /*
    * This method returns a DataBean object,
    * with name, country and sub report
    * bean data set in it.
    */
   private DataBean produce(String date, String id,
      List<SubReportBean> subBean) {
      DataBean dataBean = new DataBean();

      dataBean.setOrderDate(date);
      dataBean.setOrderId(id);
      dataBean.setSubReportBeanList(subBean);

      return dataBean;
   }
}