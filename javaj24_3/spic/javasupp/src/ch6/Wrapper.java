package ch6;

public class Wrapper {
	 int  x=30;
	 Integer i= new  Integer(x);  //pdt   to  wrapper
	   
	   int  y=i.intValue();  
	   
	   
	   //wrapperv to  pdt 
	   String s="30";
	   int  k=Integer.parseInt(s);   //string  to  pdt 
	   String  s1="78";
	   Integer  h=Integer.valueOf(s);  //string  to  wrapper 
	  
	   //convert  wrapper   to  primitive 
	 public  void  show()
	   {  
		  
	  System.out.println("wrapper  to  primitive:"+y);
	 System.out.println (" primitive  data  type  to  wrapper"+x);
	 System.out.println (" string   to  wrapper"+k);
	 System.out.println (" string  to  wrapper"+h);
	
	}
	public  static  void  main(String  args[])
	{
   Wrapper  w=new  Wrapper();
   w.show();

}}
