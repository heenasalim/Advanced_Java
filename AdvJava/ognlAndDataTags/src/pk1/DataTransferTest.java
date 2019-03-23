/* We don't need indexed getters & setters for these properties */
/* OGNL creates a new array & sets it on the property */

package pk1;

public class DataTransferTest {
	private Double[] ages;

	public Double[] getAges() {
		return ages;
	}

	public void setAges(Double[] ages) {
		this.ages = ages;
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	private String[] names = new String[10];

	public String execute() {
		return "success";
	}
}
