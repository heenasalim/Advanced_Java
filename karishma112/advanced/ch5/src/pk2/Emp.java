package pk2;

public class Emp implements Printable {
	int id;
	String name;
	double sal;
	/**
	 * @param id
	 * @param name
	 * @param s
	 */
	public Emp() {
		//super();
		 id=30;
		name="ddd";
		 sal=12222;
	}
	public void print()
	{
		System.out.println("EID= "+id);
		System.out.println("name= "+name);
		System.out.println("Sal= "+sal);
	}
	public static void main(String args[])
	{
	Emp e=new Emp();
	e.print();
	}
}
