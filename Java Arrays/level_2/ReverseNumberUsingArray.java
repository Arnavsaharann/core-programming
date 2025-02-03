import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();

        int count = (int) Math.log10(number) + 1;
        int[] digits = new int[count];

        int idx = 0;
        while (number != 0) {
            digits[idx++] = (int) (number % 10);
            number /= 10;
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        System.out.println();
        input.close();
    }
}
