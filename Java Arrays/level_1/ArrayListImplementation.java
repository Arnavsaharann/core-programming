import java.util.Scanner;

public class ArrayListImplementation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int arrsize = 10;
    
        int[] arr = new int[10];

        int idx = 0;
        for(int i = 0; i < 120; i++) {
            if (idx == arrsize) { // Resize when array is full
                arrsize *= 2;
                int[] temp = new int[arrsize];
                for (int j = 0; j < idx; j++) {
                    temp[j] = arr[j];
                }
                arr = temp;
            }

            arr[idx++] = i; // Store value and increment index
        }

        System.out.println(arr.length);

        input.close();
    }
}
