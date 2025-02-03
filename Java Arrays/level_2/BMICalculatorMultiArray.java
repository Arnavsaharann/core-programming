import java.util.Scanner;

public class BMICalculatorMultiArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = input.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double weight, height;

            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                weight = input.nextDouble();
                if (weight <= 0) System.out.println("Weight must be a positive number.");
            } while (weight <= 0);

            do {
                System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                height = input.nextDouble();
                if (height <= 0) System.out.println("Height must be a positive number.");
            } while (height <= 0);

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = weight / (height * height);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nPerson Details:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + personData[i][1] + " m, Weight = " + personData[i][0] + " kg, BMI = " + personData[i][2] + ", Status = " + weightStatus[i]);
        }

        input.close();
    }
}
