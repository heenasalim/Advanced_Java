import java.awt.*;
import java.sql.*;
import java.awt.event.*;

import javax.swing.*;
public class Delete extends JFrame implements ActionListener{

	JLabel l0,l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3,b4;
	Connection con;
	Statement st;
	ResultSet rs;
	
	public Delete()
	{		
		Panel p=new Panel();
		p.setLayout(null);
		l0=new JLabel("Delete_Employee");
		l0.setFont(new Font("Comic Sans MS",Font.BOLD,23));
		l0.setForeground(Color.BLUE);
		Font f=new Font("Arial",Font.BOLD,13);
		l1=new JLabel("Enter ID");
		l1.setFont(f); 
		l2=new JLabel("Name");
		l2.setFont(f);
		l3=new JLabel("Address");
		l3.setFont(f);
		l4=new JLabel("Mobile");
		l4.setFont(f);
		l5=new JLabel("Basic_salary");
		l5.setFont(f);
		
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t4=new JTextField(10);
		t5=new JTextField(10);
		
		b1=new JButton("Search");
		b2=new JButton("Reset");
		b3=new JButton("Cancel");
		b4=new JButton("Delete");
		b4.setVisible(false);
		
		l0.setBounds(40,10,205,40);
		l1.setBounds(15,80,90,20);
		l2.setBounds(15,110,90,20);
		l3.setBounds(15,140,90,20);
		l4.setBounds(15,170,90,20);
		l5.setBounds(15,200,90,20);
		
		t1.setBounds(120,80,130,20);
		t2.setBounds(120,110,130,20);
		t3.setBounds(120,140,130,20);
		t4.setBounds(120,170,130,20);
		t5.setBounds(120,200,130,20);
		
		t2.setEditable(false);
		t3.setEditable(false);
		t4.setEditable(false);
		t5.setEditable(false);
		
		b1.setBounds(5,250,80,20);
		b2.setBounds(95,250,80,20);
		b3.setBounds(185,250,80,20);
		b4.setBounds(5,250,80,20);
		
		p.add(l0);
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		p.add(l5);
		p.add(t1);
		p.add(t2);
		p.add(t3);
		p.add(t4);
		p.add(t5);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		add(p);
		p.setBackground(Color.LIGHT_GRAY);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		b1.setToolTipText("search employee");
		b2.setToolTipText("reset fields");
		b3.setToolTipText("back to homepage");
		b4.setToolTipText("delete employee");
		
		setVisible(true);
		setSize(280,320);
		setTitle("Employee_Deleteion");
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
	
	@Override
	public void actionPerformed(ActionEvent e) {
			
		if(e.getSource()==b1)
		{
			String sid=null,snm=null,sadrs=null,sph=null,ssal=null;
			sid=t1.getText();
			
			if(sid.equals(""))
			{
				JOptionPane.showMessageDialog(this, "Please enter employee_id for search", "Update Employee", JOptionPane.WARNING_MESSAGE);
			}
			else{
			String sql="select * from empak where eid="+sid+"";
			boolean csrch=false;
			try
			{
				rs=st.executeQuery(sql);
				while(rs.next())
				{
					sid=Integer.toString(rs.getInt(1));
					snm=rs.getString(2);
					sadrs=rs.getString(3);
					sph=rs.getString(4);
					ssal=Integer.toString(rs.getInt(5));
					csrch=true;
				}
				
				if(csrch==true)
				{
					l1.setText("ID");
					t2.setText(snm);
					t3.setText(sadrs);
					t4.setText(sph);
					t5.setText(ssal);
					t1.setEditable(false);
					
					b1.setVisible(false);
					t1.setEditable(false);
					b4.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(this, "Employee not found", "Update Employee", JOptionPane.ERROR_MESSAGE);
				}
				
			}catch(Exception e1){e1.printStackTrace();}
			}
			
		}
		
		if(e.getSource()==b2)
		{
			b1.setVisible(true);
			t1.setEditable(true);
			b4.setVisible(false);
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			l1.setText("Enter ID");
		}
		
		if(e.getSource()==b3)
		{
			this.dispose();
			this.setVisible(false);
			new homepage();
		}
		
		if(e.getSource()==b4)
		{
			try
			{
				int i=st.executeUpdate("delete from empak where eid="+Integer.parseInt(t1.getText())+" ");
				b1.setVisible(true);
				t1.setEditable(true);
				b4.setVisible(false);
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				l1.setText("Enter ID");
				JOptionPane.showMessageDialog(this,"Employee deleted succesfully....");
			}catch(Exception e1){e1.printStackTrace();}
		}
		
	}
	
	public static void main(String[] args) {
		
		Delete d=new Delete();
	}
}
