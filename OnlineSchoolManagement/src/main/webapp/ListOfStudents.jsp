<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="com.raghav.LearnerBean.StudentBean" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Students</title>
</head>
<body>

<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//for Http 1.1
response.setHeader("Pragma","no-cache"); //for Http 1.0
response.setHeader("Expires","0"); // for proxies
		
if(session.getAttribute("admin username")==null)
{
	
response.sendRedirect("LearnerAdminlogin.html");

}
%>

<h2 align="center">List of Students of LearnerAcademy and Their Details</h2>

<%

List<StudentBean> listofstudent =(List<StudentBean>)request.getAttribute("table valuesinListofstudentbean");

for(StudentBean sbean:listofstudent)
{
%>

<table align="center" border="1">

<tr>
    <td align="center">Student Name:</td><td align="center"><%=sbean.getStudent_name()%></td>
</tr>	

<tr>
	<td align="center">Student RollNumber:</td><td align="center"><%=sbean.getStudent_roll()%></td>
</tr>
	
<tr>
	<td align="center">Student Studing In:</td><td align="center"><%=sbean.getStuding_in()%></td>
</tr>	

<tr>
	<td align="center">Student Age:</td><td align="center"><%=sbean.getStudent_age()%></td>
</tr>	

<tr>
	<td align="center">Student Address:</td><td align="center"><%=sbean.getStudent_address()%></td>	
</tr>	

<tr>
<br>
</tr>
</table>	
<% 
}
%>


</body>
</html>