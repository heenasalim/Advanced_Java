package ch5;

public class MarketEx extends Employee
{
     int km;
     float ta;
     float tla;
     
     MarketEx()
     {
    	 km=100;
    	 ta=5*km;
    	 tla=1500;
     }

	public MarketEx(int id, int bsc, String name) 
	{
		super(id, bsc, name);
		this.km=km;
		this.ta=ta;
		this.tla=tla;
	}

	@Override
	public String toString() 
	{
		return "MarketEx [km=" + km + ", ta=" + ta + ", tla=" + tla + "]";
	}
	
	public void display()
	{
		System.out.println("Km ="+km);
		System.out.println("ta="+ta);
		System.out.println("tla="+tla);
	}
	
	public static void main(String[] args)
	{
		MarketEx me=new MarketEx();
	    me.display();
	    Manager m=new Manager();
	    m.display();
	    Employee m1=new Employee();
	    m1.display();
		
		
	}
     
}