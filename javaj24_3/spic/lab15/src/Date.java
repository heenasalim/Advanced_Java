
public class Date  implements Printable {
 int  dd,mm ,yy;

public Date(int dd, int mm, int yy) {
	super();
	this.dd = dd;
	this.mm = mm;
	this.yy = yy;
}

@Override
public String toString() {
	return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
}
 
public  void  print()
{
	System.out.println("date  class   \n  ");
}
}
