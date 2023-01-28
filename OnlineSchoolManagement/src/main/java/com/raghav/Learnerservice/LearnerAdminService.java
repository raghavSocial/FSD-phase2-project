package com.raghav.Learnerservice;

import java.sql.ResultSet;
import java.util.List;

import com.raghav.LearnerBean.ClassReportBean;
import com.raghav.LearnerBean.ClassesBean;
import com.raghav.LearnerBean.StudentBean;
import com.raghav.LearnerBean.SubjectBean;
import com.raghav.LearnerBean.TeacherBean;
import com.raghav.LearnerBean.TimetableBean;
import com.raghav.LearnerBean.VerifyBean;
import com.raghav.LearnerDAO.ClassReportDAO;
import com.raghav.LearnerDAO.ClassesDAO;
import com.raghav.LearnerDAO.LearnerAdminDAO;
import com.raghav.LearnerDAO.StudentListDAO;
import com.raghav.LearnerDAO.SubjectsDAO;
import com.raghav.LearnerDAO.TeachersListDAO;
import com.raghav.LearnerDAO.TimetableDAO;

public class LearnerAdminService 


{

	
	// 1.login method
	public VerifyBean adminLogin(VerifyBean v2bean) throws Exception 
	{
		
		LearnerAdminDAO ldao=new LearnerAdminDAO();
		List<VerifyBean> beanfromdb_inlist1=ldao.adminLogin(v2bean);
		
		VerifyBean beanfromdb=new VerifyBean();
		for(VerifyBean vbean:beanfromdb_inlist1)
		{
			if(v2bean.getAdmin_username().equals(vbean.getAdmin_username())&&v2bean.getAdmin_password().equals(vbean.getAdmin_password()))
		{
			beanfromdb=vbean;
		}
			
		}
		return beanfromdb;
			
	}
	
	
	
	//2.GetStudentList 
	
	public List<StudentBean> getStudentsList() throws Exception 
	{
		
		StudentListDAO sdao=new StudentListDAO();
		List<StudentBean> s1bean=sdao.getStudentsList();
		
		
		return s1bean;
	}
	
	
	// 3.GetTeacherList 
	
	
	public List<TeacherBean> getTeachersList() throws Exception 
	{
		
		TeachersListDAO tdao=new TeachersListDAO();
		List<TeacherBean>listofteachers1=tdao.getTeachersList();
		return listofteachers1;
	}
	
	
	//4. GetSubjects List 
	
	
	public List<SubjectBean> getSubjectsList() throws Exception 
	{
		
		SubjectsDAO subdao=new SubjectsDAO();
		List<SubjectBean>sub_bean1=subdao.getSubjectsList();
		
		return sub_bean1;
	}
	
	
	//5.getClasses List 
	
	
	public List<ClassesBean> getClassesList() throws Exception 
	{
		
		ClassesDAO cldao=new ClassesDAO();
		List<ClassesBean>listofclasses1=cldao.getClassesList();
		return listofclasses1;
	}
	
	
	//6.getTimeTable
	
	public List<TimetableBean> getTimeTable() throws Exception 
	{
		
		TimetableDAO tdao=new TimetableDAO();
		List<TimetableBean>timetablelist1=tdao.getTimeTable();
		
		
		return timetablelist1;
	}
	
	
	
	
	
	
	
	//7. getClassReport method
	
	public List<ClassReportBean> getClassReport() throws Exception 
	{
		
		
		ClassReportDAO crdao= new ClassReportDAO();
		List<ClassReportBean>classreportlist1=crdao.getClassReport();
		
		return classreportlist1;
	}
	
	
	
}
