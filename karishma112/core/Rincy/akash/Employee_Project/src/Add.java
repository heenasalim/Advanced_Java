import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.sql.DriverManager;

import javax.swing.*;
public class Add extends JFrame implements ActionListener{
	
	JLabel l0,l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3;
	Connection con;
	Statement st;
	ResultSet rs;
	int auto_id;
	boolean cph=true,cbs=true,cnm=true;
	
	
	public Add()
	{		
		auto_id=1;
		Panel p=new Panel();
		p.setLayout(null);
		//setBackground(Color.white);
		l0=new JLabel("Register_Employee");
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
		
		b1=new JButton("Save");
		b2=new JButton("Clear");
		b3=new JButton("Cancel");
		
		l0.setBounds(30,10,210,40);
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
		add(p);
		p.setBackground(Color.LIGHT_GRAY);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		t1.setEditable(false);
		b1.setToolTipText("save data");
		b2.setToolTipText("clear data");
		b3.setToolTipText("back to homepage");
		
		setVisible(true);
		setSize(280,320);
		setTitle("Employee's_Register");
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
		
		try{
			rs=st.executeQuery("select * from empak ");
			while(rs.next())
			{
				auto_id=auto_id+1;
			}
			
		}catch(Exception e){e.printStackTrace();}
		t1.setText(Integer.toString(auto_id));
	}
	
	public static void main(String[] args) {
		
		Add a=new Add();
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

			if(e.getSource()==b2)
			{
				clear();
			}
			
			if(e.getSource()==b3)
			{
				try {
					con.close();
					st.close();
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				dispose();
				setVisible(false);
				new homepage();
			}
			
			if(e.getSource()==b1)
			{
				add();
			}
		
	}
	
	private void clear() {

		auto_id=1;
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
		try{
			rs=st.executeQuery("select * from empak ");
			while(rs.next())
			{
				auto_id=auto_id+1;
			}
			
		}catch(Exception e1){e1.printStackTrace();}
		t1.setText(Integer.toString(auto_id));
	
		
	}

	public void add()
	{
		cnm=true;
		cph=true;
		cbs=true;
		String sid,snm,sadrs,sph,ssal;
		sid=t1.getText();
		snm=t2.getText();
		sadrs=t3.getText();
		sph=t4.getText();
		ssal=t5.getText();
		
		for(int i=0;i<snm.length();i++)
		{
			Character c=snm.charAt(i);
			if(!(Character.isLetter(c)))
				cnm=false;
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
			JOptionPane.showMessageDialog(this, "Please fill all fields", "Add Employee", JOptionPane.WARNING_MESSAGE);
		}
		
		else if(snm.equals(""))
		{
			JOptionPane.showMessageDialog(this, "Please enter employee name", "Add Employee", JOptionPane.WARNING_MESSAGE);
		}
		
		else if(sadrs.equals(""))
		{
			JOptionPane.showMessageDialog(this, "Please enter employee adress", "Add Employee", JOptionPane.WARNING_MESSAGE);
		}
		else if(sph.equals(""))
		{
			JOptionPane.showMessageDialog(this, "Please enter employee phone", "Add Employee", JOptionPane.WARNING_MESSAGE);
		}
		else if(ssal.equals(""))
		{
			JOptionPane.showMessageDialog(this, "Please enter employee basic salary", "Add Employee", JOptionPane.WARNING_MESSAGE);
		}
		else if(sph.length()>10)
		{
			JOptionPane.showMessageDialog(this, "Mobile number is too large", "Add Employee", JOptionPane.WARNING_MESSAGE);
		}
		else if(sph.length()<10)
		{
			JOptionPane.showMessageDialog(this, "Mobile number is too small", "Add Employee", JOptionPane.WARNING_MESSAGE);
		}
		else if(cnm==false)
		{
			JOptionPane.showMessageDialog(this, "Please enter valid name", "Add Employee", JOptionPane.ERROR_MESSAGE);
		}
		
		else if(cph==false)
		{
			JOptionPane.showMessageDialog(this, "Please enter valid phone number", "Add Employee", JOptionPane.ERROR_MESSAGE);
		}
		else if(cbs==false)
		{
			JOptionPane.showMessageDialog(this, "Please enter salary in number format only", "Add Employee", JOptionPane.ERROR_MESSAGE);
		}
		
		
		else
		{
			String sql="insert into empak values("+Integer.parseInt(sid)+" , '"+snm+"' , '"+sadrs+"' , "+sph+" , "+ssal+")";
			try {
				int i=st.executeUpdate(sql);
			} catch (Exception e1)  {
				e1.printStackTrace();
			} 
			JOptionPane.showMessageDialog(this, "Employee added succesfully!!!", "Record Added", JOptionPane.INFORMATION_MESSAGE);
			clear();
		}
		
	
	}

}
