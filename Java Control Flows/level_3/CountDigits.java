import java.util.Scanner;

public class  CountDigits{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter the number you want to count the digits for: ");
        int number = input.nextInt();
        int originalNumber = number;
        int count = 0;
        while(number != 0){
            count++;
            number = number/10;
        }
        System.out.println("The number " + originalNumber + " has " + count + " digits.");


        input.close();
    }
}