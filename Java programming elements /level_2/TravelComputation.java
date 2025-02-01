import java.util.Scanner;

public class TravelComputation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the traveler's name: ");
        String name = input.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = input.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = input.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = input.nextLine();


        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " : ");
        double distanceFromToVia = input.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " : ");
        double distanceViaToFinalCity = input.nextDouble();

        System.out.print("Enter the time taken to travel from " + fromCity + " to " + viaCity + " : ");
        int timeFromToVia = input.nextInt();

        System.out.print("Enter the time taken to travel from " + viaCity + " to " + toCity + " : ");
        int timeViaToFinalCity = input.nextInt();


        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;


        System.out.println("\nThe Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " + totalDistance + " miles and the Total Time taken is " + totalTime + " minutes.");
        input.close();
    }
}
