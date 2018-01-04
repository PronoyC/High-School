//File: FriendPhoto.java
//Author: Pronoy Chaudhuri
//Date: April 22nd, 2015
//Description: A friend does have many photos...
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet;

public class FriendPhoto extends Applet implements ActionListener
{
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;

    public void init ()
    {
	resize (630, 650);

	JLabel title = new JLabel ("Friend Photo                                                                                      ");

	JTextArea text = new JTextArea (5, 15);
	text.setText ("\nLucia and her friends are of an on-line social network\n");
	text.append ("\nBelow is a diagram describing the relationship among Lucia\n");
	text.append ("\nand her friends. Each line indicates a friendship.\n");

	JLabel picture = new JLabel (createImageIcon ("FriendPhotoImage.png"));

	JTextArea text1 = new JTextArea ("\nLucia sends a photo to some of her friends.\n");
	text1.append ("\nEach of those friends sends the photo to all of their friends \n");
	text1.append ("\nWhich of the following groups of friends can Lucia send her photo");
	text1.append ("\nto so that Jacob is not sent the photo?");

	b1 = new JButton ("Dana, Michael, Eve");
	b1.setActionCommand ("1");
	b1.addActionListener (this);
	b1.setBackground (Color.white);
	b1.setForeground (Color.black);

	b2 = new JButton ("Dana, Eve, Monica");
	b2.setActionCommand ("2");
	b2.addActionListener (this);
	b2.setBackground (Color.white);
	b2.setForeground (Color.black);

	b3 = new JButton ("Michael, Eve, Jacob");
	b3.setActionCommand ("3");
	b3.addActionListener (this);
	b3.setBackground (Color.white);
	b3.setForeground (Color.black);

	b4 = new JButton ("Michael, Peter, Monica");
	b4.setActionCommand ("4");
	b4.addActionListener (this);
	b4.setBackground (Color.white);
	b4.setForeground (Color.black);

	add (title);
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
	    b1.setText ("CORRECT");
	    showStatus ("Correct");
	}
	else if (e.getActionCommand ().equals ("2"))
	    b2.setText ("INCORRECT");
	else if (e.getActionCommand ().equals ("3"))
	    b3.setText ("INCORRECT");
	else
	    b4.setText ("INCORRECT");
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = FriendPhoto.class.getResource (path);
	if (imgURL != null)
	    return new ImageIcon (imgURL);
	else
	{
	    System.out.println ("Couldn't find the file " + path);
	    return null;
	}
    }
}
