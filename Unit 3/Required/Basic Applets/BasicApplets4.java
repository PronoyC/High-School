//File: BasicApplets4.java
//Author: Pronoy Chaudhuri
//Date: April 22nd, 2015
//Description: The basics to applets!
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class BasicApplets4 extends Applet implements ActionListener
{
  JLabel ski;
  
  public void init ()
  {
    resize (900,800);      
    
    JLabel picture = new JLabel (createImageIcon ("SkiRace.jpg"));
    add (picture);
    
    JTextField field1 = new JTextField ("                   ");
    JTextField field2 = new JTextField ("                   ");
    JTextField field3 = new JTextField ("                   ");
    JTextField field4 = new JTextField ("                   ");
        
    JLabel picture1 = new JLabel (createImageIcon ("SkiRace1.jpg"));    
    add (picture1);  
    add (field1);
    
    JLabel picture2 = new JLabel (createImageIcon ("SkiRace2.jpg"));    
    add (picture2);  
    add (field2);
    
    JLabel picture3 = new JLabel (createImageIcon ("SkiRace3.jpg"));    
    add (picture3);  
    add (field3);
    
    JLabel picture4 = new JLabel (createImageIcon ("SkiRace4.jpg"));    
    add (picture4);  
    add (field4); 
    
    JButton b1 = new JButton ("Done");
    b1.setFont (new Font ("Arial", Font.BOLD, 18));
    b1.setForeground (Color.blue);
    b1.setBackground (Color.white);
    b1.addActionListener (this);
    b1.setActionCommand ("check");
    add (b1);
    
    setBackground(Color.cyan);
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
