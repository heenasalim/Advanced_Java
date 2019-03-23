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
 * Servlet implementation class CookieDemo2
 */
@WebServlet("/CookieDemo2")
public class CookieDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<head>");
		
		out.print("</head>");
		out.print("<body bgcolor='pink'>");
		Cookie c1[]=request.getCookies();
		for(int j=0;j<c1.length;j++)
		{
			out.print("<h2>CookieName ="+c1[j].getName()+"</h2>");
			out.print("<h3>CookieValue ="+c1[j].getValue()+"</h3>");
			out.print("<h4>CookieMaxAge ="+c1[j].getMaxAge()+"</h4>");
			out.print("<h5>CookieDomainName ="+c1[j].getDomain()+"</h5>");
			out.print("<h6>CookieClassName ="+c1[j].getClass()+"</h6>");
			out.print("<h2>CookiePathName ="+c1[j].getPath()+"</h7>");
			out.print("<h2>CookieSecure ="+c1[j].getSecure()+"</h8>");
			out.print("<h9>CookieVersionName ="+c1[j].getVersion()+"</h9>");
			out.print("<h2>CookieComment="+c1[j].getComment()+"</h10>");
			
		}
		out.print("</body>");
		out.print("</html>");
	}

}
