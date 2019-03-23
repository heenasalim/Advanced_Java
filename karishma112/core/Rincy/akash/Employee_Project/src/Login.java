import java.awt.Color;
import java.util.*;
import java.sql.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

import java.sql.*;
public class Login extends JFrame implements ActionListener,KeyListener{
	
	JPanel p;
	JLabel l0,l1,l2,li;
	JTextField t1;
	JPasswordField p1;
	JButton b1,b2,b3,b4;
	int cnt;
	long time;
	Connection con;
	Statement st;
	ResultSet rs;
	
	public Login()
	{
		cnt=0;
		p=new JPanel();
		p.setLayout(null);

		li=new JLabel(new ImageIcon("D:\\employe2.jpg"));
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		t1=new JTextField(10);
		p1=new JPasswordField(10);
		b1=new JButton("OK");
		b2=new JButton("RESET");
		b3=new JButton("CANCEL");
		b4=new JButton("CHANGE PASSWORD");
		
		l0=new JLabel("LOGIN FIRST");
		Font f=new Font("Segoe Script",Font.BOLD,20);
		l0.setFont(f);
		l0.setForeground(Color.RED);
		
		li.setBounds(160,50,90,90);
		l0.setBounds(60,15,190,30);
		l1.setBounds(10,60,70,20);
		l2.setBounds(10,90,70,20);
		t1.setBounds(80,60,70,20);
		p1.setBounds(80,90,70,20);
		b1.setBounds(10,150,60,20);
		b2.setBounds(80,150,80,20);
		b3.setBounds(170,150,80,20);
		b4.setBounds(30,185,200,20);
		
		b1.setToolTipText("login");
		b2.setToolTipText("clear text");
		b3.setToolTipText("exit");
		b4.setToolTipText("change password");
		
		p.add(li);
		p.add(l0);
		p.add(l1);
		p.add(l2);
		p.add(t1);
		p.add(p1);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		add(p);
		p.setBackground(Color.cyan);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b1.addKeyListener(this);
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@oracle-server:1521:orcl","java","java");
			System.out.println("Connection!");
			st=con.createStatement();
			
		}catch(Exception e){e.printStackTrace();}
		
		
		setVisible(true);
		setTitle("LOGIN");
		setSize(270,250);
		setLocation(400, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
	}
	
	public static void main(String []arg)
	{
		Login l=new Login();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b3)
		{
			System.exit(0);
		}
		
		if(e.getSource()==b2)
		{
			t1.setText("");
			p1.setText("");
		}
		
		if(e.getSource()==b1)
		{
			login();
		}
		
		if(e.getSource()==b4)
		{
			dispose();
			new Change();
		}
		
	}

	private void login() {
		
		Calendar cal=new GregorianCalendar();
		int h,m,s,ampm;
		String time="",day="";
		int flag=0,flag2=0;
		String cu=null;
		String cp=null;
		String ampm2=null;
		String un2=t1.getText();
		String pw=p1.getText();
		if(cnt!=3)
		{
			
			
			try {
				rs=st.executeQuery("select * from logak where un='"+un2+"'");
				while(rs.next())
				{
					cu=rs.getString(1);
					System.out.println(rs.getString(1));
					cp=rs.getString(2);
					System.out.println(rs.getString(2));
					
					if(un2.equals(cu) && pw.equals(cp))
					{
						flag=1;
						h=cal.get(Calendar.HOUR);
						m=cal.get(Calendar.MINUTE);
						s=cal.get(Calendar.SECOND);
						ampm=cal.get(Calendar.AM_PM);
						if(ampm==1)
							ampm2="PM";
						else
							ampm2="AM";
						
						day=""+cal.get(Calendar.DATE)+" / "+(cal.get(Calendar.MONTH)+1)+" / "+cal.get(Calendar.YEAR);
						time=""+h+":"+m+" "+ampm2;
						System.out.println(cu+" "+cp+" "+day+" "+time+" "+ampm2);
						int i=st.executeUpdate("insert into logTime values('"+cu+"' , '"+cp+"' ,'"+day+"' , '"+time+"')");
						JOptionPane.showMessageDialog(this,"Login successed");
						t1.setText("");
						p1.setText("");
						con.close();
						st.close();
						rs.close();
						this.dispose();
						this.setVisible(false);
						new homepage();
						break;}else {	flag=0;	}
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			if(flag==0)
			{
			
				JOptionPane.showMessageDialog(this,"Login failed");
				t1.setText("");
				p1.setText("");
				cnt++;
				if(cnt==3)
				{
					JOptionPane.showMessageDialog(this,"You failed to login so much times , please try later some time");
					System.exit(0);
				}
			}
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource()==b1)
		{
		
			if(e.getExtendedKeyCode()==e.VK_ENTER)
			{
				login();
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {

		
	}

}
