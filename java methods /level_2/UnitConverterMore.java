import java.util.Scanner;

public class UnitConverterMore {

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nUnit Converter Menu:");
            System.out.println("1. Convert Yards to Feet");
            System.out.println("2. Convert Feet to Yards");
            System.out.println("3. Convert Meters to Inches");
            System.out.println("4. Convert Inches to Meters");
            System.out.println("5. Convert Inches to Centimeters");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter length in yards: ");
                    double yards = input.nextDouble();
                    System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");
                    break;

                case 2:
                    System.out.print("Enter length in feet: ");
                    double feet = input.nextDouble();
                    System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");
                    break;

                case 3:
                    System.out.print("Enter length in meters: ");
                    double meters = input.nextDouble();
                    System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");
                    break;

                case 4:
                    System.out.print("Enter length in inches: ");
                    double inches = input.nextDouble();
                    System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");
                    break;

                case 5:
                    System.out.print("Enter length in inches: ");
                    double inchesToCm = input.nextDouble();
                    System.out.println(inchesToCm + " inches = " + convertInchesToCentimeters(inchesToCm) + " centimeters");
                    break;

                case 6:
                    System.out.println("Exiting the converter. Goodbye!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
