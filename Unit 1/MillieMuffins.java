//File: MillieMuffins.java
//Author: Pronoy Chaudhuri
//Date: February 10th, 2015
//Description: A way to find out how much you should pay for muffins.
public class MillieMuffins
{
 public static void main (String args[])
 {
 new MillieMuffins ();
 }
 public MillieMuffins ()
 {
   System.out.println ("Welcome to Millie’s Marvelous Muffins!");
   System.out.println ("");
   System.out.println ("**If you like muffins, ours are marvelous!**");
   System.out.println ("");
   int muff = IBIO.inputInt ("How many muffins would you like? ");
   int c = 0;
   if (muff >= 1 && 9 >= muff)
     c = 5;
   else if (muff >= 10 && 19 >= muff)
     c = 3;
   else if (muff >= 20 && 39 >= muff)
     c = 2;
   else if (muff >= 40)
     c = 1;
   System.out.println ("The cost per muffin is $" +c);
   System.out.println ("The total cost is $" +(c*muff));
 }
}
   