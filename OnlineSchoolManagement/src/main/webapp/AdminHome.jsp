<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Home Page</title>
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


<form>
<table align="center">
<h2 align="center">Welcome Admin!</h2>
<hr>
<tr>
<td><a href="Getstudentslist.jsp">List of students</a><br></td>
</tr>

<tr>
<td><a href="Getteacherslist.jsp">List of teachers</a><br></td>
</tr>

<tr>
<td><a href="Getsubjectlist.jsp">List of subjects</a><br></td>
</tr>

<tr>
<td><a href="Getclasseslist.jsp">List of classes</a><br></td>
</tr>

<tr>
<td><a href="Gettimetable.jsp">Time Table</a></td>
</tr>

<tr>
<td><a href="Getclassreport.jsp">ClassReport</a></td>
</tr>

</table>
</form>

<form action="LearnerAdmin" method="post">

<table align="center">

<tr>
<br>
</tr>
<tr>
<br>
</tr>

<tr>
<td><input type="submit" value="logout" name="dash"></td>
</tr>
</table>
</form>


</body>
</html>