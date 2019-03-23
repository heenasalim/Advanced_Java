package balls;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
 private  int  balance;
 Lock  l1=new ReentrantLock();       //  it  is  use  as  static  pehla  bhi   transacyion  it  will  remember  and  sequentially  //  if  we  dont  use  this  command  koi  bhi  sequence  me  operations  hoge
 public  Account(int  balance)
 {
	 super();
	 this.balance=balance;
 }
 public  int  getbalance()
 {
	 return  balance;
 }
 public  void  setBalance(int  balance)
 {
	 this.balance=balance;
 }
}
