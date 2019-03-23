class ADate 
{
	int  dd,mm,yy;
	ADate()

	{
		dd=18;
		mm=04;
		yy=1994;
	}
	public   int  getDay()
	{
	return dd;
	}
	public int getMonth()
	{
	return mm;
	}
	public int getYear()
	{
	return yy;
	}
public void setDate(int d,int m,int  y)
	{
	dd=d;
	mm=m;
	yy=y;
	}

	public static void main(String[] args) 
	{
 ADate o=new  ADate();
 System.out.println("**********old  date   is********");
 System.out.println(o.getDay()+"/"+o.getMonth()+"/"+o.getYear());

 o.setDate(23,6,2015);
 System.out.println("**********new  date   is********");
 System.out.println(o.getDay()+"/"+o.getMonth()+"/"+o.getYear());
System.out.println("*********Hello   java*******!");

ADate d=new  ADate();
 System.out.println("**********no  argument  date  is  ********");
 System.out.println(d.getDay()+"/"+d.getMonth()+"/"+d.getYear());
	}
}
