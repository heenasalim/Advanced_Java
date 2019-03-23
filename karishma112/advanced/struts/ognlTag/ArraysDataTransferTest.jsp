<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="#FFFCC">
<s:form action="/struts/ArraysDataTransferTest.action">
<b>Accept information in Array collection :::
<table>
<tr><td>name</td><td>age</td></tr>
<tr><td><s:textfield name="names[0]" label="1st Person Name"/></td>
    <td><s:textfield name="ages" label="1st Person Age:" /></td>
</tr>
<tr><td><s:textfield name="names[1]" label="2nd Person Name"/></td>
    <td><s:textfield name="ages" label="2nd Person Age:"/></td>
</tr>
<tr><td><s:textfield name="names[2]" label="3rd Person Name"/></td>
    <td><s:textfield name="ages" label="3rd Person Age:"/>></td>
</tr>
</table>
<s:submit value="OK"/>
</s:form>
</body>
</html>