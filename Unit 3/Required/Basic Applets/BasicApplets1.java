//File: BasicApplets1.java
//Author: Pronoy Chaudhuri
//Date: April 22nd, 2015
//Description: The basics to applets!
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class BasicApplets1 extends Applet implements ActionListener
{
  JLabel unscramble;
  
  public void init ()
  {
    resize (420,500);
    JLabel title = new JLabel ("Unscramble!");
    title.setFont (new Font ("Ravie", Font.BOLD, 30));
    add (title);
    
    JLabel subtitle = new JLabel ("Enter the unscrambled word. Press done to check.");
    subtitle.setFont (new Font ("Arial", Font.BOLD, 14));
    add (subtitle);
    
    JLabel pass = new JLabel ("ertpuocm");
    pass.setFont (new Font ("Arial", Font.BOLD, 20));
    add (pass);
    
    JTextField field = new JTextField ("                            ");
    add (field);
        
    JButton b1 = new JButton ("Done");
    b1.setFont (new Font ("Arial", Font.BOLD, 18));
    b1.setForeground (Color.yellow);
    b1.setBackground (Color.magenta);
    b1.addActionListener (this);
    b1.setActionCommand ("check");
    add (b1);
    
    setBackground(Color.yellow);
  }
  public void actionPerformed (ActionEvent e)
  {
  }
}

    