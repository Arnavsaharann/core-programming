import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();


        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();


        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        double division = (double)firstNumber / secondNumber;

        System.out.println("The addition, subtraction, multiplication, and division of two numbers " + firstNumber + " and " + secondNumber + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division + ".");

        input.close();
    }
}
