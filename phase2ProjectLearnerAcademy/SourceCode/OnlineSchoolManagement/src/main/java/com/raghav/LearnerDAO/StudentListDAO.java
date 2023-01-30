package com.raghav.LearnerDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.raghav.LearnerBean.StudentBean;

public class StudentListDAO 

{
	
	
	public List<StudentBean> getStudentsList()  throws Exception 
	{
		
		String query="select * from LearnerAcademyStudent";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "nraghav", "raghavdb");
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();// we have whole table in rs now
		List<StudentBean> listofstudent=new ArrayList();
		
		while(rs.next())
		{
			StudentBean sbean=new StudentBean();
			sbean.setStudent_name(rs.getString(1));
			sbean.setStudent_roll(rs.getString(2));
			sbean.setStuding_in(rs.getString(3));
			sbean.setStudent_age(rs.getInt(4));
			sbean.setStudent_address(rs.getString(5));
			listofstudent.add(sbean);
		}
	
		
		return listofstudent;
	}
	
	
	
	
	

}
