
public class AccountML {
	public void display()
	{
		class Inner
		{
			public void show()
			{
				System.out.println("inside inner class");
			}
		}
		Inner i=new Inner();
		i.show();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountML m=new AccountML();
		
	
		m.display();

	}

}
