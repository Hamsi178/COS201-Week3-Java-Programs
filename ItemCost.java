import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter the cost per item: ");
        double unitCost = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        if (unitCost < 0 || quantity < 0) {
            System.out.println("Cost and quantity cannot be negative.");
            input.close();
            return;
        }

        double totalCost = unitCost * quantity;

        System.out.println("Item: " + itemName);
        System.out.println("Unit cost: " + unitCost);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total cost: " + totalCost);

        input.close();
    }
}
