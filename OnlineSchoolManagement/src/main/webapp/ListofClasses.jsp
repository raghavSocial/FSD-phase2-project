<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="com.raghav.LearnerBean.ClassesBean" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Classes</title>
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


<h2 align="center">List of Classes!</h2>

<%

List<ClassesBean>listofclasses=(List<ClassesBean>)request.getAttribute("values of table classes inListofclasses2");

// list of subject has many sub_bean objects , each object contains a single row of a table, need to fetch it from the list

for(ClassesBean clbean:listofclasses)
{
	
%>

<table align="center" border="">

<tr>
<td align="center">Class Name</td>
<td align="center">NumberOFStudent</td>
<td align="center">Floor</td>
</tr>

<tr>

<td align="center"><%=clbean.getClass_name()%></td>
<td align="center"><%=clbean.getNumberofstudent()%></td>
<td align="center"><%=clbean.getFloor()%></td>
	
</tr>
<br>
</table>

<% 
}

%>

</body>
</html>