import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightInCm = input.nextDouble();

        double cmPerInch = 2.54;   
        int inchesPerFoot = 12;   

        double heightInInches = heightInCm / cmPerInch;

        double feet = heightInInches / inchesPerFoot;
        double inches = heightInInches % inchesPerFoot;

        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);

        input.close();
    }
}
