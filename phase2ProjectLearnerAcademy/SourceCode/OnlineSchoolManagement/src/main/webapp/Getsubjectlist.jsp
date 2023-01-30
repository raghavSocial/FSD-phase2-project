<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Subject page</title>
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

<form action="LearnerAdmin" method="get">
<h2 align="center">Get Subjects List from here!</h2>


<table align="center">

<tr>
<br>
</tr>
<tr>
<td align="center"><input type="submit"  value="GetListOFSubjects" name="button"></td>
</tr>

</table>



</form>

</body>
</html>