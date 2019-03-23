

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ChangingApplet extends Applet 
 {
	 Canvas c;
	 Color col;

	 public void change(Color clr)
	 {
		c.setBackground(clr);
		col=clr;
		repaint();

	 }
	 public void init()
	 {
		// col=Color.black;
		System.out.println("init() called");
		c=new Canvas();
		c.setSize(50,50);
		c.setBackground(Color.black);
		add(c);
	 }
	 public void start()
	 {
		 	System.out.println("start() called");
	 }
		 public void stop()
	 {
		 	System.out.println("stop() called");

	 }
	  public void destroy()
	 {
	 	System.out.println("destroy() called");

	 }
	 public void paint(Graphics g)
	 {
		c.setBackground(col);

	 }


 }