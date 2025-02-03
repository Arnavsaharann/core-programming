import java.util.Scanner;

public class StudentGrades1DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        double[] physics = new double[numStudents];
        double[] chemistry = new double[numStudents];
        double[] maths = new double[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            do {
                System.out.print("Enter marks for Physics (out of 100) for Student " + (i + 1) + ": ");
                physics[i] = input.nextDouble();
                if (physics[i] < 0 || physics[i] > 100)
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
            } while (physics[i] < 0 || physics[i] > 100);

            do {
                System.out.print("Enter marks for Chemistry (out of 100) for Student " + (i + 1) + ": ");
                chemistry[i] = input.nextDouble();
                if (chemistry[i] < 0 || chemistry[i] > 100)
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
            } while (chemistry[i] < 0 || chemistry[i] > 100);

            do {
                System.out.print("Enter marks for Maths (out of 100) for Student " + (i + 1) + ": ");
                maths[i] = input.nextDouble();
                if (maths[i] < 0 || maths[i] > 100)
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
            } while (maths[i] < 0 || maths[i] > 100);

            double totalMarks = physics[i] + chemistry[i] + maths[i];
            percentages[i] = (totalMarks / 300) * 100;
            grades[i] = getGrade(percentages[i]);
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": Physics = " + physics[i] + ", Chemistry = " + chemistry[i] 
                    + ", Maths = " + maths[i] + ", Percentage = " + String.format("%.2f", percentages[i]) + "%, Grade = " + grades[i]);
        }

        input.close();
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        if (percentage >= 40) return "E";
        return "R";
    }
}
