/**
 * 
 */
package pk2;

/**
 * @author javaj24_2
 *
 */
public class Manager extends Employee{
	double pt,pf,gs,ns,medical,hra;
	Manager()
	{
		super(1,"abc",20000);
		pt=200;
		pf=5000;
		medical=500;
		hra=500;
	}
	public double calGs()
	{
		return basicSal+hra+medical;
	}
	public double calNs()
	{
		return calGs()-(pt+pf);
	}
	
	public double petrolAll()
	{
		
		return(8*basicSal)/100;
	}

	public double foodAll()
	{
		
		return (13*basicSal)/100;
	}
	public double otherAll()
	{
		
		return (8*basicSal)/100;
	}
	//@override
	public String toString()
	{
		return "\nempid="+eid+"\nname="+name+"\nbasic="+basicSal+"\npetrolAll= "+petrolAll()+"\nFoodAllowance="+foodAll()+"\nOtherAll="+otherAll()+"\nGS= "+calGs()+"\nNS= "+calNs();
	}
	public void show()
	{
		System.out.println("EID= "+eid);
		System.out.println("name= "+name);
		System.out.println("basic Salary= "+basicSal);
		System.out.println("GS= "+calGs());
		System.out.println("NS= "+calNs());
		//System.out.println("basic Salary= "+basicSal);
	}

	public static void main(String[] args) {
		//Employee e=new Employee(1,"abc",20000);
		Manager m=new Manager();
		System.out.println(m);
		// TODO Auto-generated method stub

	}

}
