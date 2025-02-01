import java.util.Scanner;
public class DivisionCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First Number");
        int firstNumber = input.nextInt();


        System.out.println("Enter the Second Number");
        int secondNumber = input.nextInt();

        int quotient = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + firstNumber + " and " + secondNumber);

        input.close();

    }
}