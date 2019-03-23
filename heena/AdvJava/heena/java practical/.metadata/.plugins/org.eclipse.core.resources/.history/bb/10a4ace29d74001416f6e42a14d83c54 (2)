package pk11;

import java.awt.event.ActionEvent;

public class Login extends ActionEvent{
	private  String username;
	private  String password;

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public Login(Object source, int id, String command, String username,
		String password) {
	super(source, id, command);
	this.username = username;
	this.password = password;
}
public void setPassword(String password) {
	this.password = password;
}


	public String execute() throws Exception {
		
		System.out.println("in execute");
		if(username.equals("tiya")&&(password.equals("info")))
		{
		return "success";
		}
		else
		{
			return "error";
		}
			
		
	
		// TODO Auto-generated constructor stub
	}

}
