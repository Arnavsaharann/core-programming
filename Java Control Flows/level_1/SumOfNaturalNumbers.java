import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the number: ");
        int number = input.nextInt();
        int n = number;
        int sum = 0;
        while(number > 0){
            sum += number;
            number--;
        }

        
        System.out.print("The sum of first " + n + " natural numbers id " + sum);


        input.close();
    }
}
