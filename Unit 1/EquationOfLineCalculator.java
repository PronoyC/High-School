//File: EquationOfLineCalculator.java
//Author: Pronoy Chaudhuri
//Date: February 9th, 2015
//Description: An easy way to calculate the slope and distance of two variables.
public class EquationOfLineCalculator 
{
 public static void main (String args[])
 {
 new EquationOfLineCalculator ();
 }
 public EquationOfLineCalculator ()
 {
   System.out.println ("Equation Calculator");
   System.out.println ("");
   double x1 = IBIO.inputDouble ("Enter the first x co-ordinate: ");
   double y1 = IBIO.inputDouble ("Enter the first y co-ordinate: ");
   double x2 = IBIO.inputDouble ("Enter the second x co-ordinate: ");
   double y2 = IBIO.inputDouble ("Enter the second y co-ordinate: ");
   System.out.println ("");
   System.out.println ("The slope is " +((y2-y1)/(x2-x1)));
   System.out.println ("The y-intercept is " +((y2-y1)/(x2-x1)*(0-x1)+y1));
   System.out.println ("The distance between the two points is " +Math.sqrt((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2))));
 }
}