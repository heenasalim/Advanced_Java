<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Validator</title>
</head>
<body>
<%@taglib prefix="strut" uri="/struts-tags" %>

<h1 align="left">Using Field Validators</h1>
<strut:head theme="simple"/>

<strut:form action="struts/Employee.action" name="employee">

<strut:textfield name="empid" label="Employee ID:" size="20"></strut:textfield>

<strut:password name="password" label="Password:" size="20"></strut:password>

<strut:password name="conf_pass" label="Re-Enter Password:" size="20"></strut:password>

<strut:textfield name="empname" label="Employee Name:" size="20"></strut:textfield>

<strut:datetimepicker name="doj" label="Date of Joining"></strut:datetimepicker>

<strut:textfield name="age" label="Age" size="20"></strut:textfield>

<strut:textfield name="city" label="City" size="20"></strut:textfield>

<strut:textfield name="email" label="Email" size="20"></strut:textfield>

<strut:submit name="submit" value="Add Employee"></strut:submit>

</strut:form>

<strut:a href="Register.html" >|Home|</strut:a>
</body>
</html>