<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1><center><font color="RED"> Login </font></center> </h1>

<form name="verification"   action="ver.jsp">
	<br>User Name:&nbsp<input type="text" name="user">
	<br>Password &nbsp:&nbsp&nbsp<input type="password" name="pass">
	
	<br><input type="submit"  value="Login"/>
	<input type="reset" name="Clear"/>
		
	</form>


</body>
</html>