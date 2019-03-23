package pk4;

public class AccountA {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Shape()
		{
			//@override
			public void show()
			{
				super.show();
				System.out.println("Inside the Inner  class");
				//return 0;
			}

			@Override
			public double area() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		s.show();
		

	}

}
