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
		<h1>GeneralInformation</h1>
<s:form action="/struts/login.action" name="General Information">

<s:combobox list="{'Windows','Linux','Unix'}" name="bean.platform" label="Select Platform" readonly="true"></s:combobox>
<s:optiontransferselect doubleList="" list="{'Tomcat','Jboss','GlassFiesher'}" doubleName="Server" addAllToRightOnclick="true" addAllToLeftOnclick="true" addToLeftLabel="true" allowUpDownOnLeft="true"> </s:optiontransferselect>
<s:combobox list="{'c','c++','java','net'}" label="select language" readonly="true" name="lang"></s:combobox>

<s:updownselect list="#{'Servlet':'Servlet','JSP':'JSP'}" name="Tech" headerValue="----Select---" label="Select Technology"></s:updownselect>
<s:file name="file" label="Upload Resume"> </s:file>

<s:submit value="Click"></s:submit>
</s:form>
</body>
</html>