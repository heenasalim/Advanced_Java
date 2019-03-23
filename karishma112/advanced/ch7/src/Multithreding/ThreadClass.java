package Multithreding;

import java.util.Scanner;
import java.lang.Thread;

public class ThreadClass extends Thread {
	Thread t1,t2;

	public ThreadClass() {
		t1=new Thread(this,"Thread-1");
		t2=new Thread(this,"Thread-2");
		t1.start();
		t2.start();
		
	}
	
public void run()
{
	int i=0;
	//Scanner s=new Scanner(System.in);
	int no1=2;
	int no2=3;
	for(i=0;i<5;i++)
	{
		
		
		if(Thread.currentThread()==t1)
		{
			System.out.print("thread1=");
			System.out.println(""+no1);
			no1++;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
		if(Thread.currentThread()==t2)
		{
			System.out.print("thread2=");
			System.out.println(""+no2);
			no2=no2+3;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	}

	
	
	public static void main(String[] args) {
		ThreadClass ts=new ThreadClass();
		
	}

}
