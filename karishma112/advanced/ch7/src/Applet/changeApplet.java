//package Applet;


		import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


	public class changeApplet  extends  JApplet implements ActionListener
		{

			JButton b1,b2,b3;
			public void init()
			{
				b1=new JButton("Red");
				b2=new JButton("Green");
				b3=new JButton("Blue");
				//b1.setSize(20,20);
				//b2.setSize(20,20);
				//b3.setSize(20,20);
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
					changingApplet current=(changingApplet)ct.getApplet("changingApplet");
					current.change(Color.red);
				}
				if(e.getSource()==b2)
				{
					System.out.println("change");
					ct=getAppletContext();
					changingApplet current=(changingApplet)ct.getApplet("changingApplet");
					current.change(Color.green);
				}
				if(e.getSource()==b3)
				{
					System.out.println("change");
					ct=getAppletContext();
					changingApplet current=(changingApplet)ct.getApplet("changingApplet");
					current.change(Color.blue);
				}
			
	}

}