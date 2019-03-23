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
<h1>Welcome To Personal Info Page</h1>
<table>

<tr>
<td>User is<s:property value="bean.user"></s:property></td>
</tr>
<tr>
<td>Password is<s:property value="bean.pwd"></s:property></td>
</tr>

<tr>
<td>Name is<s:property value="bean.name"></s:property></td>
</tr>


<tr>
<td>Address is<s:property value="bean.address"></s:property></td>
</tr>

<tr>
<td>Country is<s:property value="bean.country"></s:property></td>
</tr>

<tr>
<td>Language is<s:property value="bean.language"></s:property></td>
</tr>

<tr>
<td>status is<s:property value="bean.mstatus"></s:property></td>
</tr>

<tr>
<td>Skills are <s:property value="bean.skills"></s:property></td>
</tr>
</table>
</body>
</html>