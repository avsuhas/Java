<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user-data</title>
</head>
<body>

<%
String FirstName = request.getParameter("firstName");
String LastName = request.getParameter("last_name");
String PhoneNumber = request.getParameter("phoneno");
%>


<h2>Entered User data;</h2>
<br></br>
First Name: ${param.firstName}
<br></br>
Last Name: ${param.last_name}
<br></br>
Phone Name: ${param.phoneno}


</body>
</html>