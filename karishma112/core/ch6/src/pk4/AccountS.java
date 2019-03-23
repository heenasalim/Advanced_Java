package pk4;
///************************simple inner class**********************************************************************
public class AccountS {
	int accountid;
	String accountname;
	double accountbal;
	/**
	 * @param accountid
	 * @param accountname
	 * @param accountbal
	 */
	public AccountS(int accountid, String accountname, double accountbal) {
		//super();
		this.accountid = accountid;
		this.accountname = accountname;
		this.accountbal = accountbal;
	}
	 public class Loker
	{
		 int lockid;
	
		public Loker(int lockid) 
		{
			//super();
			this.lockid = lockid;
		}
		 void print()
			{
				System.out.println("Account Id= "+accountid);
				System.out.println("Account name= "+accountname);
				System.out.println("Account Balance= "+accountbal);
				System.out.println("lockId= "+lockid);
			}

	}
		 public static void main(String[] args) {
		// TODO Auto-generated method stub
			 AccountS a=new AccountS(1,"Saving",30000);
			 Loker l=a.new Loker(123);
			 l.print();

	}

}
