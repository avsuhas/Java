<%@page import ="com.samson.sakilaproject.service.CityService" %>
<%@page import="com.samson.sakilaproject.service.ICityService"%>
<%@page import="java.util.List"%>
<%@page import="com.samson.sakilaproject.bo.CityBo"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>city list</title>
</head>
<body>
<%

ICityService cityService = new CityService();
List<CityBo> list = cityService.findAllCity();


%>
My list of city is <%= list %>
</body>
</html>