import java.io.*;
import java.sql.*;
public class Blobimg {
public static void main (String[] args)
{
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");// Type 4 Driver
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@oracle-server:1521:orcl","java","java");
					  
			 System.out.println("Driver Loaded");
					 
			 System.out.println("Connection received");
			 
			 FileInputStream fis=new FileInputStream("D:\\Money.jpg");
			 PreparedStatement psmt=con.prepareStatement("Insert into shivani value(?,?,?)");
			 psmt.setInt(1,1);
			 psmt.setString(2,"abc");
			 psmt.setBinaryStream(3,fis,fis.available());
			 System.out.println(psmt.execute());
//			 FileOutputStream fos=new FileOutputStream("D://NewMoney.jpg");
//			 Statement smt=con.createStatement();
//			 ResultSet rs=smt.executeQuery("select photo from shivani");
//			 rs.next();
//			 InputStream is=rs.getBinaryStream(1);
//			 int i=0;
//			 while(i!=-1)
//			 {
//				 
//				 i=is.read();
//				 fos.write(i);
//			 }
			 System.out.println("done!!");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

	}


