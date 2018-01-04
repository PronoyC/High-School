//Name: Sorting.java
//Date: June 9th, 2015
//Author: Pronoy Chaudhuri
//Description: Time to sort.
public class Sorting
{
  public static void main (String args[])
  {
    new Sorting ();
  }
  
  
  public Sorting ()
  {
    //1
    int num[]={16, 1, 516, 2048, 2, 64, 128, 256, 1024, 32, 4, 8};
    for (int i = 0; i < num.length; i++)
      System.out.print (num[i] + " ");    
    for (int left = num.length - 1 ; left > 0 ; left--)
    {
      int max = 0;
      for (int i = 1 ; i <= left ; i++)
      {
        if (num [max] < num [i])
          max = i;
      }
      int temp = num [max];
      num [max] = num [left];
      num [left] = temp;      
    } 
    System.out.println ("");
    for (int i = 0; i < num.length; i++)
      System.out.print (num[i] + " ");  
  
  //2  
  System.out.println ("\n");
  String months[]={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; 
  for (int i = 0; i < months.length; i++)
          System.out.print (months[i] + " "); 
  for (int a = 0 ; a < months.length - 1 ; a++)
  {
    for (int b = 0 ; b < months.length - 1 - b ; b++)
    {
      if (months [b + 1].compareTo(months [b])<0)
      { 
        String temp = months [b];
        months [b] = months [b + 1];
        months [b + 1] = temp;
      }
    }
  }
  System.out.println ("");
    for (int i = 0; i < months.length; i++)
      System.out.print (months[i] + " ");
    
    //3
    System.out.println ("\n");
    char letters[]={'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a','s', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
    for (int i = 0; i < letters.length; i++)
      System.out.print (letters[i] + " ");    
    for (int left = letters.length - 1 ; left > 0 ; left--)
    {
      int max = 0;
      for (int i = 1 ; i <= left ; i++)
      {
        if (letters [max] < letters [i])
          max = i;
      }
      char temp = letters [max];
      letters [max] = letters [left];
      letters [left] = temp;      
    } 
    System.out.println ("");
    for (int i = 0; i < letters.length; i++)
      System.out.print (letters[i] + " ");  
    
    //4
    System.out.println ("\n");
    double moreNums[] ={3.45, 6.54, 7.89, 9.87, 2.34, 1.23, 5.78, 4.32, 6.45, 8.96, 9.07, 3.67, 0.34, 1.46, 1.47}; 
    for (int i = 0; i < moreNums.length; i++)
      System.out.print (moreNums[i] + " "); 
        for (int i = 0 ; i < moreNums.length - 1 ; i++)
    {
      for (int j = 0 ; j < moreNums.length - 1 - i ; j++)
      { 
        if (moreNums [j + 1] < moreNums [j])
        { 
          double temp = moreNums [j];
          moreNums [j] = moreNums [j + 1];
          moreNums [j + 1] = temp;
        }
      }
    }
    System.out.println ("");
    for (int i = 0; i < moreNums.length; i++)
      System.out.print (moreNums[i] + " ");
    
    //5
    System.out.println ("\n");
    String names []={"Sunflower", "Peashooter", "Cherry Bomb", "Wall-nut","Potato Mine", "Snow Pea", "Chomper", "Repeater", "Puff-Shroom","Lily-Pad", "Squash", "Threepeater", "Tangle Kelp", "Jalapeno"};
    int sun[]={50, 100, 150, 50, 25, 175, 150, 200, 0, 25, 50, 325, 25, 125};
    for (int i = 0; i < names.length; i++)
      System.out.print (names[i] + ", "); 
    System.out.println ("");
    for (int i = 0; i < sun.length; i++)
      System.out.print (sun[i] + ", "); 
    System.out.println ("\n");    
    for (int left = names.length - 1 ; left > 0 ; left--)
    {
      int max = 0;
      for (int i = 1 ; i <= left ; i++)
      {
        if (names [max].compareTo(names [i])<0)
          max = i;
      }
      String temp = names [max];
      names [max] = names [left]; 
      int temp2 = sun [max];
      sun [max] = sun [left];      
      sun [left] = temp2;  
      names [left] = temp;      
    } 
    for (int i = 0; i < names.length; i++)
      System.out.print (names[i] + ", "); 
    System.out.println ("");
    for (int i = 0; i < sun.length; i++)
      System.out.print (sun[i] + ", ");
    
    //6
    String names2 []={"Sunflower", "Peashooter", "Cherry Bomb", "Wall-nut","Potato Mine", "Snow Pea", "Chomper", "Repeater", "Puff-Shroom","Lily-Pad", "Squash", "Threepeater", "Tangle Kelp", "Jalapeno"};
    int sun2[]={50, 100, 150, 50, 25, 175, 150, 200, 0, 25, 50, 325, 25, 125};
    System.out.println ("\n");    
    for (int i = 0; i < names2.length; i++)
      System.out.print (names2[i] + ", ");
    System.out.println ("");
    for (int i = 0; i < sun2.length; i++)
      System.out.print (sun2[i] + ", "); 
    System.out.println ("\n");
    for (int left = sun2.length - 1 ; left > 0 ; left--)
    {
      int max = 0;
      for (int i = 1 ; i <= left ; i++)
      {
        if (sun2 [max] < sun2 [i])
          max = i;
      }
      int temp = sun2 [max];
      sun2 [max] = sun2 [left]; 
      String temp2 = names2 [max];
      names2 [max] = names2 [left];      
      names2 [left] = temp2;  
      sun2 [left] = temp;      
    } 
    for (int i = 0; i < names2.length; i++)
      System.out.print (names2[i] + ", "); 
    System.out.println ("");
    for (int i = 0; i < sun2.length; i++)
      System.out.print (sun2[i] + ", ");
  }
}