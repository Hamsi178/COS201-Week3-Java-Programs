import java.util.Scanner;

public class ArithmeticTool {

    static void show(String operation, double result) {
        System.out.println(String.format("%-15s: %.2f", operation, result));
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter number one: ");
            double x = in.nextDouble();
            System.out.print("Enter number two: ");
            double y = in.nextDouble();

            System.out.println("\nCalculation summary");
            System.out.println("-------------------");
            show("Addition", x + y);
            show("Subtraction", x - y);
            show("Multiplication", x * y);

            if (y != 0) {
                show("Division", x / y);
            } else {
                System.out.println("Division       : not possible (divisor is zero)");
            }
        }
    }
}
