<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Object-Backed-Login</title>
</head>
<body>
<s:form action="/struts/Login.action" >
<s:textfield name="user.username" label="Enter User Name"/>
<s:password name="user.password" label="Enter Password"/>
<s:submit value="OK"/>
</s:form>
</body>
</html>

<!-- Here name of textfield for username should be user.username -->
<!-- Here name of textfield for password should be user.password -->