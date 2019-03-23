import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
public class LogRegister extends JFrame{
	
	Connection con;
	Statement st;
	ResultSet rs;
	JButton b;
	Object data[];
	JTable table;
	public LogRegister()throws Exception
	{
		setTitle("Login Report");
		Vector <Object> vColumns=new Vector<Object>();
		vColumns.add("Username");
		vColumns.add("Password");
		vColumns.add("Date");
		vColumns.add("Time of login");
		try
		{
			String sql="select * from logTime";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@oracle-server:1521:orcl","java","java");
			System.out.println("Connection!");
			st=con.createStatement(rs.TYPE_SCROLL_SENSITIVE,rs.CONCUR_UPDATABLE);
			rs=st.executeQuery(sql);
			rs.beforeFirst();
			Vector <Object> vdata=new Vector <Object>();
			while(rs.next())
			{
				Vector <Object> v=new Vector <Object>();
				int cnt=0;
				v.add(rs.getString(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));
				vdata.add(v);
				
			}
			JTable table=new JTable(vdata,vColumns);
			table.setBounds(10,10,500,500);
			table.setBackground(Color.LIGHT_GRAY);
			table.setForeground(Color.black);
			JScrollPane jsp=new JScrollPane(table);
			jsp.setBackground(Color.red);
			add(jsp);
		}catch(Exception e){e.printStackTrace();}
		this.setVisible(true);
		this.setSize(700,500);
		this.setLocation(250,150);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
				new homepage();
			}
		});
		
	}
	
	public static void main(String[] args) throws Exception {
		
		LogRegister  l=new LogRegister();
	}
}
