//File: CountMeIn.java
//Author: Pronoy Chaudhuri
//Date: April 22nd, 2015
//Description: Count. Me. In.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class CountMeIn extends Applet implements ActionListener
{
  int count = 0;
  JLabel num;
  public void init ()
  { 
    resize (250,300);
    JLabel instruct = new JLabel ("Count Me In");
    instruct.setFont (new Font ("Arial", Font.PLAIN, 35));
    num = new JLabel ("0");
    num.setFont (new Font ("Arial", Font.BOLD, 700));
    num.setForeground (Color.blue);
    JButton b1 = new JButton ("+");
    b1.setForeground (Color.blue);
    b1.setBackground (Color.green);
    b1.setActionCommand ("1");
    b1.addActionListener (this);
    JButton b2 = new JButton ("-");
    b2.setForeground (Color.blue);
    b2.setBackground (Color.red);
    b2.setActionCommand ("2");
    b2.addActionListener (this);
    add (instruct);
    add (num);
    add (b1);
    add (b2);
    setBackground (Color.white);
  }
  public void actionPerformed (ActionEvent e)
  {
    if (e.getActionCommand ().equals ("1"))
      count++;
    else
      count--;
    num.setText (" " +count);
  }
}