<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="com.raghav.LearnerBean.TeacherBean" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Teachers</title>
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

<h2 align="center">List of Teachers of LearnerAcademy and Their Details</h2>
<table align="center">

<% 
List<TeacherBean>listofteachers=(List<TeacherBean>)request.getAttribute("table valuesinListofteachersbean");

for(TeacherBean tbean:listofteachers)
{
	
%>
	<table align="center" border="1">
	
	
	<tr>
	<td align="center">Teacher Name</td>
	<td align="center">Teacher ID</td>
	<td align="center">Teacher Expertise</td>
	<td align="center">Teacher Experience</td>
	<td align="center">Teacher Phone</td>
	</tr>
	
	<tr>
	<td align="center"><%= tbean.getTeacher_name() %></td>
	<td align="center"><%= tbean.getTeacher_id() %></td>
	<td align="center"><%= tbean.getSubject_expertise() %></td>
	<td align="center"><%= tbean.getExperience() %></td>
	<td align="center"><%= tbean.getPhone() %></td>	
	</tr>
	
	<tr>
	<br>
	</tr>
	</table>
<% 	
}
%>



</table>

</body>
</html>