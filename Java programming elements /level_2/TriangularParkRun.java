import java.util.Scanner;

public class TriangularParkRun {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the length of side 1 (in m): ");
        double sideOne = input.nextDouble();

        System.out.print("Enter the length of side 2 (in m): ");
        double sideTwo = input.nextDouble();

        System.out.print("Enter the length of side 3 (in m): ");
        double sideThree = input.nextDouble();

        double perimeter = sideOne + sideTwo + sideThree;

        double totalRunDistance = 5 * 1000; 

        double rounds = totalRunDistance / perimeter;


        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");

        input.close();
    }
}
