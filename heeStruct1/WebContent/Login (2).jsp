<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix='s'  uri="/struts-tags" %>

<s:form  action="/struts/login.action" >
<s:textfield   name="user"  label="enter  the  username"></s:textfield>
<s:password  name="pass" label="enter  the  password"></s:password>
<s:checkbox name="vehicle" label="Enter  the  vehicles"  value="Bike"></s:checkbox>
<s:radio list="{'married','unmarried'}" name="mstatus"  label="mariatal  status  is"></s:radio>
<s:select list="{'c','c++','c#'}"      name="tech"     label="enter  the  technology">
<s:optgroup list="#{'core':'core','wcd':'wcd','jsp':'jsp'}" id="java"  label="java:"></s:optgroup></s:select>
<s:checkboxlist list="{'bike','car','bus'}"  name="mode"  label="enter  transportation"></s:checkboxlist>
<s:combobox list="{'java','.net','bckend'}"  name="technology"  label="enter  the  technology"></s:combobox>
<s:updownselect list="{'english','hindi,'marathi','french'}" name="lang"  label="enter  the  lang"  allowMoveUp="true"  allowMoveDown="true"></s:updownselect>
<s:submit value="login"></s:submit>
</s:form>
</body> 
</html> 