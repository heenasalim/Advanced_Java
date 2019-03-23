package Student;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Labex21d {
	
	public static void main(String[] args) throws Exception{
		
	FileReader fr = new FileReader("D:\\Second.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println("\nReading the Source file : \n\n");
        String s;
        while((s = br.readLine()) != null) {
        	
        	
        	StringTokenizer st=new StringTokenizer(s," ");
        	while(st.hasMoreTokens()){
        		Pattern pat=Pattern.compile("[A-Da-d]");
        		String a=st.nextToken();
            	Matcher mat=pat.matcher(a);
        	//System.out.println("Reached here!!!");
        	if(mat.lookingAt()){
        		System.out.println("\n"+a);}
      	}
       
        }

		
}
}
