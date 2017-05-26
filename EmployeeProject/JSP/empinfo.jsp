<%@ page import="com.samson.service.ServiceEmployees" %>
<%@ page import="com.samson.bo.EmployeeInfoBo" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<%

String emplId = request.getParameter("empId");
out.println("Employee ID is " + emplId);

ServiceEmployees service = new ServiceEmployees();
EmployeeInfoBo data = service.findEmpInfo(Integer.parseInt(emplId));

%>

<%= data %>
</body>
</html>