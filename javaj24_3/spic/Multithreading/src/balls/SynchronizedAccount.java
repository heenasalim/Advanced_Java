package balls;

public class SynchronizedAccount  {
   private  int  balance;
   public  SynchronizedAccount( int  balance)   //generally  it  will  get  balance  from  main  method  while  passing  to  constructor  from  database
   {
	  this.balance=balance;
   }
   public int  getBalance()
   {
	return  balance;   
   }
   public void  setBalance(int  i)
   {
	 balance=i; 
   }
}
