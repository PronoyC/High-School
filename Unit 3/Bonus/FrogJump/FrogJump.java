//File: FrongJump.java
//Author: Pronoy Chaudhuri
//Date: April 22nd, 2015
//Description: Ribbit, Ribbit....
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet;

public class FrogJump extends Applet implements ActionListener
{
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;

    public void init ()
    {
	resize (610, 570);

	JTextArea text = new JTextArea (5, 15);
	text.setText ("Frog Jump\n");
	text.append ("\nA frog get exercise by jumping around a pond. It jumps from lily pad to lily pad in the\n");
	text.append (" sequence shown in the picture below. It starts at the lily pad labelled S. It ends on the lily\n");
	text.append ("pad as shown (i.e, the frog show has finished jumping). Each black dot marks lily pad on\n");
	text.append (" which the frog has landed.\n");
	text.append ("\nThe legend below labels each of the 8 possible directions of a jump with an integer from 0");
	text.append ("\nto 7.\n");

	JLabel picture = new JLabel (createImageIcon ("frogJump.png"));

	JTextArea text1 = new JTextArea ("Which sequence describes the frog's path?");

	b1 = new JButton ("4,1,0,0,0,6,6,4,4,2,2,1");
	b1.setActionCommand ("1");
	b1.addActionListener (this);
	b1.setBackground (Color.white);
	b1.setForeground (Color.black);

	b2 = new JButton ("0,0,6,6,6,4,4,2,2,4,4,1");
	b2.setActionCommand ("2");
	b2.addActionListener (this);
	b2.setBackground (Color.white);
	b2.setForeground (Color.black);

	b3 = new JButton ("0,0,6,6,6,0,0,2,2,2,2,4,4,4");
	b3.setActionCommand ("3");
	b3.addActionListener (this);
	b3.setBackground (Color.white);
	b3.setForeground (Color.black);

	b4 = new JButton ("6,6,4,4,4,2,4,1,1,1");
	b4.setActionCommand ("4");
	b4.addActionListener (this);
	b4.setBackground (Color.white);
	b4.setForeground (Color.black);

	add (text);
	add (picture);
	add (text1);

	Panel p = new Panel (new GridLayout (4, 1));
	p.add (b1);
	p.add (b2);
	p.add (b3);
	p.add (b4);
	add (p);
    }


    public void actionPerformed (ActionEvent e)
    {
	showStatus ("Incorrect");
	if (e.getActionCommand ().equals ("1"))
	{
	    b1.setText ("INCORRECT");
	}
	if (e.getActionCommand ().equals ("2"))
	{
	    b2.setText ("CORRECT");
	    showStatus ("Correct");
	}
	if (e.getActionCommand ().equals ("3"))
	{
	    b3.setText ("INCORRECT");
	}
	if (e.getActionCommand ().equals ("4"))
	{
	    b4.setText ("INCORRECT");
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {

	java.net.URL imgURL = FrogJump.class.getResource (path);
	if (imgURL != null)
	    return new ImageIcon (imgURL);
	else

	    System.out.println ("Couldn't find the file " + path);
	return null;
    }


    {
    }
}
