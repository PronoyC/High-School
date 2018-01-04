//Name: HeightSurvey.java
//Date: June 9th, 2015
//Author: Pronoy Chaudhuri
//Description: Can you even height bro?
public class HeightSurvey
{
  public static void main (String args[])
  {
    new HeightSurvey ();
  }
  
  
  public HeightSurvey ()
  {
    int h[] = new int [31];
    h [0] = 156;
    h [1] = 172;
    h [2] = 168;
    h [3] = 170;
    h [4] = 160;
    h [5] = 152;
    
    int num = 6;
    
    char cont = 'a';
    while (cont != 'q')
    {
      System.out.println ("\n*********");
      System.out.println ("*Heights*");
      System.out.println ("*********\n");
      System.out.println (" (a) Add a Height (cm)");
      System.out.println (" (b) Delete a Height (cm)");
      System.out.println (" (c) Average Height (cm) ");
      System.out.println (" (q) Quit\n");
      cont = IBIO.inputChar ("Select an option: ");
      
      if (cont == 'a')
      {
        int add = IBIO.inputInt ("Add height: ");
        h [num] = add;
        num++;
        
        System.out.println ("\nHeight Added.\n");
        
        for (int i = 0 ; i < num ; i++)        
          System.out.println ((i + 1) + " " + h [i]);
        System.out.println ("");
        
        
      }
      else if (cont == 'b')
      {
        int del = IBIO.inputInt ("Delete height: ");
        int pos = -1;
        for (int i = 0 ; i < num ; i++)
        {
          if (del == (h [i]))
            pos = i;
        }
        
        if (pos == -1)
          System.out.println ("Sorry, this height is not in our database.");
        
        else
        {
          h [pos] = 0;
        }
        System.out.println ("\nHeight Deleted.\n");
                
        for (int i = 0 ; i < num ; i++)
          System.out.println ((i + 1) + " " + h [i]);
        System.out.println ("");
        
      }
      else if (cont == 'c')
      {
        int numb = 0;
        int avg = 0;
        for (int i = 0 ; i < h.length ; i++)
        {
          if (h[i] > 0)
          {
            avg += h [i];
            numb++;
          }
        }
        System.out.println ("Average Height: " + (avg / numb));
        System.out.println ("");
        
        for (int i = 0 ; i < num ; i++)
          System.out.println ((i + 1) + " " + h [i]);
        System.out.println ("");        
      }
      
    }
  }
}
