import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class heena {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection   con=null;
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("class  found");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","java","java");
	}

}
