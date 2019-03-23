class  Employee
{  
	int  employid;
  String empname;
  double  Sal =2000.0;
  double  HRA;
  double Medical;
  double  PF;
  double  PT=200;
  double NetSal;
  double GrosSal;

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
		return PF =(0.012*Sal);
	}

	public static void main(String[] args) 
	{
		Employee o= new Employee();
		System.out.println("/"+o.calhra());
		System.out.println("/"+o.calpf());
		
	}
}
