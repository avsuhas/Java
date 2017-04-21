<html>
<head><title>Confirmation</title></head>

<%
	//read form data
	String favLang = request.getParameter("favoriteLanguage");

	//create the cookie
	Cookie theCookie = new Cookie("myApp.favoriteLanguage",favLang);
	
	//set life span of cookie
	theCookie.setMaxAge(60*60*24*365);
	
	//send cookie to browser
	response.addCookie(theCookie);
	

%>

<body>
	Thanks ! we set your favorite language to: ${param.favoriteLanguage}
	
	<br/>
	<br/>
	<a href = "cookies-homepage.jsp">Return to Homepage. </a>
</body>

</html>