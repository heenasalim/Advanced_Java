package HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AttributeServlet
 */
@WebServlet("/AttributeServlet")
public class AttributeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession(true);
		String name1=request.getParameter("user");
		String value=request.getParameter("pwd");
		if(name1!=null && name1.length()>0 &&value!=null&&value.length()>0)
		{
		session.setAttribute(name1,value);
	
		
		
		}
		
		response.setContentType("text/html");
		
		out.print("<html>");
		out.print("<head>");
		
		out.print("</head>");
		out.print("<title>SESSION ATTRIBUTE</title>");
	
		
//		out.print("<body bgcolor='blue'>");
		//String url="/session/sevlet/attributes";
		out.print("<form action='AttributeServlet'method='post'>");
		out.print("Name<input type='text' name='nm' id='nm'><br>");
		
		out.print("Value<input type='text' name='val' id='val'><br>");
		out.print("<input type='submit' value='Update'>");
		out.print("</form>");
		out.print(name1);
		out.print(value);
		
		String s=(String) session.getAttribute(name1);
		String s1=(String) session.getAttribute(value);
		out.print(name1);
		out.print(value);
		/*
		Enumeration e1=session.getAttribute();
		while(e1.hasMoreElements())
		{
			String att_name=(String) e1.nextElement();
			String att_val=(String) e1.nextElement();
			out.print("<b>Name:</b>");
			out.print(att_name);
			out.print("<b>Value:</b>");
			out.print(att_val);
			
		}*/
		out.print("</body>");
		out.print("</html>");
	}

}
