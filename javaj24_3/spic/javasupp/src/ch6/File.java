package ch6;

public class FileDemo {

;
String  fname,path,abspath;
  double  size;
  FileDemo(String s)
  
  {
File  f= new  File("console1.txt");
	  
	if(f.exists()==true)
	{
		System.out.println("file  existe=s");
	}
	else
{   f.createNewFile();
	System.out.println("file  does  not  existes");
	
}

	System.out.println("file  name  is" +f.getName());
	System.out.println("path  is   is" +f.getPath());
	System.out.println("absolute  path  is"+f.getAbsolutepath());
	
  }
	
	
}