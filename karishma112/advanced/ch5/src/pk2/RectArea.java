package pk2;

public class RectArea extends Shape {
	double l=20;
	double b=30;
	public double area()
	{
		return l*b;
	}
	public void show()
	{
		System.out.println("\n Rectangle area= "+area());
	}
	public static void main(String args[])
	{
		//Shape s=new Shape();
		RectArea c=new RectArea();
		c.area();
		c.show();
	}
}