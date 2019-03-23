
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class InternalFrame extends JFrame// implements ActionListener
{
	
	JDesktopPane jtp;
	InternalFrame()
	{
		JButton b1=new JButton("OK");
		jtp=new JDesktopPane();
		setContentPane(jtp);
		JInternalFrame jif=new JInternalFrame("Chield Frame",true,false,false,true);
		jif.reshape(20,20,100,100);
		jif.show();
		jif.getContentPane().add(b1);
		getContentPane().add(jif);
		
		setSize(400,400);
		setVisible(true);
	

	}

	public static void main(String a[])
	{
		new InternalFrame();
	}
}