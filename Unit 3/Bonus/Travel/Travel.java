//File: Travel.java
//Author: Pronoy Chaudhuri
//Date: April 22nd, 2015
//Description: Let's travel across the world!
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Travel extends Applet implements ActionListener
{
    Panel p_card;
    Panel card1, card2, card3, card4, card5;
    CardLayout cdLayout = new CardLayout ();
    JLabel completion1;
    JLabel completion2;
    JLabel completion3;
    JLabel completion4;
    JProgressBar progressBar;
    int progressIncreseBy = 0;


    public void init ()
    {
	p_card = new Panel ();
	p_card.setLayout (cdLayout);

	screen1 ();
	screen2 ();
	screen3 ();
	screen4 ();
	screen5 ();
	setLayout (new BorderLayout ());
	add ("Center", p_card);
	resize (660, 629);

    }


    public void progressBar ()
    {
	progressBar = new JProgressBar (0, 0, 100);
	progressBar.setValue (0);
	progressBar.setStringPainted (true);
    }


    public void screen1 ()
    {
	card1 = new Panel ();

	JLabel title = new JLabel ("Travel Puzzles");
	title.setFont (new Font ("Ravie", Font.BOLD, 36));

	JLabel pic = new JLabel (createImageIcon ("openingPic.jpg"));

	JButton b1 = new JButton ("Sophie's Picture");
	b1.setForeground (Color.blue);
	b1.setBackground (Color.green);
	b1.setActionCommand ("game 1");
	b1.addActionListener (this);

	JButton b2 = new JButton ("Swimming");
	b2.setForeground (Color.green);
	b2.setBackground (Color.blue);
	b2.setActionCommand ("game 2");
	b2.addActionListener (this);

	JButton b3 = new JButton ("Zebras");
	b3.setForeground (Color.blue);
	b3.setBackground (Color.green);
	b3.setActionCommand ("game 3");
	b3.addActionListener (this);

	JButton b4 = new JButton ("Tall Giraffes");
	b4.setForeground (Color.green);
	b4.setBackground (Color.blue);
	b4.setActionCommand ("game 4");
	b4.addActionListener (this);

	progressBar ();

	card1.add (title);
	card1.add (pic);
	card1.add (b1);
	card1.add (b2);
	card1.add (b3);
	card1.add (b4);
	card1.add (b4);
	card1.add (progressBar);

	p_card.add ("1", card1);

    }


    public void screen2 ()
    {
	card2 = new Panel ();

	JLabel title = new JLabel ("Sophie's Picture");
	title.setFont (new Font ("Ravie", Font.BOLD, 36));

	completion1 = new JLabel ("           This puzzle is not complete.          ");
	completion1.setFont (new Font ("Arial", Font.PLAIN, 20));

	JLabel instruct = new JLabel ("  Which photo has Sophie taken?");
	instruct.setFont (new Font ("Arial", Font.PLAIN, 20));

	JButton b1 = new JButton ("Back");
	b1.setActionCommand ("back");
	b1.addActionListener (this);

	JLabel pic = new JLabel (createImageIcon ("sophie.jpg"));
	pic.setPreferredSize (new Dimension (600, 325));

	JButton b2 = new JButton ("");
	b2.setIcon (createImageIcon ("sophie1.jpg"));
	b2.setPreferredSize (new Dimension (210, 170));
	b2.setActionCommand ("opt1");
	b2.addActionListener (this);

	JButton b3 = new JButton ("");
	b3.setIcon (createImageIcon ("sophie2.jpg"));
	b3.setPreferredSize (new Dimension (210, 170));
	b3.setActionCommand ("opt2");
	b3.addActionListener (this);

	JButton b4 = new JButton ("");
	b4.setIcon (createImageIcon ("sophie3.jpg"));
	b4.setPreferredSize (new Dimension (210, 170));
	b4.setActionCommand ("opt3");
	b4.addActionListener (this);

	card2.add (title);
	card2.add (completion1);
	card2.add (instruct);
	card2.add (b1);
	card2.add (pic);
	card2.add (b2);
	card2.add (b3);
	card2.add (b4);
	card2.setBackground (Color.yellow);
	p_card.add ("2", card2);

    }


    public void screen3 ()
    {
	card3 = new Panel ();

	JLabel title = new JLabel ("Swimming ");
	title.setFont (new Font ("Ravie", Font.BOLD, 36));

	completion2 = new JLabel ("             This puzzle is not complete.            ");
	completion2.setFont (new Font ("Arial", Font.PLAIN, 20));

	JLabel instruct = new JLabel ("Click on the piece that completes the picture.");
	instruct.setFont (new Font ("Arial", Font.PLAIN, 20));

	JButton b1 = new JButton ("Back");
	b1.setActionCommand ("back");
	b1.addActionListener (this);

	JLabel pic = new JLabel (createImageIcon ("swimmming.jpg"));
	pic.setPreferredSize (new Dimension (600, 325));

	JButton b2 = new JButton ("");
	b2.setIcon (createImageIcon ("swimmming1.jpg"));
	b2.setActionCommand ("2opt1");
	b2.addActionListener (this);

	JButton b3 = new JButton ("");
	b3.setIcon (createImageIcon ("swimmming2.jpg"));
	b3.setActionCommand ("2opt2");
	b3.addActionListener (this);

	JButton b4 = new JButton ("");
	b4.setIcon (createImageIcon ("swimmming3.jpg"));
	b4.setActionCommand ("2opt3");
	b4.addActionListener (this);

	JButton b5 = new JButton ("");
	b5.setIcon (createImageIcon ("swimmming4.jpg"));
	b5.setActionCommand ("2opt4");
	b5.addActionListener (this);

	card3.add (title);
	card3.add (completion2);
	card3.add (instruct);
	card3.add (pic);
	card3.add (b2);
	card3.add (b3);
	card3.add (b4);
	card3.add (b5);
	card3.add (b1);

	card3.setBackground (Color.green);
	p_card.add ("3", card3);

    }


    public void screen4 ()
    {
	card4 = new Panel ();

	JLabel title = new JLabel ("  Zebras  ");
	title.setFont (new Font ("Ravie", Font.BOLD, 36));

	completion3 = new JLabel ("                This puzzle is not complete.               ");
	completion3.setFont (new Font ("Arial", Font.PLAIN, 20));

	JLabel instruct = new JLabel ("   Look carefully. Click on the zebra that is different.   ");
	instruct.setFont (new Font ("Arial", Font.PLAIN, 20));

	JButton b1 = new JButton ("Back");
	b1.setActionCommand ("back");
	b1.addActionListener (this);

	JButton b2 = new JButton ("");
	b2.setIcon (createImageIcon ("zebra1.jpg"));
	b2.setPreferredSize (new Dimension (220, 190));
	b2.setActionCommand ("3opt1");
	b2.addActionListener (this);

	JButton b3 = new JButton ("");
	b3.setIcon (createImageIcon ("zebra2.jpg"));
	b3.setPreferredSize (new Dimension (220, 190));
	b3.setActionCommand ("3opt2");
	b3.addActionListener (this);

	JButton b4 = new JButton ("");
	b4.setIcon (createImageIcon ("zebra3.jpg"));
	b4.setPreferredSize (new Dimension (220, 190));
	b4.setActionCommand ("3opt3");
	b4.addActionListener (this);

	JButton b5 = new JButton ("");
	b5.setIcon (createImageIcon ("zebra4.jpg"));
	b5.setPreferredSize (new Dimension (220, 190));
	b5.setActionCommand ("3opt4");
	b5.addActionListener (this);

	card4.add (title);
	card4.add (completion3);
	card4.add (instruct);
	card4.add (b2);
	card4.add (b3);
	card4.add (b4);
	card4.add (b5);
	card4.add (b1);
	card4.setBackground (Color.LIGHT_GRAY);

	p_card.add ("4", card4);

    }


    public void screen5 ()
    {
	card5 = new Panel ();

	JLabel title = new JLabel (" Tall Giraffes ");
	title.setFont (new Font ("Ravie", Font.BOLD, 36));

	completion4 = new JLabel ("           This puzzle is not complete.          ");
	completion4.setFont (new Font ("Arial", Font.PLAIN, 20));

	JLabel instruct = new JLabel ("         Look carefully. Click on the tallest girrafe.       ");
	instruct.setFont (new Font ("Arial", Font.PLAIN, 20));

	JButton b1 = new JButton ("Back");
	b1.setActionCommand ("back");
	b1.addActionListener (this);

	JButton b2 = new JButton ("");
	b2.setIcon (createImageIcon ("giraffe1.jpg"));
	b2.setActionCommand ("4opt1");
	b2.addActionListener (this);

	JButton b3 = new JButton ("");
	b3.setIcon (createImageIcon ("giraffe2.jpg"));
	b3.setActionCommand ("4opt2");
	b3.addActionListener (this);

	JButton b4 = new JButton ("");
	b4.setIcon (createImageIcon ("giraffe3.jpg"));
	b4.setActionCommand ("4opt3");
	b4.addActionListener (this);


	card5.add (title);
	card5.add (completion4);
	card5.add (instruct);
	card5.add (b2);
	card5.add (b3);
	card5.add (b4);
	card5.add (b1);

	card5.setBackground (Color.orange);
	p_card.add ("5", card5);
    }




    public void actionPerformed (ActionEvent e)
    {
	{
	    if (e.getActionCommand ().equals ("back"))
		cdLayout.show (p_card, "1");
	}
	{
	    if (e.getActionCommand ().equals ("game 1"))
		cdLayout.show (p_card, "2");
	}
	{
	    if (e.getActionCommand ().equals ("game 2"))
		cdLayout.show (p_card, "3");
	}
	{
	    if (e.getActionCommand ().equals ("game 3"))
		cdLayout.show (p_card, "4");
	}
	{
	    if (e.getActionCommand ().equals ("game 4"))
		cdLayout.show (p_card, "5");
	}
	{
	    if (e.getActionCommand ().equals ("opt1"))
	    {
		JOptionPane.showMessageDialog (null, "You are incorrect, please try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
	    }

	    if (e.getActionCommand ().equals ("opt2"))
	    {
		JOptionPane.showMessageDialog (null, "You are incorrect, please try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
	    }
	    if (e.getActionCommand ().equals ("opt3"))
	    {
		JOptionPane.showMessageDialog (null, "You got it! Great work!", "Correct", JOptionPane.INFORMATION_MESSAGE);
		completion1.setText ("             This puzzle is complete.            ");
		completion1.setForeground (Color.green);
		progressIncreseBy += 25;
		progressBar.setValue (progressIncreseBy);
	    }

	}
	{
	    if (e.getActionCommand ().equals ("2opt1"))
	    {
		JOptionPane.showMessageDialog (null, "You are incorrect, please try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
	    }

	    if (e.getActionCommand ().equals ("2opt2"))
	    {
		JOptionPane.showMessageDialog (null, "You are incorrect, please try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
	    }
	    if (e.getActionCommand ().equals ("2opt3"))
	    {
		JOptionPane.showMessageDialog (null, "You got it! Great work!", "Correct", JOptionPane.INFORMATION_MESSAGE);
		completion2.setText ("             This puzzle is complete.            ");
		completion2.setForeground (Color.black);
		progressIncreseBy += 25;
		progressBar.setValue (progressIncreseBy);
	    }
	    if (e.getActionCommand ().equals ("2opt4"))
	    {
		JOptionPane.showMessageDialog (null, "You are incorrect, please try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
	    }
	}
	{
	    if (e.getActionCommand ().equals ("3opt1"))
	    {
		JOptionPane.showMessageDialog (null, "You are incorrect, please try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
	    }

	    if (e.getActionCommand ().equals ("3opt2"))
	    {
		JOptionPane.showMessageDialog (null, "You are incorrect, please try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
	    }
	    if (e.getActionCommand ().equals ("3opt3"))
	    {
		JOptionPane.showMessageDialog (null, "You got it! Great work!", "Correct", JOptionPane.INFORMATION_MESSAGE);
		completion3.setText ("                This puzzle is complete.               ");
		completion3.setForeground (Color.green);
		progressIncreseBy += 25;
		progressBar.setValue (progressIncreseBy);
	    }
	    if (e.getActionCommand ().equals ("3opt4"))
	    {
		JOptionPane.showMessageDialog (null, "You are incorrect, please try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
	    }
	}
	{
	    if (e.getActionCommand ().equals ("4opt1"))
	    {
		JOptionPane.showMessageDialog (null, "You got it! Great work!", "Correct", JOptionPane.INFORMATION_MESSAGE);
		completion4.setText ("             This puzzle is complete.            ");
		completion4.setForeground (Color.green);
		progressIncreseBy += 25;
		progressBar.setValue (progressIncreseBy);
	    }

	    if (e.getActionCommand ().equals ("4opt2"))
	    {
		JOptionPane.showMessageDialog (null, "You are incorrect, please try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
	    }
	    if (e.getActionCommand ().equals ("4opt3"))
	    {
		JOptionPane.showMessageDialog (null, "You are incorrect, please try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
	    }
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = Travel.class.getResource (path);
	if (imgURL != null)
	    return new ImageIcon (imgURL);
	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }
}
