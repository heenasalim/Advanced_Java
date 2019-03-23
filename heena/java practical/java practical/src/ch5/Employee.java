package ch5;

public class Employee 
{
      int id,bsc;
      String name;
	
      public Employee()
      {
    	  id=100;
    	  bsc=15000;
    	  name="pranoti";
    	  
      }
      
      
      public Employee(int id, int bsc, String name) {
		super();
		this.id = id;
		this.bsc = bsc;
		this.name = name;
	}
      
      public void display()
      {
    	  System.out.println("Id is="+id);
    	  System.out.println("Name is="+name);
    	  System.out.println("Basic Salary is="+bsc);
    	  
      }
      
      
}
