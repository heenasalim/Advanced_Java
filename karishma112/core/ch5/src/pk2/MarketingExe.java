package pk2;

public class MarketingExe extends Employee{
    double km;
    double ta,tel;
	MarketingExe(double km,double tel)
	{
		super(2,"xyz",10000);
		this.km=km;
		ta=5*100/km;
		this.tel=tel;
		
	}
	public String toString()
	{
		return "\nempid="+eid+"\nname="+name+"\nbasic="+basicSal+"\nkm= "+km+"\nta="+ta+"\ntel="+tel;
	}
	/**
	 * @param args
	 */
	public void show()
	{
		System.out.println("EID= "+eid);
		System.out.println("name= "+name);
		System.out.println("basic Salary= "+basicSal);
		System.out.println("km= "+km);
		System.out.println("tel= "+tel);
		//System.out.println("basic Salary= "+basicSal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarketingExe me=new MarketingExe(10,2000);
		System.out.println(me);
		

	}

}
