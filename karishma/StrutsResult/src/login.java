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
			//addFieldError("bean.user",get);
			
		}
		else
		{
			//addFieldError("bean.pass","enter password");
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
public void execute(ActionInvocation invocation) throws Exception
{
	System.out.println("before interceptor");
	invocation.invoke();
	System.out.println("after interceptor");
	
}
}