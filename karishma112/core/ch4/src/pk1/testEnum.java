package pk1;

public class testEnum {
	WeekDay w;
	
	public static void main(String args[])
	{
		testEnum t=new testEnum();
		for(WeekDay w1:t.w.values())//for is used for string array plus its integer values.whenever we dont know values of array(how many)
		{
			System.out.println(w1+""+w1.getVal());
		}
		
		
	}

}
