
import java.awt.*;
import javax.swing.*;

class DemoTable extends JFrame 
{
    DemoTable()
	{
		Container cp=getContentPane();
		cp.setLayout(new BorderLayout());

		String [] col={ "Name" ,"Subject" ,"Batch","Marks1","Marks2","Marks3"};
        
		 Object [][] data={
		 { "Rohit" ,"java","Batch-1","50","50","50"},
		 {  "Sumit","vb","BAtch-2" ,"60","50","50" },
         { "Roma" ,"java","Batch-3","50","80","50"},
         { "Rupesh" ,"vb","Batch-1","80","50","50"},
         { "Rutu" ,"java","Batch-1","90","80","50"},
         
         };
         
		 JTable tb=new JTable(data,col);

		 int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		 int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;

		 JScrollPane jp=new JScrollPane(tb,v,h);
		 cp.add(jp,BorderLayout.CENTER);
	}
	public static void main(String args[])
    {
       DemoTable d=new DemoTable();
	   d.setVisible(true);
	   d.setSize(300,300);
	}
}
