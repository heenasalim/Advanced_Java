//package Applet;


	import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	import javax.swing.*;
import java.applet.*;


	public class applet3  extends  JApplet implements ActionListener
	{

		Button b1,b2,b3;
		public void init()
		{
			b1=new Button("Red");
			b2=new Button("Green");
			b3=new Button("Blue");
			add(b1);
			add(b2);
			add(b3);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			AppletContext ct=null;
			if(e.getSource()==b1)
			{
				System.out.println("change");
				 ct=getAppletContext();
				changingApplet current=(changingApplet)ct.getApplet("changing");
				current.change(Color.red);
			}
			if(e.getSource()==b2)
			{
				System.out.println("change");
				ct=getAppletContext();
				changingApplet current=(changingApplet)ct.getApplet("changing");
				current.change(Color.green);
			}
			if(e.getSource()==b3)
			{
				System.out.println("change");
				ct=getAppletContext();
				changingApplet current=(changingApplet)ct.getApplet("changing");
				current.change(Color.blue);
			}
		}
}
