//package Applet;


import java.awt.*;

import javax.swing.*;
import java.applet.*;


	public class Applet2 extends  JApplet
	{
		int size,id1;
		String str,str1;
		Font f;
		public void init() 
		{//super.init();
			str=getParameter("Font Name");
			String xx=getParameter("size");
			 size=Integer.parseInt(xx);
			
			
			
			//str1=getParameter("id");
			//id1=Integer.parseInt(str1);
			f=new Font(str,Font.BOLD,size);
			
			
			
		}
		public void paint(Graphics g)
		{
			//super.paint(g);
			g.setFont(f);
			
			g.drawString("Hello everyOne",50,50);
			
		}
		public void start()
		{
			//super.start();
			//JOptionPane.showMessageDialog("applet is strated");
		}

		public void stop()
		{
			//super.stop();
		}
		public void destroy()
		{
			//super.destroy();
			System.out.println("Applet is being destroyed");
		}

}
