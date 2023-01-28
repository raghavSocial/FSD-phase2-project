package com.raghav.LearnerDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.raghav.LearnerBean.TimetableBean;

public class TimetableDAO 

{
	
	
	public List<TimetableBean> getTimeTable() throws Exception 
	{
		String query="select * from timetable";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "nraghav", "raghavdb");
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		List<TimetableBean>timetablelist=new ArrayList();
		
		while(rs.next()) 
		{
			TimetableBean tbean=new TimetableBean();
			tbean.setPeriod(rs.getString(1));
			tbean.setClasses_assigned(rs.getString(2));
			tbean.setSubjects_assigned(rs.getString(3));
			tbean.setTime_duration(rs.getString(4));
			tbean.setTeacher_assigned(rs.getString(5));
			tbean.setStudent_inclass(rs.getString(6));
			timetablelist.add(tbean);
			
		}
		
		return timetablelist;
		
	}
	

}
