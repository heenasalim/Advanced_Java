package pk4;
//***********************static inner class*************
public class Account {
	int accountid;
	String accountname;
	double accountbal;
	static public class Loker
	{
		static int lockid=1;
		/**
		 * @param lockid
		 */
		static int  accept()
		{
			return ++lockid;
		}
		//int lockid;
		
		/*Loker l=new Loker();
		Account.Loker
		accept();*/
		static void printlock()
		{System.out.println("lockId= "+lockid);
		
		}
		
	}
	void print()
	{
		System.out.println("Account Id= "+accountid);
		System.out.println("Account name= "+accountname);
		System.out.println("Account Balance= "+accountbal);
		//System.out.println("lockId= "+lockid);
	}
	
	public Account(int i, String s, int j) {
		accountid=i;
		accountname=s;
		accountbal=j;
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[])
	{
		Account a=new Account(1,"saving",300000);
		//Loker l=a.new Loker();
		//l.print();
		Loker.accept();
		Loker.printlock();
		a.print();
		
		
	}

}
