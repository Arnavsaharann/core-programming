import java.util.Scanner;

public class NumberAnalyzer {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compareNumbers(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 < num2) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("\nNumber Analysis:");
        for (int number : numbers) {
            if (isPositive(number)) {
                System.out.print(number + " is Positive and ");
                if (isEven(number)) {
                    System.out.println("Even.");
                } else {
                    System.out.println("Odd.");
                }
            } else {
                System.out.println(number + " is Negative.");
            }
        }

        int result = compareNumbers(numbers[0], numbers[numbers.length - 1]);
        System.out.print("\nComparison of first and last element: ");
        if (result == 1) {
            System.out.println("First number is greater.");
        } else if (result == -1) {
            System.out.println("Last number is greater.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        input.close();
    }
}
