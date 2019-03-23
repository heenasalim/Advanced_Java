package pk1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hidden2
 */
@WebServlet("/Hidden2")
public class Hidden2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Hidden2() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	String user=request.getParameter("user");
	out.print("Hello "+user);
	}

}
