import java.util.Scanner;

public class GradeMeanCalc {

    static boolean inRange(double score) {
        return score >= 0 && score <= 100;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Name of student: ");
        String student = in.nextLine();

        System.out.print("Course 1 score: ");
        double first = in.nextDouble();
        System.out.print("Course 2 score: ");
        double second = in.nextDouble();
        System.out.print("Course 3 score: ");
        double third = in.nextDouble();

        if (!(inRange(first) && inRange(second) && inRange(third))) {
            System.out.println("Invalid entry: scores must lie between 0 and 100.");
            return;
        }

        double sum = first + second + third;
        double mean = sum / 3;

        System.out.println("\n>> Result for " + student);
        System.out.println(String.format("   Sum of scores : %.2f", sum));
        System.out.println(String.format("   Mean score    : %.2f", mean));
    }
}
