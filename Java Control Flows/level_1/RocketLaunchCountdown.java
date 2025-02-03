import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the countdown start value: ");
        int timer = input.nextInt();

        while (timer >= 1) {
            System.out.println(timer);
            timer--; 
        }

        input.close();
    }
}
