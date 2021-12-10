/*********************************
* SolarSystemZip
* Imagine we had zipcodes in the solar system
*
**********************************/

import java.util.Scanner;

public class SolarSystemZip
{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
	String solarZipCode;
	
	System.out.print("Please enter a Solar System ZipCode: ");
	solarZipCode = stdIn.nextLine();
	
	switch(solarZipCode.charAt(0))
	{
	  case '1':
	    System.out.println(solarZipCode + " belongs to Mercury.");
		break;
	  case '2':
	    System.out.println(solarZipCode + " belongs to Venus.");
		break;
	  case '3':
	    System.out.println(solarZipCode + " belongs to Earth.");
		break;
	  case '4':
	    System.out.println(solarZipCode + " belongs to Mars.");
		break;
	  case '5':
	    System.out.println(solarZipCode + " belongs to Jupiter.");
		break;
	  case '6':
	    System.out.println(solarZipCode + " belongs to Saturn.");
		break;
      case '7':
	    System.out.println(solarZipCode + " belongs to Uranus.");
		break;
	  case '8':
	    System.out.println(solarZipCode + " belongs to Neptune.");
		break;
	  case '9':
	    System.out.println(solarZipCode + " belongs to Pluto.");
		break;
	  default:
	    System.out.println("Oh! So sorry! You did not enter a valid Solar ZipCode. \nPlease try again.");
		break;
	}
	
  }
}