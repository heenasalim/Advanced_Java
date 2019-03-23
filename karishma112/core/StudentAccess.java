package pk1;
//import java.util.*;
public class StudentAccess 
{
	private int id=10;
	protected String name="karishma";
	String address="pune";//default access specifier
	public int mobno=57576;
	
	public void get()
	{	
		System.out.println("id= "+id);
		
		System.out.println("name= "+name);
		
		System.out.println("address= "+address);
		
		System.out.println("mobno= "+mobno);
		
	}
	/*public void print()
	{	
		System.out.println("id= "+id);
		System.out.println("name= "+name);
		System.out.println("address= "+address);
		System.out.println("mobno= "+mobno);
	}*/
	public static void main(String[] args) 
	{
		StudentAccess s1=new StudentAccess();
		
		s1.get();
		//s1.print();
		
	}
}
