import java.util.Scanner;

public class LargestAndSecondLargestDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int largest = -100000;
        int secondLargest = -100000;
        System.out.print("enter the number: ");
        int number = input.nextInt();
        int[] digits = new int[10];
        int idx = 0;

        while(number != 0 && idx < 10){
            int digit = number % 10;
            digits[idx] = digit;
            idx++;
            number = number / 10;
        }

        for(int  i = 0; i < idx; i++){
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("the largest digit is " + largest + " and second larget is " + secondLargest);

        input.close();
    }
}
