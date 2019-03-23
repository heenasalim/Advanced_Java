package pk2;

public class circle extends Shape {
	
	double r;
	public final double PI=3.14;
	circle()
	{
		r=5;
	}
	
	public double area()
	{
		return PI*r*r;
	}
	public void show()
	{
		System.out.println("\n Circle area= "+area());
	}
	public static void main(String args[])
	{
		circle c=new circle();
		c.area();
		c.show();
	}

}
