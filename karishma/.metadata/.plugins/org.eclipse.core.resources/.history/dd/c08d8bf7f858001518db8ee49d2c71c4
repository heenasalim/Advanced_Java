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
<s:form action="/struts/login.action" name="Personal Form">
 <s:textfield name="bean.user" label="UserName" ></s:textfield>
 <s:password name="bean.pwd" label="PassWord" ></s:password>
  <s:textfield name="bean.name" label="Name" ></s:textfield>
   <s:datetimepicker name="bean.dob" label="DOB"></s:datetimepicker>
   
   <s:textarea name="bean.address" rows="4" label="Address"></s:textarea>
   <s:doubleselect name="bean.country" label="select the Country" list="{'India','Austrelia','England','Shrilanka'}" doubleName="city" doubleList="top=='India'?{'Pune','Mumbai'}:{'Sydney','Perth'}" cssClass="fieldtext" doubleCssClass="fieldtext"/>
  
 <s:select name="bean.language" label="preffered language" list="{'English','hindi'}"></s:select>
 <s:radio name="bean.mstatus" label="Enter Marital Status"  list="{'Single','Married','Divorcee'}"></s:radio>
<s:checkboxlist name="bean.skills" label="Your Interest" list="{'programming','testing','web designing'}"></s:checkboxlist>
<s:submit value="Click"></s:submit>
</s:form>

</body>
</html>