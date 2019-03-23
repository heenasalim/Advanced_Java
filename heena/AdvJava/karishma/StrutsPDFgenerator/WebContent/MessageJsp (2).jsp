<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

pageEncoding="ISO-8859-1"%>

<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC 

"-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html><head><title>Generate_PDF_in_Struts</title></head>

<body><h1>Generate_PDF_in_Struts</h1><hr>

<s:form action="generatepdf.action">        

<s:textarea name="message" label="Write Message In PDF :"></s:textarea>

<s:submit></s:submit> </s:form>

</body>

</html> 
