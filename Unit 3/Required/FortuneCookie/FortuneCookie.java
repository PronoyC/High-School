//File: FortuneCookie.java
//Author: Pronoy Chaudhuri
//Date: April 22nd, 2015
//Description: Time to see your future!
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class FortuneCookie extends Applet implements ActionListener
{
    JLabel picture;
    JLabel fortune;
    JButton b1;
    public void init ()
    {
	resize (580, 425);
	JLabel title = new JLabel ("Fortune Cookie");
	title.setFont (new Font ("Arial", Font.BOLD, 36));
	picture = new JLabel (createImageIcon ("cookieClose.jpg"));
	b1 = new JButton ("Find Fortune.");
	b1.setBackground (Color.white);
	b1.setActionCommand ("1");
	b1.addActionListener (this);
	JButton b2 = new JButton ("New Cookie.");
	b2.setBackground (Color.white);
	b2.setActionCommand ("2");
	b2.addActionListener (this);
	fortune = new JLabel ("Click to find out your fortune.");
	fortune.setFont (new Font ("Arial", Font.PLAIN, 42));
	add (title);
	add (picture);
	add (fortune);
	add (b1);
	add (b2);
	setBackground (Color.white);
    }


    public void actionPerformed (ActionEvent e)
    {
	int nice = (int) (Math.random () * 10 + 1);

	if (e.getActionCommand ().equals ("1"))
	{
	    picture.setIcon (createImageIcon ("cookieOpen.jpg"));
	    if (nice == 1)
		fortune.setText ("You will be awesome");
	    else if (nice == 2)
		fortune.setText ("Your kindness is seen");
	    else if (nice == 3)
		fortune.setText ("You will meet your true love");
	    else if (nice == 4)
		fortune.setText ("You will be rich");
	    else if (nice == 5)
		fortune.setText ("You will be respected greatly");
	    else if (nice == 6)
		fortune.setText ("Your path is the right one");
	    else if (nice == 7)
		fortune.setText ("You will meet a foul end");
	    else if (nice == 8)
		fortune.setText ("Your dreams will come true");
	    else if (nice == 9)
		fortune.setText ("The true test will come soon");
	    else
		fortune.setText ("You will face your fear today");
	    b1.setActionCommand ("3");
	    b1.addActionListener (this);
	}
	else if (e.getActionCommand ().equals ("2"))
	{
	    picture.setIcon (createImageIcon ("cookieClose.jpg"));
	    fortune.setText ("Click to find out your fortune.");
	    b1.setActionCommand ("1");
	    b1.addActionListener (this);
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = FortuneCookie.class.getResource (path);
	if (imgURL != null)
	    return new ImageIcon (imgURL);
	else
	{
	    System.err.println ("Couldn't file file: " + path);
	    return null;
	}
    }
}

