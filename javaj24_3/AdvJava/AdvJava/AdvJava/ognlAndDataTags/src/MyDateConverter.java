import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class MyDateConverter extends StrutsTypeConverter {

		@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		// TODO Auto-generated method stub
		System.out.println("in convertFromString");
		String date = arg1[0];
		MyDate cDate = parseDate(date);
		
		
		return cDate;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		// TODO Auto-generated method stub
		System.out.println("in convertToString ");
		MyDate cDate = (MyDate)arg1;
		String date = arg1.toString();
		return date;
	}
	
	public MyDate parseDate(String date)
	{
		System.out.println("before parse");
		int dd = 0; 
		int mm = 0;
		int yy = 0;
		MyDate cDate = new MyDate();
		//2/3/2008
		String token[] = date.split("/");
		System.out.println(token[0]);
		System.out.println(token[1]);
		System.out.println(token[2]);
		
		dd =  Integer.parseInt(token[0]);
		mm =  Integer.parseInt(token[1]);
		yy =  Integer.parseInt(token[2]);
		System.out.println(dd);
		System.out.println(mm);
		System.out.println(yy);
		cDate.setDd(dd);
		cDate.setMm(mm);
		cDate.setYy(yy);
		System.out.println("after parse");
		return cDate;
		
	}

}
