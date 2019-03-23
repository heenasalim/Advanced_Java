package balls;

public class Synchrinizedtransaction   extends   Thread {

	Thread  t1;
	Thread   t2;
	SynchronizedAccount a;
	Synchrinizedtransaction(SynchronizedAccount a)
	{   
		this.a=a;
		t1=new  Thread(this,"thread1");
		t2=new  Thread(this,"thread  2");
		t1.start();
		t2.start();
	}
	
	 public  void  run()
	{
		 for(int  i=0;i<5;i++)
			{
			try {
				
		if(Thread.currentThread()==t1)
		{
			synchronized(this)
			   {//run  method  use to  define  threads
		    deposite(2000);
			        }
			Thread.sleep(1000);
		} 
		   //  if  u  r  not  giving  this  u  cannot  see  stop when  it  happened  u  cannot  able  to  see  it  it  will  happen  so  fast 		
			
		
		if(Thread.currentThread()==t2)
		{   synchronized(this)
			{
			withdraw(1000);
			}
			Thread.sleep(1000);
		}
	  }
		catch (InterruptedException e)
		{
			e.printStackTrace();
	     }
	
	}
			}
	  //private synchronized void  withdraw(int  i)   either  use  this  orv  defined  Lock  l1=new ReentrantLock();  at  start  of  the  program
	  private synchronized void  withdraw(int  i)
	  {
		  int  bal=a.getBalance();
		  bal=bal-i;
		  a.setBalance(bal);
		 System.out.println("after  withdraw "+a.getBalance()); 
	  }
	  private  synchronized void  deposite(int  i)
	  {
		  int  bal=a.getBalance();
		  bal=bal+i;
		  a.setBalance(bal);	 
		  System.out.println("after  deposite" +a.getBalance());
	  }
      public static void main(String[] args) {
	
	  SynchronizedAccount a=new SynchronizedAccount(5000);
	  Synchrinizedtransaction  s1=new Synchrinizedtransaction(a);
}
	}
	

