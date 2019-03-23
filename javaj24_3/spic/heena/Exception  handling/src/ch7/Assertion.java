package ch7;

import java.util.Scanner;

public class Assertion {
	int  amount;
	int  balance=5000;
	public  void  check()
	{
	
	 System.out.println("\n enter  the  amount  u  want  to  withdraw\n ");	
	  Scanner  s=new  Scanner(System.in);
	 amount= s.nextInt();   
	  
	 
		 assert amount<5000:"  \n cannot  withdraw   amount  balance  is  not  sufficient";
	 
}

	public  static  void  main(String  args[])
	{
		 Assertion  a=new Assertion();
		 a.check();
	}
}
