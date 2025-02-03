import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double number;
        boolean add = true;
        System.out.println("Enter numbers to sum (Enter 0 to stop):");

        while (add) {
            System.out.print("Enter a number: ");
            number = input.nextDouble();

            if (number == 0) {
                add = false;
            }

            total += number;
        }

        System.out.println("The total sum is: " + total);

        input.close();
    }
}
