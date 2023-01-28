package com.raghav.LearnerDAO;

import java.sql.Connection;
import java.sql.DriverManager;

import com.raghav.LearnerBean.ClassReportBean;

import java.sql.*;
import java.util.*;


public class ClassReportDAO 

{
	
public List<ClassReportBean> getClassReport() throws Exception 
{
	String query="select * from classreport";
	Class.forName("oracle.jdbc.OracleDriver");
	Connection con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "nraghav", "raghavdb");
	PreparedStatement pst=con.prepareStatement(query);
	ResultSet rs=pst.executeQuery();
	List<ClassReportBean>classreportlist=new ArrayList();
	
	while(rs.next()) 
	{
		ClassReportBean crbean=new ClassReportBean();
		crbean.setClass_name(rs.getString(1));
		crbean.setStudent_name(rs.getString(2));
		crbean.setSubject_name(rs.getString(3));
		crbean.setTeachers_name(rs.getString(4));
		classreportlist.add(crbean);
		
	}
	
	return classreportlist;
	
}
	
}
