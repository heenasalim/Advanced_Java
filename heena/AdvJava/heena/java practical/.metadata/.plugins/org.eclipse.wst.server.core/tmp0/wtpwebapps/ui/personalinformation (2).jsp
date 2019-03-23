<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="mystyle.css" type="text/css" />
<title>Struts UI TAgs</title>
<s:head theme="simple" />
</head>
<body>
<h2 align="Center">Enter Personal Information</h2>
<table align="center" width="600">
<tr>
<s:form action="personalAction.action" method="post" name="personalForm" >
	<s:textfield name="username" label="User Name" size="15" cssClass="fieldtext" />
	<s:password name="password" label="Password" size="15" cssClass="fieldtext"/>
	<s:textfield name="fullname" label="Name" size="25" cssClass="fieldtext"/>
	<s:datetimepicker name="dob" label="Date Of Birth" />
	<s:textarea name="address" label="Address" rows="4" cols="20" cssClass="fieldtext"/>
	<s:doubleselect name="country" 
	label="Select Country and City" 	
	list="{'Australia','India'}" 
	doubleName="city" 
	doubleList="top == 'Australia'? {'Sydney', 'Melbourne','Brisbane','Perth'} : {'Delhi', 'Mumbai','Chennai','Kolkata'}" 
	cssClass="fieldtext" doubleCssClass="fieldtext"/>  
	<s:select name="language" label="Preferred Language(s)" list="{'English', 'Hindi', 'French','German'}" cssClass="fieldtext"/>
	<s:radio name="mstatus" label="Marital Status" list="{'Single', 'Married', 'Divorcee'}" value="Single"  />
    <s:checkboxlist name="skill" label="Your Interest" list="{'Programming', 'Testing', 'Research','Web Designing'}"/>
    <s:submit value="Submit" align="center"/>
</s:form>
</tr>
</table>
</body>
</html>