import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Preparestatement1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("got  driver");
	Connection  con=DriverManager.getConnection("jdbc:oracle:thin:@oracle-server:1521:orcl","java","java");
	System.out.println("got   connection+");
	PreparedStatement  psmt=con.prepareStatement("Update heena   set  esal=?   where eid=?");
	psmt.setInt(1, 40000);
	psmt.setInt(2, 1);
	 int i=psmt.executeUpdate();
	System.out.println(i);
	System.out.println("done");
	con.prepareStatement("select  *from  heena");
	System.out.println("printing  using  psmt  statement");
	psmt=con.prepareStatement("select  *from  heena");
	  ResultSet rs=psmt.executeQuery();
	  
	   while(rs.next())
	   {
		   System.out.println(rs.getInt(1));
		   System.out.println(rs.getString(2));
		   System.out.println(rs.getInt(3));
	   }
	
}
}