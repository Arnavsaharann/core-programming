import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return;
        }

        String[] ans = new String[number + 1];

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                ans[i] = "Fizz";
            } else if (i % 5 == 0) {
                ans[i] = "Buzz";
            } else {
                ans[i] = String.valueOf(i);
            }
        }

        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + ans[i]);
        }
        scanner.close();
    }
}
