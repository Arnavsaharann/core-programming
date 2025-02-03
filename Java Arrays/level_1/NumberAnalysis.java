import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("CHECKS: ");
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even.");
                } else {
                    System.out.println(num + " is Positive and Odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative.");
            } else {
                System.out.println(num + " is Zero.");
            }
        }

        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.print("\nComparison of First and Last Element: ");
        if (first > last) {
            System.out.println("First element is greater than the last element.");
        } else if (first < last) {
            System.out.println("First element is less than the last element.");
        } else {
            System.out.println("First and last elements are equal.");
        }

        input.close();
    }
}
