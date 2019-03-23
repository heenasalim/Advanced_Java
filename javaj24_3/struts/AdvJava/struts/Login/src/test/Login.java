/* This class extends ActionSupport*/
/* Define validate method */

package test;

import com.opensymphony.xwork2.ActionSupport;



public class Login extends ActionSupport {
	
	private String username;
	private String password;
	
	public String getUsername() {
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
	}
	
	public String execute()
	{
		
		//String str=ERROR;
		
		if((username.equals("seed"))&&(password.equals("infotech")))
		{
		return SUCCESS;	
			
		}		
		else
		{
			return ERROR;
			
		}
	}
	
	
	
	
	

}
