import java.util.*;
class   Varargs
{
	public  static    void  add( int...x)
	{  int  sum=0;
		  for ( int i=0;i<x.length; i++ )
		  {
sum=sum+x[i];

	  }
	  System.out.println("ADDITION  OF  TWO  NUMBER  IS:"+sum);


	}

	public static void main(String[] args) 
	{

		int  a[]=new  int[5];
	Scanner s = new Scanner(System.in);
		System.out.println("enter  the  number  of  arguments:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
         add(a);
		System.out.println("Hello World!");
	}
}
