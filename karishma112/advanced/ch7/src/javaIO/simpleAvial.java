package javaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class simpleAvial {
	
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			File f1=new File("D://Temp/one.txt");
			File f2=new File("D://Temp/two.txt");
			RandomAccessFile r1=new RandomAccessFile(f1,"r");
			RandomAccessFile r2=new RandomAccessFile(f2,"rw");
			
			int x=3;
			System.out.println("beforesettig pointer "+r1.getFilePointer());
		
				r1.seek(6);
			
			System.out.println("after settig pointer "+r1.getFilePointer());
			
			do
			{
				x=r1.read();
				r2.write((char)x);
			}while(x!=-1);
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
