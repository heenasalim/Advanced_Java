package pk1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login12 {
	
	String user,pass;
	int flag=0;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int check()
	{
	try 
	{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Found !!!!!!");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@oracle-server:1521:orcl","java","java");
		System.out.println("Connection Established !!!!!!");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from record");
		while(rs.next())
		{
		String s3,s4;
		s3=rs.getString(1);
		s4=rs.getString(2);
		if(user.equals(s3) && pass.equals(s4))
		{
			flag=1;
			break;
		}
		
		}
	} 
	catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(flag==1)
	{
			return 1;	
		
	}
	else
	{		
			return 0;
	}
}
	public Login() {
		// TODO Auto-generated constructor stub
	}

}
