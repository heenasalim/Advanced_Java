class ThisKey 
{

	int dd,mm,yy;
	ThisKey(int dd,int mm,int yy)
	{
		this(1,2);
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		System.out.println("Constructor 1 "+dd+"/"+mm+"/"+yy);
	}
	ThisKey(int dd,int mm)
	{
		this();
	this.dd=dd;
	this.mm=mm;
	
	System.out.println("Constructor 2 "+dd+"/"+mm+"/"+yy);
	}
	ThisKey()
	{
		
		dd=10;
		mm=1;
		yy=2000;
		System.out.println("Constructor 3 "+dd+"/"+mm+"/"+yy);
	}
	void print()
	{
		System.out.println(""+dd+"-"+mm+"-"+yy);
	}

	public static void main(String[] args) 
	{
		ThisKey t=new ThisKey(14,2,2015);
	      t.print();
		
	}
}
