
import javax.swing.*;
import java.awt.*;
class TabbedDemo extends JFrame
{
	TabbedDemo()
	{
		Button b1=new Button("Hello");
		Button b2=new Button("Hi");
		Button b3=new Button("Welcome");
		JTabbedPane tb=new JTabbedPane();
		tb.addTab("First",b1);
		tb.addTab("Second",b2);
		tb.addTab("Third",b3);
		getContentPane().add(tb);
		setSize(100,100);
		setVisible(true);

	}
	public static void main(String a[])
	{
		new TabbedDemo();
	}
}