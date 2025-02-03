import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight: ");
        double weight = input.nextDouble();

        System.out.print("Enter height: ");
        double heightInCm = input.nextDouble();

        double heightInMeters = heightInCm/100;

        double bmi = weight / (heightInMeters * heightInMeters);

        if (bmi <= 18.4) {
            System.out.print("Underweight");
        } else if (bmi <= 24.9) {
            System.out.print("Normal");
        } else if (bmi <= 39.9) {
            System.out.print("Overweight");
        } else {
            System.out.print("Obese");
        }

        input.close();
    }
}
