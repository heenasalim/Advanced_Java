package ch7;

import java.util.Scanner;

public class Account  extends  Exception {
	
	
public Account(String  s) {
		super(s);
		    }

  
public static void main(String[] args)throws  Exception
{
	System.out.println("hello");
	  CheckAccount  a=new  CheckAccount();
	  a.withdraw();
}
}

