//File: SpeedFines.java
//Author: Pronoy Chaudhuri
//Date: February 15th, 2015
//Description: A quick way to identify potentially illegal alien immigrants.
public class SpeedFines
{
 public static void main (String args[])
 {
 new SpeedFines ();
 }
 public SpeedFines ()
 {
   System.out.println ("*********************************");
   System.out.println ("* Are you getting a fine today? *");
   System.out.println ("*********************************");
   System.out.println ("");
   int spdlimit = IBIO.inputInt ("Enter the speed limit: ");
   int spd = IBIO.inputInt ("Enter the recorded speed of the car: ");
   if (spd >= (spdlimit + 1) && spd <=(spdlimit + 20))
     System.out.println ("You are speeding and your fine is $100.");
   else if (spd >= (spdlimit + 21) && spd <= (spdlimit +30))
     System.out.println ("You are speeding and your fine is $270.");
   else if (spd >= (spdlimit + 30))
     System.out.println ("You are speeding and your fine is $500.");
   else
     System.out.println ("Congratulations, you are within the speed limit!");
 }
}