import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        int maximumNumberOfHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("the maximum number of possible handshakes " + maximumNumberOfHandshakes);
        input.close();
    }
}