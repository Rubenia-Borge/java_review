public class FinalPrice
{
  public static void main(String[] args)
  {
    int basePrice;
	String finalPriceMessage;
	
	basePrice = 400;
	finalPriceMessage = "The final price is: $" + (0.5*basePrice);
	System.out.println(finalPriceMessage);
  }
}