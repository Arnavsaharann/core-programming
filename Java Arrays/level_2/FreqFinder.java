import java.util.Scanner;

public class FreqFinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter the number: ");
        int num = input.nextInt();
        int len = String.valueOf(num).length();

        int[] arr = new int[len];
        int idx = 0;
        while(num != 0){
            int digit = num % 10;
            arr[idx] = digit;
            num  = num / 10;
            idx++;
        }

        int[] freq = new int[10];

        for(int i = 0; i < len; i++){
            freq[arr[i]]++;
        }


        for(int i = 0; i < 10; i++){
            System.out.println("freq of number " + i + " = " + freq[i]);
        }

        input.close();
    }
}
