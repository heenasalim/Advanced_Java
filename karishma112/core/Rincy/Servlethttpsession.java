package ServletApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlethttpsession")
public class Servlethttpsession extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Servlethttpsession() 
    {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session= request.getSession();
		String name= request.getParameter("item");
		String value=request.getParameter("value");
		String remove= request.getParameter("remove");
		if(remove!=null && remove.equals("on"))
		{
			session.removeAttribute(name);
		}
		else
		{
			if(name!=null && name.length()>0 && (value != null && value.length()>0))
			{
				session.setAttribute(name,  value);
			}
		}
		response.setContentType("text/html");
		
		PrintWriter out= response.getWriter();
//		String user= request.getParameter("user");
//		System.out.println(user);
//		HttpSession session= request.getSession(true);
		//session.setAttribute("user", user);
		out.print("<html>");
		out.print("<body>");
		//String url= "/session/servlet/attributes";
		
		out.print("<form action ='Servlethttpsession' method=\"Get\">");
		out.print("item<input type='Name' name='item'>");
		out.print("value<input type='value' name= 'value'><br>");
		out.print("<input type= 'checkbox' name='remove'> Remove");
		out.print("<input type='submit'   name='Update' value= 'Update'>");
		//out.print("<h3>"+value+"</h3>");
		out.print("</form>");
		Enumeration e= session.getAttributeNames();
		while(e.hasMoreElements())
		{
			String s_item= (String) e.nextElement();
			String s_value= (String) session.getAttribute(s_item);
			out.println("<b>item</b>");
			out.println(s_item);
			out.println("<b>value</b>");
			out.println(s_value);
		
		}
		out.print("</body>");
		out.print("</html>");
		out.close();
	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

}
