package Multithreding;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class BallDemo extends JFrame implements Runnable {

	Thread t1,t2,t3;
	int x1,x2,x3;
	public BallDemo() {
		// TODO Auto-generated constructor stub
		t1=new Thread(this,"Thread-1");
		t2=new Thread(this,"Thread-2");
		t3=new Thread(this,"Thread-3");
		//t1.setPriority(1);
		//t2.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		g.setColor(Color.red);
		g.fillOval(x1,100, 60, 60);
		g.setColor(Color.PINK);
		g.fillOval(x2,300, 60, 60);
		g.setColor(Color.green);
		g.fillOval(x3,600, 60, 60);
	}
	public static void main(String[] args) {
		BallDemo b=new BallDemo();
		b.setVisible(true);
		b.setSize(400,400);
		b.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		while(true)
		{
			try
			{
			
			if(Thread.currentThread()==t1)
			{
				x1++;
				repaint();
				Thread.sleep(50);
				if(x1==400)
				{
					synchronized (this) {
						
					
					wait();
				}
				}
				
			}
			
			
			if(Thread.currentThread()==t2)
			{
				
					
				x2++;
				repaint();
				//System.out.print("thread2=");
				Thread.sleep(50);
				if(x2==400)
				{
					synchronized (this) {
					wait();
					}
				}
				
				
			}
			if(Thread.currentThread()==t3)
			{
				
				x3++;
					Thread.sleep(50);
					repaint();
		
					if(x3==400)
					{
						synchronized (this) {
						notify();
						}
					}
					
			}
				
			
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		
		
	}
		
	}

}
