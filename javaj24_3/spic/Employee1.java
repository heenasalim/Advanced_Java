class   Employee1 
{
  int empid;
  String  Name;
  int Sal;
  Employee1()
	{
	  empid=1001;
	  Name="heena";
	  Sal=10000;
	}

 Employee1(int empid ,String Name,int  sal)
	{
	  this.empid=empid;
	 this.Name=Name;
	  this.Sal=Sal;
	}
public   String  toString()
		{
	return " \n Employee  empid ==  " + empid  + "\n Name ==  " +Name + "\n salary=  "+Sal;

	  }



	public static void main(String[] args) 
	{
		  Employee1  e= new Employee1();
          System.out.println(" memory  location  where data i  of  employee   one   is:: \n \n "  +e);
	 
          Employee1  k= new Employee1(10002,"sayli",19900);  
		  System.out.println("   memory  location where data   of  employee  two   is::\n \n "  +k);
		  
		
	}
}
