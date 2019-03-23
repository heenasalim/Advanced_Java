

import java.awt.Component;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.*;
import java.lang.*;

public class Balls extends JFrame implements Runnable, MouseListener, MouseMotionListener{
	
	JLabel l,l1,l2;
	String str,txt;
	boolean drag=false;
	int mx,my;
	int speed =0;
	int count=0;
	long time;
	Thread t1;
	int x2=0;
	int x3,x4,y3,y4,x5,y5;
	int del;
	int n=1;
	int c=0;
	int z;
	double q,q1;
	int x=0;
	int v;
	int cnt=2;
	boolean b1=false,b2=true,b5=true;
	double vel;
	double y=700;
	int x1;
	
	Balls()
	{
		setLayout(null);
		
		
		addMouseListener(this);
		addMouseMotionListener(this);
			repaint();
			
		
			
			
		
		l=new JLabel(new ImageIcon("//tanish/MODULAR STUDENT COMMON/Rincy/Saksham/images.png"));
		l1= new JLabel();
		l2= new JLabel();
	
	}

	public static void main(String[] args) {
		Balls b= new Balls();
		b.setSize(1000, 700);
		b.setVisible(true);
		b.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}

	@Override
	public void run() {
		while(true)
		{
			if(Thread.currentThread()==t1)
			{
				
				
				try {
					
					
					if(b1)
					{
						
					x+=.1*v;
					x2+=.1*v;
					
					if(b5)
					y=700-(Math.tan(q)*x2-((9.8/(2*v*v*Math.cos(q)*Math.cos(q)))*x2*x2));
					else
						y=(Math.tan(q)*x2+((9.8/(2*v*v*Math.cos(q)*Math.cos(q)))*x2*x2))-700;
					//System.out.println(y);
					if((int)y<=0)
					{
						b5=false;
						//q=3.14-q;
						
					}
					else if((int)y>=700)
						b5=true;
					System.out.println(x);
					if((int)y>698)
					{
						c=x2;
						x2=0;
						count++;
						if(y>2)
						{ 
						
							v=(int)(v/1.1);
						}
						
						
					}
					if(x>940)
					{
						cnt++;
						
					if(cnt%2!=0)
					b2=false;
					else
						b2=true;
					x=0;
					
					}
					
					
					
					
					Thread.sleep(10);
					}
				
					if(v<7)
					{
						b1=false;
						count=0;
						//speed=1;
					}
					repaint();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
	}
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		if(drag)
		{
			txt="speed="+v+" Angle="+Math.toDegrees(q1);
			
		l2.setBounds(mx, my, 150, 40);
		l2.setText(txt);
		add(l2);
			
		}
		else
		{
			
		l2.setBounds(mx, my, 150, 40);
		l2.setText("");
		add(l2);
		}
			
		
		
		
		if(b2)
		{
			
			l.setBounds(x,(int)y-95, 60, 60);
			
			
		}
		else 
		{
			
			l.setBounds(940-x,(int)y-95, 60, 60);
				
			
		add(l);
		}
		l1.setBounds(300, 20, 200, 40);
		if(b1)
		str="Speed= "+v+" Angle= "+Math.toDegrees(q);
		else
		{
			
			if(b2)
			l.setBounds(x,(int)y-95, 60, 60);
			else
				l.setBounds(970-x,(int)y-95, 60, 60);	
			add(l);
			str="Drag to start";
		}
		l1.setText(str);
		add(l1);
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		
		
		drag=true;
		System.out.println(speed);
		mx=arg0.getX();
		my=arg0.getY();
		speed=(int) Math.sqrt((mx-x3)*(mx-x3)+(my-y3)*(my-y3));
		 q1 = Math.atan2(y3-my, mx-x3);
		v=speed;
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		
	
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		repaint();
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource()==this)
		{
			
			x3=e.getX();
			y3=e.getY();
			
		}
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource()==this)
		{
		x4=e.getX();
		y4=e.getY();
		
		drag=false;
		q=Math.atan2(y3-y4, x4-x3);
		
		System.out.println("q"+(q));
		System.out.println("x3"+x3);
		System.out.println("x4"+x4);
		System.out.println("y3"+y3);
		System.out.println("y4"+y4);
		}
		if(e.getSource()==this&&b1==false)
		{
			b1=true;
			b2=true;
			cnt=2;
			if((q)>3.14/2)
			{
			b2=false;
			q=3.14-q;
			cnt=3;
			}
			v=speed;
			if(v>200)
				v=200;
			
		t1= new Thread(this,"t1");
		t1.start();
		
		
		}
		
	}

}
