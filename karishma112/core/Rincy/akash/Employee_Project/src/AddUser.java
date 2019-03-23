import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.sql.*;
public class AddUser extends JFrame implements ActionListener{
	
	JLabel l0,l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3;
	Connection con;
	Statement st;
	ResultSet rs;
	
	public AddUser()
	{
		JPanel p=new JPanel();
		p.setLayout(null);
		l0=new JLabel("Add_New_User");
		l0.setFont(new Font("Comic Sans MS",Font.BOLD,23));
		l0.setForeground(Color.BLUE);
		Font f=new Font("Arial",Font.BOLD,13);
		l1=new JLabel("Enter username");
		l1.setFont(f);
		l1.setForeground(Color.BLACK);
		l2=new JLabel("Enter password");
		l2.setFont(f);
		l2.setForeground(Color.BLACK);
		l3=new JLabel("Conform password");
		l3.setFont(f);
		l3.setForeground(Color.BLACK);
		
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		
		b1=new JButton("Add");
		b2=new JButton("Reset");
		b3=new JButton("Cancel");
		
		l0.setBounds(40,10,205,40);
		l1.setBounds(15,80,120,20);
		l2.setBounds(15,110,120,20);
		l3.setBounds(15,140,120,20);
		
		t1.setBounds(150,80,100,20);
		t2.setBounds(150,110,100,20);
		t3.setBounds(150,140,100,20);
		
		b1.setBounds(5,190,80,20);
		b2.setBounds(95,190,80,20);
		b3.setBounds(185,190,80,20);
		
		p.add(l0);
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(t1);
		p.add(t2);
		p.add(t3);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		add(p);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		p.setBackground(Color.GRAY);
		setVisible(true);
		setSize(280,260);
		setTitle("Adding New User");
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
	
		AddUser au=new AddUser();
	}

@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==b1)
	{
		
		boolean cp=true;
		String un="";
		String ps="";
		String cps="";
		un=t1.getText();
		ps=t2.getText();
		cps=t3.getText();
		String s = "";
		try{
		rs=st.executeQuery("select * from logak where pass='"+ps+"' ");
		while(rs.next())
		{
			s=rs.getString(2);
		}
		if(s.equals(ps))
			cp=false;
		
		}catch(Exception e1){e1.printStackTrace();}
		
		if(un.equals("") || ps.equals("") || cps.equals(""))
		{
			JOptionPane.showMessageDialog(this, "Please enter all fields", "Add User", JOptionPane.WARNING_MESSAGE);
		}
		
		else if(ps.equals(cps) == false)
		{
			JOptionPane.showMessageDialog(this, "The second password is not match", "Add User", JOptionPane.WARNING_MESSAGE);
			t3.setText("");
		}
		
		else if(cp==false)
		{
			JOptionPane.showMessageDialog(this, "The password is used by existing user please change it", "Add User", JOptionPane.WARNING_MESSAGE);
		}
		
		else
		{
			try {
				int i=st.executeUpdate("insert into logak values('"+un+"' , '"+ps+"')");
				JOptionPane.showMessageDialog(this, "New user added succesfully...", "Add User", JOptionPane.INFORMATION_MESSAGE);
			} catch (SQLException e1)  {
				e1.printStackTrace();
			}
		}
	}
	
	else if(e.getSource()==b2)
	{
		t1.setText("");
		t2.setText("");
		t3.setText("");
	}
	
	else if(e.getSource()==b3)
	{
		dispose();
		new homepage();
	}
	
}
}
