class Reverse 
{
	int rem,sum,no;
	Reverse(int n)
	{
		no=n;
	}
	public void show()
	{
		while(no>0)
		{
		rem=no%10;
		sum=(sum*10)+rem;
		no=no/10;
		}
		System.out.println("reverse of no."+sum);
	}


	public static void main(String[] args) 
	{
		System.out.println(" program to display reverse of no.");

		Reverse r=new Reverse(1234);
		r.show();
		}
}