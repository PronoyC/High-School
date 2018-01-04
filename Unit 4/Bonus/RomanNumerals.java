//Name: RomanNumerals.java
//Date: June 5th, 2015
//Author: Pronoy Chaudhuri
//Description: For Julius!

public class RomanNumerals 
{
  int s1 = 0;
  int i = 0;
  public static void main (String args[])
  {
    new RomanNumerals();
  }
  public RomanNumerals()
  {
    char n1[] = {'I', 'I'}; //2
    char n2[] = {'I', 'X'}; //9
    char n3[] = {'V', 'I', 'I'}; //7
    char n4[] = {'C', 'X', 'I', 'I', 'I'}; //113
    char n5[] = {'L', 'I', 'V'}; //54
    char n6[] = {'X', 'X', 'X', 'V', 'I', 'I', 'I'}; //38
    char n7[] = {'X', 'C', 'I', 'X'}; //99
    char n8[] = {'D', 'C', 'L', 'X', 'X', 'V', 'I', 'I', 'I'}; //678
    
    
    for (i = 0 ; i < n1.length ; i++)
    {
    if (n1 [i] == 'I' && i+1<n1.length && n1 [i+1] == 'V')
      {
        s1 += 4;
        i++;
      }
      else if (n1 [i] == 'I' && i+1<n1.length && n1 [i+1] == 'X')        
      { 
        s1 += 9;
        i++;
      }
      else if (n1 [i] == 'I' && i+1<n1.length && n1 [i+1] == 'L')
      {
        s1 += 49;
        i++;
      }
      else if (n1 [i] == 'I' && i+1<n1.length && n1 [i+1] == 'C')
      {
        s1 += 99;
        i++;
      }
      else if (n1 [i] == 'I' && i+1<n1.length && n1 [i+1] == 'D')
      {
        s1 += 499;
        i++;
      }
      else if (n1 [i] == 'X' && i+1<n1.length && n1 [i+1] == 'L')
      {
        s1 += 40;
        i++;
      }
      else if (n1 [i] == 'X' && i+1<n1.length && n1 [i+1] == 'C')
      {
        s1 += 90;
        i++;
      }
      else if (n1 [i] == 'C' && i+1<n1.length && n1 [i+1] == 'D')
      {
        s1 += 400;   
        i++;
      }     
      else if (n1 [i] == 'I')
        s1 += 1;
      else if (n1 [i] == 'V')
        s1 += 5;      
      else if (n1 [i] == 'X')
        s1 += 10;
      else if (n1 [i] == 'L')
        s1 += 50;
      else if (n1 [i] == 'C')
        s1 += 100;
      else if (n1 [i] == 'D')
        s1 += 500;
      else
        s1 += 1000;
    }
    System.out.println (s1);
    s1 = 0;
    
    for (i = 0 ; i < n2.length ; i++)
    {
      if (n2 [i] == 'I' && i+1<n2.length && n2 [i+1] == 'V')
      {
        s1 += 4;
        i++;
      }
      else if (n2 [i] == 'I' && i+1<n2.length && n2 [i+1] == 'X')        
      { 
        s1 += 9;
        i++;
      }
      else if (n2 [i] == 'I' && i+1<n2.length && n2 [i+1] == 'L')
      {
        s1 += 49;
        i++;
      }
      else if (n2 [i] == 'I' && i+1<n2.length && n2 [i+1] == 'C')
      {
        s1 += 99;
        i++;
      }
      else if (n2 [i] == 'I' && i+1<n2.length && n2 [i+1] == 'D')
      {
        s1 += 499;
        i++;
      }
      else if (n2 [i] == 'X' && i+1<n2.length && n2 [i+1] == 'L')
      {
        s1 += 40;
        i++;
      }
      else if (n2 [i] == 'X' && i+1<n2.length && n2 [i+1] == 'C')
      {
        s1 += 90;
        i++;
      }
      else if (n2 [i] == 'C' && i+1<n2.length && n2 [i+1] == 'D')
      {
        s1 += 400;   
        i++;
      }     
      else if (n2 [i] == 'I')
        s1 += 1;
      else if (n2 [i] == 'V')
        s1 += 5;      
      else if (n2 [i] == 'X')
        s1 += 10;
      else if (n2 [i] == 'L')
        s1 += 50;
      else if (n2 [i] == 'C')
        s1 += 100;
      else if (n2 [i] == 'D')
        s1 += 500;
      else
        s1 += 1000;
    }
    System.out.println (s1); 
    s1 = 0;
    
    for (i = 0 ; i < n3.length ; i++)
    {
      if (n3 [i] == 'I' && i+1<n3.length && n3 [i+1] == 'V')
      {
        s1 += 4;
        i++;
      }
      else if (n3 [i] == 'I' && i+1<n3.length && n3 [i+1] == 'X')        
      { 
        s1 += 9;
        i++;
      }
      else if (n3 [i] == 'I' && i+1<n3.length && n3 [i+1] == 'L')
      {
        s1 += 49;
        i++;
      }
      else if (n3 [i] == 'I' && i+1<n3.length && n3 [i+1] == 'C')
      {
        s1 += 99;
        i++;
      }
      else if (n3 [i] == 'I' && i+1<n3.length && n3 [i+1] == 'D')
      {
        s1 += 499;
        i++;
      }
      else if (n3 [i] == 'X' && i+1<n3.length && n3 [i+1] == 'L')
      {
        s1 += 40;
        i++;
      }
      else if (n3 [i] == 'X' && i+1<n3.length && n3 [i+1] == 'C')
      {
        s1 += 90;
        i++;
      }
      else if (n3 [i] == 'C' && i+1<n3.length && n3 [i+1] == 'D')
      {
        s1 += 400;   
        i++;
      }     
      else if (n3 [i] == 'I')
        s1 += 1;
      else if (n3 [i] == 'V')
        s1 += 5;      
      else if (n3 [i] == 'X')
        s1 += 10;
      else if (n3 [i] == 'L')
        s1 += 50;
      else if (n3 [i] == 'C')
        s1 += 100;
      else if (n3 [i] == 'D')
        s1 += 500;
      else
        s1 += 1000;
    }
    System.out.println (s1); 
    s1 = 0;
    
    for (i = 0 ; i < n4.length ; i++)
    {
      if (n4 [i] == 'I' && i+1<n4.length && n4 [i+1] == 'V')
      {
        s1 += 4;
        i++;
      }
      else if (n4 [i] == 'I' && i+1<n4.length && n4 [i+1] == 'X')        
      { 
        s1 += 9;
        i++;
      }
      else if (n4 [i] == 'I' && i+1<n4.length && n4 [i+1] == 'L')
      {
        s1 += 49;
        i++;
      }
      else if (n4 [i] == 'I' && i+1<n4.length && n4 [i+1] == 'C')
      {
        s1 += 99;
        i++;
      }
      else if (n4 [i] == 'I' && i+1<n4.length && n4 [i+1] == 'D')
      {
        s1 += 499;
        i++;
      }
      else if (n4 [i] == 'X' && i+1<n4.length && n4 [i+1] == 'L')
      {
        s1 += 40;
        i++;
      }
      else if (n4 [i] == 'X' && i+1<n4.length && n4 [i+1] == 'C')
      {
        s1 += 90;
        i++;
      }
      else if (n4 [i] == 'C' && i+1<n4.length && n4 [i+1] == 'D')
      {
        s1 += 400;   
        i++;
      }     
      else if (n4 [i] == 'I')
        s1 += 1;
      else if (n4 [i] == 'V')
        s1 += 5;      
      else if (n4 [i] == 'X')
        s1 += 10;
      else if (n4 [i] == 'L')
        s1 += 50;
      else if (n4 [i] == 'C')
        s1 += 100;
      else if (n4 [i] == 'D')
        s1 += 500;
      else
        s1 += 1000;
    }
    System.out.println (s1); 
    s1 = 0;
    
    for (i = 0 ; i < n5.length ; i++)
    {
      if (n5 [i] == 'I' && i+1<n5.length && n5 [i+1] == 'V')
      {
        s1 += 4;
        i++;
      }
      else if (n5 [i] == 'I' && i+1<n5.length && n5 [i+1] == 'X')        
      { 
        s1 += 9;
        i++;
      }
      else if (n5 [i] == 'I' && i+1<n5.length && n5 [i+1] == 'L')
      {
        s1 += 49;
        i++;
      }
      else if (n5 [i] == 'I' && i+1<n5.length && n5 [i+1] == 'C')
      {
        s1 += 99;
        i++;
      }
      else if (n5 [i] == 'I' && i+1<n5.length && n5 [i+1] == 'D')
      {
        s1 += 499;
        i++;
      }
      else if (n5 [i] == 'X' && i+1<n5.length && n5 [i+1] == 'L')
      {
        s1 += 40;
        i++;
      }
      else if (n5 [i] == 'X' && i+1<n5.length && n5 [i+1] == 'C')
      {
        s1 += 90;
        i++;
      }
      else if (n5 [i] == 'C' && i+1<n5.length && n5 [i+1] == 'D')
      {
        s1 += 400;   
        i++;
      }     
      else if (n5 [i] == 'I')
        s1 += 1;
      else if (n5 [i] == 'V')
        s1 += 5;      
      else if (n5 [i] == 'X')
        s1 += 10;
      else if (n5 [i] == 'L')
        s1 += 50;
      else if (n5 [i] == 'C')
        s1 += 100;
      else if (n5 [i] == 'D')
        s1 += 500;
      else
        s1 += 1000;
    }
    System.out.println (s1); 
    s1 = 0;

    for (i = 0 ; i < n6.length ; i++)
    {
      if (n6 [i] == 'I' && i+1<n6.length && n6 [i+1] == 'V')
      {
        s1 += 4;
        i++;
      }
      else if (n6 [i] == 'I' && i+1<n6.length && n6 [i+1] == 'X')        
      { 
        s1 += 9;
        i++;
      }
      else if (n6 [i] == 'I' && i+1<n6.length && n6 [i+1] == 'L')
      {
        s1 += 49;
        i++;
      }
      else if (n6 [i] == 'I' && i+1<n6.length && n6 [i+1] == 'C')
      {
        s1 += 99;
        i++;
      }
      else if (n6 [i] == 'I' && i+1<n6.length && n6 [i+1] == 'D')
      {
        s1 += 499;
        i++;
      }
      else if (n6 [i] == 'X' && i+1<n6.length && n6 [i+1] == 'L')
      {
        s1 += 40;
        i++;
      }
      else if (n6 [i] == 'X' && i+1<n6.length && n6 [i+1] == 'C')
      {
        s1 += 90;
        i++;
      }
      else if (n6 [i] == 'C' && i+1<n6.length && n6 [i+1] == 'D')
      {
        s1 += 400;   
        i++;
      }     
      else if (n6 [i] == 'I')
        s1 += 1;
      else if (n6 [i] == 'V')
        s1 += 5;      
      else if (n6 [i] == 'X')
        s1 += 10;
      else if (n6 [i] == 'L')
        s1 += 50;
      else if (n6 [i] == 'C')
        s1 += 100;
      else if (n6 [i] == 'D')
        s1 += 500;
      else
        s1 += 1000;
    }
    System.out.println (s1); 
    s1 = 0;

    for (i = 0 ; i < n7.length ; i++)
    {
      if (n7 [i] == 'I' && i+1<n7.length && n7 [i+1] == 'V')
      {
        s1 += 4;
        i++;
      }
      else if (n7 [i] == 'I' && i+1<n7.length && n7 [i+1] == 'X')        
      { 
        s1 += 9;
        i++;
      }
      else if (n7 [i] == 'I' && i+1<n7.length && n7 [i+1] == 'L')
      {
        s1 += 49;
        i++;
      }
      else if (n7 [i] == 'I' && i+1<n7.length && n7 [i+1] == 'C')
      {
        s1 += 99;
        i++;
      }
      else if (n7 [i] == 'I' && i+1<n7.length && n7 [i+1] == 'D')
      {
        s1 += 499;
        i++;
      }
      else if (n7 [i] == 'X' && i+1<n7.length && n7 [i+1] == 'L')
      {
        s1 += 40;
        i++;
      }
      else if (n7 [i] == 'X' && i+1<n7.length && n7 [i+1] == 'C')
      {
        s1 += 90;
        i++;
      }
      else if (n7 [i] == 'C' && i+1<n7.length && n7 [i+1] == 'D')
      {
        s1 += 400;   
        i++;
      }     
      else if (n7 [i] == 'I')
        s1 += 1;
      else if (n7 [i] == 'V')
        s1 += 5;      
      else if (n7 [i] == 'X')
        s1 += 10;
      else if (n7 [i] == 'L')
        s1 += 50;
      else if (n7 [i] == 'C')
        s1 += 100;
      else if (n7 [i] == 'D')
        s1 += 500;
      else
        s1 += 1000;
    }
    System.out.println (s1); 
    s1 = 0;

    for (i = 0 ; i < n8.length ; i++)
    {
      if (n8 [i] == 'I' && i+1<n8.length && n8 [i+1] == 'V')
      {
        s1 += 4;
        i++;
      }
      else if (n8 [i] == 'I' && i+1<n8.length && n8 [i+1] == 'X')        
      { 
        s1 += 9;
        i++;
      }
      else if (n8 [i] == 'I' && i+1<n8.length && n8 [i+1] == 'L')
      {
        s1 += 49;
        i++;
      }
      else if (n8 [i] == 'I' && i+1<n8.length && n8 [i+1] == 'C')
      {
        s1 += 99;
        i++;
      }
      else if (n8 [i] == 'I' && i+1<n8.length && n8 [i+1] == 'D')
      {
        s1 += 499;
        i++;
      }
      else if (n8 [i] == 'X' && i+1<n8.length && n8 [i+1] == 'L')
      {
        s1 += 40;
        i++;
      }
      else if (n8 [i] == 'X' && i+1<n8.length && n8 [i+1] == 'C')
      {
        s1 += 90;
        i++;
      }
      else if (n8 [i] == 'C' && i+1<n8.length && n8 [i+1] == 'D')
      {
        s1 += 400;   
        i++;
      }     
      else if (n8 [i] == 'I')
        s1 += 1;
      else if (n8 [i] == 'V')
        s1 += 5;      
      else if (n8 [i] == 'X')
        s1 += 10;
      else if (n8 [i] == 'L')
        s1 += 50;
      else if (n8 [i] == 'C')
        s1 += 100;
      else if (n8 [i] == 'D')
        s1 += 500;
      else
        s1 += 1000;
    }
    System.out.println (s1); 
    s1 = 0;

  }
}


