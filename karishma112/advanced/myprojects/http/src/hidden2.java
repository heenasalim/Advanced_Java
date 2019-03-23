

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hidden2
 */
@WebServlet("/hidden2")
public class hidden2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String user2=request.getParameter("user");
		PrintWriter out=response.getWriter();
		
		out.print(user2);
		
		//out.print("<h3>welcome"+user2+"</h3>");
		out.print("<h1>welcome"+user2+"</h1>");
	}

}
