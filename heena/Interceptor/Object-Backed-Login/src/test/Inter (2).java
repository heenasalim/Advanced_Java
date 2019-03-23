package test;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;


public class Inter implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Before in Simple");
		String result = arg0.invoke();
		System.out.println("After in Simple");
		return result;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	