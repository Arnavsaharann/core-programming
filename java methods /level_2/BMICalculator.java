import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double heightInCm) {
        double heightInMeters = heightInCm / 100; // Convert cm to meters
        return weight / (heightInMeters * heightInMeters);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][3]; 
        String[] bmiStatus = new String[10];

        System.out.println("Welcome to the BMI Calculator!");
        System.out.println("Please enter the weight (kg) and height (cm) for 10 people.");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            System.out.print("Enter weight in kg: ");
            data[i][0] = input.nextDouble();

            System.out.print("Enter height in cm: ");
            data[i][1] = input.nextDouble();

            data[i][2] = calculateBMI(data[i][0], data[i][1]);

            bmiStatus[i] = getBMIStatus(data[i][2]);
        }

       
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + data[i][0] + " kg");
            System.out.println("Height: " + data[i][1] + " cm");
            System.out.println("BMI: " + data[i][2]);
            System.out.println("Status: " + bmiStatus[i]);
            System.out.println("\n\n");
        }

        input.close();
    }
}
