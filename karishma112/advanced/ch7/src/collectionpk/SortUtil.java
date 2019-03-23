package collectionpk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//import javax.swing.tree.TreePath;

public class SortUtil {
	static int i=0;
	static int id;
	
	public String toString()
	{
		return "\nid="+id;
	}
	public static void sort(Employee[] e4)
	{
		Scanner s=new Scanner(System.in);
		ArrayList l1=new ArrayList();
		for(i=0;i<e4.length;i++)
		{
			System.out.println("\nenter empid= ");
			int id=s.nextInt();
			
			System.out.println("\nenter empname=");
			String name=s.next();
			System.out.println("\nenter salary=");
			double salary=s.nextDouble();
			System.out.println("\nenter skills= ");
			String x=s.next();
			e4[i]=new Employee(id,name,salary,x);
		}
		for(i=0;i<e4.length;i++)
		{
			l1.add(e4[i]);
		}
		Collections.sort(l1,new salaryComparator());
		
	System.out.println(l1);
	}
	
}
