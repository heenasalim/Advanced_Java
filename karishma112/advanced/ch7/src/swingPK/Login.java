package swingPK;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login implements ActionListener {
   
	JFrame f;
	JPanel p;
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2,b3;
	Login()
	{
		f=new JFrame("LOGIN");
		p=new JPanel();
		l1=new JLabel("UserName");
		l2=new JLabel("PassWord");
		t1=new JTextField(20);
		t2=new JTextField(20);
		b1=new JButton("Submit");
		b2=new JButton("Clear");
		b3=new JButton("Cancel");
		f.add(p);
		p.add(l1);
		
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		f.setVisible(true);
		f.setSize(400,400);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login l=new Login();

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if(e.getSource()==b1)
		{
			String user=t1.getText();
			String pwd=t2.getText();
			if(user.equals("admin")&&pwd.equals("admin"))
			{
				JOptionPane.showMessageDialog(b1,"Submitted");
			}
			else
			{
				JOptionPane.showMessageDialog(b1,"Please,enter correct password and Username");
			}
			
		}
		else if(e.getSource()==b2)
		{
			JOptionPane.showMessageDialog(b2,"Cleared");
			t1.setText("");
			t2.setText("");
		}
		else if(e.getSource()==b3)
		{
		System.exit(0);
		}
	}

}