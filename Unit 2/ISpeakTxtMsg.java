//File: ISpeakTxtMsg.java
//Author: Pronoy Chaudhuri
//Date: March 3rd, 2015
//Description: Sup? How r u 2day?
public class ISpeakTxtMsg
{
 public static void main (String args[])
 {
 new ISpeakTxtMsg ();
 }
 public ISpeakTxtMsg ()
 {
   String txt = IBIO.inputString ("Enter phrase> ");
   while (txt.equals(txt))
   {
   if (txt.equals("CU"))
   {
     System.out.print ("Translation: See you");
     txt = IBIO.inputString ("\nEnter phrase> ");
   }
   else if (txt.equals(":-)"))
   {
     System.out.print ("Translation: I'm Happy");
     txt = IBIO.inputString ("\nEnter phrase> ");
   }
   else if  (txt.equals(":-("))
   {
     System.out.print ("Translation: I'm Unhappy");
     txt = IBIO.inputString ("\nEnter phrase> ");
   }
   else if (txt.equals(";-)"))
   {
     System.out.print ("Translation: Wink");
     txt = IBIO.inputString ("\nEnter phrase> ");
   }
   else if (txt.equals(":-P"))
   {
     System.out.print ("Translation: Stick out my tongue");
     txt = IBIO.inputString ("\nEnter phrase> ");
   }
   else if (txt.equals("(�.�)"))
   {
     System.out.print ("Translation: Sleepy");
     txt = IBIO.inputString ("\nEnter phrase> ");
   }
   else if (txt.equals("TA"))
   {
     System.out.print ("Translation: Totally Awesome");
     txt = IBIO.inputString ("\nEnter phrase> ");
   }
   else if (txt.equals("CUZ"))
   {
     System.out.print ("Translation: Because");
     txt = IBIO.inputString ("\nEnter phrase> ");
   }
   else if (txt.equals("TY"))
   {
     System.out.print ("Translation: Thank You");
     txt = IBIO.inputString ("\nEnter phrase> ");
   }
   else if (txt.equals("YW"))
   {
     System.out.print ("Translation: You're Welcome");
     txt = IBIO.inputString ("\nEnter phrase> ");
   }
   else if (txt.equals("TTYL"))
   {
     System.out.print ("Translation: You're Welcome");
     txt = ("");
   } 
   else if (txt.equals (""))
     System.out.print ("");
   else 
   {
     System.out.print ("Translation: " +txt);
     txt = IBIO.inputString ("\nEnter phrase> ");
   }
 }
}
}