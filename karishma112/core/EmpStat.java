class EmpStat 
{
	static int empid=1;
	//int empid=1;
	String empname;
	double bassalary,hra,medical,pf,pt,netsalary,grossalary;
	double gs;
	double n;
	double b;
	double h;
	
EmpStat()
	{
	//empid;
	empname="abc";
	bassalary=20000;
	hra=0.0;
	medical=0.0;
	pf=0.0;
	pt=200.0;
	netsalary=0.0;
	grossalary=0.0;

	}

EmpStat(int eid,String ename,double bs)
	{
	//empid=eid;
	empname=ename;
	bassalary=bs;
	
	}
double hraCalc()
	{
	
	return (bassalary/2);
	
	
	}
double pfCalc()
	{
	
	return ((12*bassalary)/100);
	
	}
double grossSal()
	{
	
	return (bassalary+hra+medical);
	
	}
double netSalary()
	{
		
		return (grossSal()-(200+pfCalc()));
		
	}
	public static int totalEmp()
	{
	return (++empid);
	}

void print()
	{
	System.out.println("EmployeeId is  "+totalEmp());
	System.out.println("EmployeeName is  "+empname);
	System.out.println("Employee BasicSalry is  "+bassalary);
	System.out.println("HRA is  "+hraCalc());
	System.out.println("PF  is  "+pfCalc());
	System.out.println("GrossSalary   is  "+grossSal());
	System.out.println("Net Salary is  "+netSalary());
	}
	public static void main(String[] args) 
	{
		System.out.println("DAY 1");
		EmpStat e=new EmpStat(1,"abc",20000.0);
		EmpStat e1=new EmpStat(1,"abc",20000.0);

		e.print();
		System.out.println("DAY 2");
		e1.print();
		//totalEmp();

		
	}
}
