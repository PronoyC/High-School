//File: SomethingSomething.java
//Author: Pronoy Chaudhuri
//Date: April 22nd, 2015
//Description: You know, just a something-something.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class SomethingSomething extends Applet implements ActionListener
{
  JButton b1; 
  JButton b2; 
  JButton b3; 
  JButton b4; 
  JButton b5; 
  JButton b6; 
  JButton b7; 
  JButton b8; 
  public void init ()
  { 
    resize (275, 400); 
    JLabel title = new JLabel ("The Something Something");
    title.setFont (new Font ("Arial", Font.PLAIN, 18));
    JLabel instruct = new JLabel ("Press the buttons to randomize a sentence.");
    instruct.setFont (new Font ("Arial", Font.BOLD, 9));
    b1 = new JButton ("The");
    b1.setForeground (Color.blue);
    b1.setBackground (Color.green);
    b1.setFont (new Font ("Arial", Font.BOLD, 18));
    b1.setPreferredSize (new Dimension (250, 38));
    b1.setActionCommand ("1");
    b1.addActionListener (this);
    
    b2 = new JButton ("The");
    b2.setForeground (Color.blue);
    b2.setBackground (Color.green);
    b2.setFont (new Font ("Arial", Font.BOLD, 18));
    b2.setPreferredSize (new Dimension (250, 38));
    b2.setActionCommand ("2");
    b2.addActionListener (this);
    
    b3 = new JButton ("The");
    b3.setForeground (Color.blue);
    b3.setBackground (Color.green);
    b3.setFont (new Font ("Arial", Font.BOLD, 18));
    b3.setPreferredSize (new Dimension (250, 38));
    b3.setActionCommand ("3");
    b3.addActionListener (this);
    
    b4 = new JButton ("The");
    b4.setForeground (Color.blue);
    b4.setBackground (Color.green);
    b4.setFont (new Font ("Arial", Font.BOLD, 18));
    b4.setPreferredSize (new Dimension (250, 38));
    b4.setActionCommand ("4");
    b4.addActionListener (this);
    
    b5 = new JButton ("The");
    b5.setForeground (Color.blue);
    b5.setBackground (Color.green);
    b5.setFont (new Font ("Arial", Font.BOLD, 18));
    b5.setPreferredSize (new Dimension (250, 38));
    b5.setActionCommand ("5");
    b5.addActionListener (this);
    
    b6 = new JButton ("The");
    b6.setForeground (Color.blue);
    b6.setBackground (Color.green);
    b6.setFont (new Font ("Arial", Font.BOLD, 18));
    b6.setPreferredSize (new Dimension (250, 38));
    b6.setActionCommand ("6");
    b6.addActionListener (this);
    
    b7 = new JButton ("The");
    b7.setForeground (Color.blue);
    b7.setBackground (Color.green);
    b7.setFont (new Font ("Arial", Font.BOLD, 18));
    b7.setPreferredSize (new Dimension (250, 38));
    b7.setActionCommand ("7");
    b7.addActionListener (this);
   
    b8 = new JButton ("The");
    b8.setForeground (Color.blue);
    b8.setBackground (Color.green);
    b8.setFont (new Font ("Arial", Font.BOLD, 18));
    b8.setPreferredSize (new Dimension (250, 38));
    b8.setActionCommand ("8");
    b8.addActionListener (this);
    add (title);
    add (instruct);
    add (b1);
    add (b2);
    add (b3);
    add (b4);
    add (b5);
    add (b6);
    add (b7);
    setBackground (Color.white);
  }
  public void actionPerformed (ActionEvent e)
  {
    if (e.getActionCommand ().equals ("1"))
    {
      int r = (int) (Math.random () * 3);
      if (r == 0)
        b1.setText ("The");
      else if (r == 1)
        b1.setText ("A");
      else
        b1.setText ("This");
    } 
  }
}