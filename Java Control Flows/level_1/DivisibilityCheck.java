import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter the number you want to check: ");
        int number = input.nextInt();

        boolean isDivisible = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
        
        input.close();
    }
}
