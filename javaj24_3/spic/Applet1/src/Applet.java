import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;

 
public class Applet   extends  JApplet {
	  Font  f;
	  @Override
	  public  void  init()
	  {
		  super.init();
		  String type=getParameter("font");
		//  int  size=Integer.parseInt(getParameter("size"));
		  f=new Font(type,Font.BOLD,70);
  }
  @Override
	public  void  paint(Graphics  g)
	{
	super.paint(g);	
	g.setFont(f);
	g.drawString("SEED", 100,100);
	}
}

