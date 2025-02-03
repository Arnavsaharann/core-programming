import java.util.Scanner;

public class StudentGrades2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        double[][] marks = new double[numStudents][3];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                do {
                    System.out.print("Enter marks for " + subject + " (out of 100) for Student " + (i + 1) + ": ");
                    marks[i][j] = input.nextDouble();

                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Invalid input! Marks should be between 0 and 100.");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }

            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;
            grades[i] = getGrade(percentages[i]);
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": Physics = " + marks[i][0] + ", Chemistry = " + marks[i][1] 
                    + ", Maths = " + marks[i][2] + ", Percentage = " + String.format("%.2f", percentages[i]) + "%, Grade = " + grades[i]);
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
