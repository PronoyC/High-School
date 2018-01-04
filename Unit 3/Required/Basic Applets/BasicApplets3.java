//File: BasicApplets3.java
//Author: Pronoy Chaudhuri
//Date: April 22nd, 2015
//Description: The basics to applets!
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class BasicApplets3 extends Applet implements ActionListener
{
  JLabel knit;
  
  public void init ()
  {
    resize (925,800);
    
    JLabel title = new JLabel ("Knitting");
    title.setFont (new Font ("Comic Sans MS", Font.PLAIN, 30));
    add (title);
    
    JLabel picture = new JLabel (createImageIcon ("Knitting.jpg"));
    add (picture);
    
    JTextField field1 = new JTextField ("                   ");
    JTextField field2 = new JTextField ("                   ");
    JTextField field3 = new JTextField ("                   ");
    JTextField field4 = new JTextField ("                   ");
        
    JLabel a = new JLabel ("A: ");
    a.setFont (new Font ("Comic Sans MS", Font.PLAIN, 20));
    add (a);  
    add (field1);
    
    JLabel b = new JLabel ("B: ");
    b.setFont (new Font ("Comic Sans MS", Font.PLAIN, 20));
    add (b);  
    add (field2);
    
    JLabel c = new JLabel ("C: ");
    c.setFont (new Font ("Comic Sans MS", Font.PLAIN, 20));
    add (c);  
    add (field3);
    
    JLabel d = new JLabel ("D: ");
    d.setFont (new Font ("Comic Sans MS", Font.PLAIN, 20));
    add (d);  
    add (field4);
    
    JButton b1 = new JButton ("Done");
    b1.setFont (new Font ("Arial", Font.BOLD, 18));
    b1.setForeground (Color.yellow);
    b1.setBackground (Color.blue);
    b1.addActionListener (this);
    b1.setActionCommand ("check");
    add (b1);
    
    setBackground(Color.pink);
  }
  public void actionPerformed (ActionEvent e)
  {
  }
  protected static ImageIcon createImageIcon (String path)
  {
    java.net.URL imgURL = BasicApplets3.class.getResource (path);
    if (imgURL != null)
      return new ImageIcon (imgURL);
    else
    {
      System.err.println ("Couldn't file file: " + path);
      return null;
    }
  }
}
