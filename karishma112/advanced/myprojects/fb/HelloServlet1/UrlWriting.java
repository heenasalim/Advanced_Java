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
 * Servlet implementation class UrlWriting
 */
@WebServlet("/UrlWriting")
public class UrlWriting extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String user1,url1,driver1;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UrlWriting() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	
		System.out.println("inside URLRewriting");
	
		PrintWriter out=response.getWriter();
		
		//String user1=request.getParameter("user");
		//String pwd1=request.getParameter("pwd");
		//System.out.println(user1);
		//System.out.println(pwd1);
		
		out.print("Welcome");
		//String url2=response.encodeURL(request.getRequestURL().toString());
		//out.print(url2);
		
				out.print("<html>");
				out.print("<head>");
				
				out.print("</head>");

				out.print("<body>");
				out.print("<form action='ResponseServlet' method='get'>");
				out.print("Click <a href='ResponseServlet'> this link</a>");
				//out.print("Click <a href="+response.encodeUrl(request.getRequestURL().toString())+">this link</a>");
				//out.print("<h2>Home</h2>");
				out.print("</form>");
				out.print("</body>");
				out.print("</html>");
				
				}
			
	}




