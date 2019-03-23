import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JPopupMenu.Separator;
public class homepage extends JFrame implements ActionListener{
	
	 JLabel l0,l1,l2;
	 JMenuBar mb;
	 JMenu emp,extra;
	 JMenuItem add,updt,srch,dlt,lo,au,ext,vlog;
	 
	 public homepage()
	 {
		 Panel p=new Panel();
		 p.setLayout(null);
		 l0=new JLabel("See");
		 l0.setFont(new Font("Segoe Print",Font.BOLD,250));
		 l0.setBounds(150,150,500,205);
		 l0.setForeground(Color.black);
		 
		 l1=new JLabel("d");
		 l1.setFont(new Font("Segoe Print",Font.BOLD,250));
		 l1.setBounds(560,150,200,205);
		 l1.setForeground(Color.LIGHT_GRAY);
		 
		 l2=new JLabel("beyond the obvious");
		 l2.setFont(new Font("Segoe Print",Font.BOLD,50));
		 l2.setBounds(150,400,600,80);
		 l2.setForeground(Color.black);
		 
		
		 
		 
		 p.add(l0);
		 p.add(l1);
		 p.add(l2);
		 p.setBackground(Color.yellow);
		 add(p);
		 
		 mb=new JMenuBar();
		 emp=new JMenu("Employee");
		 extra=new JMenu("Extras");
		 add=new JMenuItem("Register");
		 updt=new JMenuItem("Update");
		 srch=new JMenuItem("Search");
		 dlt=new JMenuItem("Delete");
		 lo=new JMenuItem("Logout");
		 au=new JMenuItem("Add User");
		 ext=new JMenuItem("Exit");
		 ext.setForeground(Color.red);
		 vlog=new JMenuItem("View Logins");
		 
		 setJMenuBar(mb);
		 mb.add(emp);
		 mb.add(extra);
		 emp.add(add);
		 emp.addSeparator();
		 emp.add(updt);
		 emp.addSeparator();
		 emp.add(srch);
		 emp.addSeparator();
		 emp.add(dlt);
		 extra.add(au);
		 extra.addSeparator();
		 extra.add(vlog);
		 extra.addSeparator();
		 extra.add(lo);
		 extra.addSeparator();
		 extra.add(ext);
		 
		 add.addActionListener(this);
		 updt.addActionListener(this);
		 srch.addActionListener(this);
		 dlt.addActionListener(this);
		 lo.addActionListener(this);
		 au.addActionListener(this);
		 ext.addActionListener(this);
		 vlog.addActionListener(this);
		 
		 setVisible(true);
		 setSize(1023, 723);
		 setTitle("Seed_Employee_Information");
		 setLocation(0,0);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setResizable(false);
	 }
	 
	 public static void main(String[] args) {
		
		 homepage h=new homepage();
	}
	 
	 @Override
	public void actionPerformed(ActionEvent e) {
		 
		 if(e.getSource()==ext)
		 {
			 System.exit(0);
		 }
		 
		 if(e.getSource()==lo)
		 {
			 this.dispose();
			 this.setVisible(false);
			 new Login();
		 }
		 
		 if(e.getSource()==add)
		 {
			 this.dispose();
			 this.setVisible(false);
			 new Add();
		 }
		 
		 if(e.getSource()==updt)
		 {
			 this.dispose();
			 this.setVisible(false);
			 new Update();
		 }
		 
		 if(e.getSource()==srch)
		 {
			 this.dispose();
			 this.setVisible(false);
			 new Search();
		 }
		 
		 if(e.getSource()==dlt)
		 {
			 this.dispose();
			 this.setVisible(false);
			 new Delete();
		 }
		 
		 if(e.getSource()==au)
		 {
			 this.dispose();
			 this.setVisible(false);
			 new AddUser();
		 }
		 
		 if(e.getSource()==vlog)
		 {
			 dispose();
			 try {
				new LogRegister();
			} catch (Exception e1) {e1.printStackTrace();
			}
		 }
		
	}

}
