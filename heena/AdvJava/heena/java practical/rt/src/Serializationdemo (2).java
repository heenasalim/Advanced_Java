
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;

import javax.imageio.stream.FileImageInputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import o.Employee;

public class Serializationdemo extends JFrame implements ActionListener{

	JPanel p;
	JLabel l1,l2,l3;
	JTextField tf1,tf2,tf3;
	JButton b1,b2,b3;
	JTextArea ta;
	
	public Serializationdemo() {
	
		
		p=new JPanel();
		
		l1=new JLabel("Emp Id :");
		l2=new JLabel("Emp Name :");
		l3=new JLabel("Emp Salary :");
		
		tf1=new JTextField(10);
		tf3=new JTextField(10);
		tf2=new JTextField(10);
		
		ta=new JTextArea(50,50);
		
		b1=new JButton("Clear");
		b2=new JButton("Serialize");
		b3=new JButton("Deserialize");
		
		p.add(l1);
		p.add(tf1);
		p.add(l2);
		p.add(tf2);
		
		p.add(l3);
		p.add(tf3);
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		p.add(ta);
		
		getContentPane().add(p);
		setSize(800,600);
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		
	}
	
	public static void main(String[] args) {
		
		Serializationdemo f=new Serializationdemo();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			
		}
		
		if(e.getSource()==b2)
		{
			FileOutputStream fos;
			ObjectOutputStream oos;
			
			int no=Integer.parseInt(tf1.getText());
			String nm=tf2.getText();
			int bs=Integer.parseInt(tf3.getText());
			try{
			
				Employee emp=new Employee(no,nm,bs);
				fos=new FileOutputStream("d:\\chetan.txt");
				oos=new ObjectOutputStream(fos);
				
				oos.writeObject(emp);
				oos.close();
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		
		if(e.getSource()==b3)
		{
			FileInputStream fis;
			ObjectInputStream ois;
			
			try{
				
				Employee emp;
				fis=new FileInputStream("d:\\chetan.txt");
				ois=new ObjectInputStream(fis);
				
				System.out.println(fis.getClass());
				System.out.println("inside b3 action");
				
				emp=(Employee)ois.readObject();
				System.out.println(emp.toString());
				ta.append(emp.name);
				
				System.out.println(emp.toString());
			//	Sting n=emp.id;
			//	ta.append(emp.id);
			//	ta.append(emp.sal);
				
				ta.append(emp.toString());
				ois.close();
			}
			catch(Exception ex)
			{
				
				ex.printStackTrace();
			}
		}
		
	}

}
