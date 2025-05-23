import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        int maxHandshakes = calculateHandshakes(n);
        System.out.println("The maximum number of handshakes among " + n + " students is: " + maxHandshakes);

        input.close();
    }

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
