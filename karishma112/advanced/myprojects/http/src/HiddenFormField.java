

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiddenFormField
 */
@WebServlet("/HiddenFormField")
public class HiddenFormField extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HiddenFormField() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String user1=request.getParameter("user");
		String pass1=request.getParameter("pwd");
		//<input type="hidden" name="hiddenField" value="user">
		//String user1=request.getParameter("hiddenField");
		//out.print(user1);
		//out.print(pass1);
		
		
		if(user1.equals("admin") && pass1.equals("123"))
		{
			System.out.println("Inside if");
			//flag=1;
			//out.print("<h1>welcome"+user1+"</h1>");
		
			out.print("<html>");
		out.print("<head>");
		
		out.print("</head>");

		out.print("<body>");
		out.print("<form action='hidden2' method='post'>");
		out.print("<input type='hidden' name='user' value="+user1+">");
		out.print("<input type='submit' value='Click'>");
//		out.print("<h1>welcome"+user1+"</h1>");
//		out.print("movie Names");
//		out.print("<br><br>");
//		out.print("Dhoom1");
//		out.print("<br><br>");
//		out.print("Dhoom2");
//		out.print("<br><br>");
//		
		//out.print("<input type='submit' value='Click'>");
		//out.print("<h2>Home</h2>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
		
		}
	}

}
