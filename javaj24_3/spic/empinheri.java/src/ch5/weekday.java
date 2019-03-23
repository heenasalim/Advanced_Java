package  ch5;
public enum weekday
{
	SUNDAY(1),MONDAY(2),TUESDAY(3);
	
	private  int  rs;
	

weekday(int i)
{
	rs=i;
}
public  int  getrs()
{
	return  rs;
}
public  void    setrs(int  rs)
{
	this.rs=rs;
}

}
