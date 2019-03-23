package pk2;
import java.util.*;
import pk1.Student;
public class Batch 
{
	int sub1;
	int sub2;
	int avg;

	public void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter subject 1 marks= ");
		sub1=s.nextInt();

		System.out.println("Enter subject 2 marks= ");
		sub2=s.nextInt();
		avg=sub1+sub2/2;
		System.out.println("Total marks="+avg);
		

	}
	public static void main(String[] args) 
	{
		Student b=new Student();
		Batch s=new Batch();
		b.get();
		s.accept();
		//b.print();

		//System.out.println("Hello World!");
	}
}
