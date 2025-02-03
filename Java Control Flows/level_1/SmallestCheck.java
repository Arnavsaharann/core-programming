import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();


        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();

        boolean isSmallest = (firstNumber < secondNumber) && (firstNumber < thirdNumber);

        System.out.println("Is the first number the smallest? " + isSmallest);
        input.close();

    }
}
