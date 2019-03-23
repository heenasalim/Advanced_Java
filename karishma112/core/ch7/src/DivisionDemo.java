import java.io.IOException;


public class DivisionDemo {
	int no1=10,no2=0,no3;
	String s=null;
	void check() throws NullPointerException,IOException
	{
		//no3=no1/no2;
		
		try
		{
			if(s==null)
			{
			throw new NullPointerException();
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("catch the nullpointerexception");
		}
	if(no2==0)
	{
		throw new ArithmeticException();
	}
	
	}
	public static void main(String[] args) throws NullPointerException, IOException  {
		// TODO Auto-generated method stub
		DivisionDemo d=new DivisionDemo();
		d.check();

	}


}
