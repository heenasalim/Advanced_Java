package pk1;

public enum WeekDay {
	
	SUNDAY(0),MONDAY(1),TUESDAY(2),WENSDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6);
	private int i;
	 WeekDay (int j)
	 {
		 i=j;
	 }
	 public int getVal()
	 {
		 return i;
	 }
	 public void  setVal(int k)
	 {
		i=k; 
	 }
}