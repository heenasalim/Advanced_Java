import java.io.*;
public class FileDemo {
	
	public static void main(String[] args) throws Exception {
		
		File f=new File("Z://demo.txt");
		System.out.println("IS FILE EXIST "+f.isFile());
		System.out.println("IS FILE EXIST "+f.exists());
		System.out.println("IS FILE READABLE "+f.canRead());
		System.out.println("IS FILE WRITABLE "+f.canWrite());
		
		FileInputStream fis=new FileInputStream(f);
		FileOutputStream fos=new FileOutputStream(f);
		
		int i=0;
		while(i != -1)
		{
			i=fis.read();
			System.out.print((char) i);
		}
	}

}
