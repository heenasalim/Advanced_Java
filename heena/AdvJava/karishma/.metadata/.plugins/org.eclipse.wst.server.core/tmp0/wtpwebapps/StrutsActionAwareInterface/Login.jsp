<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:form action="/struts/login.action" name="Personal Form" method="Login">
 <s:textfield name="bean.user" label="UserName" ></s:textfield>
 <s:password name="bean.pwd" label="PassWord" ></s:password>
 <s:reset value="Reset"></s:reset>
<s:submit value="Click"></s:submit>
</s:form>

</body>
</html>