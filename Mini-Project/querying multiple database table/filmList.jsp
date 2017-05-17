<%@ page import="com.samson.sakilaproject.service.IFilmActorService" %>
<%@ page import="com.samson.sakilaproject.service.FilmActorService" %>
<%@ page import="com.samson.sakilaproject.bo.FilmActorBo" %>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

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
IFilmActorService filmActorService = new FilmActorService();
List<FilmActorBo> list = new ArrayList<FilmActorBo>();
list = filmActorService.findAll();

%>
<table >
	<tr>
    <th> Film Id</th>
    <th>Actor ID</th>
    <th>Title</th>
    <th>First Name</th>
    <th>Last Name</th>
  </tr>
<%
for(FilmActorBo bo : list){%>

	<tr>
	<td><%= bo.getFilmId() %></td>
	<td><%= bo.getActorId()%></td> 
	<td><%= bo.getTitle() %></td>
	<td><%= bo.getFirstName() %></td>
	<td><%= bo.getLastName() %></td>
	</tr>
<% } %>

</table>

</body>
</html>