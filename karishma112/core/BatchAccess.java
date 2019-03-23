package pk2;
//import java.util.*;
import pk1.StudentAccess;
public class BatchAccess
{
	
	public static void main(String[] args) 
	{
		StudentAccess b=new StudentAccess();
		//BatchAccess s=new BatchAccess();
		
		System.out.println("mobno is public = "+b.mobno);
		System.out.println("address is public = "+b.address);
		System.out.println("name is protected = "+b.name);
		System.out.println("address is private = "+b.id);
	}
}
