

	
import com.opensymphony.xwork2.ActionSupport;


public class login1 extends ActionSupport{		
		
	String user,pass;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	public String  execute()
	{
		if(user.equals("admin")&&pass.equals("123"))
		{
		return SUCCESS;
		}
		else
		{
			return ERROR;
		}
		
	}

	}

