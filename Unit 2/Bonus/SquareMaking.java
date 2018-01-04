//File: SquareMaking.java
//Author: Pronoy Chaudhuri
//Date: March 5th, 2015
//Description: Who needs any polygon when you have squares?
public class SquareMaking
{
  public static void main (String args[])
  {
    new SquareMaking ();
  }
  public SquareMaking ()
  {
    System.out.println ("---Welcome to the Square Making Program---");
    System.out.println ("\nYou want squares, we make squares! ");
    int x = 1;
    while (x!=0)
    {
    int dim = IBIO.inputInt ("\nWhat dimension of square? (-1 to quit) \n");
    if (dim==-1)
    {
      System.out.println ("Goodbye!");
      System.out.println ("Hope you enjoyed making squares.");
      x = 0;
    }
    for(int row = 0; row < dim; row++)
    {       
      for(int col = 0; col < dim; col++) 
      {         
        System.out.print("*");        
      }      
      System.out.println("");     
    }
    }
  }
}
  