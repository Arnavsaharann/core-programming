import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit price of the item: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        double quantity = input.nextDouble();

        double totalPurchasePrice = unitPrice * quantity;

        System.out.println(" The total purchase price is INR " + totalPurchasePrice + "  if the quantity " + quantity + " and unit price is INR " + unitPrice);
        input.close();
    }
}
