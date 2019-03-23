package collectionpk;

import java.awt.List;
import java.util.*;

public class Employee {
	int id;
	String name;
	double salary;
	Set skillset;
	//int ch;
	
	
	
	public Employee (int id,String name,double salary,String... X)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		skillset=new HashSet();
	
		for(int i=0;i<X.length;i++)
		 {
			 skillset.add(X[i]);
		 }
		
	}
	
	public Employee (int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public Employee (int id)
	{
		this.id=id;
		//this.name=name;
	}
	@cityInfo(testDemo=" method is of object class")
	public String toString()
	{
		return "\nid="+id+"\tname= "+name+"\tsalary= "+salary+"\tskills= "+skillset;
	}
	

	

	
	public static void main(String[] args) throws EmployeeNotFoundException{
		
		int ch,i,n;
		System.out.println("\n****************MENU******************\n");
		System.out.println("\n1.insert \n2.show\n3.sort\n 4.serch\n5.Exit");
		Scanner s=new Scanner(System.in);
		do
		{
		System.out.println("\nEnter ur choice=");
		ch=s.nextInt();
	
		switch(ch)
		{
		
		case 1:	System.out.println("\nHow many employee u want to add=");	
				n=s.nextInt();
				Employee[] e1=new Employee[n];
				UtilityList.printReport(e1);
				break;
		case 2:System.out.println("\nHow many employee u want to add=");	
				n=s.nextInt();
				Employee[] e3=new Employee[n];
				UtilityReport.showReport(e3);
				
					
					
				break;
		case 3:
			System.out.println("\nHow many employee u want to add=");	
			n=s.nextInt();
			Employee[] e4=new Employee[n];
			SortUtil.sort(e4);
			break;
		case 4:System.out.println("\nHow many employee u want to add=");	
			n=s.nextInt();
			Employee[] e5=new Employee[n];
			 SearhUtil su=new  SearhUtil();
			su.searchInfo(e5);
				break;
		case 5://System.exit(0);
				break;
		}
		
		}while(ch!=5);

	}

}
