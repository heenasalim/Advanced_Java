package string;

public class StringClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		System.out.println("string1= "+s);
		System.out.println("string1 memory loc= "+s.hashCode());
		s="xyz";
		System.out.println("string2= "+s);
		System.out.println("string2 memory loc= "+s.hashCode());
		String s1="abc";
		System.out.println("string3= "+s1);
		System.out.println("string3 memory loc= "+s1.hashCode());
		s1=s1.concat(s);
		//System.out.println("string3 memory loc= "+s1.concat(s));
		System.out.println("************After concatenation of s and s1**************");
		System.out.println("string1= "+s1);
		System.out.println("string1 memory loc= "+s1.hashCode());
		System.out.println("string1= "+s);
		s1="abc";
		System.out.println("string1= "+s1);
		System.out.println("string1 memory loc= "+s1.hashCode());
		System.out.println("Length of s= "+s.length());
		System.out.println("is emty string1= "+s.isEmpty());
		System.out.println("2 nd char at string1= "+s.charAt(2));
		System.out.println("index of b in string1= "+s1.indexOf("b"));
		String s12=new String("karishma");
		String s22="karishma";
		if(s12==s22)
		{
			System.out.println("equals");
		}
		else
		{
	System.out.println("not equals");
	}
		if(s12.equals(s22))
		{
			System.out.println("equals");
		}
		else
		{
	System.out.println("not equals");
	}
	}
}
