import java.io.FileInputStream;
import java.io.IOException;


public class DivisionDemo2 {

	int a=20,b=0,c;
	void check()
	{
		try
		{
		c=a/b;
		FileInputStream f=new FileInputStream("myfile.txt");
		}
		catch(ArithmeticException|NullPointerException|IOException e )
		{
			//System.out.println("exception divide by zero");
			e.printStackTrace();
			//e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DivisionDemo2 d=new  DivisionDemo2();
		 d.check();
		 

	}

}