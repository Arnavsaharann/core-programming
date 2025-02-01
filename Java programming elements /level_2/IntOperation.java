import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the value for a: ");
        int a = input.nextInt();

        System.out.print("Enter the value for b: ");
        int b = input.nextInt();

        System.out.print("Enter the value for c: ");
        int c = input.nextInt();

        int firstOperation = a + b * c;
        int secondOperation = a * b + c;
        int thirdOperation = c + a / b;
        int fourthOperation = a % b + c;

        System.out.println("The results of Int Operations are " + firstOperation + ", " + secondOperation + ", " + thirdOperation + ", " + fourthOperation);

        input.close();
    }
}
