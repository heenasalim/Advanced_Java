package pk1;
import java.util.*;
public class Student 
{
	int id;
	String name,address;
	int mobno;
	public void get()
	{	Scanner s=new Scanner(System.in);
		System.out.println("******enter the student details***********"+);
		System.out.println("id= ");
		id=s.nextInt();
		System.out.println("name= ");
		name=s.next();
		System.out.println("address= ");
		address=s.next();
		System.out.println("mobno= ");
		mobno=s.nextInt();
	}
	public void print()
	{	//Scanner s=new Scanner(System.in);
		//System.out.println("enter the student details= ");
		System.out.println("id= "+id);
		System.out.println("name= "+name);
		System.out.println("address= "+address);
		System.out.println("mobno= "+mobno);
	}
	public static void main(String[] args) 
	{
		//Student s1=new Student();
		
		//s1.get();
		//s1.print();
		
	}
}
