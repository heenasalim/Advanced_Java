package pk4;

public class Date implements Cloneable {
int dd,mm,yy;

/**
 * @param dd
 * @param mm
 * @param yy
 */
public Date(int dd, int mm, int yy) {
	//super();
	this.dd = dd;
	this.mm = mm;
	this.yy = yy;
}


public String toString() {
	return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
}
public static void main(String args[])
{
	Date d1=new Date(1,2,2015);
	System.out.println(d1);
	Date d2=(Date)d1.clone();
	System.out.println(d2);
	//System.out.println(d1);
}


public Date clone() {
	// TODO Auto-generated method stub
	Date d3;
	d3=new Date(this.dd,this.mm,this.yy);
	return d3;
	
	
//	return null;
}
}
