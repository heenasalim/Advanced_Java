import java.util.Scanner;


public class AccountAss {

	public int balance=20000;
	int wamount;
	AccountAss()
	{
	System.out.println("how much money u want to withrdaw=  ");
	Scanner s=new Scanner(System.in);
	wamount=s.nextInt();
	assert balance-wamount<=1000;
			
	
		System.out.println("balance is less");
	System.out.println("withdraw");
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountAss a=new AccountAss();
	}

}