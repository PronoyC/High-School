//Name: LetterFreq.java
//Date: June 2nd, 2015
//Author: Pronoy Chaudhuri
//Description: Well, I do frequently code...
public class LetterFreq
{
  public static void main (String args[])
  {
    new LetterFreq ();
  }
  
  
  public LetterFreq ()
  {
    char letter []= {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};  
    double freq []= {8.167, 1.492, 2.782, 4.253, 12.702, 2.228, 2.015, 6.094, 6.966, 0.153, 0.772, 4.025, 2.406, 6.749, 7.507, 1.929, 0.095, 5.987, 6.327, 9.056, 2.758, 0.978, 2.360, 0.150, 1.974, 0.074};
    
    System.out.println ("Step 1:");
    double av = 0;    
    for (int i = 0 ; i < freq.length ; i++)
    {
      av += freq [i];
    }
    System.out.println ("The average is " + (av / freq.length));
    
    System.out.println ("\nStep 2:");
    System.out.println ("The sum is " + av);
    if (av==100)
      System.out.println ("Accurate");
    else
      System.out.println ("Mild Rounding Error");
    
    System.out.println ("\nStep 3:");
    double min = freq [0];
    int mini = 0;
    for (int i = 1 ; i < freq.length ; i++)
    {
      if (freq [i] < min)
      {
        min = freq [i];
        mini = i;
      }
    }
    System.out.println ("The letter with the minimum frequency is " + letter [mini]);
    
    System.out.println ("\nStep 4:");
    double max = freq [0];
    int maxi = 0;
    for (int i = 1 ; i < freq.length ; i++)
    {
      if (freq [i] > max)
      {
        max = freq [i];
        maxi = i;
      }
    }
    System.out.println ("The letter with the maximum frequency is " + letter [maxi]);
    
    System.out.println ("\nStep 5:");
    char continu ='y';
    while (continu == 'y')
    {
      char findMe = IBIO.inputChar ("\nWhat do you want to find in the array? ");
      int pos = -1;
      char find = 'a';
      for (int i = 0 ; i < letter.length ; i++)
      {  
        find = letter [i];
        if (find == findMe)
          pos = i;
      }
      if (pos == -1)
        System.out.println ("The frequency is not in the array");
      else
        System.out.println ("The frequency is " + freq [pos]);
      continu = IBIO.inputChar ("\nWould you like to continue? (y/n)");
      if (continu == 'Y')
        continu = 'y';
      else if (continu == 'N')
        continu = 'n';
      while (continu != 'n' && continu != 'y')
      {
        System.out.println ("\nThat is an invalid answer, try again.");
        continu = IBIO.inputChar ("Would you like to continue? (y/n)");
      }    
    }
    System.out.println ("Thanks and have a great day :D");
  }
}