package pk1;
import java.util.Date;
public class Employee {
	int id;
	String name;
	double basic;
	//double gs,pf,pt;
	JoinDate d1;
	int age;

	public Employee(int id,String name,double basic,JoinDate d) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.basic=basic;
		d1=d;
	}
	public void calAge()
	{
		Date d2=new Date();
		int currentYr=d2.getYear();
		currentYr=2000+(currentYr-100);
		System.out.println("Current year="+currentYr);
		int age=currentYr-d1.yy;
		System.out.println("Age="+age);
	}
public String toString()
{
	return "\nempid="+id+"\nname="+name+"\nbasic="+basic+"\nDOB="+d1;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e=new Employee(1,"abc",30000,new JoinDate(1,1,2001));
		System.out.println(""+e);
		e.calAge();
	
	}

}
