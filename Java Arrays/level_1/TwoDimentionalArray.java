import java.util.Scanner;

public class TwoDimentionalArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        int[][] multiDimentionalArr = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                multiDimentionalArr[i][j] = input.nextInt();
            }
        }

        int[] arr = new int[rows * cols];
        int idx = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[idx] = multiDimentionalArr[i][j];
                idx++;
            }
        }

        for (int i = 0; i < rows * cols; i++) {
            System.out.print(arr[i] + " ");
        }

        input.close();
    }
}
