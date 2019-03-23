<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="mystyle.css" type="text/css" />
<s:head theme="simple" />
<title>Struts UI TAgs</title>
<s:head theme="simple" />
</head>
<body>
<h2 align="center">General Information</h2>
<table align="center" width="600">
<tr>
<td bgcolor="#fbefd9" align="center">
<s:actionerror/>

<s:form action="generalAction" method ="post" cssStyle="color:#7a3d3d">

<s:combobox name="platform" 
	label="Select Platform" 
	list="{'Windows', 'Linux', 'Unix'}" 
	headerKey="-1" 
	headerValue="---Select Platform---"/>

<s:optiontransferselect 
	name="serverslist"
	label="Select Servers" 
	list="{'Tomcat 5.5','WebLogic 8.1', 'JBoss 5.0', 'JRunner','Sun Server'}" 
	size="5"
	doubleName="servers" 
	doubleList="{}"
	doubleSize="5" 
	leftTitle="List of Servers"
	rightTitle="Your Servers"
	allowUpDownOnLeft="false"
	allowUpDownOnRight="false"
	allowSelectAll="false"
	allowAddAllToLeft="false"
	allowAddAllToRight="false"
	addToRightLabel="'>>'"
	addToLeftLabel="'<<'"/>
<s:select 
	label="Select Language" 
	name="language" 
	list="%{#{'C':'C', 'C++':'C++'}}">
	<s:optgroup 
		label="Java" 
		list="#{'Core Java':'Core Java','Groovy':'Groovy'}" />
	<s:optgroup 
		label=".Net" 
		list="#{'VB':'VB','ASP':'ASP','C#':'C#'}" />
</s:select>

<s:updownselect 
	label="Select Technologies and put them in order(Most comfortable with on the top)" 	
	labelposition="top"
	list="#{'Servlet':'Servlet', 'JSP':'JSP', 'Struts':'Struts', 'EJB':'EJB'}" 
	name="technology" 
	headerKey="-1" 
	headerValue="----Select----"
	moveDownLabel="Down"
	moveUpLabel="Up"
	selectAllLabel="All"/>
		
<s:file name="file" label="Upload Resume" size="30"/>
<s:submit value="Submit"/>                                 
</s:form>
<s:a href="index.jsp">Back</s:a>
</td>
</tr>
</table>
</body>
</html>