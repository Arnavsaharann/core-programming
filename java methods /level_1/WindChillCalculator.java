import java.util.Scanner;

public class WindChillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed: ");
        double windSpeed = input.nextDouble();
     
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("The wind chill temperature is: " + String.format("%.2f", windChill) + "°F");
        
        input.close();
    }

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
