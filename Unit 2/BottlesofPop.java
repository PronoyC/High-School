//File: BottlesOfPop.java
//Author: Pronoy Chaudhuri
//Date: March 4th, 2015
//Description: Hey, I want some pop!
public class BottlesofPop
{
 public static void main (String args[])
 {
 new BottlesofPop ();
 }
 public BottlesofPop ()
 {
   System.out.println ("Okay kids, let's sing a song!\n");
   int bottles = 100;
   while (bottles>1)
   {
     System.out.println (bottles + " bottles of pop on the wall.");
     System.out.println (bottles + " bottles of pop.");
     System.out.println ("If one of those bottles should happen to fall...");
     System.out.println ("There would be "+(bottles-1)+" bottles of pop on the wall.\n");
     bottles--;
   }
   System.out.println ("2 bottles of pop on the wall.");
   System.out.println ("2 bottles of pop.");
   System.out.println ("If one of those bottles should happen to fall...");
   System.out.println ("There would be 1 last bottle of pop on the wall.\n");
   System.out.println ("1 bottle of pop on the wall.");
   System.out.println ("1 bottle of pop.");
   System.out.println ("If one of those bottles should happen to fall...");
   System.out.println ("There would be no more bottles of pop on the wall.");
 }
}
   
   
     