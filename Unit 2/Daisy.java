//File: Daisy.java
//Author: Pronoy Chaudhuri
//Date: March 4th, 2015
//Description: They love me...They love me not...
public class Daisy
{
  public static void main (String args[])
  {
    new Daisy ();
  }
  public Daisy ()
  {
    System.out.println ("*******************");
    System.out.println ("*Do They Love You?*");
    System.out.println ("*******************\n");
    String sex = IBIO.inputString ("Is your beloved male or female? (m/f) ");
    System.out.println ("\nOkay then! Let me grab your daisy and I'll tell you the answer :D\n");
    int num = (int) (Math.random () *10) + 15;
    if (sex.equals("m"))
      sex = ("He");
    else
      sex = ("She");
    if (num%2==0)
    {
      while (num>=0)
      {
        if (num%2==0)
          System.out.println (sex + " loves me.\n");
        else
          System.out.println (sex + " loves me not.\n");
        try
        {
          Thread.sleep (100);
        }
        catch (InterruptedException m)
        {
          ;
        }
        num--;
      }
      System.out.println ("Congratulations! " +sex+ " loves you!");
    }
    else
    {
      while (num>0)
      {
        if (num%2==0)
          System.out.println (sex + " loves me.\n");
        else
          System.out.println (sex + " loves me not.\n");
        try
        {
          Thread.sleep (100);
        }
        catch (InterruptedException m)
        {
          ;
        }
        num--;
      }
      System.out.println (sex+ " does not love you. I'm so sorry.");
    }    
  }
}

