package ch7;

import java.lang.annotation.Annotation;

public class Employee {
  @Reflectondemo(msg="city  name  is   and  zip")
	int empid;
   String  empname;
   double  sal;
 
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + ", sal=" + sal
			+ "]";
}
@Reflectondemo(msg="parameters  of  constructor  is ")
public Employee(int empid, String empname, double sal) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.sal = sal;
}  
public   static   void  main(String  args[])
{  
	Employee  e1= new  Employee(1,"heena ",267828);  //annotation  using  Reflection 
	Annotation a[]=(e1).getAnnotations();
		for(int i=0;i<a.length;i++)
			{
		System.out.println("annotation  is");
			}
}
 
   
}
