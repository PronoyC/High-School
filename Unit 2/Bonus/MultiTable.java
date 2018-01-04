//File: MultiTable.java
//Author: Pronoy Chaudhuri
//Date: March 5th, 2015
//Description: Table on-the-go!
public class MultiTable
{
  public static void main (String args[])
  {
    new MultiTable ();
  }
  public MultiTable ()
  {
    for (int i=1; i<=10; i++) 
    {
      for (int a=1; a<=10; a++)
      {
        System.out.print(" "+i*a);
      }
      System.out.println(""); 
    }
  }
}