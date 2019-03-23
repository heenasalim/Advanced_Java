class   EmployeeStatic
{
  static  int employid;
  static String empname;
  static  int  Sal;

	
	EmployeeStatic()
	{
	   employid=1;
       empname="HEENA" ;
	   Sal=20000;
	  System.out.println(employid +empname +Sal);  
	} 


	EmployeeStatic(int e,String en, int   s)
	{
	   employid=e;
     empname=en ;
	  Sal=s;
	  System.out.println(employid  +empname  +Sal);
	 
	}

public   double geteid()
	{
	return   employid;
	}


	public  String   getemp()
	{
		return empname;
	}
	

	
public  int   getSal()
	{
		return  Sal;
	}
	
  public  static   int  totalEmployee()
	{
	  return(++employid);
	  
	}



public static void main(String[] args) 
	{
		EmployeeStatic es=new EmployeeStatic();
        System.out.println(es.geteid() +es.getSal() +es.getemp());
		System.out.println("\n \n total  number  of  employees  @trial  day 1");

        
         System.out.println(totalEmployee()+"******************************************\n \n ");


			EmployeeStatic  es1=new EmployeeStatic(1,"hee4na",34);
                        
		 System.out.println("\n \n **********total  number of  employee is  @day  2" );
					
			   
					 
 System.out.println(totalEmployee()+"******************************************\n \n ");
                    
					
				   System.out.println(" \n \n total  number  of  employes @day three ");
                  EmployeeStatic  es2=new  EmployeeStatic(1,"sayali",34);
                  totalEmployee();
             System.out.println(totalEmployee()+"******************************************\n \n ");
                 EmployeeStatic  es3=new  EmployeeStatic(2,"prajakta",324);
	       System.out.println("\n \n total  number  of  employees  @trial  day 4");
   
				 totalEmployee();
                System.out.println(totalEmployee()+"******************************************\n \n ");;   
		           
	}
}
