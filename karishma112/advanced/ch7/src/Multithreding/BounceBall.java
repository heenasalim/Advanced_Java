package Multithreding;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class BounceBall extends JFrame implements Runnable {

	
		
		int i=0;
		Thread t1,t2,t3;
		int x1=10,y1=10;
		public BounceBall() {
			// TODO Auto-generated constructor stub
			t1=new Thread(this,"Thread-1");
			
			t1.start();
		}
		@Override
		public void paint(Graphics g) {
		
		super.paint(g);
		
		g.setColor(Color.red);
		g.fillOval(x1,y1, 60, 60);
		}

	public static void main(String[] args) {
		
		BounceBall bb=new BounceBall();
		bb.setVisible(true);
		bb.setSize(500,500);
		bb.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

	@Override
	public void run()
	{
		while(true)
		{
			try
			{
				
			
			if(Thread.currentThread()==t1)
			{
				while(true)
				{
					while(y1<=650-i)
					{
				Thread.sleep(50);
				repaint();
				y1=y1+10;
				x1=x1+5;
				if(y1==650)
				{
					//repaint();
					synchronized (this) 
					{
						
					wait(1000);
					y1=651;
					}
				}
			       }
					i=i+100;
					while(y1>i)
					{
					//	y1=y1-5;
				    // if(y1==651)
				{
					Thread.sleep(50);
					repaint();
					y1=y1-10;
					x1=x1+5;
					System.out.println(y1);
					
				}}
				}
				
				
			}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	
	}
}