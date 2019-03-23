package Multithreding;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Busdemo extends JFrame implements Runnable{
	Thread t1,t2,t3;
	int x1,x2=1200;
	boolean red=false;
	boolean green=false;
	
	public  Busdemo()
	{
		t1=new Thread(this,"Thread-1");
		t2=new Thread(this,"Thread-2");
		t3=new Thread(this,"Thread-3");
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
	}
	public static void main(String[] args) {
		 Busdemo bd=new  Busdemo();
		 bd.setVisible(true);
		 bd.setSize(400,400);
		 bd.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawLine(0,270,550,270);
		g.drawLine(0,470,550,470);
		
		g.drawLine(550,0,550,270);
		g.drawLine(550,470,550,750);
		
		g.drawLine(750,0,750,270);
		g.drawLine(750,470,750,750);
		
		g.drawLine(750,270,1400,270);
		g.drawLine(750,470,1400,470);
		g.setColor(Color.green);
		
		g.fillRect(x1,340, 150,80);
		g.fillOval(x1,415, 30,30);
		g.fillOval(x1+100,415, 30,30);
		//g.(300,350, 150,100);
		
		g.setColor(Color.orange);
		g.fillRect(x2,340,150,80);
		g.fillOval(x2+100,415,30,30);
		g.fillOval(x2,415,30,30);
		
		g.setColor(Color.BLACK);
		g.fillRect(480, 150,50,120);
		if(red==true)
		{
			
		g.setColor(Color.red);
		
		g.fillOval(490, 180, 30,30);
		
		//green=true;
		}
		if(green=true)
		{
	
		g.setColor(Color.GREEN);
		g.fillOval(490,220,30,30);
		}
		g.setColor(Color.BLACK);
		g.fillRect(770, 150,50,120);
		g.setColor(Color.red);
		g.fillOval(780, 180, 30,30);
		g.setColor(Color.GREEN);
		g.fillOval(780,220,30,30);
		
		
		
		
		
		//g.drawRect(x, y, width, height)
		
	}
	@Override
	public void run() {
		while(true)
		{
			try
			{
			
			if(Thread.currentThread()==t1)
			{
				x1++;
				repaint();
				Thread.sleep(50);
				
			}
			
			
			if(Thread.currentThread()==t2)
			{
				for(int j=0;j<200;j++)
				{
				if(red==true)
				{
					
				x2--;
				repaint();
				//System.out.print("thread2=");
				Thread.sleep(10);
				
				}
				}
			}
			if(Thread.currentThread()==t3)
			{
				red=true;
				
				for(int i=0;i<1;i++)
				{
				
				if(red)
				{
					green=false;
					Thread.sleep(2000);
					repaint();
		
					green=true;
				}
				if(green)
				{
					red=false;
					Thread.sleep(1000);
					repaint();
					
					red=true;
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
			
			
		
	
	


