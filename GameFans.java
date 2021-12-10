/****************************************

*Search a sentence to look for a period.

*****************************************/

import java.util.Scanner;

public class GameFans
{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
	int untEaglesPoints;
	int guestTeamPoints;
	
	System.out.print("Enter the UNT Eagles Points Scored: ");
	untEaglesPoints = stdIn.nextInt();
	System.out.print("Oppossing team points scored: ");
	guestTeamPoints = stdIn.nextInt();
	
	if (untEaglesPoints > guestTeamPoints)
	{
	  System.out.println("Go Eagles! Free Popcorn for everybody!");
	}
	else if (untEaglesPoints == guestTeamPoints)
	{
	  System.out.println("It's a tie game! Everybody cheer up! Who wants popcorn?");
	}
	else
	{
	  System.out.println("Congratulations to the winners! There's free popcorn for everybody in the hall!");
	}
	
  }
}

