//File: RockPaperScissors.java
//Author: Pronoy Chaudhuri
//Date: April 22nd, 2015
//Description: All you need is a bit of luck!
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

public class RockPaperScissors extends Applet implements ActionListener
{
    JLabel pic, pic2, action, score;
    int rps1 = 1;
    int rps2 = 1;
    int cscore = 0;
    int uscore = 0;
    JRadioButton rock, scissors, paper;
    public void init ()
    {
	resize (700, 200);

	JLabel title = new JLabel ("Paper, Scissors, Rock Game                                                                  ");
	title.setFont (new Font ("Arial", Font.BOLD, 20));
	title.setForeground (Color.red);
	JLabel option = new JLabel ("Pick one:");

	rock = new JRadioButton ("Rock");
	rock.addActionListener (this);
	rock.setActionCommand ("rock");
	rock.setEnabled (false);
	scissors = new JRadioButton ("Scissors");
	scissors.addActionListener (this);
	scissors.setActionCommand ("scissors");
	scissors.setEnabled (false);
	paper = new JRadioButton ("Paper");
	paper.addActionListener (this);
	paper.setActionCommand ("paper");
	paper.setEnabled (false);

	ButtonGroup group = new ButtonGroup ();
	group.add (rock);
	group.add (scissors);
	group.add (paper);

	Panel p = new Panel (new GridLayout (4, 1));
	p.add (option);
	p.add (rock);
	p.add (scissors);
	p.add (paper);


	Panel s = new Panel ();
	s.setLayout (new BorderLayout ());
	s.add (title, BorderLayout.PAGE_START);
	add (s);

	JLabel choice1 = new JLabel ("Your choice:");
	pic = new JLabel (createImageIcon ("rps" + rps1 + ".jpg"));

	Panel q = new Panel (new GridLayout (1, 2));
	q.add (choice1);
	q.add (pic);

	JLabel choice2 = new JLabel ("Computer's choice:");
	pic2 = new JLabel (createImageIcon ("rps" + rps2 + ".jpg"));

	Panel r = new Panel (new GridLayout (1, 2));
	r.add (choice2);
	r.add (pic2);


	JButton play = new JButton ("Play");
	play.addActionListener (this);
	play.setActionCommand ("play");
	play.setBackground (Color.white);

	JButton reset = new JButton ("Reset Scores");
	reset.addActionListener (this);
	reset.setActionCommand ("reset");
	play.setBackground (Color.white);

	action = new JLabel ("  Press Play to Begin  ");
	action.setForeground (Color.blue);

	score = new JLabel ("Score: You - " + uscore + "  Computer - " + cscore);

	Panel v = new Panel (new GridLayout (1, 4));
	v.add (play);
	v.add (reset);
	v.add (action);
	v.add (score);
	v.setBackground (Color.yellow);

	add (p);
	add (q);
	add (r);
	add (v);



    }


    public void actionPerformed (ActionEvent e)
    {
	if ((e.getActionCommand ().equals ("play")))
	{
	    rock.setEnabled (true);
	    scissors.setEnabled (true);
	    paper.setEnabled (true);
	}

	if (e.getActionCommand ().equals ("rock") || e.getActionCommand ().equals ("scissors") || e.getActionCommand ().equals ("paper"))
	{
	    if (e.getActionCommand ().equals ("rock"))
		rps1 = 1;
	    else if (e.getActionCommand ().equals ("scissors"))
		rps1 = 2;
	    else if (e.getActionCommand ().equals ("paper"))
		rps1 = 3;
	    pic.setIcon (createImageIcon ("rps" + rps1 + ".jpg"));
	    rps2 = (int) (Math.random () * 3 + 1);
	    pic2.setIcon (createImageIcon ("rps" + rps2 + ".jpg"));

	    if (rps1 == 1 && rps2 == 1)
	    {
		cscore += 1;
		uscore += 1;
		action.setText ("   There is a tie!   ");
	    }
	    if (rps1 == 1 && rps2 == 2)
	    {
		uscore += 1;
		action.setText ("   You won.   ");
	    }
	    if (rps1 == 1 && rps2 == 3)
	    {
		cscore += 1;
		action.setText ("   The computer won.   ");
	    }
	    if (rps1 == 2 && rps2 == 1)
	    {
		cscore += 1;
		action.setText ("   The computer won.   ");
	    }
	    if (rps1 == 2 && rps2 == 2)
	    {
		cscore += 1;
		uscore += 1;
		action.setText ("   There is a tie!   ");
	    }
	    if (rps1 == 2 && rps2 == 3)
	    {
		uscore += 1;
		action.setText ("   You won.   ");
	    }
	    if (rps1 == 3 && rps2 == 1)
	    {
		uscore += 1;
		action.setText ("   You won.   ");
	    }
	    if (rps1 == 3 && rps2 == 2)
	    {
		cscore += 1;
		action.setText ("   The computer won.   ");
	    }
	    if (rps1 == 3 && rps2 == 3)
	    {
		uscore += 1;
		cscore += 1;
		action.setText ("   There is a tie!   ");
	    }

	    score.setText ("Score: You - " + uscore + "  Computer - " + cscore);
	}

	if ((e.getActionCommand ().equals ("reset")))
	{
	    uscore = 0;
	    cscore = 0;
	    score.setText ("Score: You - " + uscore + "  Computer - " + cscore);
	}

    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = RockPaperScissors.class.getResource (path);
	if (imgURL != null)
	    return new ImageIcon (imgURL);
	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }
}
