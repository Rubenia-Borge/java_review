import java.util.Scanner;

public class PrintBill
{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
	double itemPrice;
	int quantityBought;
	
	System.out.print("Please enter the price of the item: ");
	itemPrice = stdIn.nextDouble();
	System.out.print("Quantity: ");
	quantityBought = stdIn.nextInt();
	System.out.println("Total amount for this purchase is $" + itemPrice*quantityBought);
	System.out.println("\nThank you very much for shopping with us!");
  }
}