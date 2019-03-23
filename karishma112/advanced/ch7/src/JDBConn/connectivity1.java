package JDBConn;

import java.sql.*;
import java.sql.DriverManager;

public class connectivity1 {

	public connectivity1() {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Got Driver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@oracle-server:1521:orcl","java","java" );
			System.out.println("Got Connected");
			Statement stmt=con.createStatement();
			
			//ResultSet rs=stmt.executeQuery("insert into employee10 values(1,'karishma',20000)");
			ResultSet rs1=stmt.executeQuery("delete from employee10 where id=1");
			ResultSet rs2=stmt.executeQuery("insert into employee10 values(1,'karishma',20000)");
			ResultSet rs3=stmt.executeQuery("insert into employee10 values(3,'suraj',20000)");
			ResultSet rs4=stmt.executeQuery("update employee10 Set salary=40000 where id=3");
			
			ResultSet rs=stmt.executeQuery("select * from employee10");
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	public static void main(String[] args) {
		connectivity1 c=new connectivity1();
	}

}
