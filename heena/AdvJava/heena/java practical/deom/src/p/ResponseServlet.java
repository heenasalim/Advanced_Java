package p;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(false);
		String name=(String)session.getAttribute("name");
		//String name=response.encodeURL("?name=prashant&password=deshpande");
		//String string=response.encodeURL("/ResponseServlet?name="+ name+ "&password="+password);
        //out.println("<body bgcolor=#CCCHH>"+" "+"Welcome"+" "+name+" "+"</body>");
	  	out.println("<body bgcolor=#CCCHH>"+" "+"Welcome"+" "+name+" "+"</body>");
	}

}
