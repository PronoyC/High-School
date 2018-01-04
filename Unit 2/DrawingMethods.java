public class DrawingMethods
{
  public static void main (String args[])
  {
    new DrawingMethods ();
  }
  
  /*
   Call the circ and line methods inside
   drawingMethods to draw a
   circle, tree, spoon and barbell.
   
   **      **     **     **
   *  *    *  *   *  *   *  *
   **      **     **     **
   ||     ||     ||
   ||     ||
   **
   *  *
   **
   */
  public DrawingMethods ()
  {
    System.out.println ("Here is a circle:\n" );
    circ ();
    System.out.println ("\nHere is a tree:\n");
    circ ();
    lines ();
    System.out.println ("\nHere is a spoon:\n");
    circ ();
    lines ();
    lines ();
    System.out.println ("\nHere is a barbell:\n");
    circ ();
    lines ();
    lines ();
    circ ();
  }
  
  
  public void circ ()
  {
    System.out.println ("  **");
    System.out.println (" *  *");
    System.out.println ("  **");
  }
  
  
  public void lines ()
  {
    System.out.println ("  ||");
  }
}

