//File: Magic8.java
//Author: Pronoy Chaudhuri
//Date: February 10th, 2015
//Description: Fruit? Why didn't you say so?
public class Magic8
{
 public static void main (String args[])
 {
 new Magic8 ();
 }
 public Magic8 ()
 {
   System.out.println ("***Ask the Magic 8 Ball ***");
   System.out.println ("");
   String ans = IBIO.inputString ("Enter a yes or no question: ");
   System.out.println ("");
   System.out.println ("The Magic 8 Ball says: ");
   int num = (int) (Math.random () * 16) + 1;
   if (num == 1)
   System.out.println ("Outlook not so good.");
   if (num == 2)
   System.out.println ("Don't count on it.");
   if (num == 3)
   System.out.println ("My sources say no.");
   if (num == 4)
   System.out.println ("Without a doubt.");
   if (num == 5)
   System.out.println ("Reply hazy, try again.");
   if (num == 6)
   System.out.println ("It is certain.");
   if (num == 7)
   System.out.println ("My reply is no.");
   if (num == 8)
   System.out.println ("As I see it yes.");
   if (num == 9)
   System.out.println ("Most likely.");
   if (num == 10)
   System.out.println ("You may rely on it.");
   if (num == 11)
   System.out.println ("Cannot predict now.");
   if (num == 12)
   System.out.println ("Outlook good.");
   if (num == 13)
   System.out.println ("Better not tell you now.");
   if (num == 14)
   System.out.println ("Very doubtful.");
   if (num == 15)
   System.out.println ("Yes definitely.");
   if (num == 16)
   System.out.println ("Concentrate and ask again.");
 }
}
   
   