import com.opensymphony.xwork2.ActionSupport;


public class login extends ActionSupport{		
	private static final String GREETING="Hello";
String user,pass;
private String customGreeting;

public String getUser() {
	return user;
}

public void setUser(String user) {
	this.user = user;
}

public String getPass() {
	return pass;
}

public String getCustomGreeting() {
	return customGreeting;
}

public void setCustomGreeting(String customGreeting) {
	this.customGreeting = customGreeting;
}

public static String getGreeting() {
	return GREETING;
}

public void setPass(String pass) {
	this.pass = pass;
}
public String  execute()
{
	setCustomGreeting(GREETING+""+getUser());
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
