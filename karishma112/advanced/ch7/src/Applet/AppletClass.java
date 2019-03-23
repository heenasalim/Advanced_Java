//package Applet;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AppletClass extends  JApplet
{

	public void init() 
	{
		super.init();
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString("Hello everyOne",50,50);
		//g.setFont(Bold);
		//String type=getParameter("Font");
		//int size=Integer.parseInt(ge)
	}
	public void start()
	{
		super.start();
		//JOptionPane.showMessageDialog("applet is strated");
	}

	public void stop()
	{
		super.stop();
	}
	public void destroy()
	{
		super.destroy();
		System.out.println("Applet is being destroyed");
	}


	

}
