package javaIO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serial implements Serializable{
	int i,j;
	String name;

	public serial(int i, String name, int j) {
		// TODO Auto-generated constructor stub
		this.i=i;
		this.j=j;
		this.name=name;
	}

	

}
