//File: BillTotals.java
//Author: Pronoy Chaudhuri
//Date: February 9th, 2015
//Description: A quick way to total up your bills.
public class BillTotals
{
 public static void main (String args[])
 {
 new BillTotals ();
 }
 public BillTotals ()
 {
   System.out.println ("Welcome to the Bill Subtotaling Program");
   System.out.println ("");
   Double one = IBIO.inputDouble ("Please enter the price of item #1: $");
   Double two = IBIO.inputDouble ("Please enter the price of item #2: $");
   Double three = IBIO.inputDouble ("Please enter the price of item #3: $");
   Double four = IBIO.inputDouble ("Please enter the price of item #4: $");
   Double five = IBIO.inputDouble ("Please enter the price of item #5: $");
   System.out.println ("");
   System.out.println ("The sutotal is: " +(one+two+three+four+five));
   System.out.println ("The tax is (13%): " +(one+two+three+four+five)*.13);
   System.out.println ("The total is: " +(one+two+three+four+five)*1.13);
 }
}