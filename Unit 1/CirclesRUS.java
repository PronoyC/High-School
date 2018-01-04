//File: CirclesRUs.java
//Author: Pronoy Chaudhuri
//Date: February 9th, 2015
//Description: A quick way to find dimensions of circles and spheres.
public class CirclesRUS
{
 public static void main (String args[])
 {
 new CirclesRUS ();
 }
 public CirclesRUS ()
 {
   System.out.println ("Circles R Us");
   System.out.println ("");
   Double rad = IBIO.inputDouble ("Enter a radius:");
   System.out.println ("");
   System.out.println ("On a circle:");
   System.out.println ("The diameter is " +rad*2);
   System.out.println ("The area is " +Math.PI*(Math.pow(rad,2)));
   System.out.println ("The cirucumference is " +Math.PI*rad*2); 
   System.out.println ("");
   System.out.println ("On a sphere:");
   System.out.println ("The surface area is " +4*Math.PI*(Math.pow(rad,2)));
   System.out.println ("The volume is " +(4*Math.PI*(Math.pow(rad,3)))/3);
 }
}
  