import java.io.*;
public class Labex21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("enter what you want in your file::");
		String data=br.readLine();
		
		FileOutputStream fo=new FileOutputStream("Z://Second.txt");
		byte b[]=data.getBytes();
		fo.write(b);
		fo.close();

	}

}
