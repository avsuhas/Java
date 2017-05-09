<%@ page import="com.samson.sakilaproject.service.IFilmService" %>
<%@ page import="com.samson.sakilaproject.service.FilmService" %>
<%@ page import="com.samson.sakilaproject.bo.FilmBo" %>
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
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}
td, th {
    border: 2px solid #dddddd;
    text-align: left;
    padding: 8px;
}
tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
<body>

<% 
List<FilmBo> list = new ArrayList<FilmBo>();
IFilmService service = new FilmService();
 list = service.findALL();

%>
<table style="border: 2px solid";>
<th>Film ID</th>
<th>Title</th>
<th>description</th>
<% 
for(FilmBo bo : list){%>

<tr>
<td><%=bo.getFilmId() %></td>
<td><%=bo.getTitle() %></td>
<td><%=bo.getDescription() %></td>
<%} %>

</tr>
</table>

</body>
</html>
