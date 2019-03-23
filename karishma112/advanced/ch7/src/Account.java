import java.util.Scanner;


public class Account 
{

	public int balance=20000;
	int wamount;
	//String msg1;
	 Account () throws LessBalanceException
	 {
	System.out.println("how much money u want to withrdaw=  ");
	Scanner s=new Scanner(System.in);
	wamount=s.nextInt();
	if(balance-wamount<=1000)
	{
		throw new LessBalanceException("balance is less");
	}
	else
		{
		System.out.println("withdraw");
		}
		}
		
public static void main(String args[]) throws LessBalanceException
{
	Account a=new Account ();
	
}
}
