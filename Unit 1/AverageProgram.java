//File: AverageProgram.java
//Author: Pronoy Chaudhuri
//Date: February 10th, 2015
//Description: A quick way to find your average.
public class AverageProgram
{
 public static void main (String args[])
 {
 new AverageProgram ();
 }
 public AverageProgram ()
 {
   System.out.println ("*************************************");
   System.out.println ("* Average Calculation Program (ACP) *");
   System.out.println ("*************************************");
   System.out.println ("");
   System.out.println ("Enter the percentage earned on each test.");
   System.out.println ("");
   double s1 = IBIO.inputDouble ("What is student #1's mark?: ");
   double s2 = IBIO.inputDouble ("What is student #2's mark?: ");
   double s3 = IBIO.inputDouble ("What is student #3's mark?: ");
   double s4 = IBIO.inputDouble ("What is student #4's mark?: ");
   double s5 = IBIO.inputDouble ("What is student #5's mark?: ");
   double s6 = IBIO.inputDouble ("What is student #6's mark?: "); 
   System.out.println ("");
   System.out.println ("There are six students in the class.");
   System.out.print ("The average mark was " +(((s1+s2+s3+s4+s5+s6)/6)));
   System.out.print (" %.");
 }
}
   