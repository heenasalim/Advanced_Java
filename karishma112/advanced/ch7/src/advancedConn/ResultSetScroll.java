package advancedConn;

import java.sql.Connection;
import java.sql.*;

public class ResultSetScroll {
	Connection con;
	public ResultSetScroll() {
		// TODO Auto-generated constructor stub
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Got Driver");
			 con=DriverManager.getConnection("jdbc:oracle:thin:@oracle-server:1521:orcl","java","java" );
			System.out.println("Got Connected");
			Statement st=con.createStatement();
			ResultSet rst=st.executeQuery("select eid,name from employee");
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ResultSetScroll rs=new  ResultSetScroll();

	}

}