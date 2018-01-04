//Name: HoneyBees.java
//Date: June 2nd, 2015
//Author: Pronoy Chaudhuri
//Description: Time to save the environment!
public class HoneyBees
{
  public static void main (String args[])
  {
    new HoneyBees ();
  }
  
  
  public HoneyBees ()
  {
    int bees [] = {95, 92, 93, 95, 92, 100, 89, 83, 88, 89, 88, 89, 87, 95, 95, 92, 101, 78, 79, 82, 83, 95, 88, 90, 91, 89, 85, 82, 81, 94, 94, 95, 96, 97, 98, 95, 98, 103, 95, 91, 96, 93, 82, 95, 88, 89, 90};
    
    System.out.println ("1) A count of the number of bees: " +bees.length);
    
    int max = 0;
    for (int i = 1 ; i < bees.length ; i++)
    {
      if (bees [i] > max)
        max = bees [i];
    }
    System.out.println ("2) The maximum weight is " + max + "mg.");
    
    int min = 100;
    for (int i = 1 ; i < bees.length ; i++)
    {
      if (bees [i] < min)
        min = bees [i];
    }
    System.out.println ("3) The minimum weight is " + min + "mg.");
    
    int avg = 0;   
    for (int i = 0 ; i < bees.length ; i++)
    {
      avg += bees [i];
    }
    System.out.println ("4) The average weight is " + (avg / bees.length) + "mg.");
    
    int number1 = 0;    
    for (int i = 0 ; i < bees.length ; i++)
    {
      if (bees [i]>95)
        number1++;
    }
    System.out.println ("5) A count of the number of bees that have a weight over 95 mg: " +number1);
    
    int number2 = 0;    
    for (int i = 0 ; i < bees.length ; i++)
    {
      if (bees [i]<(avg/bees.length))
        number2++;
    }
    System.out.println ("6) A count of the number of bees that have a weight under the average: " +number2);
    
    System.out.print ("7) ");
    for (int i = 0 ; i < bees.length ; i++)
    {
      System.out.print (bees [i] + ", ");
    }
    
    System.out.print ("\n8) ");
    for (int i = bees.length-1 ; i > -1 ; i--)
    {
      System.out.print (bees [i] + ", ");
    }
    
    System.out.print ("\n9) ");
    for (int i = 0 ; i < bees.length ; i+=2)
    {
      System.out.print (bees [i] + ", ");
    }
    
    System.out.print ("\n10) ");        
    for (int i = 0 ; i < bees.length ; i++)
    {
      if (bees [i]>95)
        System.out.print (bees [i] + ", ");
    }    
  }
}