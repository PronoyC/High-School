public class Calling
{
    public static void main (String args[])
    {
 new Calling ();
    }


    //The purpose of this assignment is to practice calling methods.

    //ask for input from the user for each of the parameters
    //call each method and store its result
    //print out the result.

    public Calling ()
    {
 //------example for round---------

 //1. ask for num and digit - parameters
 System.out.println ("\nRounding");
 double num = IBIO.inputDouble ("What is the decimal number? ");
 int digit = IBIO.inputInt ("Round to how many digits? ");
 //2. call method - pass in num and digit, save in r
 double r = round (num, digit);
 //3. print out new value of r
 System.out.println ("That is : " + r);

 //----A--isOdd---------
 System.out.println ("\nIs it odd?");
 int number = IBIO.inputInt ("What is your number? ");
 boolean ans = isOdd (number);
 if (ans = true)
   System.out.println ("Your number is odd.");
 else
   System.out.println ("Your number is even.");

 //----B--isGreater5---------
System.out.println ("\nIs it greater than 5?");
int number1 = IBIO.inputInt ("What is your number? ");
boolean ans1 = isGreater5 (number1);
if (ans1 = true)
  System.out.println ("Your number is greater than 5.");
else
  System.out.println ("Your number is less than 5.");

 //----C--toCelsius---------
System.out.println ("\nCelsius Converter");
double number2 = IBIO.inputDouble ("Give your temperature in Fahrenheit (f): ");
double ans2 = toCelsius (number2);
System.out.println ("Your temperature in Celsius (c) is: " +ans2);


 //----D--toFahrenheit---------
System.out.println ("\nFahrenheit Converter");
double number3 = IBIO.inputDouble ("Give your temperature in Celsius (c): ");
double ans3 = toCelsius (number3);
System.out.println ("Your temperature in Fahrenheit (f) is: " +ans3);


 //----E--isPrime---------
System.out.println ("\nIs it a prime?");
int number4 = IBIO.inputInt ("What is your number? ");
boolean ans4 = isPrime (number4);
if (ans4 == true)
  System.out.println ("Your number is a prime.");
else
  System.out.println ("Your number is not a prime.");

 //----F--HI---------
 HI ();


 //----G--oneClown---------
 oneClown ();


 //----H--lala---------
 int number5 = IBIO.inputInt ("How many la's do you want on the screen? ");
 lala (number5);


 //----I--Clown---------
 int number6 = IBIO.inputInt ("How many clowns do you want on the screen? (1 to 6) ");
 Clown (number6);   

    }


    public double round (double num, int digit)
    {
 double num2 = num * Math.pow (10, digit);
 double num3 = (num2 - ((int) num2)) * 10;
 num2 = ((int) num2);
 if (num3 >= 5)
     num2++;
 return num2 /= Math.pow (10, digit);
    }


    public boolean isOdd (int num)
    { //checks if num is odd.
 //returns true if it is, false otherwise
 return num % 2 != 0;
    }


    public boolean isGreater5 (int num)
    { //checks if num is greater than 5
 //returns true if it is, false otherwise
 return num > 5;
    }


    public double toCelsius (double fahrenheit)
    { //takes a fahrenheit temperature and returns the celsius of it
 return (fahrenheit - 32) * 5 / 9;
    }


    public double toFahrenheit (double celsius)
    { //takes a celsius temperature and returns the fahrenheit of it
 return celsius * 9 / 5 + 32;
    }


    public boolean isPrime (int n)
    { //checks if n is a prime number
 //returns true if it is, false otherwise
 int stop = n - 1;
 while (stop > 1)
 {
     if (n % stop == 0)
  return false;
     stop--;
 }
 return true;
    }


    public void HI ()
    {
 System.out.println ("*   *   ***");
 System.out.println ("*   *    * ");
 System.out.println ("*****    * ");
 System.out.println ("*   *    * ");
 System.out.println ("*   *   ***");
    }


    public void oneClown ()
    {
 System.out.println ("      {_}");
 System.out.println ("      /*\\");
 System.out.println ("     /_*_\\");
 System.out.println ("    {('o')}");
 System.out.println (" C{{([^*^])}}D");
 System.out.println ("     [ * ]");
 System.out.println ("    /  Y  \\");
 System.out.println ("   _\\__|__/_");
 System.out.println ("  (___/ \\___)");

    }


    public void lala (int x)
    { //x is the number of 'la's on the screen
 for (int i = 0 ; i < x ; i++)
     System.out.print ("la ");
 System.out.println ("");
    }


    public void Clown (int x)
    { //x is a number of clowns that will be printed on the screen
 //x should be between 1-6 to fit on the screen

 System.out.println ("\nHow many clowns are on the screen?\n");
 for (int i = 0 ; i < x ; i++)
     System.out.print ("      {_}     ");
 System.out.println ();
 for (int i = 0 ; i < x ; i++)
     System.out.print ("      /*\\     ");
 System.out.println ();
 for (int i = 0 ; i < x ; i++)
     System.out.print ("     /_*_\\    ");
 System.out.println ();
 for (int i = 0 ; i < x ; i++)
     System.out.print ("    {('o')}   ");
 System.out.println ();
 for (int i = 0 ; i < x ; i++)
     System.out.print (" C{{([^*^])}}D");
 System.out.println ();
 for (int i = 0 ; i < x ; i++)
     System.out.print ("     [ * ]    ");
 System.out.println ();
 for (int i = 0 ; i < x ; i++)
     System.out.print ("    /  Y  \\   ");
 System.out.println ();
 for (int i = 0 ; i < x ; i++)
     System.out.print ("   _\\__|__/_  ");
 System.out.println ();
 for (int i = 0 ; i < x ; i++)
     System.out.print ("  (___/ \\___) ");
 System.out.println ();

    }
}
