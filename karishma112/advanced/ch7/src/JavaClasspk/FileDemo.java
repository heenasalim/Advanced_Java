package JavaClasspk;
import java.io.*;

public class FileDemo {
	File f;

	FileDemo()
	{
		
		f=new File("myfile.txt");
		if(f.exists())
		{
			System.out.println("file is present");
		}
		else
		{
			System.out.println("file isnot present");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileDemo f=new FileDemo();
		
		
		

	}

}
