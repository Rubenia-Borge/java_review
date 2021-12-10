import java.util.Scanner;

public class InputGreetings
{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner (System.in);
	String name;
	System.out.print("Hi! Please enter your name: ");
	name = stdIn.nextLine();
	System.out.println("Hola " + name + "!" + "\nHow are you doing?");
  }
}