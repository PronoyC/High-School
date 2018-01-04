//File: HighRoller.java
//Author: Pronoy Chaudhuri
//Date: April 22nd, 2015
//Description: All you need is a bit of luck!
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

public class HighRoller extends Applet implements ActionListener
{
    JButton bmine, next, bcomp;
    JLabel action, score, pic, pic2;
    int dice1 = 0;
    int dice2 = 0;
    int cscore = 0;
    int uscore = 0;
    ;
    public void init ()
    {
	JLabel title = new JLabel ("High Roller");
	title.setFont (new Font ("Arial", Font.BOLD, 40));
	title.setForeground (Color.red);
	JLabel words = new JLabel ("You roll. The computer rolls. ");
	JLabel morewords = new JLabel ("Higher roll wins.");
	JLabel mine = new JLabel ("Your dice");
	mine.setFont (new Font ("Arial", Font.BOLD, 18));
	JLabel comp = new JLabel ("Comp dice");
	comp.setFont (new Font ("Arial", Font.BOLD, 18));
	pic = new JLabel (createImageIcon ("dice1.gif"));
	pic2 = new JLabel (createImageIcon ("dice2.gif"));
	bmine = new JButton ("ROLL Mine");
	bmine.setActionCommand ("1");
	bmine.addActionListener (this);
	bcomp = new JButton ("ROLL Comp");
	bcomp.setActionCommand ("2");
	bcomp.addActionListener (this);
	bcomp.setEnabled (false);
	next = new JButton ("Play again.");
	next.setActionCommand ("3");
	next.addActionListener (this);
	next.setEnabled (false);
	action = new JLabel ("Roll your dice to begin.");
	action.setFont (new Font ("Arial", Font.BOLD, 18));
	score = new JLabel ("Score -  You: " + uscore + ", Computer: " + cscore);
	add (title);
	add (words);
	add (morewords);
	Panel p = new Panel ();
	p.add (mine);
	p.add (pic);
	p.add (bmine);
	p.setBackground (Color.green);
	add (p);
	Panel p2 = new Panel ();
	p2.add (comp);
	p2.add (pic2);
	p2.add (bcomp);
	p2.setBackground (Color.yellow);
	add (p2);
	add (action);
	add (next);
	add (score);
	resize (330, 380);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("1"))
	{
	    dice1 = (int) (Math.random () * 6 + 1);
	    pic.setIcon (createImageIcon ("dice" + dice1 + ".gif"));
	    action.setText ("Now let the computer roll.");
	    bcomp.setEnabled (true);
	    bmine.setEnabled (false);
	}
	else if (e.getActionCommand ().equals ("2"))
	{
	    bcomp.setEnabled (false);
	    dice2 = (int) (Math.random () * 6 + 1);
	    pic2.setIcon (createImageIcon ("dice" + dice2 + ".gif"));
	    if (dice1 == dice2)
	    {
		action.setText ("There is a tie. One point for both of you.");
		cscore += 1;
		uscore += 1;
	    }
	    else if (dice1 > dice2)
	    {
		action.setText ("You won this time.");
		uscore += 1;
	    }
	    else
	    {
		action.setText ("The computer won this time.");
		cscore += 1;
	    }
	    next.setEnabled (true);
	    score.setText ("Score -  You: " + uscore + ", Computer: " + cscore);
	}
	else // e.getActionCommand ().equals ("3")
	{
	    bmine.setEnabled (true);
	    next.setEnabled (false);
	    action.setText ("\nRoll your dice to begin\n");
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = HighRoller.class.getResource (path);
	if (imgURL != null)
	    return new ImageIcon (imgURL);
	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }
}
