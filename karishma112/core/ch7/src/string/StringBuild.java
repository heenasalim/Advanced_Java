package string;

public class StringBuild {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1=new StringBuilder("abc123456");
		StringBuilder s2=new StringBuilder("xyz");
		
		System.out.println("string 1="+s1);
		System.out.println("string1 loc="+s1.hashCode());
		System.out.println("string1 capacity= "+s1.capacity());
		
		System.out.println("string 2="+s2);
		System.out.println("string2 loc="+s2.hashCode());
		
		System.out.println("string1 insert into string 2="+s2.insert(0, s1));
}
}
