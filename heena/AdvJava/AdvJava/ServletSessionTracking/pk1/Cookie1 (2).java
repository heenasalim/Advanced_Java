package pk1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie1
 */
@WebServlet("/Cookie1")
public class Cookie1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookie1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String user=request.getParameter("user");
		System.out.println(user);
		Cookie c=new Cookie("user",user);
		response.addCookie(c);
		out.print("<html><body>");
		out.print("<form action='Cookie2'>");
		out.print("<img alt='abc' src='D://Tulips.jpg' width=200 height=200/>");
		out.print("<input type='submit' value='go'>");
	}

}
