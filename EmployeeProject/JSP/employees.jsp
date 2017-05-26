<%@ page import="com.samson.service.IServiceEmployees" %>
<%@ page import="com.samson.service.ServiceEmployees" %>
<%@ page import="com.samson.bo.EmployeesBo" %>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Showing Employees Info</title>
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


<script type="text/javascript">
function poponload( emplId)
{
testwindow = window.open("empinfo.jsp?empId="+emplId, "mywindow", "location=1,status=1,scrollbars=1,width=300,height=200");
testwindow.moveTo(0, 0);
}
</script>


<body>
<%@include file="header.jsp" %>
<%
List<EmployeesBo> employeesList = new ArrayList<EmployeesBo>();
IServiceEmployees service = new ServiceEmployees();
employeesList = service.findAll();
%>




<table style="border: 1px solid;">
<tr>
<th>Emp_No.</th>
<th>Birth Date</th>
<th>First Name</th>
<th>Last Name</th>
<th>Gender</th>
<th>Hire Date</th>
</tr>

<% 
for(EmployeesBo bo: employeesList){%>
	<tr>
		
		<td><a  href="javascript: poponload(<%=bo.getEmpNo() %>);" >
		 <%=bo.getEmpNo()  %></a> </td>
		<td><%=bo.getBirthDate()  %></td>
		<td><%=bo.getFirstName() %></td>
		<td><%=bo.getLastName() %></td>
		<td><%=bo.getGender()  %></td>
		<td><%=bo.getHireDate() %></td>
	</tr>
		<%} %>
		
</table>
		
		
</body>
</html>