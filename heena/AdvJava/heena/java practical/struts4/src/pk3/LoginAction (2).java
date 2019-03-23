package pk3;


import java.util.Map;

import org.apache.catalina.Session;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	
	User user ;
	
	Map map;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String login()
	{
		System.out.println("in execute");
		if(user.getUsername().equals("seed") && user.getPassword().equals("infotech"))
		{
			map.put("user", "seed");
			return "success";
		}
		else return "error";
	}

	@Override
	public void setSession(Map m) {
		// TODO Auto-generated method stub
		map = m;
		
	}
	
	public String logout()
	{
		System.out.println("The user is " + map.get("user"));
		map.remove("user");
		System.out.println("The user is " + map.get("user"));
		addActionError("Sucessfully Loged out..........");
		return SUCCESS;
		
	}

}