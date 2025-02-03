import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int n = input.nextInt();

        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weights[i] = input.nextDouble();

            System.out.print("Enter height (m) for person " + (i + 1) + ": ");
            heights[i] = input.nextDouble();

            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        System.out.println("\nPerson Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + heights[i] + " m, Weight = " + weights[i] + " kg, BMI = " + bmis[i] + ", Status = " + statuses[i]);
        }

        input.close();
    }
}
