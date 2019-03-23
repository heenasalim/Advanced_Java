package p;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Import Java packages
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Enumeration;

public class AttributeServlet extends HttpServlet {

  protected void doGet(HttpServletRequest request, 
                       HttpServletResponse response) throws ServletException, 
                       IOException {

    HttpSession session = request.getSession();

    String name = request.getParameter("attrib_name");
    String value = request.getParameter("attrib_value");
    String remove = request.getParameter("attrib_remove");

    if (remove != null && remove.equals("on")) {
      session.removeAttribute(name);
    } else {
      if (name != null && name.length() > 0 && (value != null) 
              && value.length() > 0) {
        session.setAttribute(name, value);
      } 
    } 

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    out.println("<HTML>");
    out.println("<META HTTP-EQUIV=\"Pragma\" CONTENT=\"no-cache\">");
    out.println("<HEAD><TITLE>Session Attributes</TITLE></HEAD>");
    out.println("<BODY>");
    out.println("<H1>Session Attributes</H1>");

    out.println("Enter name and value of an attribute");

    String url = response.encodeURL("/sessionTracking/AttributeServlet");
    out.println("<FORM ACTION=\"" + url + "\" METHOD=\"GET\">");

    out.println("Name: ");
    out.println("<INPUT TYPE=\"text\" SIZE=\"10\" NAME=\"attrib_name\">");

    out.println("Value: ");
    out.println("<INPUT TYPE=\"text\" SIZE=\"10\" NAME=\"attrib_value\">");

    out
      .println("<BR><INPUT TYPE=\"checkbox\" NAME=\"attrib_remove\">Remove");
    out.println("<INPUT TYPE=\"submit\" NAME=\"update\" VALUE=\"Update\">");
    out.println("</FORM>");
    out.println("<HR>");
    out.println("Attributes in this Session");

    // Print all session attributes
    Enumeration e = session.getAttributeNames();
    while (e.hasMoreElements()) {
      String att_name = (String) e.nextElement();
      String att_value = (String) session.getAttribute(att_name);

      out.println("<BR><B>Name:</B> ");
      out.println(att_name);
      out.println("<B>Value: </B>");
      out.println(att_value);
    } 
    out.println("</BODY></HTML>");
    out.close();
  } 
}