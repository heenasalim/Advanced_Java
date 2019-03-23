import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Menu extends JFrame {
	
	Menu()
	{
       JMenuBar mb=new JMenuBar();
       setJMenuBar(mb);
       JMenu m1=new JMenu("File");
       JMenu m2=new JMenu("Edit");
       JMenu m3=new JMenu("Format");
       JMenu m4=new JMenu("View");
       JMenu m5=new JMenu("Help");
       mb.add(m1);
       mb.add(m2);
       mb.add(m3);
       mb.add(m4);
       mb.add(m5);
       JMenuItem m6=new JMenuItem("New");
       JMenuItem m7=new JMenuItem("Open");
       JMenuItem m8=new JMenuItem("Save");
       JMenuItem m9=new JMenuItem("Print");
       JMenuItem m10=new JMenuItem("Exit");
       m1.add(m6);
       m1.add(m7);
       m1.add(m8);
       m1.add(m9);
       m1.add(m10);
       JMenuItem m11=new JMenuItem("Cut");
       JMenuItem m12=new JMenuItem("Copy");
       JMenuItem m13=new JMenuItem("Paste");
       JMenuItem m14=new JMenuItem("Delete");
       JMenuItem m15=new JMenuItem("Find");
       JMenuItem m16=new JMenuItem("Replace");
       m2.add(m11);
       m2.add(m12);
       m2.add(m13);
       m2.add(m14);
       m2.add(m15);
       m2.add(m16);
       JMenuItem m17=new JMenuItem("Word Wrap");
       JMenuItem m18=new JMenuItem("Font");
       m3.add(m17);
       m3.add(m18);
       JMenuItem m19=new JMenuItem("status Bar");
       m4.add(m19);
       JMenuItem m20=new JMenuItem("About Notepad");
       JMenuItem m21=new JMenuItem("View Help");
       m5.add(m20);
       m5.add(m21);
}
   public static void main(String args[])
   {
	   Menu m=new Menu();
	   m.setSize(400,400);
	   m.setVisible(true);
   }
}

