package com.raghav.LearnerDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.raghav.LearnerBean.VerifyBean;

public class LearnerAdminDAO


{

	public List<VerifyBean> adminLogin( VerifyBean v3bean) throws Exception 
	{
		String username_fromuser=v3bean.getAdmin_username();
		String query="select * from LearnerAcademyAdmin where admin_username="+"'"+username_fromuser+"'";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "nraghav", "raghavdb");
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		List<VerifyBean> beanfromdb_inlist=new ArrayList();
		while(rs.next()) 
		{
			VerifyBean beanfromdb=new VerifyBean();
//			rs.getString(1);
//			rs.getString(2);
			beanfromdb.setAdmin_username(rs.getString(1));
			beanfromdb.setAdmin_password(rs.getString(2));
			
			beanfromdb_inlist.add(beanfromdb);
		}
		
		return beanfromdb_inlist;
	}
	
	
}
