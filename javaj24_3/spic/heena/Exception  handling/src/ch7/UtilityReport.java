package ch7;

import java.util.HashMap;
import java.util.Map;

public class UtilityReport {
	
	
	public   void  report(Collection c[])
	{
		
	Map  m=  new  HashMap();
	for(  int  i=0;i<c.length;i++)                                                                          
	{
	 m.put("heena",50000);
	 m.put(" saima", 6389);
	 m.put("karii", 40000);
	 m.put("sayli",689);
	 m.put("karii", 40000);
	 m.put("heena",50000);
	}
	
	 System.out.println("\n  print  map  in  key  value  pair "+m); 
}
}
