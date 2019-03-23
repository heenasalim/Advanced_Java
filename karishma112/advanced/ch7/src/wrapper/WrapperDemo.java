package wrapper;

public class WrapperDemo {
	WrapperDemo()
	{
		System.out.println("*****before java5 autoboxing is*********");
	int i=20;
	Integer I=new Integer(i);
	
	System.out.println("integer i="+I);//primitive to wrapper integer
	
	System.out.println("******before java5 auto unboxing is*********");
	int y=I.intValue();//wrapper to primitive
	System.out.println("integer y="+y);
	
	
	System.out.println("*****onward java5 autoboxing is*********");
	int x=13;
	Integer xx=x;
	System.out.println("Integer(wrapper) xx="+xx);
	
	System.out.println("*****onward java5 auto unboxing is*********");
	
	int x1=xx;
	System.out.println("integer x1="+x1);
	
	
	String s="122";
	System.out.println("*****String to int primititve type*********");
	int j=Integer.parseInt(s);
	System.out.println("integer j="+s);
	
	System.out.println("*************String to wrapper*********");
	String ss="123";
	int k=Integer.valueOf(ss); 
	System.out.println("integer ss="+k);
	
	
	}
	public static void main(String[] args) {
		WrapperDemo w=new WrapperDemo();
		
	}

}
