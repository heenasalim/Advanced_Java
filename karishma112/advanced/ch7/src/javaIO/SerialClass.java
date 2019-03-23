package javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SerialClass {

	public SerialClass() {
		// TODO Auto-generated constructor stub
		try
		{
			File f=new File("D://Temp/file1.txt");
			FileInputStream fis=new FileInputStream(f);
			FileOutputStream fos=new FileOutputStream("D://Temp/file2.txt");
			int i=0;
			do
			{
				i=fis.read();
				fos.write((char)i);
			}while(i!=-1);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SerialClass s=new SerialClass();

	}

}
