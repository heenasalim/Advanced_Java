package collectionpk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UtilityList {
	int id;
	static int n;
	static int i;
	String name;
	double salary;
	Set skillset;
	//int ch;
	//@cityInfo(cityname="Pune",zip=10)
	public static void printReport(Employee[] e1)
	{
		Scanner s=new Scanner(System.in);
		/*System.out.println("\nHow many employee u want to add=");	
		n=s.nextInt();
		Employee[] e1=new Employee[n];*/
		ArrayList l1=new ArrayList();
		for(i=0;i<e1.length;i++)
		{
			System.out.println("\nenter empid= ");
			int id=s.nextInt();
			
			System.out.println("\nenter empname=");
			String name=s.next();
			System.out.println("\nenter salary=");
			double salary=s.nextDouble();
			System.out.println("\nenter skills= ");
			String x=s.next();
			e1[i]=new Employee(id,name,salary,x);
		}
		for(i=0;i<e1.length;i++)
		{
			l1.add(e1[i]);
		}
		Iterator it=l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//System.out.println(l1);
		
	}

}