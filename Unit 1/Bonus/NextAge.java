//File: NextAge.java
//Author: Pronoy Chaudhuri
//Date: February 15th, 2015
//Description: An easy way to calculate a hypothetical scenario.
public class NextAge
{
 public static void main (String args[])
 {
 new NextAge ();
 }
 public NextAge ()
 {
   System.out.println ("Hello there!");
   System.out.println ("Let us find the oldest child's age.");
   System.out.println ("Shall we begin?");
   System.out.println ("");
   int y = IBIO.inputInt ("Child #1 Age: ");
   int m = IBIO.inputInt ("Child #2 Age: ");
   if (y < m)
   System.out.println ("The oldest child is " +((m-y)+m));
   else 
   System.out.println ("The oldest child is " +((y-m)+y));
 }
}
    