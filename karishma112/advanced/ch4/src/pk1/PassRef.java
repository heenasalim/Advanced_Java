/**
 * 
 */
package pk1;

/**
 * @author javaj24_2
 *
 */
public class PassRef {
	int dd,mm,yy;
	PassRef(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}

	/**
	 * 
	 */
	public String toString()
	{
		 return "\tdd="+dd+"\tmm="+mm+"\tyy="+yy;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassRef []p=new PassRef[2];
		p[0]=new PassRef(1,1,2000);
		p[1]=new PassRef(12,2,2015);
		System.out.println("****************Before swap*****************");

		System.out.println("" +p[0]);
		System.out.println("" +p[1]);
		System.out.println("*****************after swap*******************");
		swap(p);
		System.out.println("" +p[0]);
		System.out.println("" +p[1]);

	}

	public static void swap(PassRef p[]) {
		// TODO Auto-generated method stub
		PassRef temp;
				temp=p[0];
		p[0]=p[1];
		p[1]=temp;
		
		
	}

}