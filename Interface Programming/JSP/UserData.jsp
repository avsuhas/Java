<%@page import="com.samson.sakilaproject.service.UserService"%>
<%@page import="com.samson.sakilaproject.service.IUserService"%>
<%@ page import="com.samson.sakilaproject.bo.UserBo"%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display Form</title>
</head>
<body>


	<%
		String FirstName = request.getParameter("firstName");
		String LastName = request.getParameter("lastName");
		String id = request.getParameter("id");
	//	int id = Integer.parseInt(request.getParameter("id"));
		UserBo bo = new UserBo();
		bo.setId(id);
	//	bo.setId(new Integer(id).toString());
		bo.setFirstName(FirstName);
		bo.setLastName(LastName);
		UserService userService = new UserService();
		int i = userService.insertUser(bo);
		
		
		if (i == 1) {
	%>

	Data Inserted Successfully for First Name: ${param.firstName}
	<br> Last Name: ${param.lastName}
	<br> ID: ${param.id}

	<%
		} else {
			

		}
	%>

</body>
</html>