package pk2;

public class Date2 {
	int dd,mm,yy;

	/**
	 * @param dd
	 * @param mm
	 * @param yy
	 */
	public Date2(int dd, int mm, int yy) {
		//super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dd;
		result = prime * result + mm;
		result = prime * result + yy;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		Date2 d=(Date2)obj;
		
		if (dd ==d.dd && mm==d.mm &&yy==d.yy)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		 Date2 d1=new  Date2(1,1,2000);
		 Date2 d2=new  Date2(1,1,2000);
		 if(d1.equals(d2))
		 {
			 System.out.println("Dates are equals");
		 }
		 else
		 {
			 System.out.println("Dates arenot equals");
		 }
		 System.out.println("d1="+d1.hashCode());
		 System.out.println("d2="+d2.hashCode());
	}
	@Override
	public String toString() {
		return "Date2 [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}

}
