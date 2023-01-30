package com.raghav.LearnerDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import com.raghav.LearnerBean.TeacherBean;

import java.sql.*;

public class TeachersListDAO 

{

	public List<TeacherBean> getTeachersList() throws Exception 
	{
		String query="select * from LearnerAcademyTeachers";
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "nraghav", "raghavdb");
		PreparedStatement pst =con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		
		List<TeacherBean>listofteachers=new ArrayList();
		
		while(rs.next())
		{
		TeacherBean tbean=new TeacherBean();
		tbean.setTeacher_name(rs.getString(1));
		tbean.setTeacher_id(rs.getString(2));
		tbean.setSubject_expertise(rs.getString(3));
		tbean.setExperience(rs.getInt(4));
		tbean.setPhone(rs.getInt(5));
			listofteachers.add(tbean);
			
		}
		
		return listofteachers;
		
		
	}
	
	
}
