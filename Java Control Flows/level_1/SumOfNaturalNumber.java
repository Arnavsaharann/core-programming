import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if(number < 1) {
            System.out.println("The number " + number + " is not a natural number.");
        }else{
            int sumFormula = number * (number + 1) / 2;

            int sumLoop = 0;
            for (int i = 1; i <= number; i++) {
                sumLoop += i;
            }

            System.out.println("The sum of " + number + " natural numbers using the formula is: " + sumFormula);
            System.out.println("The sum of " + number + " natural numbers using the for loop is: " + sumLoop);

            if (sumFormula == sumLoop) {
                System.out.println("Both methods give the same result.");
            } else {
                System.out.println("There is an inconsistency in the results.");
            }
        }
        input.close();
    }
    
}
