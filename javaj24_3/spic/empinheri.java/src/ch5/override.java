package ch5;

public class baseemp1 {
	
 int  empid;
 String empname;
  int  Sal;
  
  public baseemp(int empid, String empname, int sal) 
  {
	super();
	this.empid = empid;
	this.empname = empname;
	Sal = sal;
}

baseemp()
  {
	  empid=1001;
	  empname="heena";
	  Sal=2000;
	  
  }

@Override
public String toString() {
	return "baseemp [empid=" + empid + ", empname=" + empname + ", Sal=" + Sal
			+ "]";
}
  

public  class Manager  extends baseemp
{
public Manager(int empid, String empname, int sal, int pea, int fa, int oa) {
		super(empid, empname, sal);
		this.pea = pea;
		this.fa = fa;
		this.oa = oa;
	}

int pea;
int fa;
int oa;

@Override
public String toString() {
	return "Manager [pea=" + pea + ", fa=" + fa + ", oa=" + oa + "]";
}

pea=(o.o8*Sal);
fa=(0.013*Sal);
oa=(0.03*Sal);

//System.out.println("total  petrol  allowance  is"+pea +"food  allowance"+fa+"other allowance"+oa);

}

public    class  marketExecutive  extends baseemp
{
	public marketExecutive(int empid, String empname, int sal, int km, int ta,
			int telep) {
		super(empid, empname, sal);
		this.km = km;
		this.ta = ta;
		this.telep = telep;
	}

	int  km;
	int ta=5;
	int telep=1500;
	
	
	public int  getKem()
	{
		return km;
	}


	@Override
	public String toString() {
		return "marketExecutive [km=" + km + ", ta=" + ta + ", telep=" + telep
				+ "]";
	}
	
	
	//System.out.println("kilometer  is" +getKem() +  " tour  allowance  is "+ ta + "telephone  is" +telep)
}

}