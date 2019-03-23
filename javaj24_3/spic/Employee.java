class  Employee
{  
	int  employid;
  String empname;
  double  Sal ;
  double  HRA;
  double Medical;
  double  Pf;
  double  Pt;
  double NetSal;
  double GrosSal;
  Employee()
	{
	   employid=1;
     empname="HEENA" ;
	  Sal=20000;
	  HRA=200;
	  Medical=1000;
	  Pf=100;
	  Pt=100;
	  NetSal=80;
	  GrosSal=11000;
	} 
	Employee(int e,String en, double  s,double h,double  m,double pf,double pt,double ns,double  gs)
	{
	   employid=e;
     empname=en ;
	  Sal=s;
	  HRA=h;
	  Medical=m;
	  Pf=pf;
	  Pt=pt;
	  NetSal=ns;
	  GrosSal=gs;
	}
public   int  geteid()
	{
	return   employid;
	}
	public  String   getemp()
	{
		return empname;
	}
	
	public double gethra()
	{
		return HRA;
	}
	public double  getmedical()
	{
		return Medical;
	}
	public  double  getpf()
	{
		return Pf;
	}
	public double getpt()
	{
		return Pt;
	}
public  double  netsal()
	{
		return  NetSal;
	}
	public double grossal()
	{
		return  GrosSal;
	}

  public  void  display()
	{
	  System.out.println("ID of  employee  is:" +employid);
      System.out.println("NAME of  employee  is:" +empname);
	  System.out.println("salary  of  employee  is:"+Sal);
      System.out.println("hra   of  employee  is:"+HRA);
     System.out.println("medical  of  employee  is:"+Medical);
     System.out.println("pf   of  employee  is:"+Pf);
	 System.out.println("pt   of  employee  is:"+Pt);
       System.out.println("netsal   of  employee  is:"+NetSal);
     System.out.println("gross sal  of  employee  is:"+GrosSal);

	}

  public  double   getSal()
	{
	  return Sal;
	}
 	  public  double calhra()
	{
  return HRA=(0.5*Sal);
	}
	public  double  calpf()
	{
		return Pf =(0.0012*Sal);
	}

public   double calg()
	{
GrosSal=Sal+HRA+Medical;

return  GrosSal;
	}

	public   double caln()
	{
NetSal=GrosSal-(Pt+Pf);
return  NetSal;
	}

	public static void main(String[] args) 
	{
Employee o= new Employee();

  System.out.println(o.geteid()+o.gethra()+o.getemp()+o.getmedical()+o.getpf()+o.getpt()+o.netsal()+o.grossal());
   o.display();
		System.out.println(+o.calhra());
		System.out.println(  +o.calpf());
		System.out.println(o.calg());
System.out.println(o.caln());
	}
}
               