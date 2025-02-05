import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("enter the number you want to check: ");
        int number = input.nextInt();

        int ans = helper(number);

        System.out.print("the answer is " + ans);

        input.close();
    }

    public static int helper(int number){

        if(number > 0) return 1;
        if(number < 0) return -1;
        return 0;
    }
}
