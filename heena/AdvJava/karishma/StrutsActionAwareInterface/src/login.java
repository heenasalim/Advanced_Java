import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;


public class login extends ActionSupport{		
	Bean bean;

public Bean getBean() {
		return bean;
	}

	public void setBean(Bean bean) {
		this.bean = bean;
	}

	public void validate()
	{
		if(bean.getUser()==""&&bean.getPwd()=="")
		{
		addFieldError("bean.user","Should enter the UserName");
			
		}
		else
		{
			addFieldError("bean.pass","Should enter the password");
		}
	}
public String  Login()
{
	if(bean.user.equals("admin")&&bean.pwd.equals("123"))
	{
		
	return SUCCESS;
	}
	else
	{
		
	return ERROR;
	}
	
}
/*
public void intercept(ActionInvocation invocation) throws Exception
{
	System.out.println("Before in simpleInterceptor");
	invocation.invoke();
	System.out.println("After in simpleInterceptor");
}*/
}
