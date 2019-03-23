package pk1;
import java.awt.event.ActionEvent;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionEvent {
	public HelloWorld(Object source, int id, String command) {
		super(source, id, command);
		// TODO Auto-generated constructor stub
	}
	static final String GREETING="Hello";
	String name;
	String customGreeting;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomGreeting(String customGreeting)
	{
		this.customGreeting = customGreeting;
	}
	public void setCustomGreeting(String customGreeting) {
		this.customGreeting = customGreeting;
	}
	public static String getGreeting() {
		return GREETING;
	} public String execute()
	{
		setCustomGreeting(GREETING+" "+getName());
		if(name.equals("riya"))
		{
			return "success";
			
		}
		else
		{
			return "error";
		}
	}
	

}
