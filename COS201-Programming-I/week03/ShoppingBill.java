import java.util.Scanner;

public class ShoppingBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What did you buy? ");
        String product = in.nextLine();
        System.out.print("How many units? ");
        int units = in.nextInt();
        System.out.print("Price per unit? ");
        double pricePerUnit = in.nextDouble();

        if (units < 0 || pricePerUnit < 0) {
            System.out.println("Units and price must not be negative.");
            return;
        }

        double bill = units * pricePerUnit;

        System.out.println("\n----- BILL -----");
        System.out.println("Product    : " + product);
        System.out.println("Units      : " + units);
        System.out.println(String.format("Unit price : %.2f", pricePerUnit));
        System.out.println(String.format("Amount due : %.2f", bill));
    }
}
