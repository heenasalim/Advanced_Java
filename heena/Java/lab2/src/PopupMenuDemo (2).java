
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
 public class PopupMenuDemo extends JFrame{ 
  JButton b; 
  JTextField msg; 
  PopupAppMenu m; 
  public PopupMenuDemo(){ 
	  Container cp=getContentPane();
  setSize(200, 200); 
  b = new JButton("Pop-up Menu"); 
  cp.add(b, BorderLayout.NORTH); 
  msg = new JTextField(); 
  msg.setEditable(false); 
  add(msg, BorderLayout.SOUTH); 
  m = new PopupAppMenu(this); //create instance of popup menu
  add(m); //adding popup menu to this frame
  b.addActionListener(new ActionListener(){ 
  public void actionPerformed(ActionEvent e){ 
  m.show(b, 20, 20); 
  } 
  }); 
  addMouseListener(new MouseAdapter(){ 
  public void mousePressed(MouseEvent e){ 
  if (e.isPopupTrigger()) 
  m.show(e.getComponent(), e.getX(), e.getY()); 
  } 
  public void mouseReleased(MouseEvent e){ 
  if (e.isPopupTrigger()) 
  m.show(e.getComponent(), e.getX(), e.getY()); 
  } 
  }); 
  } 
  public static void main(String[] args){ 
  PopupMenuDemo app = new PopupMenuDemo(); 
  app.setVisible(true); 
  } 
  } 
 
  class PopupAppMenu extends JPopupMenu 
  implements ActionListener{ 
  PopupMenuDemo ref; 
  public PopupAppMenu(PopupMenuDemo ref){ 
  super("File"); 
  this.ref = ref; 
  JMenuItem mi; 
  //JFrame f=new JFrame("my popup Frame");
  add(mi = new JMenuItem("Copy")); 
  mi.addActionListener(this); 
  add(mi = new JMenuItem("Open")); 
  mi.addActionListener(this); 
  add(mi = new JMenuItem("Cut")); 
  mi.addActionListener(this); 
  add(mi = new JMenuItem("Paste")); 
  mi.addActionListener(this); 
  } //add menuItems to popup menu and add listeners.
  public void actionPerformed (ActionEvent e){ 
  String item = e.getActionCommand(); 
  ref.msg.setText("Option Selected: " + item); 
  } 
  } 
