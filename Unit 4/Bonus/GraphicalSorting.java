//Name: GraphicalSorting.java
//Date: June 5th, 2015
//Author: Pronoy Chaudhuri
//Description: Dewey!
import java.awt.*;
import java.applet.*;

public class GraphicalSorting extends Applet
{  
  int i = 0;
  Button select, bubble, insert, shaker, reset;
  int size = 10;
  int a[] = {87,5,8,9,34,56,11,94,22,43,54,77,14,39,72,78,55,77,12,1};  

  public void init ()
  {
    select = new Button ("Selection Sort");
    bubble = new Button ("Bubble Sort");
    insert = new Button ("Insertion Sort");
    shaker = new Button ("Shaker Sort");
    reset = new Button ("Reset Array");
    add (select);
    add (bubble);
    add (insert);
    add (shaker);
    add (reset); 
    resize (500,900);
  }
  public boolean action (Event e, Object o)
  {
    if (e.target == select)
    {
      selection (a);
      
    }
    else if (e.target == bubble)
    {
      bubble (a);
      
    }
    else if (e.target == insert)
    {
      insert (a);
    }
    else if (e.target == reset)
    {
      reset (a);
      printarray (a);      
    }
    else if (e.target == shaker)
    {
      shaker (a);            
    }
    return true;
  }
  public void paint (Graphics g)
  {
    g.setColor(Color.red);
    printarray (a);   
  }
  public void printarray (int a[])
  {
    Graphics g = getGraphics(); 
    g.setColor(Color.white);
    g.fillRect(25,25,500,500);
    g.setColor(Color.blue);  
    int x = 50;  
    for (i = 0; i < a.length; i++)
    {
      if (a [i] < 25)
      {   
        g.setColor(Color.red); 
        g.fillRect(50, x, a[i], 10); 
        x+=12;
      }
      else if (a [i] < 50)
      {   
        g.setColor(Color.orange); 
        g.fillRect(50, x, a[i], 10); 
        x+=12;
      }
      else if (a [i] < 75)        
      {   
        g.setColor(Color.blue); 
        g.fillRect(50, x, a[i], 10); 
        x+=12;
      }
      else        
      {   
        g.setColor(Color.green); 
        g.fillRect(50, x, a[i], 10); 
        x+=12;
      }
    }
  }
  public void selection (int a[])
  {
      for (int left = a.length - 1 ; left > 0 ; left--)
      {
        int max = 0;
        for (int i = 1 ; i <= left ; i++)
        {
          if (a [max] < a [i])
            max = i;
        }
        int temp = a [max];
        a [max] = a [left];
        a [left] = temp;
        for(int i=0; i<50005000; i++);
         printarray (a);
      }   
  }
  public void bubble (int a[])
  {
    for (int i = 0 ; i < a.length - 1 ; i++)
    {
      for (int j = 0 ; j < a.length - 1 - i ; j++)
      { // compare the two neighbours
        if (a [j + 1] < a [j])
        { //swap the neighbours if necessary
          int temp = a [j];
          a [j] = a [j + 1];
          a [j + 1] = temp;
          for(int b=0; b<50005000; b++);
         printarray (a);
        }
      }      
    }       
  }
  
  public void reset (int a[])
  {
    a[0] = 87;
    a[1] = 5;
    a[2] = 8;
    a[3] = 9;
    a[4] = 34;
    a[5] = 56;
    a[6] = 11;
    a[7] = 94;
    a[8] = 22;
    a[9] = 43;
    a[10] = 54;
    a[11] = 77;
    a[12] = 14;
    a[13] = 39;
    a[14] = 72;
    a[15] = 78;
    a[16] = 55;
    a[17] = 77;
    a[18] = 12;
    a[19] = 1;
  }
  public void insert (int a[])
  {
    for (int i = 1; i > 0; i++)
    {
      int temp = a[i];
      int j;
      for (j = i-1; j >= 0 && temp < a[j]; j--)
        a[j+1] = a[j];
      a[j+1] = temp;
      for(int b=0; b<50005000; b++);
         printarray (a);
    }
    printarray (a);
  }
  public void shaker (int a[])
  {
    for (int i = 0; i < a.length/2; i++) {
      boolean swapped = false;
      for (int j = i; j < a.length - i - 1; j++) 
      {
        if (a[j] > a[j+1]) 
        {
          int tmp = a[j];
          a[j] = a[j+1];
          a[j+1] = tmp;
          for(int b=0; b<50005000; b++);
         printarray (a);
          swapped = true;
        }
      }
      for (int j = a.length - 2 - i; j > i; j--) {
        if (a[j] < a[j-1]) 
        {
          int tmp = a[j];
          a[j] = a[j-1];
          a[j-1] = tmp;
          for(int b=0; b<50005000; b++);
         printarray (a);
          swapped = true;
        }
      }
      if(!swapped) break;
      printarray (a);
    }
  }
}