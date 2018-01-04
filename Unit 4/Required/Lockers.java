//Name: Lockers.java
//Date: June 4th, 2015
//Author: Pronoy Chaudhuri
//Description: Time to lock shop up!
public class Lockers
{
  public static void main (String args[])
  {
    new Lockers ();
  }
  
  
  public Lockers ()
  {
    int combin [] = new int [12];
    String first [] = new String [12];
    String last [] = new String [12];
    
    char choice = 'e';
    while (choice != 'q')
    {
      System.out.println ("What would you like to do?");
      System.out.println ("(a) give out a locker");
      System.out.println ("(b) print out all lockers");
      System.out.println ("(c) find out how many lockers are left");
      System.out.println ("(d) take back a locker");
      System.out.println ("(e) who is using the locker?");
      System.out.println ("(q) quit");
      choice = IBIO.inputChar (">> ");
      if (choice == 'a')
        giveOutLocker (combin, first, last);
      else if (choice == 'b')
        printOutAllLockers (combin, first, last);
      else if (choice == 'c')
        findHowMany (combin, first, last);
      else if (choice == 'd')
        takeBackLocker (combin, first, last);
      else if (choice == 'e')
        whoIsUsing (combin, first, last);
    }
  }
  public void giveOutLocker (int combin[], String first[], String last[])
  {
    System.out.println ("\n************Give out a Locker************\n");
    int num = IBIO.inputInt ("Which locker number would you like? ");
    combin [num] = IBIO.inputInt ("What is the combination? (no dashes only #s) ");
    first [num] = IBIO.inputString ("What is the first name? ");
    last [num] = IBIO.inputString ("What is the last name? ");
  }
  public void printOutAllLockers (int combin[], String first[], String last[])
  {
    System.out.println ("\n************Print out all lockers************\n");
    for (int i = 0; i < combin.length ; i++)
    {
      System.out.println (i + " .  " + first [i] + " " + last [i] + " " + combin [i]);
    }
  }
  public void findHowMany (int combin[], String first[], String last[])
  {
    System.out.println ("\n************Find out how many************");
    int count = 0;
    for (int i = 0; i < combin.length ; i++)
    {
      if (combin [i] == 0)
        count++;
    }
    System.out.println ("There are " + count + " free lockers.");
    System.out.println ((combin.length - count) + " locker(s) is/are used.");
  }
  public void takeBackLocker (int combin[], String first[], String last[])
  {
    System.out.println ("\n************Take Back a Locker************\n");
    char correct = 'n';
    int i = 0;
    while (correct != 'y' && correct != 'q')
    {
      i = IBIO.inputInt ("Which locker number would you like to take back? ");
      System.out.println ("In locker #" + i + " is " + first [i] + " " + last [i] + ", " + combin [i]);
      correct = IBIO.inputChar ("Correct? (y/n) or q to quit: ");
    }
    if (correct == 'y')
    {
      System.out.println (first [i] + " " + last [i] + " Deleted.");
      combin [i] = 0;
      first [i] = null;
      last [i] = null;
      System.out.println ("Deleted");
    }
  }
  public void whoIsUsing (int combin[], String first[], String last[])
  {
    System.out.println ("\n************Who is Using the Locker************\n");
    int i = IBIO.inputInt ("Which locker number would you like to check?");
    System.out.println ("In locker #" + i + " is " + first [i] + " " + last [i] + ", " + combin [i]);
  }
}
