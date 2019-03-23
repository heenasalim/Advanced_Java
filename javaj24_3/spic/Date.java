class  Date
{
 int  dd,mm,yy;
Date(int  dd,int  mm ,int  yy)
{
this.dd=dd;
this.mm=mm;
this.yy=yy;
System.out.println("  value  of  first  constryctor  is" +dd   +mm   +yy);
}

Date()
	{
	this(1,2,3);
	dd=123;
	mm=27882;
	yy=2772;
	System.out.println("  value  of   second   constryctor  is" +dd   +mm   +yy);

	}
public   String   display()
	{


return  dd+ "/" + mm+"/" +yy;
	}
		


public    static  void  main(String  args[])
		
	{
Date  d=new  Date();

System.out.println(d.display());


}
}
