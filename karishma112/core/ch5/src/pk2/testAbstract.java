package pk2;

public class testAbstract {
	void showInfo(Shape s)
	{
		s.area();
		s.show();
	}
	public static void main(String args[])
	{
		circle c=new circle();
		
		RectArea r=new RectArea();
		testAbstract t=new testAbstract();
		t.showInfo(r);
		t.showInfo(c);
	}

}
