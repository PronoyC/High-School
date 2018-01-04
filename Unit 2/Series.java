//File: Series.java
//Author: Pronoy Chaudhuri
//Date: February 23th, 2015
//Description: Time for patterns!
public class Series
{
 public static void main (String args[])
 {
 new Series ();
 }
 public Series ()
 {
   System.out.println ("Group A Counting");
   for (int a = 0; a < 13; a++)
   {
     System.out.print (a + " ");     
   }
   System.out.println ("");
   for (int a = 1; a < 20; a++)
   {
     System.out.print (a + " ");
   }
   System.out.println ("");
   for (int a = 12; a < 23; a++)
   {
     System.out.print (a + " ");
   }
   System.out.println ("");
   for (int a = 101; a < 116; a++)
   {
     System.out.print (a + " ");
   }
   System.out.println ("");
   System.out.println ("\nGroup B Backwards");
   for (int a = 12; a >= 0; a--)
   {
     System.out.print (a + " ");
   }
   System.out.println ("");
   for (int a = 20; a > 0; a--)
   {
     System.out.print (a + " ");
   }  
   System.out.println ("");
   for (int a = 22; a > 11; a--)
   {
     System.out.print (a + " ");
   } 
   System.out.println ("");
   for (int a = 115; a > 100; a--)
   {
     System.out.print (a + " ");
   } 
   System.out.println ("");
   System.out.println ("\nGroup C Skip Counting");
   for (int a = 0; a < 20; a += 2)
   {
     System.out.print (a + " ");
   }
   System.out.println ("");
   for (int a = 1; a < 21; a += 2)
   {
     System.out.print ((a+1) + " ");
   }
   System.out.println ("");
   for (int a = 0; a < 33; a += 3)
   {
     System.out.print (a + " ");
   }
   System.out.println ("");
   for (int a = 0; a < 44; a += 4)
   {
     System.out.print (a + " ");
   }
   System.out.println ("");
   for (double a = 1.0; a < 6.0; a += 0.5)
   {
     System.out.print (a + " ");
   }   
   System.out.println ("");
   System.out.println ("\nGroup D One thing, repeated");
   System.out.println ("* * * * * * * * * * * * * ");
   System.out.println ("2 2 2 2 2 2 2 2 2 2 2 2 2 ");
   System.out.println ("1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0");
   System.out.println ("lalalalalalalalalalalalalalalalalalalala");
   System.out.println ("- 1 + 1 - 1 + 1 - 1 + 1 - 1 + 1 - 1 + 1 - 1 + 1");
   System.out.println ("");
   System.out.println ("\nGroup E Powers - Multiply and Divide");
   for (int a = 0; a < 12; a++)
   {
     System.out.print (Math.pow (a,2) + " ");
     System.out.print (Math.pow (a,3) + " ");
   }
   System.out.println ("");
   for (int a = 0; a < 12; a++)
   {
     System.out.print (Math.pow (2,a) + " ");
   }
   System.out.println ("");
   for (int a = 0; a < 11; a++)
   {
     System.out.print (Math.pow (3,a) + " ");
   }
   System.out.println ("");
   for (double a = 0.01; a > 10000.0; a = a*10)
   {
     System.out.print (a + " ");
   }
   System.out.println ("");
   System.out.println ("Bonus - Not Required");
   for (int a = 1; a < 9; a++)
   {
     int b = a + 1;
     System.out.print (a + "/" + b + " ");
   }  
   int v = 9;
   int ans = 1;
   System.out.println ("");
   for (int a = 1; a <= v; a++) 
   {
     ans = ans * a;
     System.out.print (ans + " ");     
   }
   System.out.println ("");
   int a = 0;
   int b = 1;
   System.out.print ("1 ");
   for (int i = 1; i < 11; i++) 
   {
     int step = a + b;
     System.out.print (step + " ");
     a = b;
     b = step;
   }
 }
}  