import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Banking {
	
public static void main(String[] args) throws Exception {
	
Banking  b=new  Banking();
moneyTransfer(); 
}
private  static void  moneyTransfer()  throws Exception
{
	Connection  con=null;
	  try
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  System.out.println("got  driver");
		  con=DriverManager.getConnection("jdbc:oracle:thin:@oracle-server:1521:orcl","java","java");
		  System.out.println("got  connection");
		  
		  con.setAutoCommit(false);
		  PreparedStatement    psmt=con.prepareStatement("select  *from  Accountheena");
		  ResultSet rs=psmt.executeQuery();
		  
		 psmt=con.prepareStatement("select  bal from Accountheena where  accno=?");
		 psmt.setInt(1, 1);
		 rs=psmt.executeQuery();
		 rs.next();   //setting  pointer  to  the  first   row  of  resultset
		 int  bal1=rs.getInt(1);
		 System.out.println("balance  opf  account  number  1  is "+bal1);
		 
		 
		 psmt=con.prepareStatement("select  bal from  Accountheena   where accno=?");
		 psmt.setInt(1, 2);
		// rs=psmt.executeQuery();
		// rs.next();
		 int  bal2=rs.getInt(1);
		 System.out.println("balance  of   account  no  2   is"+bal2);
		 
//		  FileOutputStream  f=new FileOutputStream("D:/abc.txt");
//		  ObjectOutputStream o=new ObjectOutputStream(f);
//		  o.writeObject("");
//		  
		  psmt=con.prepareStatement("Update    Accountheena   set  bal =?  where  accno=?" );
		  psmt.setInt(1,( bal1-500));
		  psmt.setInt(2,1);
		   int  i=psmt.executeUpdate();
			System.out.println(i);
			System.out.println("done");
		  rs=psmt.executeQuery();//////////////////
		  
	      String s=null;    //  light  gayi
		  System.out.println(s.length());
		  
		  psmt= con.prepareStatement("Update Accountheena  set   bal=?  where  accno=?");
		  psmt.setInt(1, (bal2+500));
		  psmt.setInt(2, 2);
		  rs=psmt.executeQuery();///////////////
		   
		  System.out.println("updated");
		  con.commit();
		  
		  
		  
		  
		  
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
		 con.rollback();
	  }
}
}
