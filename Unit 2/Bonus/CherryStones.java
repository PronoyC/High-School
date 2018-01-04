//File: CherryStones.java
//Author: Pronoy Chaudhuri
//Date: March 12th, 2015
//Description: Wait, cherries have stones?!
public class CherryStones
{
  public static void main (String args[])
  {
    new CherryStones ();
  }   
  public CherryStones ()
  {
    int num = (int) (Math.random () *35) + 10;
    for (int i = 1 ; i <=num ; i++)
    {
      if (i % 8 == 0)
        System.out.println ("Athlete");
      else if (i % 8 == 1)
        System.out.println ("President");
      else if (i % 8 == 2)
        System.out.println ("Scientist");
      else if (i % 8 == 3)
        System.out.println ("Rich");
      else if (i % 8 == 4)
        System.out.println ("Gambler");
      else if (i % 8 == 5)
        System.out.println ("CEO");
      else if (i % 8 == 6) 
        System.out.println ("Thug"); 
      else
        System.out.println ("Lawyer");
      try
      {
        Thread.sleep (100);
      }
      catch (InterruptedException m)
      {
        ;
      }
      
    }
  }
}



