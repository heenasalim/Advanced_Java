class   MathClass  
{
	
	public     float  add(int  a,float b)
	{
		 return (a+b);
	}
	public  int  add( int  a, int b)
	{
		return (a+b);
	}
	public   float  add( float a,float b)
	{
		return (a+b);
	}
	public   String add(String  a, String  b)
	{
	   return  (a+b);
	}


	public static void main(String[] args) 
	{
 MathClass   m= new   MathClass();
 System.out.println(m.add(1,8));
System.out.println (m.add(1,2));
System.out.println( m.add("heena","shaikh"));
System.out.println("Hello World!");
	}
}
