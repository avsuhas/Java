<html>

<head><title> Student Confirmation Title </title></head>
<body>

	The Student is Confirmed: 
	<%=request.getParameter("firstName") %>
	<%=request.getParameter("lastName") %>

	<br/><br/>
	Favorite Programming Language:<br/>
	<ul>
		<%
			String[] langs = request.getParameterValues("favoriteLanguage");
		
			for(String tempLang : langs){
				out.println("<li>" + tempLang + "</li>");
				
			}
		
		%>
	</ul>
	

<%--  Short Way of declaration --%>
<%-- 	The Student is Confirmed: ${param.firstName} ${param.lastName} --%>

</body>

</html>