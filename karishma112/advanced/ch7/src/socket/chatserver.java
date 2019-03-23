package socket;

import java.io.*;
import java.net.*;

class chatserver
{
	ServerSocket server;
	Socket connection;
	DataInputStream dis;
	DataOutputStream dos;
	DataInputStream disi;
	
	public chatserver()
	{
		try
		{
			server=new ServerSocket(2000,1,InetAddress.getLocalHost());
			System.out.println("Server started......");
			connection=server.accept();
			System.out.println("Request received...");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void talk() throws IOException,UnknownHostException
	{
		dis=new DataInputStream(connection.getInputStream());
		dos=new DataOutputStream(connection.getOutputStream());
		disi=new DataInputStream(System.in);
		while(true)
		{
			System.out.println(dis.readUTF());
			dos.writeUTF(disi.readLine());
		}
	}
	public static void main(String[] str)
	{
		try
		{
		chatserver cs=new chatserver();
		cs.talk();
		}
		catch(Exception e){}
	}
 
}