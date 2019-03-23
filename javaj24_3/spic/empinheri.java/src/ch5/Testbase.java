package ch5;

public class Testbase {
	public  static  void  main(String  args[])
	{
		baseemp  be= new  baseemp();
		Manager  m1 =  new  Manager(1,"HEENA ",34,4883,3883,2992);
		marketExecutive  m2=  new  marketExecutive(2,"teena",98,328993,3882,290902);
		System.out.println("\n tostring  details  for  manager class  is:\t"+m1);
		System.out.println("\n tostring  details  for  marketexecutive  class  is:\t"+m2);
		System.out.println("details of the manager  class  with  show  method  is: +"+ "**\n");
		m1.show();
		System.out.println("details of the marketing  executive  is  class  with  show  method  is: +"+    "**\n");
		m2.show();
		}

		
}
