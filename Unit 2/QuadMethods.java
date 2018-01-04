public class QuadMethods
{
  public static void main (String args[])
  {
    new QuadMethods ();
  }
  
  
  public QuadMethods ()
  {
    printNStars (5);
    printNChars (6, 'q');
    System.out.println ("The positive root is: " + positiveRoot (1, 6, 8));
    System.out.println ("The negative root is: " + negativeRoot (1, 6, 8));
    System.out.println ("The x value of the vertex is: " + xVertex (1, 6, 8));
    System.out.println ("The discriminant is: " + discrim (1, 6, 8));
    System.out.println ("The number of roots is: " + numRoots (1, 6, 8));
    System.out.println ("The absolute value of: " + absValue (-4));
  }
  
  
  public void printNStars (int n)
  { 
    while (n>=0)
    {
      System.out.print ("*");
      n--;
    }
  }
  
  
  public void printNChars (int n, char c)
  { 
    for (int i=0; i<=n; i++)
    {
      System.out.print (c);
    }  
    System.out.println ("");
  }
  
  
  public double positiveRoot (double a, double b, double c)
  { 
    double proot = ((-b+Math.sqrt(b*b-4*a*c))/2*a);
    return proot;    
  }
  
  
  public double negativeRoot (double a, double b, double c)
  { 
    double nroot = ((-b-Math.sqrt(b*b-4*a*c))/2*a);
    return nroot;
  }
  
  
  public double xVertex (double a, double b, double c)
  { 
    double xver = (-b/(2*a));
    return xver;
  }
  
  
  public double discrim (double a, double b, double c)
  { 
    double disc = (b*b-4*a*c);
    return disc;
  }
  
  
  public int numRoots (double a, double b, double c)
  { 
    double disc = discrim(a,b,c);
    if (disc>0)
      return 2;
    else if (disc<0)
      return 0;
    else
      return 1;
  }
  
  
  public int absValue (int n)
  { 
    int abs = (Math.abs(n));
    return abs;
  }
}

