//File: Penguin.java
//Author: Pronoy Chaudhuri
//Date: April 22nd, 2015
//Description: Learn to draw!
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet;

public class Penguin extends Applet implements ActionListener
{
    JButton b1;
    JButton b2;
    JLabel picture;
    int count = 1;
    public void init ()
    {
	resize (278, 350);

	JLabel title = new JLabel ("Draw a Penguin");
	title.setFont (new Font ("Arial", Font.BOLD, 20));
	picture = new JLabel (createImageIcon ("penguin" + count + ".jpg"));

	b1 = new JButton ("Back");
	b1.setActionCommand ("1");
	b1.addActionListener (this);
	b1.setForeground (Color.white);
	b1.setBackground (Color.blue);

	b2 = new JButton ("Next");
	b2.setActionCommand ("2");
	b2.addActionListener (this);
	b2.setForeground (Color.white);
	b2.setBackground (Color.blue);

	add (title);
	add (picture);

	Panel p = new Panel (new GridLayout (4, 1));
	p.add (b1);
	p.add (b2);
	add (p);

	setBackground (Color.white);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("1"))
	{
	    count--;
	    if (count <= 0)
		count = 7;
	}
	else
	{
	    count++;
	    if (count >= 8)
		count = 1;
	}
	picture.setIcon (createImageIcon ("penguin" + count + ".jpg"));
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = Penguin.class.getResource (path);
	if (imgURL != null)
	    return new ImageIcon (imgURL);
	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }
}
