package ch6;

public class Account {

	int  accid;
	  String accname;
	  int  balance;
	  class  Locker
	  {
		 int  locid;
		Locker(int  locid)
		{
		this.locid=locid;
		
		}
		public  void  show()
		{
		System.out.println("lcid=="+locid+"acdcid"+accid+"account  name"+accname+"balance"+balance);
		}
		
	  }

public  static  void  main(String args[])
{
	Account a=new  Account();
	Locker  l=a.new Locker(6);
	l.show();
	
}
}