<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib  prefix='a' uri="/struts-tags"%>
<a:form  action="/struts/Login1.action" >
<a:textfield  name="user"   label="enter  the  username"></a:textfield>
<a:password   name="pass"  label="  enter  the  password"></a:password>
<a:submit value="Login"></a:submit>
</a:form>
</body>
</html>