import java.util.Scanner;

public class StoreAndSumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] arr = new double[10];
        int sum = 0;
        int idx = 0;
        while(true){
            if(idx > 9){
                break;
            }
            System.out.println("Enter a number");
            System.out.print("enter a 0 or negative number to stop: ");
            double num = scanner.nextDouble();

            if(num > 0){
                sum += num;
                arr[idx] = num;
                idx++;
            }else{
                break;
            }
        }

        System.out.println("\nTotal sum: " + sum);

        scanner.close();
    }
}
