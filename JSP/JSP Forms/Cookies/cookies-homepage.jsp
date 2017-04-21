<html>
<body>
<h3> Training Portal</h3>

<% 
	//default.. if there is no cookies
	String favLang = "java";
	
	//get the cookies from the browser request
	Cookie[] theCookies =request.getCookies();
	
	//find our fav lang cookies
	if (theCookies != null){
		for(Cookie tempCookie : theCookies){
			
			if("myApp.favoriteLanguage".equals(tempCookie.getName())){
				favLang =tempCookie.getValue();
				break;
			}
		}
	}

%>
<!-- now show a personalized page.. use the favLang variable -->

<!-- show new books for this lang -->
<h4> New books for <%= favLang %></h4>
<ul>
	<li>blah blah blah</li>
	<li>blah blah blah</li>

</ul>

<h4> Latest News Report for <%= favLang %></h4>
<ul>
	<li>blah blah blah</li>
	<li>blah blah blah</li>

</ul>

<h4> Hot jobs for <%= favLang %></h4>
<ul>
	<li>blah blah blah</li>
	<li>blah blah blah</li>

</ul>

<hr>
<a href="cookie-personalize-form.html">Personalize this page </a>


</body>
</html>