import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter the number you want to check: ");
        int number = input.nextInt();
        int originalNumber = number;
        int digit = 0;
        int sum = 0;
        while(number != 0){
            digit = number % 10;
            sum += digit;
            number = number/10;
        }
        
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }


        input.close();
    }
}
