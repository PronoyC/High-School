public class Nim
{
  public static void main (String args[])
  {
    new Nim ();
  }
  
  public Nim ()
  {
    char again = 'y';
    rules ();
    while (again == 'y')
    {
      int left = 15;
      int player = 2;
      String name1 = getName (1);
      String name2 = getName (2);
      
      while (left > 0)
      {
        if (player == 1)
          player = 2;
        else
          player = 1;
        drawLeft (left);
        whoseturn (player, name1, name2);
        left = turn (left);
      }
      whosewon (player, name1, name2);
      again = IBIO.inputChar ("Play again? (y/n) ");
    }
    System.out.println("\nThanks for playing the Game of Nim!");
  }
  
  
  public void rules ()
  {
    System.out.println ("Game of Nim");
    System.out.println ("There are 15 stones in the pile. Players take turns taking stones.");
    System.out.println ("Once each turn, they can take one or two stones. The player who");
    System.out.println ("takes the last stone loses.");    
  }
  
  
  public String getName (int num)
  { 
    String name = IBIO.inputString ("Player #" +num+ ": Enter your name: ");
    return "name";
  }
  
  
  public void drawLeft (int left)
  { 
    System.out.println ("");
    System.out.println ("Stones Remaining: " +left+ "\n");
    for (int i = 0; i<=left; i++)
    {
      System.out.print ("*");
    }
  }
  
  
  public void whoseturn (int player, String name1, String name2)
  { 
    if (player==1)
      System.out.println ("It is now " +name1+ "'s turn.");
    else
      System.out.println ("It is now " +name2+ "'s turn.");    
  }
  
  
  public boolean isValid (int num, int left)
  { 
    if (num>left)
      return false;
    if (num == 1)
      return true;
    else if (num == 2)
      return true;
    else 
      return false;
  }
  
  
  public int turn (int left)
  {
    int amt = IBIO.inputInt ("How enter stones do you want to remove? ");
    while (!isValid (amt, left))
    {
      System.out.println ("That amount is invalid. Try a smaller number.");
      amt = IBIO.inputInt ("How enter stones do you want to remove? ");
    }
    return (left - amt);
  }
  
  
  public void whosewon (int player, String name1, String name2)
  { 
    if (player==1)
      System.out.println (name1+ " has lost. " +name2+ " forced them to take the last stone.");
    else
      System.out.println (name2+ " has lost. " +name1+ " forced them to take the last stone.");
  }
}
