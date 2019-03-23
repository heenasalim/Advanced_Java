package ch7;

import java.util.Scanner;

public class divi extends  Exception{
	
	 int a,b;
	 int  c;
	   
	public void division()
	{  
		Scanner  s=new Scanner(System.in);
		System.out.println("enter  the  two  numbers  u  want  to    divide");
		  a=s.nextInt();
		  b=s.nextInt();
		  try
		  {
			 c=a/b;
			 System.out.println(c);
			 
		  }
		  catch(ArithmeticException a)
		  {
			  a.printStackTrace();
		  }
		 finally
		 {
			
		 }
		  
    }
	
	 public  void  testException()  throws  Exception 
	{
	
		     Scanner  s=new Scanner(System.in);
			 System.out.println("enter  the  two  numbers  u  want  to    divide");
			  a=s.nextInt();
			  b=s.nextInt();
			  if(b==0)
			  {
				 throw new ArithmeticException("dont divide by 0"); 
			  }
	}
	    public  static  void  main(String  args[]) throws Exception
	    {
	    	  divi  d=new  divi();
	    	  d.division(); 
	    	  d.testException();
	    }
	}

