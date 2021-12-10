import java.util.Scanner;

public class InitialsOfAName
{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
	String firstName;
	String lastName;
	
	System.out.print("Enter first name and last name separated by a space: ");
	firstName = stdIn.next();
	lastName = stdIn.next();
	System.out.println("Your initials are: " + firstName.charAt(0) + lastName.charAt(0) + ".");
  }
  
}