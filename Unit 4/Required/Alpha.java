//File: Alpha.java
//Name: Pronoy Chaudhuri
//Date: June 13th, 2015
// Description: ABBA!

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Alpha extends Applet implements ActionListener
{
 JTextField text;
 public void init ()
 {
 text = new JTextField (40);
 JButton a[] = new JButton [26];
 JButton b [] = new JButton [10];
 Panel g = new Panel (new GridLayout (2, 13));
 for (int i = 0 ; i < a.length ; i++)
 {
 a [i] = new JButton ("" + (char) (i + 97));
 a [i].addActionListener (this);
 a [i].setActionCommand ("" + (char) (i + 97));
 a [i].setBackground (Color.yellow);
 g.add (a [i]);
 }
 for (int j = 0 ; j < b.length ; j++)
 {
 b [j] = new JButton ("" + j);
 b [j].addActionListener (this);
 b [j].setActionCommand ("" + j );
 b [j].setBackground (Color.yellow);
 g.add (b[j]);
 }
 JButton space = new JButton ("            Spacebar            ");
 space.addActionListener (this);
 space.setActionCommand (" ");
 add (text);
 add (g);
 add (space);
 resize (900, 100);
 }
 public void actionPerformed (ActionEvent e)
 {
 text.setText (text.getText () + e.getActionCommand ());
 }
} 