/**********************************

*Search a sentence to look for a period.

***********************************/

import java.util.Scanner;

public class PeriodFinder
{
  public static void main(String [] args)
  {
    Scanner stdIn = new Scanner (System.in);
	String inputText;
	int lastPosition;
	
	System.out.println("Please type the input text: ");
	inputText = stdIn.nextLine();
	lastPosition = inputText.length() - 1;
	if (inputText.charAt(lastPosition) != '.')
	{
	  System.out.println("Please remember all sentences need to end with a period!");
	}
	else
	{
	  System.out.println("OK!");
	}
  }
}