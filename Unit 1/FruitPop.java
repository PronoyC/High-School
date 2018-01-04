//File: FruitPop.java
//Author: Pronoy Chaudhuri
//Date: February 10th, 2015
//Description: Fruit? Why didn't you say so?
public class FruitPop
{
 public static void main (String args[])
 {
 new FruitPop ();
 }
 public FruitPop ()
 {
   System.out.println ("Welcome to Fruit Pop ICS208 version!\n");
   int points = IBIO.inputInt ("How many points do you have? ");
   System.out.println ("Your screen can have these icons: ");
   if (points > 3000)
     System.out.print ("Apple, Blueberry, Extra Time, Heart, Orange, Plum, Robot, ");
   else if (points > 2000)
     System.out.print ("Apple, Blueberry, Coin, Extra Time, Heart, Orange, Plum, Robot, ");
   else if (points > 1500)
     System.out.print ("Apple, Blueberry, Heart, Lime, Orange, Plum, Robot, ");
   else if (points > 1000 || points > 100)
     System.out.print ("Apple, Blueberry, Heart, Lemon, Lime, Orange, Plum, ");
   else if (points > 400)
     System.out.print ("Apple, Blueberry, Lemon, Lime, Orange, Plum, ");
   else if (points > 50)
     System.out.print ("Apple, Blueberry, Heart, Lemon, Lime, Plum, ");
   else if (points >= 10)
     System.out.print ("Apple, Blueberry, Heart, Lemon, Plum, "); 
   else 
     System.out.print ("Blueberry, Heart, Lemon, Plum, ");
  
  }
}