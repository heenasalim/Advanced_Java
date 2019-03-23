package pk2;

public class Employee {
	int eid;
	String name;
	public double basicSal;
	/**
	 * @param eid
	 * @param name
	 * @param basicSal
	 * 
	 */
	public Employee()
	{
		eid=20;
		name="kkk";
		basicSal=40000;
	}
	public Employee(int eid, String name, double basicSal) {
		
		this.eid = eid;
		this.name = name;
		this.basicSal = basicSal;
	}
	
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", basicSal="
				+ basicSal + "]";
	}
	public void show()
	{
		System.out.println("EID= "+eid);
		System.out.println("name= "+name);
		System.out.println("basic Salary= "+basicSal);
	}
	

}
