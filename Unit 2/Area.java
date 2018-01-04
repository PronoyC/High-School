public class Area
{
  public static void main (String args[])
  {
    new Area ();
  }
  
  
  public Area ()
  {
    char more = 'y';
    
    while (more == 'Y' || more == 'y')
    {
      printmenu ();
      int answer = IBIO.inputInt ("Which object do you have? (1-5) ");
      double area = -1;
      if (answer == 1)
        area = circle ();
      else if (answer == 2)
        area = rectangle ();
      else if (answer == 3)
        area = triangle ();
      else if (answer == 4)
        area = square ();
      else if (answer == 5)
        area = sphere ();
      
      if (area == -1)
        System.out.println ("You must choose 1 to 5.");
      else
        System.out.println ("The area is " + area);
      
      System.out.println ("");
      more = IBIO.inputChar ("Do you want to find the area of anything else? (y/n) ");
    } 
    
    System.out.println ("Goodbye!");
  } 
  
  
  public void printmenu ()
  {
    System.out.println ("*** Menu ***");
    System.out.println ("1. circle");
    System.out.println ("2. rectangle");
    System.out.println ("3. triangle");
    System.out.println ("4. square");
    System.out.println ("5. sphere\n");
    
  }
  
  
  public double circle ()
  { 
    double rad = IBIO.inputDouble ("What is the radius of the circle? ");
    double area = Math.PI*rad*rad;
    return area;
  } 
  
  
  public double rectangle ()
  { 
    double length = IBIO.inputDouble ("What is the length of the rectangle? ");
    double width = IBIO.inputDouble ("What is the width of the rectangle? ");
    double area = length*width;
    return area;
  } 
  
  
  public double triangle ()
  { 
    double base = IBIO.inputDouble ("What is the base of the triangle? ");
    double height = IBIO.inputDouble ("What is the height of the triangle? ");
    double area = base*height*(1/2);    
    return area;
  } 
  
  
  public double square ()
  { 
    double length = IBIO.inputDouble ("What is the length of the square? ");
    double area = length*length;    
    return area;
  } 
  
  
  public double sphere ()
  { 
    double rad = IBIO.inputDouble ("What is the radius of this sphere? ");
    double area = 4*Math.PI*rad*rad;
    return area;
  } 
} 
