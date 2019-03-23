class Date 
{
	private int  dd,mm,yy;
	Date()
	{
		dd=23;
		mm=7;
		yy=2015;
	}
	
public int getDay()
	{
		return dd;
		
	}
	public void setDay(int d)
	{
		dd=d;
		System.out.println(""+dd);
	}

public int getMonth()
	{
		return mm;
	
	}
	public void setMonth(int m)
	{
		mm=m;
		System.out.println(" "+mm);
	}
	public int getYear()
	{
		return yy;
		//System.out.println(System.);
	}
	public void setYear(int y)
	{
		yy=y;
		System.out.println(""+yy);
	}

	void printDate()
	{
		System.out.println();
	}
}
