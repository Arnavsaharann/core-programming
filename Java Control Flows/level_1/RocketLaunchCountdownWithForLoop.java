import java.util.Scanner;

public class RocketLaunchCountdownWithForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the countdown start value: ");
        int timer = input.nextInt();

        for (int i = timer; i >= 1; i--) {
            System.out.println(i);
        }

        input.close();
    }
}
