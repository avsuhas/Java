<%@page import="com.samson.sakilaproject.dao.ActorDao" %>
<%@page import="com.samson.sakilaproject.dbo.ActorDbo" %>
<%@page import="com.samson.sakilaproject.service.ActorService"%>
<%@page import="com.samson.sakilaproject.service.IActorService"%>
<%@page import="java.util.List"%>
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
String spageid=request.getParameter("page");  
int pageid=Integer.parseInt(spageid);  
int total=10;  
if(pageid==1){}  
else{  
    pageid=pageid-1;  
    pageid=pageid*total+1;  
}  
ActorDao actorDao = new ActorDao();
List<ActorDbo> list = actorDao.getRecords(pageid, total);

out.print("<h1>Page No: "+spageid+"</h1>");  
out.print("<table border='1' cellpadding='4' width='60%'>");  
out.print("<tr><th>Id</th><th>FName</th><th>LName</th>");  
for(ActorDbo e:list){  
    out.print("<tr><td>"+e.getActorId()+"</td><td>"+e.getFirstName()+"</td>  <td>"+e.getLastName()+"</td></tr>");  
}  
out.print("</table>");  
%>  

<a href="view.jsp?page=1">1</a>  
<a href="view.jsp?page=2">2</a>  
<a href="view.jsp?page=3">3</a>  
<a href="view.jsp?page=4">4</a>


</body>
</html>
