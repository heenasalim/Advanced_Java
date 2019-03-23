<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Name Collector</title>
</head>
<body>

<h4> Enter Your Name</h4>
<s:form  action="/struts/converter.action">
<s:submit value="OK"></s:submit>
</s:form>
</body>
</html>