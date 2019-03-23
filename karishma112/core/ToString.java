class ToString 
{
	int empid;
	String empname;
	double esal,gs,pf;
	//double pt;;
	
	ToString(int a,String s,double d)
	{
		empid=a;
		empname=s;
		esal=d;
	}
void print()
	{
	//System.out.println("EMPID=  "+empid);
	//System.out.println("EMPNAME=  "+empname);
	//System.out.println("EMPSALARY=  "+esal);
	pf=(12*esal)/100;
	gs=esal-(200+pf);
	//System.out.println("GROSSSALARY=  "+gs);
	}
	public String toString()
	{
		return "\nempid="+empid+"\nEmpName="+empname+"\nEmpSal= "+esal+"\nGrossSalary= "+gs;
	}

	public static void main(String[] args) 
	{
		ToString t=new ToString (1,"abc",20000);
	     t.print();
		System.out.println(t);
	}
}
