import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet;

public class Dice extends Applet implements ActionListener
{
  
  JLabel picture = new JLabel (createImageIcon ("dice1.gif"));
  
  public void init ()
  {
    resize (300, 200);
    JLabel title = new JLabel ("Click to Roll the Dice");
    title.setFont (new Font ("Arial", Font.BOLD, 20));
    title.setForeground (Color.red);
    
    picture = new JLabel (createImageIcon ("dice1.gif"));
    
    JButton roll = new JButton ("Roll");
    roll.setFont (new Font ("Arial", Font.BOLD, 20));
    roll.addActionListener (this);
    roll.setActionCommand ("roll");
    
    add (title);
    add (picture);
    add (roll);
  }
  
  
  public void actionPerformed (ActionEvent e)
  {
    if (e.getActionCommand ().equals ("roll"))
    {
      int n = (int) ((Math.random () * 6) + 1);
      if (n == 1)
        picture.setIcon (createImageIcon ("dice1.gif"));
      else if (n == 2)
        picture.setIcon (createImageIcon ("dice2.gif"));
      else if (n == 3)
        picture.setIcon (createImageIcon ("dice3.gif"));
      else if (n == 4)
        picture.setIcon (createImageIcon ("dice4.gif"));
      else if (n == 5)
        picture.setIcon (createImageIcon ("dice5.gif"));
      else
        picture.setIcon (createImageIcon ("dice6.gif"));
      
    }
    
  }
  
  
  protected static ImageIcon createImageIcon (String path)
  {
    java.net.URL imgURL = Dice.class.getResource (path);
    if (imgURL != null)
      return new ImageIcon (imgURL);
    else
    {
      System.err.println ("Couldn't find file: " + path);
      return null;
    }
  }
}