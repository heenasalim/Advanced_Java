<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglibprefix="s"uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Login Page <br><br>
<s:actionerror/>
<s:form action="Login">


<s:textfield name="user.username" label="Enter ur name"/>
<s:password name="user.password" label="Enter ur password"/>
<s:submit value="Click"/>
</s:form>
</body>
</html>