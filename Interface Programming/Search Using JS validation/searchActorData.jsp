<%@page import="com.samson.sakilaproject.service.ActorService"%>
<%@page import="java.util.List" %>
<%@page import="com.samson.sakilaproject.bo.ActorBo"%>

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

 String firstMatch = (null != request.getParameter("firstName")) ? 
		             request.getParameter("firstName") : "";   
		             
		             ActorService as = new ActorService();
		             
		        List<ActorBo> listFirst = as.findActorsBySearchString(firstMatch);
        
%>

<%
 String lastMatch = (null != request.getParameter("lastName")) ? 
		             request.getParameter("lastName") : "";   
		             
		             ActorService ls = new ActorService();
		             
		        List<ActorBo> listLast = ls.findActorsByLast(lastMatch);
		        
 
%>
<%
	if (firstMatch == "")
	{%>
		<%=listLast %>
	<% }
	else if (lastMatch == "")
	{%>
		<%=listFirst %>
	<%}

	else if(firstMatch =="" || lastMatch ==""){%>
			<%=listFirst %>
			<%=listLast %>
	<%} 

	 else if(firstMatch =="" && lastMatch ==""){ %>
			<%=listFirst %>
			<%=listLast %>
			<%} %>

</body>
</html>