//File: RedButton.java
//Author: Pronoy Chaudhuri
//Date: April 22nd, 2015
//Description: Do not click the button!
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class RedButton extends Applet implements ActionListener
{
    JButton redbutton;
    JLabel subtitle;
    int count = 0;
    public void init ()
    {
	resize (700, 400);

	redbutton = new JButton (createImageIcon ("redButton.jpg"));
	redbutton.setActionCommand ("1");
	redbutton.addActionListener (this);
	add (redbutton);
	subtitle = new JLabel ("Do not press the red button.");
	subtitle.setFont (new Font ("Arial", Font.BOLD, 14));
	add (subtitle);
	setBackground (Color.white);
    }


    public void actionPerformed (ActionEvent e)
    {

	if (e.getActionCommand ().equals ("1"))
	{
	    count++;
	    if (count == 1)
		subtitle.setText ("*Ahem* Do NOT press the red button.");
	    else if (count == 2)
		subtitle.setText (" Don't do it.");
	    else if (count == 3)
		subtitle.setText ("Seriously.");
	    else if (count == 4)
		subtitle.setText ("Not this again.");
	    else if (count == 5)
		subtitle.setText ("... you pressed it again. Do NOT press the button.");
	    else if (count == 6)
		subtitle.setText ("...this displeases me. ");
	    else if (count == 7)
		subtitle.setText ("Quick! What's that behind you.");
	    else if (count == 8)
		subtitle.setText ("All right, press it again. See if I care.");
	    else if (count == 9)
		subtitle.setText ("Again.");
	    else if (count == 10)
		subtitle.setText ("Do it again.");
	    else if (count == 11)
		subtitle.setText ("Click it!");
	    else if (count == 12)
		subtitle.setText ("And again.");
	    else if (count == 13)
		subtitle.setText ("OK, that's enough. You've got your fill. ");
	    else if (count == 14)
		subtitle.setText ("I mean it. It's time to stop pressing it. ");
	    else if (count == 15)
		subtitle.setText ("You see, this is why we can't be friends.");
	    else if (count == 16)
		subtitle.setText ("You are just too selfish.");
	    else if (count == 17)
		subtitle.setText ("Now you've asked for it. DoNoT pReSs It AgAiN! ");
	    else if (count == 18)
		subtitle.setText ("You seem immune to my mind control. ");
	    else if (count == 19)
		subtitle.setText ("Time for plan B. Press it. You know you want to. ");
	    else if (count == 20)
		subtitle.setText ("See that was reverse psychology! Oh wait, it didn't work. ");
	    else if (count == 21)
		subtitle.setText ("Really? aren't you getting bored yet?");
	    else if (count == 22)
	    {
		subtitle.setText ("Don't you have anything else to do?");
		count = 0;
	    }

	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = RedButton.class.getResource (path);
	if (imgURL != null)
	    return new ImageIcon (imgURL);
	else
	{
	    System.err.println ("Couldn't file file: " + path);
	    return null;
	}
    }
}


