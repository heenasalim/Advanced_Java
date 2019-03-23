package  pk1;
public class  student1
{
int  dd;
int  mm;
int yy;

   public student1()
	{
	dd=12;
	mm=6;
	yy=1998;
	System.out.println("dd="+dd+"mm"+mm +"yy" +yy);
	}

	public student1(int dd,int  mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
        System.out.println("dd="+dd+"mm"+mm+"yy"+yy);
	}

	public  String  toString()
	{
		return "dd +" + dd+ "mm"  +mm+"yy"+yy;
	}


}
	