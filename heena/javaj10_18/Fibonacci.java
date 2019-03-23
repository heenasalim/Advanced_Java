class Fibonacci
{
	int a=0;
	int b=1;
	int sum=0;
	
	public void show()
	{
			System.out.println("  fibonacci series "+a+"\n"+b);
		for(int i=0;i<=15;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);

		}
	
	}


	public static void main(String[] args) 
	{
		System.out.println(" program to display fibonacci of no.");

		Fibonacci r=new Fibonacci();
		r.show();
		}
}

