<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>employee registration form</h1>
<s:form action="employee.action" method="post" name="employeeform">
<s:textfield name="empid" label="employee id" size="15"></s:textfield>
<s:textField name="password" label="password" size="15"></s:textField>
<s:textField name="password1" label=" confirm password" size="15"></s:textField>
<s:textField name="name" label="name" size="15"></s:textField>
<s:datetimepicker name="dof" label=" date of joining" size="15"></s:datetimepicker>
<s:textfield name="age" label="age" size="15" ></s:textfield>
<s:textfield name="age" label="age" size="15" ></s:textfield>
<s:submit value="register"/>
</s:form>
</body>
</html>