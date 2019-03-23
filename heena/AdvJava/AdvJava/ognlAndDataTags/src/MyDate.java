import java.io.Serializable;


public class MyDate implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5244986605704997912L;
	private int dd;
	private int mm;
	private int yy;
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		
		this.dd = dd;
		System.out.println("In MyDate : " + this.dd);
		
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	
	public String toString()
	{
		return ("Day: " + getDd() + "\tMonth: " + getMm() + "\tYear: " + getYy());
	}
	
	
}
