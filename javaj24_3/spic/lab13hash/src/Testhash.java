
public class Testhash {

	public  static  void  main(String  args[])
	{
	hashcode  h1=new  hashcode(18,4,1994);
	hashcode h2=new  hashcode(18,4,1994);
	hashcode h3=  new  hashcode(13,6,1998);
	hashcode h4=new  hashcode(236,348,34949);
	
	if(h1.equals(h2))
	{
	System.out.println("Dates  are  same  of  h1(18,4,1994)  and  h2(18,4,1994)");
	
	}
	else
	{
		System.out.println("Dates  are  not same  of h1(18,4,1994)  and  h2(18,4,1994)");
	}
	
	if(h2.equals(h3)){
		System.out.println("Dates  are  same of  h2(18,4,1994)  and  h3(13,6,1998)");
		
	}
	else
	{System.out.println("Dates  are  not same of  h2(18,4,1994)  and  h3(18,4,1994)");
		
	}
	
	if(h1.hashCode()==h2.hashCode())
	{
		System.out.println("locations  are  same of  h1(18,4,1994)  and  h2(18,4,1994)");
	}
	else
	{
		System.out.println("locations  are  different  of  h1(18,4,1994)  and  h2(18,4,1994)");
	}
	}
	
}