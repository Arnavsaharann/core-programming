import java.util.Scanner;

public class LargestNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();

        boolean isFirstLargest = (firstNumber > secondNumber) && (firstNumber > thirdNumber);
        boolean isSecondLargest = (secondNumber > firstNumber) && (secondNumber > thirdNumber);
        boolean isThirdLargest = (thirdNumber > firstNumber) && (thirdNumber > secondNumber);

        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        input.close();
    }
}
