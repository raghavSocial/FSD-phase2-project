<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.raghav.LearnerBean.TimetableBean" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Time Table page</title>
</head>
<body>
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


<h2 align="center">Time Table with Classes, Subjects,and Teachers Assigned!</h2>

<%

List<TimetableBean>timetablelist=(List<TimetableBean>)request.getAttribute("table valuesoftimetable inlist");

// list of subject has many sub_bean objects , each object contains a single row of a table, need to fetch it from the list

for(TimetableBean tbean:timetablelist)
{
	
%>

<table align="center" border="">

<tr>
<td align="center">Period</td>
<td align="center">Classes Assigned</td>
<td align="center">Subject Assigned</td>
<td align="center">Time Duration</td>
<td align="center">Teacher Assigned</td>
<td align="center">Student InClass</td>
</tr>

<tr>

<td align="center"><%=tbean.getPeriod() %></td>
<td align="center"><%=tbean.getClasses_assigned() %></td>
<td align="center"><%=tbean.getSubjects_assigned() %></td>
<td align="center"><%=tbean.getTime_duration() %></td>
<td align="center"><%=tbean.getTeacher_assigned() %></td>
<td align="center"><%=tbean.getStudent_inclass() %></td>
	
</tr>
<br>
</table>

<% 
}

%>

</body>
</body>
</html>