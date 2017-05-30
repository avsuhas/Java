<%@ page import="com.samson.bo.UserBo" %>
<%@ page import="com.samson.service.UserService" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registered User Page</title>
</head>
<body>



<%

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		int userId = Integer.parseInt(request.getParameter("userId"));
	//	int id = Integer.parseInt(request.getParameter("id"));
		UserBo bo = new UserBo();
		 bo.setUserName(userName);
	//	bo.setId(new Integer(id).toString());
		bo.setPassword(password);
		bo.setUserId(userId);
		UserService userService = new UserService();
		int i = userService.insertUser(bo);
		
		
		if (i == 1) {  
	%> 

	 <h3>User Registered Successfully !!</h3>
	<br> User Name: ${param.userName}
	<br> pass word: ${param.password}	
	<br> ID: ${param.userId}

	<%
	 	} else { %>
			
			 <h3>oops!! Try Again</h3> 

	<%  	} 
	%>

	

</body>
</html>