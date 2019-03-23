package ch4;

public class baseemp {
	
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
	int pea;
	int fa;
	int oa;
    double  pf =1000;
	   int  pt=199;
	   int  hra=890;
	   
public Manager(int empid, String empname, int sal, int pea, int fa, int oa) {
		super(empid, empname, sal);
		this.pea = pea;
		this.fa = fa;
		this.oa = oa;
	}
`
@Override
public String toString() {
	return "Manager [pea=" + pea + ", fa=" + fa + ", oa=" + oa + "]";
}


public void  show()
{
	
	pea=(0.08*Sal);
	fa=(0.013*Sal);
	oa=(0.03*Sal);
	
int  gs=Sal+hra+medical;
int ns=gs-(pt+pf);
}
//System.out.println("total  petrol  allowance  is"+pea +"food  allowance"+fa+"other allowance"+oa);

}

public    class  marketExecutive  extends baseemp
{
	int  km;
	int ta=5;
	int telep=1500;
	int Sal=1000;
   int  pf =1000;
   int  pt=199;
   int  hra=890;
   

	
	
	 public marketExecutive(int empid, String empname, int sal, int km, int ta,int telep) {
		super(empid, empname, sal);
		this.km = km;
		this.ta = ta;
		this.telep = telep;
	}

	
	public int  getKem()
	{
		return km;
	}


	@Override
	public String toString() {
		return "marketExecutive [km=" + km + ", ta=" + ta + ", telep=" + telep
				+ "]";
	}
	public void  show()
	{
		
	
	int  gs=Sal+hra+medical;
	int ns=gs-(pt+pf);
	}
	
	
	//System.out.println("kilometer  is" +getKem() +  " tour  allowance  is "+ ta + "telephone  is" +telep)
}

}
