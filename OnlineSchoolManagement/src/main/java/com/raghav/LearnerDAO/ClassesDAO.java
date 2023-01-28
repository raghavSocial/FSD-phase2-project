package com.raghav.LearnerDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.raghav.LearnerBean.ClassesBean;
import com.raghav.LearnerBean.SubjectBean;

public class ClassesDAO 

{
	
	
	
		public List<ClassesBean> getClassesList()  throws Exception 
		{
			
			String query="select * from classes";
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "nraghav", "raghavdb");
			PreparedStatement pst =con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			List<ClassesBean>listofclasses=new ArrayList();
			while(rs.next()) 
			{
				ClassesBean cl_bean=new ClassesBean();
				cl_bean.setClass_name(rs.getString(1));
				cl_bean.setNumberofstudent(rs.getInt(2));
				cl_bean.setFloor(rs.getString(3));
				listofclasses.add(cl_bean);
				
			}
			
			return listofclasses;
		}
	
	

}
