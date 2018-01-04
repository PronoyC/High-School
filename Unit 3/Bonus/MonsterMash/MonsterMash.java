//File: MonsterMash.java
//Author: Pronoy Chaudhuri
//Date: April 22nd, 2015
//Description: WELCOME TO THE MONSTER MASH :D
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet;

public class MonsterMash extends Applet implements ActionListener
{
    JButton b1;
    JButton b2;
    JButton b3;
    int head = 1;
    int mid = 1;
    int feet = 1;

    public void init ()
    {
	setBackground (Color.black);
	resize (400, 420);

	JLabel title = new JLabel ("Welcome to the Monster Mash");
	title.setFont (new Font ("Arial", Font.BOLD, 20));
	title.setForeground (Color.white);

	b1 = new JButton ("The");
	b1.setActionCommand ("1");
	b1.setIcon (createImageIcon ("head1.jpeg"));
	b1.addActionListener (this);
	b1.setPreferredSize (new Dimension (250, 100));

	b2 = new JButton (" ");
	b2.setIcon (createImageIcon ("mid1.jpeg"));
	b2.setActionCommand ("2");
	b2.addActionListener (this);
	b2.setPreferredSize (new Dimension (250, 100));

	b3 = new JButton (" ");
	b3.setIcon (createImageIcon ("feet1.jpeg"));
	b3.setActionCommand ("3");
	b3.addActionListener (this);
	b3.setPreferredSize (new Dimension (250, 100));

	JLabel instruct = new JLabel ("Click on the head, feet, middle to change it.");
	instruct.setFont (new Font ("Arial", Font.BOLD, 16));
	instruct.setForeground (Color.white);

	add (title);
	add (b1);
	add (b2);
	add (b3);
	add (instruct);

    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("1"))
	{
	    head++;
	    if (head == 6)
		head = 1;

	    b1.setIcon (createImageIcon ("head" + head + ".jpeg"));
	}

	if (e.getActionCommand ().equals ("2"))
	{
	    mid++;
	    if (mid == 6)
		mid = 1;

	    b2.setIcon (createImageIcon ("mid" + mid + ".jpeg"));
	}

	if (e.getActionCommand ().equals ("3"))
	{
	    feet++;
	    if (feet == 6)
		feet = 1;

	    b3.setIcon (createImageIcon ("feet" + feet + ".jpeg"));
	}

    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = MonsterMash.class.getResource (path);
	if (imgURL != null)
	    return new ImageIcon (imgURL);
	else
	{
	    System.out.println ("Couldn't find the file " + path);
	    return null;
	}
    }
}
