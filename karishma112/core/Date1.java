package com;
public class Date1
{
	public static int dd,mm,yy;
	public Date1(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}

	
	public static String showDate()
	{

		return ""+dd+"-"+mm+"-"+yy;
	}
	public static void main(String[] args) 
	{
		//Date1 d=new Date1(1,2,2015);
		//showDate();
		//System.out.println("Hello World!");
	}
}
