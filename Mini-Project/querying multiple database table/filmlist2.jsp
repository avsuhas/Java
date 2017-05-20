
<%@ page import="com.samson.sakilaproject.service.FilmActorService2" %>
<%@ page import="com.samson.sakilaproject.bo.FilmActorBo2" %>
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
FilmActorService2 service = new FilmActorService2();
List<FilmActorBo2> list = new ArrayList<FilmActorBo2>();
list = service.findAll();

%>

<table >
	<tr>
    <th> Film Id</th>
    <th>Actor ID</th>
    
  </tr>
<%
for(FilmActorBo2 bo : list){%>

	<tr>
<%-- 	<td><%= bo.getFilmId() %></td> --%>
<%-- 	<td><%= bo.getActorId()%></td>  --%>
	<td><%= bo.getTitle() %></td>
	<td><%= bo.getFilmList()%></td> 
<%--	<td><%= bo.getLastName() %></td> --%>
	</tr>
<% } %>

</table>

</body>
</html>
