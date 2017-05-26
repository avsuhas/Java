<%@ page import="com.samson.bo.UserBo" %>
<%@ page import="com.samson.service.IUserService" %>
<%@ page import="com.samson.service.UserService" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Displaying User Details</title>
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
IUserService service = new UserService();
List<UserBo> list = new ArrayList<UserBo>();
list=service.findAll();
%>

<table style="border:1px">
<tr>
	<th>User Name</th>
	<th>Password</th>
	<th>User Id</th>
</tr>

<% for(UserBo bo :list) {%>
	<tr>
	<td><%=bo.getUserName() %></td>
	<td><%=bo.getPassword() %></td>
	<td><%=bo.getUserId() %></td>
	</tr>

<%} %>
</table>

</body>
</html>





