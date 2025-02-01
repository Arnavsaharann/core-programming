import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the base of the triangle (in cm): ");
        double baseInCm = input.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double heightInCm = input.nextDouble();

        double areaInCm = 0.5 * baseInCm * heightInCm;

        double inchToCm = 2.54;

        double baseInInches = baseInCm / inchToCm;
        double heightInInches = heightInCm / inchToCm;

        double areaInInches = 0.5 * baseInInches * heightInInches;

        System.out.println("The area of the triangle in square centimeters is " + areaInCm + " and in square inches is " + areaInInches);

        input.close();
    }
}
