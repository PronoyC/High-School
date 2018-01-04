//File: FindMe.java
//Author: Pronoy Chaudhuri
//Date: April 22nd, 2015
//Description: Try and find me :D
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class FindMe extends Applet implements ActionListener
{
    Panel p_card;
    JButton back;
    CardLayout cdLayout = new CardLayout ();
    Panel card1, card2, card3, card4, card5, card6;

    public void init ()
    {
	p_card = new Panel ();
	p_card.setLayout (cdLayout);
	resize (500, 725);
	setLayout (new BorderLayout ());
	add ("Center", p_card);
	screen1 ();
	screen2 ();
	screen3 ();
	screen4 ();
	screen5 ();
	screen6 ();
    }


    public void screen1 ()
    {
	card1 = new Panel ();
	JLabel title = new JLabel ("Find Me!");
	title.setFont (new Font ("Arial", Font.BOLD, 56));
	title.setForeground (Color.red);
	JLabel picture = new JLabel (createImageIcon ("hallRoom.jpg"));
	JLabel subtitle = new JLabel ("You are in the main hall.");
	subtitle.setFont (new Font ("Arial", Font.BOLD, 36));
	subtitle.setForeground (Color.blue);
	JLabel clue = new JLabel ("Look throughout my house to find me.");
	JButton b1 = new JButton ("Bedroom");
	b1.setBackground (Color.white);
	b1.setActionCommand ("bed");
	b1.addActionListener (this);

	JButton b2 = new JButton ("Dining Room");
	b2.setBackground (Color.white);
	b2.setActionCommand ("dine");
	b2.addActionListener (this);

	JButton b3 = new JButton ("Living Room");
	b3.setBackground (Color.white);
	b3.setActionCommand ("live");
	b3.addActionListener (this);

	JButton b4 = new JButton ("Study");
	b4.setBackground (Color.white);
	b4.setActionCommand ("study");
	b4.addActionListener (this);
	setBackground (Color.white);

	JButton b5 = new JButton ("Ballroom");
	b5.setBackground (Color.white);
	b5.setActionCommand ("ball");
	b5.addActionListener (this);
	setBackground (Color.white);


	card1.add (title);
	card1.add (picture);
	card1.add (subtitle);
	card1.add (clue);

	Panel p = new Panel ();
	p.add (b1);
	p.add (b2);
	p.add (b3);
	p.add (b4);
	p.add (b5);
	card1.add (p);
	p_card.add ("1", card1);
    }


    public void screen2 ()
    {
	card2 = new Panel ();
	JLabel title = new JLabel ("Bedroom");
	title.setFont (new Font ("Arial", Font.BOLD, 56));
	title.setForeground (Color.red);
	JLabel picture = new JLabel (createImageIcon ("bedRoom.jpg"));
	JLabel subtitle = new JLabel ("You are in the bedroom.");
	subtitle.setFont (new Font ("Arial", Font.BOLD, 36));
	subtitle.setForeground (Color.blue);
	JLabel clue = new JLabel ("                I'm not here! Keep looking.                ");
	JButton back = new JButton (createImageIcon ("hallRoom2.jpg"));
	back.setText ("Back to main hall");
	back.setBackground (Color.white);
	back.setActionCommand ("back");
	back.addActionListener (this);
	setBackground (Color.white);

	card2.add (title);
	card2.add (picture);
	card2.add (subtitle);
	card2.add (clue);
	card2.add (back);

	Panel p = new Panel ();
	card2.add (p);
	p_card.add ("2", card2);
    }


    public void screen3 ()
    {
	card3 = new Panel ();
	JLabel title = new JLabel ("Dining Room");
	title.setFont (new Font ("Arial", Font.BOLD, 56));
	title.setForeground (Color.red);
	JLabel picture = new JLabel (createImageIcon ("diningRoom.jpg"));
	JLabel subtitle = new JLabel ("You are in the dining room.");
	subtitle.setFont (new Font ("Arial", Font.BOLD, 36));
	subtitle.setForeground (Color.blue);
	JLabel clue = new JLabel ("                I was here! Good Job!                ");
	JButton back = new JButton (createImageIcon ("hallRoom2.jpg"));
	back.setText ("Back to main hall");
	back.setBackground (Color.white);
	back.setActionCommand ("back");
	back.addActionListener (this);
	setBackground (Color.white);

	card3.add (title);
	card3.add (picture);
	card3.add (subtitle);
	card3.add (clue);
	card3.add (back);

	Panel p = new Panel ();
	card3.add (p);
	p_card.add ("3", card3);
    }


    public void screen4 ()
    {
	card4 = new Panel ();
	JLabel title = new JLabel ("Living Room");
	title.setFont (new Font ("Arial", Font.BOLD, 56));
	title.setForeground (Color.red);
	JLabel picture = new JLabel (createImageIcon ("livingRoom.jpg"));
	JLabel subtitle = new JLabel ("You are in the living room.");
	subtitle.setFont (new Font ("Arial", Font.BOLD, 36));
	subtitle.setForeground (Color.blue);
	JLabel clue = new JLabel ("                I'm not here! Keep looking.                ");
	JButton back = new JButton (createImageIcon ("hallRoom2.jpg"));
	back.setText ("Back to main hall");
	back.setBackground (Color.white);
	back.setActionCommand ("back");
	back.addActionListener (this);
	setBackground (Color.white);

	card4.add (title);
	card4.add (picture);
	card4.add (subtitle);
	card4.add (clue);
	card4.add (back);

	Panel p = new Panel ();
	card4.add (p);
	p_card.add ("4", card4);
    }


    public void screen5 ()
    {
	card5 = new Panel ();
	JLabel title = new JLabel ("     Study     ");
	title.setFont (new Font ("Arial", Font.BOLD, 56));
	title.setForeground (Color.red);
	JLabel picture = new JLabel (createImageIcon ("studyRoom.jpg"));
	JLabel subtitle = new JLabel ("You are in the study room.");
	subtitle.setFont (new Font ("Arial", Font.BOLD, 36));
	subtitle.setForeground (Color.blue);
	JLabel clue = new JLabel ("                I'm not here! Keep looking.                ");
	JButton back = new JButton (createImageIcon ("hallRoom2.jpg"));
	back.setText ("Back to main hall");
	back.setBackground (Color.white);
	back.setActionCommand ("back");
	back.addActionListener (this);
	setBackground (Color.white);

	card5.add (title);
	card5.add (picture);
	card5.add (subtitle);
	card5.add (clue);
	card5.add (back);

	Panel p = new Panel ();
	card5.add (p);
	p_card.add ("5", card5);
    }


    public void screen6 ()
    {
	card6 = new Panel ();
	JLabel title = new JLabel ("Ballroom");
	title.setFont (new Font ("Arial", Font.BOLD, 56));
	title.setForeground (Color.red);
	JLabel picture = new JLabel (createImageIcon ("ballRoom.jpg"));
	JLabel subtitle = new JLabel ("You are in the ballroom.");
	subtitle.setFont (new Font ("Arial", Font.BOLD, 36));
	subtitle.setForeground (Color.blue);
	JLabel clue = new JLabel ("                I'm not here! Keep looking.                ");
	JButton back = new JButton (createImageIcon ("hallRoom2.jpg"));
	back.setText ("Back to main hall");
	back.setBackground (Color.white);
	back.setActionCommand ("back");
	back.addActionListener (this);
	setBackground (Color.white);

	card6.add (title);
	card6.add (picture);
	card6.add (subtitle);
	card6.add (clue);
	card6.add (back);

	Panel p = new Panel ();
	card6.add (p);
	p_card.add ("6", card6);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("bed"))
	    cdLayout.show (p_card, "2");
	else if (e.getActionCommand ().equals ("dine"))
	    cdLayout.show (p_card, "3");
	else if (e.getActionCommand ().equals ("live"))
	    cdLayout.show (p_card, "4");
	else if (e.getActionCommand ().equals ("study"))
	    cdLayout.show (p_card, "5");
	else if (e.getActionCommand ().equals ("ball"))
	    cdLayout.show (p_card, "6");
	else if (e.getActionCommand ().equals ("back"))
	    cdLayout.show (p_card, "1");
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = FindMe.class.getResource (path);
	if (imgURL != null)
	    return new ImageIcon (imgURL);
	else
	{
	    System.err.println ("Couldn't file file: " + path);
	    return null;
	}
    }
}
