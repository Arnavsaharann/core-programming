import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.println("the numbers before swapping are " + firstNumber + " and " + secondNumber);


        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("the numbers after swapping are " + firstNumber + " and " + secondNumber);

        input.close();
    }
}
