package pk6;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String args[])
	{
		String ss,ch;
		int no1,no2;
System.out.println("**********menu***************");
System.out.println("\nADD");
System.out.println("\nSUB");
System.out.println("\nMUL");
System.out.println("\nDIVIDE");
System.out.println("\nExit");
do
{
System.out.println("\n enter ur choice= ");

Scanner s=new Scanner(System.in);
ch=s.next();
System.out.println("\n enter numbers= ");
Scanner s1=new Scanner(System.in);
no1=s.nextInt();
Scanner s2=new Scanner(System.in);
no2=s.nextInt();
//System.out.println("\n");
	
switch(ch)
	{
	case "ADD":System.out.println("Addition= "+(no1+no2));
			
	case "SUB":System.out.println("Substraction= "+(no1-no2));
			
	case "MUL":System.out.println("|Multiplication= "+(no1*no2));
			
	case "DIVIDE":System.out.println("Division= "+(no1/no2));
			
	case "exit":break;
	//case :break;
	//default:break;
	
	}
}while(ch=="exit");

}

	
}