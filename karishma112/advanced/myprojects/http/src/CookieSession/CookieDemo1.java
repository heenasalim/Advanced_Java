package CookieSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieDemo1
 */
@WebServlet("/CookieDemo1")
public class CookieDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		//out.print("Welcome");		
		String user1=request.getParameter("user");
		String pass1=request.getParameter("pwd");
		Cookie c=new Cookie("User1","user1");
		response.addCookie(c);
		Cookie c1=new Cookie("User2","user1");
		response.addCookie(c1);
		if(user1.equals("admin")&&pass1.equals("123"))
		{
			out.print("<html>");
			out.print("<head>");
			
			out.print("</head>");

			out.print("<body bgcolor='blue'>");
			out.print("<form action='CookieDemo2' method='post'>");
			out.print("<h1>welocome.........."+user1+"</h1>");
			out.print("<input type='submit' value='SentMail'>");
			out.print("</form>");
			out.print("</body>");
			out.print("</html>");
		}
		if(user1.equals("seed")&&pass1.equals("seed"))
		{
			out.print("<html>");
			out.print("<head>");
			
			out.print("</head>");

			out.print("<body bgcolor='blue'>");
			out.print("<form action='CookieDemo2' method='post'>");
			out.print("<h1>welocome.........."+user1+"</h1>");
			out.print("<input type='submit' value='Inbox'>");
			out.print("</form>");
			out.print("</body>");
			out.print("</html>");
		}
	}

}
