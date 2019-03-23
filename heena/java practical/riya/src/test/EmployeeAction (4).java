package test;

import java.awt.event.ActionEvent;
import java.util.Date;

public class EmployeeAction extends ActionEvent {
	private String empid,password,password1,name,email;
	Date dob;
	int age;
public EmployeeAction(Object source, int id, String command) {
		super(source, id, command);
		// TODO Auto-generated constructor stub
	}
public String getEmpid() {
	return empid;
}
public void setEmpid(String empid) {
	this.empid = empid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPassword1() {
	return password1;
}
public void setPassword1(String password1) {
	this.password1 = password1;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
