<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.raghav.LearnerBean.ClassReportBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ClassReport Data</title>
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

<h2 align="center">ClassReport</h2>

<%
List<ClassReportBean>classreportlist=(List<ClassReportBean>)request.getAttribute("table valuesofclassreport inlist");

for( ClassReportBean crbean:classreportlist)
{
	 
%>
	<table align="center" border="1">
	
	
	<tr>
	<td align="center">Class</td>
	<td align="center">Student Name</td>
	<td align="center">Subject Name</td>
	<td align="center">Teachers Name</td>
	</tr>
	
	<tr>
	<td align="center"><%=crbean.getClass_name()%></td>
	<td align="center"><%=crbean.getStudent_name()%></td>
	<td align="center"><%=crbean.getSubject_name()%></td>
	<td align="center"><%=crbean.getTeachers_name()%></td>
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