//At the bottom of this class are a series of methods
//Fill them in, according to their instructions.
//Run them as you go, to verify if they are working.

public class FirstMethods
{
  public static void main (String args[])
  {
    new FirstMethods ();
  }
  
  
  public FirstMethods ()
  {
    square ();
    blank ();
    circle ();
    blank ();
    bunny ();
    blank ();
    line ();
    blank ();
    count ();
    blank ();
    signature ();
  }
  
  
  public void blank ()
  { 
    System.out.println ("");
  }
  
  
  public void square ()
  { 
    System.out.println ("* * * *");
    System.out.println ("*     *");
    System.out.println ("*     *");
    System.out.println ("* * * *");    
  }
  
  
  public void circle ()
  { 
    System.out.println (" *  * ");
    System.out.println ("*    *");
    System.out.println (" *  * ");
  }
  
  
  public void bunny ()
  { 
    System.out.println ("()_()");
    System.out.println ("( ._.)");
    System.out.println ("((\")(\")");
  }
  
  
  public void line ()
  { 
    for (int i = 0; i>100; i++)
    {
      System.out.print ("*");
    }
  }
  
  
  public void count ()
  { 
    int i = 1;
    while (i<=10)
    {
      System.out.print (i + " ");
      i++;
    }
  }
  
  
  
  public void signature ()
  { 
    System.out.println ("         _____                    _____                   _______                   _____                   _______               _____");          
System.out.println ("        /\\    \\                  /\\    \\                 /::\\    \\                 /\\    \\                 /::\\    \\             |\\    \\");         
System.out.println ("       /::\\    \\                /::\\    \\               /::::\\    \\               /::\\____\\               /::::\\    \\            |:\\____\\");        
System.out.println ("      /::::\\    \\              /::::\\    \\             /::::::\\    \\             /::::|   |              /::::::\\    \\           |::|   |");        
System.out.println ("     /::::::\\    \\            /::::::\\    \\           /::::::::\\    \\           /:::::|   |             /::::::::\\    \\          |::|   |");        
System.out.println ("    /:::/\\:::\\    \\          /:::/\\:::\\    \\         /:::/~~\\:::\\    \\         /::::::|   |            /:::/~~\\:::\\    \\         |::|   |");        
System.out.println ("   /:::/__\\:::\\    \\        /:::/__\\:::\\    \\       /:::/    \\:::\\    \\       /:::/|::|   |           /:::/    \\:::\\    \\        |::|   |");        
System.out.println ("  /::::\\   \\:::\\    \\      /::::\\   \\:::\\    \\     /:::/    / \\:::\\    \\     /:::/ |::|   |          /:::/    / \\:::\\    \\       |::|   |");        
System.out.println (" /::::::\\   \\:::\\    \\    /::::::\\   \\:::\\    \\   /:::/____/   \\:::\\____\\   /:::/  |::|   | _____   /:::/____/   \\:::\\____\\      |::|___|______");  
System.out.println ("/:::/\\:::\\   \\:::\\____\\  /:::/\\:::\\   \\:::\\____\\ |:::|    |     |:::|    | /:::/   |::|   |/\\    \\ |:::|    |     |:::|    |     /::::::::\\    \\"); 
System.out.println ("/:::/  \\:::\\   \\:::|    |/:::/  \\:::\\   \\:::|    ||:::|____|     |:::|    |/:: /    |::|   /::\\____\\|:::|____|     |:::|    |    /::::::::::\\____\\");
System.out.println ("\\::/    \\:::\\  /:::|____|\\::/   |::::\\  /:::|____| \\:::\\    \\   /:::/    / \\::/    /|::|  /:::/    / \\:::\\    \\   /:::/    /    /:::/~~~~/~~");      
System.out.println (" \\/_____/\\:::\\/:::/    /  \\/____|:::::\\/:::/    /   \\:::\\    \\ /:::/    /   \\/____/ |::| /:::/    /   \\:::\\    \\ /:::/    /    /:::/    /");         
System.out.println ("          \\::::::/    /         |:::::::::/    /     \\:::\\    /:::/    /            |::|/:::/    /     \\:::\\    /:::/    /    /:::/    /");          
System.out.println ("           \\::::/    /          |::|\\::::/    /       \\:::\\__/:::/    /             |::::::/    /       \\:::\\__/:::/    /    /:::/    /");           
System.out.println ("            \\::/____/           |::| \\::/____/         \\::::::::/    /              |:::::/    /         \\::::::::/    /     \\::/    /");            
System.out.println ("             ~~                 |::|  ~|                \\::::::/    /               |::::/    /           \\::::::/    /       \\/____/");             
System.out.println ("                                |::|   |                 \\::::/    /                /:::/    /             \\::::/    /                 ");           
System.out.println ("                                \\::|   |                  \\::/____/                /:::/    /               \\::/____/                 ");            
System.out.println ("                                 \\:|   |                   ~~                      \\::/    /                 ~~                        ");           
System.out.println ("                                  \\|___|                                            \\/____/                                            ");
System.out.println ("\nGrade 10 IB Student at Turner Fenton S.S.");
System.out.println ("\nIf you can't beat them, join them");
  }
}
