class Pali
{
	int rem,sum,no,a;
	 Pali(int n)
	{
		no=n;
		n=a;
	}
	public void show()
	{
		while(no>0)
		{
		rem=no%10;
		sum=(sum*10)+rem;
		no=no/10;
		}
		if(sum==a)
		{
		System.out.println("it is a Pallindrome  no."+sum);
		}
		else
		{
				System.out.println("it is not a Pallindrome no."+sum);
		}

	}


	public static void main(String[] args) 
	{
		System.out.println(" program to display  Pali of no.");

		 Pali r=new  Pali(1234);
		r.show();
		}
}
