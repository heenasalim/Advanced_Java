package ch6;

import java.io.*;

public class FileDemo {

String  fname,path,abspath;
  double  size;
  FileDemo()throws Exception 
  
  {
   File f= new  File("file1.txt");
	  
	if(f.exists()==true)
	{
		System.out.println("file  existe=s");
	}
	else
{ 
		f.createNewFile();
	System.out.println("file  does  not  existes");
	
}

	System.out.println("file  name  is" +f.getName());
	System.out.println("path  is   is" +f.getPath());
	System.out.println("absolute  path  is"+ f.getAbsolutePath());
	if(f.canRead()==true)
	{
		System.out.println("u  can  read  a  file");
	}
	if(f.canWrite()==true)
	{
		System.out.println("  u  can  write  in  the  file");
	}
	if(f.isAbsolute()==true)
  {
	  System.out.println("   file  has  absolute  path");
  }
	size=f.length();
	System.out.println("size  of  file  is"+size);
  }
  public  static  void  main(String  args[])  throws  Exception
  {
	  FileDemo  k=new  FileDemo();
  }
}
