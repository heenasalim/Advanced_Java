<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login-Validation-Framework</title>
</head>
<body>
<s:head theme="simple"/>
<s:form action="/struts/Login.action" >
<s:textfield name="user.username" label="Enter User Name"/>
<s:password name="user.password" label="Enter Password"/>
<s:password name="user.cpass" label="Enter Confirm Password"/>
<s:textfield name="user.mail" label="Enter ur MailID"></s:textfield>
<s:datetimepicker name="user.dob" label="Enter DOB"></s:datetimepicker>
<s:submit value="Click"/>
</s:form>
</body>
</html>
