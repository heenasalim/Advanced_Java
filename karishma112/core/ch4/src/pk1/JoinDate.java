/**
 * 
 */
package pk1;

/**
 * @author javaj24_2
 *
 */
public class JoinDate {
	int dd,mm,yy;

	/**
	 * 
	 */
	public JoinDate(int dd,int mm,int yy) {
		// TODO Auto-generated constructor stub
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	 public String toString()
	 {
		 return "\t"+dd+"\t/"+mm+"\t/"+yy;
	 }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinDate j1=new JoinDate(1,1,2000);

	}

}