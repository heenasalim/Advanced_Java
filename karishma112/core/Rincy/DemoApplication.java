import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class DemoApplication implements ActionListener{

	JFrame f;
    JPanel p;
    JTextField tf1;
    JPasswordField pf;
    JLabel l1,l2;
    JButton b1,b2,b3;
    
    public DemoApplication() {
		f=new JFrame("My Application");
		p=new JPanel();
		tf1=new JTextField(10);
		pf=new JPasswordField(10);
		l1=new JLabel("UserName:");
		l2=new JLabel("Password:");
		b1=new JButton("Submit");
		b2=new JButton("Clear");
		b3=new JButton("Cancel");
		p.add(l1);
		p.add(tf1);
		p.add(l2);
		p.add(pf);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		f.add(p);
		
		f.setResizable(false);
		f.setVisible(true);
		f.setSize(400,400);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		DemoApplication da=new DemoApplication();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1)
	{
		String user=tf1.getText();
		String pass=pf.getText();
		
		if(user.equals("seed")&& pass.equals("info"))
		JOptionPane.showMessageDialog(b1,"Submitted");
		else
			JOptionPane.showMessageDialog(b2,"Wrong un/pw");
	}
	
	if(e.getSource()==b2)
	{
		JOptionPane.showMessageDialog(b2,"Cleared");
		tf1.setText("");
		pf.setText("");
	}
	
	if(e.getSource()==b3)
	{
		JOptionPane.showMessageDialog(b3,"Cancelled");
	    System.exit(0);
	}
		
	}

}
