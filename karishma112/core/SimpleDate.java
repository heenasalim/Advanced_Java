class SimpleDate 
{
      // int dd,mm,yy;
	   int dd=23;
		int mm=7;
		int yy=2015;
		public void initDate()
		{
			System.out.println("today Date is"+dd+"/"+mm+"/"+yy);
		}

	public static void main(String[] args) 
	{
		
		SimpleDate sd=new SimpleDate();
		sd.initDate();
	}
}
