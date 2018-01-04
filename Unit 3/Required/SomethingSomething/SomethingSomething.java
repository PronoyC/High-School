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

	b2 = new JButton ("Beautiful");
	b2.setForeground (Color.magenta);
	b2.setBackground (Color.black);
	b2.setFont (new Font ("Arial", Font.BOLD, 18));
	b2.setPreferredSize (new Dimension (250, 38));
	b2.setActionCommand ("2");
	b2.addActionListener (this);

	b3 = new JButton ("Dragon");
	b3.setForeground (Color.blue);
	b3.setBackground (Color.pink);
	b3.setFont (new Font ("Arial", Font.BOLD, 18));
	b3.setPreferredSize (new Dimension (250, 38));
	b3.setActionCommand ("3");
	b3.addActionListener (this);

	b4 = new JButton ("Crawled");
	b4.setForeground (Color.yellow);
	b4.setBackground (Color.red);
	b4.setFont (new Font ("Arial", Font.BOLD, 18));
	b4.setPreferredSize (new Dimension (250, 38));
	b4.setActionCommand ("4");
	b4.addActionListener (this);

	b5 = new JButton ("From");
	b5.setForeground (Color.magenta);
	b5.setBackground (Color.blue);
	b5.setFont (new Font ("Arial", Font.BOLD, 18));
	b5.setPreferredSize (new Dimension (250, 38));
	b5.setActionCommand ("5");
	b5.addActionListener (this);

	b6 = new JButton ("The");
	b6.setForeground (Color.green);
	b6.setBackground (Color.magenta);
	b6.setFont (new Font ("Arial", Font.BOLD, 18));
	b6.setPreferredSize (new Dimension (250, 38));
	b6.setActionCommand ("6");
	b6.addActionListener (this);

	b7 = new JButton ("Crooked");
	b7.setForeground (Color.blue);
	b7.setBackground (Color.yellow);
	b7.setFont (new Font ("Arial", Font.BOLD, 18));
	b7.setPreferredSize (new Dimension (250, 38));
	b7.setActionCommand ("7");
	b7.addActionListener (this);

	b8 = new JButton ("Trunk");
	b8.setForeground (Color.magenta);
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
	add (b8);
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

	else if (e.getActionCommand ().equals ("2"))
	{
	    int r = (int) (Math.random () * 6);
	    if (r == 0)
		b2.setText ("Beautiful");
	    else if (r == 1)
		b2.setText ("Tall");
	    else if (r == 2)
		b2.setText ("Green");
	    else if (r == 3)
		b2.setText ("Silent");
	    else if (r == 4)
		b2.setText ("Old");
	    else
		b2.setText ("Expensive");
	}

	else if (e.getActionCommand ().equals ("3"))
	{
	    int r = (int) (Math.random () * 4);
	    if (r == 0)
		b3.setText ("Dragon");
	    else if (r == 1)
		b3.setText ("Boy");
	    else if (r == 2)
		b3.setText ("Wheat");
	    else
		b3.setText ("Policy");
	}

	else if (e.getActionCommand ().equals ("4"))
	{
	    int r = (int) (Math.random () * 6);
	    if (r == 0)
		b4.setText ("Crawled");
	    else if (r == 1)
		b4.setText ("Arrived");
	    else if (r == 2)
		b4.setText ("Slithered");
	    else if (r == 3)
		b4.setText ("Bounced");
	    else if (r == 4)
		b4.setText ("Dashed");
	    else
		b4.setText ("Flew");
	}

	else if (e.getActionCommand ().equals ("5"))
	{
	    int r = (int) (Math.random () * 4);
	    if (r == 0)
		b5.setText ("From");
	    else if (r == 1)
		b5.setText ("By");
	    else if (r == 2)
		b5.setText ("To");
	    else
		b5.setText ("Near");
	}

	else if (e.getActionCommand ().equals ("6"))
	{
	    int r = (int) (Math.random () * 3);
	    if (r == 0)
		b6.setText ("The");
	    else if (r == 1)
		b6.setText ("A");
	    else
		b6.setText ("This");
	}

	else if (e.getActionCommand ().equals ("7"))
	{
	    int r = (int) (Math.random () * 5);
	    if (r == 0)
		b7.setText ("Crooked");
	    else if (r == 1)
		b7.setText ("Stunning");
	    else if (r == 2)
		b7.setText ("Wonderful");
	    else if (r == 3)
		b7.setText ("Dreadful");
	    else
		b7.setText ("Dingy");
	}

	else
	{
	    int r = (int) (Math.random () * 6);
	    if (r == 0)
		b8.setText ("Trunk");
	    else if (r == 1)
		b8.setText ("Cave");
	    else if (r == 2)
		b8.setText ("Rock");
	    else if (r == 3)
		b8.setText ("Skyscraper");
	    else if (r == 4)
		b8.setText ("Fence");
	    else
		b8.setText ("Baseball Diamond");
	}
    }
}
