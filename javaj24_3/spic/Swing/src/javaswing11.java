import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class javaswing11 implements ActionListener{
 
	 JFrame f;
	 JPanel  p;
	 JLabel l1;
	 ImageIcon ic;
	 JLabel  l2;
	 JLabel l3;
	 JLabel  l4;
	 JTextField  tf;
	 JComboBox cb;
	 JList   ls1;
	 JList  ls2;
	 JButton a;
	 JButton  b;
	 JButton  b1;
	 JButton  b2;
	 JButton  b3;
	   javaswing11()
	   {
		   f=new JFrame(" java  swing  Exercise1   radio  combolist  student  info");
		   p= new JPanel();
		  tf=new JTextField(56);
		 l1=new JLabel("NAME");
		 ic=new ImageIcon("C:/Users/Public/Pictures/Sample Pictures/Jellyfish.jpg");
		 l2=new JLabel(ic);
		 cb=new JComboBox();
		 l3=new JLabel("SUBJECT  OFFERED ");
		 l4=new JLabel("SUBJECT   SELECTED");
		 ls1=new JList();
		 a=new JButton(">>");
		 b=new JButton("<<");
		 a.addActionListener(this);
		 b.addActionListener(this);
		 ls2=new  JList();
	   b1= new JButton("rEGISTER");
	   b2=  new JButton("CANCEL");
	   b3=  new JButton("RESET ");
	  b1.addActionListener(this);
	  b2.addActionListener(this);
	  b3.addActionListener(this);
	  p.add(l1);
	  p.add(tf);
	  p.add(l2);
	  p.add(p);
	  p.add(b1);
	  p.add(b2);
	  p.add(b3);
	  
	  f.add(p);
	  f.setVisible(true);
	  f.setSize(400, 400);
	  
		   
	   }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	 
	 
	 
	 
}