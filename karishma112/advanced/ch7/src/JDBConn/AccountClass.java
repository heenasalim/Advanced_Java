package JDBConn;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountClass {
	Connection con;
	String s;

	public AccountClass() throws SQLException {
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Got Driver");
			 con=DriverManager.getConnection("jdbc:oracle:thin:@oracle-server:1521:orcl","java","java" );
			System.out.println("Got Connected");
			
			con.setAutoCommit(false);
			PreparedStatement ps=con.prepareStatement("select balance from account where accno=?");
			ps.setInt(1,1);
			ResultSet rs=ps.executeQuery();
			rs.next();
			int bal1=rs.getInt(1);
			System.out.println("balance before Transaction");
			System.out.println(bal1);
			
			ps=con.prepareStatement("select balance from account where accno=?");
			ps.setInt(1,2);
			 rs=ps.executeQuery();
			rs.next();
			int bal2=rs.getInt(1);
			System.out.println(bal2);
			
			
			ps=con.prepareStatement("update account set balance=? where accno=?");
			ps.setInt(1,(bal1-500));
			ps.setInt(2,1);
			 rs=ps.executeQuery();
			System.out.println("****Updated***");
			
			
			
			s=null;
			System.out.println(s.length());
			
			ps=con.prepareStatement("update account set balance=? where accno=?");
			ps.setInt(1,(bal2+500));
			ps.setInt(2,2);
			rs=ps.executeQuery();
			System.out.println("****Updated***");
			con.commit();
			
			
			}
			catch (Exception e) {
			
			con.rollback();
				e.printStackTrace();
			}
	}

	
	public static void main(String[] args) throws SQLException {
		AccountClass a=new AccountClass();
	}

}
