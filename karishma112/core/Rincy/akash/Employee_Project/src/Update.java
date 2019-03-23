import java.awt.*;
import java.sql.*;
import java.awt.event.*;

import javax.swing.*;
public class Update extends JFrame implements ActionListener{
	
	JLabel l0,l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3,b4,b5,b6;
	Connection con;
	Statement st;
	ResultSet rs;
	boolean cph=true,cbs=true,cnm=true;;
	
	public Update()
	{
		Panel p=new Panel();
		p.setLayout(null);
		l0=new JLabel("Update_Employee");
		l0.setFont(new Font("Comic Sans MS",Font.BOLD,23));
		l0.setForeground(Color.BLUE);
		Font f=new Font("Arial",Font.BOLD,13);
		l1=new JLabel("ID");
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
		b2=new JButton("Clear");
		b3=new JButton("Cancel");
		b4=new JButton("Save");
		b5=new JButton("Clear");
		b6=new JButton("Cancel");
		
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
		
		b1.setBounds(5,250,80,20);
		b2.setBounds(95,250,80,20);
		b3.setBounds(185,250,80,20);
		b4.setBounds(5,250,80,20);
		b5.setBounds(95,250,80,20);
		b6.setBounds(185,250,80,20);
		
		b4.setVisible(false);
		b5.setVisible(false);
		b6.setVisible(false);
		
		t2.setEditable(false);
		t3.setEditable(false);
		t4.setEditable(false);
		t5.setEditable(false);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
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
		p.add(b5);
		p.add(b6);
		add(p);
		p.setBackground(Color.LIGHT_GRAY);
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@oracle-server:1521:orcl","java","java");
			System.out.println("Connection!");
			st=con.createStatement();
			
		}catch(Exception e){e.printStackTrace();}
		
		setVisible(true);
		setSize(280,320);
		setTitle("Employee's_Updation");
		setLocation(400,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b3)
		{
			dispose();
			setVisible(false);
			new homepage();
		}
		
		if(e.getSource()==b2)
		{
			t1.setText("");
		}
		
		if(e.getSource()==b5)
		{
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
		}
		
		if(e.getSource()==b1)
		{
			boolean cltr=true;
			String sid=null,snm=null,sadrs=null,sph=null,ssal=null;
			sid=t1.getText();
			
			for(int i=0;i<sid.length();i++)
			{
				Character c=sid.charAt(i);
				if(Character.isLetter(c))
					cltr=false;
			}
			
			if(sid.equals(""))
			{
				JOptionPane.showMessageDialog(this, "Please enter employee_id for search", "Update Employee", JOptionPane.WARNING_MESSAGE);
			}
			else if(cltr==false)
			{
				JOptionPane.showMessageDialog(this, "Please enter e_id in number format only...", "Update Employee", JOptionPane.WARNING_MESSAGE);
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
					l1.setText("e_id");
					t2.setText(snm);
					t3.setText(sadrs);
					t4.setText(sph);
					t5.setText(ssal);
				
					t1.setEditable(false);
					t2.setEditable(true);
					t3.setEditable(true);
					t4.setEditable(true);
					t5.setEditable(true);
					
					b1.setVisible(false);
					b4.setVisible(true);
					b2.setVisible(false);
					b5.setVisible(true);
					b3.setVisible(false);
					b6.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(this, "Employee not found", "Update Employee", JOptionPane.ERROR_MESSAGE);
				}
				
			}catch(Exception e1){e1.printStackTrace();}
			}
			
			
			
			
		}
		
		if(e.getSource()==b4)
		{
			cph=true;
			cbs=true;
			String sid,snm,sadrs,sph,ssal;
			sid=t1.getText();
			snm=t2.getText();
			sadrs=t3.getText();
			sph=t4.getText();
			ssal=t5.getText();
			cnm=true;
			
			for(int i=0;i<snm.length();i++)
			{
				Character c=snm.charAt(i);
				if(!(Character.isLetter(c)))
				{
					cnm=false;
				}
			}
			
			for(int i=0;i<sph.length();i++)
			{
				Character c=sph.charAt(i);
				if(!(Character.isDigit(c)))
					cph=false;
			}
			for(int i=0;i<ssal.length();i++)
			{
				Character c=ssal.charAt(i);
				if(!(Character.isDigit(c)))
					cbs=false;
			}
			
			if(snm.equals("") && sadrs.equals("") && sph.equals("") && ssal.equals(""))
			{
				JOptionPane.showMessageDialog(this, "Please fill all fields", "Update Employee", JOptionPane.WARNING_MESSAGE);
			}
			
			else if(snm.equals(""))
			{
				JOptionPane.showMessageDialog(this, "Please enter employee name", "Update Employee", JOptionPane.WARNING_MESSAGE);
			}
			
			else if(sadrs.equals(""))
			{
				JOptionPane.showMessageDialog(this, "Please enter employee adress", "Update Employee", JOptionPane.WARNING_MESSAGE);
			}
			else if(sph.equals(""))
			{
				JOptionPane.showMessageDialog(this, "Please enter employee phone", "Update Employee", JOptionPane.WARNING_MESSAGE);
			}
			else if(ssal.equals(""))
			{
				JOptionPane.showMessageDialog(this, "Please enter employee basic salary", "Update Employee", JOptionPane.WARNING_MESSAGE);
			}
			else if(sph.length()>10)
			{
				JOptionPane.showMessageDialog(this, "Mobile number is too large", "Update Employee", JOptionPane.WARNING_MESSAGE);
			}
			else if(sph.length()<10)
			{
				JOptionPane.showMessageDialog(this, "Mobile number is too small", "Update Employee", JOptionPane.WARNING_MESSAGE);
			}
			else if(cnm==false)
			{
				JOptionPane.showMessageDialog(this, "Please enter valid name", "Update Employee", JOptionPane.ERROR_MESSAGE);
			}
			
			else if(cph==false)
			{
				JOptionPane.showMessageDialog(this, "Please enter valid phone number", "Update Employee", JOptionPane.ERROR_MESSAGE);
			}
			else if(cbs==false)
			{
				JOptionPane.showMessageDialog(this, "Please enter salary in number format only", "Update Employee", JOptionPane.ERROR_MESSAGE);
			}
			
			
			else
			{
				String sql="update empak set ename='"+snm+"' , eadrs='"+sadrs+"' , eph='"+sph+"' , esal="+Integer.parseInt(ssal)+" where eid="+sid+" ";
				try {
					int i=st.executeUpdate(sql);
				} catch (Exception e1)  {
					e1.printStackTrace();
				} 
				//JOptionPane.showMessageDialog(this, "Employee added succesfully!!!", "Record Added", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(this,"Employee updated succesfully....");
				
				l1.setText("Enter e_id");			
				t1.setEditable(true);
				t2.setEditable(false);
				t3.setEditable(false);
				t4.setEditable(false);
				t5.setEditable(false);
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				
				b1.setVisible(true);
				b4.setVisible(false);
				b2.setVisible(true);
				b5.setVisible(false);
				b3.setVisible(true);
				b6.setVisible(false);
				
			}			
		}
		
		if(e.getSource()==b6)
		{
			l1.setText("Enter e_id");
			t1.setEditable(true);
			t2.setEditable(false);
			t3.setEditable(false);
			t4.setEditable(false);
			t5.setEditable(false);
			
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			
			b1.setVisible(true);
			b4.setVisible(false);
			b2.setVisible(true);
			b5.setVisible(false);
			b3.setVisible(true);
			b6.setVisible(false);
		}
		
	}

	public static void main(String[] args) {
		
		Update u=new Update();
	}
	
	

}
