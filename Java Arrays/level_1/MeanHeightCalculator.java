import java.util.Scanner;

public class MeanHeightCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < 11; i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        double averageHeight = sum / 11;

        System.out.println("average height of the football team: " + averageHeight);

        scanner.close();
    }
}
