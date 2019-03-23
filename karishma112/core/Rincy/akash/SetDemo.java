//try this prog. with different combinations; it will work!!
import java.util.*;
public class SetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	ArrayList s=new ArrayList();
	s.add(1);
	s.add(2);
	s.add(3);
	s.add(5);
	s.add(2);
	s.add(4);
	s.add(6); 
	s.add(3);
	s.add(7);
	s.add(4);
	s.add(5);
	s.add(6);
	//System.out.println(s.size());
	int j=0;
	int a=0;
	List []l1=new List[5];
	int i;
	for(i=0;i<11;i++)
	{
		if(s.get(i).hashCode()>s.get(i+1).hashCode())// finds if no is less than next no.
		{
			
			 l1[j]=s.subList(a, i+1);//creates a new Set
			 j++; //increases the array of List
			a=i+1;//decides next subset has to start with which number
		}
	}
	l1[j]=s.subList(a,i+1);//assigns last group of numbers to this list
	for(int i1=0;i1<j+1;i1++)
	{
		System.out.println(l1[i1]);
	}
	
	

	}

}
