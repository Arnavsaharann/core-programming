import java.util.Scanner;

public class StudentVoteChecker {

    public static boolean canStudentVote(int age) {
        if(age < 0){
            return false;
        }

        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentAges = new int[10];

        System.out.println("Enter the ages of 10 students:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + " Age: ");
            studentAges[i] = input.nextInt();
        }

        System.out.println("\nVoting Eligibility Results:");

        for (int i = 0; i < 10; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            if (studentAges[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age entered.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + ": Eligible to vote ");
            } else {
                System.out.println("Student " + (i + 1) + ": Not eligible to vote ");
            }
        }

        input.close();
    }
}
