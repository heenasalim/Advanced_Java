package ch5;


public    class  marketExecutive  extends baseemp
	{
		int  km;
		int ta=5;
		int telep=1500;
		int Sal=1000;
	   int  pf =1000;
	   int  pt=199;
	   int  hra=890;
	   int  medical=8929020;

		
		
	 public marketExecutive(int empid, String empname, int sal, int km, int ta,int telep) {
			super(empid, empname, sal);
			this.km = km;
			this.ta = ta;
			this.telep = telep;
		}

		
		public int  getKem()
		{
			return km;
		}


		@Override
		public String toString() {
			return "marketExecutive [km=" + km + ", ta=" + ta + ", telep=" + telep
					+ "]";
		}
		public void  show()
		{
			
		double  gs=Sal+hra+medical;
		double ns=gs-(pt+pf);
		System.out.println("\n gs  and  ns using  show  method market  executive  is" +gs  +ns);
		System.out.println("\n kilometer  is==" +getKem() +  "\ttour  allowance  is =="+ ta + "\t telephone  is==" +telep);
		}
	}

	
	
