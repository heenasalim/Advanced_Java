class MyDate 
{
	int dd,mm,yy;
		MyDate()  //default constructor
	{
		dd=23;
		mm=1;
		yy=2000;
	}
	MyDate(int d,int m,int y)//Parameterized constructor
	{
		dd=d;
		mm=m;
		yy=y;
	}
	void printDate()
	{
		System.out.println("today date is   "+dd+"/"+mm+"/"+yy);
	}

	public static void main(String[] args) 
	{
		MyDate md=new MyDate();//call default constructor
		md.printDate();
		MyDate md1=new MyDate(23,07,2015);//call parameterized constructor
		md1.printDate();
	}
}
