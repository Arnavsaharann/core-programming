import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the value for a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value for c: ");
        double c = input.nextDouble();

        double firstOperation = a + b * c;
        double secondOperation = a * b + c;
        double thirdOperation = c + a / b;
        double fourthOperation = a % b + c;

        System.out.println("The results of Int Operations are " + firstOperation + ", " + secondOperation + ", " + thirdOperation + ", " + fourthOperation);

        input.close();
    }
}
