// In Object-Backed -> only we have to create reference of User
// This code automatically create User object & set username & set password 
package test;

import com.opensymphony.xwork2.ActionSupport;



public class Login extends ActionSupport {
	
	//private String username;
	//private String password;
	
	private User user;
	
	/*public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}*/
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute()
	{
		if((user.getUsername().equals("seed"))&&(user.getPassword().equals("infotech")))
		{
		return SUCCESS;	
			
		}		
		else
		{
			return ERROR;
			
		}
	}
	
	public void validate()
	{
		if(user.getUsername().equals(""))
		{
			addFieldError("user.username",getText("username.required"));
			
		}
		if(user.getPassword().equals(""))
		{
			addFieldError("user.password",getText("password.required"));
			
		}
	}
	
	
	

}
