package ch7;

import java.io.*;

public class FileDemo
{ int  a=0;
  int c;
  int  b=10;

	  public  void  calculate()
	  {           
		 
			System.out.println(" division  is"+c);
	  }
	void method() throws IOException
	{
		FileInputStream f=null;
		
		try 
		{  
			c=b/a;	
		    f= new  FileInputStream("file12.txt");
		 
		      }
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		System.err.println(" ****************divide  by   zero  error*****************");
		}
		
		catch (FileNotFoundException  ex)
		{
			
			System.out.println("file  does  not   exist");
			ex.printStackTrace();
		}
		
		
		finally
		{
			f.close();
		}
   }
	public  static  void  main(String  args[]) throws IOException
	{
		FileDemo  f=  new  FileDemo();
		f.method();
	}
}
