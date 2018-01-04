//File: Song.java
//Author: Pronoy Chaudhuri
//Date: March 12th, 2015
//Description: Jiggle Bells! Oh wait, that's not right...
public class Song
{
  public static void main (String args[])
  {
    new Song ();
  }
  public Song ()
  {
    System.out.println ("*12 Days of Christmas*\n");       
    for (int i = 1; i<=12; i++)
    {      
      String num = ("alpha");
      if (i==1)
        num = ("first");
      else if (i==2)
        num = ("second");
      else if (i==3)
        num = ("third");
      else if (i==4)
        num = ("fourth");
      else if (i==5)
        num = ("fifth");
      else if (i==6)
        num = ("sixth");
      else if (i==7)
        num = ("seventh");
      else if (i==8)
        num = ("eighth");
      else if (i==9)
        num = ("ninth");
      else if (i==10)
        num = ("tenth");
      else if (i==11)
        num = ("eleventh");
      else
        num = ("twelfth");    
      System.out.println ("On the "+num+" day of Christmas, my true love gave to me...\n");
      if (i==12)
        System.out.println ("12 Drummers Drumming");
      if (i>=11)
        System.out.println ("11 Pipers Piping");
      if (i>=10)
        System.out.println ("10 Lords A-Leaping");
      if (i>=9)
        System.out.println ("9 Ladies Dancing");
      if (i>=8)
        System.out.println ("8 Maids A-Milking");
      if (i>=7)
        System.out.println ("7 Swans A=Swimming");
      if (i>=6)
        System.out.println ("6 Geese A-Laying");
      if (i>=5)
        System.out.println ("5 Golden Rings"); 
      if (i>=4)
        System.out.println ("4 Calling Birds");
      if (i>=3)
        System.out.println ("3 French Hens");
      if (i>=2)
        System.out.println ("2 Turtle Doves");
      if (i==1)     
        System.out.println ("A Partridge in a Pear Tree.\n");
      else      
        System.out.println ("And a Partridge in a Pear Tree.\n");   
    }
  }
}
















