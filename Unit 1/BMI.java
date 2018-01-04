//File: BMI.java
//Author: Pronoy Chaudhuri
//Date: February 10th, 2015
//Description: An easy way to assess your health using the Body Mass Index (BMI).
public class BMI
{
 public static void main (String args[])
 {
 new BMI ();
 }
 public BMI ()
 {
   System.out.println ("*****************");
   System.out.println ("* BMI Calculator*");
   System.out.println ("*****************\n");
   double w = IBIO.inputDouble ("Enter weight (kg): ");
   double h = IBIO.inputDouble ("Enter height (m): ");
   boolean over = (w/(h*h))>25;
   boolean under = (w/(h*h))<18.5; 
 if (over)
   System.out.println ("\nOverweight");
 else if (under)
   System.out.println ("\nUnderweight");
 else
   System.out.println ("\nNormal weight");
                         
}
}
                        
                   