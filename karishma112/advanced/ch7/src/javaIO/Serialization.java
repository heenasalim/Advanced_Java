package javaIO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.*;

public class Serialization extends JFrame implements ActionListener {
JFrame f;
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JPanel p;
JButton b1,b2,b3;
JList l;
String str[]={"abc"};
	public Serialization() {
		f=new JFrame();
		p=new JPanel();
		l1=new JLabel("RollNumber");
		l2=new JLabel("Name");
		l3=new JLabel("Marks");
		t1=new JTextField(15);
		t2=new JTextField(15);
		t3=new JTextField(15);
		b1=new JButton("Clear");
		b2=new JButton("Serialize");
		b3=new JButton("Deserialize");
		l=new JList(str);
		l.setSize(50,50);
		
		f.add(p);
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(t1);
		p.add(t2);
		p.add(t3);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(l);
		f.setVisible(true);
		f.setSize(400,400);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		
	}
	public static void main(String args[])
	{
		Serialization ss=new Serialization();
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			//t1.setCursor(null);
			t1.setFocusable(true);
		}
		if(e.getSource()==b2)
		{
			
				
				int i=Integer.parseInt(t1.getText());
				String name=t2.getText();
				int j=Integer.parseInt(t3.getText());
			
				
				serial s=new serial(i,name,j);
				FileOutputStream fos;
				ObjectOutputStream oos;
				try
				{
				//Serialization ss=new Serialization();
				fos=new FileOutputStream("serial1.txt");
				oos=new ObjectOutputStream(fos);
				oos.writeObject(s);
				oos.close();
				}
				catch (Exception e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
			
			
		}
		if(e.getSource()==b3)
		{
			FileInputStream is;
			Obj
		}
	}

}
