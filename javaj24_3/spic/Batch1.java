
package pk2;
public class  Batch1
{ 
 String dept;
 char div;

	public Batch1()
	{
		dept="comp";
		div='A';
System.out.println("dept="+dept+" div is=" +div);
	}

	public Batch1(String dept,char div)
	{
   this.dept=dept;
   this.div=div;
 System.out.println("dept="+dept+" div is="+div);
	}

public  String  toString()
	{
		return "dept" + dept +  "div"  +div;
	}

}