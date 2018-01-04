//File: Goldilocks.java
//Author: Pronoy Chaudhuri
//Date: February 14th, 2015
//Description: Let's not forget Mama bear's porridge!
public class Goldilocks
{
 public static void main (String args[])
 {
 new Goldilocks ();
 }
 public Goldilocks ()
 {
   System.out.println ("\\/\\/\\/\\/\\/\\/\\/");
   System.out.println ("* Goldilocks *");
   System.out.println ("/\\/\\/\\/\\/\\/\\/\\");
   System.out.println ("");
   int w1 = IBIO.inputInt ("Enter Bowl #1 Weight: ");
   int w2 = IBIO.inputInt ("Enter Bowl #2 Weight: ");
   int w3 = IBIO.inputInt ("Enter Bowl #3 Weight: ");
   System.out.println ("");
   if ((w1 < w2 && w1 > w3) || (w1 > w2 && w1 < w3))
   System.out.println ("The medium bowl weight is " +w1+ ".");
   else if ((w2 < w1 && w2 > w3) || (w2 > w1 && w2 < w3))
   System.out.println ("The medium bowl weight is " +w2+ ".");
   else
   System.out.println ("The medium bowl weight is " +w3+ ".");
                       }
}
   
     