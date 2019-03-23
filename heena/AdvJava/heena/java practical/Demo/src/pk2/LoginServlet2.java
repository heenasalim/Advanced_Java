package pk2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet2
 */
@WebServlet("/LoginServlet2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		String url,driver;
		driver=config.getServletContext().getInitParameter("oracle.jdbc.driver.OracleDriver");
		url=config.getServletContext().getInitParameter("jdbc:oracle:thin:@oracle-server:1521:orcl");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
			PrintWriter out=response.getWriter();
			String s1=request.getParameter("username");
			String s2=request.getParameter("password");
			
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver loaded");
				Connection con =DriverManager.getConnection("jdbc:oracle:thin:@oracle-server:1521:orcl","java","java");
				System.out.println("Successfully connected");
				Statement stmt=con.createStatement();
				
				ResultSet rs=stmt.executeQuery("Select * from rd");
				while(rs.next()){ 
					if( rs.getString(1).equals(s1))
						if( rs.getString(2).equals(s2))
						out.println("<html><body>valid user</html></body>");
						else
							out.println("Invalid user");
					
					System.out.println("\n");
				}
				con.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
			RequestDispatcher rd=request.getRequestDispatcher("servcallo");
			rd.forward(request, response);
		
		}
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}*/

	


	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
