//File: CellSell.java
//Author: Pronoy Chaudhuri
//Date: February 14th, 2015
//Description: An easy way to find the best phone plan.
public class CellSell
{
  public static void main (String args[])
  {
    new CellSell ();
  }
  public CellSell ()
  {
    System.out.println ("*************************************");
    System.out.println ("* Which cellphone plan is the best? *");
    System.out.println ("*************************************\n");
    int daym = IBIO.inputInt ("Number of daytime minutes? ");
    int evem = IBIO.inputInt ("Number of evening minutes? ");
    int wkdm = IBIO.inputInt ("Number of weekend minutes? ");
    int plana = ((daym-100)*25)+(evem*15)+(wkdm*20);
    int planb = ((daym-250)*45)+(evem*35)+(wkdm*25);
    int plananod = (evem*15)+(wkdm*20);
    int planbnod = (evem*35)+(wkdm*25);    
    if (daym < 100)
      System.out.println ("Plan A costs " +plananod+" cents.\n");
    else
      System.out.println ("Plan A costs " +plana+" cents.\n");
    if (daym < 250)
      System.out.println ("Plan B costs " +planbnod+" cents.\n");
    else
      System.out.println ("Plan B costs " +planb+" cents.\n");  
     
    if (daym < 100 && plananod > planb)
      System.out.println ("Plan B is cheapest. ");
    else if (daym < 250 && planbnod > plana)
      System.out.println ("Plan A is cheapest. ");
    else if (plana == planb)
      System.out.println ("Plan A and B are the same price. ");
    else if (plana > planb)
      System.out.println ("Plan B is cheapest. ");
    else if (plana < planb)
      System.out.println ("Plan A is cheapest. ");
    
  }
}



