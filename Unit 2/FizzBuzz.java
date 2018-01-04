//File: FizzBuzz.java
//Author: Pronoy Chaudhuri
//Date: March 3rd, 2015
//Description: FizzBuzzFizzBuzzFizzBuzz...
public class FizzBuzz
{
 public static void main (String args[])
 {
 new FizzBuzz ();
 }
 public FizzBuzz ()
 {
   System.out.println ("************");
   System.out.println ("* FizzBuzz *");
   System.out.println ("************");
   System.out.println ("\nWanna have some fun? ");
   int num = IBIO.inputInt ("\nEnter any number: ");
   System.out.println ("\nRunning top secret code...");
   System.out.println ("\nProgram initialized...");
   System.out.println ("\nNumber is " +num+ ".");
   System.out.println ("\nSystem: Run Program");
   System.out.println ("");
   int i = 1;
   while (i <= num)
   {
     if (i%3 == 0)
       System.out.print ("Fizz ");
     if (i%5 == 0)
       System.out.print ("Buzz ");
     if (i%3 == 0 && i%5 == 0)
       System.out.print ("FizzBuzz ");
     if (i%3 != 0 && i%5 != 0) 
     System.out.print (i + " ");
     i++;
   }
 }
}