//File: TextFieldPuzzles.java
//Author: Pronoy Chaudhuri
//Date: April 22nd, 2015
//Description: Puzzles w/ text fields.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class TextFieldPuzzles extends Applet implements ActionListener
{
    JTextField text;
    JTextField text1;
    JTextField text2;
    String txt;
    String txt1;
    String txt2;
    public void init ()
    {
	resize (800, 670);
	JLabel pic = new JLabel (createImageIcon ("paintThief.jpg"));
	JLabel instruct = new JLabel ("Thief's Colour: ");
	instruct.setFont (new Font ("Comic Sans MS", Font.PLAIN, 15));
	text = new JTextField (5);
	JButton b1 = new JButton ("Done");
	b1.setActionCommand ("1");
	b1.addActionListener (this);
	b1.setForeground (Color.yellow);
	b1.setBackground (Color.black);
	Panel p = new Panel ();
	p.add (pic);
	p.add (instruct);
	p.add (text);
	p.add (b1);
	add (p);

	JLabel pic1 = new JLabel (createImageIcon ("mealOrder.jpg"));
	JLabel instruct1 = new JLabel ("Order (ABC): ");
	instruct1.setFont (new Font ("Comic Sans MS", Font.PLAIN, 15));
	text1 = new JTextField (5);
	JButton b2 = new JButton ("Done");
	b2.setActionCommand ("2");
	b2.addActionListener (this);
	b2.setForeground (Color.blue);
	b2.setBackground (Color.yellow);
	Panel q = new Panel ();
	q.add (pic1);
	q.add (instruct1);
	q.add (text1);
	q.add (b2);
	add (q);

	JLabel pic2 = new JLabel (createImageIcon ("wildwest.jpg"));
	JLabel instruct2 = new JLabel ("Missing Piece Letter: ");
	instruct2.setFont (new Font ("Comic Sans MS", Font.PLAIN, 15));
	text2 = new JTextField (5);
	JButton b3 = new JButton ("Done");
	b3.setActionCommand ("3");
	b3.addActionListener (this);
	b3.setForeground (Color.black);
	b3.setBackground (Color.cyan);
	Panel r = new Panel ();
	r.add (pic2);
	r.add (instruct2);
	r.add (text2);
	r.add (b3);
	add (r);

	setBackground (Color.white);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("1"))
	{
	    txt = new String (text.getText ());
	    if (txt.equalsIgnoreCase ("red"))
		JOptionPane.showMessageDialog (null, "You got it! Great work!", "Correct", JOptionPane.INFORMATION_MESSAGE);
	    else
		JOptionPane.showMessageDialog (null, "You are incorrect, please try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
	}

	else if (e.getActionCommand ().equals ("2"))
	{
	    txt1 = new String (text1.getText ());
	    if (txt1.equalsIgnoreCase ("BCA"))
		JOptionPane.showMessageDialog (null, "You got it! Great work!", "Correct", JOptionPane.INFORMATION_MESSAGE);
	    else
		JOptionPane.showMessageDialog (null, "You are incorrect, please try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
	}

	else
	{
	    txt2 = new String (text2.getText ());
	    if (txt2.equalsIgnoreCase ("c"))
		JOptionPane.showMessageDialog (null, "You got it! Great work!", "Correct", JOptionPane.INFORMATION_MESSAGE);
	    else
		JOptionPane.showMessageDialog (null, "You are incorrect, please try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = TextFieldPuzzles.class.getResource (path);
	if (imgURL != null)
	    return new ImageIcon (imgURL);
	else
	{
	    System.err.println ("Couldn't file file: " + path);
	    return null;
	}
    }
}
