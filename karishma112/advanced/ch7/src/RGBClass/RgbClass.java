package RGBClass;

import javax.swing.JFrame;
import javax.swing.*;

public class RgbClass extends JFrame {
	JTextField t1,t2,t3;
	JLabel l1,l2,l3;
	JPanel p;
	JFrame f;

	public RgbClass() {
		t1=new JTextField (10);
		t2=new JTextField (10);
		t3=new JTextField (10);
		l1=new JLabel("R");
		l2=new JLabel("G");
		l3=new JLabel("B");
		p=new JPanel();
		f=new JFrame("RGB");
		f.add(p);
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(l3);
		
		p.add(t3);
		f.setVisible(true);
		f.setSize(300,300);
		
		
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RgbClass r=new RgbClass();

	}

}
