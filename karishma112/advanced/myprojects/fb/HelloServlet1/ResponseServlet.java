package HelloServlet1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseServlet
 */
@WebServlet("/ResponseServlet")
public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String user1,url1,driver1;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResponseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config)
	{
		try {
			super.init(config);
			driver1=config.getServletContext().getInitParameter("driver");
			System.out.println(driver1);
			url1=config.getServletContext().getInitParameter("url");
			System.out.println(url1);
			user1=config.getInitParameter("user1");
			System.out.println(user1);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	
		System.out.println("inside URLResponse");
	
		PrintWriter out=response.getWriter();
		//out.print("Click <a href="+response.encodeUrl(request.getRequestURL().toString())+">this link</a>");
		String user1=request.getParameter("user");
		String pwd1=request.getParameter("pwd");
		System.out.println(user1);
		System.out.println(pwd1);
		out.print("Welcome");
		
		
		try
		{
			Class.forName(driver1);
			out.print("Welcome Userssssssssssssss");
			System.out.println("Got Driver");
			Connection con=DriverManager.getConnection(url1,"java","java" );
			System.out.println("Got Connected");
			Statement stmt=con.createStatement();
			
			
			ResultSet rs=stmt.executeQuery("select username,password from login");
			int flag=0;
			while(rs.next())
			{
				System.out.println("inside while");
				if(user1.equals(rs.getString(1)) && pwd1.equals(rs.getString(2)))
				{
					System.out.println("Inside if");
					flag=1;
					out.print("<h1>welcome"+user1+"</h1>");
				
					out.print("<html>");
				out.print("<head>");
				
				out.print("</head>");

				out.print("<body>");
				out.print("<form action='Servlet2' method='get'>");
				out.print("<input type='submit' value='Click'>");
				out.print("<h2>Home</h2>");
				out.print("</form>");
				out.print("</body>");
				out.print("</html>");
				
				}
			}
				if(flag==0)
				{
					out.print("<h1>Wrong password</h1>");	
				}
			//RequestDispatcher res=request.getRequestDispatcher("Servlet2");
			//res.forward(request,response);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}




}
