<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags"  prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bean Tag Example</title>
</head>
<body>
<s:bean name="com.CurrencyConverter" >
	<s:param name="dollars" value="100"></s:param>
	100 Dollars = <s:property value="rupees" /> Rupees 
	
</s:bean>


</body>
</html>