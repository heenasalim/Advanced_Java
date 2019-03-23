

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

 public class ChangerApplet extends Applet implements ActionListener
 {
	Button red,green,blue;
	
	 public void init()
	 {
			System.out.println("init() called");
			red=new Button("Red");
		 	green=new Button("green");
			blue=new Button("blue");
			add(red);
		 	add(green);
			add(blue);
			red.addActionListener(this);
		 	green.addActionListener(this);
			blue.addActionListener(this);
			//showStatus("Changer");
	 }
	 
	 public void actionPerformed(ActionEvent e)
	 {
		 AppletContext ctx=null;
		 if(e.getSource()==red)
		 {
			 System.out.println("change");
			 ctx=getAppletContext();
			 ChangingApplet currentApplet=(ChangingApplet)ctx.getApplet("changing");
			 currentApplet.change(Color.red);


		 }
		  if(e.getSource()==green)
		 {
			 System.out.println("change");
			 ctx=getAppletContext();
			 ChangingApplet currentApplet=(ChangingApplet)ctx.getApplet("changing");
			 currentApplet.change(Color.green);


		 }
		  if(e.getSource()==blue)
		 {
			 System.out.println("change");
			 ctx=getAppletContext();
			 ChangingApplet currentApplet=(ChangingApplet)ctx.getApplet("changing");
			 currentApplet.change(Color.blue);


		 }

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

		System.out.println("paint() called");
	 }
 }


 
 