public class TemperatureInTexas
{
  public static void main(String[] args)
  {
    final double FREEZES_AT = 32.0;
	final double CONVERT_WITH = 5.0/9.0;
	
	double fahrenheit = -17;
	double celsius;
	
	celsius = CONVERT_WITH * (fahrenheit - FREEZES_AT);
	System.out.println("Texas is freezing at " + fahrenheit + " Fahrenheit" + " which is " + celsius + " in Celsius");
  }
}