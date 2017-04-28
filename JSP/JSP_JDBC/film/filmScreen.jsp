<%@page import="com.samson.FilmBO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page import="com.samson.FilmService" %>
<%@page import="java.util.Arrays"%>
<%@ page isELIgnored="false" %> 

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Film Screen</title>
</head>
<body>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}
th{
	color : dddddd;
	border: 2px solid #A18036;
    text-align: left;
    padding: 8px
}

td {
    border: 2px solid #A18036;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #ECF1B1;
}
tr:nth-child(odd) {
    background-color: #AAF065;
}
</style>


<table style="border: 1px solid;">
	<tr>

	<th bgcolor="3F749E">Film-ID</th>
    <th bgcolor="3F749E">Title</th>
    <th bgcolor="3F749E">Description</th>

  </tr>
<%
List<FilmBO> fm = new ArrayList<FilmBO>();
FilmService fs = new FilmService();
fm = fs.getFilm();
%>
  

   <%
     for (FilmBO bo : fm){ %>
    	 
    	<tr>
    	 <td><%=bo.getFilm_id() %></td> 
    	 <td><%=bo.getTitle() %></td>
    	 <td><%=bo.getDescription() %></td>
    	 </tr>
    	 <% 	 
    		 }   %>

</table>

</body>
</html> 