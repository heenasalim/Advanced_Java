import java.util.*;
class MathClass1 
{
     
static void add(int... no)
	{
		int sum=0;
		for(int i=0;i<no.length;i++)
		{
		sum=sum+no[i];
		}
	
		System.out.println("addition = "+sum);
		
	}

	public static void main(String[] args) 
	{
		
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter How many no's u want to add= ");
	     int m=s1.nextInt();
		int[] a=new int[m];
		System.out.println("enter the no's= ");

		for(int i=0;i<a.length;i++)
		{
			a[i]=s1.nextInt();
		}
		
		add(a);

	}
}
