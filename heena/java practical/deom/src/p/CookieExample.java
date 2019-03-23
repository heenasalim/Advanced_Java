package p;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieExample extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
     	  Cookie firstName = new Cookie("name",request.getParameter("cookiename"));
          Cookie lastName = new Cookie("password",request.getParameter("cookievalue"));

  // Set expiry date after 24 Hrs for both the cookies.
  firstName.setMaxAge(60*60*24); 
  lastName.setMaxAge(60*60*24); 

  // Add both the cookies in the response header.
  response.addCookie( firstName );
  response.addCookie( lastName );

  // Set response content type
  response.setContentType("text/html");

  PrintWriter out = response.getWriter();
  String title = "Setting Cookies Example";
  String docType =
  "<!doctype html public \"-//w3c//dtd html 4.0 " +
  "transitional//en\">\n";
  out.println(docType +
            "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor=\"#f0f0f0\">\n" +
            "<h1 align=\"center\">" + title + "</h1>\n" +
            "<ul>\n" +
            "  <li><b>First Name</b>: "
            + request.getParameter("cookiename") + "\n" +
            "  <li><b>Last Name</b>: "
            + request.getParameter("cookievalue") + "\n" +
            "</ul>\n" +
            "</body></html>");
  /**/
  Cookie cookie = null;
  Cookie[] cookies = null;
  // Get an array of Cookies associated with this domain
  cookies = request.getCookies();
  
  // Set response content type
  response.setContentType("text/html");

   out = response.getWriter();
   title = "Reading Cookies Example";
   docType =
  "<!doctype html public \"-//w3c//dtd html 4.0 " +
  "transitional//en\">\n";
  out.println(docType +
            "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor=\"#f0f0f0\">\n" );
  if( cookies != null ){
     out.println("<h2> Found Cookies Name and Value</h2>");
     for (int i = 0; i < cookies.length; i++){
        cookie = cookies[i];
        out.print("Name : " + cookie.getName( ) + ",  ");
        out.print("Value: " + cookie.getValue( )+" <br/>");
     }
  }else{
      out.println(
        "<h2>No cookies founds</h2>");
  }
  out.println("</body>");
  out.println("</html>");

    }
}