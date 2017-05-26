<%@ page import="com.samson.bo.DepartmentsBo" %>
<%@ page import="com.samson.service.IDepartmentsService" %>
<%@ page import="com.samson.service.DepartmentsService" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Displaying Departments</title>
</head>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
<body>
<%@include file="header.jsp" %>
<%
List<DepartmentsBo> list = new ArrayList<DepartmentsBo>();
IDepartmentsService service = new DepartmentsService();
list = service.findAll();
%>
<table style="border: 1px solid;">
	<tr>
		<th>Dept No</th>
		<th>Dept name</th>
	</tr>
<%for(DepartmentsBo bo :list){ %>
	<tr>
	<td><%=bo.getDeptNo() %></td>
	<td><%=bo.getDeptName() %></td>
	</tr>
<%} %>
</table>
</body>
</html>



