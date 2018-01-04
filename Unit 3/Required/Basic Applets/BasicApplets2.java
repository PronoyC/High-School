//File: BasicApplets1.java
//Author: Pronoy Chaudhuri
//Date: April 22nd, 2015
//Description: The basics to applets!
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class BasicApplets2 extends Applet implements ActionListener
{
  JLabel tictac;
  
  public void init ()
  {
    resize (160,500);
    JLabel title = new JLabel ("Tic-Tac-Toe!");
    title.setFont (new Font ("Arial Black", Font.BOLD, 14));
    add (title);
    
    JLabel subtitle = new JLabel ("X has the next move. Click in");
    subtitle.setFont (new Font ("Arial", Font.BOLD, 10));
    add (subtitle);
   
    JLabel subtitle2 = new JLabel ("the WORST place they could go.");
    subtitle2.setFont (new Font ("Arial", Font.BOLD, 10));
    add (subtitle2); 
              
    JButton b1 = new JButton ("1");
    b1.setFont (new Font ("Arial", Font.BOLD, 18));
    b1.setBackground (Color.gray);
    b1.addActionListener (this);
    b1.setActionCommand ("check");
    add (b1);
    
    JButton b2 = new JButton ("2");
    b2.setFont (new Font ("Arial", Font.BOLD, 18));
    b2.setBackground (Color.gray);
    b2.addActionListener (this);
    b2.setActionCommand ("check");
    add (b2);
    
    JButton b3 = new JButton ("3");
    b3.setFont (new Font ("Arial", Font.BOLD, 18));
    b3.setBackground (Color.gray);
    b3.addActionListener (this);
    b3.setActionCommand ("check");
    add (b3);
    
    JButton b4 = new JButton ("4");
    b4.setFont (new Font ("Arial", Font.BOLD, 18));
    b4.setBackground (Color.gray);
    b4.addActionListener (this);
    b4.setActionCommand ("check");
    add (b4);
    
    JButton b5 = new JButton ("O");
    b5.setFont (new Font ("Arial", Font.BOLD, 18));
    b5.setBackground (Color.red);
    b5.setForeground (Color.yellow);
    b5.addActionListener (this);
    b5.setActionCommand ("check");
    add (b5);
    
    JButton b6 = new JButton ("5");
    b6.setFont (new Font ("Arial", Font.BOLD, 18));
    b6.setBackground (Color.gray);
    b6.addActionListener (this);
    b6.setActionCommand ("check");
    add (b6);
    
    JButton b7 = new JButton ("6");
    b7.setFont (new Font ("Arial", Font.BOLD, 18));
    b7.setBackground (Color.gray);
    b7.addActionListener (this);
    b7.setActionCommand ("check");
    add (b7);
    
    JButton b8 = new JButton ("X");
    b8.setFont (new Font ("Arial", Font.BOLD, 18));
    b8.setForeground (Color.cyan);
    b8.setBackground (Color.blue);
    b8.addActionListener (this);
    b8.setActionCommand ("check");
    add (b8);
    
    JButton b9 = new JButton ("7");
    b9.setFont (new Font ("Arial", Font.BOLD, 18));
    b9.setBackground (Color.gray);
    b9.addActionListener (this);
    b9.setActionCommand ("check");
    add (b9);
    
    
    setBackground(Color.orange);
  }
  public void actionPerformed (ActionEvent e)
  {
  }
}