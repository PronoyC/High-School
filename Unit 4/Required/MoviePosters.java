//Name: MoviePoster.java
//Date: June 2nd, 2015
//Author: Pronoy Chaudhuri
//Description: Why not Avatar: The Last Airbender?
public class MoviePosters
{
  public static void main (String args[])
  {
    new MoviePosters ();
  }
  
  
  public MoviePosters ()
  {
    String first[] = {"Sam", "Zoe", "Sigourney", "Stephen",
      "Michelle", "Laz", "Wes", "Dileep", "Joel", "Giovanni", "CCH"};
    String last[] = {"Worthington", "Saldana", "Weaver", "Lang", "Rodriguez",
      "Alonzo", "Studi", "Rao", "Moore", "Ribisi", "Pounder"};
    
    //2
    System.out.println ("Avatar starring....");
    for (int i = 0 ; i < first.length ; i++)
    {
      System.out.println ("   " + first [i] + " " + last [i]);
    }
    
    //3
    System.out.println ("\nAvatar starring....");
    for (int i = 0 ; i < first.length ; i++)
    {
      System.out.println ("   " + (i + 1) + ". " + first [i] + " " + last [i]);
    }
    //4
    String min = first [0];
    for (int i = 0 ; i < first.length ; i++)
    {
      if (min.compareTo (first [i]) > 0)
        min = first [i];
    }
    System.out.println ("\nThe earliest first name is: " + min);
    
    //5
    String minl = last [0];
    for (int i = 0 ; i < last.length ; i++)
    {
      if (minl.compareTo (last [i]) > 0)
        minl = last [i];
    }
    System.out.println ("\nThe earliest last name is: " + minl);
    
    //6
    String minea = first [0];
    for (int i = 0 ; i < first.length ; i++)
    {
      if (minea.compareTo (first [i]) < 0)
        minea = first [i];
    }
    System.out.println ("\nThe last first name is: " + minea);
    
    //6
    String minla = last [0];
    for (int i = 0 ; i < last.length ; i++)
    {
      if (minea.compareTo (last [i]) < 0)
        minea = last [i];
    }
    System.out.println ("\nThe last last name is: " + minla);
    
    //7
    System.out.println ("\nAvatar starring....");
    int count = 0;
    for (int i = 0 ; i < first.length ; i++)
    {
      if (count == 0)
        System.out.print ("   ");
      else if (count % 3 == 0)
      {
        System.out.println (" ");
        System.out.print ("   ");
      }
      count++;
      System.out.print (first [i] + " " + last [i] + ", ");
    }
  }
}


