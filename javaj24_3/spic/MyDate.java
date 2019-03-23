class    MyDate                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
{
	int  dd,mm,yy;
	MyDate()
	{
		dd=18;
		mm=04;
		yy=1994;
	}
	MyDate(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void initDate()
	{
		System.out.println("date  of  birth is" +dd+ "/" +mm+ "/" +yy );
	}

}

