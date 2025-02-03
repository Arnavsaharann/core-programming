import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = input.nextInt();

        System.out.print("Enter your YOE: ");
        int yearsOfExperience = input.nextInt();

        double bonus = 0;
        if(yearsOfExperience > 5){
            bonus = salary/20;
        }

        System.out.println("your bonus is: " + bonus);

        input.close();
    }
}
