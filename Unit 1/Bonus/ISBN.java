//File: ISBN.java
//Author: Pronoy Chaudhuri
//Date: February 14th, 2015
//Description: A quick and easy way to verify the ISBN of books.
public class ISBN
{
 public static void main (String args[])
 {
 new ISBN ();
 }
 public ISBN ()
 {
   int num11 = IBIO.inputInt ("Digit 11? ");
   int num12 = IBIO.inputInt ("Digit 12? ");
   int num13 = IBIO.inputInt ("Digit 13? \n");
   System.out.println ("The 1-3 sum is " +(91+(num11*1+num12*3+num13*1)));
 }
}