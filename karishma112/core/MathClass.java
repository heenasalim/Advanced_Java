class MathClass 
{


	int add(int a,int b)
	{
		
		return (a+b);
	}
	int add(int a,int b,int c)
	{
		
		return (a+b+c);
	}
	float add(float a,int b)
	{
		
		return (a+b);
	}
	double add(double a,int b)
	{
		
		return (a+b);
	}
	float add(float a,float b)
	{

		return (a+b);
	}
	String add(String s1,String s2)
	{
		return (s1+s2);
	}

    public static void main(String[] args) 
	{
		MathClass m=new MathClass();
		System.out.println("Addition of integers="+m.add(10,20));
		System.out.println("Addition of Floats="+m.add(10,20));
		System.out.println("Addition of string="+m.add("abc","xyz"));
		System.out.println("Addition of float and integers="+m.add(10,20));
		System.out.println("Addition 3 of integers="+m.add(10,20,30));
		System.out.println("Addition of double and Floats="+m.add(10,20));
	}
}
