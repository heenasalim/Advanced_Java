package test;

import com.opensymphony.xwork2.ActionSupport;


public class Login extends ActionSupport {
	
	//private String username;
	//private String password;
		
		private User user;
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
	
				

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
          