package pk1;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.util.*;

public class JspTaglibDemo extends TagSupport
{
	public int doStartTag() 
	{
		try{
		String date1 =new Date().toString();

		JspWriter out=pageContext.getOut();
		out.println("Today is :"+date1);
		System.out.println("Today is :"+date1);


		}
		catch(Exception e){
		}
//	return EVAL_BODY_INCLUDE;
		
		
	return SKIP_BODY;
	}
	public int doEndTag()
	{
		try{
		String date1 =new Date().toString();

		JspWriter out=pageContext.getOut();
		out.println("Today is :"+date1);
		System.out.println("Today is :"+date1);
		}
		catch(Exception e){
		}

//		return EVAL_PAGE;
		return SKIP_PAGE;
	}
}