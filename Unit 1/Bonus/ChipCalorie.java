//File: ChipCalorie.java
//Author: Pronoy Chaudhuri
//Date: February 15th, 2015
//Description: Come down to my emporium for some tasty food.
public class ChipCalorie
{
 public static void main (String args[])
 {
 new ChipCalorie ();
 }
 public ChipCalorie ()
 {
   System.out.println ("Welcome to Chip’s Fast Food Emporium ");
   System.out.println ("");
   System.out.println ("Here are the three burger choices: ");
   System.out.println ("1 – Chip's Signature (542 Calories) ");
   System.out.println ("2 - Double Decker (729 Calories) ");
   System.out.println ("3 - Pure Angus Burger (456 Calories) ");
   System.out.println ("4 - No Burger ");
   System.out.println ("");
   int ans1 = IBIO.inputInt ("Please enter a burger choice: ");
   System.out.println ("");
   if (ans1 == 1)
     ans1 = 542;
   else if (ans1 == 2)
     ans1 = 729;
   else if (ans1 == 3)
     ans1 = 456;
   else
     ans1 = 0;
   
   System.out.println ("Here are the three side order choices: ");
   System.out.println ("1 – Poutine (483 Calories) ");
   System.out.println ("2 - Fresh Veggies (324 Calories) ");
   System.out.println ("3 - Chicken Nuggets (567 Calories) ");
   System.out.println ("4 - No Side Order ");
   System.out.println ("");
   int ans2 = IBIO.inputInt ("Please enter a side order choice: ");
   System.out.println ("");
   if (ans2 == 1)
     ans2 = 483;
   else if (ans2 == 2)
     ans2 = 324;
   else if (ans2 == 3)
     ans2 = 567;
   else
     ans2 = 0;
   
   System.out.println ("Here are the three drink choices: ");
   System.out.println ("1 – Soft Drink (350 Calories) ");
   System.out.println ("2 - Milk (145 Calories) ");
   System.out.println ("3 - Assorted Juice (250 Calories) ");
   System.out.println ("4 - No Drink ");
   System.out.println ("");
   int ans3 = IBIO.inputInt ("Please enter a drink choice: ");
   System.out.println ("");
   if (ans3 == 1)
     ans3 = 350;
   else if (ans3 == 2)
     ans3 = 145;
   else if (ans3 == 3)
     ans3 = 250;
   else
     ans3 = 0;
  
   System.out.println ("Here are the three dessert choices: ");
   System.out.println ("1 – Ice Cream Surprise (357 Calories) ");
   System.out.println ("2 - Chocolate Crumbler (432 Calories) ");
   System.out.println ("3 - Fruity Explosion (298 Calories) ");
   System.out.println ("4 - No Dessert ");
   System.out.println ("");
   int ans4 = IBIO.inputInt ("Please enter a dessert choice: ");
   System.out.println ("");
   if (ans4 == 1)
     ans4 = 357;
   else if (ans4 == 2)
     ans4 = 432;
   else if (ans4 == 3)
     ans4 = 298;
   else
     ans4 = 0;
   
   System.out.println ("Your total Calorie count is: " +(ans1+ans2+ans3+ans4));
 }
}
   
     
   
 