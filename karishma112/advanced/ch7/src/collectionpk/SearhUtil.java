package collectionpk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SearhUtil {
	
	
	 int seachid;
	static int i;
	int flag=0;
	static int id;
	String name;
	String x;
	double salary;
	public  void searchInfo(Employee[] e5) throws EmployeeNotFoundException
	{
		Scanner s=new Scanner(System.in);
		ArrayList l1=new ArrayList();
		for(i=0;i<e5.length;i++)
		{
			System.out.println("\nenter empid= ");
			 id=s.nextInt();
			
			System.out.println("\nenter empname=");
			name=s.next();
			System.out.println("\nenter salary=");
			 salary=s.nextDouble();
			System.out.println("\nenter skills= ");
			 x=s.next();
			e5[i]=new Employee(id,name,salary,x);
		}
		for(i=0;i<e5.length;i++)
		{
			l1.add(e5[i]);
		}
		//Scanner s=new Scanner(System.in);
		
		Iterator it=l1.iterator();
		System.out.println("\nEnter id u want to search=");
		
		seachid=s.nextInt();
		
		while(it.hasNext())
		//for(i=0;i<e5.length;i++)
		{
			Employee e6=(Employee)it.next();
			
			if(e6.id==seachid)
			{
				flag++;
				System.out.println(id+"\t"+salary);
				
			}
			if(flag==0)
			{
				throw new EmployeeNotFoundException("Employee not found");
			}
		}
	}
}
		
	//	System.out.println("\nEnter id u want to search=");
		
		//seachid=s.nextInt();
		/*for(i=0;i<e5.length;i++)
		{
			
		}
		if(e5[i]==searchid)
		{
			System.out.println("id is in at "+e5[i]);
		}
		else
		{
			System.out.println("not found");
		}
		}*/
		
	



