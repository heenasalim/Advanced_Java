import  java.applet.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;   //  we  cannot  run  communications/  web  application  by  eclipse    run  it  by  cmd  only  
import java.awt.event.ActionListener;
public class Changer  extends  Applet  implements  ActionListener {
		
	Button  red,green ,blue;
	public void  init()
	{
		System.out.println("init()  called");
		  red=new  Button("red");
		  green=new  Button("green");
		  blue=new  Button("blue");
		  add(red);
		  add(green);
		  add(blue);
		  red.addActionListener(this);
		  green.addActionListener(this);
		  blue.addActionListener(this);
	}
	
 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		  AppletContext  ctx=null;
		  if(e.getSource()==red)
		  {
			  System.out.println("change");
			  ctx=getAppletContext();
			  changing currentApplet1=(changing) ctx.getApplet("  '");   //  setting  current  applet  
			  currentApplet1.change(Color.red);
		  }
		  if(e.getSource()==green)
	
	{ System.out.println("change  green ");
		ctx=getAppletContext();
		changing  c=(changing)  ctx.getApplet("changing");
	}
		  if(e.getSource()==blue)
		  {
			  System.out.println("change");
			  ctx=getAppletContext();
			  changing currentApplet=(changing) ctx.getApplet("changing");
			  currentApplet.change(Color.blue);
		  }  
}
}