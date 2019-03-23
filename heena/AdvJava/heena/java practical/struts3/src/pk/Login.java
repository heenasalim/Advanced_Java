package pk;


import com.opensymphony.xwork2.ActionSupport;


public class Login extends ActionSupport 
{
	private String username;
	private String password;
	
	public Login() 
	{
		super();
	}

	public Login(String username, String password) 
	{
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public String execute()
	{
		if (username.equals("seed")&&password.equals("info")) 
		{
			return "success";
		} 
		else 
		{
			return "error";
		}
	}	
	public void validate() 
	{
		if(username.equals(""))
		{
			addFieldError("username",getText("aa"));
		}
		if(password.equals(""))
		{
			addFieldError("password",getText("bb"));
		}
	}

	
}
	
	
	
	
	