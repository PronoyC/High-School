public class Trident
{
  public static void main (String args[])
  {
    new Trident ();
  }
  public Trident ()
  {
    System.out.println ("**Welcome to my Trident Program!**");
    System.out.println ("\nYou want tridents, we make them tridents!\n");    
    char continu = 'y';
    while (continu == 'y')
    {
      int tine = IBIO.inputInt ("Enter tine length > ");
      int space = IBIO.inputInt ("Enter tine spacing > ");
      int handle = IBIO.inputInt ("Enter handle length > ");
      int num = (space * 2) + 3;
      
      for (int i = 1 ; i <= tine ; i++)
      {
        System.out.print ("*");
        for (int j = 1 ; j <= space ; j++)
        {
          System.out.print (" ");
        }
        System.out.print ("*");
        for (int k = 1 ; k <= space ; k++)
        {
          System.out.print (" ");
        }
        System.out.print ("*");
        System.out.println ("");
      }
      
      for (int a = 1 ; a <= num ; a++)
      {
        System.out.print ("*");
      }
      System.out.println ("");
      
      int mid = (num / 2) + 1;
      
      for (int b = 1 ; b <= handle ; b++)
      {
        for (int c = 1 ; c <= (mid - 1) ; c++)
        {
          System.out.print (" ");
        }
        System.out.print ("*");
        System.out.println (" ");
      }
      
      continu = IBIO.inputChar ("Do you want to make another trident? (y/n)");
    }
    
    
    System.out.print ("Thanks for making tridents with us today! Enjoy your day!");
    
    
    
    
    
  }
}



