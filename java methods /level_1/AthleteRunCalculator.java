import java.util.Scanner;

public class AthleteRunCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = input.nextDouble();

        double perimeter = calculatePerimeter(side1, side2, side3);
        int rounds = calculateRounds(perimeter, 5000);

        System.out.println("The athlete must complete " + rounds + " rounds to finish a 5 km run.");

        input.close();
    }

    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static int calculateRounds(double perimeter, double totalDistance) {
        return (int) Math.ceil(perimeter/totalDistance);
    }
}
