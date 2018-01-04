//File: MathQuiz.java
//Author: Pronoy Chaudhuri
//Date: February 14th, 2015
//Description: Time to go back to Math class :D
public class MathQuiz
{
 public static void main (String args[])
 {
 new MathQuiz ();
 }
 public MathQuiz ()
 {
   System.out.println ("********************");
   System.out.println ("* Simple Math Quiz *");
   System.out.println ("********************");
   System.out.println ("");
   
   System.out.println ("Question 1:     12  x  6?");
   int ans1 = IBIO.inputInt ("Your Answer:   ");
   System.out.println ("Correct Answer: " +(12*6));
   System.out.println ("");
   
   System.out.println ("Question 2:     785  +  63  x  34  -  23?");
   int ans2 = IBIO.inputInt ("Your Answer:   ");
   System.out.println ("Correct Answer: " +(785+63*34-23));
   System.out.println ("");
   
   System.out.println ("Question 3:     123456789  x  8.0000000729?");
   int ans3 = IBIO.inputInt ("Your Answer:   ");
   System.out.println ("Correct Answer: " +(123456789*8.0000000729));
   System.out.println ("");
   
   System.out.println ("Question 4:     243  x  637  -  57?");
   int ans4 = IBIO.inputInt ("Your Answer:   ");
   System.out.println ("Correct Answer: " +(243*637-57));
   System.out.println ("");
   
   System.out.println ("Question 5:     9  +  10?");
   int ans5 = IBIO.inputInt ("Your Answer:   ");
   System.out.println ("Correct Answer: " +(9+10));
   System.out.println ("");
 }
}
 