//File: TicTacToe.java
//Author: Pronoy Chaudhuri
//Date: March 12th, 2015
//Description: Tic Tac Toe, give me high, give me low...
public class TicTacToe
{
    public static void main (String args[])
    {
 new TicTacToe ();
    }
    char a = ' ';
    char b = ' ';
    char c = ' ';
    char d = ' ';
    char e = ' ';
    char f = ' ';
    char g = ' ';
    char h = ' ';
    char i = ' ';

    char turn = 'x';

    public TicTacToe ()
    {
 while (!winner ())
 {
     printboard ();
     makemove (turn);
     if (turn == 'x')
  turn = 'o';
     else
  turn = 'x';
 }
 printboard ();
 System.out.println ("The winner is " + printWinner ());

    }


    public void printboard ()
    { 
  System.out.println ("   1   2   3");
  System.out.println ("1  " + a + " |  " + b + "|  " + c);
  System.out.println (" ------------");
  System.out.println ("2  " + d + " |  " + e + "|  " + f);
  System.out.println (" ------------");
  System.out.println ("3  " + g + " |  " + h + "|  " + i);
    }


    public void makemove (char piece)
    {
 int x = IBIO.inputInt ("\nEnter the x-coordinate: ");
 int y = IBIO.inputInt ("Enter the y-coordinate: ");
 while (!isValid (x, y))
 {
     System.out.println ("Error - invalid coordinate. Try again.");
     x = IBIO.inputInt ("\nEnter the x-coordinate: ");
     y = IBIO.inputInt ("Enter the y-coordinate: ");
 }
 if (x == 1 && y == 1)
     a = piece;
 else if (x == 2 && y == 1)
     b = piece;
 else if (x == 3 && y == 1)
     c = piece;
 else if (x == 1 && y == 2)
     d = piece;
 else if (x == 2 && y == 2)
     e = piece;
 else if (x == 3 && y == 2)
     f = piece;
 else if (x == 1 && y == 3)
     g = piece;
 else if (x == 2 && y == 3)
     h = piece;
 else if (x == 3 && y == 3)
     i = piece;
    }


    public boolean isValid (int x, int y)
    {
 if (x == 1 && y == 1 && a !=' ')
     return false;
 else if (x == 2 && y == 1 && b !=' ')
     return false;
  else if (x == 1 && y == 2 && d !=' ')
     return false;
  else if (x == 3 && y == 1 && c !=' ')
     return false;
 else if (x == 2 && y == 2 && e !=' ')
     return false;
  else if (x == 1 && y == 3 && g !=' ')
     return false;
 else if (x == 3 && y == 2 && f !=' ')
     return false;
 else if (x == 2 && y == 3 && h !=' ')
     return false;
 else if (x == 3 && y == 3 && i !=' ')
     return false;
 else if (x < 1 || x > 3 || y < 1 || y > 3)
     return false;
 else
     return true;
    }


    public boolean winner ()
    {
 if (a == b && a == c && a != ' ')
     return true; 
 else if (a == d && a == g && a != ' ')
     return true;
 else if (d == e && d == f && d != ' ')
     return true;
  else if (c == e && c == g && c != ' ')
     return true;
 else if (g == h && g == i && g != ' ')
     return true; 
 else if (b == e && b == h && b != ' ')
     return true;
  else if (a == e && a == i && a != ' ')
     return true;
 else if (c == f && c == i && c != ' ')
     return true;
 else
     return false; 
    }


    public char printWinner ()
    { 
 if (a == b && a == c && a != ' ')
     return a;
 else if (a == d && a == g && a != ' ')
     return a;
 else if (d == e && d == f && d != ' ')
     return d;
 else if (a == e && a == i && a != ' ')
     return a;
 else if (g == h && g == i && g != ' ')
     return g;
  else if (b == e && b == h && b != ' ')
     return b;
  else if (c == e && c == g && c != ' ')
     return c;
  else if (c == f && c == i && c != ' ')
     return c;
 else
     return 'n';
    }
}
