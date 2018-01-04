//Name: Palindrome.java
//Date: June 8th, 2015
//Author: Pronoy Chaudhuri
//Description: Racecar!

public class Palindrome
{  
  public static void main (String args[])
  {
    new Palindrome();
  }
  public Palindrome()
  {
    char continu = 'y';
    System.out.println ("*************");
    System.out.println ("*Palindromes*");
    System.out.println ("*************");
    while (continu == 'y')
    {
      String palindrome = IBIO.inputString ("\nEnter a phrase: ");      
      palindrome = palindrome.toLowerCase();
      int length = palindrome.length();
      int one = 0;
      int two = length - 1; 
      int three = (one + two)/2;  
      int i = 0;
      for (i = one; i <= three; i++) 
      {
        if (palindrome.charAt(one) == palindrome.charAt(two)) 
        {
          one++;
          two--;
        }
        else 
        {
          break;
        }
      }
      if (i == three + 1) 
      {
        System.out.println("\nTrue");
      }
      else 
      {
        System.out.println("\nFalse");
      }
      continu = IBIO.inputChar ("\nContinue? (y/n): ");
    }
    System.out.println ("\nThanks and have a great day :D");
  }
}