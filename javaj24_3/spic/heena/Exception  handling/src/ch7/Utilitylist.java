package ch7;

import java.util.List;
import java.util.ArrayList;

public class Utilitylist {

	   public  static   void printlist(Collection  c[])
	   {
		   List  l=  new  ArrayList();
		       for(int i= 0;i<c.length;i++)
		       {
		    	   l.add(c[i]);
		    	   
		       }   
		       System.out.println("  the   details  of   employee  is:  \n "+l);
	   }
}
