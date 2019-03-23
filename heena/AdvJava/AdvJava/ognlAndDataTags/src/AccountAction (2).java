import com.opensymphony.xwork2.ActionSupport;


public class AccountAction extends ActionSupport {
	private int accNo;
	private String owner;
	private MyDate createDate;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public MyDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(MyDate createDate) {
		this.createDate = createDate;
		System.out.println("In setCreateDate : " + this.createDate);
	}
	
	public String execute()
	{
		return INPUT;
	}
	
	
}
