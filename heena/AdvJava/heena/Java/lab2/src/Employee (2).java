import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Employee extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JButton b1;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	Employee()
	{
          Container cp=getContentPane();
		  b1=new JButton("Calculate");
	      l1=new JLabel("Name");
	      t1= new JTextField(20);//name
	      t2= new JTextField(20);//basic salary
	      t3= new JTextField(20);//HRA
	      t4= new JTextField(20);//DA
	      t5= new JTextField(20);//PF
	      t6= new JTextField(20);//ITAX
	      t7= new JTextField(20);//Total sal
	      t8= new JTextField(20);//sal in hand
	      l2=new JLabel("Basic Salary");
	      l3=new JLabel("HRA");
	      l4=new JLabel("DA");
	      l5=new JLabel("Total Salary");
	      l6=new JLabel("PF");
	      l7=new JLabel("I Tax");
	      l8=new JLabel("Salary in Hand");
	      cp.setLayout(new FlowLayout());
	      cp.add(l1);
	      cp.add(t1);
	      cp.add(l2);
	      cp.add(t2);
	      cp.add(l3);
	      cp.add(t3);
	      cp.add(l4);
	      cp.add(t4);
	      cp.add(l5);
	      cp.add(t7);
	      cp.add(l6);
	      cp.add(t5);
	      cp.add(l7);
	      cp.add(t6);
	      cp.add(l8);
	      cp.add(t8);
	      cp.add(b1);
	      b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		//HRA
		String s=t2.getText();
        double a = Double.parseDouble(s);
        double b=a*0.1;
		t3.setText(b+"");
		
		//DA
		
		 double b1=a*1.5;
		 t4.setText(b1+"");
		 
		 //total sal
		 double Total_Salary=a+b+b1;
		 t7.setText( Total_Salary+"");
		 
		 //PF
		double PF=Total_Salary*1.2;
		 t5.setText(PF+"");
		 
		 //I-TAX
		 double TAX=Total_Salary*0.2;
		 t6.setText(TAX+"");
		 
		 
		 //salary in hand
		 double b2=Total_Salary-(PF+TAX);
		 t8.setText(b2+"");
		 t8.hide();
		 
		
	}
	public static void main(String args[])
	{
	   Employee e=new Employee();
	   e.setVisible(true);
	   e.setSize(400,200);
	}
}

