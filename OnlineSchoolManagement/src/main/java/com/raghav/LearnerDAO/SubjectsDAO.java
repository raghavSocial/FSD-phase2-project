package com.raghav.LearnerDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.*;
import com.raghav.LearnerBean.SubjectBean;



public class SubjectsDAO 


{
	
	public List<SubjectBean> getSubjectsList() throws Exception 
	{
		
		String query="select * from LearnerAcademySubjects";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "nraghav", "raghavdb");
		PreparedStatement pst =con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		List<SubjectBean>listofsubject=new ArrayList();
		while(rs.next()) 
		{
			SubjectBean sub_bean=new SubjectBean();
			sub_bean.setSubject(rs.getString(1));
			sub_bean.setBookauthor(rs.getString(2));
			sub_bean.setSubjectteacher(rs.getString(3));
			listofsubject.add(sub_bean);
			
		}
		
		return listofsubject;
	}
	
	

}
