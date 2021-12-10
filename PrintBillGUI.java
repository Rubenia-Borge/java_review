import javax.swing.JOptionPane;

public class PrintBillGUI
{
  public static void main(String[] args)
  {
    String nameItem;
	double priceItem;
	int quantityItem;
	
	nameItem = JOptionPane.showInputDialog("Name of item to be purchased:");
	priceItem = Double.parseDouble(
	  JOptionPane.showInputDialog("Price per item:"));
	quantityItem = Integer.parseInt(
	  JOptionPane.showInputDialog("Quantity to buy:"));
	JOptionPane.showMessageDialog(null,
	  "PURCHASE ORDER:\n\n" + 
	  "Item: " + nameItem + "\nQuantity: " + quantityItem +
	  "\nTotal price: $" + priceItem*quantityItem);
  }
}