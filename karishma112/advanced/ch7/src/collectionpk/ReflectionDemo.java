package collectionpk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//i//mport java.text.NumberFormat.Field;
import java.util.Iterator;

public class ReflectionDemo {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Employee e3=new Employee(1, "www", 2000,"c");
		Class c=e3.getClass();
		//Class c=Class.forName("Z://divya.ch7.src.collectionpk.Employee");
		//Class c=Class.forName(collectionpk.Employee).new instance();
		Constructor c1[]=c.getDeclaredConstructors();
		for(int i=0;i<c1.length;i++)
		{
			System.out.println(c1[i]);
		}

		Method m1[]=c.getDeclaredMethods();
		for(int i=0;i<m1.length;i++)
		{
			System.out.println(m1[i]);
		}
		
		
		Field f[]=c.getDeclaredFields();
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
	}

}