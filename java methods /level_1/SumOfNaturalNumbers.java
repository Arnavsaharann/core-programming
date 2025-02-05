import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("enter the number: ");
        int number = input.nextInt();

        int sum = sumFinder(number);

        System.out.println("the sum of n natural numbers is " + sum);

        input.close();
    }

    public static int sumFinder(int number){
        int sum = 0;
        for(int i = 1; i <= number; i++){
            sum += i;
        }

        return sum;
    }
}
