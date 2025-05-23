import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("The year " + year + " is not valid for the Gregorian calendar.");
        } else {
            if (year % 400 == 0) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println("The year " + year + " is NOT a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is NOT a Leap Year.");
            }

            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println("Using logical operators: The year " + year + " is a Leap Year.");
            } else {
                System.out.println("Using logical operators: The year " + year + " is NOT a Leap Year.");
            }
        }

        input.close();
    }
}
