package com.raghav.Learnercontroller;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.raghav.LearnerBean.ClassReportBean;
import com.raghav.LearnerBean.ClassesBean;
import com.raghav.LearnerBean.StudentBean;
import com.raghav.LearnerBean.SubjectBean;
import com.raghav.LearnerBean.TeacherBean;
import com.raghav.LearnerBean.TimetableBean;
import com.raghav.LearnerBean.VerifyBean;
import com.raghav.Learnerservice.LearnerAdminService;


@WebServlet("/LearnerAdmin")

public class LearnerAdmin extends HttpServlet

{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		LearnerAdminService adservice=new LearnerAdminService();
		String buttonvalue=request.getParameter("button");
		
	//1 Student list
		if(buttonvalue.equalsIgnoreCase("GetListOFStudents")) 
		{
			try 
			{
				List<StudentBean> s3bean=adservice.getStudentsList();
				request.setAttribute("table valuesinListofstudentbean", s3bean);
				RequestDispatcher rd=request.getRequestDispatcher("/ListOfStudents.jsp");
				rd.forward(request, response);
			} 
			
			catch (Exception e) 
			{

				e.printStackTrace();
			}
		}
		
		//2 Teachers list
		else if(buttonvalue.equalsIgnoreCase("GetListOFTeachers"))
		{
			try 
			{
				
				
				List<TeacherBean>listofteachers2=adservice.getTeachersList();
				request.setAttribute("table valuesinListofteachersbean", listofteachers2);
				RequestDispatcher rd=request.getRequestDispatcher("/ListOfTeachers.jsp");
				rd.forward(request, response);
				
				
			} 
			catch (Exception e) 
			{
				
				e.printStackTrace();
			}
		}
		
		
		//3.List of Subjects
		
		else if(buttonvalue.equalsIgnoreCase("GetListOFSubjects"))
		{
			
			
			
			 
			try 
			
			{
				
				List<SubjectBean>sub_bean2=adservice.getSubjectsList();
				request.setAttribute("subjectsTable in Sub_bean list", sub_bean2);
				RequestDispatcher rd=request.getRequestDispatcher("/ListofSubjects.jsp");
				rd.forward(request, response);
				
				
			} 
			
			catch (Exception e) 
			{
				
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		//4. List of Classes
		else if(buttonvalue.equalsIgnoreCase("GetListOFClasses")) 
		{ 
			try 
			{
				List<ClassesBean>listofclasses2=adservice.getClassesList();
				request.setAttribute("values of table classes inListofclasses2",listofclasses2);
				RequestDispatcher rd=request.getRequestDispatcher("/ListofClasses.jsp");
				rd.forward(request, response);
				
			} 
			catch (Exception e) 
			{
				
				e.printStackTrace();
				
			}
		}
		
		//5.Time table
		
		
		else if(buttonvalue.equalsIgnoreCase("GetTimeTable"))
		{
			
			
			try 
			{
				
				
				List<TimetableBean>timetablelist2=adservice.getTimeTable();
				request.setAttribute("table valuesoftimetable inlist", timetablelist2);
				RequestDispatcher rd=request.getRequestDispatcher("/TimeTable.jsp");
				rd.forward(request, response);
				
			} 
			
			catch (Exception e) 
			
			{
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		//6.ClassReport
		
		else if(buttonvalue.equalsIgnoreCase("GetClassReport"))
		{
			
			
			try 
			{
				
				
				List<ClassReportBean>classreportlist2=adservice.getClassReport();
				request.setAttribute("table valuesofclassreport inlist", classreportlist2);
				RequestDispatcher rd=request.getRequestDispatcher("/ClassReport.jsp");
				rd.forward(request, response);
				
			} 
			
			catch (Exception e) 
			
			{
				e.printStackTrace();
			}
			
			
		}
		else 
		{
			//
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		HttpSession session =request.getSession();
		String buttonvalue=request.getParameter("dash");
		
		if(buttonvalue.equalsIgnoreCase("login"))
			
		{
			
		try 
		
		{	
		
		String admin_username=request.getParameter("adminname");	
		String admin_password=request.getParameter("adminpassword");	
		
		
		session.setAttribute("admin username", admin_username);
		session.setAttribute("admin password", admin_password);
		
	//	service.login();
		VerifyBean v1bean =new VerifyBean();
		v1bean.setAdmin_username(admin_username);
		v1bean.setAdmin_password(admin_password);
		LearnerAdminService adservice=new LearnerAdminService();
		VerifyBean beanfromdb=adservice.adminLogin(v1bean);
		
		if(beanfromdb.getAdmin_username()==null &&beanfromdb.getAdmin_password()==null)	 
		{
			response.sendRedirect("Errorpage.jsp");
		}
		 
		else if(beanfromdb.getAdmin_username().equals(v1bean.getAdmin_username())&& beanfromdb.getAdmin_password().equals(v1bean.getAdmin_password())) 
		{
			
			RequestDispatcher rd=request.getRequestDispatcher("/AdminHome.jsp");
			rd.forward(request, response);
		}
		
		
		}
		
		catch(Exception e) 
		{
		System.out.println(e);
		}
		
		
		}//if ends here for login
		
	if(buttonvalue.equalsIgnoreCase("logout"))
	{
		
//		response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//http 1.1
//		response.setHeader("", "no-store");//http 1.0
//		response.setHeader("timer","0");// proxy
		session.removeAttribute("admin username");
		session.removeAttribute("admin password");
		session.invalidate();
		response.sendRedirect("LearnerAdminlogin.html");
	}
		
		
		
		
	
	}

}// class ends here
