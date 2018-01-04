//File: RockPaperScissors.java
//Author: Pronoy Chaudhuri
//Date: March 12th, 2015
//Description: Rock, Paper, Scissors, Chocolate? This game is very confusing....
public class RockPaperScissors
{
  public static void main (String args[])
  {
    new RockPaperScissors ();
  }
  public RockPaperScissors ()
  {
    int cPoint = 0;
    int uPoint = 0;
    int game = 1;
    char playAgain = 'y';
    System.out.println ("-----Rock, Paper, Scissors------\n");
    while (playAgain == 'y')
    {
      char user = userChoice ();
      System.out.println ("You have selected " + user);
      char comp = compChoice ();
      System.out.println ("The computer has selected " + comp);
      char win = winner (comp, user);
      if (win == 'c')
      {
        cPoint++;
        System.out.println ("\nSorry, but the computer won.");
      }
      else if (win == 'u')
      {
        uPoint++;
        System.out.println ("\nCongratulations, you won!");
      }
      else
        System.out.println ("\nThere is a tie!");
      System.out.println ("Points: You: " + uPoint + " Computer: " + cPoint);
      playAgain = IBIO.inputChar ("\nPlay again? (y/n) ");
      System.out.println ("");
    }
    System.out.println ("Goodbye!");
  }
  
  public boolean isValid (String c)
  {
    if (c.equals ("Rock") || c.equals ("ROCK") || c.equals ("rock") || c.equals ("r") || c.equals ("R"))
      return true;
    else if (c.equals ("Scissors") || c.equals ("scissors") || c.equals ("SCISSORS") || c.equals ("s") || c.equals ("S"))
      return true;
    else if (c.equals ("PAPER") || c.equals ("paper") || c.equals ("Paper") || c.equals ("p") || c.equals ("P"))
      return true; 
    else
      return false;
  }
  
  public char userChoice ()
  {  
    String input = IBIO.inputString ("Rock, Paper, or Scissors? ");
    char output = 'n'; 
    while (!isValid(input))
    {
      System.out.println ("That is not a valid input.");
      input = IBIO.inputString ("Rock, Paper, or Scissors? ");
    }
    
    if (input.equals ("Rock") || input.equals ("ROCK") || input.equals ("rock") || input.equals ("r") || input.equals ("R"))
      output = 'r';
    else if (input.equals ("PAPER") || input.equals ("paper") || input.equals ("Paper") || input.equals ("p") || input.equals ("P"))
      output = 'p';
    else    
      output = 's';
    
    return output;
  }
  
  public char compChoice ()
  {
    int num = (int) (Math.random () * 2 + 1);
    
    if (num == 1)
      return 'r';
    else if (num == 2)
      return 's';
    else
      return 'p';
  }
  
  public char winner (char comp, char user)
  { 
    if (comp == 'r' && user == 'r' || comp == 'p' && user == 'p' || comp == 's' && comp == 's')
      return 'b';
    else if (comp == 'r' && user == 's' || comp == 'p' && user == 'r' || comp == 's' && comp == 'p')
      return 'c';
    else
      return 'u';
  }
}


