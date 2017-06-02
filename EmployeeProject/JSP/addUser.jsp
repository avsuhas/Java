<%@ page import="com.samson.dao.DepartmentsDao" %>
<%@ page import="com.samson.dbo.DepartmentsDbo" %>
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

 <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
    
    <!-- Load jQuery JS -->
    <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
    <!-- Load jQuery UI Main JS  -->
    <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
    
    <!-- Load SCRIPT.JS which will create datepicker for input field  -->
    <script >
    $(document).ready(
  
  /* This is the function that will get executed after the DOM is fully loaded */
  function () {
    $( "#datepicker1" ).datepicker({
      changeMonth: true,//this option for allowing user to select month
      changeYear: true //this option for allowing user to select from year range
    });
  }

);

    $(document).ready(
    		  
    		  /* This is the function that will get executed after the DOM is fully loaded */
    		  function () {
    		    $( "#datepicker2" ).datepicker({
    		      changeMonth: true,//this option for allowing user to select month
    		      changeYear: true //this option for allowing user to select from year range
    		    });
    		  }

    		);
    
    $(document).ready(
    		  
    		  /* This is the function that will get executed after the DOM is fully loaded */
    		  function () {
    		    $( "#datepicker3" ).datepicker({
    		      changeMonth: true,//this option for allowing user to select month
    		      changeYear: true //this option for allowing user to select from year range
    		    });
    		  }

    		);
    
    </script>
	  <link rel="stylesheet" href="runnable.css" />

<body>

<%
List <DepartmentsDbo> deptList = new ArrayList<DepartmentsDbo>();
DepartmentsDao  deptDao = new DepartmentsDao();
 deptList = deptDao.findAll();



%>
<h3> Add Employee Details </h3>
<form name="myForm" action="addUserData.jsp" method="post" >

<table width="450px" >
	
	<tr>
 	<td valign="top">
  	<label for="firstName">First Name *</label>
 	</td>
 	<td valign="top">
 	<input type="text" name="firstName"  maxlength="20" size="30" required> 
 	<br>	
 	</td>
	</tr>

	<tr>
 	<td valign="top">
  	<label for="lastName">Last Name *</label>
 	</td>
  
 	<td valign="top">
 	<input  type="text" name="lastName" maxlength="20" size="30" required>

 	</td>
	</tr>




	<tr>
 	<td valign="top">
  	<label for="Sex">Gender *</label>
 	</td>
 	<td valign="top">
 	<input type="radio" name="Sex" value="M" required>Male 
	<input type="radio" name="Sex" value="F">Female 
	</tr>


	<tr>
 	<td valign="top">
  	<label for="birthDate">Birth Date *</label>
 	</td>
 	<td valign="top">

	 <input type="text" name="datepicker1" id="datepicker1" />
	
  	<!-- <script  type="text/javascript" 
	 src="http://www.snaphost.com/jquery/Calendar.aspx"></script>  
	 -->
 	</td>
	</tr>
	

	<tr>
 	<td valign="top">
  	<label for="hireDate">Hire Date *</label>
 	</td>
 	<td valign="top">
 	
 	<input type="text" name="datepicker2" id="datepicker2" />
 	<!-- <script type="text/javascript">
	$(function () {
	$("#SnapHost_Calendar2")
	.datepicker({ showOn: 'both', buttonImage: 'http://www.snaphost.com/jquery/calendar.gif',
	buttonImageOnly: true, changeMonth: true, showOtherMonths: true, selectOtherMonths: true
	});});</script>
	<input name="SnapHost_Calendar2" id="SnapHost_Calendar2" type="text" /> 
 --> 	</td>
	</tr>


	<%for(DepartmentsDbo dbo : deptList){ %>
		
	
	<% }%>
	<tr>
 	<td valign="top">
  	<label for="department">Department *</label>
 	</td>
 	<td valign="top">
 	<select id="departmentId" name="department">
 	 <option value="0"> --Select Dept-- </option>
 	<%for(DepartmentsDbo dbo : deptList){ %>
		 <option value="<%=dbo.getDeptNumber() %>"> <%=dbo.getDeptName() %> </option>
	
	<% }%>
 	
        </select>
 	</td>
	</tr>

	<tr>
 	<td valign="top">
  	<label for="startDate">Start Date *</label>
 	</td>
 	<td valign="top">
 	
 	<input type="text" name="datepicker3" id="datepicker3" />
 	<!-- <script type="text/javascript">
	$(function () {
	$("#SnapHost_Calendar3")
	.datepicker({ showOn: 'both', buttonImage: 'http://www.snaphost.com/jquery/calendar.gif',
	buttonImageOnly: true, changeMonth: true, showOtherMonths: true, selectOtherMonths: true
	});});</script>
	<input name="SnapHost_Calendar3" id="SnapHost_Calendar3" type="text" /> 
  -->	</td>
	</tr>
	
	<tr>
 	<td valign="top">	
 	</td>
 	<td valign="top">

  	<input type="submit" value = "Submit" class="sbmtBtn" />
 	</td>
	</tr>

 
 	</table>
 			

</form>


</body>
</html>