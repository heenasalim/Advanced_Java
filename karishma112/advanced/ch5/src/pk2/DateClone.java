package pk2;

public class DateClone implements Cloneable {
int dd,mm,yy;

/**
 * @param dd
 * @param mm
 * @param yy
 */
public DateClone(int dd, int mm, int yy) {
	//super();
	this.dd = dd;
	this.mm = mm;
	this.yy = yy;
}

public Object clone()
{
	DateClone temp=new DateClone(1,1,2015);
	return temp;
}
	
public static void main(String args[])
{
	DateClone d1=new DateClone(1,1,2015);
	DateClone d2=(DateClone)d1.clone();
	//System.out.println(d1);
	//System.out.println(d2);
	
	
}
@Override
public String toString() {
	return "DateClone [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
}

}
