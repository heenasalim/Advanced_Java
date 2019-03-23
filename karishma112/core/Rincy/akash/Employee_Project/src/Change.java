import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.sql.*;
public class Change extends JFrame implements ActionListener{
	
	JLabel l0,l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2,b3;
	Connection con;
	Statement st;
	ResultSet rs;
	
	public Change()
	{
		Panel p=new Panel();
		p.setLayout(null);
		l0=new JLabel("Change Password");
		l0.setFont(new Font("Comic Sans MS",Font.BOLD,23));
		l0.setForeground(Color.BLUE);
		Font f=new Font("Arial",Font.BOLD,13);
		l1=new JLabel("Enter username");
		l1.setFont(f);
		l2=new JLabel("Enter old password");
		l2.setFont(f);
		l3=new JLabel("Enter new password");
		l3.setFont(f);
		l4=new JLabel("Conform new password");
		l4.setFont(f);
		
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t4=new JTextField(10);
		
		b1=new JButton("Change ");
		b2=new JButton("Reset");
		b3=new JButton("Cancel");
		
		l0.setBounds(40,10,205,40);
		l1.setBounds(10,80,190,20);
		l2.setBounds(10,110,190,20);
		l3.setBounds(10,140,190,20);
		l4.setBounds(10,170,190,20);
		
		t1.setBounds(170,80,90,20);
		t2.setBounds(170,110,90,20);
		t3.setBounds(170,140,90,20);
		t4.setBounds(170,170,90,20);
		
		b1.setBounds(5,220,80,20);
		b2.setBounds(95,220,80,20);
		b3.setBounds(185,220,80,20);
		
		p.add(l0);
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		p.add(t1);
		p.add(t2);
		p.add(t3);
		p.add(t4);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		add(p);
		p.setBackground(Color.LIGHT_GRAY);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setVisible(true);
		setSize(280,300);
		setTitle("Changing_Password");
		setLocation(400,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@oracle-server:1521:orcl","java","java");
			System.out.println("Connection!");
			st=con.createStatement();
			
		}catch(Exception e){e.printStackTrace();}
	}
	
	public static void main(String[] args) {
		
		Change c=new Change();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)
		{
			boolean flag=true;
			boolean flag2=true;
			String sun="",sps="",scps="",sops="";
			sun=t1.getText();
			sops=t2.getText();
			sps=t3.getText();
			scps=t4.getText();
			
			try{
				rs=st.executeQuery("select * from logak where un='"+sun+"' ");
				while(rs.next())
				{
					flag=false;
				}
				rs=st.executeQuery("select pass from logak where un='"+sun+"' ");
				while(rs.next())
				{
					String temp=rs.getString(1);
					
					if(temp.equals(sops)==false)
							{
								flag2=false;
							}
				}
				
			}catch(Exception e1){e1.printStackTrace();}
			
			if(sun.equals("") && sops.equals("") && sps.equals("") && scps.equals(""))
			{
				JOptionPane.showMessageDialog(this, "Please fill all fields", "Change Password", JOptionPane.WARNING_MESSAGE);
			}
			
			else if(sun.equals(""))
			{
				JOptionPane.showMessageDialog(this, "Please enter username", "Change Password", JOptionPane.WARNING_MESSAGE);
			}
			
			else if(sops.equals(""))
			{
				JOptionPane.showMessageDialog(this, "Please enter old password", "Change Password", JOptionPane.WARNING_MESSAGE);
			}
			
			else if(sps.equals(""))
			{
				JOptionPane.showMessageDialog(this, "Please enter new password", "Change Password", JOptionPane.WARNING_MESSAGE);
			}
			
			else if(scps.equals(""))
			{
				JOptionPane.showMessageDialog(this, "Please enter conform password", "Change Password", JOptionPane.WARNING_MESSAGE);
			}
			
			else if(sps.equals(scps)==false)
			{
				JOptionPane.showMessageDialog(this, "New password and conform password does not matched", "Change Password", JOptionPane.ERROR_MESSAGE);
				t4.setText("");
			}
			
			else if(flag==true)
			{
				JOptionPane.showMessageDialog(this, "Username not found", "Change Password", JOptionPane.WARNING_MESSAGE);
			}
			
			else if(flag2==false)
			{
				JOptionPane.showMessageDialog(this, "Password  not matched", "Change Password", JOptionPane.WARNING_MESSAGE);
			}
			
			else
			{
				try{
					int i=st.executeUpdate("update logak set pass='"+sps+"' where un='"+sun+"' ");
				}catch(Exception e3){e3.printStackTrace();}
				
				JOptionPane.showMessageDialog(this, "Password changed succesfully...", "Change Password", JOptionPane.INFORMATION_MESSAGE);
			}
			
			
		}
		
		else if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
		}
		
		else if(e.getSource()==b3)
		{
//			try
//			{
//				con.close();
//				st.close();
//				rs.close();
//			}catch(Exception e5){e5.printStackTrace();}
			dispose();
			new Login();
		}
		
	}

}
