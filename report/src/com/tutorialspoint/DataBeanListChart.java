package com.tutorialspoint;

import java.util.ArrayList;

public class DataBeanListChart {
   public static ArrayList<DataBeanChart> getDataBeanList() {
      ArrayList<DataBeanChart> dataBeanList = new ArrayList<DataBeanChart>();

      dataBeanList.add(produce("RTX 240", 150));
      dataBeanList.add(produce("ELECTRO 320", 68));
      dataBeanList.add(produce("ELC 210", 38));
      dataBeanList.add(produce("XBer", 88));
      
      
      return dataBeanList;
   }

   /*
    * This method returns a DataBean object, with subjectName ,
    * and marks set in it.
    */
   private static DataBeanChart produce(String subjectName, Integer marks) {
      DataBeanChart dataBean = new DataBeanChart();

      dataBean.setSubjectName(subjectName);
      dataBean.setMarks(marks);

      return dataBean;
   }
}