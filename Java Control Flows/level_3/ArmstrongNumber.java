import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter the number you want to check: ");
        int number = input.nextInt();
        int originalNumber = number;
        int digit = 0;
        int sum = 0;
        while(number != 0){
            digit = number % 10;
            sum += Math.pow(digit, 3);
            number = number/10;
        }
        System.out.print(sum == originalNumber);

        input.close();
    }
}
