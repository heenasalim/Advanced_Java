
public class Shape  implements Printable {
	
double area1;
int  r=789;

public Shape( int r) {
	super();
	//this.area1 = area1;
	this.r = r;
}

@Override
public String toString() {
	return "Shape [area1=" + area1 + ", r=" + r + "]";
}

public void  area()
{
area1=(3.14*r*r);
System.out.println("Shape area of  the  circle is  \n " +area1);
}

public  void  print()
{
System.out.println("class shape\n ");	
}
}
