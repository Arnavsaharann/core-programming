import java.util.Scanner;

public class FriendComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter height of Amar: ");
        int heightAmar = input.nextInt();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter height of Akbar: ");
        int heightAkbar = input.nextInt();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = input.nextInt();
        System.out.print("Enter height of Anthony: ");
        int heightAnthony = input.nextInt();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

        String youngest = (youngestAge == ageAmar) ? "Amar" : (youngestAge == ageAkbar) ? "Akbar" : "Anthony";
        String tallest = (tallestHeight == heightAmar) ? "Amar" : (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";

        System.out.println("\nResults:");
        System.out.println("The youngest friend is " + youngest + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallest + " with height " + tallestHeight + " cm.");

        input.close();
    }
}
