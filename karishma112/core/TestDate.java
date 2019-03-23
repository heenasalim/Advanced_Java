class  TestDate
{
	

	public static void main(String[] args) 
	{
		Date td=new Date();
		System.out.println("**********Default Date is*************  ");
		System.out.println(td.getDay());
		
		System.out.println(td.getMonth());
		
		System.out.println(td.getYear());
		System.out.println("**********New Date is**************  ");
			//System.out.println(+td.setDay(7)+"/"+td.setMonth(7)+"/"+td.setYear(2015));
		td.setDay(7);
		td.setMonth(7);
		td.setYear(2015);
		
	}
}
