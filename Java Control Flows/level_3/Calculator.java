import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = input.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = input.next();
        
        System.out.print("Enter second number: ");
        double secondNumber = input.nextDouble();

        double result;

        switch (op) {
            case "+":
                result = firstNumber + secondNumber;
                System.out.println("Result: " + firstNumber + " + " + secondNumber + " = " + result);
                break;
            case "-":
                result = firstNumber - secondNumber;
                System.out.println("Result: " + firstNumber + " - " + secondNumber + " = " + result);
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.println("Result: " + firstNumber + " * " + secondNumber + " = " + result);
                break;
            case "/":
                result = firstNumber / secondNumber;
                System.out.println("Result: " + firstNumber + " / " + secondNumber + " = " + result);
                break;
            default:
                System.out.println("Invalid Operator. Please enter +, -, *, or /.");
        }
        input.close();
    }
}
