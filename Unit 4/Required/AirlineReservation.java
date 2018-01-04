//Name: AirlineReservation.java
//Date: June 9th, 2015
//Author: Pronoy Chaudhuri
//Description: Next Stop - Swag Town.
public class AirlineReservation
{
  public static void main (String args[])
  {
    new AirlineReservation ();
  }
  
  
  public AirlineReservation ()
  {
    
    String air[] = new String [8];
    air [0] = "James Gosling";
    air [1] = "George Boole";
    air [2] = "";
    air [3] = "";
    air [4] = "Alan Turing";
    air [5] = "";
    air [6] = "";
    air [7] = "";
   
    char continu = 'a';
    while (continu != 'q')
    {
      System.out.println ("\nBeaver Airline Ticket System\n");
      System.out.println ("Choose from the following Options:");
      System.out.println (" (s) See plane's passengers");
      System.out.println (" (b) Book a ticket");
      System.out.println (" (d) Delete a ticket ");
      System.out.println (" (q) Quit");
      continu = IBIO.inputChar ("Your choice>> ");
      
      if (continu == 'b')
      {
        System.out.println ("Booking ticket:");
        int seat = IBIO.inputInt ("Which seat would you like? ");
        if (seat <= 0)
          System.out.println ("Sorry, someone is already sitting there.");
        else if (!air [seat - 1].equals (""))
        {
          System.out.println ("Sorry, someone is already sitting there.");
          
        }
        else
        {
          String name = IBIO.inputString ("What's your name? ");
          air [seat - 1] = name;
          for (int i = 0 ; i < air.length ; i++)
            System.out.println ((i + 1) + " " + air [i]);
          
        }
        
            }
      else if (continu == 'd')
      {
        int del = IBIO.inputInt ("Delete which seat? ");
        if (air [del - 1].equals (""))
          
        {
          System.out.println ("No one has that seat.");
        }
        else
        {
         air [del -1] = "";
        }
        System.out.println ("");
        for (int i = 0 ; i < air.length ; i++)
          System.out.println ((i + 1) + " " + air [i]);
        
      }
      
      else if (continu == 's')
      {
        System.out.println ("The plane's passengers are: ");
        System.out.println ("S:  Name:");
                              for (int i = 0 ; i < air.length ; i++)
                              System.out.println ((i+1) + "   " + air [i]);
                            
                            }
      
    }
  }
}
