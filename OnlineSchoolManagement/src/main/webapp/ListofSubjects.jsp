<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.util.*" %>
    <%@ page import="com.raghav.LearnerBean.SubjectBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Subject Page</title>
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

<h2 align="center">List of Subjects!</h2>

<%

List<SubjectBean>listofsubjects=(List<SubjectBean>)request.getAttribute("subjectsTable in Sub_bean list");

// list of subject has many sub_bean objects , each object contains a single row of a table, need to fetch it from the list

for(SubjectBean sub_bean:listofsubjects)
{
	
%>

<table align="center" border="">

<tr>
<td align="center">Subject</td>
<td align="center">BookAuthor</td>
<td align="center">SubjectTeacher</td>
</tr>

<tr>

<td align="center"><%=sub_bean.getSubject()%></td>
<td align="center"><%=sub_bean.getBookauthor()%></td>
<td align="center"><%=sub_bean.getSubjectteacher()%></td>
	
</tr>
<br>
</table>

<% 
}

%>

</body>
</html>