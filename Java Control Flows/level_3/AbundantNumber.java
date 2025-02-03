import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number you want to check: ");
        int number = input.nextInt();
        int sum = 0;

        /*
            dry run of algo ( why loop from 1 to sqrt(number) works for divisiors also and not just finding prime number);
            100   
            1 -> 100
            1
            2+50
            4+25
            5+20
            10
        */

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;                 // Add smaller factor
                if (i != number / i) {     // Avoid adding duplicate factor (e.g., perfect squares)
                    sum += number / i;     // Add corresponding larger factor
                }
            }
        }

        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }

        input.close();
    }
}
