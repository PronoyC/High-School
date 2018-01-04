//File: GuessingGame.java
//Author: Pronoy Chaudhuri
//Date: March 9th, 2015
//Description: Hard to guess, easy to make.
public class GuessingGame
{
 public static void main (String args[])
 {
 new GuessingGame ();
 }
 public GuessingGame ()
 {
   System.out.println ("Welcometo the Guessing Game!");   
   char continu = 'y';
   while (continu=='y')
   {
   System.out.println ("\nThe computer has picked a number between 1 and 100. Try and guess it.\n");
   int i = 1;
   int ans = 0;
   int num = (int) (Math.random () *99) + 1; 
   while (ans!=num)
   {
     ans = IBIO.inputInt ("Guess #" +i+ ":");
     if (ans>num)
       System.out.println ("  That is too high.");
     else if (ans<num)
       System.out.println ("  That is too low.");
     else 
     {
       System.out.println ("  You got it!");
       if (i==1)
         System.out.println ("  It only took 1 guess. Good Job.");
       else
       {
         System.out.println ("  It only took " +i+ " guesses. Good Job.");
         continu = IBIO.inputChar ("\n Do you want to play again? (y/n)");
       }
     }
       i++;
   }
   }
 }
}
       
         
     
   