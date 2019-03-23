package ch5;

public class Manager extends Employee
{
		float pa,fa,oa;
		
		Manager()
		{
			pa=0.08f* bsc;
			fa=0.13f * bsc;
			oa=0.03f* bsc;
        }

		
		public Manager(int id, int bsc, String name) 
		{
			super(id, bsc, name);
			this.pa=pa;
			this.fa=fa;
			this.oa=oa;
		}


		public float calSal()
		{
            float netsal=bsc+pa+fa+oa;
            return netsal;
		}

		@Override
		public String toString() 
		{
			return "Manager [pa=" + pa + ", fa=" + fa + ", oa=" + oa + "]";
		}
		public void display()
		{
			System.out.println("pa="+pa);
			System.out.println("fa="+fa);
			System.out.println("oa="+oa);
			
		}
		
		public static void main(String[] args)
		{
			Manager m=new Manager();
			m.display();
			System.out.println("NetSalary ="+m.calSal());
			System.out.println("***************");
			Manager m1=new Manager(200,12000,"san");
			System.out.println(m);
			System.out.println("Salary is="+m1.calSal());
			
			
			
		}
			
		}
		
		
