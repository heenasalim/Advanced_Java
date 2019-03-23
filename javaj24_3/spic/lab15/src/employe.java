
public class employe {
 int empid;
 
 public employe() {
	super();
	// TODO Auto-generated constructor stub
}
 
public employe(int empid, String empname, int sal) {
	super();
	this.empid = empid;
	this.empname = empname;
	Sal = sal;
}

@Override
public String toString() {
	return "employe [empid=" + empid + ", empname=" + empname + ", Sal=" + Sal
			+ "]";
}
String  empname;
 int  Sal;
 public  void  print()
 {
	 System.out.println("employee  class\n ");
 }
}
