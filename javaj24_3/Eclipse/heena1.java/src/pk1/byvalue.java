package pk1;

public class byvalue 
{

	int  dd,mm,yy;
	
	public byvalue() {
		super();
		dd=18;
		mm=04;
		yy=1994;
		System.out.println("+dd"+dd +"mm"+mm+"yy"+yy);
		
		// TODO Auto-generated constructor stub
	}


	public byvalue(int dd, int mm, int yy)
	{
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public   String  toString()
	{
		return "dd" +dd +"mm" + mm + "yy" +yy;
	}
	
	public static void  swap(byvalue b1, byvalue b2)
	{
	byvalue temp;
	temp=b1;
	b1=b2;
	b2=temp;

	}

public  static  void   main(String  args[])

{
 
  byvalue b1= new  byvalue(10,0,1028);
 byvalue  b2= new byvalue(23,84,2399);
  System.out.println("BEFORE  SWAPPING ENTITIES ARE");
  System.out.println(b1+  "/" +b2);
  System.out.println("AFTER  SWAPPING  ENTITIES  ARE");
  swap(b1,b2);
  System.out.println(b1+ "/" +b2);
 
}
}
	