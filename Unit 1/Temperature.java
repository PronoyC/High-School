//File: Temperature.java
//Author: Pronoy Chaudhuri
//Date: February 11th, 2015
//Description: A quick way to find the average temperature in a season.
public class Temperature
{
 public static void main (String args[])
 {
 new Temperature ();
 }
 public Temperature ()
 {
   String month = IBIO.inputString ("Which season would you like? (spring/summer/fall/winter) ");
   System.out.println ("");
   String mon1 = IBIO.inputString ("What is the name of the first " +month+ " month?");
   String mon2 = IBIO.inputString ("What is the name of the second " +month+ " month?");
   String mon3 = IBIO.inputString ("What is the name of the third " +month+ " month?");
   System.out.println ("");
   double temp1 = IBIO.inputDouble ("What is the average temperature in " +mon1+ " (in degrees)? ");
   double temp2 = IBIO.inputDouble ("What is the average temperature in " +mon2+ " (in degrees)? ");
   double temp3 = IBIO.inputDouble ("What is the average temperature in " +mon3+ " (in degrees)? ");
   System.out.println ("");
   System.out.println ("The average temperature in the " +month+ " was: " +((temp1+temp2+temp3)/3)+ " degrees celcius.");
 }
}
   