import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperatureInFahrenheit = input.nextDouble();

        double temperatureInCelsius = (temperatureInFahrenheit - 32) * 5 / 9;

        System.out.println("The " + temperatureInFahrenheit + " Fahrenheit is " + temperatureInCelsius + " Celsius");

        input.close();
    }
}
