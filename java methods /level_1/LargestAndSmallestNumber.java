import java.util.Scanner;

public class LargestAndSmallestNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.print("enter the third number: ");
        int thirdNumber = input.nextInt();

        int[] result = findSmallestAndLargest(firstNumber,secondNumber,thirdNumber);

        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        input.close();
    }

    public static int[] findSmallestAndLargest(int firstNumber,int secondNumber,int thirdNumber){

        int smallest = Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
        int largest = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
        int[] arr  = {smallest,largest};

        return arr;
    }
}
