import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temprature in celsius: ");
        double tempratureInCelsius = input.nextDouble();

        double tempInFarenheit = ( tempratureInCelsius * (double)9/5) + 32;

        System.out.println("The " + tempratureInCelsius + " celsius is " + tempInFarenheit + " fahrenheit");

        input.close();

    }
}
